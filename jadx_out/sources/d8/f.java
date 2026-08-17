package D8;

import C8.AbstractC0407d0;
import C8.AbstractC0431q;
import C8.B0;
import C8.I;
import C8.L0;
import C8.M0;
import C8.N0;
import C8.Q;
import C8.S;
import C8.V;
import C8.v0;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import p8.C3088c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends AbstractC0431q {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f820a = new a();

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2852i implements Function1 {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return D.b(f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final M0 invoke(G8.i p02) {
            AbstractC2855l.g(p02, "p0");
            return ((f) this.receiver).a(p02);
        }
    }

    private final AbstractC0407d0 c(AbstractC0407d0 abstractC0407d0) {
        S type;
        v0 v0VarK0 = abstractC0407d0.K0();
        Q qR = null;
        m0N0 = null;
        M0 m0N0 = null;
        if (!(v0VarK0 instanceof C3088c)) {
            if (!(v0VarK0 instanceof Q) || !abstractC0407d0.L0()) {
                return abstractC0407d0;
            }
            Q q10 = (Q) v0VarK0;
            Collection collectionG = q10.g();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionG, 10));
            Iterator it = collectionG.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(H8.d.B((S) it.next()));
                z10 = true;
            }
            if (z10) {
                S sH = q10.h();
                qR = new Q(arrayList).r(sH != null ? H8.d.B(sH) : null);
            }
            if (qR != null) {
                q10 = qR;
            }
            return q10.e();
        }
        C3088c c3088c = (C3088c) v0VarK0;
        B0 projection = c3088c.getProjection();
        if (projection.a() != N0.f593l) {
            projection = null;
        }
        if (projection != null && (type = projection.getType()) != null) {
            m0N0 = type.N0();
        }
        M0 m02 = m0N0;
        if (c3088c.b() == null) {
            B0 projection2 = c3088c.getProjection();
            Collection collectionG2 = c3088c.g();
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(collectionG2, 10));
            Iterator it2 = collectionG2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((S) it2.next()).N0());
            }
            c3088c.d(new n(projection2, arrayList2, null, 4, null));
        }
        G8.b bVar = G8.b.f3541g;
        n nVarB = c3088c.b();
        AbstractC2855l.d(nVarB);
        return new i(bVar, nVarB, m02, abstractC0407d0.J0(), abstractC0407d0.L0(), false, 32, null);
    }

    @Override // C8.AbstractC0431q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M0 a(G8.i type) {
        M0 m0E;
        AbstractC2855l.g(type, "type");
        if (!(type instanceof S)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        M0 m0N0 = ((S) type).N0();
        if (m0N0 instanceof AbstractC0407d0) {
            m0E = c((AbstractC0407d0) m0N0);
        } else {
            if (!(m0N0 instanceof I)) {
                throw new C2750m();
            }
            I i10 = (I) m0N0;
            AbstractC0407d0 abstractC0407d0C = c(i10.S0());
            AbstractC0407d0 abstractC0407d0C2 = c(i10.T0());
            m0E = (abstractC0407d0C == i10.S0() && abstractC0407d0C2 == i10.T0()) ? m0N0 : V.e(abstractC0407d0C, abstractC0407d0C2);
        }
        return L0.c(m0E, m0N0, new b(this));
    }
}
