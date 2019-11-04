package pt.seltius.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import pt.seltius.R;

public class SplashActivity extends AppCompatActivity {
    final int SPLASH_DELAY_MILLIS = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler mWaitHandler = new Handler();
        mWaitHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (true) {
                    try {
                        Intent intent = new Intent(SplashActivity.this.getApplicationContext(), SignInActivity.class);
                        SplashActivity.this.startActivity(intent);
                        SplashActivity.this.finish();
                    } catch (Exception ignored) {
                        ignored.printStackTrace();
                    }
                } else {
                    Intent intent = new Intent(SplashActivity.this.getApplicationContext(), MainActivity.class);
                    SplashActivity.this.startActivity(intent);
                    SplashActivity.this.finish();
                }
            }
        }, SPLASH_DELAY_MILLIS);

    }
}
