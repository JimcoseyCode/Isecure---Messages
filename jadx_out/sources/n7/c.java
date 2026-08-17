package N7;

import L7.InterfaceC1280e;
import L7.g0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8153a = new a();

        private a() {
        }

        @Override // N7.c
        public boolean c(InterfaceC1280e classDescriptor, g0 functionDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8154a = new b();

        private b() {
        }

        @Override // N7.c
        public boolean c(InterfaceC1280e classDescriptor, g0 functionDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().h(d.a());
        }
    }

    boolean c(InterfaceC1280e interfaceC1280e, g0 g0Var);
}
