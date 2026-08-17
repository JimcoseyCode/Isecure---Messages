package U5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static boolean a(int i10) {
        List list = (List) T5.a.a().get(Integer.valueOf(i10));
        return (list == null || list.contains("001")) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("001");
    }
}
