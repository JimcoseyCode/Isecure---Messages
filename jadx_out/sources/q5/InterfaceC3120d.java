package q5;

import java.util.Set;

/* JADX INFO: renamed from: q5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3120d {
    default Object a(Class cls) {
        return e(D.b(cls));
    }

    default Set b(D d10) {
        return (Set) d(d10).get();
    }

    default C5.b c(Class cls) {
        return f(D.b(cls));
    }

    C5.b d(D d10);

    default Object e(D d10) {
        C5.b bVarF = f(d10);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    C5.b f(D d10);

    default Set g(Class cls) {
        return b(D.b(cls));
    }
}
