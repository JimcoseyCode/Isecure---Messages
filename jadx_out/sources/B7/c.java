package B7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends B7.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f404k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c f405l = new c(1, 0);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f405l;
        }

        private a() {
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean contains(int i10) {
        return d() <= i10 && i10 <= o();
    }

    @Override // B7.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return d() == cVar.d() && o() == cVar.o();
    }

    @Override // B7.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + o();
    }

    @Override // B7.a
    public boolean isEmpty() {
        return d() > o();
    }

    public Integer s() {
        return Integer.valueOf(o());
    }

    public Integer t() {
        return Integer.valueOf(d());
    }

    @Override // B7.a
    public String toString() {
        return d() + ".." + o();
    }
}
