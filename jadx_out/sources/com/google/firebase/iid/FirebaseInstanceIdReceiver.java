package com.google.firebase.iid;

import P4.AbstractC1381o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.C2246n;
import com.google.firebase.messaging.K;
import java.util.concurrent.ExecutionException;
import m4.AbstractC2898a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2898a {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // m4.AbstractC2898a
    protected int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) AbstractC1381o.a(new C2246n(context).g(cloudMessage.e()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // m4.AbstractC2898a
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (K.D(intentF)) {
            K.v(intentF);
        }
    }
}
