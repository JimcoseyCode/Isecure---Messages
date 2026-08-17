package com.ov.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultSmsChangedReceiver extends BroadcastReceiver {
    private static final String TAG = "DefaultSmsChangedReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (!intent.getAction().equals("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED") || (stringExtra = intent.getStringExtra("android.provider.extra.PACKAGE_NAME")) == null) {
            return;
        }
        stringExtra.equals(BuildConfig.APPLICATION_ID);
    }
}
