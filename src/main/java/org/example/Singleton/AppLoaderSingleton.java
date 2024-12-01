package org.example.Singleton;

public class AppLoaderSingleton {
    private static AppLoader appLoader;
    private AppLoaderSingleton(){
        appLoader = new AppLoader();
    }
    public static AppLoader getInstant(){
        if (appLoader == null){
            new AppLoaderSingleton();
        }
        return appLoader;
    }
}
