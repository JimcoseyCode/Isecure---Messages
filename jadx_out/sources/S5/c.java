package S5;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f10295p = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String[] f10296q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Writer f10297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f10298h = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10299i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f10301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10305o;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f10295p[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f10295p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f10296q = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        i0(6);
        this.f10301k = ":";
        this.f10305o = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f10297g = writer;
    }

    private void M0() throws IOException {
        if (this.f10304n != null) {
            d();
            y0(this.f10304n);
            this.f10304n = null;
        }
    }

    private void W() throws IOException {
        if (this.f10300j == null) {
            return;
        }
        this.f10297g.write(10);
        int i10 = this.f10299i;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f10297g.write(this.f10300j);
        }
    }

    private void d() throws IOException {
        int iG0 = g0();
        if (iG0 == 5) {
            this.f10297g.write(44);
        } else if (iG0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        W();
        k0(4);
    }

    private c d0(int i10, char c10) throws IOException {
        e();
        i0(i10);
        this.f10297g.write(c10);
        return this;
    }

    private void e() throws IOException {
        int iG0 = g0();
        if (iG0 == 1) {
            k0(2);
            W();
            return;
        }
        if (iG0 == 2) {
            this.f10297g.append(',');
            W();
        } else {
            if (iG0 == 4) {
                this.f10297g.append((CharSequence) this.f10301k);
                k0(5);
                return;
            }
            if (iG0 != 6) {
                if (iG0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f10302l) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            k0(7);
        }
    }

    private int g0() {
        int i10 = this.f10299i;
        if (i10 != 0) {
            return this.f10298h[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void i0(int i10) {
        int i11 = this.f10299i;
        int[] iArr = this.f10298h;
        if (i11 == iArr.length) {
            this.f10298h = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f10298h;
        int i12 = this.f10299i;
        this.f10299i = i12 + 1;
        iArr2[i12] = i10;
    }

    private void k0(int i10) {
        this.f10298h[this.f10299i - 1] = i10;
    }

    private c r(int i10, int i11, char c10) throws IOException {
        int iG0 = g0();
        if (iG0 != i11 && iG0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f10304n != null) {
            throw new IllegalStateException("Dangling name: " + this.f10304n);
        }
        this.f10299i--;
        if (iG0 == i11) {
            W();
        }
        this.f10297g.write(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void y0(String str) throws IOException {
        String str2;
        String[] strArr = this.f10303m ? f10296q : f10295p;
        this.f10297g.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f10297g.write(str, i10, i11 - i10);
                    }
                    this.f10297g.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                }
                this.f10297g.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f10297g.write(str, i10, length - i10);
        }
        this.f10297g.write(34);
    }

    public c A() {
        return r(3, 5, '}');
    }

    public c A0(long j10) throws IOException {
        M0();
        e();
        this.f10297g.write(Long.toString(j10));
        return this;
    }

    public final boolean B() {
        return this.f10305o;
    }

    public c D0(Boolean bool) throws IOException {
        if (bool == null) {
            return X();
        }
        M0();
        e();
        this.f10297g.write(bool.booleanValue() ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public final boolean I() {
        return this.f10303m;
    }

    public boolean J() {
        return this.f10302l;
    }

    public c J0(Number number) throws IOException {
        if (number == null) {
            return X();
        }
        M0();
        String string = number.toString();
        if (this.f10302l || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            e();
            this.f10297g.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c K0(String str) throws IOException {
        if (str == null) {
            return X();
        }
        M0();
        e();
        y0(str);
        return this;
    }

    public c L0(boolean z10) throws IOException {
        M0();
        e();
        this.f10297g.write(z10 ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public c M(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f10304n != null) {
            throw new IllegalStateException();
        }
        if (this.f10299i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f10304n = str;
        return this;
    }

    public c X() throws IOException {
        if (this.f10304n != null) {
            if (!this.f10305o) {
                this.f10304n = null;
                return this;
            }
            M0();
        }
        e();
        this.f10297g.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10297g.close();
        int i10 = this.f10299i;
        if (i10 > 1 || (i10 == 1 && this.f10298h[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10299i = 0;
    }

    public void flush() throws IOException {
        if (this.f10299i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f10297g.flush();
    }

    public c k() throws IOException {
        M0();
        return d0(1, '[');
    }

    public final void l0(boolean z10) {
        this.f10303m = z10;
    }

    public c m() throws IOException {
        M0();
        return d0(3, '{');
    }

    public c s() {
        return r(1, 2, ']');
    }

    public final void t0(String str) {
        if (str.length() == 0) {
            this.f10300j = null;
            this.f10301k = ":";
        } else {
            this.f10300j = str;
            this.f10301k = ": ";
        }
    }

    public final void u0(boolean z10) {
        this.f10302l = z10;
    }

    public final void w0(boolean z10) {
        this.f10305o = z10;
    }
}
