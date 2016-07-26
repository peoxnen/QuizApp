package iview.wsienski.quizapp.di.module;

import android.app.Fragment;

import dagger.Module;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
@Module
public class FragmentModule {
    final Fragment fragment;

    public FragmentModule(Fragment fragment){
        this.fragment=fragment;
    }
}
