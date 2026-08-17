package U7;

import c8.C1915l;
import c8.EnumC1913k;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1915l f11531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f11532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11533c;

    public w(C1915l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC2855l.g(nullabilityQualifier, "nullabilityQualifier");
        AbstractC2855l.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f11531a = nullabilityQualifier;
        this.f11532b = qualifierApplicabilityTypes;
        this.f11533c = z10;
    }

    public static /* synthetic */ w b(w wVar, C1915l c1915l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1915l = wVar.f11531a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f11532b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f11533c;
        }
        return wVar.a(c1915l, collection, z10);
    }

    public final w a(C1915l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC2855l.g(nullabilityQualifier, "nullabilityQualifier");
        AbstractC2855l.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new w(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f11533c;
    }

    public final C1915l d() {
        return this.f11531a;
    }

    public final Collection e() {
        return this.f11532b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC2855l.b(this.f11531a, wVar.f11531a) && AbstractC2855l.b(this.f11532b, wVar.f11532b) && this.f11533c == wVar.f11533c;
    }

    public int hashCode() {
        return (((this.f11531a.hashCode() * 31) + this.f11532b.hashCode()) * 31) + Boolean.hashCode(this.f11533c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f11531a + ", qualifierApplicabilityTypes=" + this.f11532b + ", definitelyNotNull=" + this.f11533c + ')';
    }

    public /* synthetic */ w(C1915l c1915l, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1915l, collection, (i10 & 4) != 0 ? c1915l.c() == EnumC1913k.f19007i : z10);
    }
}
