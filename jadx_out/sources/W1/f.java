package W1;

import android.net.Uri;
import c2.k;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f11950a;

    public f(List list) {
        this.f11950a = (List) k.g(list);
    }

    @Override // W1.d
    public boolean a(Uri uri) {
        for (int i10 = 0; i10 < this.f11950a.size(); i10++) {
            if (((d) this.f11950a.get(i10)).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // W1.d
    public boolean b() {
        return false;
    }

    @Override // W1.d
    public String c() {
        return ((d) this.f11950a.get(0)).c();
    }

    public List d() {
        return this.f11950a;
    }

    @Override // W1.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f11950a.equals(((f) obj).f11950a);
        }
        return false;
    }

    @Override // W1.d
    public int hashCode() {
        return this.f11950a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f11950a.toString();
    }
}
