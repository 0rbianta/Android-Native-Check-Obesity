package basic.orbianta.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import static basic.orbianta.fun.global.timer;

public class splash extends AppCompatActivity {

    static {
        System.loadLibrary("i-love-cockatiels");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent activity_intent = new Intent(splash.this, MainActivity.class);
                activity_intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(activity_intent);
            }
        },2000);

    }
}