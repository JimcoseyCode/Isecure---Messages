package Q2;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9080c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9081d = new c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9083b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        int a();

        c b(byte[] bArr, int i10);
    }

    public c(String name, String str) {
        AbstractC2855l.g(name, "name");
        this.f9082a = name;
        this.f9083b = str;
    }

    public final String a() {
        return this.f9082a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC2855l.b(this.f9082a, cVar.f9082a) && AbstractC2855l.b(this.f9083b, cVar.f9083b);
    }

    public int hashCode() {
        int iHashCode = this.f9082a.hashCode() * 31;
        String str = this.f9083b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f9082a;
    }
}
