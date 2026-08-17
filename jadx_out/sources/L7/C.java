package L7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f7281a = new G("InvalidModuleNotifier");

    public static final void a(H h10) {
        AbstractC2855l.g(h10, "<this>");
        android.support.v4.media.session.b.a(h10.s0(f7281a));
        throw new B("Accessing invalid module descriptor " + h10);
    }
}
