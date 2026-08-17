package J2;

import C2.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.C1962d;
import d2.AbstractC2325a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.InterfaceC3111a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable, InterfaceC3111a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f5368x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f5369y = b.class;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final d f5370z = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2.a f5371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private L2.b f5372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f5373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5380p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f5382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5383s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a.InterfaceC0023a f5385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1962d f5386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f5387w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5381q = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile d f5384t = f5370z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final L2.b b(C2.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new L2.a(aVar);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: J2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class RunnableC0057b implements Runnable {
        RunnableC0057b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.unscheduleSelf(this);
            b.this.invalidateSelf();
        }
    }

    public b(C2.a aVar) {
        this.f5371g = aVar;
        a.InterfaceC0023a interfaceC0023a = new a.InterfaceC0023a() { // from class: J2.a
        };
        this.f5385u = interfaceC0023a;
        this.f5387w = new RunnableC0057b();
        this.f5372h = f5368x.b(this.f5371g);
        C2.a aVar2 = this.f5371g;
        if (aVar2 != null) {
            aVar2.m(interfaceC0023a);
        }
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void c() {
        this.f5383s++;
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.y(f5369y, "Dropped a frame. Count: %s", Integer.valueOf(this.f5383s));
        }
    }

    private final void d(long j10) {
        long j11 = this.f5374j + j10;
        this.f5376l = j11;
        scheduleSelf(this.f5387w, j11);
    }

    @Override // q2.InterfaceC3111a
    public void a() {
        C2.a aVar = this.f5371g;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        if (this.f5371g == null || this.f5372h == null) {
            return;
        }
        long jB = b();
        long jMax = this.f5373i ? (jB - this.f5374j) + this.f5382r : (long) Math.max(this.f5375k, 0.0d);
        L2.b bVar = this.f5372h;
        AbstractC2855l.d(bVar);
        int iB = bVar.b(jMax, this.f5375k);
        if (iB == -1) {
            C2.a aVar = this.f5371g;
            AbstractC2855l.d(aVar);
            iB = aVar.a() - 1;
            this.f5384t.c(this);
            this.f5373i = false;
        } else if (iB == 0 && this.f5377m != -1 && jB >= this.f5376l) {
            this.f5384t.a(this);
        }
        C2.a aVar2 = this.f5371g;
        AbstractC2855l.d(aVar2);
        boolean zN = aVar2.n(this, canvas, iB);
        if (zN) {
            this.f5384t.d(this, iB);
            this.f5377m = iB;
        }
        if (!zN) {
            c();
        }
        long jB2 = b();
        if (this.f5373i) {
            L2.b bVar2 = this.f5372h;
            AbstractC2855l.d(bVar2);
            long jA = bVar2.a(jB2 - this.f5374j);
            if (jA != -1) {
                d(jA + this.f5381q);
            } else {
                this.f5384t.c(this);
                this.f5373i = false;
            }
        }
        this.f5375k = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C2.a aVar = this.f5371g;
        return aVar != null ? aVar.c() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C2.a aVar = this.f5371g;
        return aVar != null ? aVar.e() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5373i;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC2855l.g(bounds, "bounds");
        super.onBoundsChange(bounds);
        C2.a aVar = this.f5371g;
        if (aVar != null) {
            aVar.d(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f5373i) {
            return false;
        }
        long j10 = i10;
        if (this.f5375k == j10) {
            return false;
        }
        this.f5375k = j10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f5386v == null) {
            this.f5386v = new C1962d();
        }
        C1962d c1962d = this.f5386v;
        AbstractC2855l.d(c1962d);
        c1962d.b(i10);
        C2.a aVar = this.f5371g;
        if (aVar != null) {
            aVar.k(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5386v == null) {
            this.f5386v = new C1962d();
        }
        C1962d c1962d = this.f5386v;
        AbstractC2855l.d(c1962d);
        c1962d.c(colorFilter);
        C2.a aVar = this.f5371g;
        if (aVar != null) {
            aVar.g(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        C2.a aVar;
        if (this.f5373i || (aVar = this.f5371g) == null) {
            return;
        }
        AbstractC2855l.d(aVar);
        if (aVar.a() <= 1) {
            return;
        }
        this.f5373i = true;
        long jB = b();
        long j10 = jB - this.f5378n;
        this.f5374j = j10;
        this.f5376l = j10;
        this.f5375k = jB - this.f5379o;
        this.f5377m = this.f5380p;
        invalidateSelf();
        this.f5384t.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f5373i) {
            long jB = b();
            this.f5378n = jB - this.f5374j;
            this.f5379o = jB - this.f5375k;
            this.f5380p = this.f5377m;
            this.f5373i = false;
            this.f5374j = 0L;
            this.f5376l = 0L;
            this.f5375k = -1L;
            this.f5377m = -1;
            unscheduleSelf(this.f5387w);
            this.f5384t.c(this);
        }
    }
}
