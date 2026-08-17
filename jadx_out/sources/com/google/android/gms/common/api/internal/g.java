package com.google.android.gms.common.api.internal;

import P4.C1379m;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o4.C3009b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21059a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21060b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f21059a) {
            map = new HashMap(this.f21059a);
        }
        synchronized (this.f21060b) {
            map2 = new HashMap(this.f21060b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                android.support.v4.media.session.b.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1379m) entry2.getKey()).d(new C3009b(status));
            }
        }
    }

    final void b(C1379m c1379m, boolean z10) {
        this.f21060b.put(c1379m, Boolean.valueOf(z10));
        c1379m.a().c(new f(this, c1379m));
    }

    final void c(int i10, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, C2098b.f21031p);
    }

    final boolean e() {
        return (this.f21059a.isEmpty() && this.f21060b.isEmpty()) ? false : true;
    }
}
