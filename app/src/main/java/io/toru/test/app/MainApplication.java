package io.toru.test.app;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

/**
 * Created by wonyoung on 2016. 12. 27..
 */

public class MainApplication extends Application {

    public static MainApplication get(Activity activity) {
        return (MainApplication) activity.getApplication();
    }

    private MainApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMainApplicationComponent.builder()
                .mainApplicationModule(new MainApplicationModule())
                .build();

        Log.w("", "onCreate: " + component.getAddress());
    }

    public MainApplicationComponent getComponent() {
        return component;
    }
}