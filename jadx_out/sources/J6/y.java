package J6;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f6771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f6772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f6773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f6778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f6783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f6784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f6788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f6789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f6790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f6792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6793x;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f6789t = motionEvent.getX();
            y.this.f6790u = motionEvent.getY();
            y.this.f6791v = 1;
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        boolean a(y yVar);

        void b(y yVar);

        boolean c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, null);
    }

    private boolean j() {
        return this.f6791v != 0;
    }

    public float d() {
        return this.f6776g;
    }

    public float e() {
        return this.f6772c;
    }

    public float f() {
        return this.f6773d;
    }

    public float g() {
        if (!j()) {
            float f10 = this.f6777h;
            if (f10 > 0.0f) {
                return this.f6776g / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.f6793x;
        boolean z11 = (z10 && this.f6776g < this.f6777h) || (!z10 && this.f6776g > this.f6777h);
        float fAbs = Math.abs(1.0f - (this.f6776g / this.f6777h)) * 0.5f;
        if (this.f6777h <= this.f6786q) {
            return 1.0f;
        }
        return z11 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public long h() {
        return this.f6783n - this.f6784o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f10;
        float f11;
        this.f6783n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6774e) {
            this.f6792w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f6791v == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f6785p) {
                this.f6771b.b(this);
                this.f6785p = false;
                this.f6778i = 0.0f;
                this.f6791v = 0;
            } else if (j() && z12) {
                this.f6785p = false;
                this.f6778i = 0.0f;
                this.f6791v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f6785p && this.f6775f && !j() && !z12 && z10) {
            this.f6789t = motionEvent.getX();
            this.f6790u = motionEvent.getY();
            this.f6791v = 2;
            this.f6778i = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f11 = this.f6789t;
            f10 = this.f6790u;
            if (motionEvent.getY() < f10) {
                this.f6793x = true;
            } else {
                this.f6793x = false;
            }
        } else {
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += motionEvent.getX(i11);
                    y10 += motionEvent.getY(i11);
                }
            }
            float f12 = i10;
            float f13 = x10 / f12;
            f10 = y10 / f12;
            f11 = f13;
        }
        float fAbs2 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                fAbs += Math.abs(motionEvent.getX(i12) - f11);
                fAbs2 += Math.abs(motionEvent.getY(i12) - f10);
            }
        }
        float f14 = i10;
        float f15 = (fAbs / f14) * 2.0f;
        float f16 = (fAbs2 / f14) * 2.0f;
        float fHypot = j() ? f16 : (float) Math.hypot(f15, f16);
        boolean z15 = this.f6785p;
        this.f6772c = f11;
        this.f6773d = f10;
        if (!j() && this.f6785p && (fHypot < this.f6787r || z13)) {
            this.f6771b.b(this);
            this.f6785p = false;
            this.f6778i = fHypot;
        }
        if (z13) {
            this.f6779j = f15;
            this.f6781l = f15;
            this.f6780k = f16;
            this.f6782m = f16;
            this.f6776g = fHypot;
            this.f6777h = fHypot;
            this.f6778i = fHypot;
        }
        int i13 = j() ? this.f6786q : this.f6787r;
        if (!this.f6785p && fHypot >= i13 && (z15 || Math.abs(fHypot - this.f6778i) > this.f6786q)) {
            this.f6779j = f15;
            this.f6781l = f15;
            this.f6780k = f16;
            this.f6782m = f16;
            this.f6776g = fHypot;
            this.f6777h = fHypot;
            this.f6784o = this.f6783n;
            this.f6785p = this.f6771b.a(this);
        }
        if (actionMasked == 2) {
            this.f6779j = f15;
            this.f6780k = f16;
            this.f6776g = fHypot;
            if (this.f6785p ? this.f6771b.c(this) : true) {
                this.f6781l = this.f6779j;
                this.f6782m = this.f6780k;
                this.f6777h = this.f6776g;
                this.f6784o = this.f6783n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f6774e = z10;
        if (z10 && this.f6792w == null) {
            this.f6792w = new GestureDetector(this.f6770a, new a(), this.f6788s);
        }
    }

    public void m(boolean z10) {
        this.f6775f = z10;
    }

    public y(Context context, b bVar, Handler handler) {
        this.f6791v = 0;
        this.f6770a = context;
        this.f6771b = bVar;
        this.f6786q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f6787r = 0;
        this.f6788s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }
}
