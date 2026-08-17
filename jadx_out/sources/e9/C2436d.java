package e9;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2436d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f26110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f26114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f26115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f26116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f26117m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f26104p = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2436d f26102n = new a().d().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2436d f26103o = new a().f().c(ViewDefaults.NUMBER_OF_LINES, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: e9.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26120c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26121d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26122e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f26124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f26125h;

        private final int b(long j10) {
            return j10 > ((long) ViewDefaults.NUMBER_OF_LINES) ? ViewDefaults.NUMBER_OF_LINES : (int) j10;
        }

        public final C2436d a() {
            return new C2436d(this.f26118a, this.f26119b, this.f26120c, -1, false, false, false, this.f26121d, this.f26122e, this.f26123f, this.f26124g, this.f26125h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            AbstractC2855l.g(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f26121d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f26118a = true;
            return this;
        }

        public final a e() {
            this.f26119b = true;
            return this;
        }

        public final a f() {
            this.f26123f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: e9.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (P8.q.P(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C2436d b(t tVar) {
            int i10;
            int i11;
            int iA;
            String string;
            t headers = tVar;
            AbstractC2855l.g(headers, "headers");
            int size = headers.size();
            boolean z10 = true;
            boolean z11 = true;
            int i12 = 0;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int iU = -1;
            int iU2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iU3 = -1;
            int iU4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i12 < size) {
                String strP = headers.p(i12);
                String strS = headers.s(i12);
                if (P8.q.x(strP, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strS;
                    }
                    i10 = 0;
                    while (i10 < strS.length()) {
                        int iA2 = a(strS, "=,;", i10);
                        String strSubstring = strS.substring(i10, iA2);
                        boolean z20 = z10;
                        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (strSubstring == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        String string2 = P8.q.c1(strSubstring).toString();
                        int i13 = size;
                        if (iA2 != strS.length()) {
                            i11 = i12;
                            if (strS.charAt(iA2) != ',' && strS.charAt(iA2) != ';') {
                                int iA3 = f9.c.A(strS, iA2 + 1);
                                if (iA3 >= strS.length() || strS.charAt(iA3) != '\"') {
                                    iA = a(strS, ",;", iA3);
                                    String strSubstring2 = strS.substring(iA3, iA);
                                    AbstractC2855l.f(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    if (strSubstring2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    string = P8.q.c1(strSubstring2).toString();
                                } else {
                                    int i14 = iA3 + 1;
                                    int iC0 = P8.q.c0(strS, '\"', i14, false, 4, null);
                                    string = strS.substring(i14, iC0);
                                    AbstractC2855l.f(string, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iA = iC0 + 1;
                                }
                            }
                            z10 = z20;
                            if (!P8.q.x("no-cache", string2, z10)) {
                                z12 = z10;
                            } else if (P8.q.x("no-store", string2, z10)) {
                                z13 = z10;
                            } else {
                                if (P8.q.x("max-age", string2, z10)) {
                                    iU = f9.c.U(string, -1);
                                } else if (P8.q.x("s-maxage", string2, z10)) {
                                    iU2 = f9.c.U(string, -1);
                                } else if (P8.q.x("private", string2, z10)) {
                                    z14 = z10;
                                } else if (P8.q.x("public", string2, z10)) {
                                    z15 = z10;
                                } else if (P8.q.x("must-revalidate", string2, z10)) {
                                    z16 = z10;
                                } else if (P8.q.x("max-stale", string2, z10)) {
                                    iU3 = f9.c.U(string, ViewDefaults.NUMBER_OF_LINES);
                                } else if (P8.q.x("min-fresh", string2, z10)) {
                                    iU4 = f9.c.U(string, -1);
                                } else if (P8.q.x("only-if-cached", string2, z10)) {
                                    z17 = z10;
                                } else if (P8.q.x("no-transform", string2, z10)) {
                                    z18 = z10;
                                } else if (P8.q.x("immutable", string2, z10)) {
                                    z19 = z10;
                                }
                                i10 = iA;
                                size = i13;
                                i12 = i11;
                            }
                            i10 = iA;
                            size = i13;
                            i12 = i11;
                        } else {
                            i11 = i12;
                        }
                        iA = iA2 + 1;
                        string = null;
                        z10 = z20;
                        if (!P8.q.x("no-cache", string2, z10)) {
                        }
                        i10 = iA;
                        size = i13;
                        i12 = i11;
                    }
                    i12++;
                    size = size;
                    headers = tVar;
                } else if (!P8.q.x(strP, "Pragma", z10)) {
                    continue;
                    i12++;
                    size = size;
                    headers = tVar;
                }
                z11 = false;
                i10 = 0;
                while (i10 < strS.length()) {
                }
                i12++;
                size = size;
                headers = tVar;
            }
            return new C2436d(z12, z13, iU, iU2, z14, z15, z16, iU3, iU4, z17, z18, z19, !z11 ? null : str, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C2436d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f26105a = z10;
        this.f26106b = z11;
        this.f26107c = i10;
        this.f26108d = i11;
        this.f26109e = z12;
        this.f26110f = z13;
        this.f26111g = z14;
        this.f26112h = i12;
        this.f26113i = i13;
        this.f26114j = z15;
        this.f26115k = z16;
        this.f26116l = z17;
        this.f26117m = str;
    }

    public final boolean a() {
        return this.f26109e;
    }

    public final boolean b() {
        return this.f26110f;
    }

    public final int c() {
        return this.f26107c;
    }

    public final int d() {
        return this.f26112h;
    }

    public final int e() {
        return this.f26113i;
    }

    public final boolean f() {
        return this.f26111g;
    }

    public final boolean g() {
        return this.f26105a;
    }

    public final boolean h() {
        return this.f26106b;
    }

    public final boolean i() {
        return this.f26114j;
    }

    public String toString() {
        String str = this.f26117m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f26105a) {
            sb.append("no-cache, ");
        }
        if (this.f26106b) {
            sb.append("no-store, ");
        }
        if (this.f26107c != -1) {
            sb.append("max-age=");
            sb.append(this.f26107c);
            sb.append(", ");
        }
        if (this.f26108d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f26108d);
            sb.append(", ");
        }
        if (this.f26109e) {
            sb.append("private, ");
        }
        if (this.f26110f) {
            sb.append("public, ");
        }
        if (this.f26111g) {
            sb.append("must-revalidate, ");
        }
        if (this.f26112h != -1) {
            sb.append("max-stale=");
            sb.append(this.f26112h);
            sb.append(", ");
        }
        if (this.f26113i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f26113i);
            sb.append(", ");
        }
        if (this.f26114j) {
            sb.append("only-if-cached, ");
        }
        if (this.f26115k) {
            sb.append("no-transform, ");
        }
        if (this.f26116l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
        this.f26117m = string;
        return string;
    }

    public /* synthetic */ C2436d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }
}
