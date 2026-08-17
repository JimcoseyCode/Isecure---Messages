package q8;

import C8.AbstractC0407d0;
import C8.D0;
import C8.F0;
import C8.N0;
import C8.S;
import C8.V;
import C8.r0;
import C8.v0;
import L7.H;
import L7.InterfaceC1283h;
import i7.AbstractC2746i;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30880f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f30882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0407d0 f30884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f30885e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: q8.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class EnumC0349a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final EnumC0349a f30886g = new EnumC0349a("COMMON_SUPER_TYPE", 0);

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final EnumC0349a f30887h = new EnumC0349a("INTERSECTION_TYPE", 1);

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ EnumC0349a[] f30888i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f30889j;

            static {
                EnumC0349a[] enumC0349aArrH = h();
                f30888i = enumC0349aArrH;
                f30889j = AbstractC3083a.a(enumC0349aArrH);
            }

            private EnumC0349a(String str, int i10) {
            }

            private static final /* synthetic */ EnumC0349a[] h() {
                return new EnumC0349a[]{f30886g, f30887h};
            }

            public static EnumC0349a valueOf(String str) {
                return (EnumC0349a) Enum.valueOf(EnumC0349a.class, str);
            }

            public static EnumC0349a[] values() {
                return (EnumC0349a[]) f30888i.clone();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30890a;

            static {
                int[] iArr = new int[EnumC0349a.values().length];
                try {
                    iArr[EnumC0349a.f30886g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0349a.f30887h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f30890a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbstractC0407d0 a(Collection collection, EnumC0349a enumC0349a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) it.next();
                next = q.f30880f.c((AbstractC0407d0) next, abstractC0407d0, enumC0349a);
            }
            return (AbstractC0407d0) next;
        }

        private final AbstractC0407d0 c(AbstractC0407d0 abstractC0407d0, AbstractC0407d0 abstractC0407d02, EnumC0349a enumC0349a) {
            if (abstractC0407d0 != null && abstractC0407d02 != null) {
                v0 v0VarK0 = abstractC0407d0.K0();
                v0 v0VarK02 = abstractC0407d02.K0();
                boolean z10 = v0VarK0 instanceof q;
                if (z10 && (v0VarK02 instanceof q)) {
                    return e((q) v0VarK0, (q) v0VarK02, enumC0349a);
                }
                if (z10) {
                    return d((q) v0VarK0, abstractC0407d02);
                }
                if (v0VarK02 instanceof q) {
                    return d((q) v0VarK02, abstractC0407d0);
                }
            }
            return null;
        }

        private final AbstractC0407d0 d(q qVar, AbstractC0407d0 abstractC0407d0) {
            if (qVar.e().contains(abstractC0407d0)) {
                return abstractC0407d0;
            }
            return null;
        }

        private final AbstractC0407d0 e(q qVar, q qVar2, EnumC0349a enumC0349a) {
            Set setK0;
            int i10 = b.f30890a[enumC0349a.ordinal()];
            if (i10 == 1) {
                setK0 = AbstractC2800q.k0(qVar.e(), qVar2.e());
            } else {
                if (i10 != 2) {
                    throw new C2750m();
                }
                setK0 = AbstractC2800q.U0(qVar.e(), qVar2.e());
            }
            return V.f(r0.f682h.j(), new q(qVar.f30881a, qVar.f30882b, setK0, null), false);
        }

        public final AbstractC0407d0 b(Collection types) {
            AbstractC2855l.g(types, "types");
            return a(types, EnumC0349a.f30887h);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, H h10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, h10, set);
    }

    private final List f() {
        return (List) this.f30885e.getValue();
    }

    private final boolean h() {
        Collection collectionA = v.a(this.f30882b);
        if (collectionA != null && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f30883c.contains((S) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(q qVar) {
        AbstractC0407d0 abstractC0407d0R = qVar.n().x().r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        List listP = AbstractC2800q.p(F0.f(abstractC0407d0R, AbstractC2800q.e(new D0(N0.f593l, qVar.f30884d)), null, 2, null));
        if (!qVar.h()) {
            listP.add(qVar.n().L());
        }
        return listP;
    }

    private final String j() {
        return '[' + AbstractC2800q.o0(this.f30883c, ",", null, null, 0, null, p.f30879g, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(S it) {
        AbstractC2855l.g(it, "it");
        return it.toString();
    }

    public final Set e() {
        return this.f30883c;
    }

    @Override // C8.v0
    public Collection g() {
        return f();
    }

    @Override // C8.v0
    public List getParameters() {
        return AbstractC2800q.j();
    }

    @Override // C8.v0
    public I7.i n() {
        return this.f30882b.n();
    }

    @Override // C8.v0
    public v0 o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
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
        return "IntegerLiteralType" + j();
    }

    private q(long j10, H h10, Set set) {
        this.f30884d = V.f(r0.f682h.j(), this, false);
        this.f30885e = AbstractC2746i.b(new o(this));
        this.f30881a = j10;
        this.f30882b = h10;
        this.f30883c = set;
    }
}
