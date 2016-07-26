package iview.wsienski.quizapp.ui.presenter;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public interface BasePresenter<V> {

    void attachView(V view);

    void detachView();

}
