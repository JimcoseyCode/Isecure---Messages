package D8;

import C8.S;
import C8.v0;
import L7.H;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends C8.r {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f821a = new a();

        private a() {
        }

        @Override // D8.g
        public InterfaceC1280e b(k8.b classId) {
            AbstractC2855l.g(classId, "classId");
            return null;
        }

        @Override // D8.g
        public InterfaceC3442k c(InterfaceC1280e classDescriptor, InterfaceC3487a compute) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            AbstractC2855l.g(compute, "compute");
            return (InterfaceC3442k) compute.invoke();
        }

        @Override // D8.g
        public boolean d(H moduleDescriptor) {
            AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // D8.g
        public boolean e(v0 typeConstructor) {
            AbstractC2855l.g(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // D8.g
        public Collection g(InterfaceC1280e classDescriptor) {
            AbstractC2855l.g(classDescriptor, "classDescriptor");
            Collection collectionG = classDescriptor.j().g();
            AbstractC2855l.f(collectionG, "getSupertypes(...)");
            return collectionG;
        }

        @Override // C8.r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public S a(G8.i type) {
            AbstractC2855l.g(type, "type");
            return (S) type;
        }

        @Override // D8.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC1280e f(InterfaceC1288m descriptor) {
            AbstractC2855l.g(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC1280e b(k8.b bVar);

    public abstract InterfaceC3442k c(InterfaceC1280e interfaceC1280e, InterfaceC3487a interfaceC3487a);

    public abstract boolean d(H h10);

    public abstract boolean e(v0 v0Var);

    public abstract InterfaceC1283h f(InterfaceC1288m interfaceC1288m);

    public abstract Collection g(InterfaceC1280e interfaceC1280e);

    /* JADX INFO: renamed from: h */
    public abstract S a(G8.i iVar);
}
