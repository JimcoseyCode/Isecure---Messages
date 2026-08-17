package C8;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G8.o f693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0431q f694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayDeque f698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set f699j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {

        /* JADX INFO: renamed from: C8.u0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0024a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f700a;

            @Override // C8.u0.a
            public void a(InterfaceC3487a block) {
                AbstractC2855l.g(block, "block");
                if (this.f700a) {
                    return;
                }
                this.f700a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f700a;
            }
        }

        void a(InterfaceC3487a interfaceC3487a);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f701g = new b("CHECK_ONLY_LOWER", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f702h = new b("CHECK_SUBTYPE_AND_LOWER", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f703i = new b("SKIP_LOWER", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ b[] f704j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f705k;

        static {
            b[] bVarArrH = h();
            f704j = bVarArrH;
            f705k = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f701g, f702h, f703i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f704j.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f706a = new b();

            private b() {
                super(null);
            }

            @Override // C8.u0.c
            public G8.j a(u0 state, G8.i type) {
                AbstractC2855l.g(state, "state");
                AbstractC2855l.g(type, "type");
                return state.j().K(type);
            }
        }

        /* JADX INFO: renamed from: C8.u0$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0025c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0025c f707a = new C0025c();

            private C0025c() {
                super(null);
            }

            @Override // C8.u0.c
            public /* bridge */ /* synthetic */ G8.j a(u0 u0Var, G8.i iVar) {
                return (G8.j) b(u0Var, iVar);
            }

            public Void b(u0 state, G8.i type) {
                AbstractC2855l.g(state, "state");
                AbstractC2855l.g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f708a = new d();

            private d() {
                super(null);
            }

            @Override // C8.u0.c
            public G8.j a(u0 state, G8.i type) {
                AbstractC2855l.g(state, "state");
                AbstractC2855l.g(type, "type");
                return state.j().m0(type);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract G8.j a(u0 u0Var, G8.i iVar);

        private c() {
        }
    }

    public u0(boolean z10, boolean z11, boolean z12, G8.o typeSystemContext, AbstractC0431q kotlinTypePreparator, r kotlinTypeRefiner) {
        AbstractC2855l.g(typeSystemContext, "typeSystemContext");
        AbstractC2855l.g(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f690a = z10;
        this.f691b = z11;
        this.f692c = z12;
        this.f693d = typeSystemContext;
        this.f694e = kotlinTypePreparator;
        this.f695f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(u0 u0Var, G8.i iVar, G8.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(G8.i subType, G8.i superType, boolean z10) {
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f698i;
        AbstractC2855l.d(arrayDeque);
        arrayDeque.clear();
        Set set = this.f699j;
        AbstractC2855l.d(set);
        set.clear();
        this.f697h = false;
    }

    public boolean f(G8.i subType, G8.i superType) {
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return true;
    }

    public b g(G8.j subType, G8.d superType) {
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return b.f702h;
    }

    public final ArrayDeque h() {
        return this.f698i;
    }

    public final Set i() {
        return this.f699j;
    }

    public final G8.o j() {
        return this.f693d;
    }

    public final void k() {
        this.f697h = true;
        if (this.f698i == null) {
            this.f698i = new ArrayDeque(4);
        }
        if (this.f699j == null) {
            this.f699j = M8.l.f7676i.a();
        }
    }

    public final boolean l(G8.i type) {
        AbstractC2855l.g(type, "type");
        return this.f692c && this.f693d.n0(type);
    }

    public final boolean m() {
        return this.f690a;
    }

    public final boolean n() {
        return this.f691b;
    }

    public final G8.i o(G8.i type) {
        AbstractC2855l.g(type, "type");
        return this.f694e.a(type);
    }

    public final G8.i p(G8.i type) {
        AbstractC2855l.g(type, "type");
        return this.f695f.a(type);
    }

    public boolean q(Function1 block) {
        AbstractC2855l.g(block, "block");
        a.C0024a c0024a = new a.C0024a();
        block.invoke(c0024a);
        return c0024a.b();
    }
}
