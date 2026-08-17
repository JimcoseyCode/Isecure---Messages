package e9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.interfaces.permissions.PermissionsResponse;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f26285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f26288i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f26279n = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f26275j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f26276k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f26277l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f26278m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26290b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f26292d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f26295g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f26296h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f26297i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f26291c = 253402300799999L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f26293e = "/";

        private final a c(String str, boolean z10) {
            String strE = f9.a.e(str);
            if (strE != null) {
                this.f26292d = strE;
                this.f26297i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f26289a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f26290b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f26291c;
            String str3 = this.f26292d;
            if (str3 != null) {
                return new m(str, str2, j10, str3, this.f26293e, this.f26294f, this.f26295g, this.f26296h, this.f26297i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String domain) {
            AbstractC2855l.g(domain, "domain");
            return c(domain, false);
        }

        public final a d(String name) {
            AbstractC2855l.g(name, "name");
            if (!AbstractC2855l.b(P8.q.c1(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f26289a = name;
            return this;
        }

        public final a e(String value) {
            AbstractC2855l.g(value, "value");
            if (!AbstractC2855l.b(P8.q.c1(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f26290b = value;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (AbstractC2855l.b(str, str2)) {
                return true;
            }
            return P8.q.w(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !f9.c.f(str);
        }

        private final String f(String str) {
            if (P8.q.w(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = f9.a.e(P8.q.w0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f26278m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iD0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f26278m).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC2855l.f(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC2855l.f(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC2855l.f(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f26277l).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC2855l.f(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iD0 == -1 && matcher.usePattern(m.f26276k).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC2855l.f(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    AbstractC2855l.f(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    AbstractC2855l.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f26276k.pattern();
                    AbstractC2855l.f(strPattern, "MONTH_PATTERN.pattern()");
                    iD0 = P8.q.d0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f26275j).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC2855l.f(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && 99 >= i12) {
                i12 += 1900;
            }
            if (i12 >= 0 && 69 >= i12) {
                i12 += 2000;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(iD0 != -1)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(1 <= i14 && 31 >= i14)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(i13 >= 0 && 23 >= i13)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(i15 >= 0 && 59 >= i15)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(i16 >= 0 && 59 >= i16)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(f9.c.f27870f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iD0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new P8.o("-?\\d+").d(str)) {
                    return P8.q.K(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            AbstractC2855l.g(url, "url");
            AbstractC2855l.g(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j10, u url, String setCookie) {
            long j11;
            AbstractC2855l.g(url, "url");
            AbstractC2855l.g(setCookie, "setCookie");
            int iO = f9.c.o(setCookie, ';', 0, 0, 6, null);
            int iO2 = f9.c.o(setCookie, '=', 0, iO, 2, null);
            m mVar = null;
            if (iO2 == iO) {
                return null;
            }
            String strW = f9.c.W(setCookie, 0, iO2, 1, null);
            if (strW.length() == 0 || f9.c.v(strW) != -1) {
                return null;
            }
            String strV = f9.c.V(setCookie, iO2 + 1, iO);
            if (f9.c.v(strV) != -1) {
                return null;
            }
            int i10 = iO + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iM = f9.c.m(setCookie, ';', i10, length);
                int iM2 = f9.c.m(setCookie, '=', i10, iM);
                String strV2 = f9.c.V(setCookie, i10, iM2);
                String strV3 = iM2 < iM ? f9.c.V(setCookie, iM2 + 1, iM) : PointerEventHelper.POINTER_TYPE_UNKNOWN;
                m mVar2 = mVar;
                if (P8.q.x(strV2, PermissionsResponse.EXPIRES_KEY, true)) {
                    try {
                        jG = g(strV3, 0, strV3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (P8.q.x(strV2, "max-age", true)) {
                    jH = h(strV3);
                    z11 = true;
                } else if (P8.q.x(strV2, "domain", true)) {
                    strF = f(strV3);
                    z13 = false;
                } else if (P8.q.x(strV2, "path", true)) {
                    str = strV3;
                } else if (P8.q.x(strV2, "secure", true)) {
                    z12 = true;
                } else if (P8.q.x(strV2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iM + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) ProgressBarContainerView.MAX_PROGRESS) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.INSTANCE.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !P8.q.K(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iI0 = P8.q.i0(strD, '/', 0, false, 6, null);
                if (iI0 != 0) {
                    if (strD == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    strSubstring = strD.substring(0, iI0);
                    AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strW, strV, j11, strF, str, z12, z10, z11, z13, null);
        }

        public final List e(u url, t headers) {
            AbstractC2855l.g(url, "url");
            AbstractC2855l.g(headers, "headers");
            List listT = headers.t("Set-Cookie");
            int size = listT.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listT.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return AbstractC2800q.j();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f26280a = str;
        this.f26281b = str2;
        this.f26282c = j10;
        this.f26283d = str3;
        this.f26284e = str4;
        this.f26285f = z10;
        this.f26286g = z11;
        this.f26287h = z12;
        this.f26288i = z13;
    }

    public final String a() {
        return this.f26280a;
    }

    public final String b() {
        return this.f26281b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC2855l.b(mVar.f26280a, this.f26280a) && AbstractC2855l.b(mVar.f26281b, this.f26281b) && mVar.f26282c == this.f26282c && AbstractC2855l.b(mVar.f26283d, this.f26283d) && AbstractC2855l.b(mVar.f26284e, this.f26284e) && mVar.f26285f == this.f26285f && mVar.f26286g == this.f26286g && mVar.f26287h == this.f26287h && mVar.f26288i == this.f26288i;
    }

    public final String g() {
        return this.f26280a;
    }

    public final String h(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26280a);
        sb.append('=');
        sb.append(this.f26281b);
        if (this.f26287h) {
            if (this.f26282c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(k9.c.b(new Date(this.f26282c)));
            }
        }
        if (!this.f26288i) {
            sb.append("; domain=");
            if (z10) {
                sb.append(".");
            }
            sb.append(this.f26283d);
        }
        sb.append("; path=");
        sb.append(this.f26284e);
        if (this.f26285f) {
            sb.append("; secure");
        }
        if (this.f26286g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f26280a.hashCode()) * 31) + this.f26281b.hashCode()) * 31) + Long.hashCode(this.f26282c)) * 31) + this.f26283d.hashCode()) * 31) + this.f26284e.hashCode()) * 31) + Boolean.hashCode(this.f26285f)) * 31) + Boolean.hashCode(this.f26286g)) * 31) + Boolean.hashCode(this.f26287h)) * 31) + Boolean.hashCode(this.f26288i);
    }

    public final String i() {
        return this.f26281b;
    }

    public String toString() {
        return h(false);
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }
}
