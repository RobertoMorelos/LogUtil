package com.example.logutilexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rm.logutil.LogU;

/**
 * @author Roberto Morelos
 * @since 7/5/17
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogU.v(TAG, "This log is showing in debug mode!");
        LogU.v(TAG, "This log is not showing even in debug mode.", false);
    }

}