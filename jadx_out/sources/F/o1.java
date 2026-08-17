package F;

import F.C0501p;
import android.util.Range;
import android.util.Size;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range f1588a = new Range(0, 0);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        a() {
        }

        public abstract o1 a();

        public abstract a b(C3563H c3563h);

        public abstract a c(Range range);

        public abstract a d(InterfaceC0490j0 interfaceC0490j0);

        public abstract a e(Size size);

        public abstract a f(Size size);

        public abstract a g(int i10);

        public abstract a h(boolean z10);
    }

    public static a a(Size size) {
        return new C0501p.b().f(size).e(size).g(0).c(f1588a).b(C3563H.f33650d).h(false);
    }

    public abstract C3563H b();

    public abstract Range c();

    public abstract InterfaceC0490j0 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract a i();
}
