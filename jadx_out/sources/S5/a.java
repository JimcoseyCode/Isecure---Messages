package S5;

import N5.f;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final char[] f10268v = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Reader f10269g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f10277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f10279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f10280r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f10282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f10283u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10270h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final char[] f10271i = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10272j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10273k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10274l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10275m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f10276n = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10281s = 1;

    /* JADX INFO: renamed from: S5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0107a extends f {
        C0107a() {
        }

        @Override // N5.f
        public void a(a aVar) throws IOException {
            int iR = aVar.f10276n;
            if (iR == 0) {
                iR = aVar.r();
            }
            if (iR == 13) {
                aVar.f10276n = 9;
                return;
            }
            if (iR == 12) {
                aVar.f10276n = 8;
                return;
            }
            if (iR == 14) {
                aVar.f10276n = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.D0() + aVar.X());
        }
    }

    static {
        f.f8118a = new C0107a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f10280r = iArr;
        iArr[0] = 6;
        this.f10282t = new String[32];
        this.f10283u = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f10269g = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        k();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String A0() throws IOException {
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f10272j;
                if (i12 + i11 < this.f10273k) {
                    char c10 = this.f10271i[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 >= this.f10271i.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(this.f10271i, this.f10272j, i11);
                    this.f10272j += i11;
                } else if (B(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb != null) {
                string = new String(this.f10271i, this.f10272j, i10);
            } else {
                sb.append(this.f10271i, this.f10272j, i10);
                string = sb.toString();
            }
            this.f10272j += i10;
            return string;
        } while (B(1));
        if (sb != null) {
        }
        this.f10272j += i10;
        return string;
    }

    private boolean B(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f10271i;
        int i13 = this.f10275m;
        int i14 = this.f10272j;
        this.f10275m = i13 - i14;
        int i15 = this.f10273k;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f10273k = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f10273k = 0;
        }
        this.f10272j = 0;
        do {
            Reader reader = this.f10269g;
            int i17 = this.f10273k;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f10273k + i18;
            this.f10273k = i11;
            if (this.f10274l == 0 && (i12 = this.f10275m) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f10272j++;
                this.f10275m = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private int J0() {
        String str;
        String str2;
        int i10;
        char c10 = this.f10271i[this.f10272j];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = Constants.CASEFIRST_FALSE;
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f10272j + i11 >= this.f10273k && !B(i11 + 1)) {
                return 0;
            }
            char c11 = this.f10271i[this.f10272j + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f10272j + length < this.f10273k || B(length + 1)) && W(this.f10271i[this.f10272j + length])) {
            return 0;
        }
        this.f10272j += length;
        this.f10276n = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (W(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f10277o = r11;
        r19.f10272j += r8;
        r19.f10276n = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f10278p = r8;
        r19.f10276n = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int K0() {
        char c10;
        int i10;
        char[] cArr = this.f10271i;
        int i11 = this.f10272j;
        int i12 = this.f10273k;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z10 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c12 = 2;
            if (i11 + i14 != i12) {
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 == '+') {
                    if (c10 == 'E' || c10 == 'e') {
                        if (c11 != 2 && c11 != 4) {
                            return i10;
                        }
                        c11 = 5;
                    } else if (c10 == '-') {
                        c12 = 6;
                        if (c11 == 0) {
                            c11 = 1;
                            z10 = true;
                        } else if (c11 != 5) {
                            return i10;
                        }
                    } else if (c10 != '.') {
                        if (c10 < '0' || c10 > '9') {
                            break;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c10 - '0');
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return i10;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return i10;
                        }
                        c11 = 3;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            } else {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!B(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f10272j;
                i12 = this.f10273k;
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 == '+') {
                }
                c11 = c12;
                i14++;
                i13 = i10;
            }
        }
    }

    private void L0(int i10) {
        int i11 = this.f10281s;
        int[] iArr = this.f10280r;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f10280r = Arrays.copyOf(iArr, i12);
            this.f10283u = Arrays.copyOf(this.f10283u, i12);
            this.f10282t = (String[]) Arrays.copyOf(this.f10282t, i12);
        }
        int[] iArr2 = this.f10280r;
        int i13 = this.f10281s;
        this.f10281s = i13 + 1;
        iArr2[i13] = i10;
    }

    private char M0() throws IOException {
        int i10;
        if (this.f10272j == this.f10273k && !B(1)) {
            throw T0("Unterminated escape sequence");
        }
        char[] cArr = this.f10271i;
        int i11 = this.f10272j;
        int i12 = i11 + 1;
        this.f10272j = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f10274l++;
            this.f10275m = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw T0("Invalid escape sequence");
        }
        if (i11 + 5 > this.f10273k && !B(4)) {
            throw T0("Unterminated escape sequence");
        }
        int i13 = this.f10272j;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f10271i[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f10271i, this.f10272j, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f10272j += 4;
        return c11;
    }

    private void O0(char c10) throws IOException {
        char[] cArr = this.f10271i;
        do {
            int i10 = this.f10272j;
            int i11 = this.f10273k;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f10272j = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f10272j = i12;
                    M0();
                    i10 = this.f10272j;
                    i11 = this.f10273k;
                } else {
                    if (c11 == '\n') {
                        this.f10274l++;
                        this.f10275m = i12;
                    }
                    i10 = i12;
                }
            }
            this.f10272j = i10;
        } while (B(1));
        throw T0("Unterminated string");
    }

    private boolean P0(String str) {
        int length = str.length();
        while (true) {
            if (this.f10272j + length > this.f10273k && !B(length)) {
                return false;
            }
            char[] cArr = this.f10271i;
            int i10 = this.f10272j;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f10271i[this.f10272j + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f10274l++;
            this.f10275m = i10 + 1;
            this.f10272j++;
        }
    }

    private void Q0() {
        char c10;
        do {
            if (this.f10272j >= this.f10273k && !B(1)) {
                return;
            }
            char[] cArr = this.f10271i;
            int i10 = this.f10272j;
            int i11 = i10 + 1;
            this.f10272j = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f10274l++;
                this.f10275m = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R0() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f10272j;
                if (i11 + i10 < this.f10273k) {
                    char c10 = this.f10271i[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f10272j = i11 + i10;
                }
            }
            this.f10272j += i10;
            return;
        } while (B(1));
    }

    private IOException T0(String str) throws d {
        throw new d(str + X());
    }

    private boolean W(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        return false;
    }

    private void k() throws IOException {
        if (!this.f10270h) {
            throw T0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void m() throws IOException {
        t0(true);
        int i10 = this.f10272j - 1;
        this.f10272j = i10;
        char[] cArr = f10268v;
        if (i10 + cArr.length > this.f10273k && !B(cArr.length)) {
            return;
        }
        int i11 = 0;
        while (true) {
            char[] cArr2 = f10268v;
            if (i11 >= cArr2.length) {
                this.f10272j += cArr2.length;
                return;
            } else if (this.f10271i[this.f10272j + i11] != cArr2[i11]) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int t0(boolean z10) throws IOException {
        char[] cArr = this.f10271i;
        int i10 = this.f10272j;
        int i11 = this.f10273k;
        while (true) {
            if (i10 == i11) {
                this.f10272j = i10;
                if (!B(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + X());
                }
                i10 = this.f10272j;
                i11 = this.f10273k;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f10274l++;
                this.f10275m = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f10272j = i12;
                    if (i12 == i11) {
                        this.f10272j = i10;
                        boolean zB = B(2);
                        this.f10272j++;
                        if (!zB) {
                            break;
                        }
                        break;
                        break;
                    }
                    k();
                    int i13 = this.f10272j;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f10272j = i13 + 1;
                        if (!P0("*/")) {
                            throw T0("Unterminated comment");
                        }
                        i10 = this.f10272j + 2;
                        i11 = this.f10273k;
                    } else {
                        if (c11 != '/') {
                            break;
                        }
                        this.f10272j = i13 + 1;
                        Q0();
                        i10 = this.f10272j;
                        i11 = this.f10273k;
                    }
                } else {
                    if (c10 != '#') {
                        this.f10272j = i12;
                        return c10;
                    }
                    this.f10272j = i12;
                    k();
                    Q0();
                    i10 = this.f10272j;
                    i11 = this.f10273k;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f10272j = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String w0(char c10) throws IOException {
        char[] cArr = this.f10271i;
        StringBuilder sb = null;
        do {
            int i10 = this.f10272j;
            int i11 = this.f10273k;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f10272j = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb.append(cArr, i13, i15);
                        return sb.toString();
                    }
                    if (c11 == '\\') {
                        this.f10272j = i14;
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i16 * 2, 16));
                        }
                        sb.append(cArr, i13, i17);
                        sb.append(M0());
                        i10 = this.f10272j;
                        i11 = this.f10273k;
                    } else {
                        if (c11 == '\n') {
                            this.f10274l++;
                            this.f10275m = i14;
                        }
                        i10 = i14;
                    }
                }
                break;
            }
        } while (B(1));
        throw T0("Unterminated string");
    }

    public void A() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + D0() + X());
        }
        int i10 = this.f10281s;
        int i11 = i10 - 1;
        this.f10281s = i11;
        this.f10282t[i11] = null;
        int[] iArr = this.f10283u;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f10276n = 0;
    }

    public b D0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        switch (iR) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return b.NAME;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f10281s;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f10280r[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.f10283u[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.f10282t[i11];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean J() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        return (iR == 2 || iR == 4) ? false : true;
    }

    public final boolean M() {
        return this.f10270h;
    }

    public final void N0(boolean z10) {
        this.f10270h = z10;
    }

    public void S0() throws IOException {
        int i10 = 0;
        do {
            int iR = this.f10276n;
            if (iR == 0) {
                iR = r();
            }
            if (iR == 3) {
                L0(1);
            } else if (iR == 1) {
                L0(3);
            } else if (iR == 4 || iR == 2) {
                this.f10281s--;
                i10--;
                this.f10276n = 0;
            } else {
                if (iR == 14 || iR == 10) {
                    R0();
                } else if (iR == 8 || iR == 12) {
                    O0('\'');
                } else if (iR == 9 || iR == 13) {
                    O0('\"');
                } else if (iR == 16) {
                    this.f10272j += this.f10278p;
                }
                this.f10276n = 0;
            }
            i10++;
            this.f10276n = 0;
        } while (i10 != 0);
        int[] iArr = this.f10283u;
        int i11 = this.f10281s;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f10282t[i11 - 1] = "null";
    }

    String X() {
        return " at line " + (this.f10274l + 1) + " column " + ((this.f10272j - this.f10275m) + 1) + " path " + I();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10276n = 0;
        this.f10280r[0] = 8;
        this.f10281s = 1;
        this.f10269g.close();
    }

    public void d() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 3) {
            L0(1);
            this.f10283u[this.f10281s - 1] = 0;
            this.f10276n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + D0() + X());
        }
    }

    public boolean d0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 5) {
            this.f10276n = 0;
            int[] iArr = this.f10283u;
            int i10 = this.f10281s - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iR == 6) {
            this.f10276n = 0;
            int[] iArr2 = this.f10283u;
            int i11 = this.f10281s - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + D0() + X());
    }

    public void e() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 1) {
            L0(3);
            this.f10276n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + D0() + X());
        }
    }

    public double g0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f10276n = 0;
            int[] iArr = this.f10283u;
            int i10 = this.f10281s - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f10277o;
        }
        if (iR == 16) {
            this.f10279q = new String(this.f10271i, this.f10272j, this.f10278p);
            this.f10272j += this.f10278p;
        } else if (iR == 8 || iR == 9) {
            this.f10279q = w0(iR == 8 ? '\'' : '\"');
        } else if (iR == 10) {
            this.f10279q = A0();
        } else if (iR != 11) {
            throw new IllegalStateException("Expected a double but was " + D0() + X());
        }
        this.f10276n = 11;
        double d10 = Double.parseDouble(this.f10279q);
        if (!this.f10270h && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + X());
        }
        this.f10279q = null;
        this.f10276n = 0;
        int[] iArr2 = this.f10283u;
        int i11 = this.f10281s - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int i0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            long j10 = this.f10277o;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f10276n = 0;
                int[] iArr = this.f10283u;
                int i11 = this.f10281s - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f10277o + X());
        }
        if (iR == 16) {
            this.f10279q = new String(this.f10271i, this.f10272j, this.f10278p);
            this.f10272j += this.f10278p;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw new IllegalStateException("Expected an int but was " + D0() + X());
            }
            if (iR == 10) {
                this.f10279q = A0();
            } else {
                this.f10279q = w0(iR == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f10279q);
                this.f10276n = 0;
                int[] iArr2 = this.f10283u;
                int i13 = this.f10281s - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f10276n = 11;
        double d10 = Double.parseDouble(this.f10279q);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f10279q + X());
        }
        this.f10279q = null;
        this.f10276n = 0;
        int[] iArr3 = this.f10283u;
        int i15 = this.f10281s - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long k0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f10276n = 0;
            int[] iArr = this.f10283u;
            int i10 = this.f10281s - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f10277o;
        }
        if (iR == 16) {
            this.f10279q = new String(this.f10271i, this.f10272j, this.f10278p);
            this.f10272j += this.f10278p;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw new IllegalStateException("Expected a long but was " + D0() + X());
            }
            if (iR == 10) {
                this.f10279q = A0();
            } else {
                this.f10279q = w0(iR == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f10279q);
                this.f10276n = 0;
                int[] iArr2 = this.f10283u;
                int i11 = this.f10281s - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f10276n = 11;
        double d10 = Double.parseDouble(this.f10279q);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f10279q + X());
        }
        this.f10279q = null;
        this.f10276n = 0;
        int[] iArr3 = this.f10283u;
        int i12 = this.f10281s - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String l0() throws IOException {
        String strW0;
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 14) {
            strW0 = A0();
        } else if (iR == 12) {
            strW0 = w0('\'');
        } else {
            if (iR != 13) {
                throw new IllegalStateException("Expected a name but was " + D0() + X());
            }
            strW0 = w0('\"');
        }
        this.f10276n = 0;
        this.f10282t[this.f10281s - 1] = strW0;
        return strW0;
    }

    int r() throws IOException {
        int iT0;
        int[] iArr = this.f10280r;
        int i10 = this.f10281s;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iT02 = t0(true);
            if (iT02 != 44) {
                if (iT02 != 59) {
                    if (iT02 != 93) {
                        throw T0("Unterminated array");
                    }
                    this.f10276n = 4;
                    return 4;
                }
                k();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iT0 = t0(true)) != 44) {
                    if (iT0 != 59) {
                        if (iT0 != 125) {
                            throw T0("Unterminated object");
                        }
                        this.f10276n = 2;
                        return 2;
                    }
                    k();
                }
                int iT03 = t0(true);
                if (iT03 == 34) {
                    this.f10276n = 13;
                    return 13;
                }
                if (iT03 == 39) {
                    k();
                    this.f10276n = 12;
                    return 12;
                }
                if (iT03 == 125) {
                    if (i11 == 5) {
                        throw T0("Expected name");
                    }
                    this.f10276n = 2;
                    return 2;
                }
                k();
                this.f10272j--;
                if (!W((char) iT03)) {
                    throw T0("Expected name");
                }
                this.f10276n = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iT04 = t0(true);
                if (iT04 != 58) {
                    if (iT04 != 61) {
                        throw T0("Expected ':'");
                    }
                    k();
                    if (this.f10272j < this.f10273k || B(1)) {
                        char[] cArr = this.f10271i;
                        int i12 = this.f10272j;
                        if (cArr[i12] == '>') {
                            this.f10272j = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f10270h) {
                    m();
                }
                this.f10280r[this.f10281s - 1] = 7;
            } else if (i11 == 7) {
                if (t0(false) == -1) {
                    this.f10276n = 17;
                    return 17;
                }
                k();
                this.f10272j--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iT05 = t0(true);
        if (iT05 == 34) {
            this.f10276n = 9;
            return 9;
        }
        if (iT05 == 39) {
            k();
            this.f10276n = 8;
            return 8;
        }
        if (iT05 != 44 && iT05 != 59) {
            if (iT05 == 91) {
                this.f10276n = 3;
                return 3;
            }
            if (iT05 != 93) {
                if (iT05 == 123) {
                    this.f10276n = 1;
                    return 1;
                }
                this.f10272j--;
                int iJ0 = J0();
                if (iJ0 != 0) {
                    return iJ0;
                }
                int iK0 = K0();
                if (iK0 != 0) {
                    return iK0;
                }
                if (!W(this.f10271i[this.f10272j])) {
                    throw T0("Expected value");
                }
                k();
                this.f10276n = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f10276n = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw T0("Unexpected value");
        }
        k();
        this.f10272j--;
        this.f10276n = 7;
        return 7;
    }

    public void s() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + D0() + X());
        }
        int i10 = this.f10281s;
        this.f10281s = i10 - 1;
        int[] iArr = this.f10283u;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f10276n = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + X();
    }

    public void u0() throws IOException {
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 7) {
            this.f10276n = 0;
            int[] iArr = this.f10283u;
            int i10 = this.f10281s - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + D0() + X());
    }

    public String y0() throws IOException {
        String str;
        int iR = this.f10276n;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 10) {
            str = A0();
        } else if (iR == 8) {
            str = w0('\'');
        } else if (iR == 9) {
            str = w0('\"');
        } else if (iR == 11) {
            str = this.f10279q;
            this.f10279q = null;
        } else if (iR == 15) {
            str = Long.toString(this.f10277o);
        } else {
            if (iR != 16) {
                throw new IllegalStateException("Expected a string but was " + D0() + X());
            }
            str = new String(this.f10271i, this.f10272j, this.f10278p);
            this.f10272j += this.f10278p;
        }
        this.f10276n = 0;
        int[] iArr = this.f10283u;
        int i10 = this.f10281s - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }
}
