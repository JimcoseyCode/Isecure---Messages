package D0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f735b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f736a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f737a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private h(i iVar) {
        this.f736a = iVar;
    }

    public static h a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static h d() {
        return f735b;
    }

    public static h h(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale c(int i10) {
        return this.f736a.get(i10);
    }

    public boolean e() {
        return this.f736a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f736a.equals(((h) obj).f736a);
    }

    public int f() {
        return this.f736a.size();
    }

    public String g() {
        return this.f736a.a();
    }

    public int hashCode() {
        return this.f736a.hashCode();
    }

    public String toString() {
        return this.f736a.toString();
    }
}
