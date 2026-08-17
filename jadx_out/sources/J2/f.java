package J2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C1962d;
import kotlin.jvm.internal.AbstractC2855l;
import q2.InterfaceC3111a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable implements Animatable, InterfaceC3111a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2.a f5401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f5402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f5403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1962d f5404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f5405k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.unscheduleSelf(this);
            f.this.invalidateSelf();
        }
    }

    public f(C2.a animationBackend) {
        AbstractC2855l.g(animationBackend, "animationBackend");
        this.f5401g = animationBackend;
        this.f5402h = new c(new L2.a(this.f5401g));
        this.f5403i = new e();
        C1962d c1962d = new C1962d();
        c1962d.a(this);
        this.f5404j = c1962d;
        this.f5405k = new a();
    }

    @Override // q2.InterfaceC3111a
    public void a() {
        this.f5401g.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        int iA = this.f5402h.a();
        if (iA == -1) {
            iA = this.f5401g.a() - 1;
            this.f5402h.g(false);
            this.f5403i.c(this);
        } else if (iA == 0 && this.f5402h.h()) {
            this.f5403i.a(this);
        }
        if (this.f5401g.n(this, canvas, iA)) {
            this.f5403i.d(this, iA);
            this.f5402h.f(iA);
        } else {
            this.f5402h.e();
        }
        long jC = this.f5402h.c();
        if (jC != -1) {
            scheduleSelf(this.f5405k, jC);
        } else {
            this.f5403i.c(this);
            this.f5402h.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5401g.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5401g.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5402h.b();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC2855l.g(bounds, "bounds");
        this.f5401g.d(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5404j.b(i10);
        this.f5401g.k(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5404j.c(colorFilter);
        this.f5401g.g(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f5401g.a() <= 0) {
            return;
        }
        this.f5402h.i();
        this.f5403i.b(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5402h.j();
        this.f5403i.c(this);
        unscheduleSelf(this.f5405k);
    }
}
