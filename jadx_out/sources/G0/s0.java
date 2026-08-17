package g0;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 extends g0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        s0 a(String str);
    }

    default boolean a(int i10, int i11) {
        if (i(i10, i11)) {
            return true;
        }
        return d() && i(i11, i10);
    }

    int b();

    Range c();

    boolean d();

    Range e(int i10);

    Range f(int i10);

    int g();

    Range h();

    boolean i(int i10, int i11);

    Range j();
}
