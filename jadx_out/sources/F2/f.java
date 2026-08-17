package F2;

import F2.a;
import H2.i;
import H2.j;
import H2.k;
import H2.l;
import g2.AbstractC2662a;
import i7.C2735B;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements F2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2.d f1816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D2.c f1817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f1818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f1823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f1826k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1827a;

        a() {
            this.f1827a = f.this.f1824i;
        }

        @Override // H2.i
        public int a() {
            return this.f1827a;
        }

        @Override // H2.i
        public int b() {
            return f.this.f1825j;
        }

        @Override // H2.i
        public void c(int i10) {
            if (i10 != f.this.f1825j) {
                f fVar = f.this;
                fVar.f1825j = B7.d.l(i10, 1, fVar.f1824i);
                j jVarL = f.this.l();
                if (jVarL != null) {
                    jVarL.c(f.this.f1825j);
                }
            }
        }
    }

    public f(String str, C2.d animationInformation, D2.c bitmapFrameRenderer, k frameLoaderFactory, boolean z10) {
        AbstractC2855l.g(animationInformation, "animationInformation");
        AbstractC2855l.g(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC2855l.g(frameLoaderFactory, "frameLoaderFactory");
        this.f1816a = animationInformation;
        this.f1817b = bitmapFrameRenderer;
        this.f1818c = frameLoaderFactory;
        this.f1819d = z10;
        this.f1820e = str == null ? String.valueOf(hashCode()) : str;
        this.f1821f = animationInformation.l();
        this.f1822g = animationInformation.h();
        int iK = k(animationInformation);
        this.f1824i = iK;
        this.f1825j = iK;
        this.f1826k = new a();
    }

    private final g j(int i10, int i11) {
        if (!this.f1819d) {
            return new g(this.f1821f, this.f1822g);
        }
        int iH = this.f1821f;
        int iH2 = this.f1822g;
        if (i10 < iH || i11 < iH2) {
            double d10 = ((double) iH) / ((double) iH2);
            if (i11 > i10) {
                iH2 = B7.d.h(i11, iH2);
                iH = (int) (((double) iH2) * d10);
            } else {
                iH = B7.d.h(i10, iH);
                iH2 = (int) (((double) iH) / d10);
            }
        }
        return new g(iH, iH2);
    }

    private final int k(C2.d dVar) {
        return (int) B7.d.e(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.i() / dVar.a())), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j l() {
        if (this.f1823h == null) {
            this.f1823h = this.f1818c.b(this.f1820e, this.f1817b, this.f1816a);
        }
        return this.f1823h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B m() {
        return C2735B.f28704a;
    }

    @Override // F2.a
    public void a(int i10, int i11, InterfaceC3487a interfaceC3487a) {
        if (i10 <= 0 || i11 <= 0 || this.f1821f <= 0 || this.f1822g <= 0) {
            return;
        }
        g gVarJ = j(i10, i11);
        j jVarL = l();
        if (jVarL != null) {
            int iB = gVarJ.b();
            int iB2 = gVarJ.b();
            if (interfaceC3487a == null) {
                interfaceC3487a = new InterfaceC3487a() { // from class: F2.e
                    @Override // w7.InterfaceC3487a
                    public final Object invoke() {
                        return f.m();
                    }
                };
            }
            jVarL.a(iB, iB2, interfaceC3487a);
        }
    }

    @Override // F2.a
    public AbstractC2662a b(int i10, int i11, int i12) {
        g gVarJ = j(i11, i12);
        j jVarL = l();
        l lVarB = jVarL != null ? jVarL.b(i10, gVarJ.b(), gVarJ.a()) : null;
        if (lVarB != null) {
            H2.e.f3691a.h(this.f1826k, lVarB);
        }
        if (lVarB != null) {
            return lVarB.a();
        }
        return null;
    }

    @Override // F2.a
    public void c() {
        j jVarL = l();
        if (jVarL != null) {
            k.f3720d.b(this.f1820e, jVarL);
        }
        this.f1823h = null;
    }

    @Override // F2.a
    public void d(b bVar, D2.b bVar2, C2.a aVar, int i10, InterfaceC3487a interfaceC3487a) {
        a.C0040a.e(this, bVar, bVar2, aVar, i10, interfaceC3487a);
    }

    @Override // F2.a
    public void onStop() {
        j jVarL = l();
        if (jVarL != null) {
            jVarL.onStop();
        }
        c();
    }
}
