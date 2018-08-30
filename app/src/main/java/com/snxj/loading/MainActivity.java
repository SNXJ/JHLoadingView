package com.snxj.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.snxj.loading.view.LoadingView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LoadingView loading_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loading_view = (LoadingView) findViewById(R.id.loading_view);
//        loading_view.startAnimation(0, 100, 2000);
//            loading_view.setRecovery(true);
//            loading_view.setLoop(true);

        findViewById(R.id.btn_normal).setOnClickListener(this);
        findViewById(R.id.btn_recovery).setOnClickListener(this);
        findViewById(R.id.btn_loop).setOnClickListener(this);
        findViewById(R.id.btn_reset).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_normal:
                loading_view.startAnimation(0, 100, 2000);
                break;
            case R.id.btn_recovery:
                loading_view.setRecovery(true);
                loading_view.startAnimation(0, 100, 2000);

                break;
            case R.id.btn_loop:
                loading_view.setLoop(true);
                loading_view.startAnimation(0, 100, 2000);
                break;
            case R.id.btn_reset:
                loading_view.stopLoading();

                break;
        }
    }
}
