package n8;

import C8.B0;
import C8.S;
import L7.EnumC1281f;
import L7.InterfaceC1280e;
import L7.InterfaceC1284i;
import L7.InterfaceC1288m;
import L7.l0;
import L7.t0;
import i7.C2735B;
import i7.C2750m;
import j7.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n8.InterfaceC2987b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f30116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f30117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f30118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f30119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f30120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f30121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f30122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f30123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f30124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f30125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f30126l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: n8.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class C0326a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30127a;

            static {
                int[] iArr = new int[EnumC1281f.values().length];
                try {
                    iArr[EnumC1281f.f7320h.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1281f.f7321i.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1281f.f7322j.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1281f.f7325m.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1281f.f7324l.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1281f.f7323k.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f30127a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InterfaceC1284i classifier) {
            AbstractC2855l.g(classifier, "classifier");
            if (classifier instanceof l0) {
                return "typealias";
            }
            if (!(classifier instanceof InterfaceC1280e)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            InterfaceC1280e interfaceC1280e = (InterfaceC1280e) classifier;
            if (interfaceC1280e.y()) {
                return "companion object";
            }
            switch (C0326a.f30127a[interfaceC1280e.getKind().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new C2750m();
            }
        }

        public final n b(Function1 changeOptions) {
            AbstractC2855l.g(changeOptions, "changeOptions");
            z zVar = new z();
            changeOptions.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30128a = new a();

            private a() {
            }

            @Override // n8.n.b
            public void a(t0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC2855l.g(parameter, "parameter");
                AbstractC2855l.g(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // n8.n.b
            public void b(int i10, StringBuilder builder) {
                AbstractC2855l.g(builder, "builder");
                builder.append("(");
            }

            @Override // n8.n.b
            public void c(int i10, StringBuilder builder) {
                AbstractC2855l.g(builder, "builder");
                builder.append(")");
            }

            @Override // n8.n.b
            public void d(t0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC2855l.g(parameter, "parameter");
                AbstractC2855l.g(builder, "builder");
            }
        }

        void a(t0 t0Var, int i10, int i11, StringBuilder sb);

        void b(int i10, StringBuilder sb);

        void c(int i10, StringBuilder sb);

        void d(t0 t0Var, int i10, int i11, StringBuilder sb);
    }

    static {
        a aVar = new a(null);
        f30115a = aVar;
        f30116b = aVar.b(C2988c.f30104g);
        f30117c = aVar.b(C2990e.f30106g);
        f30118d = aVar.b(C2991f.f30107g);
        f30119e = aVar.b(C2992g.f30108g);
        f30120f = aVar.b(h.f30109g);
        f30121g = aVar.b(i.f30110g);
        f30122h = aVar.b(j.f30111g);
        f30123i = aVar.b(k.f30112g);
        f30124j = aVar.b(l.f30113g);
        f30125k = aVar.b(m.f30114g);
        f30126l = aVar.b(C2989d.f30105g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B A(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.g(false);
        withOptions.d(T.e());
        withOptions.f(InterfaceC2987b.C0325b.f30102a);
        withOptions.r(true);
        withOptions.e(D.f30082i);
        withOptions.l(true);
        withOptions.k(true);
        withOptions.i(true);
        withOptions.c(true);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B B(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.f(InterfaceC2987b.C0325b.f30102a);
        withOptions.e(D.f30081h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B C(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.d(T.e());
        return C2735B.f28704a;
    }

    public static /* synthetic */ String Q(n nVar, M7.c cVar, M7.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nVar.P(cVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B s(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.g(false);
        withOptions.d(T.e());
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B t(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.g(false);
        withOptions.d(T.e());
        withOptions.i(true);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B u(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.g(false);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B v(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.d(T.e());
        withOptions.f(InterfaceC2987b.C0325b.f30102a);
        withOptions.e(D.f30081h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B w(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.j(true);
        withOptions.f(InterfaceC2987b.a.f30101a);
        withOptions.d(v.f30143j);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B x(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.d(v.f30142i);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B y(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.d(v.f30143j);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B z(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.q(F.f30091h);
        withOptions.d(v.f30143j);
        return C2735B.f28704a;
    }

    public abstract String O(InterfaceC1288m interfaceC1288m);

    public abstract String P(M7.c cVar, M7.e eVar);

    public abstract String R(String str, String str2, I7.i iVar);

    public abstract String S(k8.d dVar);

    public abstract String T(k8.f fVar, boolean z10);

    public abstract String U(S s10);

    public abstract String V(B0 b02);

    public final n W(Function1 changeOptions) {
        AbstractC2855l.g(changeOptions, "changeOptions");
        AbstractC2855l.e(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarU = ((u) this).K0().u();
        changeOptions.invoke(zVarU);
        zVarU.q0();
        return new u(zVarU);
    }
}
