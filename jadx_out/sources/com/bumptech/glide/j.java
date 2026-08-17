package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j extends M1.a implements Cloneable {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected static final M1.f f19105U = (M1.f) ((M1.f) ((M1.f) new M1.f().g(AbstractC3526j.f33374c)).R(g.LOW)).a0(true);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Context f19106G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final k f19107H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Class f19108I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final b f19109J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final d f19110K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private l f19111L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Object f19112M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private List f19113N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f19114O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private j f19115P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Float f19116Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f19117R = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f19118S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19119T;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19121b;

        static {
            int[] iArr = new int[g.values().length];
            f19121b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19121b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19121b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19121b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f19120a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19120a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19120a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19120a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19120a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19120a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19120a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19120a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected j(b bVar, k kVar, Class cls, Context context) {
        this.f19109J = bVar;
        this.f19107H = kVar;
        this.f19108I = cls;
        this.f19106G = context;
        this.f19111L = kVar.i(cls);
        this.f19110K = bVar.j();
        p0(kVar.g());
        a(kVar.h());
    }

    private M1.c A0(Object obj, N1.d dVar, M1.e eVar, M1.a aVar, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f19106G;
        d dVar2 = this.f19110K;
        return M1.h.t(context, dVar2, obj, this.f19112M, this.f19108I, aVar, i10, i11, gVar, dVar, eVar, this.f19113N, bVar, dVar2.e(), lVar.b(), executor);
    }

    private M1.c i0(N1.d dVar, M1.e eVar, M1.a aVar, Executor executor) {
        return j0(new Object(), dVar, eVar, null, this.f19111L, aVar.w(), aVar.t(), aVar.r(), aVar, executor);
    }

    private M1.c j0(Object obj, N1.d dVar, M1.e eVar, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, M1.a aVar, Executor executor) {
        com.bumptech.glide.request.a aVar2;
        com.bumptech.glide.request.b bVar2;
        Object obj2;
        N1.d dVar2;
        M1.e eVar2;
        l lVar2;
        g gVar2;
        int i12;
        int i13;
        M1.a aVar3;
        Executor executor2;
        j jVar;
        if (this.f19115P != null) {
            aVar2 = new com.bumptech.glide.request.a(obj, bVar);
            bVar2 = aVar2;
            jVar = this;
            obj2 = obj;
            dVar2 = dVar;
            eVar2 = eVar;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            aVar3 = aVar;
            executor2 = executor;
        } else {
            aVar2 = null;
            bVar2 = bVar;
            obj2 = obj;
            dVar2 = dVar;
            eVar2 = eVar;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            aVar3 = aVar;
            executor2 = executor;
            jVar = this;
        }
        M1.c cVarM0 = jVar.m0(obj2, dVar2, eVar2, bVar2, lVar2, gVar2, i12, i13, aVar3, executor2);
        if (aVar2 == null) {
            return cVarM0;
        }
        int iT = this.f19115P.t();
        int iR = this.f19115P.r();
        if (Q1.l.u(i10, i11) && !this.f19115P.M()) {
            iT = aVar.t();
            iR = aVar.r();
        }
        j jVar2 = this.f19115P;
        com.bumptech.glide.request.a aVar4 = aVar2;
        aVar4.e(cVarM0, jVar2.j0(obj, dVar, eVar, aVar4, jVar2.f19111L, jVar2.w(), iT, iR, this.f19115P, executor));
        return aVar4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private M1.c m0(Object obj, N1.d dVar, M1.e eVar, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, M1.a aVar, Executor executor) {
        j jVar = this.f19114O;
        if (jVar == null) {
            if (this.f19116Q == null) {
                return A0(obj, dVar, eVar, aVar, bVar, lVar, gVar, i10, i11, executor);
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, bVar);
            thumbnailRequestCoordinator.setRequests(A0(obj, dVar, eVar, aVar, thumbnailRequestCoordinator, lVar, gVar, i10, i11, executor), A0(obj, dVar, eVar, aVar.clone().Z(this.f19116Q.floatValue()), thumbnailRequestCoordinator, lVar, o0(gVar), i10, i11, executor));
            return thumbnailRequestCoordinator;
        }
        if (this.f19119T) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l lVar2 = jVar.f19117R ? lVar : jVar.f19111L;
        g gVarW = jVar.H() ? this.f19114O.w() : o0(gVar);
        int iT = this.f19114O.t();
        int iR = this.f19114O.r();
        if (Q1.l.u(i10, i11) && !this.f19114O.M()) {
            iT = aVar.t();
            iR = aVar.r();
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(obj, bVar);
        M1.c cVarA0 = A0(obj, dVar, eVar, aVar, thumbnailRequestCoordinator2, lVar, gVar, i10, i11, executor);
        this.f19119T = true;
        j jVar2 = this.f19114O;
        M1.c cVarJ0 = jVar2.j0(obj, dVar, eVar, thumbnailRequestCoordinator2, lVar2, gVarW, iT, iR, jVar2, executor);
        this.f19119T = false;
        thumbnailRequestCoordinator2.setRequests(cVarA0, cVarJ0);
        return thumbnailRequestCoordinator2;
    }

    private g o0(g gVar) {
        int i10 = a.f19121b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + w());
    }

    private void p0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0((M1.e) it.next());
        }
    }

    private N1.d r0(N1.d dVar, M1.e eVar, M1.a aVar, Executor executor) {
        Q1.k.e(dVar);
        if (!this.f19118S) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        M1.c cVarI0 = i0(dVar, eVar, aVar, executor);
        M1.c request = dVar.getRequest();
        if (cVarI0.isEquivalentTo(request) && !v0(aVar, request)) {
            if (!((M1.c) Q1.k.e(request)).isRunning()) {
                request.begin();
            }
            return dVar;
        }
        this.f19107H.e(dVar);
        dVar.setRequest(cVarI0);
        this.f19107H.p(dVar, cVarI0);
        return dVar;
    }

    private boolean v0(M1.a aVar, M1.c cVar) {
        return !aVar.G() && cVar.isComplete();
    }

    private j z0(Object obj) {
        if (E()) {
            return clone().z0(obj);
        }
        this.f19112M = obj;
        this.f19118S = true;
        return (j) V();
    }

    public M1.b B0() {
        return C0(androidx.customview.widget.a.INVALID_ID, androidx.customview.widget.a.INVALID_ID);
    }

    public M1.b C0(int i10, int i11) {
        M1.d dVar = new M1.d(i10, i11);
        return (M1.b) s0(dVar, dVar, Q1.e.a());
    }

    public j D0(j jVar) {
        if (E()) {
            return clone().D0(jVar);
        }
        this.f19114O = jVar;
        return (j) V();
    }

    @Override // M1.a
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar) && Objects.equals(this.f19108I, jVar.f19108I) && this.f19111L.equals(jVar.f19111L) && Objects.equals(this.f19112M, jVar.f19112M) && Objects.equals(this.f19113N, jVar.f19113N) && Objects.equals(this.f19114O, jVar.f19114O) && Objects.equals(this.f19115P, jVar.f19115P) && Objects.equals(this.f19116Q, jVar.f19116Q) && this.f19117R == jVar.f19117R && this.f19118S == jVar.f19118S) {
                return true;
            }
        }
        return false;
    }

    public j g0(M1.e eVar) {
        if (E()) {
            return clone().g0(eVar);
        }
        if (eVar != null) {
            if (this.f19113N == null) {
                this.f19113N = new ArrayList();
            }
            this.f19113N.add(eVar);
        }
        return (j) V();
    }

    @Override // M1.a
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public j a(M1.a aVar) {
        Q1.k.e(aVar);
        return (j) super.a(aVar);
    }

    @Override // M1.a
    public int hashCode() {
        return Q1.l.q(this.f19118S, Q1.l.q(this.f19117R, Q1.l.p(this.f19116Q, Q1.l.p(this.f19115P, Q1.l.p(this.f19114O, Q1.l.p(this.f19113N, Q1.l.p(this.f19112M, Q1.l.p(this.f19111L, Q1.l.p(this.f19108I, super.hashCode())))))))));
    }

    @Override // M1.a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.f19111L = jVar.f19111L.clone();
        if (jVar.f19113N != null) {
            jVar.f19113N = new ArrayList(jVar.f19113N);
        }
        j jVar2 = jVar.f19114O;
        if (jVar2 != null) {
            jVar.f19114O = jVar2.clone();
        }
        j jVar3 = jVar.f19115P;
        if (jVar3 != null) {
            jVar.f19115P = jVar3.clone();
        }
        return jVar;
    }

    public N1.d q0(N1.d dVar) {
        return s0(dVar, null, Q1.e.b());
    }

    public N1.d s0(N1.d dVar, M1.e eVar, Executor executor) {
        return r0(dVar, eVar, this, executor);
    }

    public j w0(M1.e eVar) {
        if (E()) {
            return clone().w0(eVar);
        }
        this.f19113N = null;
        return g0(eVar);
    }

    public j x0(Object obj) {
        return z0(obj);
    }

    public j y0(String str) {
        return z0(str);
    }
}
