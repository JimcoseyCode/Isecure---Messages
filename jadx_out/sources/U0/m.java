package U0;

import U0.h;
import android.util.AndroidRuntimeException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private n f10781B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f10782C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f10783D;

    public m(k kVar) {
        super(kVar);
        this.f10781B = null;
        this.f10782C = Float.MAX_VALUE;
        this.f10783D = false;
    }

    private void s() {
        n nVar = this.f10781B;
        if (nVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = nVar.b();
        if (dB > this.f10766g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f10767h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // U0.h
    public void c() {
        super.c();
        float f10 = this.f10782C;
        if (f10 != Float.MAX_VALUE) {
            n nVar = this.f10781B;
            if (nVar == null) {
                this.f10781B = new n(f10);
            } else {
                nVar.g(f10);
            }
            this.f10782C = Float.MAX_VALUE;
        }
    }

    @Override // U0.h
    public void l() {
        s();
        this.f10781B.i(g());
        super.l();
    }

    @Override // U0.h
    boolean n(long j10) {
        if (this.f10783D) {
            float f10 = this.f10782C;
            if (f10 != Float.MAX_VALUE) {
                this.f10781B.g(f10);
                this.f10782C = Float.MAX_VALUE;
            }
            this.f10761b = this.f10781B.b();
            this.f10760a = 0.0f;
            this.f10783D = false;
            return true;
        }
        if (this.f10782C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            h.p pVarJ = this.f10781B.j(this.f10761b, this.f10760a, j11);
            this.f10781B.g(this.f10782C);
            this.f10782C = Float.MAX_VALUE;
            h.p pVarJ2 = this.f10781B.j(pVarJ.f10775a, pVarJ.f10776b, j11);
            this.f10761b = pVarJ2.f10775a;
            this.f10760a = pVarJ2.f10776b;
        } else {
            h.p pVarJ3 = this.f10781B.j(this.f10761b, this.f10760a, j10);
            this.f10761b = pVarJ3.f10775a;
            this.f10760a = pVarJ3.f10776b;
        }
        float fMax = Math.max(this.f10761b, this.f10767h);
        this.f10761b = fMax;
        float fMin = Math.min(fMax, this.f10766g);
        this.f10761b = fMin;
        if (!r(fMin, this.f10760a)) {
            return false;
        }
        this.f10761b = this.f10781B.b();
        this.f10760a = 0.0f;
        return true;
    }

    public void o(float f10) {
        if (h()) {
            this.f10782C = f10;
            return;
        }
        if (this.f10781B == null) {
            this.f10781B = new n(f10);
        }
        this.f10781B.g(f10);
        l();
    }

    public boolean p() {
        return this.f10781B.f10785b > 0.0d;
    }

    public n q() {
        return this.f10781B;
    }

    boolean r(float f10, float f11) {
        return this.f10781B.e(f10, f11);
    }

    public m t(n nVar) {
        this.f10781B = nVar;
        return this;
    }

    public void u() {
        if (!p()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f10765f) {
            this.f10783D = true;
        }
    }

    public m(k kVar, float f10) {
        super(kVar);
        this.f10781B = null;
        this.f10782C = Float.MAX_VALUE;
        this.f10783D = false;
        this.f10781B = new n(f10);
    }

    public m(Object obj, j jVar) {
        super(obj, jVar);
        this.f10781B = null;
        this.f10782C = Float.MAX_VALUE;
        this.f10783D = false;
    }
}
