package com.xiaoxing.mvp;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.tencent.bugly.Bugly;
import com.umeng.analytics.MobclickAgent;
import com.xiaoxing.mvp_core.CoreApp;

/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 14:46
 * @change
 * @chang time
 * @class describe
 */
public class App extends CoreApp {


    public static int SCREEN_WIDTH = -1;
    public static int SCREEN_HEIGHT = -1;
    public static float DIMEN_RATE = -1.0F;
    public static int DIMEN_DPI = -1;

    @Override
    public String setBaseUrl() {
        return Constants.DOMAIN_API;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化屏幕宽高
        getScreenSize();
        Bugly.init(getApplicationContext(), "e0bec44741", true);
        MobclickAgent.startWithConfigure(new MobclickAgent.UMAnalyticsConfig(this, "59881d5d4ad15615220000a8", "Mvp", MobclickAgent.EScenarioType.E_UM_NORMAL, true));
    }

    public void getScreenSize() {
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        Display display = windowManager.getDefaultDisplay();
        display.getMetrics(dm);
        DIMEN_RATE = dm.density / 1.0F;
        DIMEN_DPI = dm.densityDpi;
        SCREEN_WIDTH = dm.widthPixels;
        SCREEN_HEIGHT = dm.heightPixels;
        if (SCREEN_WIDTH > SCREEN_HEIGHT) {
            int t = SCREEN_HEIGHT;
            SCREEN_HEIGHT = SCREEN_WIDTH;
            SCREEN_WIDTH = t;
        }
    }
}
