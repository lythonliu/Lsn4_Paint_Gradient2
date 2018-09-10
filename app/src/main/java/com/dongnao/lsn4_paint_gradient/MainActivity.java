package com.dongnao.lsn4_paint_gradient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ZoomImageView view = new ZoomImageView(this);
        //setContentView(view);
    }
}
