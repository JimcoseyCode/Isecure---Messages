package X1;

import W1.a;
import X1.f;
import android.os.Environment;
import b2.AbstractC1799a;
import b2.AbstractC1801c;
import b2.InterfaceC1800b;
import c2.C1842c;
import j2.C2766d;
import j2.InterfaceC2763a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements X1.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f12317f = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f12318g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f12319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f12321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W1.a f12322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2763a f12323e;

    /* JADX INFO: renamed from: X1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class C0131a implements InterfaceC1800b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12324a;

        @Override // b2.InterfaceC1800b
        public void a(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null || cVarU.f12330a != ".cnt") {
                return;
            }
            this.f12324a.add(new b(cVarU.f12331b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f12324a);
        }

        private C0131a() {
            this.f12324a = new ArrayList();
        }

        @Override // b2.InterfaceC1800b
        public void b(File file) {
        }

        @Override // b2.InterfaceC1800b
        public void c(File file) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V1.b f12327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f12328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12329d;

        @Override // X1.f.a
        public long a() {
            if (this.f12329d < 0) {
                this.f12329d = this.f12327b.d().lastModified();
            }
            return this.f12329d;
        }

        @Override // X1.f.a
        public long b() {
            if (this.f12328c < 0) {
                this.f12328c = this.f12327b.size();
            }
            return this.f12328c;
        }

        public V1.b c() {
            return this.f12327b;
        }

        @Override // X1.f.a
        public String getId() {
            return this.f12326a;
        }

        private b(String str, File file) {
            c2.k.g(file);
            this.f12326a = (String) c2.k.g(str);
            this.f12327b = V1.b.b(file);
            this.f12328c = -1L;
            this.f12329d = -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12331b;

        public static c b(File file) {
            String strS;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strS = a.s(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strS.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strS, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f12331b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f12331b + this.f12330a;
        }

        public String toString() {
            return this.f12330a + "(" + this.f12331b + ")";
        }

        private c(String str, String str2) {
            this.f12330a = str;
            this.f12331b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f12333b;

        public e(String str, File file) {
            this.f12332a = str;
            this.f12333b = file;
        }

        public V1.a a(Object obj, long j10) throws AbstractC1801c.d {
            File fileQ = a.this.q(this.f12332a);
            try {
                AbstractC1801c.b(this.f12333b, fileQ);
                if (fileQ.exists()) {
                    fileQ.setLastModified(j10);
                }
                return V1.b.b(fileQ);
            } catch (AbstractC1801c.d e10) {
                Throwable cause = e10.getCause();
                a.this.f12322d.a(cause != null ? !(cause instanceof AbstractC1801c.C0198c) ? cause instanceof FileNotFoundException ? a.EnumC0127a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : a.EnumC0127a.WRITE_RENAME_FILE_OTHER : a.EnumC0127a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND : a.EnumC0127a.WRITE_RENAME_FILE_OTHER, a.f12317f, "commit", e10);
                throw e10;
            }
        }

        @Override // X1.f.b
        public boolean f() {
            return !this.f12333b.exists() || this.f12333b.delete();
        }

        @Override // X1.f.b
        public V1.a g(Object obj) {
            return a(obj, a.this.f12323e.now());
        }

        @Override // X1.f.b
        public void h(W1.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f12333b);
                try {
                    C1842c c1842c = new C1842c(fileOutputStream);
                    jVar.a(c1842c);
                    c1842c.flush();
                    long jD = c1842c.d();
                    fileOutputStream.close();
                    if (this.f12333b.length() != jD) {
                        throw new d(jD, this.f12333b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                a.this.f12322d.a(a.EnumC0127a.WRITE_UPDATE_FILE_NOT_FOUND, a.f12317f, "updateResource", e10);
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f implements InterfaceC1800b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12335a;

        private boolean d(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null) {
                return false;
            }
            String str = cVarU.f12330a;
            if (str == ".tmp") {
                return e(file);
            }
            c2.k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f12323e.now() - a.f12318g;
        }

        @Override // b2.InterfaceC1800b
        public void a(File file) {
            if (this.f12335a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // b2.InterfaceC1800b
        public void b(File file) {
            if (this.f12335a || !file.equals(a.this.f12321c)) {
                return;
            }
            this.f12335a = true;
        }

        @Override // b2.InterfaceC1800b
        public void c(File file) {
            if (!a.this.f12319a.equals(file) && !this.f12335a) {
                file.delete();
            }
            if (this.f12335a && file.equals(a.this.f12321c)) {
                this.f12335a = false;
            }
        }

        private f() {
        }
    }

    public a(File file, int i10, W1.a aVar) {
        c2.k.g(file);
        this.f12319a = file;
        this.f12320b = y(file, aVar);
        this.f12321c = new File(file, x(i10));
        this.f12322d = aVar;
        B();
        this.f12323e = C2766d.a();
    }

    private boolean A(String str, boolean z10) {
        File fileQ = q(str);
        boolean zExists = fileQ.exists();
        if (z10 && zExists) {
            fileQ.setLastModified(this.f12323e.now());
        }
        return zExists;
    }

    private void B() {
        if (this.f12319a.exists()) {
            if (this.f12321c.exists()) {
                return;
            } else {
                AbstractC1799a.b(this.f12319a);
            }
        }
        try {
            AbstractC1801c.a(this.f12321c);
        } catch (AbstractC1801c.a unused) {
            this.f12322d.a(a.EnumC0127a.WRITE_CREATE_DIR, f12317f, "version directory could not be created: " + this.f12321c, null);
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(w(cVar.f12331b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c u(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && v(cVarB.f12331b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        return this.f12321c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean y(File file, W1.a aVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException e10) {
                e = e10;
                canonicalPath = null;
            }
            try {
                return canonicalPath.contains(string);
            } catch (IOException e11) {
                e = e11;
                aVar.a(a.EnumC0127a.OTHER, f12317f, "failed to read folder to check if external: " + canonicalPath, e);
                return false;
            }
        } catch (Exception e12) {
            aVar.a(a.EnumC0127a.OTHER, f12317f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    private void z(File file, String str) throws AbstractC1801c.a {
        try {
            AbstractC1801c.a(file);
        } catch (AbstractC1801c.a e10) {
            this.f12322d.a(a.EnumC0127a.WRITE_CREATE_DIR, f12317f, str, e10);
            throw e10;
        }
    }

    @Override // X1.f
    public void a() {
        AbstractC1799a.a(this.f12319a);
    }

    @Override // X1.f
    public void b() {
        AbstractC1799a.c(this.f12319a, new f());
    }

    @Override // X1.f
    public f.b c(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str);
        File fileV = v(cVar.f12331b);
        if (!fileV.exists()) {
            z(fileV, "insert");
        }
        try {
            return new e(str, cVar.a(fileV));
        } catch (IOException e10) {
            this.f12322d.a(a.EnumC0127a.WRITE_CREATE_TEMPFILE, f12317f, "insert", e10);
            throw e10;
        }
    }

    @Override // X1.f
    public boolean d(String str, Object obj) {
        return A(str, true);
    }

    @Override // X1.f
    public boolean e(String str, Object obj) {
        return A(str, false);
    }

    @Override // X1.f
    public V1.a f(String str, Object obj) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return null;
        }
        fileQ.setLastModified(this.f12323e.now());
        return V1.b.c(fileQ);
    }

    @Override // X1.f
    public long h(f.a aVar) {
        return p(((b) aVar).c().d());
    }

    @Override // X1.f
    public boolean isExternal() {
        return this.f12320b;
    }

    File q(String str) {
        return new File(t(str));
    }

    @Override // X1.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List g() {
        C0131a c0131a = new C0131a();
        AbstractC1799a.c(this.f12321c, c0131a);
        return c0131a.d();
    }

    @Override // X1.f
    public long remove(String str) {
        return p(q(str));
    }
}
