package m4;

import P4.C1379m;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f29612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C1379m f29613b = new C1379m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f29614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f29615d;

    t(int i10, int i11, Bundle bundle) {
        this.f29612a = i10;
        this.f29614c = i11;
        this.f29615d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            uVar.toString();
        }
        this.f29613b.b(uVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f29613b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f29614c + " id=" + this.f29612a + " oneWay=" + b() + "}";
    }
}
