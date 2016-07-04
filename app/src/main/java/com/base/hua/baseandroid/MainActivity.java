package com.base.hua.baseandroid;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    TextView txt;
    TextView txt2;
    public final static String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        txt = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(this);

        ImageButton fab = (ImageButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        System.out.println("====");
        System.out.println(v.getId());
        if (v.getId() == R.id.button) {
            txt.setText("clicked button");
        }
        if (v.getId() == R.id.imageView) {
            txt2.setText("wang wang wang");
        }
    }

    public void showMessageIntent(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "my base android");
        startActivity(intent);
    }
    public void showLV(View view) {
        Intent intent = new Intent(this, LoadListViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "my base android");
        startActivity(intent);
    }

}
