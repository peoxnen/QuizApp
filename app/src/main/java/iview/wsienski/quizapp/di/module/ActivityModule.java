package iview.wsienski.quizapp.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
@Module
public class ActivityModule {
    final Activity mActivity;

    public ActivityModule(Activity mActivity){
        this.mActivity=mActivity;
    }

    @Provides
    public Context activiyContext(){
        return mActivity;
    }
}
