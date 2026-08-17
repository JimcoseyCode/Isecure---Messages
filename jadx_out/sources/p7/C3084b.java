package p7;

import j7.AbstractC2787d;
import j7.AbstractC2793j;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: p7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C3084b extends AbstractC2787d implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Enum[] f30667h;

    public C3084b(Enum[] entries) {
        AbstractC2855l.g(entries, "entries");
        this.f30667h = entries;
    }

    private final Object writeReplace() {
        return new C3085c(this.f30667h);
    }

    @Override // j7.AbstractC2785b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return q((Enum) obj);
        }
        return false;
    }

    @Override // j7.AbstractC2787d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return s((Enum) obj);
        }
        return -1;
    }

    @Override // j7.AbstractC2787d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return t((Enum) obj);
        }
        return -1;
    }

    @Override // j7.AbstractC2785b
    public int o() {
        return this.f30667h.length;
    }

    public boolean q(Enum element) {
        AbstractC2855l.g(element, "element");
        return ((Enum) AbstractC2793j.N(this.f30667h, element.ordinal())) == element;
    }

    @Override // j7.AbstractC2787d, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC2787d.f28912g.b(i10, this.f30667h.length);
        return this.f30667h[i10];
    }

    public int s(Enum element) {
        AbstractC2855l.g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC2793j.N(this.f30667h, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int t(Enum element) {
        AbstractC2855l.g(element, "element");
        return indexOf(element);
    }
}
