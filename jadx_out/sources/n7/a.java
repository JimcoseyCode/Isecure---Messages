package N7;

import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import java.util.Collection;
import k8.f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: N7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0085a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0085a f8152a = new C0085a();

        private C0085a() {
        }

        @Override // N7.a
        public Collection a(InterfaceC1280e classDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            return AbstractC2800q.j();
        }

        @Override // N7.a
        public Collection b(InterfaceC1280e classDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            return AbstractC2800q.j();
        }

        @Override // N7.a
        public Collection d(InterfaceC1280e classDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            return AbstractC2800q.j();
        }

        @Override // N7.a
        public Collection e(f name, InterfaceC1280e classDescriptor) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            return AbstractC2800q.j();
        }
    }

    Collection a(InterfaceC1280e interfaceC1280e);

    Collection b(InterfaceC1280e interfaceC1280e);

    Collection d(InterfaceC1280e interfaceC1280e);

    Collection e(f fVar, InterfaceC1280e interfaceC1280e);
}
