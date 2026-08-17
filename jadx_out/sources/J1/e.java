package J1;

import J1.b;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements c {
    @Override // J1.c
    public b a(Context context, b.a aVar) {
        return androidx.core.content.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new d(context, aVar) : new n();
    }
}
