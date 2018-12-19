package com.example.ganesha.fcmandroid;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MyFirebaseInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        String device_token = FirebaseInstanceId.getInstance().getId();

        //Displaying token in logcat
        Log.e(TAG, "Refreshed token: " + refreshedToken);

        Log.e(TAG,"Id: " + device_token);

    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}