package io.toru.test.app;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Component(modules = {MainApplicationModule.class})
@MainApplicationScope
public interface MainApplicationComponent {
    @Named("name_with_alias")
    String getName();
//    @Named("address")
    @AddressQualifier
    String getAddress();
    int getNumbers();
}