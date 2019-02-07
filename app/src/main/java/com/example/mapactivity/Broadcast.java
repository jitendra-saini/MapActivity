package com.example.mapactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {







    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getAction(),Toast.LENGTH_LONG).show();






    }

}
