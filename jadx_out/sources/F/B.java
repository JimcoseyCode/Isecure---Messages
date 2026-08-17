package F;

import H.i;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface B {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements B {
        public static B l() {
            return new a();
        }

        @Override // F.B
        public long a() {
            return -1L;
        }

        @Override // F.B
        public u1 b() {
            return u1.b();
        }

        @Override // F.B
        public A c() {
            return A.UNKNOWN;
        }

        @Override // F.B
        public EnumC0520z e() {
            return EnumC0520z.UNKNOWN;
        }

        @Override // F.B
        public EnumC0518y f() {
            return EnumC0518y.UNKNOWN;
        }

        @Override // F.B
        public EnumC0514w g() {
            return EnumC0514w.UNKNOWN;
        }

        @Override // F.B
        public EnumC0512v h() {
            return EnumC0512v.UNKNOWN;
        }

        @Override // F.B
        public CaptureResult i() {
            return null;
        }

        @Override // F.B
        public EnumC0510u j() {
            return EnumC0510u.UNKNOWN;
        }

        @Override // F.B
        public EnumC0516x k() {
            return EnumC0516x.UNKNOWN;
        }
    }

    long a();

    u1 b();

    A c();

    default void d(i.b bVar) {
        bVar.g(c());
    }

    EnumC0520z e();

    EnumC0518y f();

    EnumC0514w g();

    EnumC0512v h();

    default CaptureResult i() {
        return null;
    }

    EnumC0510u j();

    EnumC0516x k();
}
