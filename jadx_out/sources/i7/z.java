package i7;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28742h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final short f28743g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(short s10) {
        this.f28743g = s10;
    }

    public static final /* synthetic */ z h(short s10) {
        return new z(s10);
    }

    public static boolean k(short s10, Object obj) {
        return (obj instanceof z) && s10 == ((z) obj).q();
    }

    public static int m(short s10) {
        return Short.hashCode(s10);
    }

    public static String p(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC2855l.i(q() & 65535, ((z) obj).q() & 65535);
    }

    public boolean equals(Object obj) {
        return k(this.f28743g, obj);
    }

    public int hashCode() {
        return m(this.f28743g);
    }

    public final /* synthetic */ short q() {
        return this.f28743g;
    }

    public String toString() {
        return p(this.f28743g);
    }

    public static short j(short s10) {
        return s10;
    }
}
