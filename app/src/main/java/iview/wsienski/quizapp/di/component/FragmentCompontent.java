package iview.wsienski.quizapp.di.component;

import dagger.Component;
import iview.wsienski.quizapp.di.annotations.FragmentScope;
import iview.wsienski.quizapp.ui.fragment.QuizzesFragment;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
@FragmentScope
@Component(dependencies = ActivityComponent.class)
public interface FragmentCompontent extends ActivityComponent{
    void inject(QuizzesFragment userFragment);
}
