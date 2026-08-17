package y8;

import L7.h0;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3647i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2710c f34093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f8.c f34094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2708a f34095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f34096d;

    public C3647i(InterfaceC2710c nameResolver, f8.c classProto, AbstractC2708a metadataVersion, h0 sourceElement) {
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(classProto, "classProto");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(sourceElement, "sourceElement");
        this.f34093a = nameResolver;
        this.f34094b = classProto;
        this.f34095c = metadataVersion;
        this.f34096d = sourceElement;
    }

    public final InterfaceC2710c a() {
        return this.f34093a;
    }

    public final f8.c b() {
        return this.f34094b;
    }

    public final AbstractC2708a c() {
        return this.f34095c;
    }

    public final h0 d() {
        return this.f34096d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3647i)) {
            return false;
        }
        C3647i c3647i = (C3647i) obj;
        return AbstractC2855l.b(this.f34093a, c3647i.f34093a) && AbstractC2855l.b(this.f34094b, c3647i.f34094b) && AbstractC2855l.b(this.f34095c, c3647i.f34095c) && AbstractC2855l.b(this.f34096d, c3647i.f34096d);
    }

    public int hashCode() {
        return (((((this.f34093a.hashCode() * 31) + this.f34094b.hashCode()) * 31) + this.f34095c.hashCode()) * 31) + this.f34096d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f34093a + ", classProto=" + this.f34094b + ", metadataVersion=" + this.f34095c + ", sourceElement=" + this.f34096d + ')';
    }
}
