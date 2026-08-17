package S2;

import T2.d;
import android.graphics.Bitmap;
import d3.f;
import d3.k;
import d3.o;
import f2.h;
import g2.AbstractC2662a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static c f10254e = g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static c f10255f = g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2.b f10256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V2.d f10257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10259d;

    public e(T2.b bVar, V2.d dVar, boolean z10) {
        this(bVar, dVar, z10, true);
    }

    private AbstractC2662a c(int i10, int i11, Bitmap.Config config) {
        AbstractC2662a abstractC2662aD = this.f10257b.d(i10, i11, config);
        ((Bitmap) abstractC2662aD.J()).eraseColor(0);
        ((Bitmap) abstractC2662aD.J()).setHasAlpha(true);
        return abstractC2662aD;
    }

    private AbstractC2662a d(R2.c cVar, Bitmap.Config config, int i10) {
        AbstractC2662a abstractC2662aC = c(cVar.getWidth(), cVar.getHeight(), config);
        new T2.d(this.f10256a.a(R2.e.b(cVar), null), this.f10258c, new a()).h(i10, (Bitmap) abstractC2662aC.J());
        return abstractC2662aC;
    }

    private List e(R2.c cVar, Bitmap.Config config) {
        R2.a aVarA = this.f10256a.a(R2.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(aVarA.a());
        T2.d dVar = new T2.d(aVarA, this.f10258c, new b(arrayList));
        for (int i10 = 0; i10 < aVarA.a(); i10++) {
            AbstractC2662a abstractC2662aC = c(aVarA.getWidth(), aVarA.getHeight(), config);
            dVar.h(i10, (Bitmap) abstractC2662aC.J());
            arrayList.add(abstractC2662aC);
        }
        return arrayList;
    }

    private d3.e f(String str, X2.d dVar, R2.c cVar, Bitmap.Config config) throws Throwable {
        List listE;
        AbstractC2662a abstractC2662aD;
        AbstractC2662a abstractC2662a = null;
        try {
            int iA = dVar.f12417d ? cVar.a() - 1 : 0;
            if (dVar.f12420g) {
                f fVarF0 = f.f0(d(cVar, config, iA), o.f25593d, 0);
                AbstractC2662a.B(null);
                AbstractC2662a.I(null);
                return fVarF0;
            }
            if (dVar.f12419f) {
                listE = e(cVar, config);
                try {
                    abstractC2662aD = AbstractC2662a.r((AbstractC2662a) listE.get(iA));
                } catch (Throwable th) {
                    th = th;
                    AbstractC2662a.B(abstractC2662a);
                    AbstractC2662a.I(listE);
                    throw th;
                }
            } else {
                listE = null;
                abstractC2662aD = null;
            }
            try {
                if (dVar.f12416c && abstractC2662aD == null) {
                    abstractC2662aD = d(cVar, config, iA);
                }
                d3.c cVar2 = new d3.c(R2.e.f(cVar).k(abstractC2662aD).j(iA).i(listE).h(null).l(str).a(), this.f10259d);
                AbstractC2662a.B(abstractC2662aD);
                AbstractC2662a.I(listE);
                return cVar2;
            } catch (Throwable th2) {
                th = th2;
                abstractC2662a = abstractC2662aD;
                AbstractC2662a.B(abstractC2662a);
                AbstractC2662a.I(listE);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            listE = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // S2.d
    public d3.e a(k kVar, X2.d dVar, Bitmap.Config config) {
        if (f10255f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        AbstractC2662a abstractC2662aR = kVar.r();
        c2.k.g(abstractC2662aR);
        try {
            h hVar = (h) abstractC2662aR.J();
            d3.e eVarF = f(kVar.d0(), dVar, hVar.a() != null ? f10255f.d(hVar.a(), dVar) : f10255f.e(hVar.j(), hVar.size(), dVar), config);
            AbstractC2662a.B(abstractC2662aR);
            return eVarF;
        } catch (Throwable th) {
            AbstractC2662a.B(abstractC2662aR);
            throw th;
        }
    }

    @Override // S2.d
    public d3.e b(k kVar, X2.d dVar, Bitmap.Config config) {
        if (f10254e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        AbstractC2662a abstractC2662aR = kVar.r();
        c2.k.g(abstractC2662aR);
        try {
            h hVar = (h) abstractC2662aR.J();
            d3.e eVarF = f(kVar.d0(), dVar, hVar.a() != null ? f10254e.d(hVar.a(), dVar) : f10254e.e(hVar.j(), hVar.size(), dVar), config);
            AbstractC2662a.B(abstractC2662aR);
            return eVarF;
        } catch (Throwable th) {
            AbstractC2662a.B(abstractC2662aR);
            throw th;
        }
    }

    public e(T2.b bVar, V2.d dVar, boolean z10, boolean z11) {
        this.f10256a = bVar;
        this.f10257b = dVar;
        this.f10258c = z10;
        this.f10259d = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements d.b {
        a() {
        }

        @Override // T2.d.b
        public AbstractC2662a b(int i10) {
            return null;
        }

        @Override // T2.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f10261a;

        b(List list) {
            this.f10261a = list;
        }

        @Override // T2.d.b
        public AbstractC2662a b(int i10) {
            return AbstractC2662a.r((AbstractC2662a) this.f10261a.get(i10));
        }

        @Override // T2.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }
}
