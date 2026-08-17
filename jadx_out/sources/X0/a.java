package X0;

import X0.b;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final SimpleDateFormat f12243V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final SimpleDateFormat f12244W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final e[] f12248a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final e[] f12249b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final e[] f12250c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final e[] f12251d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final e[] f12252e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final e f12253f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final e[] f12254g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final e[] f12255h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final e[] f12256i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final e[] f12257j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final e[][] f12258k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final e[] f12259l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f12260m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap[] f12261n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Set f12262o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final HashMap f12263p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Charset f12264q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final byte[] f12265r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final byte[] f12266s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f12267t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f12268u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f12269v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Pattern f12271w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f12276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f12277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f12280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f12281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f12282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f12286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f12288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f12295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f12270w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f12272x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f12273y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12274z = {8, 8, 8};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f12222A = {4};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f12223B = {8};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final byte[] f12224C = {-1, -40, -1};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final byte[] f12225D = {102, 116, 121, 112};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final byte[] f12226E = {109, 105, 102, 49};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[] f12227F = {104, 101, 105, 99};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final byte[] f12228G = {97, 118, 105, 102};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f12229H = {97, 118, 105, 115};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final byte[] f12230I = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f12231J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final byte[] f12232K = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final byte[] f12233L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final byte[] f12234M = {82, 73, 70, 70};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f12235N = {87, 69, 66, 80};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f12236O = {69, 88, 73, 70};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final byte[] f12237P = {-99, 1, 42};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f12238Q = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final byte[] f12239R = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final byte[] f12240S = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final byte[] f12241T = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final byte[] f12242U = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String[] f12245X = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final int[] f12246Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final byte[] f12247Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final DataOutputStream f12305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteOrder f12306h;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f12305g = new DataOutputStream(outputStream);
            this.f12306h = byteOrder;
        }

        public void d(ByteOrder byteOrder) {
            this.f12306h = byteOrder;
        }

        public void e(int i10) throws IOException {
            this.f12305g.write(i10);
        }

        public void k(int i10) throws IOException {
            ByteOrder byteOrder = this.f12306h;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f12305g.write(i10 & 255);
                this.f12305g.write((i10 >>> 8) & 255);
                this.f12305g.write((i10 >>> 16) & 255);
                this.f12305g.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f12305g.write((i10 >>> 24) & 255);
                this.f12305g.write((i10 >>> 16) & 255);
                this.f12305g.write((i10 >>> 8) & 255);
                this.f12305g.write(i10 & 255);
            }
        }

        public void m(short s10) throws IOException {
            ByteOrder byteOrder = this.f12306h;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f12305g.write(s10 & 255);
                this.f12305g.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f12305g.write((s10 >>> 8) & 255);
                this.f12305g.write(s10 & 255);
            }
        }

        public void r(long j10) throws IOException {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            k((int) j10);
        }

        public void s(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            m((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f12305g.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f12305g.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f12310d;

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f12264q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f12315a);
                byteBufferWrap.putInt((int) fVar.f12316b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f12264q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f12315a);
                byteBufferWrap.putInt((int) fVar.f12316b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f12246Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i10 < fVarArr.length) {
                sb.append(fVarArr[i10].f12315a);
                sb.append('/');
                sb.append(fVarArr[i10].f12316b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th;
            b bVar;
            byte b10;
            byte b11;
            b bVar2 = null;
            try {
                bVar = new b(this.f12310d);
                try {
                    bVar.r(byteOrder);
                    int length = 0;
                    switch (this.f12307a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.f12310d;
                            if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                String str = new String(bArr, a.f12264q0);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b10 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f12308b >= a.f12247Z.length) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= a.f12247Z.length) {
                                        length = a.f12247Z.length;
                                    } else if (this.f12310d[i10] == a.f12247Z[i10]) {
                                        i10++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.f12308b && (b11 = this.f12310d[length]) != 0) {
                                if (b11 >= 32) {
                                    sb.append((char) b11);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string = sb.toString();
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return string;
                        case 3:
                            int[] iArr = new int[this.f12308b];
                            while (length < this.f12308b) {
                                iArr[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f12308b];
                            while (length < this.f12308b) {
                                jArr[length] = bVar.m();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            f[] fVarArr = new f[this.f12308b];
                            while (length < this.f12308b) {
                                fVarArr[length] = new f(bVar.m(), bVar.m(), null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused6) {
                            }
                            return fVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f12308b];
                            while (length < this.f12308b) {
                                iArr2[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f12308b];
                            while (length < this.f12308b) {
                                iArr3[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            f[] fVarArr2 = new f[this.f12308b];
                            while (length < this.f12308b) {
                                fVarArr2[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused9) {
                            }
                            return fVarArr2;
                        case 11:
                            double[] dArr = new double[this.f12308b];
                            while (length < this.f12308b) {
                                dArr[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f12308b];
                            while (length < this.f12308b) {
                                dArr2[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    if (bVar2 == null) {
                        throw th;
                    }
                    try {
                        bVar2.close();
                        throw th;
                    } catch (IOException unused15) {
                        throw th;
                    }
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public int p() {
            return a.f12246Y[this.f12307a] * this.f12308b;
        }

        public String toString() {
            return "(" + a.f12245X[this.f12307a] + ", data length:" + this.f12310d.length + ")";
        }

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f12307a = i10;
            this.f12308b = i11;
            this.f12309c = j10;
            this.f12310d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12316b;

        /* synthetic */ f(long j10, long j11, C0130a c0130a) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new f(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = dAbs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(dAbs - (j10 / j11)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new f(j10, j11);
        }

        public double a() {
            return this.f12315a / this.f12316b;
        }

        public String toString() {
            return this.f12315a + "/" + this.f12316b;
        }

        private f(long j10, long j11) {
            if (j11 == 0) {
                this.f12315a = 0L;
                this.f12316b = 1L;
            } else {
                this.f12315a = j10;
                this.f12316b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", ReactFontManager.TypefaceStyle.BOLD, 1)};
        f12248a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f12249b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f12250c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f12251d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f12252e0 = eVarArr5;
        f12253f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f12254g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f12255h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f12256i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f12257j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f12258k0 = eVarArr10;
        f12259l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f12260m0 = new HashMap[eVarArr10.length];
        f12261n0 = new HashMap[eVarArr10.length];
        f12262o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f12263p0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f12264q0 = charsetForName;
        f12265r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f12266s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f12243V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f12244W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f12258k0;
            if (i10 >= eVarArr11.length) {
                HashMap map = f12263p0;
                e[] eVarArr12 = f12259l0;
                map.put(Integer.valueOf(eVarArr12[0].f12311a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f12311a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f12311a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f12311a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f12311a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f12311a), 8);
                f12267t0 = Pattern.compile(".*[1-9].*");
                f12268u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f12269v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f12271w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f12260m0[i10] = new HashMap();
            f12261n0[i10] = new HashMap();
            for (e eVar : eVarArr11[i10]) {
                f12260m0[i10].put(Integer.valueOf(eVar.f12311a), eVar);
                f12261n0[i10].put(eVar.f12312b, eVar);
            }
            i10++;
        }
    }

    public a(File file) throws Throwable {
        e[][] eVarArr = f12258k0;
        this.f12280f = new HashMap[eVarArr.length];
        this.f12281g = new HashSet(eVarArr.length);
        this.f12282h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        F(file.getAbsolutePath());
    }

    private void A(b bVar) throws Throwable {
        if (f12270w) {
            Objects.toString(bVar);
        }
        bVar.r(ByteOrder.LITTLE_ENDIAN);
        bVar.s(f12234M.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f12235N;
        bVar.s(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f12236O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f12265r0;
                    if (X0.b.f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f12290p = i12;
                    V(bArrCopyOfRange, 0);
                    h0(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.s(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    private static int B(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair C(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairC = C(strArrSplit[0]);
            if (((Integer) pairC.first).intValue() == 2) {
                return pairC;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairC2 = C(strArrSplit[i10]);
                int iIntValue = (((Integer) pairC2.first).equals(pairC.first) || ((Integer) pairC2.second).equals(pairC.first)) ? ((Integer) pairC.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairC.second).intValue() == -1 || !(((Integer) pairC2.first).equals(pairC.second) || ((Integer) pairC2.second).equals(pairC.second))) ? -1 : ((Integer) pairC.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairC;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    private void D(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f12282h);
        int iM2 = dVar2.m(this.f12282h);
        if (this.f12278d == 7) {
            iM += this.f12291q;
        }
        if (iM <= 0 || iM2 <= 0) {
            return;
        }
        this.f12283i = true;
        if (this.f12275a == null && this.f12277c == null && this.f12276b == null) {
            byte[] bArr = new byte[iM2];
            bVar.s(iM);
            bVar.readFully(bArr);
            this.f12288n = bArr;
        }
        this.f12286l = iM;
        this.f12287m = iM2;
    }

    private void E(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = X0.b.c(dVar.o(this.f12282h));
        long[] jArrC2 = X0.b.c(dVar2.o(this.f12282h));
        if (jArrC == null || jArrC.length == 0 || jArrC2 == null || jArrC2.length == 0 || jArrC.length != jArrC2.length) {
            return;
        }
        long j10 = 0;
        for (long j11 : jArrC2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f12285k = true;
        this.f12284j = true;
        this.f12283i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrC.length; i13++) {
            int i14 = (int) jArrC[i13];
            int i15 = (int) jArrC2[i13];
            if (i13 < jArrC.length - 1 && i14 + i15 != jArrC[i13 + 1]) {
                this.f12285k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                return;
            }
            try {
                bVar.s(i16);
                int i17 = i11 + i16;
                byte[] bArr2 = new byte[i15];
                bVar.readFully(bArr2);
                i11 = i17 + i15;
                System.arraycopy(bArr2, 0, bArr, i12, i15);
                i12 += i15;
            } catch (EOFException unused) {
                return;
            }
        }
        this.f12288n = bArr;
        if (this.f12285k) {
            this.f12286l = (int) jArrC[0];
            this.f12287m = i10;
        }
    }

    private void F(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f12277c = null;
        this.f12275a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (M(fileInputStream.getFD())) {
                this.f12276b = fileInputStream.getFD();
            } else {
                this.f12276b = null;
            }
            R(fileInputStream);
            X0.b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            X0.b.b(fileInputStream2);
            throw th;
        }
    }

    private int G(byte[] bArr) throws Throwable {
        b bVar;
        long j10;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = bVar.readInt();
            byte[] bArr2 = new byte[4];
            bVar.readFully(bArr2);
            if (!Arrays.equals(bArr2, f12225D)) {
                bVar.close();
                return 0;
            }
            if (length == 1) {
                length = bVar.readLong();
                j10 = 16;
                if (length < 16) {
                    bVar.close();
                    return 0;
                }
            } else {
                j10 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j11 = length - j10;
            if (j11 < 8) {
                bVar.close();
                return 0;
            }
            byte[] bArr3 = new byte[4];
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (long j12 = 0; j12 < j11 / 4; j12++) {
                try {
                    bVar.readFully(bArr3);
                    if (j12 != 1) {
                        if (Arrays.equals(bArr3, f12226E)) {
                            z10 = true;
                        } else if (Arrays.equals(bArr3, f12227F)) {
                            z11 = true;
                        } else if (Arrays.equals(bArr3, f12228G) || Arrays.equals(bArr3, f12229H)) {
                            z12 = true;
                        }
                        if (!z10) {
                            continue;
                        } else {
                            if (z11) {
                                bVar.close();
                                return 12;
                            }
                            if (z12) {
                                bVar.close();
                                return 15;
                            }
                        }
                    }
                } catch (EOFException unused2) {
                    bVar.close();
                    return 0;
                }
            }
            bVar.close();
        } catch (Exception unused3) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        return 0;
    }

    private static boolean H(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f12224C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean I(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderU = U(bVar2);
                this.f12282h = byteOrderU;
                bVar2.r(byteOrderU);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean J(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f12232K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean K(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean L(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderU = U(bVar2);
                this.f12282h = byteOrderU;
                bVar2.r(byteOrderU);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean M(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean N(HashMap map) throws Throwable {
        d dVar;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.o(this.f12282h);
        int[] iArr2 = f12274z;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f12278d != 3 || (dVar = (d) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iM = dVar.m(this.f12282h);
        return (iM == 1 && Arrays.equals(iArr, f12223B)) || (iM == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean O(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean P(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f12282h) <= 512 && dVar2.m(this.f12282h) <= 512;
    }

    private boolean Q(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f12234M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f12235N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f12234M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void R(InputStream inputStream) throws Throwable {
        for (int i10 = 0; i10 < f12258k0.length; i10++) {
            try {
                try {
                    this.f12280f[i10] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z10 = f12270w;
                    e();
                    if (z10) {
                        T();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                e();
                if (f12270w) {
                    T();
                }
                throw th;
            }
        }
        if (!this.f12279e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f12278d = r(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (i0(this.f12278d)) {
            g gVar = new g(inputStream);
            if (!this.f12279e) {
                int i11 = this.f12278d;
                if (i11 == 12 || i11 == 15) {
                    o(gVar, i11);
                } else if (i11 == 7) {
                    s(gVar);
                } else if (i11 == 10) {
                    w(gVar);
                } else {
                    v(gVar);
                }
            } else if (!x(gVar)) {
                e();
                if (f12270w) {
                    T();
                    return;
                }
                return;
            }
            gVar.A(this.f12290p);
            h0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f12278d;
            if (i12 == 4) {
                p(bVar, 0, 0);
            } else if (i12 == 13) {
                t(bVar);
            } else if (i12 == 9) {
                u(bVar);
            } else if (i12 == 14) {
                A(bVar);
            }
        }
        e();
        if (f12270w) {
            T();
        }
    }

    private void S(b bVar) throws IOException {
        ByteOrder byteOrderU = U(bVar);
        this.f12282h = byteOrderU;
        bVar.r(byteOrderU);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f12278d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.s(i12);
        }
    }

    private void T() throws Throwable {
        for (int i10 = 0; i10 < this.f12280f.length; i10++) {
            this.f12280f[i10].size();
            for (Map.Entry entry : this.f12280f[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                dVar.toString();
                dVar.n(this.f12282h);
            }
        }
    }

    private ByteOrder U(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void V(byte[] bArr, int i10) throws IOException {
        g gVar = new g(bArr);
        S(gVar);
        W(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void W(g gVar, int i10) throws IOException {
        short s10;
        long j10;
        int i11;
        long j11;
        boolean z10;
        short s11;
        boolean z11;
        int i12;
        int unsignedShort;
        long jM;
        int i13 = i10;
        this.f12281g.add(Integer.valueOf(gVar.e()));
        short s12 = gVar.readShort();
        if (s12 <= 0) {
            return;
        }
        short s13 = 0;
        while (s13 < s12) {
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i14 = gVar.readInt();
            long jE = ((long) gVar.e()) + 4;
            e eVar = (e) f12260m0[i13].get(Integer.valueOf(unsignedShort2));
            boolean z12 = f12270w;
            if (z12) {
                j10 = 4;
                i11 = 4;
                s10 = s12;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i13), Integer.valueOf(unsignedShort2), eVar != null ? eVar.f12312b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14));
            } else {
                s10 = s12;
                j10 = 4;
                i11 = 4;
            }
            if (eVar != null && unsignedShort3 > 0) {
                int[] iArr = f12246Y;
                if (unsignedShort3 >= iArr.length) {
                    j11 = 0;
                } else if (eVar.a(unsignedShort3)) {
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = eVar.f12313c;
                    }
                    j11 = ((long) i14) * ((long) iArr[unsignedShort3]);
                    z10 = j11 >= 0 && j11 <= 2147483647L;
                } else {
                    if (z12) {
                        String str = f12245X[unsignedShort3];
                    }
                    j11 = 0;
                }
            }
            if (z10) {
                if (j11 > j10) {
                    int i15 = gVar.readInt();
                    s11 = s13;
                    if (this.f12278d != 7) {
                        z11 = z12;
                        i12 = unsignedShort2;
                        gVar.A(i15);
                    } else {
                        if ("MakerNote".equals(eVar.f12312b)) {
                            this.f12291q = i15;
                        } else {
                            if (i13 == 6 && "ThumbnailImage".equals(eVar.f12312b)) {
                                this.f12292r = i15;
                                this.f12293s = i14;
                                d dVarJ = d.j(6, this.f12282h);
                                z11 = z12;
                                d dVarF = d.f(this.f12292r, this.f12282h);
                                i12 = unsignedShort2;
                                d dVarF2 = d.f(this.f12293s, this.f12282h);
                                this.f12280f[i11].put("Compression", dVarJ);
                                this.f12280f[i11].put("JPEGInterchangeFormat", dVarF);
                                this.f12280f[i11].put("JPEGInterchangeFormatLength", dVarF2);
                            }
                            gVar.A(i15);
                        }
                        z11 = z12;
                        i12 = unsignedShort2;
                        gVar.A(i15);
                    }
                } else {
                    s11 = s13;
                    z11 = z12;
                    i12 = unsignedShort2;
                }
                Integer num = (Integer) f12263p0.get(Integer.valueOf(i12));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jM = gVar.m();
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = gVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = gVar.readInt();
                        } else {
                            jM = -1;
                        }
                        if (z11) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jM), eVar.f12312b);
                        }
                        if (jM > 0 || (gVar.d() != -1 && jM >= gVar.d())) {
                            if (z11) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Skip jump into the IFD since its offset is invalid: ");
                                sb.append(jM);
                                if (gVar.d() != -1) {
                                    gVar.d();
                                }
                            }
                        } else if (!this.f12281g.contains(Integer.valueOf((int) jM))) {
                            gVar.A(jM);
                            W(gVar, num.intValue());
                        }
                        gVar.A(jE);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jM = unsignedShort;
                    if (z11) {
                    }
                    if (jM > 0) {
                        if (z11) {
                        }
                        gVar.A(jE);
                    }
                } else {
                    int iE = gVar.e() + this.f12290p;
                    byte[] bArr = new byte[(int) j11];
                    gVar.readFully(bArr);
                    d dVar = new d(unsignedShort3, i14, iE, bArr);
                    this.f12280f[i10].put(eVar.f12312b, dVar);
                    if ("DNGVersion".equals(eVar.f12312b)) {
                        this.f12278d = 3;
                    }
                    if ((("Make".equals(eVar.f12312b) || "Model".equals(eVar.f12312b)) && dVar.n(this.f12282h).contains("PENTAX")) || ("Compression".equals(eVar.f12312b) && dVar.m(this.f12282h) == 65535)) {
                        this.f12278d = 8;
                    }
                    if (gVar.e() != jE) {
                        gVar.A(jE);
                    }
                }
            } else {
                gVar.A(jE);
                s11 = s13;
            }
            s13 = (short) (s11 + 1);
            i13 = i10;
            s12 = s10;
        }
        int i16 = gVar.readInt();
        if (f12270w) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i16));
        }
        long j12 = i16;
        if (j12 <= 0 || this.f12281g.contains(Integer.valueOf(i16))) {
            return;
        }
        gVar.A(j12);
        if (this.f12280f[4].isEmpty()) {
            W(gVar, 4);
        } else if (this.f12280f[5].isEmpty()) {
            W(gVar, 5);
        }
    }

    private void X(String str) {
        for (int i10 = 0; i10 < f12258k0.length; i10++) {
            this.f12280f[i10].remove(str);
        }
    }

    private void Y(int i10, String str, String str2) {
        if (this.f12280f[i10].isEmpty() || this.f12280f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f12280f[i10];
        map.put(str2, (d) map.get(str));
        this.f12280f[i10].remove(str);
    }

    private void Z(g gVar, int i10) throws Throwable {
        d dVar = (d) this.f12280f[i10].get("ImageLength");
        d dVar2 = (d) this.f12280f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f12280f[i10].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f12280f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f12282h);
            int iM2 = dVar3.m(this.f12282h);
            gVar.A(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            p(new b(bArr), iM, i10);
        }
    }

    private void b0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (f12270w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-40);
        cVar.e(-1);
        cVar.e(-31);
        this.f12290p = n0(cVar);
        if (this.f12295u != null) {
            cVar.write(-1);
            cVar.e(-31);
            byte[] bArr2 = f12266s0;
            cVar.s(bArr2.length + 2 + this.f12295u.f12310d.length);
            cVar.write(bArr2);
            cVar.write(this.f12295u.f12310d);
            this.f12296v = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.e(-1);
                cVar.e(b10);
                X0.b.d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.e(-1);
                cVar.e(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.s(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr3, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f12266s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f12265r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (X0.b.f(bArr, f12265r0) || X0.b.f(bArr, bArr4)) {
                        bVar.s(length - bArr.length);
                    }
                }
                cVar.e(-1);
                cVar.e(b10);
                cVar.s(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i12 >= 0) {
                        cVar.write(bArr3, 0, i12);
                        length -= i12;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005b -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = X0.a.f12270w
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            X0.a$b r0 = new X0.a$b
            r0.<init>(r9)
            X0.a$c r9 = new X0.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = X0.a.f12232K
            int r10 = r10.length
            X0.b.e(r0, r9, r10)
            X0.a$d r10 = r8.f12295u
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.f12296v
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            X0.b.d(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.k(r3)
            r9.k(r4)
            int r3 = r3 + 4
            X0.b.e(r0, r9, r3)
            int r3 = r8.f12290p
            if (r3 != 0) goto L50
            r8.o0(r9)
            r1 = r2
        L50:
            X0.a$d r3 = r8.f12295u
            if (r3 == 0) goto L27
            boolean r3 = r8.f12296v
            if (r3 != 0) goto L27
            r8.p0(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.o0(r9)
            int r3 = r3 + 4
            r0.s(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = X0.a.f12233L
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            X0.a$d r10 = r8.f12295u
            if (r10 == 0) goto L8f
            r8.p0(r9)
        L8f:
            r0.s(r6)
            goto L5b
        L93:
            r9.k(r3)
            r9.k(r4)
            r9.write(r7)
            X0.b.e(r0, r9, r6)
            goto L27
        La0:
            r9.k(r3)
            r9.k(r4)
            int r3 = r3 + 4
            X0.b.e(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.c0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6 A[Catch: all -> 0x0061, Exception -> 0x0065, TryCatch #5 {Exception -> 0x0065, all -> 0x0061, blocks: (B:7:0x0032, B:9:0x003e, B:11:0x0052, B:12:0x0054, B:80:0x01da, B:82:0x01f6, B:83:0x01ff, B:19:0x0069, B:21:0x0078, B:23:0x0080, B:25:0x0084, B:28:0x0094, B:30:0x009f, B:31:0x00a4, B:32:0x00a6, B:36:0x00b4, B:37:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00d1, B:45:0x00df, B:47:0x00e7, B:50:0x00ee, B:52:0x00fd, B:54:0x010d, B:69:0x0169, B:71:0x0175, B:72:0x017c, B:74:0x01b6, B:79:0x01d3, B:76:0x01c4, B:78:0x01cc, B:55:0x0121, B:56:0x0128, B:57:0x0129, B:59:0x0133, B:61:0x0139, B:65:0x0152, B:66:0x015a, B:67:0x0161), top: B:98:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iN0;
        boolean z10;
        if (f12270w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f12234M;
        X0.b.e(bVar, cVar, bArr.length);
        int i15 = bVar.readInt();
        byte[] bArr2 = f12235N;
        bVar.s(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i16 = this.f12290p;
            if (i16 != 0) {
                X0.b.e(bVar, cVar2, (i16 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.s(4);
                int i17 = bVar.readInt();
                if (i17 % 2 != 0) {
                    i17++;
                }
                bVar.s(i17);
                iN0 = n0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = f12238Q;
                boolean z11 = true;
                if (!Arrays.equals(bArr3, bArr4)) {
                    byte[] bArr5 = f12240S;
                    if (!Arrays.equals(bArr3, bArr5) && !Arrays.equals(bArr3, f12239R)) {
                        iN0 = -1;
                        i10 = -1;
                        X0.b.e(bVar, cVar2, (i15 + 8) - bVar.e());
                        int size = byteArrayOutputStream.size();
                        byte[] bArr6 = f12235N;
                        cVar.k(size + bArr6.length);
                        cVar.write(bArr6);
                        if (iN0 != i10) {
                            this.f12290p = cVar.f12305g.size() + iN0;
                        }
                        byteArrayOutputStream.writeTo(cVar);
                        X0.b.d(bVar, cVar);
                        X0.b.b(byteArrayOutputStream);
                    }
                    int i18 = bVar.readInt();
                    int i19 = i18 % 2 == 1 ? i18 + 1 : i18;
                    byte[] bArr7 = new byte[3];
                    if (Arrays.equals(bArr3, bArr5)) {
                        bVar.readFully(bArr7);
                        byte[] bArr8 = new byte[3];
                        bVar.readFully(bArr8);
                        if (!Arrays.equals(f12237P, bArr8)) {
                            throw new IOException("Error checking VP8 signature");
                        }
                        i13 = bVar.readInt();
                        i10 = -1;
                        i12 = (i13 >> 16) & 16383;
                        i11 = i19 - 10;
                        i14 = i13 & 16383;
                        z11 = false;
                    } else {
                        i10 = -1;
                        if (!Arrays.equals(bArr3, f12239R)) {
                            i11 = i19;
                            i12 = 0;
                            i13 = 0;
                            z11 = false;
                            i14 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i13 = bVar.readInt();
                            int i20 = (i13 & 16383) + 1;
                            int i21 = ((i13 & 268419072) >>> 14) + 1;
                            if ((i13 & 268435456) == 0) {
                                z11 = false;
                            }
                            i11 = i19 - 5;
                            i14 = i20;
                            i12 = i21;
                        }
                    }
                    cVar2.write(bArr4);
                    cVar2.k(10);
                    byte[] bArr9 = new byte[10];
                    if (z11) {
                        bArr9[0] = (byte) (bArr9[0] | 16);
                    }
                    bArr9[0] = (byte) (bArr9[0] | 8);
                    int i22 = i14 - 1;
                    int i23 = i12 - 1;
                    bArr9[4] = (byte) i22;
                    bArr9[5] = (byte) (i22 >> 8);
                    bArr9[6] = (byte) (i22 >> 16);
                    bArr9[7] = (byte) i23;
                    bArr9[8] = (byte) (i23 >> 8);
                    bArr9[9] = (byte) (i23 >> 16);
                    cVar2.write(bArr9);
                    cVar2.write(bArr3);
                    cVar2.k(i18);
                    if (Arrays.equals(bArr3, bArr5)) {
                        cVar2.write(bArr7);
                        cVar2.write(f12237P);
                        cVar2.k(i13);
                    } else if (Arrays.equals(bArr3, f12239R)) {
                        cVar2.write(47);
                        cVar2.k(i13);
                    }
                    X0.b.e(bVar, cVar2, i11);
                    iN0 = n0(cVar2);
                    X0.b.e(bVar, cVar2, (i15 + 8) - bVar.e());
                    int size2 = byteArrayOutputStream.size();
                    byte[] bArr62 = f12235N;
                    cVar.k(size2 + bArr62.length);
                    cVar.write(bArr62);
                    if (iN0 != i10) {
                    }
                    byteArrayOutputStream.writeTo(cVar);
                    X0.b.d(bVar, cVar);
                    X0.b.b(byteArrayOutputStream);
                }
                int i24 = bVar.readInt();
                byte[] bArr10 = new byte[i24 % 2 == 1 ? i24 + 1 : i24];
                bVar.readFully(bArr10);
                byte b10 = (byte) (bArr10[0] | 8);
                bArr10[0] = b10;
                boolean z12 = ((b10 >> 1) & 1) == 1;
                cVar2.write(bArr4);
                cVar2.k(i24);
                cVar2.write(bArr10);
                if (z12) {
                    h(bVar, cVar2, f12241T, null);
                    while (true) {
                        byte[] bArr11 = new byte[4];
                        try {
                            bVar.readFully(bArr11);
                            z10 = !Arrays.equals(bArr11, f12242U);
                        } catch (EOFException unused) {
                            z10 = true;
                        }
                        if (z10) {
                            break;
                        } else {
                            i(bVar, cVar2, bArr11);
                        }
                    }
                    iN0 = n0(cVar2);
                } else {
                    h(bVar, cVar2, f12240S, f12239R);
                    iN0 = n0(cVar2);
                }
            }
            i10 = -1;
            X0.b.e(bVar, cVar2, (i15 + 8) - bVar.e());
            int size22 = byteArrayOutputStream.size();
            byte[] bArr622 = f12235N;
            cVar.k(size22 + bArr622.length);
            cVar.write(bArr622);
            if (iN0 != i10) {
            }
            byteArrayOutputStream.writeTo(cVar);
            X0.b.d(bVar, cVar);
            X0.b.b(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X0.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    private void e() {
        String strK = k("DateTimeOriginal");
        if (strK != null && k("DateTime") == null) {
            this.f12280f[0].put("DateTime", d.e(strK));
        }
        if (k("ImageWidth") == null) {
            this.f12280f[0].put("ImageWidth", d.f(0L, this.f12282h));
        }
        if (k("ImageLength") == null) {
            this.f12280f[0].put("ImageLength", d.f(0L, this.f12282h));
        }
        if (k("Orientation") == null) {
            this.f12280f[0].put("Orientation", d.f(0L, this.f12282h));
        }
        if (k("LightSource") == null) {
            this.f12280f[1].put("LightSource", d.f(0L, this.f12282h));
        }
    }

    private String f(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double g(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void h0(b bVar) throws Throwable {
        HashMap map = this.f12280f[4];
        d dVar = (d) map.get("Compression");
        if (dVar == null) {
            this.f12289o = 6;
            D(bVar, map);
            return;
        }
        int iM = dVar.m(this.f12282h);
        this.f12289o = iM;
        if (iM != 1) {
            if (iM == 6) {
                D(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (N(map)) {
            E(bVar, map);
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.k(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        X0.b.e(bVar, cVar, i10);
    }

    private static boolean i0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void j0(int i10, int i11) throws Throwable {
        if (this.f12280f[i10].isEmpty() || this.f12280f[i11].isEmpty()) {
            return;
        }
        d dVar = (d) this.f12280f[i10].get("ImageLength");
        d dVar2 = (d) this.f12280f[i10].get("ImageWidth");
        d dVar3 = (d) this.f12280f[i11].get("ImageLength");
        d dVar4 = (d) this.f12280f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iM = dVar.m(this.f12282h);
        int iM2 = dVar2.m(this.f12282h);
        int iM3 = dVar3.m(this.f12282h);
        int iM4 = dVar4.m(this.f12282h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap[] mapArr = this.f12280f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private static void k0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    private void l0(g gVar, int i10) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = (d) this.f12280f[i10].get("DefaultCropSize");
        d dVar2 = (d) this.f12280f[i10].get("SensorTopBorder");
        d dVar3 = (d) this.f12280f[i10].get("SensorLeftBorder");
        d dVar4 = (d) this.f12280f[i10].get("SensorBottomBorder");
        d dVar5 = (d) this.f12280f[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f12307a == 5) {
                f[] fVarArr = (f[]) dVar.o(this.f12282h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                } else {
                    dVarJ = d.h(fVarArr[0], this.f12282h);
                    dVarJ2 = d.h(fVarArr[1], this.f12282h);
                }
            } else {
                int[] iArr = (int[]) dVar.o(this.f12282h);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVarJ = d.j(iArr[0], this.f12282h);
                    dVarJ2 = d.j(iArr[1], this.f12282h);
                }
            }
            this.f12280f[i10].put("ImageWidth", dVarJ);
            this.f12280f[i10].put("ImageLength", dVarJ2);
            return;
        }
        if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
            Z(gVar, i10);
            return;
        }
        int iM = dVar2.m(this.f12282h);
        int iM2 = dVar4.m(this.f12282h);
        int iM3 = dVar5.m(this.f12282h);
        int iM4 = dVar3.m(this.f12282h);
        if (iM2 <= iM || iM3 <= iM4) {
            return;
        }
        d dVarJ3 = d.j(iM2 - iM, this.f12282h);
        d dVarJ4 = d.j(iM3 - iM4, this.f12282h);
        this.f12280f[i10].put("ImageLength", dVarJ3);
        this.f12280f[i10].put("ImageWidth", dVarJ4);
    }

    private void m0() throws Throwable {
        j0(0, 5);
        j0(0, 4);
        j0(5, 4);
        d dVar = (d) this.f12280f[1].get("PixelXDimension");
        d dVar2 = (d) this.f12280f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f12280f[0].put("ImageWidth", dVar);
            this.f12280f[0].put("ImageLength", dVar2);
        }
        if (this.f12280f[4].isEmpty() && P(this.f12280f[5])) {
            HashMap[] mapArr = this.f12280f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        P(this.f12280f[4]);
        Y(0, "ThumbnailOrientation", "Orientation");
        Y(0, "ThumbnailImageLength", "ImageLength");
        Y(0, "ThumbnailImageWidth", "ImageWidth");
        Y(5, "ThumbnailOrientation", "Orientation");
        Y(5, "ThumbnailImageLength", "ImageLength");
        Y(5, "ThumbnailImageWidth", "ImageWidth");
        Y(4, "Orientation", "ThumbnailOrientation");
        Y(4, "ImageLength", "ThumbnailImageLength");
        Y(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private d n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && B(this.f12278d) == 2 && (dVar2 = this.f12295u) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f12258k0.length; i10++) {
            d dVar3 = (d) this.f12280f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f12295u) == null) {
            return null;
        }
        return dVar;
    }

    private int n0(c cVar) throws IOException {
        char c10;
        char c11;
        long j10;
        e[][] eVarArr = f12258k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f12259l0) {
            X(eVar.f12312b);
        }
        if (this.f12283i) {
            if (this.f12284j) {
                X("StripOffsets");
                X("StripByteCounts");
            } else {
                X("JPEGInterchangeFormat");
                X("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f12258k0.length; i10++) {
            Iterator it = this.f12280f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.f12280f[1].isEmpty()) {
            this.f12280f[0].put(f12259l0[1].f12312b, d.f(0L, this.f12282h));
        }
        if (!this.f12280f[2].isEmpty()) {
            this.f12280f[0].put(f12259l0[2].f12312b, d.f(0L, this.f12282h));
        }
        if (this.f12280f[3].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            this.f12280f[1].put(f12259l0[3].f12312b, d.f(0L, this.f12282h));
        }
        if (!this.f12283i) {
            c11 = 3;
        } else if (this.f12284j) {
            this.f12280f[4].put("StripOffsets", d.j(0, this.f12282h));
            this.f12280f[4].put("StripByteCounts", d.j(this.f12287m, this.f12282h));
            c11 = 3;
        } else {
            this.f12280f[4].put("JPEGInterchangeFormat", d.f(0L, this.f12282h));
            c11 = 3;
            this.f12280f[4].put("JPEGInterchangeFormatLength", d.f(this.f12287m, this.f12282h));
        }
        for (int i11 = 0; i11 < f12258k0.length; i11++) {
            Iterator it2 = this.f12280f[i11].entrySet().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iP = ((d) ((Map.Entry) it2.next()).getValue()).p();
                if (iP > 4) {
                    i12 += iP;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f12258k0.length; i13++) {
            if (!this.f12280f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f12280f[i13].size() * 12) + 6 + iArr2[i13];
            }
        }
        if (this.f12283i) {
            if (this.f12284j) {
                this.f12280f[4].put("StripOffsets", d.j(size, this.f12282h));
            } else {
                this.f12280f[4].put("JPEGInterchangeFormat", d.f(size, this.f12282h));
            }
            this.f12286l = size;
            size += this.f12287m;
        }
        if (this.f12278d == 4) {
            size += 8;
        }
        if (f12270w) {
            for (int i14 = 0; i14 < f12258k0.length; i14++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f12280f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size));
            }
        }
        if (!this.f12280f[1].isEmpty()) {
            this.f12280f[0].put(f12259l0[1].f12312b, d.f(iArr[1], this.f12282h));
        }
        if (!this.f12280f[c10].isEmpty()) {
            this.f12280f[0].put(f12259l0[c10].f12312b, d.f(iArr[c10], this.f12282h));
        }
        if (!this.f12280f[c11].isEmpty()) {
            this.f12280f[1].put(f12259l0[c11].f12312b, d.f(iArr[c11], this.f12282h));
        }
        int i15 = this.f12278d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.s(size);
            cVar.write(f12265r0);
        } else if (i15 == 13) {
            cVar.k(size);
            cVar.k(1700284774);
        } else if (i15 == 14) {
            cVar.write(f12236O);
            cVar.k(size);
        }
        int size2 = cVar.f12305g.size();
        cVar.m(this.f12282h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.d(this.f12282h);
        cVar.s(42);
        cVar.r(8L);
        int i16 = 0;
        while (i16 < f12258k0.length) {
            if (this.f12280f[i16].isEmpty()) {
                j10 = j11;
            } else {
                cVar.s(this.f12280f[i16].size());
                int size3 = iArr[i16] + 2 + (this.f12280f[i16].size() * 12) + 4;
                for (Map.Entry entry : this.f12280f[i16].entrySet()) {
                    int i17 = ((e) f12261n0[i16].get(entry.getKey())).f12311a;
                    d dVar = (d) entry.getValue();
                    int iP2 = dVar.p();
                    cVar.s(i17);
                    cVar.s(dVar.f12307a);
                    cVar.k(dVar.f12308b);
                    if (iP2 > 4) {
                        cVar.r(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(dVar.f12310d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.e(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f12280f[4].isEmpty()) {
                    j10 = 0;
                    cVar.r(0L);
                } else {
                    cVar.r(iArr[4]);
                    j10 = 0;
                }
                Iterator it3 = this.f12280f[i16].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it3.next()).getValue()).f12310d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i16++;
            j11 = j10;
        }
        if (this.f12283i) {
            cVar.write(z());
        }
        if (this.f12278d == 14 && size % 2 == 1) {
            cVar.e(0);
        }
        cVar.d(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    private void o(g gVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.a.a(mediaMetadataRetriever, new C0130a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f12280f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f12282h));
                }
                if (strExtractMetadata3 != null) {
                    this.f12280f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata3), this.f12282h));
                }
                if (strExtractMetadata2 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata2);
                    this.f12280f[0].put("Orientation", d.j(i12 != 90 ? i12 != 180 ? i12 != 270 ? 1 : 8 : 3 : 6, this.f12282h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.A(i13);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f12265r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    gVar.readFully(bArr2);
                    this.f12290p = i15;
                    V(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata8);
                    int i18 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i17;
                    gVar.A(j10);
                    byte[] bArr3 = new byte[i18];
                    gVar.readFully(bArr3);
                    this.f12295u = new d(1, i18, j10, bArr3);
                    this.f12296v = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } finally {
        }
    }

    private void o0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12290p = cVar.f12305g.size() + n0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.k((int) crc32.getValue());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[LOOP:0: B:10:0x0024->B:55:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(X0.a.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.p(X0.a$b, int, int):void");
    }

    private void p0(c cVar) throws IOException {
        cVar.k(this.f12295u.f12310d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.k(1767135348);
        k0(crc32, 1767135348);
        byte[] bArr = f12233L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f12295u.f12310d);
        crc32.update(this.f12295u.f12310d);
        cVar.k((int) crc32.getValue());
        this.f12296v = true;
    }

    private int r(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (H(bArr)) {
            return 4;
        }
        if (K(bArr)) {
            return 9;
        }
        int iG = G(bArr);
        if (iG != 0) {
            return iG;
        }
        if (I(bArr)) {
            return 7;
        }
        if (L(bArr)) {
            return 10;
        }
        if (J(bArr)) {
            return 13;
        }
        return Q(bArr) ? 14 : 0;
    }

    private void s(g gVar) throws Throwable {
        int i10;
        int i11;
        v(gVar);
        d dVar = (d) this.f12280f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f12310d);
            gVar2.r(this.f12282h);
            byte[] bArr = f12230I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.A(0L);
            byte[] bArr3 = f12231J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.A(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.A(12L);
            }
            W(gVar2, 6);
            d dVar2 = (d) this.f12280f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f12280f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f12280f[5].put("JPEGInterchangeFormat", dVar2);
                this.f12280f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f12280f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f12282h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarJ = d.j(i14, this.f12282h);
                d dVarJ2 = d.j(i15, this.f12282h);
                this.f12280f[0].put("ImageWidth", dVarJ);
                this.f12280f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r17.f12296v = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void t(b bVar) throws Throwable {
        if (f12270w) {
            Objects.toString(bVar);
        }
        bVar.r(ByteOrder.BIG_ENDIAN);
        int iE = bVar.e();
        bVar.s(f12232K.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int iE2 = bVar.e() + i10 + 4;
                if (bVar.e() - iE == 16 && i11 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == 1229278788) {
                    break;
                }
                if (i11 == 1700284774 && !z10) {
                    this.f12290p = bVar.e() - iE;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    k0(crc32, i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    V(bArr, 0);
                    m0();
                    h0(new b(bArr));
                    z10 = true;
                } else if (i11 == 1767135348 && !z11) {
                    byte[] bArr2 = f12233L;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iE3 = bVar.e() - iE;
                            int i13 = i10 - length;
                            byte[] bArr4 = new byte[i13];
                            bVar.readFully(bArr4);
                            this.f12295u = new d(1, i13, iE3, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.s(iE2 - bVar.e());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
    }

    private void u(b bVar) throws Throwable {
        if (f12270w) {
            Objects.toString(bVar);
        }
        bVar.s(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.s(i10 - bVar.e());
        bVar.readFully(bArr4);
        p(new b(bArr4), i10, 5);
        bVar.s(i12 - bVar.e());
        bVar.r(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f12253f0.f12311a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarJ = d.j(s10, this.f12282h);
                d dVarJ2 = d.j(s11, this.f12282h);
                this.f12280f[0].put("ImageLength", dVarJ);
                this.f12280f[0].put("ImageWidth", dVarJ2);
                return;
            }
            bVar.s(unsignedShort2);
        }
    }

    private void v(g gVar) throws Throwable {
        d dVar;
        S(gVar);
        W(gVar, 0);
        l0(gVar, 0);
        l0(gVar, 5);
        l0(gVar, 4);
        m0();
        if (this.f12278d != 8 || (dVar = (d) this.f12280f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f12310d);
        gVar2.r(this.f12282h);
        gVar2.s(6);
        W(gVar2, 9);
        d dVar2 = (d) this.f12280f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f12280f[1].put("ColorSpace", dVar2);
        }
    }

    private void w(g gVar) throws Throwable {
        if (f12270w) {
            Objects.toString(gVar);
        }
        v(gVar);
        d dVar = (d) this.f12280f[0].get("JpgFromRaw");
        if (dVar != null) {
            p(new b(dVar.f12310d), (int) dVar.f12309c, 5);
        }
        d dVar2 = (d) this.f12280f[0].get("ISO");
        d dVar3 = (d) this.f12280f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f12280f[1].put("PhotographicSensitivity", dVar2);
    }

    private boolean x(g gVar) throws IOException {
        byte[] bArr = f12265r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrK = gVar.k();
        this.f12290p = bArr.length;
        V(bArrK, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a0() throws Throwable {
        FileOutputStream fileOutputStream;
        File fileCreateTempFile;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e10;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream3;
        if (!O(this.f12278d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f12276b == null && this.f12275a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f12283i && this.f12284j && !this.f12285k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f12294t = true;
        this.f12288n = y();
        InputStream inputStream = null;
        try {
            fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f12275a != null) {
                fileInputStream = new FileInputStream(this.f12275a);
            } else {
                Os.lseek(this.f12276b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f12276b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            X0.b.d(fileInputStream, fileOutputStream);
            X0.b.b(fileInputStream);
            X0.b.b(fileOutputStream);
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                    fileInputStream3 = new FileInputStream(fileCreateTempFile);
                } catch (Throwable th4) {
                    th = th4;
                    closeable = null;
                    X0.b.b(inputStream);
                    X0.b.b(closeable);
                    if (0 == 0) {
                        fileCreateTempFile.delete();
                    }
                    throw th;
                }
                try {
                    if (this.f12275a != null) {
                        fileOutputStream3 = new FileOutputStream(this.f12275a);
                    } else {
                        Os.lseek(this.f12276b, 0L, OsConstants.SEEK_SET);
                        fileOutputStream3 = new FileOutputStream(this.f12276b);
                    }
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                            try {
                                int i10 = this.f12278d;
                                if (i10 == 4) {
                                    b0(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 13) {
                                    c0(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 14) {
                                    d0(bufferedInputStream, bufferedOutputStream);
                                }
                                X0.b.b(bufferedInputStream);
                                X0.b.b(bufferedOutputStream);
                                fileCreateTempFile.delete();
                                this.f12288n = null;
                            } catch (Exception e13) {
                                exc = e13;
                                inputStream = fileInputStream3;
                                try {
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    try {
                                        if (this.f12275a == null) {
                                            fileOutputStream4 = new FileOutputStream(this.f12275a);
                                        } else {
                                            Os.lseek(this.f12276b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream4 = new FileOutputStream(this.f12276b);
                                        }
                                        fileOutputStream3 = fileOutputStream4;
                                        X0.b.d(fileInputStream2, fileOutputStream3);
                                        X0.b.b(fileInputStream2);
                                        X0.b.b(fileOutputStream3);
                                        throw new IOException("Failed to save new file", exc);
                                    } catch (Exception e14) {
                                        e10 = e14;
                                        try {
                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e10);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = fileInputStream2;
                                            X0.b.b(inputStream);
                                            X0.b.b(fileOutputStream3);
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        inputStream = fileInputStream2;
                                        X0.b.b(inputStream);
                                        X0.b.b(fileOutputStream3);
                                        throw th;
                                    }
                                } catch (Exception e15) {
                                    fileInputStream2 = inputStream;
                                    e10 = e15;
                                } catch (Throwable th7) {
                                    th = th7;
                                    X0.b.b(inputStream);
                                    X0.b.b(fileOutputStream3);
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            inputStream = fileInputStream3;
                            exc = e16;
                        } catch (Throwable th8) {
                            th = th8;
                            closeable = null;
                            inputStream = bufferedInputStream;
                            X0.b.b(inputStream);
                            X0.b.b(closeable);
                            if (0 == 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        inputStream = fileInputStream3;
                        exc = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    fileOutputStream2 = null;
                    inputStream = fileInputStream3;
                    exc = e;
                    fileOutputStream3 = fileOutputStream2;
                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                    if (this.f12275a == null) {
                    }
                    fileOutputStream3 = fileOutputStream4;
                    X0.b.d(fileInputStream2, fileOutputStream3);
                    X0.b.b(fileInputStream2);
                    X0.b.b(fileOutputStream3);
                    throw new IOException("Failed to save new file", exc);
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream2 = null;
            }
        } catch (Exception e20) {
            e = e20;
            inputStream = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th9) {
                th = th9;
                X0.b.b(inputStream);
                X0.b.b(fileOutputStream);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = fileInputStream;
            X0.b.b(inputStream);
            X0.b.b(fileOutputStream);
            throw th;
        }
    }

    public void e0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        f0("GPSAltitude", f.b(Math.abs(d10)).toString());
        f0("GPSAltitudeRef", str);
    }

    public void f0(String str, String str2) {
        e eVar;
        int i10;
        int i11;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i12 = 1;
        if (strReplaceAll != null) {
            if (f12262o0.contains(str3) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            } else if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f12268u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = f12269v0.matcher(strReplaceAll).find();
                boolean zFind2 = f12271w0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19) {
                    return;
                }
                if (!zFind && !zFind2) {
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        if ("Xmp".equals(str3)) {
            boolean z10 = this.f12280f[0].containsKey("Xmp") || this.f12280f[5].containsKey("Xmp");
            int iB = B(this.f12278d);
            if ((iB == 2 && (this.f12295u != null || !z10)) || (iB == 3 && !z10)) {
                this.f12295u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i13 = 0;
        while (i13 < f12258k0.length) {
            if ((i13 != 4 || this.f12283i) && (eVar = (e) f12261n0[i13].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair pairC = C(strReplaceAll);
                    if (eVar.f12313c == ((Integer) pairC.first).intValue() || eVar.f12313c == ((Integer) pairC.second).intValue()) {
                        i10 = eVar.f12313c;
                    } else {
                        int i14 = eVar.f12314d;
                        if (i14 == -1 || !(i14 == ((Integer) pairC.first).intValue() || eVar.f12314d == ((Integer) pairC.second).intValue())) {
                            int i15 = eVar.f12313c;
                            if (i15 == i12 || i15 == 7 || i15 == 2) {
                                i10 = i15;
                            } else if (f12270w) {
                                String[] strArr = f12245X;
                                String str4 = strArr[eVar.f12313c];
                                if (eVar.f12314d != -1) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(", ");
                                    sb.append(strArr[eVar.f12314d]);
                                }
                                String str5 = strArr[((Integer) pairC.first).intValue()];
                                if (((Integer) pairC.second).intValue() != -1) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(", ");
                                    sb2.append(strArr[((Integer) pairC.second).intValue()]);
                                }
                            }
                        } else {
                            i10 = eVar.f12314d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i12;
                            this.f12280f[i13].put(str3, d.a(strReplaceAll));
                            continue;
                        case 2:
                        case 7:
                            i11 = i12;
                            this.f12280f[i13].put(str3, d.e(strReplaceAll));
                            continue;
                        case 3:
                            i11 = i12;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                                iArr[i16] = Integer.parseInt(strArrSplit[i16]);
                            }
                            this.f12280f[i13].put(str3, d.k(iArr, this.f12282h));
                            continue;
                        case 4:
                            i11 = i12;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i17 = 0; i17 < strArrSplit2.length; i17++) {
                                jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                            }
                            this.f12280f[i13].put(str3, d.g(jArr, this.f12282h));
                            continue;
                        case 5:
                            i11 = i12;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            for (int i18 = 0; i18 < strArrSplit3.length; i18++) {
                                String[] strArrSplit4 = strArrSplit3[i18].split("/", -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i11]), null);
                            }
                            this.f12280f[i13].put(str3, d.i(fVarArr, this.f12282h));
                            continue;
                        case 9:
                            i11 = i12;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i19 = 0; i19 < strArrSplit5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(strArrSplit5[i19]);
                            }
                            this.f12280f[i13].put(str3, d.c(iArr2, this.f12282h));
                            continue;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i20 = 0;
                            while (i20 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i20].split("/", -1);
                                fVarArr2[i20] = new f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i12]), null);
                                i20++;
                                i12 = i12;
                                strArrSplit6 = strArrSplit6;
                            }
                            i11 = i12;
                            this.f12280f[i13].put(str3, d.d(fVarArr2, this.f12282h));
                            continue;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i21 = 0; i21 < strArrSplit8.length; i21++) {
                                dArr[i21] = Double.parseDouble(strArrSplit8[i21]);
                            }
                            this.f12280f[i13].put(str3, d.b(dArr, this.f12282h));
                            break;
                    }
                } else {
                    this.f12280f[i13].remove(str3);
                }
                i11 = i12;
            } else {
                i11 = i12;
            }
            i13++;
            i12 = i11;
        }
    }

    public void g0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        f0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        f0("GPSLatitude", f(Math.abs(d10)));
        f0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        f0("GPSLongitude", f(Math.abs(d11)));
    }

    public double j(double d10) {
        double dL = l("GPSAltitude", -1.0d);
        int iM = m("GPSAltitudeRef", -1);
        if (dL < 0.0d || iM < 0) {
            return d10;
        }
        return dL * ((double) (iM != 1 ? 1 : -1));
    }

    public String k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f12262o0.contains(str)) {
                return dVarN.n(this.f12282h);
            }
            try {
                return Double.toString(dVarN.l(this.f12282h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = dVarN.f12307a;
        if (i10 != 5 && i10 != 10) {
            return null;
        }
        f[] fVarArr = (f[]) dVarN.o(this.f12282h);
        if (fVarArr == null || fVarArr.length != 3) {
            Arrays.toString(fVarArr);
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f12315a / fVar.f12316b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f12315a / fVar2.f12316b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f12315a / fVar3.f12316b)));
    }

    public double l(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.l(this.f12282h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int m(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.m(this.f12282h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public double[] q() {
        String strK = k("GPSLatitude");
        String strK2 = k("GPSLatitudeRef");
        String strK3 = k("GPSLongitude");
        String strK4 = k("GPSLongitudeRef");
        if (strK == null || strK2 == null || strK3 == null || strK4 == null) {
            return null;
        }
        try {
            return new double[]{g(strK, strK2), g(strK3, strK4)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strK, strK2, strK3, strK4);
            return null;
        }
    }

    public byte[] y() {
        int i10 = this.f12289o;
        if (i10 == 6 || i10 == 7) {
            return z();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] z() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th2;
        InputStream inputStream = null;
        if (!this.f12283i) {
            return null;
        }
        byte[] bArr = this.f12288n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f12277c;
        } catch (Exception unused) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            fileDescriptor = null;
        }
        if (fileInputStream != null) {
            try {
                if (!fileInputStream.markSupported()) {
                    X0.b.b(fileInputStream);
                    return null;
                }
                fileInputStream.reset();
                fileDescriptor = null;
            } catch (Exception unused2) {
                fileDescriptor = null;
            } catch (Throwable th4) {
                inputStream = fileInputStream;
                th = th4;
                fileDescriptor = null;
                X0.b.b(inputStream);
                if (fileDescriptor == null) {
                }
            }
            X0.b.b(fileInputStream);
            if (fileDescriptor != null) {
                X0.b.a(fileDescriptor);
            }
            return null;
        }
        if (this.f12275a != null) {
            fileInputStream = new FileInputStream(this.f12275a);
            fileDescriptor = null;
        } else {
            FileDescriptor fileDescriptorDup = Os.dup(this.f12276b);
            try {
                Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                fileDescriptor = fileDescriptorDup;
                fileInputStream = new FileInputStream(fileDescriptorDup);
            } catch (Exception unused3) {
                fileDescriptor = fileDescriptorDup;
                fileInputStream = null;
            } catch (Throwable th5) {
                th2 = th5;
                fileDescriptor = fileDescriptorDup;
                th = th2;
                X0.b.b(inputStream);
                if (fileDescriptor == null) {
                    throw th;
                }
                X0.b.a(fileDescriptor);
                throw th;
            }
        }
        try {
            b bVar = new b(fileInputStream);
            bVar.s(this.f12286l + this.f12290p);
            byte[] bArr2 = new byte[this.f12287m];
            bVar.readFully(bArr2);
            this.f12288n = bArr2;
            X0.b.b(fileInputStream);
            if (fileDescriptor != null) {
                X0.b.a(fileDescriptor);
            }
            return bArr2;
        } catch (Exception unused4) {
        } catch (Throwable th6) {
            th2 = th6;
            inputStream = fileInputStream;
            th = th2;
            X0.b.b(inputStream);
            if (fileDescriptor == null) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected final DataInputStream f12300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected int f12301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ByteOrder f12302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f12303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12304k;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f12304k = bArr.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f12300g.available();
        }

        public int d() {
            return this.f12304k;
        }

        public int e() {
            return this.f12301h;
        }

        public byte[] k() throws IOException {
            byte[] bArrCopyOf = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f12300g.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f12301h += i11;
            }
        }

        public long m() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void r(ByteOrder byteOrder) {
            this.f12302i = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f12301h++;
            return this.f12300g.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f12301h++;
            return this.f12300g.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f12301h++;
            int i10 = this.f12300g.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f12301h += 2;
            return this.f12300g.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f12301h += i11;
            this.f12300g.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f12301h += 4;
            int i10 = this.f12300g.read();
            int i11 = this.f12300g.read();
            int i12 = this.f12300g.read();
            int i13 = this.f12300g.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f12302i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f12302i);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f12301h += 8;
            int i10 = this.f12300g.read();
            int i11 = this.f12300g.read();
            int i12 = this.f12300g.read();
            int i13 = this.f12300g.read();
            int i14 = this.f12300g.read();
            int i15 = this.f12300g.read();
            int i16 = this.f12300g.read();
            int i17 = this.f12300g.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f12302i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f12302i);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f12301h += 2;
            int i10 = this.f12300g.read();
            int i11 = this.f12300g.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f12302i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f12302i);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f12301h += 2;
            return this.f12300g.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f12301h++;
            return this.f12300g.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f12301h += 2;
            int i10 = this.f12300g.read();
            int i11 = this.f12300g.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f12302i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f12302i);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public void s(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f12300g.skip(i12);
                if (iSkip <= 0) {
                    if (this.f12303j == null) {
                        this.f12303j = new byte[8192];
                    }
                    iSkip = this.f12300g.read(this.f12303j, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f12301h += i11;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f12300g.read(bArr, i10, i11);
            this.f12301h += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f12301h += bArr.length;
            this.f12300g.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f12300g = dataInputStream;
            dataInputStream.mark(0);
            this.f12301h = 0;
            this.f12302i = byteOrder;
            this.f12304k = inputStream instanceof b ? ((b) inputStream).d() : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f12300g.mark(ViewDefaults.NUMBER_OF_LINES);
        }

        public void A(long j10) throws IOException {
            int i10 = this.f12301h;
            if (i10 > j10) {
                this.f12301h = 0;
                this.f12300g.reset();
            } else {
                j10 -= (long) i10;
            }
            s((int) j10);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f12300g.mark(ViewDefaults.NUMBER_OF_LINES);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12314d;

        e(String str, int i10, int i11) {
            this.f12312b = str;
            this.f12311a = i10;
            this.f12313c = i11;
            this.f12314d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f12313c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f12314d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        e(String str, int i10, int i11, int i12) {
            this.f12312b = str;
            this.f12311a = i10;
            this.f12313c = i11;
            this.f12314d = i12;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f12258k0;
        this.f12280f = new HashMap[eVarArr.length];
        this.f12281g = new HashSet(eVarArr.length);
        this.f12282h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            F(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(InputStream inputStream, int i10) throws Throwable {
        e[][] eVarArr = f12258k0;
        this.f12280f = new HashMap[eVarArr.length];
        this.f12281g = new HashSet(eVarArr.length);
        this.f12282h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f12275a = null;
            boolean z10 = i10 == 1;
            this.f12279e = z10;
            if (z10) {
                this.f12277c = null;
                this.f12276b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f12277c = (AssetManager.AssetInputStream) inputStream;
                this.f12276b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (M(fileInputStream.getFD())) {
                    this.f12277c = null;
                    this.f12276b = fileInputStream.getFD();
                } else {
                    this.f12277c = null;
                    this.f12276b = null;
                }
            }
            R(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* JADX INFO: renamed from: X0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0130a extends MediaDataSource {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f12297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g f12298h;

        C0130a(g gVar) {
            this.f12298h = gVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f12297g;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f12298h.available())) {
                        return -1;
                    }
                    this.f12298h.A(j10);
                    this.f12297g = j10;
                }
                if (i11 > this.f12298h.available()) {
                    i11 = this.f12298h.available();
                }
                int i12 = this.f12298h.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f12297g += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f12297g = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
