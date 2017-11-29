package spa.lyh.cn.webviewlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.WebSettings;

import java.util.Map;

import spa.lyh.cn.webviewlib.browse.BridgeWebView;
import spa.lyh.cn.webviewlib.browse.js.CustomWebChromeClient;


/**
 * 集成进度条的webview
 * Created by liyuhao on 2017/9/29.
 */

public class SuperWebView extends RelativeLayout{

    private NumberProgressBar mProgressBar;

    private BridgeWebView mWebView;

    public SuperWebView(Context context) {
        super(context);
        init(context,null);
    }

    public SuperWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public SuperWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }



    private void init(Context context, AttributeSet attrs){
        if (!isInEditMode()){
            // 初始化webview
            if (mWebView == null) {
                mWebView = new BridgeWebView(context);
            }
            //初始化进度条
            if (mProgressBar == null){
                mProgressBar = new NumberProgressBar(context,attrs);
            }

            //将进度条加入控制
            mWebView.setWebChromeClient(new CustomWebChromeClient(mProgressBar));

            WebSettings webSettings = mWebView.getSettings();
            // 不支持缩放
            webSettings.setSupportZoom(false);

            // 自适应屏幕大小
            webSettings.setUseWideViewPort(true);
            webSettings.setLoadWithOverviewMode(true);

            //使用缓存
            webSettings.setAppCacheEnabled(true);

            //DOM Storage
            webSettings.setDomStorageEnabled(true);
            webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

            //启动对js的支持
            webSettings.setJavaScriptEnabled(true);
            //对图片大小适配
            webSettings.setUseWideViewPort(true);
            //对文字大小适配
            webSettings.setLoadWithOverviewMode(true);
            // 判断系统版本是不是5.0或之上
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //让系统不屏蔽混合内容和第三方Cookie
                CookieManager.getInstance().setAcceptThirdPartyCookies(mWebView, true);
                webSettings.setMixedContentMode(0);//永远允许
            }

            //拦截后退按键，单击优先回退上一层级,有BUG，屏蔽
            /*mWebView.setOnKeyListener(new OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        if (keyCode == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {
                            mWebView.goBack();
                            return true;
                        }
                    }
                    return false;
                }
            });*/

            //设置可以获取焦点

            //mWebView.setFocusable(true);
            mWebView.setFocusableInTouchMode(true);


            addView(mWebView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            addView(mProgressBar, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }

    }


    public NumberProgressBar getProgressBar() {
        return mProgressBar;
    }


    public BridgeWebView getWebView() {
        return mWebView;
    }

    /**
     * Loads the given URL.
     *
     * @param url the URL of the resource to load
     */
    public void loadUrl(String url) {
        loadUrl(url, null);
    }

    /**
     * Loads the given URL with the specified additional HTTP headers.
     *
     * @param url                   the URL of the resource to load
     * @param additionalHttpHeaders the additional headers to be used in the
     *                              HTTP request for this URL, specified as a map from name to
     *                              value. Note that if this map contains any of the headers
     *                              that are set by default by this WebView, such as those
     *                              controlling caching, accept types or the User-Agent, their
     *                              values may be overriden by this WebView's defaults.
     */
    public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {
        mWebView.loadUrl(url, additionalHttpHeaders);
    }

    public void loadDataWithURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl){
        mWebView.loadDataWithBaseURL(baseUrl,data,mimeType,encoding,historyUrl);
    }
}
