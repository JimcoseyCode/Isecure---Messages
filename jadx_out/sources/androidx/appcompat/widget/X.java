package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14908b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14909c = androidx.customview.widget.a.INVALID_ID;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14910d = androidx.customview.widget.a.INVALID_ID;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14911e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14912f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14913g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14914h = false;

    X() {
    }

    public int a() {
        return this.f14913g ? this.f14907a : this.f14908b;
    }

    public int b() {
        return this.f14907a;
    }

    public int c() {
        return this.f14908b;
    }

    public int d() {
        return this.f14913g ? this.f14908b : this.f14907a;
    }

    public void e(int i10, int i11) {
        this.f14914h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f14911e = i10;
            this.f14907a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14912f = i11;
            this.f14908b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f14913g) {
            return;
        }
        this.f14913g = z10;
        if (!this.f14914h) {
            this.f14907a = this.f14911e;
            this.f14908b = this.f14912f;
            return;
        }
        if (z10) {
            int i10 = this.f14910d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f14911e;
            }
            this.f14907a = i10;
            int i11 = this.f14909c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f14912f;
            }
            this.f14908b = i11;
            return;
        }
        int i12 = this.f14909c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f14911e;
        }
        this.f14907a = i12;
        int i13 = this.f14910d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f14912f;
        }
        this.f14908b = i13;
    }

    public void g(int i10, int i11) {
        this.f14909c = i10;
        this.f14910d = i11;
        this.f14914h = true;
        if (this.f14913g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14907a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14908b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14907a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14908b = i11;
        }
    }
}
