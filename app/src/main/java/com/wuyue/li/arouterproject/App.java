package com.wuyue.li.arouterproject;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class App extends Application {


    private App mApplication;
    //Arouter 调试开关
    private boolean isDebugARouter =true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebugARouter){
            ARouter.openDebug();
            ARouter.openLog();
        }
        mApplication = this;
        ARouter.init(mApplication); // 尽可能早，推荐在Application中初始化
    }
}
