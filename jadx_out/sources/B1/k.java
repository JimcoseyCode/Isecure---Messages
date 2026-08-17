package B1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f281d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f283e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f284a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f285b = f283e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f286c = true;

        static {
            String strG = g();
            f282d = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f283e = Collections.unmodifiableMap(map);
        }

        private Map d() {
            HashMap map = new HashMap(this.f285b.size());
            for (Map.Entry entry : this.f285b.entrySet()) {
                map.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f284a) {
                this.f284a = false;
                this.f285b = d();
            }
        }

        private List f(String str) {
            List list = (List) this.f285b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f285b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(String str, j jVar) {
            if (this.f286c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f284a = true;
            return new k(this.f285b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f285b.remove(str);
            } else {
                List listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f286c && "User-Agent".equalsIgnoreCase(str)) {
                this.f286c = false;
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f287a;

        b(String str) {
            this.f287a = str;
        }

        @Override // B1.j
        public String a() {
            return this.f287a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f287a.equals(((b) obj).f287a);
            }
            return false;
        }

        public int hashCode() {
            return this.f287a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f287a + "'}";
        }
    }

    k(Map map) {
        this.f280c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb.append(strA);
                if (i10 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f280c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put((String) entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // B1.i
    public Map a() {
        if (this.f281d == null) {
            synchronized (this) {
                try {
                    if (this.f281d == null) {
                        this.f281d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f281d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f280c.equals(((k) obj).f280c);
        }
        return false;
    }

    public int hashCode() {
        return this.f280c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f280c + '}';
    }
}
