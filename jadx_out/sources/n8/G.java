package n8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G {
    public static final String a(k8.d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        List listH = dVar.h();
        AbstractC2855l.f(listH, "pathSegments(...)");
        return c(listH);
    }

    public static final String b(k8.f fVar) {
        AbstractC2855l.g(fVar, "<this>");
        if (!e(fVar)) {
            String strJ = fVar.j();
            AbstractC2855l.f(strJ, "asString(...)");
            return strJ;
        }
        StringBuilder sb = new StringBuilder();
        String strJ2 = fVar.j();
        AbstractC2855l.f(strJ2, "asString(...)");
        sb.append('`' + strJ2);
        sb.append('`');
        return sb.toString();
    }

    public static final String c(List pathSegments) {
        AbstractC2855l.g(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            k8.f fVar = (k8.f) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(fVar));
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC2855l.g(lowerRendered, "lowerRendered");
        AbstractC2855l.g(lowerPrefix, "lowerPrefix");
        AbstractC2855l.g(upperRendered, "upperRendered");
        AbstractC2855l.g(upperPrefix, "upperPrefix");
        AbstractC2855l.g(foldedPrefix, "foldedPrefix");
        if (P8.q.K(lowerRendered, lowerPrefix, false, 2, null) && P8.q.K(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            AbstractC2855l.f(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            AbstractC2855l.f(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (AbstractC2855l.b(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(k8.f fVar) {
        String strJ = fVar.j();
        AbstractC2855l.f(strJ, "asString(...)");
        if (B.f30074a.contains(strJ)) {
            return true;
        }
        for (int i10 = 0; i10 < strJ.length(); i10++) {
            char cCharAt = strJ.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strJ.length() == 0 || !Character.isJavaIdentifierStart(strJ.codePointAt(0));
    }

    public static final boolean f(String lower, String upper) {
        AbstractC2855l.g(lower, "lower");
        AbstractC2855l.g(upper, "upper");
        if (AbstractC2855l.b(lower, P8.q.E(upper, "?", PointerEventHelper.POINTER_TYPE_UNKNOWN, false, 4, null))) {
            return true;
        }
        if (P8.q.w(upper, "?", false, 2, null)) {
            if (AbstractC2855l.b(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(lower);
        sb.append(")?");
        return AbstractC2855l.b(sb.toString(), upper);
    }
}
