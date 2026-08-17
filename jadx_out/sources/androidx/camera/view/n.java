package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import m5.InterfaceFutureC2904a;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Size f15399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    FrameLayout f15400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f15401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15402d = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a();
    }

    n(FrameLayout frameLayout, f fVar) {
        this.f15400b = frameLayout;
        this.f15401c = fVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f15401c.a(bitmapC, new Size(this.f15400b.getWidth(), this.f15400b.getHeight()), this.f15400b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f15402d = true;
        h();
    }

    abstract void g(I0 i02, a aVar);

    void h() {
        View viewB = b();
        if (viewB == null || !this.f15402d) {
            return;
        }
        this.f15401c.s(new Size(this.f15400b.getWidth(), this.f15400b.getHeight()), this.f15400b.getLayoutDirection(), viewB);
    }

    abstract InterfaceFutureC2904a i();
}
