package spa.lyh.cn.superwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.tencent.smtt.sdk.TbsVideo;

import spa.lyh.cn.webviewlib.view.SuperWebView;


/**
 * 再进行具体编码前 ，我先进行了一般商业APP对WebView的需求
 可加载本地和云端H5
 拥有cookie持久能力
 添加公共参数
 回退前进功能
 Js与本地navtive交互
 拥有加载默认错误页面能力
 加载网页可展现进度
 支持https
 */

public class MainActivity extends AppCompatActivity {
    SuperWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (SuperWebView) findViewById(R.id.web);
        //webView.loadUrl("http://m.ipvip.cn/wxmobile/tmSearch.jsp");
        //webView.loadUrl("http://tv.sohu.com/20140508/n399272261.shtml");
        String b = SomeThing.a;
        String c = SomeThing.updateHtmlTag(b,"audio","width:\\w*\\;\\s*height:\\w*\\;","width:98%;height:50px;","");
        Log.e("hahaha",c);
        webView.loadDataWithURL("",c,"text/html;charset=UTF-8","UTF-8","");
        /*if (TbsVideo.canUseTbsPlayer(this)){
            Log.e("hahaha","可以用");
            Bundle data = new Bundle();
            data.putBoolean("supportLiteWnd", true);
            data.putInt("DefaultVideoScreen", 2);
            TbsVideo.openVideo(this,"http://10.9.1.191:8080/AndroidWeb/1.rmvb", data);
        }else {
            Log.e("hahaha","不可以用");
        }*/
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
       if (webView.getWebView() != null) {
            webView.getWebView().destroy();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            if (keyCode == KeyEvent.KEYCODE_BACK && webView.getWebView().canGoBack()) {
                webView.getWebView().goBack();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
