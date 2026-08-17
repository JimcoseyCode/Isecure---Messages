package J8;

import J8.f;
import L7.InterfaceC1300z;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6865a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6866b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.a0() != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f6867b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // J8.f
        public boolean c(InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.a0() == null && functionDescriptor.h0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // J8.f
    public String a() {
        return this.f6865a;
    }

    @Override // J8.f
    public String b(InterfaceC1300z interfaceC1300z) {
        return f.a.a(this, interfaceC1300z);
    }

    private k(String str) {
        this.f6865a = str;
    }
}
