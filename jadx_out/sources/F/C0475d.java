package F;

import androidx.lifecycle.AbstractC1776x;

/* JADX INFO: renamed from: F.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0475d extends AbstractC0521z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f1449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC1776x f1450f;

    public C0475d(L l10, E e10) {
        super(l10);
        this.f1447c = false;
        this.f1448d = false;
        this.f1450f = null;
        this.f1446b = l10;
        this.f1449e = e10;
        e10.R(null);
        F(e10.z());
        E(e10.U());
    }

    public static float C(float f10, float f11, float f12) {
        if (f12 == f11) {
            return 0.0f;
        }
        if (f10 == f12) {
            return 1.0f;
        }
        if (f10 == f11) {
            return 0.0f;
        }
        float f13 = 1.0f / f11;
        return ((1.0f / f10) - f13) / ((1.0f / f12) - f13);
    }

    public E B() {
        return this.f1449e;
    }

    public m1 D() {
        return null;
    }

    public void E(boolean z10) {
        this.f1448d = z10;
    }

    public void F(boolean z10) {
        this.f1447c = z10;
    }

    @Override // F.AbstractC0521z0, F.L
    public boolean e() {
        return super.e();
    }

    @Override // F.AbstractC0521z0, F.L
    public L g() {
        return this.f1446b;
    }

    @Override // F.AbstractC0521z0, y.InterfaceC3597q
    public boolean s() {
        if (H.w.b(null, 5)) {
            return this.f1446b.s();
        }
        return false;
    }

    @Override // F.AbstractC0521z0, y.InterfaceC3597q
    public AbstractC1776x y() {
        return !H.w.b(null, 0) ? new androidx.lifecycle.A(K.h.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f1446b.y();
    }
}
