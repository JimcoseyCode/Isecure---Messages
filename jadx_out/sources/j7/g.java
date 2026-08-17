package J7;

import J7.f;
import P8.q;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6832c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f6833d = new g(AbstractC2800q.m(f.a.f6828e, f.d.f6831e, f.b.f6829e, f.c.f6830e));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6835b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f6833d;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f6836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6837b;

        public b(f kind, int i10) {
            AbstractC2855l.g(kind, "kind");
            this.f6836a = kind;
            this.f6837b = i10;
        }

        public final f a() {
            return this.f6836a;
        }

        public final int b() {
            return this.f6837b;
        }

        public final f c() {
            return this.f6836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2855l.b(this.f6836a, bVar.f6836a) && this.f6837b == bVar.f6837b;
        }

        public int hashCode() {
            return (this.f6836a.hashCode() * 31) + Integer.hashCode(this.f6837b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f6836a + ", arity=" + this.f6837b + ')';
        }
    }

    public g(List kinds) {
        AbstractC2855l.g(kinds, "kinds");
        this.f6834a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            k8.c cVarB = ((f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f6835b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(k8.c packageFqName, String className) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(className, "className");
        b bVarC = c(packageFqName, className);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(k8.c packageFqName, String className) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(className, "className");
        List<f> list = (List) this.f6835b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (q.K(className, fVar.a(), false, 2, null)) {
                String strSubstring = className.substring(fVar.a().length());
                AbstractC2855l.f(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(fVar, numD.intValue());
                }
            }
        }
        return null;
    }
}
