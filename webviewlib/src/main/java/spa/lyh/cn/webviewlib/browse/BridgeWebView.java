package spa.lyh.cn.webviewlib.browse;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;

import com.tencent.smtt.sdk.WebView;


/**
 * 重写腾讯的webview
 * Created by liyuhao on 2017/9/29.
 */

public class BridgeWebView extends WebView {



    public BridgeWebView(Context context) {
        this(context,null);
    }

    public BridgeWebView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BridgeWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 初始化基本参数
     */
    private void init(){
        if (!isInEditMode()){
            //关闭垂直滚动条
            this.setVerticalScrollBarEnabled(false);
            //关闭水平滚动条
            this.setHorizontalScrollBarEnabled(false);
            //大于4.4启动远程调试
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
                WebView.setWebContentsDebuggingEnabled(true);
            }
            //设置webview客户端
            this.setWebViewClient(generateBridgeWebViewClient());

            Bundle data = new Bundle();

            data.putBoolean("standardFullScreen", false);
            //true表示标准全屏，false表示X5全屏；不设置默认false，

            data.putBoolean("supportLiteWnd", true);
            //false：关闭小窗；true：开启小窗；不设置默认true，

            data.putInt("DefaultVideoScreen", 1);
            //1：以页面内开始播放，2：以全屏开始播放；不设置默认：1
            this.getX5WebViewExtension().invokeMiscMethod("setVideoParams", data);

        }
    }

    protected BridgeWebViewClient generateBridgeWebViewClient() {
        return new BridgeWebViewClient(this);
    }



}
