package d8;

import kotlin.jvm.internal.AbstractC2855l;
import y8.C3647i;
import y8.InterfaceC3648j;

/* JADX INFO: renamed from: d8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2367o implements InterfaceC3648j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2374v f25767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2366n f25768b;

    public C2367o(InterfaceC2374v kotlinClassFinder, C2366n deserializedDescriptorResolver) {
        AbstractC2855l.g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC2855l.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f25767a = kotlinClassFinder;
        this.f25768b = deserializedDescriptorResolver;
    }

    @Override // y8.InterfaceC3648j
    public C3647i a(k8.b classId) {
        AbstractC2855l.g(classId, "classId");
        InterfaceC2376x interfaceC2376xB = AbstractC2375w.b(this.f25767a, classId, M8.c.a(this.f25768b.f().g()));
        if (interfaceC2376xB == null) {
            return null;
        }
        AbstractC2855l.b(interfaceC2376xB.c(), classId);
        return this.f25768b.l(interfaceC2376xB);
    }
}
