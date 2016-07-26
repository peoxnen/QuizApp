package iview.wsienski.quizapp.ui.presenter;

import iview.wsienski.quizapp.ui.view.QuizzesView;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public interface QuizzesPresenter extends BasePresenter<QuizzesView>{
    void loadQuizzes();
}
