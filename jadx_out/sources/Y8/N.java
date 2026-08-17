package y8;

import L7.h0;
import f8.c;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2710c f34037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h8.g f34038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f34039c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends N {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f8.c f34040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f34041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final k8.b f34042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c.EnumC0277c f34043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f34044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f34045i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f8.c classProto, InterfaceC2710c nameResolver, h8.g typeTable, h0 h0Var, a aVar) {
            super(nameResolver, typeTable, h0Var, null);
            AbstractC2855l.g(classProto, "classProto");
            AbstractC2855l.g(nameResolver, "nameResolver");
            AbstractC2855l.g(typeTable, "typeTable");
            this.f34040d = classProto;
            this.f34041e = aVar;
            this.f34042f = AbstractC3638L.a(nameResolver, classProto.E0());
            c.EnumC0277c enumC0277c = (c.EnumC0277c) AbstractC2709b.f28536f.d(classProto.D0());
            this.f34043g = enumC0277c == null ? c.EnumC0277c.CLASS : enumC0277c;
            Boolean boolD = AbstractC2709b.f28537g.d(classProto.D0());
            AbstractC2855l.f(boolD, "get(...)");
            this.f34044h = boolD.booleanValue();
            Boolean boolD2 = AbstractC2709b.f28538h.d(classProto.D0());
            AbstractC2855l.f(boolD2, "get(...)");
            this.f34045i = boolD2.booleanValue();
        }

        @Override // y8.N
        public k8.c a() {
            return this.f34042f.a();
        }

        public final k8.b e() {
            return this.f34042f;
        }

        public final f8.c f() {
            return this.f34040d;
        }

        public final c.EnumC0277c g() {
            return this.f34043g;
        }

        public final a h() {
            return this.f34041e;
        }

        public final boolean i() {
            return this.f34044h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends N {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k8.c f34046d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k8.c fqName, InterfaceC2710c nameResolver, h8.g typeTable, h0 h0Var) {
            super(nameResolver, typeTable, h0Var, null);
            AbstractC2855l.g(fqName, "fqName");
            AbstractC2855l.g(nameResolver, "nameResolver");
            AbstractC2855l.g(typeTable, "typeTable");
            this.f34046d = fqName;
        }

        @Override // y8.N
        public k8.c a() {
            return this.f34046d;
        }
    }

    public /* synthetic */ N(InterfaceC2710c interfaceC2710c, h8.g gVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2710c, gVar, h0Var);
    }

    public abstract k8.c a();

    public final InterfaceC2710c b() {
        return this.f34037a;
    }

    public final h0 c() {
        return this.f34039c;
    }

    public final h8.g d() {
        return this.f34038b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private N(InterfaceC2710c interfaceC2710c, h8.g gVar, h0 h0Var) {
        this.f34037a = interfaceC2710c;
        this.f34038b = gVar;
        this.f34039c = h0Var;
    }
}
