package J8;

import C8.AbstractC0407d0;
import C8.S;
import J8.f;
import L7.InterfaceC1300z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f6944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6945c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6946d = new a();

        private a() {
            super("Boolean", u.f6942g, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(I7.i iVar) {
            AbstractC2855l.g(iVar, "<this>");
            AbstractC0407d0 abstractC0407d0N = iVar.n();
            AbstractC2855l.f(abstractC0407d0N, "getBooleanType(...)");
            return abstractC0407d0N;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f6947d = new b();

        private b() {
            super("Int", w.f6949g, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(I7.i iVar) {
            AbstractC2855l.g(iVar, "<this>");
            AbstractC0407d0 abstractC0407d0D = iVar.D();
            AbstractC2855l.f(abstractC0407d0D, "getIntType(...)");
            return abstractC0407d0D;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f6948d = new c();

        private c() {
            super("Unit", x.f6950g, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(I7.i iVar) {
            AbstractC2855l.g(iVar, "<this>");
            AbstractC0407d0 abstractC0407d0Z = iVar.Z();
            AbstractC2855l.f(abstractC0407d0Z, "getUnitType(...)");
            return abstractC0407d0Z;
        }
    }

    public /* synthetic */ v(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // J8.f
    public String a() {
        return this.f6945c;
    }

    @Override // J8.f
    public String b(InterfaceC1300z interfaceC1300z) {
        return f.a.a(this, interfaceC1300z);
    }

    @Override // J8.f
    public boolean c(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        return AbstractC2855l.b(functionDescriptor.getReturnType(), this.f6944b.invoke(AbstractC3340e.m(functionDescriptor)));
    }

    private v(String str, Function1 function1) {
        this.f6943a = str;
        this.f6944b = function1;
        this.f6945c = "must return " + str;
    }
}
