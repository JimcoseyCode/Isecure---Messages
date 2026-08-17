package z1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import r1.C3249b;
import z1.InterfaceC3666a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC3666a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f34192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34193c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3249b f34195e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3668c f34194d = new C3668c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f34191a = new j();

    protected e(File file, long j10) {
        this.f34192b = file;
        this.f34193c = j10;
    }

    public static InterfaceC3666a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized C3249b d() {
        try {
            if (this.f34195e == null) {
                this.f34195e = C3249b.t0(this.f34192b, 1, 1, this.f34193c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34195e;
    }

    private synchronized void e() {
        this.f34195e = null;
    }

    @Override // z1.InterfaceC3666a
    public File a(v1.f fVar) {
        String strB = this.f34191a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(fVar);
        }
        try {
            C3249b.e eVarK0 = d().k0(strB);
            if (eVarK0 != null) {
                return eVarK0.a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // z1.InterfaceC3666a
    public void b(v1.f fVar, InterfaceC3666a.b bVar) {
        String strB = this.f34191a.b(fVar);
        this.f34194d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(fVar);
            }
            try {
                C3249b c3249bD = d();
                if (c3249bD.k0(strB) == null) {
                    C3249b.c cVarD0 = c3249bD.d0(strB);
                    if (cVarD0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarD0.f(0))) {
                            cVarD0.e();
                        }
                        cVarD0.b();
                    } catch (Throwable th) {
                        cVarD0.b();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
        } finally {
            this.f34194d.b(strB);
        }
    }

    @Override // z1.InterfaceC3666a
    public synchronized void clear() {
        try {
            try {
                d().W();
            } catch (IOException unused) {
            } catch (Throwable th) {
                e();
                throw th;
            }
            e();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
