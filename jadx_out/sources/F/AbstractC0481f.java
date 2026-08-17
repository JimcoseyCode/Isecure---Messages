package F;

import android.util.Range;
import android.util.Size;
import java.util.List;
import y.C3563H;

/* JADX INFO: renamed from: F.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481f {
    AbstractC0481f() {
    }

    public static AbstractC0481f a(r1 r1Var, int i10, Size size, C3563H c3563h, List list, InterfaceC0490j0 interfaceC0490j0, int i11, Range range, boolean z10) {
        return new C0483g(r1Var, i10, size, c3563h, list, interfaceC0490j0, i11, range, z10);
    }

    public abstract List b();

    public abstract C3563H c();

    public abstract int d();

    public abstract InterfaceC0490j0 e();

    public abstract int f();

    public abstract Size g();

    public abstract r1 h();

    public abstract Range i();

    public abstract boolean j();

    public o1 k(InterfaceC0490j0 interfaceC0490j0) {
        return o1.a(g()).g(f()).c(i()).b(c()).d(interfaceC0490j0).a();
    }
}
