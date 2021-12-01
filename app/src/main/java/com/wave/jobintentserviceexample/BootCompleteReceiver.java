package com.wave.jobintentserviceexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context mContext, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent mIntent = new Intent(mContext, MyJobIntentService.class);
            mIntent.putExtra("maxCountValue", 10);
            MyJobIntentService.enqueueWork(mContext, mIntent);
        }
    }
}
