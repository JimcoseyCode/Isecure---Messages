package K7;

import L7.H;
import O7.F;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import p7.AbstractC3083a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends I7.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f7147k = {D.k(new kotlin.jvm.internal.v(D.b(k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f7148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3487a f7149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.i f7150j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f7151g = new a("FROM_DEPENDENCIES", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7152h = new a("FROM_CLASS_LOADER", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f7153i = new a("FALLBACK", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f7154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f7155k;

        static {
            a[] aVarArrH = h();
            f7154j = aVarArrH;
            f7155k = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f7151g, f7152h, f7153i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7154j.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H f7156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7157b;

        public b(H ownerModuleDescriptor, boolean z10) {
            AbstractC2855l.g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f7156a = ownerModuleDescriptor;
            this.f7157b = z10;
        }

        public final H a() {
            return this.f7156a;
        }

        public final boolean b() {
            return this.f7157b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7158a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f7151g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f7152h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f7153i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7158a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(B8.n storageManager, a kind) {
        super(storageManager);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(kind, "kind");
        this.f7148h = kind;
        this.f7150j = storageManager.e(new h(this, storageManager));
        int i10 = c.f7158a[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new C2750m();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I0(k kVar, B8.n nVar) {
        F fR = kVar.r();
        AbstractC2855l.f(fR, "getBuiltInsModule(...)");
        return new u(fR, nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b J0(k kVar) {
        InterfaceC3487a interfaceC3487a = kVar.f7149i;
        if (interfaceC3487a == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) interfaceC3487a.invoke();
        kVar.f7149i = null;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b N0(H h10, boolean z10) {
        return new b(h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // I7.i
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List v() {
        Iterable iterableV = super.v();
        AbstractC2855l.f(iterableV, "getClassDescriptorFactories(...)");
        B8.n nVarU = U();
        AbstractC2855l.f(nVarU, "getStorageManager(...)");
        F fR = r();
        AbstractC2855l.f(fR, "getBuiltInsModule(...)");
        return AbstractC2800q.y0(iterableV, new g(nVarU, fR, null, 4, null));
    }

    public final u L0() {
        return (u) B8.m.a(this.f7150j, this, f7147k[0]);
    }

    @Override // I7.i
    protected N7.c M() {
        return L0();
    }

    public final void M0(H moduleDescriptor, boolean z10) {
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        O0(new i(moduleDescriptor, z10));
    }

    public final void O0(InterfaceC3487a computation) {
        AbstractC2855l.g(computation, "computation");
        this.f7149i = computation;
    }

    @Override // I7.i
    protected N7.a g() {
        return L0();
    }
}
