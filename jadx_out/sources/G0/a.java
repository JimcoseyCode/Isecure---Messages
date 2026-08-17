package G0;

import android.text.SpannableStringBuilder;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final m f2149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f2150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f2151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f2152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f2153h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f2156c;

    /* JADX INFO: renamed from: G0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0045a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f2159c;

        public C0045a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f2153h : a.f2152g;
        }

        private void c(boolean z10) {
            this.f2157a = z10;
            this.f2159c = a.f2149d;
            this.f2158b = 2;
        }

        public a a() {
            return (this.f2158b == 2 && this.f2159c == a.f2149d) ? b(this.f2157a) : new a(this.f2157a, this.f2158b, this.f2159c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f2160f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f2161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f2165e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f2160f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f2161a = charSequence;
            this.f2162b = z10;
            this.f2163c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f2160f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f2164d;
            do {
                int i11 = this.f2164d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2161a;
                int i12 = i11 - 1;
                this.f2164d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f2165e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f2164d = i10;
            this.f2165e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f2164d;
                if (i10 >= this.f2163c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2161a;
                this.f2164d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f2165e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f2164d;
            while (true) {
                int i11 = this.f2164d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2161a;
                int i12 = i11 - 1;
                this.f2164d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f2165e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f2164d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f2161a;
                            int i14 = i13 - 1;
                            this.f2164d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f2165e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f2164d = i10;
            this.f2165e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f2164d;
            while (true) {
                int i11 = this.f2164d;
                if (i11 >= this.f2163c) {
                    this.f2164d = i10;
                    this.f2165e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2161a;
                this.f2164d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f2165e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f2164d;
                        if (i12 < this.f2163c) {
                            CharSequence charSequence2 = this.f2161a;
                            this.f2164d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f2165e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f2161a.charAt(this.f2164d - 1);
            this.f2165e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f2161a, this.f2164d);
                this.f2164d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f2164d--;
            byte bC = c(this.f2165e);
            if (!this.f2162b) {
                return bC;
            }
            char c10 = this.f2165e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f2161a.charAt(this.f2164d);
            this.f2165e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f2161a, this.f2164d);
                this.f2164d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f2164d++;
            byte bC = c(this.f2165e);
            if (!this.f2162b) {
                return bC;
            }
            char c10 = this.f2165e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int d() {
            this.f2164d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f2164d < this.f2163c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f2164d > 0) {
                switch (a()) {
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f2164d = this.f2163c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f2164d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        m mVar = n.f2177c;
        f2149d = mVar;
        f2150e = Character.toString((char) 8206);
        f2151f = Character.toString((char) 8207);
        f2152g = new a(false, 2, mVar);
        f2153h = new a(true, 2, mVar);
    }

    a(boolean z10, int i10, m mVar) {
        this.f2154a = z10;
        this.f2155b = i10;
        this.f2156c = mVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0045a().a();
    }

    static boolean e(Locale locale) {
        return o.a(locale) == 1;
    }

    private String f(CharSequence charSequence, m mVar) {
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f2154a || !(zIsRtl || b(charSequence) == 1)) ? this.f2154a ? (!zIsRtl || b(charSequence) == -1) ? f2151f : PointerEventHelper.POINTER_TYPE_UNKNOWN : PointerEventHelper.POINTER_TYPE_UNKNOWN : f2150e;
    }

    private String g(CharSequence charSequence, m mVar) {
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f2154a || !(zIsRtl || a(charSequence) == 1)) ? this.f2154a ? (!zIsRtl || a(charSequence) == -1) ? f2151f : PointerEventHelper.POINTER_TYPE_UNKNOWN : PointerEventHelper.POINTER_TYPE_UNKNOWN : f2150e;
    }

    public boolean d() {
        return (this.f2155b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2156c, true);
    }

    public CharSequence i(CharSequence charSequence, m mVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? n.f2176b : n.f2175a));
        }
        if (zIsRtl != this.f2154a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? n.f2176b : n.f2175a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2156c, true);
    }

    public String k(String str, m mVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, mVar, z10).toString();
    }
}
