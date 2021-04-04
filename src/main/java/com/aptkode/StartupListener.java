package com.aptkode;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import jakarta.interceptor.Interceptor;

@ApplicationScoped
public class StartupListener {
    public void onInit(@Observes
                       @Initialized(ApplicationScoped.class)
                       @Priority(Interceptor.Priority.APPLICATION) Object initContext) {
        System.out.println("#######################");
        System.out.println("application initialized");
        System.out.println("#######################");
    }
}
