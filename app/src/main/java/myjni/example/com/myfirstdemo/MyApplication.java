package myjni.example.com.myfirstdemo;

import android.app.Application;

/**
 * Created by Administrator on 2016/6/20.
 */
public class MyApplication extends Application{
    public static MyApplication INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE=this;
    }

    public static MyApplication getINSTANCE() {
        return INSTANCE;
    }
}
