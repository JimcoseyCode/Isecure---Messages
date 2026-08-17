package h6;

import I4.A9;
import I4.C0826b7;
import I4.C1069x9;
import I4.K6;
import I4.M6;
import I4.M9;
import I4.N6;
import I4.Z6;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.InterfaceC1377k;
import c6.C1864i;
import com.google.android.gms.common.Feature;
import e6.C2428b;
import e6.InterfaceC2427a;
import java.util.List;
import java.util.concurrent.Executor;
import k6.C2831a;
import l6.AbstractC2879e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC2879e implements InterfaceC2427a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final C2428b f28472s = new C2428b.a().a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f28473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2428b f28474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final M9 f28475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f28477r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(C2428b c2428b, k kVar, Executor executor, C1069x9 c1069x9, C1864i c1864i) {
        super(kVar, executor);
        c2428b.b();
        this.f28474o = c2428b;
        boolean zF = b.f();
        this.f28473n = zF;
        Z6 z62 = new Z6();
        z62.i(b.c(c2428b));
        C0826b7 c0826b7J = z62.j();
        N6 n62 = new N6();
        n62.e(zF ? K6.TYPE_THICK : K6.TYPE_THIN);
        n62.g(c0826b7J);
        c1069x9.d(A9.f(n62, 1), M6.ON_DEVICE_BARCODE_CREATE);
        this.f28475p = null;
    }

    private final AbstractC1378l I(AbstractC1378l abstractC1378l, final int i10, final int i11) {
        return abstractC1378l.q(new InterfaceC1377k() { // from class: h6.e
            @Override // P4.InterfaceC1377k
            public final AbstractC1378l a(Object obj) {
                return this.f28466a.B(i10, i11, (List) obj);
            }
        });
    }

    final /* synthetic */ AbstractC1378l B(int i10, int i11, List list) {
        return AbstractC1381o.f(list);
    }

    @Override // l6.AbstractC2879e, java.io.Closeable, java.lang.AutoCloseable, e6.InterfaceC2427a
    public final synchronized void close() {
        super.close();
    }

    @Override // o4.g
    public final Feature[] d() {
        return this.f28473n ? c6.l.f18862a : new Feature[]{c6.l.f18863b};
    }

    @Override // e6.InterfaceC2427a
    public final AbstractC1378l s0(C2831a c2831a) {
        return I(super.r(c2831a), c2831a.k(), c2831a.g());
    }
}
