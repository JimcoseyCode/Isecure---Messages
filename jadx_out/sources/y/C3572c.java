package y;

import y.AbstractC3599t;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3572c extends AbstractC3599t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f33775b;

    C3572c(int i10, Throwable th) {
        this.f33774a = i10;
        this.f33775b = th;
    }

    @Override // y.AbstractC3599t.a
    public Throwable c() {
        return this.f33775b;
    }

    @Override // y.AbstractC3599t.a
    public int d() {
        return this.f33774a;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3599t.a) {
            AbstractC3599t.a aVar = (AbstractC3599t.a) obj;
            if (this.f33774a == aVar.d() && ((th = this.f33775b) != null ? th.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f33774a ^ 1000003) * 1000003;
        Throwable th = this.f33775b;
        return i10 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f33774a + ", cause=" + this.f33775b + "}";
    }
}
