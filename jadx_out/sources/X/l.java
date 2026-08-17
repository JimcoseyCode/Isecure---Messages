package x;

import F.InterfaceC0490j0;
import F.R0;
import F.S0;
import F.X0;
import F.h1;
import x.l;
import y.InterfaceC3564I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l implements h1 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final InterfaceC0490j0 f33200P;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC3564I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f33201a = S0.i0();

        public static /* synthetic */ boolean a(a aVar, InterfaceC0490j0 interfaceC0490j0, InterfaceC0490j0.a aVar2) {
            aVar.b().t(aVar2, interfaceC0490j0.c(aVar2), interfaceC0490j0.d(aVar2));
            return true;
        }

        public static a e(final InterfaceC0490j0 interfaceC0490j0) {
            final a aVar = new a();
            interfaceC0490j0.h("camera2.captureRequest.option.", new InterfaceC0490j0.b() { // from class: x.k
                @Override // F.InterfaceC0490j0.b
                public final boolean a(InterfaceC0490j0.a aVar2) {
                    return l.a.a(this.f33198a, interfaceC0490j0, aVar2);
                }
            });
            return aVar;
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f33201a;
        }

        public l d() {
            return new l(X0.h0(this.f33201a));
        }
    }

    public l(InterfaceC0490j0 interfaceC0490j0) {
        this.f33200P = interfaceC0490j0;
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f33200P;
    }
}
