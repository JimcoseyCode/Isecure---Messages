package k8;

import com.facebook.react.views.text.TextAttributeProps;
import j7.AbstractC2793j;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f29207e = f.t("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f29208f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function1 f29209g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f29211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d f29212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f f29213d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Function1 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.p(str);
        }
    }

    d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f29210a = str;
        this.f29211b = cVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                i11 = 2;
                break;
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "shortNameOrSpecial";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "pathSegments";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                throw new IllegalStateException(str2);
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void d() {
        int iLastIndexOf = this.f29210a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f29213d = f.p(this.f29210a.substring(iLastIndexOf + 1));
            this.f29212c = new d(this.f29210a.substring(0, iLastIndexOf));
        } else {
            this.f29213d = f.p(this.f29210a);
            this.f29212c = c.f29204c.j();
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.j(), c.f29204c.j(), fVar);
    }

    public String b() {
        String str = this.f29210a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String strJ;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strJ = fVar.j();
        } else {
            strJ = this.f29210a + "." + fVar.j();
        }
        return new d(strJ, this, fVar);
    }

    public boolean e() {
        return this.f29210a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f29210a.equals(((d) obj).f29210a);
    }

    public boolean f() {
        return this.f29211b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f29212c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f29212c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    public List h() {
        List listD0 = e() ? Collections.EMPTY_LIST : AbstractC2793j.d0(f29208f.split(this.f29210a), f29209g);
        if (listD0 == null) {
            a(14);
        }
        return listD0;
    }

    public int hashCode() {
        return this.f29210a.hashCode();
    }

    public f i() {
        f fVar = this.f29213d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f29213d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public f j() {
        if (e()) {
            f fVar = f29207e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f29210a.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.f29210a.length();
        }
        String strJ = fVar.j();
        return iIndexOf == strJ.length() && this.f29210a.regionMatches(0, strJ, 0, iIndexOf);
    }

    public c l() {
        c cVar = this.f29211b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f29211b = cVar2;
        return cVar2;
    }

    public String toString() {
        String strJ = e() ? f29207e.j() : this.f29210a;
        if (strJ == null) {
            a(18);
        }
        return strJ;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f29210a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f29210a = str;
        this.f29212c = dVar;
        this.f29213d = fVar;
    }
}
