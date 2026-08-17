package C8;

import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q implements v0, G8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S f603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f605c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Comparator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f606g;

        public a(Function1 function1) {
            this.f606g = function1;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            S s10 = (S) obj;
            Function1 function1 = this.f606g;
            AbstractC2855l.d(s10);
            String string = function1.invoke(s10).toString();
            S s11 = (S) obj2;
            Function1 function12 = this.f606g;
            AbstractC2855l.d(s11);
            return AbstractC2884a.a(string, function12.invoke(s11).toString());
        }
    }

    public Q(Collection typesToIntersect) {
        AbstractC2855l.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f604b = linkedHashSet;
        this.f605c = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 f(Q q10, D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return q10.o(kotlinTypeRefiner).e();
    }

    public static /* synthetic */ String j(Q q10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = O.f601g;
        }
        return q10.i(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(S it) {
        AbstractC2855l.g(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(Function1 function1, S s10) {
        AbstractC2855l.d(s10);
        return function1.invoke(s10).toString();
    }

    public final InterfaceC3442k d() {
        return v8.x.f33014d.a("member scope for intersection type", this.f604b);
    }

    public final AbstractC0407d0 e() {
        return V.n(r0.f682h.j(), this, AbstractC2800q.j(), false, d(), new P(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return AbstractC2855l.b(this.f604b, ((Q) obj).f604b);
        }
        return false;
    }

    @Override // C8.v0
    public Collection g() {
        return this.f604b;
    }

    @Override // C8.v0
    public List getParameters() {
        return AbstractC2800q.j();
    }

    public final S h() {
        return this.f603a;
    }

    public int hashCode() {
        return this.f605c;
    }

    public final String i(Function1 getProperTypeRelatedToStringify) {
        AbstractC2855l.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return AbstractC2800q.o0(AbstractC2800q.H0(this.f604b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new N(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // C8.v0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Q o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionG = g();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionG, 10));
        Iterator it = collectionG.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).U0(kotlinTypeRefiner));
            z10 = true;
        }
        Q qR = null;
        if (z10) {
            S sH = h();
            qR = new Q(arrayList).r(sH != null ? sH.U0(kotlinTypeRefiner) : null);
        }
        return qR == null ? this : qR;
    }

    @Override // C8.v0
    public I7.i n() {
        I7.i iVarN = ((S) this.f604b.iterator().next()).K0().n();
        AbstractC2855l.f(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    @Override // C8.v0
    public InterfaceC1283h p() {
        return null;
    }

    @Override // C8.v0
    public boolean q() {
        return false;
    }

    public final Q r(S s10) {
        return new Q(this.f604b, s10);
    }

    public String toString() {
        return j(this, null, 1, null);
    }

    private Q(Collection collection, S s10) {
        this(collection);
        this.f603a = s10;
    }
}
