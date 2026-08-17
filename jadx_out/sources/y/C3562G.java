package y;

import android.graphics.PointF;
import android.view.Display;

/* JADX INFO: renamed from: y.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3562G extends AbstractC3591l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f33644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f33645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Display f33646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3597q f33647e;

    public C3562G(Display display, InterfaceC3597q interfaceC3597q, float f10, float f11) {
        this.f33644b = f10;
        this.f33645c = f11;
        this.f33646d = display;
        this.f33647e = interfaceC3597q;
    }

    private int f(boolean z10) {
        try {
            int iP = this.f33647e.p(this.f33646d.getRotation());
            return z10 ? (360 - iP) % 360 : iP;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // y.AbstractC3591l0
    protected PointF a(float f10, float f11) {
        float f12 = this.f33644b;
        float f13 = this.f33645c;
        boolean z10 = this.f33647e.k() == 0;
        int iF = f(z10);
        if (iF != 90 && iF != 270) {
            f11 = f10;
            f10 = f11;
            f13 = f12;
            f12 = f13;
        }
        if (iF == 90) {
            f10 = f12 - f10;
        } else if (iF == 180) {
            f11 = f13 - f11;
            f10 = f12 - f10;
        } else if (iF == 270) {
            f11 = f13 - f11;
        }
        if (z10) {
            f11 = f13 - f11;
        }
        return new PointF(f11 / f13, f10 / f12);
    }
}
