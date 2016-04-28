package com.github.guliash.androidexplorer;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    protected static String TAG = "explorer";

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.e(TAG, "ON CREATE " + this);
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "ON DESTROY " + this);
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "ON START " + this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "ON STOP " + this);
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "ON RESUME " + this);
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "ON PAUSE " + this);
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.e(TAG, "ON SAVE ISNTANCE STATE " + this);
        super.onSaveInstanceState(outState);
    }
}
