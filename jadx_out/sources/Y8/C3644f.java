package y8;

import f8.b;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;
import x8.AbstractC3555a;

/* JADX INFO: renamed from: y8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3644f extends AbstractC3639a implements InterfaceC3643e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3645g f34089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3644f(L7.H module, L7.M notFoundClasses, AbstractC3555a protocol) {
        super(protocol);
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        AbstractC2855l.g(protocol, "protocol");
        this.f34089b = new C3645g(module, notFoundClasses);
    }

    @Override // y8.InterfaceC3646h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public M7.c c(f8.b proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        return this.f34089b.a(proto, nameResolver);
    }

    @Override // y8.InterfaceC3643e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public q8.g l(N container, f8.n proto, C8.S expectedType) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(expectedType, "expectedType");
        return null;
    }

    @Override // y8.InterfaceC3643e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public q8.g g(N container, f8.n proto, C8.S expectedType) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(expectedType, "expectedType");
        b.C0273b.c cVar = (b.C0273b.c) h8.e.a(proto, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f34089b.f(expectedType, cVar, container.b());
    }
}
