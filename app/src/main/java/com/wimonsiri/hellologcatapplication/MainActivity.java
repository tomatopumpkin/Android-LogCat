package com.wimonsiri.hellologcatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "My_App";
    private int data = 10;

    Button btnError , btnWarning , btnInformation , btnDebug , btnVerbose ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnError = (Button) findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"show logcat Error" , Toast.LENGTH_LONG).show();
                Log.e(TAG , "Test Log.e data = " + data);
            }
        });

        btnWarning = (Button) findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"show logcat Waring" , Toast.LENGTH_LONG).show();
                Log.w(TAG , "Test Log.w data = " + data);
            }
        });

        btnInformation = (Button) findViewById(R.id.btnInformation);
        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"show logcat Information" , Toast.LENGTH_LONG).show();
                Log.i(TAG , "Test Log.i data = " + data);
            }
        });

        btnDebug = (Button) findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"show logcat Debug" , Toast.LENGTH_LONG).show();
                Log.d(TAG , "Test Log.d data = " + data);
            }
        });

        btnVerbose = (Button) findViewById(R.id.btnVerbose);
        btnVerbose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"show logcat Verbose" , Toast.LENGTH_LONG).show();
                Log.v(TAG , "Test Log.v data = " + data);
            }
        });
    }
}