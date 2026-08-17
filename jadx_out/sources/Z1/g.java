package z1;

import x1.v;
import z1.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Q1.h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f34198e;

    public g(long j10) {
        super(j10);
    }

    @Override // z1.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // z1.h
    public /* bridge */ /* synthetic */ v c(v1.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // z1.h
    public void d(h.a aVar) {
        this.f34198e = aVar;
    }

    @Override // z1.h
    public /* bridge */ /* synthetic */ v e(v1.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q1.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q1.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(v1.f fVar, v vVar) {
        h.a aVar = this.f34198e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.c(vVar);
    }
}
