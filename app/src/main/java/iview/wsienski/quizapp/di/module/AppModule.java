package iview.wsienski.quizapp.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication=mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application mApplication){
        return PreferenceManager.getDefaultSharedPreferences(mApplication);
    }

    @Provides
    @Singleton
    public EventBus eventBus() {
        return new EventBus();
    }


}
