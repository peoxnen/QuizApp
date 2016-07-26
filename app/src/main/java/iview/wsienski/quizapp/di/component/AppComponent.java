package iview.wsienski.quizapp.di.component;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import iview.wsienski.quizapp.QuizApp;
import iview.wsienski.quizapp.di.module.AppModule;
import iview.wsienski.quizapp.di.module.NetModule;
import iview.wsienski.quizapp.network.QuizApi;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {

    void inject(QuizApp quizApp);

    QuizApi apiService();
    Retrofit retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();

}
