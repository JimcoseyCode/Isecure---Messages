package X7;

import L7.InterfaceC1280e;
import b8.InterfaceC1823g;
import kotlin.jvm.internal.AbstractC2855l;
import t8.C3380c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3380c f12552a;

    @Override // X7.n
    public InterfaceC1280e a(InterfaceC1823g javaClass) {
        AbstractC2855l.g(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final C3380c b() {
        C3380c c3380c = this.f12552a;
        if (c3380c != null) {
            return c3380c;
        }
        AbstractC2855l.y("resolver");
        return null;
    }

    public final void c(C3380c c3380c) {
        AbstractC2855l.g(c3380c, "<set-?>");
        this.f12552a = c3380c;
    }
}
