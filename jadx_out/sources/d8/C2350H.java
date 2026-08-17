package d8;

import C8.S;
import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2350H implements InterfaceC2349G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2350H f25683a = new C2350H();

    private C2350H() {
    }

    @Override // d8.InterfaceC2349G
    public S b(Collection types) {
        AbstractC2855l.g(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC2800q.o0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // d8.InterfaceC2349G
    public String c(InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // d8.InterfaceC2349G
    public S d(S kotlinType) {
        AbstractC2855l.g(kotlinType, "kotlinType");
        return null;
    }

    @Override // d8.InterfaceC2349G
    public String e(InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // d8.InterfaceC2349G
    public void f(S kotlinType, InterfaceC1280e descriptor) {
        AbstractC2855l.g(kotlinType, "kotlinType");
        AbstractC2855l.g(descriptor, "descriptor");
    }

    @Override // d8.InterfaceC2349G
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2371s a(InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        return null;
    }
}
