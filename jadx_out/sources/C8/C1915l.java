package c8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1915l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1913k f19013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19014b;

    public C1915l(EnumC1913k qualifier, boolean z10) {
        AbstractC2855l.g(qualifier, "qualifier");
        this.f19013a = qualifier;
        this.f19014b = z10;
    }

    public static /* synthetic */ C1915l b(C1915l c1915l, EnumC1913k enumC1913k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC1913k = c1915l.f19013a;
        }
        if ((i10 & 2) != 0) {
            z10 = c1915l.f19014b;
        }
        return c1915l.a(enumC1913k, z10);
    }

    public final C1915l a(EnumC1913k qualifier, boolean z10) {
        AbstractC2855l.g(qualifier, "qualifier");
        return new C1915l(qualifier, z10);
    }

    public final EnumC1913k c() {
        return this.f19013a;
    }

    public final boolean d() {
        return this.f19014b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1915l)) {
            return false;
        }
        C1915l c1915l = (C1915l) obj;
        return this.f19013a == c1915l.f19013a && this.f19014b == c1915l.f19014b;
    }

    public int hashCode() {
        return (this.f19013a.hashCode() * 31) + Boolean.hashCode(this.f19014b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f19013a + ", isForWarningOnly=" + this.f19014b + ')';
    }

    public /* synthetic */ C1915l(EnumC1913k enumC1913k, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC1913k, (i10 & 2) != 0 ? false : z10);
    }
}
