package T5;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class j implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10588g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10590i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10592k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10594m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10596o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10598q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10600s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10602u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10589h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10591j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10593l = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10595n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10597p = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f10599r = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f10603v = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f10601t = a.UNSPECIFIED;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    public j a() {
        this.f10600s = false;
        this.f10601t = a.UNSPECIFIED;
        return this;
    }

    public boolean b(j jVar) {
        if (jVar == null) {
            return false;
        }
        if (this == jVar) {
            return true;
        }
        return this.f10589h == jVar.f10589h && this.f10591j == jVar.f10591j && this.f10593l.equals(jVar.f10593l) && this.f10595n == jVar.f10595n && this.f10597p == jVar.f10597p && this.f10599r.equals(jVar.f10599r) && this.f10601t == jVar.f10601t && this.f10603v.equals(jVar.f10603v) && p() == jVar.p();
    }

    public int c() {
        return this.f10589h;
    }

    public a d() {
        return this.f10601t;
    }

    public String e() {
        return this.f10593l;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && b((j) obj);
    }

    public long f() {
        return this.f10591j;
    }

    public int g() {
        return this.f10597p;
    }

    public String h() {
        return this.f10603v;
    }

    public int hashCode() {
        return ((((((((((((((((2173 + c()) * 53) + Long.valueOf(f()).hashCode()) * 53) + e().hashCode()) * 53) + (q() ? 1231 : 1237)) * 53) + g()) * 53) + i().hashCode()) * 53) + d().hashCode()) * 53) + h().hashCode()) * 53) + (p() ? 1231 : 1237);
    }

    public String i() {
        return this.f10599r;
    }

    public boolean j() {
        return this.f10588g;
    }

    public boolean k() {
        return this.f10600s;
    }

    public boolean l() {
        return this.f10592k;
    }

    public boolean m() {
        return this.f10594m;
    }

    public boolean n() {
        return this.f10590i;
    }

    public boolean o() {
        return this.f10596o;
    }

    public boolean p() {
        return this.f10602u;
    }

    public boolean q() {
        return this.f10595n;
    }

    public j r(int i10) {
        this.f10588g = true;
        this.f10589h = i10;
        return this;
    }

    public j s(a aVar) {
        aVar.getClass();
        this.f10600s = true;
        this.f10601t = aVar;
        return this;
    }

    public j t(String str) {
        str.getClass();
        this.f10592k = true;
        this.f10593l = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.f10589h);
        sb.append(" National Number: ");
        sb.append(this.f10591j);
        if (m() && q()) {
            sb.append(" Leading Zero(s): true");
        }
        if (o()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f10597p);
        }
        if (l()) {
            sb.append(" Extension: ");
            sb.append(this.f10593l);
        }
        if (k()) {
            sb.append(" Country Code Source: ");
            sb.append(this.f10601t);
        }
        if (p()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.f10603v);
        }
        return sb.toString();
    }

    public j u(boolean z10) {
        this.f10594m = true;
        this.f10595n = z10;
        return this;
    }

    public j v(long j10) {
        this.f10590i = true;
        this.f10591j = j10;
        return this;
    }

    public j w(int i10) {
        this.f10596o = true;
        this.f10597p = i10;
        return this;
    }

    public j x(String str) {
        str.getClass();
        this.f10602u = true;
        this.f10603v = str;
        return this;
    }

    public j y(String str) {
        str.getClass();
        this.f10598q = true;
        this.f10599r = str;
        return this;
    }
}
