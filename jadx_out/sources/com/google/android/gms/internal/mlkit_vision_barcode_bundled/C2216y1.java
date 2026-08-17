package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2216y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2216y1 f22441c = new C2216y1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22442d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f22444b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K1 f22443a = new C2152k1();

    private C2216y1() {
    }

    public static C2216y1 a() {
        return f22441c;
    }

    public final J1 b(Class cls) {
        X0.c(cls, "messageType");
        J1 j12 = (J1) this.f22444b.get(cls);
        if (j12 != null) {
            return j12;
        }
        J1 j1A = this.f22443a.a(cls);
        X0.c(cls, "messageType");
        J1 j13 = (J1) this.f22444b.putIfAbsent(cls, j1A);
        return j13 == null ? j1A : j13;
    }
}
