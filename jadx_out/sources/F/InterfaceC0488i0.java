package F;

import F.C0486h0;

/* JADX INFO: renamed from: F.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0488i0 {

    /* JADX INFO: renamed from: F.i0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC0488i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0486h0 f1494a = new C0486h0.a().h();

        @Override // F.InterfaceC0488i0
        public C0486h0 a() {
            return this.f1494a;
        }

        @Override // F.InterfaceC0488i0
        public int getId() {
            return 0;
        }
    }

    C0486h0 a();

    int getId();
}
