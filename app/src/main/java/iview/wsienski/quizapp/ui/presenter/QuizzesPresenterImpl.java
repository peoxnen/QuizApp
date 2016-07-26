package iview.wsienski.quizapp.ui.presenter;

import javax.inject.Inject;

import iview.wsienski.quizapp.network.QuizApi;
import iview.wsienski.quizapp.ui.view.QuizzesView;
import rx.Subscription;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class QuizzesPresenterImpl implements QuizzesPresenter {

    private QuizzesView quizzesView;
    private QuizApi quizApi;
    private Subscription subscription;

    @Inject
    public QuizzesPresenterImpl(QuizApi apiService) {
        this.quizApi = apiService;
    }

    @Override
    public void loadQuizzes() {

    }

    @Override
    public void attachView(QuizzesView view) {
        this.quizzesView = view;
    }

    @Override
    public void detachView() {
        if (subscription != null) subscription.unsubscribe();
    }
}
