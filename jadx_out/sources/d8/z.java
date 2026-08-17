package D8;

import C8.AbstractC0407d0;
import C8.AbstractC0415h0;
import C8.C0438y;
import C8.L;
import C8.M0;
import C8.Q;
import C8.S;
import C8.r0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f851a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f852g = new c("START", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f853h = new C0032a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f854i = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f855j = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ a[] f856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f857l;

        /* JADX INFO: renamed from: D8.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0032a extends a {
            C0032a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // D8.z.a
            public a j(M0 nextType) {
                AbstractC2855l.g(nextType, "nextType");
                return k(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // D8.z.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b j(M0 nextType) {
                AbstractC2855l.g(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // D8.z.a
            public a j(M0 nextType) {
                AbstractC2855l.g(nextType, "nextType");
                return k(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // D8.z.a
            public a j(M0 nextType) {
                AbstractC2855l.g(nextType, "nextType");
                a aVarK = k(nextType);
                return aVarK == a.f853h ? this : aVarK;
            }
        }

        static {
            a[] aVarArrH = h();
            f856k = aVarArrH;
            f857l = AbstractC3083a.a(aVarArrH);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f852g, f853h, f854i, f855j};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f856k.clone();
        }

        public abstract a j(M0 m02);

        protected final a k(M0 m02) {
            AbstractC2855l.g(m02, "<this>");
            if (m02.L0()) {
                return f853h;
            }
            if (m02 instanceof C0438y) {
                ((C0438y) m02).W0();
            }
            return r.f845a.a(m02) ? f855j : f854i;
        }

        private a(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2852i implements Function2 {
        b(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return D.b(z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            return Boolean.valueOf(((z) this.receiver).g(p02, p12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class c extends AbstractC2852i implements Function2 {
        c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return D.b(q.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC2855l.g(p02, "p0");
            AbstractC2855l.g(p12, "p1");
            return Boolean.valueOf(((q) this.receiver).c(p02, p12));
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, Function2 function2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC0407d0 abstractC0407d02 = (AbstractC0407d0) it2.next();
                    if (abstractC0407d02 != abstractC0407d0) {
                        AbstractC2855l.d(abstractC0407d02);
                        AbstractC2855l.d(abstractC0407d0);
                        if (((Boolean) function2.invoke(abstractC0407d02, abstractC0407d0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final AbstractC0407d0 e(Set set) {
        if (set.size() == 1) {
            return (AbstractC0407d0) AbstractC2800q.B0(set);
        }
        new y(set);
        Collection collectionC = c(set, new b(this));
        collectionC.isEmpty();
        AbstractC0407d0 abstractC0407d0B = q8.q.f30880f.b(collectionC);
        if (abstractC0407d0B != null) {
            return abstractC0407d0B;
        }
        Collection collectionC2 = c(collectionC, new c(p.f839b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (AbstractC0407d0) AbstractC2800q.B0(collectionC2) : new Q(set).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + AbstractC2800q.o0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(S s10, S s11) {
        q qVarA = p.f839b.a();
        return qVarA.b(s10, s11) && !qVarA.b(s11, s10);
    }

    public final AbstractC0407d0 d(List types) {
        AbstractC2855l.g(types, "types");
        types.size();
        ArrayList<AbstractC0407d0> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) it.next();
            if (abstractC0407d0.K0() instanceof Q) {
                Collection<S> collectionG = abstractC0407d0.K0().g();
                AbstractC2855l.f(collectionG, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(collectionG, 10));
                for (S s10 : collectionG) {
                    AbstractC2855l.d(s10);
                    AbstractC0407d0 abstractC0407d0D = L.d(s10);
                    if (abstractC0407d0.L0()) {
                        abstractC0407d0D = abstractC0407d0D.O0(true);
                    }
                    arrayList2.add(abstractC0407d0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC0407d0);
            }
        }
        a aVarJ = a.f852g;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarJ = aVarJ.j((M0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC0407d0 abstractC0407d0I : arrayList) {
            if (aVarJ == a.f855j) {
                if (abstractC0407d0I instanceof i) {
                    abstractC0407d0I = AbstractC0415h0.k((i) abstractC0407d0I);
                }
                abstractC0407d0I = AbstractC0415h0.i(abstractC0407d0I, false, 1, null);
            }
            linkedHashSet.add(abstractC0407d0I);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC0407d0) it3.next()).J0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((r0) next).u((r0) it4.next());
        }
        return e(linkedHashSet).Q0((r0) next);
    }
}
