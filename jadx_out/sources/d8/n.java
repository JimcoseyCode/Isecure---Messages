package D8;

import C8.B0;
import C8.M0;
import C8.S;
import L7.InterfaceC1283h;
import L7.m0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p8.InterfaceC3087b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements InterfaceC3087b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3487a f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0 f837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f838e;

    public n(B0 projection, InterfaceC3487a interfaceC3487a, n nVar, m0 m0Var) {
        AbstractC2855l.g(projection, "projection");
        this.f834a = projection;
        this.f835b = interfaceC3487a;
        this.f836c = nVar;
        this.f837d = m0Var;
        this.f838e = AbstractC2746i.a(EnumC2749l.f28717h, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(n nVar) {
        InterfaceC3487a interfaceC3487a = nVar.f835b;
        if (interfaceC3487a != null) {
            return (List) interfaceC3487a.invoke();
        }
        return null;
    }

    private final List i() {
        return (List) this.f838e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(n nVar, g gVar) {
        List listG = nVar.g();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listG, 10));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((M0) it.next()).U0(gVar));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2855l.b(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f836c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f836c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // C8.v0
    public List getParameters() {
        return AbstractC2800q.j();
    }

    @Override // p8.InterfaceC3087b
    public B0 getProjection() {
        return this.f834a;
    }

    @Override // C8.v0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List g() {
        List listI = i();
        return listI == null ? AbstractC2800q.j() : listI;
    }

    public int hashCode() {
        n nVar = this.f836c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    public final void j(List supertypes) {
        AbstractC2855l.g(supertypes, "supertypes");
        this.f835b = new l(supertypes);
    }

    @Override // C8.v0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n o(g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = getProjection().o(kotlinTypeRefiner);
        AbstractC2855l.f(b0O, "refine(...)");
        m mVar = this.f835b != null ? new m(this, kotlinTypeRefiner) : null;
        n nVar = this.f836c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(b0O, mVar, nVar, this.f837d);
    }

    @Override // C8.v0
    public I7.i n() {
        S type = getProjection().getType();
        AbstractC2855l.f(type, "getType(...)");
        return H8.d.n(type);
    }

    @Override // C8.v0
    public InterfaceC1283h p() {
        return null;
    }

    @Override // C8.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + getProjection() + ')';
    }

    public /* synthetic */ n(B0 b02, InterfaceC3487a interfaceC3487a, n nVar, m0 m0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? null : interfaceC3487a, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : m0Var);
    }

    public /* synthetic */ n(B0 b02, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(B0 projection, List supertypes, n nVar) {
        this(projection, new k(supertypes), nVar, null, 8, null);
        AbstractC2855l.g(projection, "projection");
        AbstractC2855l.g(supertypes, "supertypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(List list) {
        return list;
    }
}
