package i7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28737h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28738g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ w(int i10) {
        this.f28738g = i10;
    }

    public static final /* synthetic */ w h(int i10) {
        return new w(i10);
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).q();
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String p(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC2737D.a(q(), ((w) obj).q());
    }

    public boolean equals(Object obj) {
        return k(this.f28738g, obj);
    }

    public int hashCode() {
        return m(this.f28738g);
    }

    public final /* synthetic */ int q() {
        return this.f28738g;
    }

    public String toString() {
        return p(this.f28738g);
    }

    public static int j(int i10) {
        return i10;
    }
}
