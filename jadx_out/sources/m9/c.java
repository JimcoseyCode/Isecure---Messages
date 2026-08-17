package m9;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t9.k f29794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t9.k f29795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t9.k f29796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t9.k f29797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t9.k f29798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t9.k f29799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f29800j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.k f29802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9.k f29803c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        k.a aVar = t9.k.f32603j;
        f29794d = aVar.g(":");
        f29795e = aVar.g(":status");
        f29796f = aVar.g(":method");
        f29797g = aVar.g(":path");
        f29798h = aVar.g(":scheme");
        f29799i = aVar.g(":authority");
    }

    public c(t9.k name, t9.k value) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(value, "value");
        this.f29802b = name;
        this.f29803c = value;
        this.f29801a = name.E() + 32 + value.E();
    }

    public final t9.k a() {
        return this.f29802b;
    }

    public final t9.k b() {
        return this.f29803c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC2855l.b(this.f29802b, cVar.f29802b) && AbstractC2855l.b(this.f29803c, cVar.f29803c);
    }

    public int hashCode() {
        t9.k kVar = this.f29802b;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        t9.k kVar2 = this.f29803c;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    public String toString() {
        return this.f29802b.I() + ": " + this.f29803c.I();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(value, "value");
        k.a aVar = t9.k.f32603j;
        this(aVar.g(name), aVar.g(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(t9.k name, String value) {
        this(name, t9.k.f32603j.g(value));
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(value, "value");
    }
}
