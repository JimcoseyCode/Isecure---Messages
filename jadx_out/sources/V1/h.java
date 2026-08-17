package v1;

import java.security.MessageDigest;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2892a f32890b = new Q1.b();

    private static void e(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    public Object b(g gVar) {
        return this.f32890b.containsKey(gVar) ? this.f32890b.get(gVar) : gVar.c();
    }

    public void c(h hVar) {
        this.f32890b.g(hVar.f32890b);
    }

    public h d(g gVar, Object obj) {
        this.f32890b.put(gVar, obj);
        return this;
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f32890b.equals(((h) obj).f32890b);
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        return this.f32890b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f32890b + '}';
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f32890b.size(); i10++) {
            e((g) this.f32890b.f(i10), this.f32890b.j(i10), messageDigest);
        }
    }
}
