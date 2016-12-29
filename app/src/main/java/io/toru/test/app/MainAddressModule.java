package io.toru.test.app;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Module
public class MainAddressModule {
    @Provides
//    @Named("address")
    @AddressQualifier
    public String address(){
        return "Suwon City";
    }
}