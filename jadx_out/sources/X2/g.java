package X2;

import java.util.Arrays;
import k2.AbstractC2824b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12444e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12448d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f12445a = i10;
        this.f12446b = i11;
        this.f12447c = f10;
        this.f12448d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12445a == gVar.f12445a && this.f12446b == gVar.f12446b;
    }

    public int hashCode() {
        return AbstractC2824b.a(this.f12445a, this.f12446b);
    }

    public String toString() {
        H h10 = H.f29375a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12445a), Integer.valueOf(this.f12446b)}, 2));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}
