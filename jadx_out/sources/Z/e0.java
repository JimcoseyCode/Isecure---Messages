package Z;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f13361a = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements e0 {
        a() {
        }

        @Override // Z.e0
        public Set b() {
            return new HashSet();
        }

        @Override // Z.e0
        public List d(C3563H c3563h) {
            return new ArrayList();
        }
    }

    default b0.i a(Size size, C3563H c3563h) {
        return null;
    }

    Set b();

    default b0.i c(AbstractC1582v abstractC1582v, C3563H c3563h) {
        return null;
    }

    List d(C3563H c3563h);

    default AbstractC1582v e(Size size, C3563H c3563h) {
        return AbstractC1582v.f13489g;
    }
}
