package iview.wsienski.quizapp.ui.view;

import iview.wsienski.quizapp.network.dao.Quizzes;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public interface QuizzesView {
    void showQuizzes(Quizzes quizzes);
    void showProgress(boolean show);
    void showError(String message);
}
