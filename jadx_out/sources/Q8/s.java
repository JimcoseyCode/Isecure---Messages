package q8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.D0;
import C8.N0;
import C8.S;
import C8.V;
import C8.W;
import C8.r0;
import I7.o;
import L7.AbstractC1299y;
import L7.H;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.m0;
import i7.C2750m;
import j7.AbstractC2800q;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30891b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(S argumentType) {
            AbstractC2855l.g(argumentType, "argumentType");
            if (W.a(argumentType)) {
                return null;
            }
            S type = argumentType;
            int i10 = 0;
            while (I7.i.c0(type)) {
                type = ((B0) AbstractC2800q.C0(type.I0())).getType();
                i10++;
            }
            InterfaceC1283h interfaceC1283hP = type.K0().p();
            if (interfaceC1283hP instanceof InterfaceC1280e) {
                k8.b bVarN = AbstractC3340e.n(interfaceC1283hP);
                return bVarN == null ? new s(new b.a(argumentType)) : new s(bVarN, i10);
            }
            if (!(interfaceC1283hP instanceof m0)) {
                return null;
            }
            b.a aVar = k8.b.f29200d;
            k8.c cVarL = o.a.f5185b.l();
            AbstractC2855l.f(cVarL, "toSafe(...)");
            return new s(aVar.c(cVarL), 0);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final S f30892a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(S type) {
                super(null);
                AbstractC2855l.g(type, "type");
                this.f30892a = type;
            }

            public final S a() {
                return this.f30892a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC2855l.b(this.f30892a, ((a) obj).f30892a);
            }

            public int hashCode() {
                return this.f30892a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f30892a + ')';
            }
        }

        /* JADX INFO: renamed from: q8.s$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0350b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f30893a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0350b(f value) {
                super(null);
                AbstractC2855l.g(value, "value");
                this.f30893a = value;
            }

            public final int a() {
                return this.f30893a.c();
            }

            public final k8.b b() {
                return this.f30893a.d();
            }

            public final f c() {
                return this.f30893a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0350b) && AbstractC2855l.b(this.f30893a, ((C0350b) obj).f30893a);
            }

            public int hashCode() {
                return this.f30893a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f30893a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b value) {
        super(value);
        AbstractC2855l.g(value, "value");
    }

    @Override // q8.g
    public S a(H module) {
        AbstractC2855l.g(module, "module");
        r0 r0VarJ = r0.f682h.j();
        InterfaceC1280e interfaceC1280eE = module.n().E();
        AbstractC2855l.f(interfaceC1280eE, "getKClass(...)");
        return V.h(r0VarJ, interfaceC1280eE, AbstractC2800q.e(new D0(c(module))));
    }

    public final S c(H module) {
        AbstractC2855l.g(module, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0350b)) {
            throw new C2750m();
        }
        f fVarC = ((b.C0350b) b()).c();
        k8.b bVarA = fVarC.a();
        int iB = fVarC.b();
        InterfaceC1280e interfaceC1280eB = AbstractC1299y.b(module, bVarA);
        if (interfaceC1280eB == null) {
            return E8.l.d(E8.k.f1225n, bVarA.toString(), String.valueOf(iB));
        }
        AbstractC0407d0 abstractC0407d0R = interfaceC1280eB.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        S sD = H8.d.D(abstractC0407d0R);
        for (int i10 = 0; i10 < iB; i10++) {
            sD = module.n().l(N0.f592k, sD);
        }
        return sD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(f value) {
        this(new b.C0350b(value));
        AbstractC2855l.g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(k8.b classId, int i10) {
        this(new f(classId, i10));
        AbstractC2855l.g(classId, "classId");
    }
}
