package iview.wsienski.quizapp;

import android.app.Application;

import com.facebook.stetho.Stetho;

import iview.wsienski.quizapp.di.component.AppComponent;
import iview.wsienski.quizapp.di.component.DaggerAppComponent;
import iview.wsienski.quizapp.di.module.AppModule;
import iview.wsienski.quizapp.di.module.NetModule;
import timber.log.Timber;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class QuizApp extends Application {

    private final static String TAG = QuizApp.class.getSimpleName();

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
            Timber.plant(new Timber.DebugTree());
        }

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(getString(R.string.base_url)))
                .build();
        appComponent.inject(this);
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
