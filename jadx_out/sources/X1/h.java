package X1;

import W1.a;
import X1.f;
import b2.AbstractC1799a;
import b2.AbstractC1801c;
import c2.n;
import d2.AbstractC2325a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f12390f = h.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f12392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W1.a f12394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f12395e = new a(null, null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f12396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f12397b;

        a(File file, f fVar) {
            this.f12396a = fVar;
            this.f12397b = file;
        }
    }

    public h(int i10, n nVar, String str, W1.a aVar) {
        this.f12391a = i10;
        this.f12394d = aVar;
        this.f12392b = nVar;
        this.f12393c = str;
    }

    private void j() throws AbstractC1801c.a {
        File file = new File((File) this.f12392b.get(), this.f12393c);
        i(file);
        this.f12395e = new a(file, new X1.a(file, this.f12391a, this.f12394d));
    }

    private boolean m() {
        File file;
        a aVar = this.f12395e;
        return aVar.f12396a == null || (file = aVar.f12397b) == null || !file.exists();
    }

    @Override // X1.f
    public void a() {
        l().a();
    }

    @Override // X1.f
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            AbstractC2325a.j(f12390f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // X1.f
    public f.b c(String str, Object obj) {
        return l().c(str, obj);
    }

    @Override // X1.f
    public boolean d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // X1.f
    public boolean e(String str, Object obj) {
        return l().e(str, obj);
    }

    @Override // X1.f
    public V1.a f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // X1.f
    public Collection g() {
        return l().g();
    }

    @Override // X1.f
    public long h(f.a aVar) {
        return l().h(aVar);
    }

    void i(File file) throws AbstractC1801c.a {
        try {
            AbstractC1801c.a(file);
            AbstractC2325a.a(f12390f, "Created cache directory %s", file.getAbsolutePath());
        } catch (AbstractC1801c.a e10) {
            this.f12394d.a(a.EnumC0127a.WRITE_CREATE_DIR, f12390f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    @Override // X1.f
    public boolean isExternal() {
        try {
            return l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void k() {
        if (this.f12395e.f12396a == null || this.f12395e.f12397b == null) {
            return;
        }
        AbstractC1799a.b(this.f12395e.f12397b);
    }

    synchronized f l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) c2.k.g(this.f12395e.f12396a);
    }

    @Override // X1.f
    public long remove(String str) {
        return l().remove(str);
    }
}
