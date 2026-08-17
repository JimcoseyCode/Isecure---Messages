package a9;

import W8.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f13696a = new E("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f13697b = new E("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC1601a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ InterfaceC1601a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
