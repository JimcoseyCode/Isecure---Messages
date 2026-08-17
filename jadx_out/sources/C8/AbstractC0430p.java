package C8;

import L7.InterfaceC1283h;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.EnumC2749l;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0430p extends AbstractC0435v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.i f675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f676c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C8.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D8.g f677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0430p f679c;

        public a(AbstractC0430p abstractC0430p, D8.g kotlinTypeRefiner) {
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f679c = abstractC0430p;
            this.f677a = kotlinTypeRefiner;
            this.f678b = AbstractC2746i.a(EnumC2749l.f28717h, new C0428o(this, abstractC0430p));
        }

        private final List b() {
            return (List) this.f678b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(a aVar, AbstractC0430p abstractC0430p) {
            return D8.h.b(aVar.f677a, abstractC0430p.g());
        }

        @Override // C8.v0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List g() {
            return b();
        }

        public boolean equals(Object obj) {
            return this.f679c.equals(obj);
        }

        @Override // C8.v0
        public List getParameters() {
            List parameters = this.f679c.getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f679c.hashCode();
        }

        @Override // C8.v0
        public I7.i n() {
            I7.i iVarN = this.f679c.n();
            AbstractC2855l.f(iVarN, "getBuiltIns(...)");
            return iVarN;
        }

        @Override // C8.v0
        public v0 o(D8.g kotlinTypeRefiner) {
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f679c.o(kotlinTypeRefiner);
        }

        @Override // C8.v0
        public InterfaceC1283h p() {
            return this.f679c.p();
        }

        @Override // C8.v0
        public boolean q() {
            return this.f679c.q();
        }

        public String toString() {
            return this.f679c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C8.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection f680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f681b;

        public b(Collection allSupertypes) {
            AbstractC2855l.g(allSupertypes, "allSupertypes");
            this.f680a = allSupertypes;
            this.f681b = AbstractC2800q.e(E8.l.f1253a.l());
        }

        public final Collection a() {
            return this.f680a;
        }

        public final List b() {
            return this.f681b;
        }

        public final void c(List list) {
            AbstractC2855l.g(list, "<set-?>");
            this.f681b = list;
        }
    }

    public AbstractC0430p(B8.n storageManager) {
        AbstractC2855l.g(storageManager, "storageManager");
        this.f675b = storageManager.d(new C0414h(this), C0416i.f652g, new C0418j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(boolean z10) {
        return new b(AbstractC2800q.e(E8.l.f1253a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B B(AbstractC0430p abstractC0430p, b supertypes) {
        AbstractC2855l.g(supertypes, "supertypes");
        Collection collectionA = abstractC0430p.u().a(abstractC0430p, supertypes.a(), new C0420k(abstractC0430p), new C0422l(abstractC0430p));
        if (collectionA.isEmpty()) {
            S sR = abstractC0430p.r();
            collectionA = sR != null ? AbstractC2800q.e(sR) : null;
            if (collectionA == null) {
                collectionA = AbstractC2800q.j();
            }
        }
        if (abstractC0430p.t()) {
            abstractC0430p.u().a(abstractC0430p, collectionA, new C0424m(abstractC0430p), new C0426n(abstractC0430p));
        }
        List listP0 = collectionA instanceof List ? (List) collectionA : null;
        if (listP0 == null) {
            listP0 = AbstractC2800q.P0(collectionA);
        }
        supertypes.c(abstractC0430p.w(listP0));
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable C(AbstractC0430p abstractC0430p, v0 it) {
        AbstractC2855l.g(it, "it");
        return abstractC0430p.l(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B D(AbstractC0430p abstractC0430p, S it) {
        AbstractC2855l.g(it, "it");
        abstractC0430p.y(it);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable E(AbstractC0430p abstractC0430p, v0 it) {
        AbstractC2855l.g(it, "it");
        return abstractC0430p.l(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B F(AbstractC0430p abstractC0430p, S it) {
        AbstractC2855l.g(it, "it");
        abstractC0430p.x(it);
        return C2735B.f28704a;
    }

    private final Collection l(v0 v0Var, boolean z10) {
        List listZ0;
        AbstractC0430p abstractC0430p = v0Var instanceof AbstractC0430p ? (AbstractC0430p) v0Var : null;
        if (abstractC0430p != null && (listZ0 = AbstractC2800q.z0(((b) abstractC0430p.f675b.invoke()).a(), abstractC0430p.s(z10))) != null) {
            return listZ0;
        }
        Collection collectionG = v0Var.g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        return collectionG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b z(AbstractC0430p abstractC0430p) {
        return new b(abstractC0430p.m());
    }

    protected abstract Collection m();

    @Override // C8.v0
    public v0 o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected abstract S r();

    protected Collection s(boolean z10) {
        return AbstractC2800q.j();
    }

    protected boolean t() {
        return this.f676c;
    }

    protected abstract L7.k0 u();

    @Override // C8.v0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List g() {
        return ((b) this.f675b.invoke()).b();
    }

    protected List w(List supertypes) {
        AbstractC2855l.g(supertypes, "supertypes");
        return supertypes;
    }

    protected void x(S type) {
        AbstractC2855l.g(type, "type");
    }

    protected void y(S type) {
        AbstractC2855l.g(type, "type");
    }
}
