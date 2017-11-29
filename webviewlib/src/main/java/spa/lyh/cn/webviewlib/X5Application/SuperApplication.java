package spa.lyh.cn.webviewlib.X5Application;

import android.app.Application;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

/**
 * 初始化X5内核
 * Created by liyuhao on 2017/10/16.
 */

public class SuperApplication extends Application{

    public final static String TAG = "SuperWebView";

    @Override
    public void onCreate() {
        super.onCreate();
        initTbs();
    }

    private void initTbs() {
        //搜集本地tbs内核信息并上报服务器，服务器返回结果决定使用哪个内核。
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.e(TAG,"X5 Core has been initialized");

            }

            @Override
            public void onViewInitFinished(boolean b) {
                if (b){
                    Log.e(TAG,"X5 Webview has been activited successfully");
                }else {
                    Log.e(TAG,"X5 Webview hasn't been activited");
                }

            }

        };
        QbSdk.setDownloadWithoutWifi(true);
        QbSdk.preInit(getApplicationContext(),cb);
    }
}
