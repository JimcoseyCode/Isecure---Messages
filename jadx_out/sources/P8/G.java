package P8;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G extends F {
    public static final String e1(String str, int i10) {
        AbstractC2855l.g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(B7.d.h(i10, str.length()));
            AbstractC2855l.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String f1(String str, int i10) {
        AbstractC2855l.g(str, "<this>");
        if (i10 >= 0) {
            return h1(str, B7.d.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char g1(CharSequence charSequence) {
        AbstractC2855l.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(E.X(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String h1(String str, int i10) {
        AbstractC2855l.g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, B7.d.h(i10, str.length()));
            AbstractC2855l.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
