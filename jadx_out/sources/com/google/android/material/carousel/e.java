package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f22988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22991f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f22992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22993b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f22995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f22996e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f22994c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22997f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22998g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f22999h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23000i = -1;

        public b(float f10, int i10) {
            this.f22992a = f10;
            this.f22993b = i10;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i10 = this.f22993b;
            if (f15 > i10) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f23000i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f23000i = this.f22994c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f22995d == null) {
                    this.f22995d = cVar;
                    this.f22997f = this.f22994c.size();
                }
                if (this.f22998g != -1 && this.f22994c.size() - this.f22998g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f22995d.f23004d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f22996e = cVar;
                this.f22998g = this.f22994c.size();
            } else {
                if (this.f22995d == null && cVar.f23004d < this.f22999h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f22996e != null && cVar.f23004d > this.f22999h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f22999h = cVar.f23004d;
            this.f22994c.add(cVar);
            return this;
        }

        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public e i() {
            if (this.f22995d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f22994c.size(); i10++) {
                c cVar = (c) this.f22994c.get(i10);
                arrayList.add(new c(j(this.f22995d.f23002b, this.f22992a, this.f22997f, i10), cVar.f23002b, cVar.f23003c, cVar.f23004d, cVar.f23005e, cVar.f23006f, cVar.f23007g, cVar.f23008h));
            }
            return new e(this.f22992a, arrayList, this.f22997f, this.f22998g, this.f22993b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f23001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f23002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f23003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f23004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f23005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f23006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f23007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f23008h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(R4.a.a(cVar.f23001a, cVar2.f23001a, f10), R4.a.a(cVar.f23002b, cVar2.f23002b, f10), R4.a.a(cVar.f23003c, cVar2.f23003c, f10), R4.a.a(cVar.f23004d, cVar2.f23004d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f23001a = f10;
            this.f23002b = f11;
            this.f23003c = f12;
            this.f23004d = f13;
            this.f23005e = z10;
            this.f23006f = f14;
            this.f23007g = f15;
            this.f23008h = f16;
        }
    }

    static e o(e eVar, e eVar2, float f10) {
        if (eVar.g() != eVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = eVar.h();
        List listH2 = eVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            arrayList.add(c.a((c) listH.get(i10), (c) listH2.get(i10), f10));
        }
        return new e(eVar.g(), arrayList, R4.a.c(eVar.c(), eVar2.c(), f10), R4.a.c(eVar.j(), eVar2.j(), f10), eVar.f22991f);
    }

    static e p(e eVar, int i10) {
        b bVar = new b(eVar.g(), i10);
        float f10 = (i10 - eVar.k().f23002b) - (eVar.k().f23004d / 2.0f);
        int size = eVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) eVar.h().get(size);
            bVar.d((cVar.f23004d / 2.0f) + f10, cVar.f23003c, cVar.f23004d, size >= eVar.c() && size <= eVar.j(), cVar.f23005e);
            f10 += cVar.f23004d;
            size--;
        }
        return bVar.i();
    }

    int a() {
        return this.f22991f;
    }

    c b() {
        return (c) this.f22988c.get(this.f22989d);
    }

    int c() {
        return this.f22989d;
    }

    c d() {
        return (c) this.f22988c.get(0);
    }

    c e() {
        for (int i10 = 0; i10 < this.f22988c.size(); i10++) {
            c cVar = (c) this.f22988c.get(i10);
            if (!cVar.f23005e) {
                return cVar;
            }
        }
        return null;
    }

    List f() {
        return this.f22988c.subList(this.f22989d, this.f22990e + 1);
    }

    float g() {
        return this.f22986a;
    }

    List h() {
        return this.f22988c;
    }

    c i() {
        return (c) this.f22988c.get(this.f22990e);
    }

    int j() {
        return this.f22990e;
    }

    c k() {
        return (c) this.f22988c.get(r0.size() - 1);
    }

    c l() {
        for (int size = this.f22988c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f22988c.get(size);
            if (!cVar.f23005e) {
                return cVar;
            }
        }
        return null;
    }

    int m() {
        Iterator it = this.f22988c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f23005e) {
                i10++;
            }
        }
        return this.f22988c.size() - i10;
    }

    int n() {
        return this.f22987b;
    }

    private e(float f10, List list, int i10, int i11, int i12) {
        this.f22986a = f10;
        this.f22988c = Collections.unmodifiableList(list);
        this.f22989d = i10;
        this.f22990e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f23006f == 0.0f) {
                this.f22987b++;
            }
            i10++;
        }
        this.f22991f = i12;
    }
}
