package i7;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: i7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2756s implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f28732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f28733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f28734i;

    public C2756s(Object obj, Object obj2, Object obj3) {
        this.f28732g = obj;
        this.f28733h = obj2;
        this.f28734i = obj3;
    }

    public final Object a() {
        return this.f28732g;
    }

    public final Object b() {
        return this.f28733h;
    }

    public final Object c() {
        return this.f28734i;
    }

    public final Object d() {
        return this.f28732g;
    }

    public final Object e() {
        return this.f28733h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2756s)) {
            return false;
        }
        C2756s c2756s = (C2756s) obj;
        return AbstractC2855l.b(this.f28732g, c2756s.f28732g) && AbstractC2855l.b(this.f28733h, c2756s.f28733h) && AbstractC2855l.b(this.f28734i, c2756s.f28734i);
    }

    public final Object f() {
        return this.f28734i;
    }

    public int hashCode() {
        Object obj = this.f28732g;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f28733h;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f28734i;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f28732g + ", " + this.f28733h + ", " + this.f28734i + ')';
    }
}
