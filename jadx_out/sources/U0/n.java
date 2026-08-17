package U0;

import U0.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f10785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f10787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f10788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f10789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f10790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f10791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f10792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h.p f10793j;

    public n() {
        this.f10784a = Math.sqrt(1500.0d);
        this.f10785b = 0.5d;
        this.f10786c = false;
        this.f10792i = Double.MAX_VALUE;
        this.f10793j = new h.p();
    }

    private void d() {
        if (this.f10786c) {
            return;
        }
        if (this.f10792i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f10785b;
        if (d10 > 1.0d) {
            double d11 = this.f10784a;
            this.f10789f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f10785b;
            double d13 = this.f10784a;
            this.f10790g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f10791h = this.f10784a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f10786c = true;
    }

    public float a() {
        return (float) this.f10785b;
    }

    public float b() {
        return (float) this.f10792i;
    }

    public float c() {
        double d10 = this.f10784a;
        return (float) (d10 * d10);
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f10788e && ((double) Math.abs(f10 - b())) < this.f10787d;
    }

    public n f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f10785b = f10;
        this.f10786c = false;
        return this;
    }

    public n g(float f10) {
        this.f10792i = f10;
        return this;
    }

    public n h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f10784a = Math.sqrt(f10);
        this.f10786c = false;
        return this;
    }

    void i(double d10) {
        double dAbs = Math.abs(d10);
        this.f10787d = dAbs;
        this.f10788e = dAbs * 62.5d;
    }

    h.p j(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f10792i;
        double d14 = this.f10785b;
        if (d14 > 1.0d) {
            double d15 = this.f10790g;
            double d16 = this.f10789f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f10789f * d12) * d18);
            double d19 = this.f10790g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f10789f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f10784a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f10784a) * d12);
            double d24 = this.f10784a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f10791h;
            double d26 = this.f10784a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f10791h * d12) * d13) + (Math.sin(this.f10791h * d12) * d27));
            double d28 = this.f10784a;
            double d29 = this.f10785b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f10791h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f10791h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        h.p pVar = this.f10793j;
        pVar.f10775a = (float) (dPow + this.f10792i);
        pVar.f10776b = (float) dCos;
        return pVar;
    }

    public n(float f10) {
        this.f10784a = Math.sqrt(1500.0d);
        this.f10785b = 0.5d;
        this.f10786c = false;
        this.f10792i = Double.MAX_VALUE;
        this.f10793j = new h.p();
        this.f10792i = f10;
    }
}
