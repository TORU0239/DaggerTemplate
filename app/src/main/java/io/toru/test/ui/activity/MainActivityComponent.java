package io.toru.test.ui.activity;

import dagger.Component;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    String getTestAccount();
}
