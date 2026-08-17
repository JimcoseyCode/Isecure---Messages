package e9;

import j7.AbstractC2793j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f26351d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f26347g = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f26345e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f26346f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final x a(String mediaType) {
            AbstractC2855l.g(mediaType, "mediaType");
            return c(mediaType);
        }

        public final x b(String toMediaType) {
            AbstractC2855l.g(toMediaType, "$this$toMediaType");
            Matcher matcher = x.f26345e.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + '\"').toString());
            }
            String strGroup = matcher.group(1);
            AbstractC2855l.f(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            AbstractC2855l.f(locale, "Locale.US");
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strGroup.toLowerCase(locale);
            AbstractC2855l.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            AbstractC2855l.f(strGroup2, "typeSubtype.group(2)");
            AbstractC2855l.f(locale, "Locale.US");
            if (strGroup2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strGroup2.toLowerCase(locale);
            AbstractC2855l.f(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f26346f.matcher(toMediaType);
            int iEnd = matcher.end();
            while (iEnd < toMediaType.length()) {
                matcher2.region(iEnd, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = toMediaType.substring(iEnd);
                    AbstractC2855l.f(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(toMediaType);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (P8.q.K(strGroup4, "'", false, 2, null) && P8.q.w(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        AbstractC2855l.f(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new x(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final x c(String toMediaTypeOrNull) {
            AbstractC2855l.g(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return b(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f26348a = str;
        this.f26349b = str2;
        this.f26350c = str3;
        this.f26351d = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        AbstractC2855l.g(name, "name");
        B7.a aVarO = B7.d.o(AbstractC2793j.I(this.f26351d), 2);
        int iD = aVarO.d();
        int iO = aVarO.o();
        int iP = aVarO.p();
        if (iP >= 0) {
            if (iD > iO) {
                return null;
            }
        } else if (iD < iO) {
            return null;
        }
        while (!P8.q.x(this.f26351d[iD], name, true)) {
            if (iD == iO) {
                return null;
            }
            iD += iP;
        }
        return this.f26351d[iD + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && AbstractC2855l.b(((x) obj).f26348a, this.f26348a);
    }

    public final String f() {
        return this.f26350c;
    }

    public final String g() {
        return this.f26349b;
    }

    public int hashCode() {
        return this.f26348a.hashCode();
    }

    public String toString() {
        return this.f26348a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
