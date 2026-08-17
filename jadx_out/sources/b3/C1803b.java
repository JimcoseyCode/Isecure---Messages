package b3;

import android.graphics.ColorSpace;
import c2.n;
import d3.k;
import d3.o;
import d3.p;
import g2.AbstractC2662a;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1803b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f18641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f18642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f18643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h3.d f18644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f18645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f18646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f18647g;

    /* JADX INFO: renamed from: b3.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements c {
        a() {
        }

        @Override // b3.c
        public d3.e a(k kVar, int i10, p pVar, X2.d dVar) {
            ColorSpace colorSpaceA;
            Q2.c cVarI = kVar.I();
            if (((Boolean) C1803b.this.f18645e.get()).booleanValue()) {
                colorSpaceA = dVar.f12424k;
                if (colorSpaceA == null) {
                    colorSpaceA = kVar.A();
                }
            } else {
                colorSpaceA = dVar.f12424k;
            }
            ColorSpace colorSpace = colorSpaceA;
            if (cVarI == Q2.b.f9065b) {
                return C1803b.this.f(kVar, i10, pVar, dVar, colorSpace);
            }
            if (cVarI == Q2.b.f9067d) {
                return C1803b.this.e(kVar, i10, pVar, dVar);
            }
            if (cVarI == Q2.b.f9074k) {
                return C1803b.this.d(kVar, i10, pVar, dVar);
            }
            if (cVarI == Q2.b.f9077n) {
                return C1803b.this.h(kVar, i10, pVar, dVar);
            }
            if (cVarI != Q2.c.f9081d) {
                return C1803b.this.g(kVar, dVar);
            }
            throw new C1802a("unknown image format", kVar);
        }
    }

    public C1803b(c cVar, c cVar2, c cVar3, h3.d dVar) {
        this(cVar, cVar2, cVar3, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d3.e h(k kVar, int i10, p pVar, X2.d dVar) {
        c cVar = this.f18643c;
        if (cVar != null) {
            return cVar.a(kVar, i10, pVar, dVar);
        }
        return null;
    }

    @Override // b3.c
    public d3.e a(k kVar, int i10, p pVar, X2.d dVar) {
        InputStream inputStreamJ;
        c cVar;
        c cVar2 = dVar.f12423j;
        if (cVar2 != null) {
            return cVar2.a(kVar, i10, pVar, dVar);
        }
        Q2.c cVarI = kVar.I();
        if ((cVarI == null || cVarI == Q2.c.f9081d) && (inputStreamJ = kVar.J()) != null) {
            cVarI = Q2.e.d(inputStreamJ);
            kVar.M0(cVarI);
        }
        Map map = this.f18647g;
        return (map == null || (cVar = (c) map.get(cVarI)) == null) ? this.f18646f.a(kVar, i10, pVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public d3.e d(k kVar, int i10, p pVar, X2.d dVar) {
        c cVar;
        return (dVar.f12420g || (cVar = this.f18642b) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public d3.e e(k kVar, int i10, p pVar, X2.d dVar) {
        c cVar;
        if (kVar.getWidth() == -1 || kVar.getHeight() == -1) {
            throw new C1802a("image width or height is incorrect", kVar);
        }
        return (dVar.f12420g || (cVar = this.f18641a) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public d3.f f(k kVar, int i10, p pVar, X2.d dVar, ColorSpace colorSpace) {
        AbstractC2662a abstractC2662aA = this.f18644d.a(kVar, dVar.f12421h, null, i10, colorSpace);
        try {
            l3.b.a(null, abstractC2662aA);
            c2.k.g(abstractC2662aA);
            d3.f fVarU = d3.f.u(abstractC2662aA, pVar, kVar.F(), kVar.I0());
            fVarU.J("is_rounded", false);
            return fVarU;
        } finally {
            AbstractC2662a.B(abstractC2662aA);
        }
    }

    public d3.f g(k kVar, X2.d dVar) {
        AbstractC2662a abstractC2662aB = this.f18644d.b(kVar, dVar.f12421h, null, dVar.f12424k);
        try {
            l3.b.a(null, abstractC2662aB);
            c2.k.g(abstractC2662aB);
            d3.f fVarU = d3.f.u(abstractC2662aB, o.f25593d, kVar.F(), kVar.I0());
            fVarU.J("is_rounded", false);
            return fVarU;
        } finally {
            AbstractC2662a.B(abstractC2662aB);
        }
    }

    public C1803b(c cVar, c cVar2, c cVar3, h3.d dVar, Map map) {
        this(cVar, cVar2, cVar3, dVar, map, c2.o.f18800b);
    }

    public C1803b(c cVar, c cVar2, c cVar3, h3.d dVar, Map map, n nVar) {
        this.f18646f = new a();
        this.f18641a = cVar;
        this.f18642b = cVar2;
        this.f18643c = cVar3;
        this.f18644d = dVar;
        this.f18647g = map;
        this.f18645e = nVar;
    }
}
