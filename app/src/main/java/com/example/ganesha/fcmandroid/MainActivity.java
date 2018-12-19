 package com.example.ganesha.fcmandroid;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tvId);
        String id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        textView.setText(id);
        Log.e("Device Id",id);
    }
}
