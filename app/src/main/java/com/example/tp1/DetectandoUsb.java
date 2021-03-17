package com.example.tp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DetectandoUsb extends BroadcastReceiver {
    private int bandera=0;
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean b=intent.getExtras().getBoolean("connected");
        if(b && bandera==0){
            Toast.makeText(context, "Entre", Toast.LENGTH_LONG).show();
            bandera=1;
            Intent i=new Intent(context,segunda.class);
            context.startActivity(i);
        }
        else{
            bandera=0;
            Toast.makeText(context, "Desconectado", Toast.LENGTH_LONG).show();
        }
    }



}
