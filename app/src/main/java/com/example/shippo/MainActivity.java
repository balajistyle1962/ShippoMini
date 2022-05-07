package com.example.shippo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        SplashScreen s = new SplashScreen();
        s.start();
    }
    private class SplashScreen extends Thread
    {
        public void run()
        {
            try {
                sleep(1000*4);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    }
}