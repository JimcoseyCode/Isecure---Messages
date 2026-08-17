package L7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1280e f7331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D8.g f7333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f7334d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f7330f = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(f0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7329e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(InterfaceC1280e classDescriptor, B8.n storageManager, D8.g kotlinTypeRefinerForOwnerModule, Function1 scopeFactory) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            AbstractC2855l.g(storageManager, "storageManager");
            AbstractC2855l.g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            AbstractC2855l.g(scopeFactory, "scopeFactory");
            return new f0(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private a() {
        }
    }

    public /* synthetic */ f0(InterfaceC1280e interfaceC1280e, B8.n nVar, Function1 function1, D8.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1280e, nVar, function1, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k d(f0 f0Var, D8.g gVar) {
        return (InterfaceC3442k) f0Var.f7332b.invoke(gVar);
    }

    private final InterfaceC3442k e() {
        return (InterfaceC3442k) B8.m.a(this.f7334d, this, f7330f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k f(f0 f0Var) {
        return (InterfaceC3442k) f0Var.f7332b.invoke(f0Var.f7333c);
    }

    public final InterfaceC3442k c(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(AbstractC3340e.s(this.f7331a))) {
            return e();
        }
        C8.v0 v0VarJ = this.f7331a.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(v0VarJ) ? e() : kotlinTypeRefiner.c(this.f7331a, new e0(this, kotlinTypeRefiner));
    }

    private f0(InterfaceC1280e interfaceC1280e, B8.n nVar, Function1 function1, D8.g gVar) {
        this.f7331a = interfaceC1280e;
        this.f7332b = function1;
        this.f7333c = gVar;
        this.f7334d = nVar.e(new d0(this));
    }
}
