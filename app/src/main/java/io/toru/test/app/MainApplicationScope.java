package io.toru.test.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by wonyoung on 2016. 12. 28..
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface MainApplicationScope {
}
