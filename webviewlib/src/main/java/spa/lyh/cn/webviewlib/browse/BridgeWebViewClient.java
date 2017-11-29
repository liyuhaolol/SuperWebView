package spa.lyh.cn.webviewlib.browse;



import android.graphics.Bitmap;
import android.util.Log;

import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import spa.lyh.cn.webviewlib.X5Application.SuperApplication;

/**
 * Created by liyuhao on 2017/10/10.
 */

public class BridgeWebViewClient extends WebViewClient {
    private BridgeWebView webView;

    public BridgeWebViewClient(BridgeWebView webView){
        this.webView = webView;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.e(SuperApplication.TAG,url);
        return super.shouldOverrideUrlLoading(view, url);
    }
    @Override
    public void onPageStarted(WebView webView, String s, Bitmap bitmap) {
        super.onPageStarted(webView, s, bitmap);
        //webView.requestFocus();//得到焦点用来启动集成的单击后退
    }

    @Override
    public void onPageFinished(WebView webView, String s) {
        super.onPageFinished(webView, s);
        //webView.requestFocus();//得到焦点用来启动集成的单击后退
    }
}
