package iview.wsienski.quizapp.di.component;

import dagger.Component;
import iview.wsienski.quizapp.di.annotations.ActivityScope;
import iview.wsienski.quizapp.ui.activity.MainActivity;

/**
 * Created by Witold Sienski on 23.07.2016.
 */
@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {

    void inject(MainActivity mainActivity);

}
