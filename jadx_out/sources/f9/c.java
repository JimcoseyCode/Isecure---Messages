package f9;

import B7.d;
import P8.C1385d;
import P8.o;
import P8.q;
import com.facebook.react.uimanager.ViewDefaults;
import e9.C;
import e9.E;
import e9.InterfaceC2437e;
import e9.r;
import e9.t;
import e9.u;
import e9.z;
import i7.AbstractC2738a;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.J;
import j7.K;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;
import t7.AbstractC3376c;
import t9.C3391h;
import t9.D;
import t9.F;
import t9.InterfaceC3392i;
import t9.j;
import t9.k;
import t9.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f27865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f27866b = t.f26320h.i(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f27867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f27868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v f27869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f27870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f27871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f27872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f27873i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f27874a;

        a(r rVar) {
            this.f27874a = rVar;
        }

        @Override // e9.r.c
        public final r a(InterfaceC2437e it) {
            AbstractC2855l.g(it, "it");
            return this.f27874a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27876b;

        b(String str, boolean z10) {
            this.f27875a = str;
            this.f27876b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f27875a);
            thread.setDaemon(this.f27876b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f27865a = bArr;
        f27867c = E.b.j(E.Companion, bArr, null, 1, null);
        f27868d = C.a.k(C.Companion, bArr, null, 0, 0, 7, null);
        v.a aVar = v.f32624j;
        k.a aVar2 = k.f32603j;
        f27869e = aVar.d(aVar2.e("efbbbf"), aVar2.e("feff"), aVar2.e("fffe"), aVar2.e("0000ffff"), aVar2.e("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC2855l.d(timeZone);
        f27870f = timeZone;
        f27871g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f27872h = false;
        String name = z.class.getName();
        AbstractC2855l.f(name, "OkHttpClient::class.java.name");
        f27873i = q.x0(q.w0(name, "okhttp3."), "Client");
    }

    public static final int A(String indexOfNonWhitespace, int i10) {
        AbstractC2855l.g(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i10 < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return indexOfNonWhitespace.length();
    }

    public static final String[] B(String[] intersect, String[] other, Comparator comparator) {
        AbstractC2855l.g(intersect, "$this$intersect");
        AbstractC2855l.g(other, "other");
        AbstractC2855l.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean C(n9.a isCivilized, File file) throws IOException {
        AbstractC2855l.g(isCivilized, "$this$isCivilized");
        AbstractC2855l.g(file, "file");
        D dB = isCivilized.b(file);
        try {
            try {
                isCivilized.f(file);
                AbstractC3376c.a(dB, null);
                return true;
            } catch (IOException unused) {
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(dB, null);
                isCivilized.f(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean D(Socket isHealthy, j source) {
        AbstractC2855l.g(isHealthy, "$this$isHealthy");
        AbstractC2855l.g(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                return !source.D();
            } finally {
                isHealthy.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean E(String name) {
        AbstractC2855l.g(name, "name");
        return q.x(name, "Authorization", true) || q.x(name, "Cookie", true) || q.x(name, "Proxy-Authorization", true) || q.x(name, "Set-Cookie", true);
    }

    public static final int F(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        if ('a' <= c10 && 'f' >= c10) {
            return c10 - 'W';
        }
        if ('A' <= c10 && 'F' >= c10) {
            return c10 - '7';
        }
        return -1;
    }

    public static final Charset G(j readBomAsCharset, Charset charset) {
        AbstractC2855l.g(readBomAsCharset, "$this$readBomAsCharset");
        AbstractC2855l.g(charset, "default");
        int iH0 = readBomAsCharset.H0(f27869e);
        if (iH0 == -1) {
            return charset;
        }
        if (iH0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC2855l.f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iH0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC2855l.f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iH0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC2855l.f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iH0 == 3) {
            return C1385d.f8857a.a();
        }
        if (iH0 == 4) {
            return C1385d.f8857a.b();
        }
        throw new AssertionError();
    }

    public static final int H(j readMedium) {
        AbstractC2855l.g(readMedium, "$this$readMedium");
        return b(readMedium.readByte(), 255) | (b(readMedium.readByte(), 255) << 16) | (b(readMedium.readByte(), 255) << 8);
    }

    public static final int I(C3391h skipAll, byte b10) throws EOFException {
        AbstractC2855l.g(skipAll, "$this$skipAll");
        int i10 = 0;
        while (!skipAll.D() && skipAll.M(0L) == b10) {
            i10++;
            skipAll.readByte();
        }
        return i10;
    }

    public static final boolean J(F skipAll, int i10, TimeUnit timeUnit) {
        AbstractC2855l.g(skipAll, "$this$skipAll");
        AbstractC2855l.g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = skipAll.timeout().e() ? skipAll.timeout().c() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C3391h c3391h = new C3391h();
            while (skipAll.read(c3391h, 8192L) != -1) {
                c3391h.k();
            }
            if (jC == Long.MAX_VALUE) {
                skipAll.timeout().a();
                return true;
            }
            skipAll.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                skipAll.timeout().a();
                return false;
            }
            skipAll.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                skipAll.timeout().a();
            } else {
                skipAll.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory K(String name, boolean z10) {
        AbstractC2855l.g(name, "name");
        return new b(name, z10);
    }

    public static final List L(t toHeaderList) {
        AbstractC2855l.g(toHeaderList, "$this$toHeaderList");
        B7.c cVarP = d.p(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVarP, 10));
        Iterator it = cVarP.iterator();
        while (it.hasNext()) {
            int iNextInt = ((J) it).nextInt();
            arrayList.add(new m9.c(toHeaderList.p(iNextInt), toHeaderList.s(iNextInt)));
        }
        return arrayList;
    }

    public static final t M(List toHeaders) {
        AbstractC2855l.g(toHeaders, "$this$toHeaders");
        t.a aVar = new t.a();
        Iterator it = toHeaders.iterator();
        while (it.hasNext()) {
            m9.c cVar = (m9.c) it.next();
            aVar.c(cVar.a().I(), cVar.b().I());
        }
        return aVar.e();
    }

    public static final String N(int i10) {
        String hexString = Integer.toHexString(i10);
        AbstractC2855l.f(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final String O(long j10) {
        String hexString = Long.toHexString(j10);
        AbstractC2855l.f(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String P(u toHostHeader, boolean z10) {
        String strH;
        AbstractC2855l.g(toHostHeader, "$this$toHostHeader");
        if (q.Q(toHostHeader.h(), ":", false, 2, null)) {
            strH = '[' + toHostHeader.h() + ']';
        } else {
            strH = toHostHeader.h();
        }
        if (!z10 && toHostHeader.l() == u.f26324l.c(toHostHeader.p())) {
            return strH;
        }
        return strH + ':' + toHostHeader.l();
    }

    public static /* synthetic */ String Q(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return P(uVar, z10);
    }

    public static final List R(List toImmutableList) {
        AbstractC2855l.g(toImmutableList, "$this$toImmutableList");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2800q.R0(toImmutableList));
        AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map S(Map toImmutableMap) {
        AbstractC2855l.g(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return K.i();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        AbstractC2855l.f(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long T(String toLongOrDefault, long j10) {
        AbstractC2855l.g(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int U(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > ViewDefaults.NUMBER_OF_LINES) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String V(String trimSubstring, int i10, int i11) {
        AbstractC2855l.g(trimSubstring, "$this$trimSubstring");
        int iW = w(trimSubstring, i10, i11);
        String strSubstring = trimSubstring.substring(iW, y(trimSubstring, iW, i11));
        AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String W(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return V(str, i10, i11);
    }

    public static final Throwable X(Exception withSuppressed, List suppressed) {
        AbstractC2855l.g(withSuppressed, "$this$withSuppressed");
        AbstractC2855l.g(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC2738a.a(withSuppressed, (Exception) it.next());
        }
        return withSuppressed;
    }

    public static final void Y(InterfaceC3392i writeMedium, int i10) {
        AbstractC2855l.g(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i10 >>> 16) & 255);
        writeMedium.writeByte((i10 >>> 8) & 255);
        writeMedium.writeByte(i10 & 255);
    }

    public static final void a(List addIfAbsent, Object obj) {
        AbstractC2855l.g(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(obj)) {
            return;
        }
        addIfAbsent.add(obj);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c e(r asFactory) {
        AbstractC2855l.g(asFactory, "$this$asFactory");
        return new a(asFactory);
    }

    public static final boolean f(String canParseAsIpAddress) {
        AbstractC2855l.g(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return f27871g.d(canParseAsIpAddress);
    }

    public static final boolean g(u canReuseConnectionFor, u other) {
        AbstractC2855l.g(canReuseConnectionFor, "$this$canReuseConnectionFor");
        AbstractC2855l.g(other, "other");
        return AbstractC2855l.b(canReuseConnectionFor.h(), other.h()) && canReuseConnectionFor.l() == other.l() && AbstractC2855l.b(canReuseConnectionFor.p(), other.p());
    }

    public static final int h(String name, long j10, TimeUnit timeUnit) {
        AbstractC2855l.g(name, "name");
        if (!(j10 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= ((long) ViewDefaults.NUMBER_OF_LINES))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeQuietly) {
        AbstractC2855l.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket closeQuietly) {
        AbstractC2855l.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC2855l.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] concat, String value) {
        AbstractC2855l.g(concat, "$this$concat");
        AbstractC2855l.g(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        AbstractC2855l.f(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[AbstractC2793j.K(strArr)] = value;
        return strArr;
    }

    public static final int m(String delimiterOffset, char c10, int i10, int i11) {
        AbstractC2855l.g(delimiterOffset, "$this$delimiterOffset");
        while (i10 < i11) {
            if (delimiterOffset.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String delimiterOffset, String delimiters, int i10, int i11) {
        AbstractC2855l.g(delimiterOffset, "$this$delimiterOffset");
        AbstractC2855l.g(delimiters, "delimiters");
        while (i10 < i11) {
            if (q.P(delimiters, delimiterOffset.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m(str, c10, i10, i11);
    }

    public static final boolean p(F discard, int i10, TimeUnit timeUnit) {
        AbstractC2855l.g(discard, "$this$discard");
        AbstractC2855l.g(timeUnit, "timeUnit");
        try {
            return J(discard, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String format, Object... args) {
        AbstractC2855l.g(format, "format");
        AbstractC2855l.g(args, "args");
        H h10 = H.f29375a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC2855l.f(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean r(String[] hasIntersection, String[] strArr, Comparator comparator) {
        AbstractC2855l.g(hasIntersection, "$this$hasIntersection");
        AbstractC2855l.g(comparator, "comparator");
        if (hasIntersection.length != 0 && strArr != null && strArr.length != 0) {
            for (String str : hasIntersection) {
                for (String str2 : strArr) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long s(e9.D headersContentLength) {
        AbstractC2855l.g(headersContentLength, "$this$headersContentLength");
        String strO = headersContentLength.g0().o("Content-Length");
        if (strO != null) {
            return T(strO, -1L);
        }
        return -1L;
    }

    public static final List t(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2800q.m(Arrays.copyOf(objArr, objArr.length)));
        AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int u(String[] indexOf, String value, Comparator comparator) {
        AbstractC2855l.g(indexOf, "$this$indexOf");
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(comparator, "comparator");
        int length = indexOf.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(indexOf[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(String indexOfControlOrNonAscii) {
        AbstractC2855l.g(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i10);
            if (AbstractC2855l.i(cCharAt, 31) <= 0 || AbstractC2855l.i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int w(String indexOfFirstNonAsciiWhitespace, int i10, int i11) {
        AbstractC2855l.g(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return w(str, i10, i11);
    }

    public static final int y(String indexOfLastNonAsciiWhitespace, int i10, int i11) {
        AbstractC2855l.g(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
