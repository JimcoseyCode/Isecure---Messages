package f0;

import F.InterfaceC0515w0;
import f0.AbstractC2589l;
import f0.C2585h;

/* JADX INFO: renamed from: f0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2582e extends AbstractC2589l {

    /* JADX INFO: renamed from: f0.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a extends AbstractC2589l.a {
        public abstract AbstractC2582e b();

        public abstract a c(InterfaceC0515w0.a aVar);
    }

    public static a c(String str) {
        return (a) new C2585h.b().d(str).a(-1);
    }

    public abstract InterfaceC0515w0.a d();
}
