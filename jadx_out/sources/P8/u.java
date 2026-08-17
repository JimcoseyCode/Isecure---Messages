package P8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends r {
    private static final Function1 d(final String str) {
        return str.length() == 0 ? new Function1() { // from class: P8.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.e((String) obj);
            }
        } : new Function1() { // from class: P8.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String line) {
        AbstractC2855l.g(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String line) {
        AbstractC2855l.g(line, "line");
        return str + line;
    }

    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC1383b.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(newIndent, "newIndent");
        List listM0 = E.m0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (!E.f0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) AbstractC2800q.u0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM0.size());
        Function1 function1D = d(newIndent);
        int iL = AbstractC2800q.l(listM0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iL) && E.f0(str3)) {
                str3 = null;
            } else {
                String strE1 = G.e1(str3, iIntValue);
                if (strE1 != null && (str2 = (String) function1D.invoke(strE1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) AbstractC2800q.m0(arrayList3, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(newIndent, "newIndent");
        AbstractC2855l.g(marginPrefix, "marginPrefix");
        if (E.f0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM0 = E.m0(str);
        int length = str.length() + (newIndent.length() * listM0.size());
        Function1 function1D = d(newIndent);
        int iL = AbstractC2800q.l(listM0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iL) && E.f0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!AbstractC1383b.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (B.J(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        AbstractC2855l.e(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC2855l.f(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) function1D.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) AbstractC2800q.m0(arrayList, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
    }

    public static String j(String str) {
        AbstractC2855l.g(str, "<this>");
        return h(str, PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }

    public static final String k(String str, String marginPrefix) {
        AbstractC2855l.g(str, "<this>");
        AbstractC2855l.g(marginPrefix, "marginPrefix");
        return i(str, PointerEventHelper.POINTER_TYPE_UNKNOWN, marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
