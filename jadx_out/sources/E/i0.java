package E;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import y.AbstractC3583h0;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f976a = new N.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f977b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void f(i0 i0Var);
    }

    public static /* synthetic */ void a(i0 i0Var, y.X x10) {
        boolean z10 = i0Var.j() != null;
        i0Var.l();
        if (!z10) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        V.e eVarJ = i0Var.j();
        Objects.requireNonNull(eVarJ);
        eVarJ.onError(x10);
    }

    public static /* synthetic */ void b(i0 i0Var, V.h hVar) {
        i0Var.l();
        throw null;
    }

    public static /* synthetic */ void c(i0 i0Var, androidx.camera.core.o oVar) {
        V.e eVarJ = i0Var.j();
        Objects.requireNonNull(eVarJ);
        Objects.requireNonNull(oVar);
        eVarJ.onCaptureSuccess(oVar);
    }

    public static /* synthetic */ void d(i0 i0Var, Bitmap bitmap) {
        i0Var.l();
        if (i0Var.j() != null) {
            i0Var.j().onPostviewBitmapAvailable(bitmap);
        }
    }

    public static /* synthetic */ void e(i0 i0Var, int i10) {
        i0Var.l();
        if (i0Var.j() != null) {
            i0Var.j().onCaptureProcessProgressed(i10);
        }
    }

    public static i0 v(Executor executor, V.e eVar, V.f fVar, V.g gVar, V.g gVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List list) {
        H0.g.b(fVar == null, "onDiskCallback and outputFileOptions should be both null or both non-null.");
        H0.g.b((eVar == null) ^ (fVar == null), "One and only one on-disk or in-memory callback should be present.");
        C0447g c0447g = new C0447g(executor, eVar, fVar, gVar, gVar2, rect, matrix, i10, i11, i12, z10, list);
        if (z10) {
            c0447g.r();
        }
        return c0447g;
    }

    void A(final V.h hVar) {
        g().execute(new Runnable() { // from class: E.g0
            @Override // java.lang.Runnable
            public final void run() {
                i0.b(this.f971g, hVar);
            }
        });
    }

    boolean f() {
        H.y.b();
        int i10 = this.f976a;
        if (i10 <= 0) {
            return false;
        }
        this.f976a = i10 - 1;
        return true;
    }

    abstract Executor g();

    abstract int h();

    public abstract Rect i();

    public abstract V.e j();

    public abstract int k();

    public abstract V.f l();

    public abstract V.g m();

    public abstract int n();

    public abstract V.g o();

    abstract Matrix p();

    abstract List q();

    void r() {
        Map map = this.f977b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.f977b.put(256, bool);
    }

    boolean s() {
        Iterator it = this.f977b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    abstract boolean t();

    void u(int i10, boolean z10) {
        if (this.f977b.containsKey(Integer.valueOf(i10))) {
            this.f977b.put(Integer.valueOf(i10), Boolean.valueOf(z10));
        } else {
            AbstractC3583h0.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    void w(final int i10) {
        g().execute(new Runnable() { // from class: E.d0
            @Override // java.lang.Runnable
            public final void run() {
                i0.e(this.f952g, i10);
            }
        });
    }

    void x(final y.X x10) {
        g().execute(new Runnable() { // from class: E.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.a(this.f973g, x10);
            }
        });
    }

    void y(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: E.f0
            @Override // java.lang.Runnable
            public final void run() {
                i0.d(this.f960g, bitmap);
            }
        });
    }

    void z(final androidx.camera.core.o oVar) {
        g().execute(new Runnable() { // from class: E.e0
            @Override // java.lang.Runnable
            public final void run() {
                i0.c(this.f956g, oVar);
            }
        });
    }
}
