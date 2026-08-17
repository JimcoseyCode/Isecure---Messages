package e9;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f26331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f26332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f26333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f26334j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f26324l = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char[] f26323k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0270a f26335i = new C0270a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26336a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f26339d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f26341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f26342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f26343h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26337b = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26338c = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26340e = -1;

        /* JADX INFO: renamed from: e9.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0270a {
            private C0270a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                int i12;
                try {
                    i12 = Integer.parseInt(b.b(u.f26324l, str, i10, i11, PointerEventHelper.POINTER_TYPE_UNKNOWN, false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 <= i12 && 65535 >= i12) {
                    return i12;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == ':') {
                        return i10;
                    }
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((AbstractC2855l.i(cCharAt, 97) >= 0 && AbstractC2855l.i(cCharAt, 122) <= 0) || (AbstractC2855l.i(cCharAt, 65) >= 0 && AbstractC2855l.i(cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || 'z' < cCharAt2) {
                            if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                                if ('0' > cCharAt2 || '9' < cCharAt2) {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            public /* synthetic */ C0270a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f26341f = arrayList;
            arrayList.add(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }

        private final int b() {
            int i10 = this.f26340e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f26324l;
            String str = this.f26336a;
            AbstractC2855l.d(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            return AbstractC2855l.b(str, ".") || P8.q.x(str, "%2e", true);
        }

        private final boolean g(String str) {
            return AbstractC2855l.b(str, "..") || P8.q.x(str, "%2e.", true) || P8.q.x(str, ".%2e", true) || P8.q.x(str, "%2e%2e", true);
        }

        private final void j() {
            if (((String) this.f26341f.remove(r0.size() - 1)).length() != 0 || this.f26341f.isEmpty()) {
                this.f26341f.add(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            } else {
                this.f26341f.set(r0.size() - 1, PointerEventHelper.POINTER_TYPE_UNKNOWN);
            }
        }

        private final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = b.b(u.f26324l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            if (((CharSequence) this.f26341f.get(r14.size() - 1)).length() == 0) {
                this.f26341f.set(r14.size() - 1, strB);
            } else {
                this.f26341f.add(strB);
            }
            if (z10) {
                this.f26341f.add(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            }
        }

        private final void n(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f26341f.clear();
                this.f26341f.add(PointerEventHelper.POINTER_TYPE_UNKNOWN);
                i10++;
            } else {
                List list = this.f26341f;
                list.set(list.size() - 1, PointerEventHelper.POINTER_TYPE_UNKNOWN);
            }
            int i12 = i10;
            while (i12 < i11) {
                int iN = f9.c.n(str, "/\\", i12, i11);
                boolean z10 = iN < i11;
                String str2 = str;
                l(str2, i12, iN, z10, true);
                if (z10) {
                    iN++;
                }
                i12 = iN;
                str = str2;
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f26336a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f26324l;
            String strG = b.g(bVar, this.f26337b, 0, 0, false, 7, null);
            String strG2 = b.g(bVar, this.f26338c, 0, 0, false, 7, null);
            String str2 = this.f26339d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f26341f;
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g(u.f26324l, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f26342g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.g(u.f26324l, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f26343h;
            return new u(str, strG, strG2, str2, iB, arrayList2, arrayList, str4 != null ? b.g(u.f26324l, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f26342g = (str == null || (strB = b.b((bVar = u.f26324l), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.i(strB);
            return this;
        }

        public final List d() {
            return this.f26341f;
        }

        public final a e(String host) {
            AbstractC2855l.g(host, "host");
            String strE = f9.a.e(b.g(u.f26324l, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f26339d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a h(u uVar, String str) {
            int iN;
            int i10;
            String str2;
            boolean z10;
            int i11;
            String str3;
            int i12;
            int i13;
            boolean z11;
            int i14;
            boolean z12;
            char c10;
            String input = str;
            AbstractC2855l.g(input, "input");
            int iX = f9.c.x(input, 0, 0, 3, null);
            int iZ = f9.c.z(input, iX, 0, 2, null);
            C0270a c0270a = f26335i;
            int iG = c0270a.g(input, iX, iZ);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z13 = true;
            int i15 = -1;
            if (iG != -1) {
                if (P8.q.H(input, "https:", iX, true)) {
                    this.f26336a = "https";
                    iX += 6;
                } else {
                    if (!P8.q.H(input, "http:", iX, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f26336a = "http";
                    iX += 5;
                }
            } else {
                if (uVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f26336a = uVar.p();
            }
            int iH = c0270a.h(input, iX, iZ);
            int i16 = 63;
            int i17 = 35;
            if (iH >= 2 || uVar == null || !AbstractC2855l.b(uVar.p(), this.f26336a)) {
                int i18 = iX + iH;
                boolean z14 = false;
                boolean z15 = false;
                while (true) {
                    iN = f9.c.n(input, "@/\\?#", i18, iZ);
                    int iCharAt = iN != iZ ? input.charAt(iN) : i15;
                    if (iCharAt == i15 || iCharAt == i17 || iCharAt == 47 || iCharAt == 92 || iCharAt == i16) {
                        break;
                    }
                    if (iCharAt != 64) {
                        z10 = z13;
                        i11 = iZ;
                        str3 = str4;
                        i12 = i15;
                    } else {
                        if (z14) {
                            z10 = z13;
                            i11 = iZ;
                            str3 = str4;
                            i12 = i15;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f26338c);
                            sb2.append("%40");
                            input = str;
                            i13 = iN;
                            sb2.append(b.b(u.f26324l, input, i18, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f26338c = sb2.toString();
                            z11 = z15;
                        } else {
                            int iM = f9.c.m(input, ':', i18, iN);
                            b bVar = u.f26324l;
                            z10 = z13;
                            str3 = str4;
                            i12 = i15;
                            i11 = iZ;
                            String strB = b.b(bVar, input, i18, iM, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z15) {
                                strB = this.f26337b + "%40" + strB;
                            }
                            this.f26337b = strB;
                            if (iM != iN) {
                                i14 = iN;
                                this.f26338c = b.b(bVar, str, iM + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i14 = iN;
                                z12 = z14;
                            }
                            input = str;
                            i13 = i14;
                            z14 = z12;
                            z11 = z10;
                        }
                        i18 = i13 + 1;
                        z15 = z11;
                    }
                    i15 = i12;
                    z13 = z10;
                    iZ = i11;
                    str4 = str3;
                    i16 = 63;
                    i17 = 35;
                }
                boolean z16 = z13;
                i10 = iZ;
                String str5 = str4;
                int i19 = i15;
                C0270a c0270a2 = f26335i;
                int iF = c0270a2.f(input, i18, iN);
                int i20 = iF + 1;
                if (i20 < iN) {
                    this.f26339d = f9.a.e(b.g(u.f26324l, input, i18, iF, false, 4, null));
                    int iE = c0270a2.e(input, i20, iN);
                    this.f26340e = iE;
                    if (!(iE != i19 ? z16 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i20, iN);
                        AbstractC2855l.f(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str5;
                } else {
                    str2 = str5;
                    b bVar2 = u.f26324l;
                    this.f26339d = f9.a.e(b.g(bVar2, input, i18, iF, false, 4, null));
                    String str6 = this.f26336a;
                    AbstractC2855l.d(str6);
                    this.f26340e = bVar2.c(str6);
                }
                if (!(this.f26339d != null ? z16 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, iF);
                    AbstractC2855l.f(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iX = iN;
            } else {
                this.f26337b = uVar.g();
                this.f26338c = uVar.c();
                this.f26339d = uVar.h();
                this.f26340e = uVar.l();
                this.f26341f.clear();
                this.f26341f.addAll(uVar.e());
                if (iX == iZ || input.charAt(iX) == '#') {
                    c(uVar.f());
                }
                i10 = iZ;
            }
            int i21 = i10;
            int iN2 = f9.c.n(input, "?#", iX, i21);
            n(input, iX, iN2);
            if (iN2 >= i21 || input.charAt(iN2) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iM2 = f9.c.m(input, '#', iN2, i21);
                b bVar3 = u.f26324l;
                this.f26342g = bVar3.i(b.b(bVar3, input, iN2 + 1, iM2, " \"'<>#", true, false, true, false, null, JfifUtil.MARKER_RST0, null));
                iN2 = iM2;
            }
            if (iN2 < i21 && input.charAt(iN2) == c10) {
                this.f26343h = b.b(u.f26324l, input, iN2 + 1, i21, PointerEventHelper.POINTER_TYPE_UNKNOWN, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String password) {
            AbstractC2855l.g(password, "password");
            this.f26338c = b.b(u.f26324l, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i10) {
            if (1 <= i10 && 65535 >= i10) {
                this.f26340e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a m() {
            String str = this.f26339d;
            this.f26339d = str != null ? new P8.o("[\"<>^`{|}]").e(str, PointerEventHelper.POINTER_TYPE_UNKNOWN) : null;
            int size = this.f26341f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f26341f;
                list.set(i10, b.b(u.f26324l, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f26342g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f26324l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f26343h;
            this.f26343h = str3 != null ? b.b(u.f26324l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String scheme) {
            AbstractC2855l.g(scheme, "scheme");
            if (P8.q.x(scheme, "http", true)) {
                this.f26336a = "http";
                return this;
            }
            if (P8.q.x(scheme, "https", true)) {
                this.f26336a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void p(String str) {
            this.f26343h = str;
        }

        public final void q(String str) {
            AbstractC2855l.g(str, "<set-?>");
            this.f26338c = str;
        }

        public final void r(String str) {
            AbstractC2855l.g(str, "<set-?>");
            this.f26337b = str;
        }

        public final void s(String str) {
            this.f26339d = str;
        }

        public final void t(int i10) {
            this.f26340e = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f26336a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f26337b.length() > 0 || this.f26338c.length() > 0) {
                sb.append(this.f26337b);
                if (this.f26338c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f26338c);
                }
                sb.append('@');
            }
            String str2 = this.f26339d;
            if (str2 != null) {
                AbstractC2855l.d(str2);
                if (P8.q.P(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f26339d);
                    sb.append(']');
                } else {
                    sb.append(this.f26339d);
                }
            }
            if (this.f26340e != -1 || this.f26336a != null) {
                int iB = b();
                String str3 = this.f26336a;
                if (str3 != null) {
                    b bVar = u.f26324l;
                    AbstractC2855l.d(str3);
                    if (iB != bVar.c(str3)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
            }
            b bVar2 = u.f26324l;
            bVar2.h(this.f26341f, sb);
            if (this.f26342g != null) {
                sb.append('?');
                List list = this.f26342g;
                AbstractC2855l.d(list);
                bVar2.j(list, sb);
            }
            if (this.f26343h != null) {
                sb.append('#');
                sb.append(this.f26343h);
            }
            String string = sb.toString();
            AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f26336a = str;
        }

        public final a v(String username) {
            AbstractC2855l.g(username, "username");
            this.f26337b = b.b(u.f26324l, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && f9.c.F(str.charAt(i10 + 1)) != -1 && f9.c.F(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String g(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.f(str, i10, i11, z10);
        }

        private final void k(C3391h c3391h, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            C3391h c3391h2 = null;
            while (iCharCount < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        c3391h.V(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!P8.q.P(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || e(str, iCharCount, i11))))) {
                                c3391h.g1(iCodePointAt);
                            }
                        }
                        if (c3391h2 == null) {
                            c3391h2 = new C3391h();
                        }
                        if (charset == null || AbstractC2855l.b(charset, StandardCharsets.UTF_8)) {
                            c3391h2.g1(iCodePointAt);
                        } else {
                            c3391h2.c1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c3391h2.D()) {
                            byte b10 = c3391h2.readByte();
                            c3391h.writeByte(37);
                            c3391h.writeByte(u.f26323k[((b10 & 255) >> 4) & 15]);
                            c3391h.writeByte(u.f26323k[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void l(C3391h c3391h, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iF = f9.c.F(str.charAt(i10 + 1));
                    int iF2 = f9.c.F(str.charAt(i12));
                    if (iF == -1 || iF2 == -1) {
                        c3391h.g1(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c3391h.writeByte((iF << 4) + iF2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    c3391h.writeByte(32);
                    i10++;
                } else {
                    c3391h.g1(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String canonicalize, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            AbstractC2855l.g(canonicalize, "$this$canonicalize");
            AbstractC2855l.g(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = canonicalize.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || P8.q.P(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(canonicalize, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    C3391h c3391h = new C3391h();
                    c3391h.f1(canonicalize, i10, iCharCount);
                    k(c3391h, canonicalize, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return c3391h.q0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = canonicalize.substring(i10, i11);
            AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            AbstractC2855l.g(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            return iHashCode != 3213448 ? (iHashCode == 99617003 && scheme.equals("https")) ? 443 : -1 : scheme.equals("http") ? 80 : -1;
        }

        public final u d(String toHttpUrl) {
            AbstractC2855l.g(toHttpUrl, "$this$toHttpUrl");
            return new a().h(null, toHttpUrl).a();
        }

        public final String f(String percentDecode, int i10, int i11, boolean z10) {
            AbstractC2855l.g(percentDecode, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = percentDecode.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C3391h c3391h = new C3391h();
                    c3391h.f1(percentDecode, i10, i12);
                    l(c3391h, percentDecode, i12, i11, z10);
                    return c3391h.q0();
                }
            }
            String strSubstring = percentDecode.substring(i10, i11);
            AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(List toPathString, StringBuilder out) {
            AbstractC2855l.g(toPathString, "$this$toPathString");
            AbstractC2855l.g(out, "out");
            int size = toPathString.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) toPathString.get(i10));
            }
        }

        public final List i(String toQueryNamesAndValues) {
            AbstractC2855l.g(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= toQueryNamesAndValues.length()) {
                String str = toQueryNamesAndValues;
                int iC0 = P8.q.c0(str, '&', i10, false, 4, null);
                if (iC0 == -1) {
                    iC0 = str.length();
                }
                int iC02 = P8.q.c0(str, '=', i10, false, 4, null);
                if (iC02 == -1 || iC02 > iC0) {
                    String strSubstring = str.substring(i10, iC0);
                    AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iC02);
                    AbstractC2855l.f(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iC02 + 1, iC0);
                    AbstractC2855l.f(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iC0 + 1;
                toQueryNamesAndValues = str;
            }
            return arrayList;
        }

        public final void j(List toQueryString, StringBuilder out) {
            AbstractC2855l.g(toQueryString, "$this$toQueryString");
            AbstractC2855l.g(out, "out");
            B7.a aVarO = B7.d.o(B7.d.p(0, toQueryString.size()), 2);
            int iD = aVarO.d();
            int iO = aVarO.o();
            int iP = aVarO.p();
            if (iP >= 0) {
                if (iD > iO) {
                    return;
                }
            } else if (iD < iO) {
                return;
            }
            while (true) {
                String str = (String) toQueryString.get(iD);
                String str2 = (String) toQueryString.get(iD + 1);
                if (iD > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iD == iO) {
                    return;
                } else {
                    iD += iP;
                }
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        AbstractC2855l.g(scheme, "scheme");
        AbstractC2855l.g(username, "username");
        AbstractC2855l.g(password, "password");
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(pathSegments, "pathSegments");
        AbstractC2855l.g(url, "url");
        this.f26326b = scheme;
        this.f26327c = username;
        this.f26328d = password;
        this.f26329e = host;
        this.f26330f = i10;
        this.f26331g = pathSegments;
        this.f26332h = list;
        this.f26333i = str;
        this.f26334j = url;
        this.f26325a = AbstractC2855l.b(scheme, "https");
    }

    public final String b() {
        if (this.f26333i == null) {
            return null;
        }
        int iC0 = P8.q.c0(this.f26334j, '#', 0, false, 6, null) + 1;
        String str = this.f26334j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iC0);
        AbstractC2855l.f(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f26328d.length() == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int iC0 = P8.q.c0(this.f26334j, ':', this.f26326b.length() + 3, false, 4, null) + 1;
        int iC02 = P8.q.c0(this.f26334j, '@', 0, false, 6, null);
        String str = this.f26334j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iC0, iC02);
        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iC0 = P8.q.c0(this.f26334j, '/', this.f26326b.length() + 3, false, 4, null);
        String str = this.f26334j;
        int iN = f9.c.n(str, "?#", iC0, str.length());
        String str2 = this.f26334j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iC0, iN);
        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iC0 = P8.q.c0(this.f26334j, '/', this.f26326b.length() + 3, false, 4, null);
        String str = this.f26334j;
        int iN = f9.c.n(str, "?#", iC0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iC0 < iN) {
            int i10 = iC0 + 1;
            int iM = f9.c.m(this.f26334j, '/', i10, iN);
            String str2 = this.f26334j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i10, iM);
            AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iC0 = iM;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && AbstractC2855l.b(((u) obj).f26334j, this.f26334j);
    }

    public final String f() {
        if (this.f26332h == null) {
            return null;
        }
        int iC0 = P8.q.c0(this.f26334j, '?', 0, false, 6, null) + 1;
        String str = this.f26334j;
        int iM = f9.c.m(str, '#', iC0, str.length());
        String str2 = this.f26334j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iC0, iM);
        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f26327c.length() == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int length = this.f26326b.length() + 3;
        String str = this.f26334j;
        int iN = f9.c.n(str, ":@", length, str.length());
        String str2 = this.f26334j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iN);
        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f26329e;
    }

    public int hashCode() {
        return this.f26334j.hashCode();
    }

    public final boolean i() {
        return this.f26325a;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f26326b);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f26329e);
        aVar.t(this.f26330f != f26324l.c(this.f26326b) ? this.f26330f : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String link) {
        AbstractC2855l.g(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f26330f;
    }

    public final String m() {
        if (this.f26332h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f26324l.j(this.f26332h, sb);
        return sb.toString();
    }

    public final String n() {
        a aVarK = k("/...");
        AbstractC2855l.d(aVarK);
        return aVarK.v(PointerEventHelper.POINTER_TYPE_UNKNOWN).i(PointerEventHelper.POINTER_TYPE_UNKNOWN).a().toString();
    }

    public final u o(String link) {
        AbstractC2855l.g(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String p() {
        return this.f26326b;
    }

    public final URI q() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new P8.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").e(string, PointerEventHelper.POINTER_TYPE_UNKNOWN));
                AbstractC2855l.f(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f26334j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f26334j;
    }
}
