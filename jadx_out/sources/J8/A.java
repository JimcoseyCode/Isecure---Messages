package J8;

import J8.f;
import L7.InterfaceC1300z;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6838a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6839b;

        public a(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i10);
            sb.append(" value parameter");
            sb.append(i10 > 1 ? "s" : PointerEventHelper.POINTER_TYPE_UNKNOWN);
            super(sb.toString(), null);
            this.f6839b = i10;
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() >= this.f6839b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6840b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f6840b = i10;
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == this.f6840b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f6841b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f6842b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == 1;
        }
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // J8.f
    public String a() {
        return this.f6838a;
    }

    @Override // J8.f
    public String b(InterfaceC1300z interfaceC1300z) {
        return f.a.a(this, interfaceC1300z);
    }

    private A(String str) {
        this.f6838a = str;
    }
}
