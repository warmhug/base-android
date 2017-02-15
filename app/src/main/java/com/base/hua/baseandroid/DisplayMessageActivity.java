package com.base.hua.baseandroid;

import android.content.Intent;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    boolean isDebugger = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("");
        // textView.setText(message);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_display_message);
        layout.addView(textView);

        // 渲染 webview
        final WebView webView = (WebView) findViewById(R.id.wb);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        // webView.getSettings().setBuiltInZoomControls(true);
        // webView.getSettings().setDisplayZoomControls(false);
        webView.setWebChromeClient(new WebChromeClient());
        // webView.loadUrl("http://baidu.com");

        final EditText mEditSearch = (EditText)this.findViewById(R.id.editText);
        mEditSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {

                    webView.loadUrl(mEditSearch.getText().toString().trim());
                    return true;
                }
                return false;
            }
        });

        webView.loadUrl(mEditSearch.getText().toString().trim());


        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2) {
            if (isDebugger) {
                isDebugger = false;
                btn.setText("debugger wb");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    WebView.setWebContentsDebuggingEnabled(false);
                }
            } else {
                isDebugger = true;
                btn.setText("stop debugger wb");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
            }
        }
    }
}
