package s0;

import java.util.ArrayList;
import r0.C3243f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f32141h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f32144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f32145d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f32147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f32148g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32142a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32143b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f32146e = new ArrayList();

    public m(p pVar, int i10) {
        this.f32144c = null;
        this.f32145d = null;
        int i11 = f32141h;
        this.f32147f = i11;
        f32141h = i11 + 1;
        this.f32144c = pVar;
        this.f32145d = pVar;
        this.f32148g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f32117d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f32124k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3315d interfaceC3315d = (InterfaceC3315d) fVar.f32124k.get(i10);
            if (interfaceC3315d instanceof f) {
                f fVar2 = (f) interfaceC3315d;
                if (fVar2.f32117d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f32119f) + j10));
                }
            }
        }
        if (fVar != pVar.f32175i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f32174h, j11)), j11 - ((long) pVar.f32174h.f32119f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f32117d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f32124k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3315d interfaceC3315d = (InterfaceC3315d) fVar.f32124k.get(i10);
            if (interfaceC3315d instanceof f) {
                f fVar2 = (f) interfaceC3315d;
                if (fVar2.f32117d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f32119f) + j10));
                }
            }
        }
        if (fVar != pVar.f32174h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f32175i, j11)), j11 - ((long) pVar.f32175i.f32119f));
    }

    public void a(p pVar) {
        this.f32146e.add(pVar);
        this.f32145d = pVar;
    }

    public long b(C3243f c3243f, int i10) {
        long j10;
        int i11;
        p pVar = this.f32144c;
        if (pVar instanceof C3314c) {
            if (((C3314c) pVar).f32172f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar = (i10 == 0 ? c3243f.f31678e : c3243f.f31680f).f32174h;
        f fVar2 = (i10 == 0 ? c3243f.f31678e : c3243f.f31680f).f32175i;
        boolean zContains = pVar.f32174h.f32125l.contains(fVar);
        boolean zContains2 = this.f32144c.f32175i.f32125l.contains(fVar2);
        long j11 = this.f32144c.j();
        if (zContains && zContains2) {
            long jD = d(this.f32144c.f32174h, 0L);
            long jC = c(this.f32144c.f32175i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f32144c;
            int i12 = pVar2.f32175i.f32119f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f32174h.f32119f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fQ = pVar2.f32168b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f32144c;
            j10 = ((long) pVar3.f32174h.f32119f) + j14;
            i11 = pVar3.f32175i.f32119f;
        } else {
            if (zContains) {
                return Math.max(d(this.f32144c.f32174h, r12.f32119f), ((long) this.f32144c.f32174h.f32119f) + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f32144c.f32175i, r12.f32119f), ((long) (-this.f32144c.f32175i.f32119f)) + j11);
            }
            p pVar4 = this.f32144c;
            j10 = ((long) pVar4.f32174h.f32119f) + pVar4.j();
            i11 = this.f32144c.f32175i.f32119f;
        }
        return j10 - ((long) i11);
    }
}
