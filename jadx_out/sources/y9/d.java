package y9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34173a = Character.toString('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f34174b = File.separatorChar;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f34175c;

    static {
        if (d()) {
            f34175c = '/';
        } else {
            f34175c = '\\';
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int iB = b(str);
        return iB == -1 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str.substring(iB + 1);
    }

    public static int b(String str) {
        int iLastIndexOf;
        if (str != null && c(str) <= (iLastIndexOf = str.lastIndexOf(46))) {
            return iLastIndexOf;
        }
        return -1;
    }

    public static int c(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    static boolean d() {
        return f34174b == '\\';
    }
}
