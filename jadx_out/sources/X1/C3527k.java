package x1;

import R1.a;
import android.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import v1.EnumC3417a;
import x1.RunnableC3524h;
import x1.p;
import z1.C3667b;
import z1.InterfaceC3666a;
import z1.h;

/* JADX INFO: renamed from: x1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3527k implements m, h.a, p.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f33377i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f33378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f33379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1.h f33380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f33381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f33382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f33383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f33384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3517a f33385h;

    /* JADX INFO: renamed from: x1.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RunnableC3524h.e f33386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final H0.e f33387b = R1.a.d(150, new C0372a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f33388c;

        /* JADX INFO: renamed from: x1.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0372a implements a.d {
            C0372a() {
            }

            @Override // R1.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RunnableC3524h create() {
                a aVar = a.this;
                return new RunnableC3524h(aVar.f33386a, aVar.f33387b);
            }
        }

        a(RunnableC3524h.e eVar) {
            this.f33386a = eVar;
        }

        RunnableC3524h a(com.bumptech.glide.d dVar, Object obj, n nVar, v1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, AbstractC3526j abstractC3526j, Map map, boolean z10, boolean z11, boolean z12, v1.h hVar, RunnableC3524h.b bVar) {
            RunnableC3524h runnableC3524h = (RunnableC3524h) Q1.k.e((RunnableC3524h) this.f33387b.acquire());
            int i12 = this.f33388c;
            this.f33388c = i12 + 1;
            return runnableC3524h.y(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, abstractC3526j, map, z10, z11, z12, hVar, bVar, i12);
        }
    }

    /* JADX INFO: renamed from: x1.k$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final A1.a f33390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final A1.a f33391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final A1.a f33392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final A1.a f33393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final m f33394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final p.a f33395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final H0.e f33396g = R1.a.d(150, new a());

        /* JADX INFO: renamed from: x1.k$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements a.d {
            a() {
            }

            @Override // R1.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3528l create() {
                b bVar = b.this;
                return new C3528l(bVar.f33390a, bVar.f33391b, bVar.f33392c, bVar.f33393d, bVar.f33394e, bVar.f33395f, bVar.f33396g);
            }
        }

        b(A1.a aVar, A1.a aVar2, A1.a aVar3, A1.a aVar4, m mVar, p.a aVar5) {
            this.f33390a = aVar;
            this.f33391b = aVar2;
            this.f33392c = aVar3;
            this.f33393d = aVar4;
            this.f33394e = mVar;
            this.f33395f = aVar5;
        }

        C3528l a(v1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((C3528l) Q1.k.e((C3528l) this.f33396g.acquire())).k(fVar, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: renamed from: x1.k$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements RunnableC3524h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3666a.InterfaceC0379a f33398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile InterfaceC3666a f33399b;

        c(InterfaceC3666a.InterfaceC0379a interfaceC0379a) {
            this.f33398a = interfaceC0379a;
        }

        @Override // x1.RunnableC3524h.e
        public InterfaceC3666a a() {
            if (this.f33399b == null) {
                synchronized (this) {
                    try {
                        if (this.f33399b == null) {
                            this.f33399b = this.f33398a.build();
                        }
                        if (this.f33399b == null) {
                            this.f33399b = new C3667b();
                        }
                    } finally {
                    }
                }
            }
            return this.f33399b;
        }
    }

    /* JADX INFO: renamed from: x1.k$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3528l f33400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M1.g f33401b;

        d(M1.g gVar, C3528l c3528l) {
            this.f33401b = gVar;
            this.f33400a = c3528l;
        }

        public void a() {
            synchronized (C3527k.this) {
                this.f33400a.r(this.f33401b);
            }
        }
    }

    public C3527k(z1.h hVar, InterfaceC3666a.InterfaceC0379a interfaceC0379a, A1.a aVar, A1.a aVar2, A1.a aVar3, A1.a aVar4, boolean z10) {
        this(hVar, interfaceC0379a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p f(v1.f fVar) {
        v vVarC = this.f33380c.c(fVar);
        if (vVarC == null) {
            return null;
        }
        return vVarC instanceof p ? (p) vVarC : new p(vVarC, true, true, fVar, this);
    }

    private p h(v1.f fVar) {
        p pVarE = this.f33385h.e(fVar);
        if (pVarE != null) {
            pVarE.c();
        }
        return pVarE;
    }

    private p i(v1.f fVar) {
        p pVarF = f(fVar);
        if (pVarF != null) {
            pVarF.c();
            this.f33385h.a(fVar, pVarF);
        }
        return pVarF;
    }

    private p j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p pVarH = h(nVar);
        if (pVarH != null) {
            if (f33377i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return pVarH;
        }
        p pVarI = i(nVar);
        if (pVarI == null) {
            return null;
        }
        if (f33377i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return pVarI;
    }

    private static void k(String str, long j10, v1.f fVar) {
        Q1.g.a(j10);
        Objects.toString(fVar);
    }

    private d m(com.bumptech.glide.d dVar, Object obj, v1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, AbstractC3526j abstractC3526j, Map map, boolean z10, boolean z11, v1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, M1.g gVar2, Executor executor, n nVar, long j10) {
        C3528l c3528lA = this.f33378a.a(nVar, z15);
        if (c3528lA != null) {
            c3528lA.d(gVar2, executor);
            if (f33377i) {
                k("Added to existing load", j10, nVar);
            }
            return new d(gVar2, c3528lA);
        }
        C3528l c3528lA2 = this.f33381d.a(nVar, z12, z13, z14, z15);
        RunnableC3524h runnableC3524hA = this.f33384g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, abstractC3526j, map, z10, z11, z15, hVar, c3528lA2);
        this.f33378a.c(nVar, c3528lA2);
        c3528lA2.d(gVar2, executor);
        c3528lA2.s(runnableC3524hA);
        if (f33377i) {
            k("Started new load", j10, nVar);
        }
        return new d(gVar2, c3528lA2);
    }

    @Override // x1.p.a
    public void a(v1.f fVar, p pVar) {
        this.f33385h.d(fVar);
        if (pVar.e()) {
            this.f33380c.e(fVar, pVar);
        } else {
            this.f33382e.a(pVar, false);
        }
    }

    @Override // x1.m
    public synchronized void b(C3528l c3528l, v1.f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.e()) {
                    this.f33385h.a(fVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33378a.d(fVar, c3528l);
    }

    @Override // z1.h.a
    public void c(v vVar) {
        this.f33382e.a(vVar, true);
    }

    @Override // x1.m
    public synchronized void d(C3528l c3528l, v1.f fVar) {
        this.f33378a.d(fVar, c3528l);
    }

    public void e() {
        this.f33383f.a().clear();
    }

    public d g(com.bumptech.glide.d dVar, Object obj, v1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, AbstractC3526j abstractC3526j, Map map, boolean z10, boolean z11, v1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, M1.g gVar2, Executor executor) {
        long jB = f33377i ? Q1.g.b() : 0L;
        n nVarA = this.f33379b.a(obj, fVar, i10, i11, map, cls, cls2, hVar);
        synchronized (this) {
            try {
                p pVarJ = j(nVarA, z12, jB);
                if (pVarJ == null) {
                    return m(dVar, obj, fVar, i10, i11, cls, cls2, gVar, abstractC3526j, map, z10, z11, hVar, z12, z13, z14, z15, gVar2, executor, nVarA, jB);
                }
                gVar2.b(pVarJ, EnumC3417a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).f();
    }

    C3527k(z1.h hVar, InterfaceC3666a.InterfaceC0379a interfaceC0379a, A1.a aVar, A1.a aVar2, A1.a aVar3, A1.a aVar4, s sVar, o oVar, C3517a c3517a, b bVar, a aVar5, y yVar, boolean z10) {
        this.f33380c = hVar;
        c cVar = new c(interfaceC0379a);
        this.f33383f = cVar;
        C3517a c3517a2 = c3517a == null ? new C3517a(z10) : c3517a;
        this.f33385h = c3517a2;
        c3517a2.f(this);
        this.f33379b = oVar == null ? new o() : oVar;
        this.f33378a = sVar == null ? new s() : sVar;
        this.f33381d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f33384g = aVar5 == null ? new a(cVar) : aVar5;
        this.f33382e = yVar == null ? new y() : yVar;
        hVar.d(this);
    }
}
