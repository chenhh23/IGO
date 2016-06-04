package com.example.pedometer.igo.Receiver;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;

import com.example.pedometer.igo.Fragment.ChooseAreaFragment;
import com.example.pedometer.igo.Service.AutoUpdateService;

/**
 * Created by vvv98 on 2016/6/4.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context,Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
