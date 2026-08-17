package s2;

import N2.l;
import W2.x;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c2.i;
import c2.k;
import c2.n;
import c3.InterfaceC1844a;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.drawable.AbstractC1959a;
import com.facebook.drawee.drawable.InterfaceC1961c;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import d2.AbstractC2325a;
import d3.m;
import f3.C2609c;
import f3.InterfaceC2611e;
import g2.AbstractC2662a;
import j3.C2768b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import q2.InterfaceC3111a;
import t2.C3362a;
import v2.AbstractC3419a;
import w2.AbstractC3468a;
import w2.AbstractC3469b;
import x2.C3529a;
import y2.C3610a;

/* JADX INFO: renamed from: s2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3321e extends AbstractC3468a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Class f32244M = C3321e.class;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final InterfaceC1844a f32245A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final c2.f f32246B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final x f32247C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private W1.d f32248D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private n f32249E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f32250F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private c2.f f32251G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private C3362a f32252H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Set f32253I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.facebook.imagepipeline.request.b f32254J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.facebook.imagepipeline.request.b[] f32255K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.facebook.imagepipeline.request.b f32256L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Resources f32257z;

    public C3321e(Resources resources, AbstractC3419a abstractC3419a, InterfaceC1844a interfaceC1844a, InterfaceC1844a interfaceC1844a2, Executor executor, x xVar, c2.f fVar) {
        super(abstractC3419a, executor, null, null);
        this.f32257z = resources;
        this.f32245A = new C3317a(resources, interfaceC1844a, interfaceC1844a2);
        this.f32246B = fVar;
        this.f32247C = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o l0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof InterfaceC1961c) {
            return l0(((InterfaceC1961c) drawable).getDrawable());
        }
        if (drawable instanceof AbstractC1959a) {
            AbstractC1959a abstractC1959a = (AbstractC1959a) drawable;
            int iD = abstractC1959a.d();
            for (int i10 = 0; i10 < iD; i10++) {
                o oVarL0 = l0(abstractC1959a.b(i10));
                if (oVarL0 != null) {
                    return oVarL0;
                }
            }
        }
        return null;
    }

    private void r0(n nVar) {
        this.f32249E = nVar;
        v0(null);
    }

    private Drawable u0(c2.f fVar, d3.e eVar) {
        Drawable drawableA;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            InterfaceC1844a interfaceC1844a = (InterfaceC1844a) it.next();
            if (interfaceC1844a.b(eVar) && (drawableA = interfaceC1844a.a(eVar)) != null) {
                return drawableA;
            }
        }
        return null;
    }

    private void v0(d3.e eVar) {
        if (this.f32250F) {
            if (s() == null) {
                C3529a c3529a = new C3529a();
                k(new C3610a(c3529a));
                b0(c3529a);
            }
            if (s() instanceof C3529a) {
                C0(eVar, (C3529a) s());
            }
        }
    }

    @Override // w2.AbstractC3468a
    protected Uri A() {
        return l.a(this.f32254J, this.f32256L, this.f32255K, com.facebook.imagepipeline.request.b.REQUEST_TO_URI_FN);
    }

    public void A0(c2.f fVar) {
        this.f32251G = fVar;
    }

    public void B0(boolean z10) {
        this.f32250F = z10;
    }

    protected void C0(d3.e eVar, C3529a c3529a) {
        o oVarL0;
        c3529a.j(w());
        B2.b bVarD = d();
        q qVarL = null;
        if (bVarD != null && (oVarL0 = l0(bVarD.e())) != null) {
            qVarL = oVarL0.l();
        }
        c3529a.m(qVarL);
        String strN0 = n0();
        if (strN0 != null) {
            c3529a.b("cc", strN0);
        }
        if (eVar == null) {
            c3529a.i();
        } else {
            c3529a.k(eVar.getWidth(), eVar.getHeight());
            c3529a.l(eVar.l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w2.AbstractC3468a
    protected void Q(Drawable drawable) {
        if (drawable instanceof InterfaceC3111a) {
            ((InterfaceC3111a) drawable).a();
        }
    }

    @Override // w2.AbstractC3468a, B2.a
    public void b(B2.b bVar) {
        super.b(bVar);
        v0(null);
    }

    public synchronized void j0(InterfaceC2611e interfaceC2611e) {
        try {
            if (this.f32253I == null) {
                this.f32253I = new HashSet();
            }
            this.f32253I.add(interfaceC2611e);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public Drawable m(AbstractC2662a abstractC2662a) {
        try {
            if (C2768b.d()) {
                C2768b.a("PipelineDraweeController#createDrawable");
            }
            k.i(AbstractC2662a.d0(abstractC2662a));
            d3.e eVar = (d3.e) abstractC2662a.J();
            v0(eVar);
            Drawable drawableU0 = u0(this.f32251G, eVar);
            if (drawableU0 != null) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                return drawableU0;
            }
            Drawable drawableU02 = u0(this.f32246B, eVar);
            if (drawableU02 != null) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                return drawableU02;
            }
            Drawable drawableA = this.f32245A.a(eVar);
            if (drawableA != null) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + eVar);
        } catch (Throwable th) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public AbstractC2662a o() {
        W1.d dVar;
        if (C2768b.d()) {
            C2768b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f32247C;
            if (xVar != null && (dVar = this.f32248D) != null) {
                AbstractC2662a abstractC2662a = xVar.get(dVar);
                if (abstractC2662a != null && !((d3.e) abstractC2662a.J()).Z().a()) {
                    abstractC2662a.close();
                    return null;
                }
                if (C2768b.d()) {
                    C2768b.b();
                }
                return abstractC2662a;
            }
            if (C2768b.d()) {
                C2768b.b();
            }
            return null;
        } finally {
            if (C2768b.d()) {
                C2768b.b();
            }
        }
    }

    protected String n0() {
        Object objP = p();
        if (objP == null) {
            return null;
        }
        return objP.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public int y(AbstractC2662a abstractC2662a) {
        if (abstractC2662a != null) {
            return abstractC2662a.M();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public m z(AbstractC2662a abstractC2662a) {
        k.i(AbstractC2662a.d0(abstractC2662a));
        return ((d3.e) abstractC2662a.J()).i();
    }

    public synchronized InterfaceC2611e q0() {
        Set set = this.f32253I;
        if (set == null) {
            return null;
        }
        return new C2609c(set);
    }

    public void s0(n nVar, String str, W1.d dVar, Object obj, c2.f fVar) {
        if (C2768b.d()) {
            C2768b.a("PipelineDraweeController#initialize");
        }
        super.E(str, obj);
        r0(nVar);
        this.f32248D = dVar;
        A0(fVar);
        v0(null);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    @Override // w2.AbstractC3468a
    protected m2.c t() {
        if (C2768b.d()) {
            C2768b.a("PipelineDraweeController#getDataSource");
        }
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.y(f32244M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        m2.c cVar = (m2.c) this.f32249E.get();
        if (C2768b.d()) {
            C2768b.b();
        }
        return cVar;
    }

    protected synchronized void t0(N2.g gVar, AbstractC3469b abstractC3469b) {
        try {
            C3362a c3362a = this.f32252H;
            if (c3362a != null) {
                c3362a.f();
            }
            if (gVar != null) {
                if (this.f32252H == null) {
                    this.f32252H = new C3362a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f32252H.c(gVar);
                this.f32252H.g(true);
            }
            this.f32254J = (com.facebook.imagepipeline.request.b) abstractC3469b.l();
            this.f32255K = (com.facebook.imagepipeline.request.b[]) abstractC3469b.k();
            this.f32256L = (com.facebook.imagepipeline.request.b) abstractC3469b.m();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w2.AbstractC3468a
    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.f32249E).toString();
    }

    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Map L(m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void N(String str, AbstractC2662a abstractC2662a) {
        super.N(str, abstractC2662a);
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w2.AbstractC3468a
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void S(AbstractC2662a abstractC2662a) {
        AbstractC2662a.B(abstractC2662a);
    }

    public synchronized void z0(InterfaceC2611e interfaceC2611e) {
        Set set = this.f32253I;
        if (set == null) {
            return;
        }
        set.remove(interfaceC2611e);
    }
}
