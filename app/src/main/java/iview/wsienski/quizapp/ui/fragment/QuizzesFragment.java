package iview.wsienski.quizapp.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import iview.wsienski.quizapp.R;
import iview.wsienski.quizapp.di.component.DaggerFragmentCompontent;
import iview.wsienski.quizapp.di.component.FragmentCompontent;
import iview.wsienski.quizapp.network.dao.Quizzes;
import iview.wsienski.quizapp.ui.activity.MainActivity;
import iview.wsienski.quizapp.ui.presenter.QuizzesPresenterImpl;
import iview.wsienski.quizapp.ui.view.QuizzesView;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class QuizzesFragment extends Fragment implements QuizzesView{

    private static final String TAG = QuizzesFragment.class.getSimpleName();
    @Inject
    QuizzesPresenterImpl quizzesPresenter;
    FragmentCompontent fragmentCompontent;
    View view;

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
    }

    @Override
    public void showQuizzes(Quizzes quizzes) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void onDetach() {
        super.onDetach();
        quizzesPresenter.detachView();
    }
}
