package iview.wsienski.quizapp.ui.presenter;

import javax.inject.Inject;

import iview.wsienski.quizapp.network.QuizApi;
import iview.wsienski.quizapp.network.dao.Quizzes;
import iview.wsienski.quizapp.ui.view.QuizzesView;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

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
        Timber.d("loadUsers");
        quizzesView.showProgress(true);
        subscription = quizApi.quizzes(0,5).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Quizzes>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        quizzesView.showProgress(false);
                        quizzesView.showError("Error download");
                    }

                    @Override
                    public void onNext(Quizzes quizzes) {
                        quizzesView.showProgress(false);
                        quizzesView.showQuizzes(quizzes);
                    }
                });
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
