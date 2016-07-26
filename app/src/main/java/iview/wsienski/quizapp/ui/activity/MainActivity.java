package iview.wsienski.quizapp.ui.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.afollestad.materialdialogs.MaterialDialog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.quizapp.QuizApp;
import iview.wsienski.quizapp.R;
import iview.wsienski.quizapp.di.component.ActivityComponent;
import iview.wsienski.quizapp.di.component.DaggerActivityComponent;
import iview.wsienski.quizapp.events.MsgEvent;
import iview.wsienski.quizapp.ui.fragment.QuizzesFragment;
import iview.wsienski.quizapp.ui.view.MainView;
import iview.wsienski.quizapp.util.Utils;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MainView {

    @Inject
    EventBus eventBus;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        activityComponent = DaggerActivityComponent.builder()
                .appComponent(getApp().getAppComponent()).build();
        activityComponent.inject(this);
    }

    protected QuizApp getApp() {
        return (QuizApp) getApplication();
    }

    public ActivityComponent getActivityCompontent() {
        return activityComponent;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_camera) {
           fragment = new QuizzesFragment();
        } else if (id == R.id.nav_gallery) {
            fragment = new QuizzesFragment();
        }
        setContent(fragment, false);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * Zmienia zawartość strony na zadany Fragment.
     *
     * @param fragment fragment, który ma zostać dodany w miejsce bieżącej zawartości
     */
    public void setContent(Fragment fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction trans = fragmentManager.beginTransaction();
        trans.replace(R.id.fragment_container, fragment);
        if (addToBackStack)
            trans.addToBackStack(null);
        trans.commit();

    }

    @Override
    public void showProgress(boolean show) {
        Timber.d("showProgress");
        int visible = show ? View.VISIBLE : View.GONE;
        progressBar.setVisibility(visible);
    }

    @Override
    public void showError(String message) {
        Timber.d("showError");
        MaterialDialog.Builder builder = getDialog(getString(R.string.dialog_aplogize_title), message);
        builder.show();
    }

    @Override
    public void showInfo(String message) {
        Timber.d("showInfo");
        MaterialDialog.Builder builder = getDialog(getString(R.string.dialog_info_title), message);
        builder.show();
    }

    private MaterialDialog.Builder getDialog(String title, String msg){
        return new MaterialDialog.Builder(this)
                .title(Utils.getSafeString(title))
                .content(Utils.getSafeString(msg))
                .negativeText(R.string.dialog_button_ok);
    }

    @Subscribe
    public void onEvent(MsgEvent event) {
        Timber.d("Event msg '%s' and flag %s", event.ismSuccess(), event.getMessage());
        if(event.ismSuccess()){
            showInfo(event.getMessage());
        } else{
            showError(event.getMessage());
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        eventBus.register(this);
    }

    @Override
    public void onStop() {
        eventBus.unregister(this);
        super.onStop();
    }
}
