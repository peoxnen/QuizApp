package iview.wsienski.quizapp.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.afollestad.materialdialogs.MaterialDialog;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.quizapp.R;
import iview.wsienski.quizapp.di.component.DaggerFragmentCompontent;
import iview.wsienski.quizapp.di.component.FragmentCompontent;
import iview.wsienski.quizapp.network.dao.Quizzes;
import iview.wsienski.quizapp.ui.activity.MainActivity;
import iview.wsienski.quizapp.ui.presenter.QuizzesPresenterImpl;
import iview.wsienski.quizapp.ui.view.QuizzesView;
import timber.log.Timber;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class QuizzesFragment extends Fragment implements QuizzesView{

    private static final String TAG = QuizzesFragment.class.getSimpleName();
    @Inject
    QuizzesPresenterImpl quizzesPresenter;
    FragmentCompontent fragmentCompontent;
    View view;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quizzes, container, false);
        ButterKnife.bind(this, view);
        fragmentCompontent = DaggerFragmentCompontent.builder()
                .activityComponent(((MainActivity)getActivity()).getActivityCompontent()).build();
        fragmentCompontent.inject(this);
        quizzesPresenter.attachView(this);
        quizzesPresenter.loadQuizzes();
        return view;
    }

    @Override
    public void showProgress(boolean show) {
        Timber.d("showProgress");
        int visible = show ? View.VISIBLE : View.GONE;
        progressBar.setVisibility(visible);
    }

    @Override
    public void showQuizzes(Quizzes quizzes) {
    }

    @Override
    public void showError(String message) {
        Timber.d("showError");
        new MaterialDialog.Builder(getActivity())
                .title(R.string.dialog_aplogize_title)
                .content(message)
                .negativeText(R.string.dialog_button_ok)
                .show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        quizzesPresenter.detachView();
    }
}
