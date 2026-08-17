package r1;

import android.os.Build;
import android.os.StrictMode;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3249b implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f31827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f31828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f31829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final File f31830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f31832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f31833m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Writer f31835o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f31837q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f31834n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinkedHashMap f31836p = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f31838r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ThreadPoolExecutor f31839s = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0351b(null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Callable f31840t = new a();

    /* JADX INFO: renamed from: r1.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C3249b.this) {
                try {
                    if (C3249b.this.f31835o == null) {
                        return null;
                    }
                    C3249b.this.K0();
                    if (C3249b.this.l0()) {
                        C3249b.this.A0();
                        C3249b.this.f31837q = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class ThreadFactoryC0351b implements ThreadFactory {
        private ThreadFactoryC0351b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0351b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: r1.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f31842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f31843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31844c;

        /* synthetic */ c(C3249b c3249b, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            C3249b.this.M(this, false);
        }

        public void b() {
            if (this.f31844c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            C3249b.this.M(this, true);
            this.f31844c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (C3249b.this) {
                try {
                    if (this.f31842a.f31851f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f31842a.f31850e) {
                        this.f31843b[i10] = true;
                    }
                    fileK = this.f31842a.k(i10);
                    C3249b.this.f31827g.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f31842a = dVar;
            this.f31843b = dVar.f31850e ? null : new boolean[C3249b.this.f31833m];
        }
    }

    /* JADX INFO: renamed from: r1.b$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f31847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f31848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f31849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f31850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f31851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f31852g;

        /* synthetic */ d(C3249b c3249b, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != C3249b.this.f31833m) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f31847b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f31848c[i10];
        }

        public File k(int i10) {
            return this.f31849d[i10];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.f31847b) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f31846a = str;
            this.f31847b = new long[C3249b.this.f31833m];
            this.f31848c = new File[C3249b.this.f31833m];
            this.f31849d = new File[C3249b.this.f31833m];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < C3249b.this.f31833m; i10++) {
                sb.append(i10);
                this.f31848c[i10] = new File(C3249b.this.f31827g, sb.toString());
                sb.append(".tmp");
                this.f31849d[i10] = new File(C3249b.this.f31827g, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: r1.b$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f31855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f31856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f31857d;

        /* synthetic */ e(C3249b c3249b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f31857d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f31854a = str;
            this.f31855b = j10;
            this.f31857d = fileArr;
            this.f31856c = jArr;
        }
    }

    private C3249b(File file, int i10, int i11, long j10) {
        this.f31827g = file;
        this.f31831k = i10;
        this.f31828h = new File(file, "journal");
        this.f31829i = new File(file, "journal.tmp");
        this.f31830j = new File(file, "journal.bkp");
        this.f31833m = i11;
        this.f31832l = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0() {
        try {
            Writer writer = this.f31835o;
            if (writer != null) {
                J(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31829i), r1.d.f31865a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write("1");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f31831k));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f31833m));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (d dVar : this.f31836p.values()) {
                    if (dVar.f31851f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f31846a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f31846a + dVar.l() + '\n');
                    }
                }
                J(bufferedWriter);
                if (this.f31828h.exists()) {
                    J0(this.f31828h, this.f31830j, true);
                }
                J0(this.f31829i, this.f31828h, false);
                this.f31830j.delete();
                this.f31835o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31828h, true), r1.d.f31865a));
            } catch (Throwable th) {
                J(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void I() {
        if (this.f31835o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void J(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void J0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            X(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        while (this.f31834n > this.f31832l) {
            D0((String) ((Map.Entry) this.f31836p.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void M(c cVar, boolean z10) {
        d dVar = cVar.f31842a;
        if (dVar.f31851f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f31850e) {
            for (int i10 = 0; i10 < this.f31833m; i10++) {
                if (!cVar.f31843b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f31833m; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                X(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f31847b[i11];
                long length = fileJ.length();
                dVar.f31847b[i11] = length;
                this.f31834n = (this.f31834n - j10) + length;
            }
        }
        this.f31837q++;
        dVar.f31851f = null;
        if (dVar.f31850e || z10) {
            dVar.f31850e = true;
            this.f31835o.append((CharSequence) "CLEAN");
            this.f31835o.append(' ');
            this.f31835o.append((CharSequence) dVar.f31846a);
            this.f31835o.append((CharSequence) dVar.l());
            this.f31835o.append('\n');
            if (z10) {
                long j11 = this.f31838r;
                this.f31838r = 1 + j11;
                dVar.f31852g = j11;
            }
        } else {
            this.f31836p.remove(dVar.f31846a);
            this.f31835o.append((CharSequence) "REMOVE");
            this.f31835o.append(' ');
            this.f31835o.append((CharSequence) dVar.f31846a);
            this.f31835o.append('\n');
        }
        i0(this.f31835o);
        if (this.f31834n > this.f31832l || l0()) {
            this.f31839s.submit(this.f31840t);
        }
    }

    private static void X(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c g0(String str, long j10) {
        I();
        d dVar = (d) this.f31836p.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f31852g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f31836p.put(str, dVar);
        } else if (dVar.f31851f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f31851f = cVar;
        this.f31835o.append((CharSequence) "DIRTY");
        this.f31835o.append(' ');
        this.f31835o.append((CharSequence) str);
        this.f31835o.append('\n');
        i0(this.f31835o);
        return cVar;
    }

    private static void i0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l0() {
        int i10 = this.f31837q;
        return i10 >= 2000 && i10 >= this.f31836p.size();
    }

    public static C3249b t0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                J0(file2, file3, false);
            }
        }
        C3249b c3249b = new C3249b(file, i10, i11, j10);
        if (c3249b.f31828h.exists()) {
            try {
                c3249b.w0();
                c3249b.u0();
                return c3249b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c3249b.W();
            }
        }
        file.mkdirs();
        C3249b c3249b2 = new C3249b(file, i10, i11, j10);
        c3249b2.A0();
        return c3249b2;
    }

    private void u0() throws IOException {
        X(this.f31829i);
        Iterator it = this.f31836p.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f31851f == null) {
                while (i10 < this.f31833m) {
                    this.f31834n += dVar.f31847b[i10];
                    i10++;
                }
            } else {
                dVar.f31851f = null;
                while (i10 < this.f31833m) {
                    X(dVar.j(i10));
                    X(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void w0() {
        C3250c c3250c = new C3250c(new FileInputStream(this.f31828h), r1.d.f31865a);
        try {
            String strM = c3250c.m();
            String strM2 = c3250c.m();
            String strM3 = c3250c.m();
            String strM4 = c3250c.m();
            String strM5 = c3250c.m();
            if (!"libcore.io.DiskLruCache".equals(strM) || !"1".equals(strM2) || !Integer.toString(this.f31831k).equals(strM3) || !Integer.toString(this.f31833m).equals(strM4) || !PointerEventHelper.POINTER_TYPE_UNKNOWN.equals(strM5)) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    y0(c3250c.m());
                    i10++;
                } catch (EOFException unused) {
                    this.f31837q = i10 - this.f31836p.size();
                    if (c3250c.k()) {
                        A0();
                    } else {
                        this.f31835o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31828h, true), r1.d.f31865a));
                    }
                    r1.d.a(c3250c);
                    return;
                }
            }
        } catch (Throwable th) {
            r1.d.a(c3250c);
            throw th;
        }
    }

    private void y0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f31836p.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f31836p.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f31836p.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f31850e = true;
            dVar.f31851f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f31851f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public synchronized boolean D0(String str) {
        try {
            I();
            d dVar = (d) this.f31836p.get(str);
            if (dVar != null && dVar.f31851f == null) {
                for (int i10 = 0; i10 < this.f31833m; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f31834n -= dVar.f31847b[i10];
                    dVar.f31847b[i10] = 0;
                }
                this.f31837q++;
                this.f31835o.append((CharSequence) "REMOVE");
                this.f31835o.append(' ');
                this.f31835o.append((CharSequence) str);
                this.f31835o.append('\n');
                this.f31836p.remove(str);
                if (l0()) {
                    this.f31839s.submit(this.f31840t);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public void W() throws IOException {
        close();
        r1.d.b(this.f31827g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f31835o == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f31836p.values())) {
                if (dVar.f31851f != null) {
                    dVar.f31851f.a();
                }
            }
            K0();
            J(this.f31835o);
            this.f31835o = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public c d0(String str) {
        return g0(str, -1L);
    }

    public synchronized e k0(String str) {
        Throwable th;
        try {
            try {
                I();
                d dVar = (d) this.f31836p.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f31850e) {
                    return null;
                }
                for (File file : dVar.f31848c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f31837q++;
                this.f31835o.append((CharSequence) "READ");
                this.f31835o.append(' ');
                this.f31835o.append((CharSequence) str);
                this.f31835o.append('\n');
                if (l0()) {
                    this.f31839s.submit(this.f31840t);
                }
                return new e(this, str, dVar.f31852g, dVar.f31848c, dVar.f31847b, null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }
}
