package p8;

import B8.f;
import B8.n;
import C8.AbstractC0439z;
import C8.B0;
import C8.D0;
import C8.E0;
import C8.M;
import C8.N0;
import C8.S;
import C8.Y;
import L7.InterfaceC1283h;
import L7.m0;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: p8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3090e {

    /* JADX INFO: renamed from: p8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC0439z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f30677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0 e02, boolean z10) {
            super(e02);
            this.f30677d = z10;
        }

        @Override // C8.E0
        public boolean b() {
            return this.f30677d;
        }

        @Override // C8.AbstractC0439z, C8.E0
        public B0 e(S key) {
            AbstractC2855l.g(key, "key");
            B0 b0E = super.e(key);
            if (b0E == null) {
                return null;
            }
            InterfaceC1283h interfaceC1283hP = key.K0().p();
            return AbstractC3090e.c(b0E, interfaceC1283hP instanceof m0 ? (m0) interfaceC1283hP : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B0 c(B0 b02, m0 m0Var) {
        if (m0Var == null || b02.a() == N0.f592k) {
            return b02;
        }
        if (m0Var.m() != b02.a()) {
            return new D0(e(b02));
        }
        if (!b02.b()) {
            return new D0(b02.getType());
        }
        n NO_LOCKS = f.f411e;
        AbstractC2855l.f(NO_LOCKS, "NO_LOCKS");
        return new D0(new Y(NO_LOCKS, new C3089d(b02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(B0 b02) {
        S type = b02.getType();
        AbstractC2855l.f(type, "getType(...)");
        return type;
    }

    public static final S e(B0 typeProjection) {
        AbstractC2855l.g(typeProjection, "typeProjection");
        return new C3086a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return s10.K0() instanceof InterfaceC3087b;
    }

    public static final E0 g(E0 e02, boolean z10) {
        AbstractC2855l.g(e02, "<this>");
        if (!(e02 instanceof M)) {
            return new a(e02, z10);
        }
        M m10 = (M) e02;
        m0[] m0VarArrJ = m10.j();
        List<Pair> listN0 = AbstractC2793j.N0(m10.i(), m10.j());
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listN0, 10));
        for (Pair pair : listN0) {
            arrayList.add(c((B0) pair.c(), (m0) pair.d()));
        }
        return new M(m0VarArrJ, (B0[]) arrayList.toArray(new B0[0]), z10);
    }

    public static /* synthetic */ E0 h(E0 e02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(e02, z10);
    }
}
