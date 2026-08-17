package C7;

import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f518c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f519d = new q(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f521b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(o type) {
            AbstractC2855l.g(type, "type");
            return new q(r.f524h, type);
        }

        public final q b(o type) {
            AbstractC2855l.g(type, "type");
            return new q(r.f525i, type);
        }

        public final q c() {
            return q.f519d;
        }

        public final q d(o type) {
            AbstractC2855l.g(type, "type");
            return new q(r.f523g, type);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f522a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f523g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f524h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f525i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f522a = iArr;
        }
    }

    public q(r rVar, o oVar) {
        String str;
        this.f520a = rVar;
        this.f521b = oVar;
        if ((rVar == null) == (oVar == null)) {
            return;
        }
        if (rVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + rVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final r a() {
        return this.f520a;
    }

    public final o b() {
        return this.f521b;
    }

    public final o c() {
        return this.f521b;
    }

    public final r d() {
        return this.f520a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f520a == qVar.f520a && AbstractC2855l.b(this.f521b, qVar.f521b);
    }

    public int hashCode() {
        r rVar = this.f520a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        o oVar = this.f521b;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        r rVar = this.f520a;
        int i10 = rVar == null ? -1 : b.f522a[rVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f521b);
        }
        if (i10 == 2) {
            return "in " + this.f521b;
        }
        if (i10 != 3) {
            throw new C2750m();
        }
        return "out " + this.f521b;
    }
}
