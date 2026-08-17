package E;

import F.F0;
import F.u1;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class F implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S f861b;

    F(F0 f02) {
        this.f860a = f02;
    }

    public static /* synthetic */ void a(F f10, F0.a aVar, F0 f02) {
        f10.getClass();
        aVar.a(f10);
    }

    private androidx.camera.core.o j(androidx.camera.core.o oVar) {
        if (oVar == null) {
            return null;
        }
        u1 u1VarB = this.f861b == null ? u1.b() : u1.a(new Pair(this.f861b.j(), this.f861b.i().get(0)));
        this.f861b = null;
        return new androidx.camera.core.s(oVar, new Size(oVar.getWidth(), oVar.getHeight()), new K.c(new T.l(u1VarB, oVar.i().a())));
    }

    @Override // F.F0
    public androidx.camera.core.o b() {
        return j(this.f860a.b());
    }

    @Override // F.F0
    public int c() {
        return this.f860a.c();
    }

    @Override // F.F0
    public void close() {
        this.f860a.close();
    }

    @Override // F.F0
    public void d() {
        this.f860a.d();
    }

    @Override // F.F0
    public void e(final F0.a aVar, Executor executor) {
        this.f860a.e(new F0.a() { // from class: E.E
            @Override // F.F0.a
            public final void a(F0 f02) {
                F.a(this.f858a, aVar, f02);
            }
        }, executor);
    }

    @Override // F.F0
    public int f() {
        return this.f860a.f();
    }

    @Override // F.F0
    public androidx.camera.core.o g() {
        return j(this.f860a.g());
    }

    @Override // F.F0
    public int getHeight() {
        return this.f860a.getHeight();
    }

    @Override // F.F0
    public Surface getSurface() {
        return this.f860a.getSurface();
    }

    @Override // F.F0
    public int getWidth() {
        return this.f860a.getWidth();
    }

    void h(S s10) {
        H0.g.j(this.f861b == null, "Pending request should be null");
        this.f861b = s10;
    }

    void i() {
        this.f861b = null;
    }
}
