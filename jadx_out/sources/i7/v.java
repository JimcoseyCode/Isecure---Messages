package i7;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28735h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte f28736g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ v(byte b10) {
        this.f28736g = b10;
    }

    public static final /* synthetic */ v h(byte b10) {
        return new v(b10);
    }

    public static boolean k(byte b10, Object obj) {
        return (obj instanceof v) && b10 == ((v) obj).q();
    }

    public static int m(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String p(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC2855l.i(q() & 255, ((v) obj).q() & 255);
    }

    public boolean equals(Object obj) {
        return k(this.f28736g, obj);
    }

    public int hashCode() {
        return m(this.f28736g);
    }

    public final /* synthetic */ byte q() {
        return this.f28736g;
    }

    public String toString() {
        return p(this.f28736g);
    }

    public static byte j(byte b10) {
        return b10;
    }
}
