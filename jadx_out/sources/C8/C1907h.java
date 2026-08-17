package c8;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1907h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18988e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1907h f18989f = new C1907h(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1913k f18990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1909i f18991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18993d;

    /* JADX INFO: renamed from: c8.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1907h a() {
            return C1907h.f18989f;
        }

        private a() {
        }
    }

    public C1907h(EnumC1913k enumC1913k, EnumC1909i enumC1909i, boolean z10, boolean z11) {
        this.f18990a = enumC1913k;
        this.f18991b = enumC1909i;
        this.f18992c = z10;
        this.f18993d = z11;
    }

    public static /* synthetic */ C1907h c(C1907h c1907h, EnumC1913k enumC1913k, EnumC1909i enumC1909i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC1913k = c1907h.f18990a;
        }
        if ((i10 & 2) != 0) {
            enumC1909i = c1907h.f18991b;
        }
        if ((i10 & 4) != 0) {
            z10 = c1907h.f18992c;
        }
        if ((i10 & 8) != 0) {
            z11 = c1907h.f18993d;
        }
        return c1907h.b(enumC1913k, enumC1909i, z10, z11);
    }

    public final C1907h b(EnumC1913k enumC1913k, EnumC1909i enumC1909i, boolean z10, boolean z11) {
        return new C1907h(enumC1913k, enumC1909i, z10, z11);
    }

    public final boolean d() {
        return this.f18992c;
    }

    public final EnumC1909i e() {
        return this.f18991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1907h)) {
            return false;
        }
        C1907h c1907h = (C1907h) obj;
        return this.f18990a == c1907h.f18990a && this.f18991b == c1907h.f18991b && this.f18992c == c1907h.f18992c && this.f18993d == c1907h.f18993d;
    }

    public final EnumC1913k f() {
        return this.f18990a;
    }

    public final boolean g() {
        return this.f18993d;
    }

    public int hashCode() {
        EnumC1913k enumC1913k = this.f18990a;
        int iHashCode = (enumC1913k == null ? 0 : enumC1913k.hashCode()) * 31;
        EnumC1909i enumC1909i = this.f18991b;
        return ((((iHashCode + (enumC1909i != null ? enumC1909i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18992c)) * 31) + Boolean.hashCode(this.f18993d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f18990a + ", mutability=" + this.f18991b + ", definitelyNotNull=" + this.f18992c + ", isNullabilityQualifierForWarning=" + this.f18993d + ')';
    }

    public /* synthetic */ C1907h(EnumC1913k enumC1913k, EnumC1909i enumC1909i, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC1913k, enumC1909i, z10, (i10 & 8) != 0 ? false : z11);
    }
}
