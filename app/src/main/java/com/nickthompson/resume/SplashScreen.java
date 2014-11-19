package com.nickthompson.resume;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    private static final int SPLASH_DISPLAY_TIME = 3000; /* 3 seconds */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {

            public void run() {

                Intent mainIntent = new Intent(SplashScreen.this,
                        HomeActivity.class);
                SplashScreen.this.startActivity(mainIntent);

                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_TIME);
    }
}