package U0;

import U0.c;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements c.InterfaceC0110c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f10760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f10761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f10762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f10763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final U0.j f10764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f10765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f10766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f10767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f10769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f10770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f10771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private U0.c f10772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r f10747n = new g("translationX");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f10748o = new C0111h("translationY");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f10749p = new i("translationZ");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r f10750q = new j(ViewProps.SCALE_X);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f10751r = new k(ViewProps.SCALE_Y);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f10752s = new l(ViewProps.ROTATION);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f10753t = new m("rotationX");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f10754u = new n("rotationY");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f10755v = new o("x");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f10756w = new a("y");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f10757x = new b("z");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final r f10758y = new c("alpha");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final r f10759z = new d("scrollX");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final r f10746A = new e("scrollY");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends r {
        b(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC1658a0.L(view);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC1658a0.D0(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends U0.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U0.k f10773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, U0.k kVar) {
            super(str);
            this.f10773b = kVar;
        }

        @Override // U0.j
        public float a(Object obj) {
            return this.f10773b.a();
        }

        @Override // U0.j
        public void b(Object obj, float f10) {
            this.f10773b.b(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: renamed from: U0.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0111h extends r {
        C0111h(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC1658a0.I(view);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC1658a0.B0(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class o extends r {
        o(String str) {
            super(str, null);
        }

        @Override // U0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // U0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f10775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f10776b;

        p() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface q {
        void a(h hVar, boolean z10, float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class r extends U0.j {
        /* synthetic */ r(String str, g gVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    h(U0.k kVar) {
        this.f10760a = 0.0f;
        this.f10761b = Float.MAX_VALUE;
        this.f10762c = false;
        this.f10765f = false;
        this.f10766g = Float.MAX_VALUE;
        this.f10767h = -Float.MAX_VALUE;
        this.f10768i = 0L;
        this.f10770k = new ArrayList();
        this.f10771l = new ArrayList();
        this.f10763d = null;
        this.f10764e = new f("FloatValueHolder", kVar);
        this.f10769j = 1.0f;
    }

    private void d(boolean z10) {
        this.f10765f = false;
        e().k(this);
        this.f10768i = 0L;
        this.f10762c = false;
        for (int i10 = 0; i10 < this.f10770k.size(); i10++) {
            if (this.f10770k.get(i10) != null) {
                ((q) this.f10770k.get(i10)).a(this, z10, this.f10761b, this.f10760a);
            }
        }
        i(this.f10770k);
    }

    private float f() {
        return this.f10764e.a(this.f10763d);
    }

    private static void i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void m() {
        if (this.f10765f) {
            return;
        }
        this.f10765f = true;
        if (!this.f10762c) {
            this.f10761b = f();
        }
        float f10 = this.f10761b;
        if (f10 > this.f10766g || f10 < this.f10767h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().d(this, 0L);
    }

    @Override // U0.c.InterfaceC0110c
    public boolean a(long j10) {
        long j11 = this.f10768i;
        if (j11 == 0) {
            this.f10768i = j10;
            j(this.f10761b);
            return false;
        }
        long j12 = j10 - j11;
        this.f10768i = j10;
        float fG = e().g();
        boolean zN = n(fG == 0.0f ? 2147483647L : (long) (j12 / fG));
        float fMin = Math.min(this.f10761b, this.f10766g);
        this.f10761b = fMin;
        float fMax = Math.max(fMin, this.f10767h);
        this.f10761b = fMax;
        j(fMax);
        if (zN) {
            d(false);
        }
        return zN;
    }

    public h b(q qVar) {
        if (!this.f10770k.contains(qVar)) {
            this.f10770k.add(qVar);
        }
        return this;
    }

    public void c() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f10765f) {
            d(true);
        }
    }

    public U0.c e() {
        U0.c cVar = this.f10772m;
        return cVar != null ? cVar : U0.c.h();
    }

    float g() {
        return this.f10769j * 0.75f;
    }

    public boolean h() {
        return this.f10765f;
    }

    void j(float f10) {
        this.f10764e.b(this.f10763d, f10);
        for (int i10 = 0; i10 < this.f10771l.size(); i10++) {
            if (this.f10771l.get(i10) != null) {
                android.support.v4.media.session.b.a(this.f10771l.get(i10));
                throw null;
            }
        }
        i(this.f10771l);
    }

    public h k(float f10) {
        this.f10760a = f10;
        return this;
    }

    public void l() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f10765f) {
            return;
        }
        m();
    }

    abstract boolean n(long j10);

    h(Object obj, U0.j jVar) {
        this.f10760a = 0.0f;
        this.f10761b = Float.MAX_VALUE;
        this.f10762c = false;
        this.f10765f = false;
        this.f10766g = Float.MAX_VALUE;
        this.f10767h = -Float.MAX_VALUE;
        this.f10768i = 0L;
        this.f10770k = new ArrayList();
        this.f10771l = new ArrayList();
        this.f10763d = obj;
        this.f10764e = jVar;
        if (jVar != f10752s && jVar != f10753t && jVar != f10754u) {
            if (jVar == f10758y) {
                this.f10769j = 0.00390625f;
                return;
            } else if (jVar != f10750q && jVar != f10751r) {
                this.f10769j = 1.0f;
                return;
            } else {
                this.f10769j = 0.002f;
                return;
            }
        }
        this.f10769j = 0.1f;
    }
}
