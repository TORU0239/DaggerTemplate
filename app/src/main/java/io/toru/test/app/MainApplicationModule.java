package io.toru.test.app;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Module(includes = MainAddressModule.class)
public class MainApplicationModule {
    @Provides
    @MainApplicationScope
    @Named("name_with_alias")
    public String name(String alias){
        return "Toru Wonyoung Choi".concat(",").concat(alias);
    }

    @Provides
    @MainApplicationScope
    public String alias(){
        return "test";
    }

    @Provides
    @MainApplicationScope
    public int number(){
        return 1000;
    }
}