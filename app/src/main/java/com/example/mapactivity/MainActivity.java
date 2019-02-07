package com.example.mapactivity;

import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
IntentFilter intentFilter;
    Broadcast myReceiver = new Broadcast();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button=findViewById(R.id.button);

intentFilter.addAction(getPackageName()+"android.intent.action.AIRPLANE_MODE");

        registerReceiver(myReceiver, intentFilter);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

   /* @Override
    protected void onDestroy() {
        unregisterReceiver(myReceiver);
        super.onDestroy();
    }*/
}
