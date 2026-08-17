package k8;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29200d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f29202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29203c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String string, boolean z10) {
            String strE;
            String str;
            AbstractC2855l.g(string, "string");
            int iC0 = q.c0(string, '`', 0, false, 6, null);
            if (iC0 == -1) {
                iC0 = string.length();
            }
            int iJ0 = q.j0(string, "/", iC0, false, 4, null);
            if (iJ0 == -1) {
                strE = q.E(string, "`", PointerEventHelper.POINTER_TYPE_UNKNOWN, false, 4, null);
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            } else {
                String strSubstring = string.substring(0, iJ0);
                AbstractC2855l.f(strSubstring, "substring(...)");
                String strD = q.D(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iJ0 + 1);
                AbstractC2855l.f(strSubstring2, "substring(...)");
                strE = q.E(strSubstring2, "`", PointerEventHelper.POINTER_TYPE_UNKNOWN, false, 4, null);
                str = strD;
            }
            return new b(new c(str), new c(strE), z10);
        }

        public final b c(c topLevelFqName) {
            AbstractC2855l.g(topLevelFqName, "topLevelFqName");
            c cVarE = topLevelFqName.e();
            AbstractC2855l.f(cVarE, "parent(...)");
            f fVarG = topLevelFqName.g();
            AbstractC2855l.f(fVarG, "shortName(...)");
            return new b(cVarE, fVarG);
        }

        private a() {
        }
    }

    public b(c packageFqName, c relativeClassName, boolean z10) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(relativeClassName, "relativeClassName");
        this.f29201a = packageFqName;
        this.f29202b = relativeClassName;
        this.f29203c = z10;
        relativeClassName.d();
    }

    private static final String c(c cVar) {
        String strB = cVar.b();
        AbstractC2855l.f(strB, "asString(...)");
        if (!q.P(strB, '/', false, 2, null)) {
            return strB;
        }
        return '`' + strB + '`';
    }

    public static final b k(c cVar) {
        return f29200d.c(cVar);
    }

    public final c a() {
        if (this.f29201a.d()) {
            return this.f29202b;
        }
        return new c(this.f29201a.b() + '.' + this.f29202b.b());
    }

    public final String b() {
        if (this.f29201a.d()) {
            return c(this.f29202b);
        }
        StringBuilder sb = new StringBuilder();
        String strB = this.f29201a.b();
        AbstractC2855l.f(strB, "asString(...)");
        sb.append(q.D(strB, '.', '/', false, 4, null));
        sb.append("/");
        sb.append(c(this.f29202b));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final b d(f name) {
        AbstractC2855l.g(name, "name");
        c cVar = this.f29201a;
        c cVarC = this.f29202b.c(name);
        AbstractC2855l.f(cVarC, "child(...)");
        return new b(cVar, cVarC, this.f29203c);
    }

    public final b e() {
        c cVarE = this.f29202b.e();
        AbstractC2855l.f(cVarE, "parent(...)");
        if (cVarE.d()) {
            return null;
        }
        return new b(this.f29201a, cVarE, this.f29203c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC2855l.b(this.f29201a, bVar.f29201a) && AbstractC2855l.b(this.f29202b, bVar.f29202b) && this.f29203c == bVar.f29203c;
    }

    public final c f() {
        return this.f29201a;
    }

    public final c g() {
        return this.f29202b;
    }

    public final f h() {
        f fVarG = this.f29202b.g();
        AbstractC2855l.f(fVarG, "shortName(...)");
        return fVarG;
    }

    public int hashCode() {
        return (((this.f29201a.hashCode() * 31) + this.f29202b.hashCode()) * 31) + Boolean.hashCode(this.f29203c);
    }

    public final boolean i() {
        return this.f29203c;
    }

    public final boolean j() {
        return !this.f29202b.e().d();
    }

    public String toString() {
        if (!this.f29201a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(c packageFqName, f topLevelName) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(topLevelName, "topLevelName");
        c cVarK = c.k(topLevelName);
        AbstractC2855l.f(cVarK, "topLevel(...)");
        this(packageFqName, cVarK, false);
    }
}
