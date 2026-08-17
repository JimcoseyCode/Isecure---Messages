package Q7;

import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import y8.InterfaceC3660w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements InterfaceC3660w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f9872b = new j();

    private j() {
    }

    @Override // y8.InterfaceC3660w
    public void a(InterfaceC1277b descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // y8.InterfaceC3660w
    public void b(InterfaceC1280e descriptor, List unresolvedSuperClasses) {
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
