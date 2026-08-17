package A8;

import L7.InterfaceC1288m;
import L7.h0;
import L7.k0;
import O7.AbstractC1323b;
import f8.s;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import y8.AbstractC3638L;
import y8.C3654p;
import y8.X;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends AbstractC1323b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C3654p f129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f8.s f130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C0381a f131s;

    /* JADX WARN: Illegal instructions before constructor call */
    public S(C3654p c10, f8.s proto, int i10) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(proto, "proto");
        B8.n nVarH = c10.h();
        InterfaceC1288m interfaceC1288mE = c10.e();
        M7.h hVarB = M7.h.f7570a.b();
        k8.f fVarB = AbstractC3638L.b(c10.g(), proto.M());
        y8.O o10 = y8.O.f34047a;
        s.c cVarS = proto.S();
        AbstractC2855l.f(cVarS, "getVariance(...)");
        super(nVarH, interfaceC1288mE, hVarB, fVarB, o10.d(cVarS), proto.N(), i10, h0.f7335a, k0.a.f7338a);
        this.f129q = c10;
        this.f130r = proto;
        this.f131s = new C0381a(c10.h(), new Q(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K0(S s10) {
        return AbstractC2800q.P0(s10.f129q.c().d().f(s10.f130r, s10.f129q.g()));
    }

    @Override // O7.AbstractC1329h
    protected List I0() {
        List listS = h8.f.s(this.f130r, this.f129q.j());
        if (listS.isEmpty()) {
            return AbstractC2800q.e(AbstractC3340e.m(this).y());
        }
        X xI = this.f129q.i();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(xI.u((f8.q) it.next()));
        }
        return arrayList;
    }

    @Override // M7.b, M7.a
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C0381a getAnnotations() {
        return this.f131s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.AbstractC1329h
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Void H0(C8.S type) {
        AbstractC2855l.g(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
