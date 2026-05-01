package com.hacker.vnc;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.*;
public class MainActivity extends Activity {
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("http://127.0.0.1:6080/vnc.html?autoconnect=true");
        setContentView(w);
    }
}
