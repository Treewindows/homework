package org.example.Singleton;

public class AppEndWorkSingleton {
    private static AppEndWork appEndWork;
    private AppEndWorkSingleton(){
        appEndWork = new AppEndWork();
    }
    public static AppEndWork getInstant(){
        if (appEndWork == null){
            new AppEndWorkSingleton();
        }
        return appEndWork;
    }
}
