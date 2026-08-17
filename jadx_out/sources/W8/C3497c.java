package w8;

import C8.S;
import L7.InterfaceC1276a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: w8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3497c extends AbstractC3495a implements InterfaceC3500f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1276a f33170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.f f33171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497c(InterfaceC1276a declarationDescriptor, S receiverType, k8.f fVar, InterfaceC3501g interfaceC3501g) {
        super(receiverType, interfaceC3501g);
        AbstractC2855l.g(declarationDescriptor, "declarationDescriptor");
        AbstractC2855l.g(receiverType, "receiverType");
        this.f33170c = declarationDescriptor;
        this.f33171d = fVar;
    }

    @Override // w8.InterfaceC3500f
    public k8.f a() {
        return this.f33171d;
    }

    public InterfaceC1276a c() {
        return this.f33170c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
