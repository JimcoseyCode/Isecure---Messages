package D4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends androidx.core.content.a {
    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != f.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
