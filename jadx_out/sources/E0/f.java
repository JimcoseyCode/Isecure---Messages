package E0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f1034h;

    public f(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f1030d;
    }

    public int c() {
        return this.f1031e;
    }

    String d() {
        return this.f1034h;
    }

    public String e() {
        return this.f1027a;
    }

    public String f() {
        return this.f1028b;
    }

    public String g() {
        return this.f1029c;
    }

    public String h() {
        return this.f1032f;
    }

    public String i() {
        return this.f1033g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1027a + ", mProviderPackage: " + this.f1028b + ", mQuery: " + this.f1029c + ", mSystemFont: " + this.f1032f + ", mVariationSettings: " + this.f1033g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f1030d.size(); i10++) {
            sb.append(" [");
            List list = (List) this.f1030d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1031e);
        return sb.toString();
    }

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        this.f1027a = (String) H0.g.g(str);
        this.f1028b = (String) H0.g.g(str2);
        this.f1029c = (String) H0.g.g(str3);
        this.f1030d = (List) H0.g.g(list);
        this.f1031e = 0;
        this.f1032f = str4;
        this.f1033g = str5;
        this.f1034h = a(str, str2, str3, str4, str5);
    }
}
