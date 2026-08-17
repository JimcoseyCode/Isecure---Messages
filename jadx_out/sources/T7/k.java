package t7;

import j7.AbstractC2800q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class k {
    private static final int a(String str) {
        int iC0;
        char c10 = File.separatorChar;
        int iC02 = P8.q.c0(str, c10, 0, false, 4, null);
        if (iC02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iC0 = P8.q.c0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iC03 = P8.q.c0(str, c10, iC0 + 1, false, 4, null);
            return iC03 >= 0 ? iC03 + 1 : str.length();
        }
        if (iC02 > 0 && str.charAt(iC02 - 1) == ':') {
            return iC02 + 1;
        }
        if (iC02 == -1 && P8.q.T(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final f b(File file) {
        List listJ;
        AbstractC2855l.g(file, "<this>");
        String path = file.getPath();
        AbstractC2855l.d(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        AbstractC2855l.f(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        AbstractC2855l.f(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listJ = AbstractC2800q.j();
        } else {
            List listF0 = P8.q.F0(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listJ = arrayList;
        }
        return new f(new File(strSubstring), listJ);
    }
}
