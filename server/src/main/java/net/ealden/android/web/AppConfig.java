package net.ealden.android.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.sitebricks.SitebricksModule;

public class AppConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new SitebricksModule() {
            @Override
            protected void configureSitebricks() {
                scan(WebService.class.getPackage());
            }
        });
    }
}
