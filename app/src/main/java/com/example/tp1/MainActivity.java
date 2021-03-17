package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private DetectandoUsb dusb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(dusb);

    }

    @Override
    protected void onResume() {
        super.onResume();
        dusb=new DetectandoUsb();
        registerReceiver(dusb, new IntentFilter("android.hardware.usb.action.USB_STATE"));

    }
}