package androidx.camera.video.internal.compat.quirk;

import F.C0474c1;
import F.C0477d1;
import F.InterfaceC0471b1;
import F.g1;
import I.c;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile g1 f15309a;

    static {
        C0477d1.b().c(c.b(), new H0.a() { // from class: e0.b
            @Override // H0.a
            public final void accept(Object obj) {
                androidx.camera.video.internal.compat.quirk.a.a((C0474c1) obj);
            }
        });
    }

    public static /* synthetic */ void a(C0474c1 c0474c1) {
        f15309a = new g1(b.a(c0474c1));
        AbstractC3583h0.a("DeviceQuirks", "video DeviceQuirks = " + g1.d(f15309a));
    }

    public static InterfaceC0471b1 b(Class cls) {
        return f15309a.b(cls);
    }

    public static g1 c() {
        return f15309a;
    }
}
