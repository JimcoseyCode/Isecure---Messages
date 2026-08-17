package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f28360m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f28361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f28362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f28363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f28364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f28365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f28366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f28367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f28368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f28369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f28370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f28371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f28372l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C2705a(i12));
    }

    private static b d(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(Q4.k.f9585T4);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(Q4.k.f9593U4, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(Q4.k.f9617X4, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(Q4.k.f9625Y4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(Q4.k.f9609W4, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(Q4.k.f9601V4, i12);
            d dVarM = m(typedArrayObtainStyledAttributes, Q4.k.f9633Z4, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, Q4.k.f9660c5, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, Q4.k.f9669d5, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, Q4.k.f9651b5, dVarM);
            return new b().B(i13, dVarM2).G(i14, dVarM3).w(i15, dVarM4).s(i16, m(typedArrayObtainStyledAttributes, Q4.k.f9642a5, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C2705a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q4.k.f9846z3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9432A3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9440B3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C2705a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f28371k;
    }

    public e i() {
        return this.f28364d;
    }

    public d j() {
        return this.f28368h;
    }

    public e k() {
        return this.f28363c;
    }

    public d l() {
        return this.f28367g;
    }

    public g n() {
        return this.f28372l;
    }

    public g o() {
        return this.f28370j;
    }

    public g p() {
        return this.f28369i;
    }

    public e q() {
        return this.f28361a;
    }

    public d r() {
        return this.f28365e;
    }

    public e s() {
        return this.f28362b;
    }

    public d t() {
        return this.f28366f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f28362b instanceof k) && (this.f28361a instanceof k) && (this.f28363c instanceof k) && (this.f28364d instanceof k);
    }

    public boolean v(RectF rectF) {
        boolean z10 = this.f28372l.getClass().equals(g.class) && this.f28370j.getClass().equals(g.class) && this.f28369i.getClass().equals(g.class) && this.f28371k.getClass().equals(g.class);
        float fA = this.f28365e.a(rectF);
        return z10 && ((this.f28366f.a(rectF) > fA ? 1 : (this.f28366f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f28368h.a(rectF) > fA ? 1 : (this.f28368h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f28367g.a(rectF) > fA ? 1 : (this.f28367g.a(rectF) == fA ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f10) {
        return w().o(f10).m();
    }

    public l y(d dVar) {
        return w().p(dVar).m();
    }

    public l z(c cVar) {
        return w().E(cVar.a(r())).J(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.f28361a = bVar.f28373a;
        this.f28362b = bVar.f28374b;
        this.f28363c = bVar.f28375c;
        this.f28364d = bVar.f28376d;
        this.f28365e = bVar.f28377e;
        this.f28366f = bVar.f28378f;
        this.f28367g = bVar.f28379g;
        this.f28368h = bVar.f28380h;
        this.f28369i = bVar.f28381i;
        this.f28370j = bVar.f28382j;
        this.f28371k = bVar.f28383k;
        this.f28372l = bVar.f28384l;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f28373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f28374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f28375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f28376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f28377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f28378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f28379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f28380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f28381i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f28382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f28383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f28384l;

        public b() {
            this.f28373a = i.b();
            this.f28374b = i.b();
            this.f28375c = i.b();
            this.f28376d = i.b();
            this.f28377e = new C2705a(0.0f);
            this.f28378f = new C2705a(0.0f);
            this.f28379g = new C2705a(0.0f);
            this.f28380h = new C2705a(0.0f);
            this.f28381i = i.c();
            this.f28382j = i.c();
            this.f28383k = i.c();
            this.f28384l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).f28359a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f28297a;
            }
            return -1.0f;
        }

        public b A(int i10, float f10) {
            return C(i.a(i10)).D(f10);
        }

        public b B(int i10, d dVar) {
            return C(i.a(i10)).E(dVar);
        }

        public b C(e eVar) {
            this.f28373a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f10) {
            this.f28377e = new C2705a(f10);
            return this;
        }

        public b E(d dVar) {
            this.f28377e = dVar;
            return this;
        }

        public b F(int i10, float f10) {
            return H(i.a(i10)).I(f10);
        }

        public b G(int i10, d dVar) {
            return H(i.a(i10)).J(dVar);
        }

        public b H(e eVar) {
            this.f28374b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                I(fN);
            }
            return this;
        }

        public b I(float f10) {
            this.f28378f = new C2705a(f10);
            return this;
        }

        public b J(d dVar) {
            this.f28378f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f10) {
            return D(f10).I(f10).y(f10).u(f10);
        }

        public b p(d dVar) {
            return E(dVar).J(dVar).z(dVar).v(dVar);
        }

        public b q(int i10, float f10) {
            return r(i.a(i10)).o(f10);
        }

        public b r(e eVar) {
            return C(eVar).H(eVar).x(eVar).t(eVar);
        }

        public b s(int i10, d dVar) {
            return t(i.a(i10)).v(dVar);
        }

        public b t(e eVar) {
            this.f28376d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        public b u(float f10) {
            this.f28380h = new C2705a(f10);
            return this;
        }

        public b v(d dVar) {
            this.f28380h = dVar;
            return this;
        }

        public b w(int i10, d dVar) {
            return x(i.a(i10)).z(dVar);
        }

        public b x(e eVar) {
            this.f28375c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        public b y(float f10) {
            this.f28379g = new C2705a(f10);
            return this;
        }

        public b z(d dVar) {
            this.f28379g = dVar;
            return this;
        }

        public b(l lVar) {
            this.f28373a = i.b();
            this.f28374b = i.b();
            this.f28375c = i.b();
            this.f28376d = i.b();
            this.f28377e = new C2705a(0.0f);
            this.f28378f = new C2705a(0.0f);
            this.f28379g = new C2705a(0.0f);
            this.f28380h = new C2705a(0.0f);
            this.f28381i = i.c();
            this.f28382j = i.c();
            this.f28383k = i.c();
            this.f28384l = i.c();
            this.f28373a = lVar.f28361a;
            this.f28374b = lVar.f28362b;
            this.f28375c = lVar.f28363c;
            this.f28376d = lVar.f28364d;
            this.f28377e = lVar.f28365e;
            this.f28378f = lVar.f28366f;
            this.f28379g = lVar.f28367g;
            this.f28380h = lVar.f28368h;
            this.f28381i = lVar.f28369i;
            this.f28382j = lVar.f28370j;
            this.f28383k = lVar.f28371k;
            this.f28384l = lVar.f28372l;
        }
    }

    public l() {
        this.f28361a = i.b();
        this.f28362b = i.b();
        this.f28363c = i.b();
        this.f28364d = i.b();
        this.f28365e = new C2705a(0.0f);
        this.f28366f = new C2705a(0.0f);
        this.f28367g = new C2705a(0.0f);
        this.f28368h = new C2705a(0.0f);
        this.f28369i = i.c();
        this.f28370j = i.c();
        this.f28371k = i.c();
        this.f28372l = i.c();
    }
}
