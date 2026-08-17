package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends a {
    private final n7.j _context;
    private transient n7.f intercepted;

    public d(n7.f fVar, n7.j jVar) {
        super(fVar);
        this._context = jVar;
    }

    @Override // n7.f
    public n7.j getContext() {
        n7.j jVar = this._context;
        AbstractC2855l.d(jVar);
        return jVar;
    }

    public final n7.f intercepted() {
        n7.f fVarW0 = this.intercepted;
        if (fVarW0 == null) {
            n7.g gVar = (n7.g) getContext().e(n7.g.f30066e);
            if (gVar == null || (fVarW0 = gVar.w0(this)) == null) {
                fVarW0 = this;
            }
            this.intercepted = fVarW0;
        }
        return fVarW0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        n7.f fVar = this.intercepted;
        if (fVar != null && fVar != this) {
            j.b bVarE = getContext().e(n7.g.f30066e);
            AbstractC2855l.d(bVarE);
            ((n7.g) bVarE).A0(fVar);
        }
        this.intercepted = c.f29362g;
    }

    public d(n7.f fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}
