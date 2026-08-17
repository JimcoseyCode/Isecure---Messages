package Z;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Z.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1582v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1582v f13483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1582v f13484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1582v f13485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1582v f13486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1582v f13487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1582v f13488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AbstractC1582v f13489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f13490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f13491i;

    /* JADX INFO: renamed from: Z.v$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b extends AbstractC1582v {
        public b() {
            super();
        }

        static b h(int i10, int i11, String str, List list) {
            return new C1571j(i10, i11, str, list);
        }

        abstract int c();

        public abstract String d();

        public int e(int i10) {
            if (i10 == 1) {
                return g();
            }
            if (i10 == 2) {
                return c();
            }
            throw new AssertionError("Unknown quality source: " + i10);
        }

        public abstract List f();

        abstract int g();
    }

    static {
        b bVarH = b.h(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f13483a = bVarH;
        b bVarH2 = b.h(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f13484b = bVarH2;
        b bVarH3 = b.h(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f13485c = bVarH3;
        b bVarH4 = b.h(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f13486d = bVarH4;
        List list = Collections.EMPTY_LIST;
        b bVarH5 = b.h(0, 2000, "LOWEST", list);
        f13487e = bVarH5;
        b bVarH6 = b.h(1, 2001, "HIGHEST", list);
        f13488f = bVarH6;
        f13489g = b.h(-1, -1, "NONE", list);
        f13490h = new HashSet(Arrays.asList(bVarH5, bVarH6, bVarH, bVarH2, bVarH3, bVarH4));
        f13491i = Arrays.asList(bVarH4, bVarH3, bVarH2, bVarH);
    }

    static boolean a(AbstractC1582v abstractC1582v) {
        return f13490h.contains(abstractC1582v);
    }

    public static List b() {
        return new ArrayList(f13491i);
    }

    private AbstractC1582v() {
    }
}
