package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f16270a = (IconCompat) aVar.v(remoteActionCompat.f16270a, 1);
        remoteActionCompat.f16271b = aVar.l(remoteActionCompat.f16271b, 2);
        remoteActionCompat.f16272c = aVar.l(remoteActionCompat.f16272c, 3);
        remoteActionCompat.f16273d = (PendingIntent) aVar.r(remoteActionCompat.f16273d, 4);
        remoteActionCompat.f16274e = aVar.h(remoteActionCompat.f16274e, 5);
        remoteActionCompat.f16275f = aVar.h(remoteActionCompat.f16275f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f16270a, 1);
        aVar.D(remoteActionCompat.f16271b, 2);
        aVar.D(remoteActionCompat.f16272c, 3);
        aVar.H(remoteActionCompat.f16273d, 4);
        aVar.z(remoteActionCompat.f16274e, 5);
        aVar.z(remoteActionCompat.f16275f, 6);
    }
}
