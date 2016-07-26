package iview.wsienski.quizapp.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.quizapp.R;
import iview.wsienski.quizapp.di.component.DaggerFragmentCompontent;
import iview.wsienski.quizapp.di.component.FragmentCompontent;
import iview.wsienski.quizapp.network.dao.Quiz;
import iview.wsienski.quizapp.network.dao.Quizzes;
import iview.wsienski.quizapp.ui.activity.MainActivity;
import iview.wsienski.quizapp.ui.adapter.QuizzesCardAdapter;
import iview.wsienski.quizapp.ui.presenter.QuizzesPresenterImpl;
import iview.wsienski.quizapp.ui.view.MainView;
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
    MainView mainView;
    View view;
    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    QuizzesCardAdapter quizzesCardAdapter;
    List<Quiz> quizzes = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quizzes, container, false);
        ButterKnife.bind(this, view);
        fragmentCompontent = DaggerFragmentCompontent.builder()
                .activityComponent(((MainActivity)getActivity()).getActivityCompontent()).build();
        fragmentCompontent.inject(this);
        quizzesPresenter.attachView(this);
        mainView = (MainView) getActivity();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        quizzesCardAdapter = new QuizzesCardAdapter(getActivity(), quizzes);
        recyclerView.setAdapter(quizzesCardAdapter);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Timber.d("onStart");
        quizzesPresenter.loadQuizzes();
    }

    @Override
    public void showProgress(boolean show) {
        mainView.showProgress(show);
    }

    @Override
    public void showQuizzes(Quizzes quizzes) {
        List<Quiz> quizs = Arrays.asList(quizzes.getItems());
        this.quizzes.addAll(quizs);
        quizzesCardAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String message) {
        mainView.showError(message);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        quizzesPresenter.detachView();
    }
}
