package s2;

import W2.k;
import Y2.C1533t;
import android.content.Context;
import com.facebook.imagepipeline.request.b;
import f3.InterfaceC2611e;
import j3.C2768b;
import java.util.Set;
import w2.AbstractC3469b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC3469b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1533t f32258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f32259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c2.f f32260v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32261a;

        static {
            int[] iArr = new int[AbstractC3469b.c.values().length];
            f32261a = iArr;
            try {
                iArr[AbstractC3469b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32261a[AbstractC3469b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32261a[AbstractC3469b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, C1533t c1533t, Set set, Set set2) {
        super(context, set, set2);
        this.f32258t = c1533t;
        this.f32259u = hVar;
    }

    public static b.c F(AbstractC3469b.c cVar) {
        int i10 = a.f32261a[cVar.ordinal()];
        if (i10 == 1) {
            return b.c.FULL_FETCH;
        }
        if (i10 == 2) {
            return b.c.DISK_CACHE;
        }
        if (i10 == 3) {
            return b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private W1.d G() {
        com.facebook.imagepipeline.request.b bVar = (com.facebook.imagepipeline.request.b) l();
        k kVarR = this.f32258t.r();
        if (kVarR == null || bVar == null) {
            return null;
        }
        return bVar.getPostprocessor() != null ? kVarR.c(bVar, d()) : kVarR.a(bVar, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3469b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public m2.c g(B2.a aVar, String str, com.facebook.imagepipeline.request.b bVar, Object obj, AbstractC3469b.c cVar) {
        return this.f32258t.m(bVar, obj, F(cVar), I(aVar), str);
    }

    protected InterfaceC2611e I(B2.a aVar) {
        if (aVar instanceof C3321e) {
            return ((C3321e) aVar).q0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3469b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C3321e v() {
        if (C2768b.d()) {
            C2768b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            B2.a aVarN = n();
            String strC = AbstractC3469b.c();
            C3321e c3321eC = aVarN instanceof C3321e ? (C3321e) aVarN : this.f32259u.c();
            c3321eC.s0(w(c3321eC, strC), strC, G(), d(), this.f32260v);
            c3321eC.t0(null, this);
            if (C2768b.d()) {
                C2768b.b();
            }
            return c3321eC;
        } catch (Throwable th) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th;
        }
    }

    public f K(N2.g gVar) {
        return (f) p();
    }
}
