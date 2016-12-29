package io.toru.test.ui.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Module
@MainActivityScope
public class MainActivityModule {
    @Provides
    public String testAccount(){
        return "blueocean239@gmail.com";
    }
}