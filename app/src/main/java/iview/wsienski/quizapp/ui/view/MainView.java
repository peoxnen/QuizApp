package iview.wsienski.quizapp.ui.view;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public interface MainView {
    void showProgress(boolean show);
    void showError(String message);
    void showInfo(String message);
}
