package i7;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2744g implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f28708k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2744g f28709l = C2745h.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f28711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f28713j;

    /* JADX INFO: renamed from: i7.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2744g(int i10, int i11, int i12) {
        this.f28710g = i10;
        this.f28711h = i11;
        this.f28712i = i12;
        this.f28713j = j(i10, i11, i12);
    }

    private final int j(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2744g c2744g = obj instanceof C2744g ? (C2744g) obj : null;
        return c2744g != null && this.f28713j == c2744g.f28713j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2744g other) {
        AbstractC2855l.g(other, "other");
        return this.f28713j - other.f28713j;
    }

    public int hashCode() {
        return this.f28713j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28710g);
        sb.append('.');
        sb.append(this.f28711h);
        sb.append('.');
        sb.append(this.f28712i);
        return sb.toString();
    }

    public C2744g(int i10, int i11) {
        this(i10, i11, 0);
    }
}
