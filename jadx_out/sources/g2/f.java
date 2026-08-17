package g2;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SoftReference f28123a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SoftReference f28124b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SoftReference f28125c = null;

    public void a() {
        SoftReference softReference = this.f28123a;
        if (softReference != null) {
            softReference.clear();
            this.f28123a = null;
        }
        SoftReference softReference2 = this.f28124b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f28124b = null;
        }
        SoftReference softReference3 = this.f28125c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f28125c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f28123a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f28123a = new SoftReference(obj);
        this.f28124b = new SoftReference(obj);
        this.f28125c = new SoftReference(obj);
    }
}
