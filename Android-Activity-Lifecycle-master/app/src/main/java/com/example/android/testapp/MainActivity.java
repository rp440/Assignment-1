package com.example.android.testapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static int counter;

    static {
        counter = 0;
    }

//    public TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ------ ", "MainActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","MainActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        counter = counter + 1;
        Log.e("onResume ------ ", "AnotherActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","MainActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","MainActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","MainActivity: onDestroy()");
    }


    @Override
        protected void onRestart() {
        super.onRestart();
        counter = counter+1;
        TextView restartCounterView = (TextView)findViewById(R.id.restartCounterView);
        String display = String.format("%03d",counter);
        restartCounterView.setText("Restart Counter: "+display);
        }

    public void switchActivity(View view){
        Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
        startActivity(intent);    }

    public void close()
    {
        finish();
        System.exit(0);
    }

}
