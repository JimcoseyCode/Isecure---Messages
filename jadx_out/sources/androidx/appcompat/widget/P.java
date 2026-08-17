package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.InterfaceC2820e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f14688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f14690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final View f14691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f14692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Runnable f14693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f14696o = new int[2];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = P.this.f14691j.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P.this.e();
        }
    }

    public P(View view) {
        this.f14691j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14688g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14689h = tapTimeout;
        this.f14690i = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f14693l;
        if (runnable != null) {
            this.f14691j.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14692k;
        if (runnable2 != null) {
            this.f14691j.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        N n10;
        View view = this.f14691j;
        InterfaceC2820e interfaceC2820eB = b();
        if (interfaceC2820eB != null && interfaceC2820eB.isShowing() && (n10 = (N) interfaceC2820eB.j()) != null && n10.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(n10, motionEventObtainNoHistory);
            boolean zE = n10.e(motionEventObtainNoHistory, this.f14695n);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f14691j;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14695n = motionEvent.getPointerId(0);
            if (this.f14692k == null) {
                this.f14692k = new a();
            }
            view.postDelayed(this.f14692k, this.f14689h);
            if (this.f14693l == null) {
                this.f14693l = new b();
            }
            view.postDelayed(this.f14693l, this.f14690i);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f14695n);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f14688g)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f14696o);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f14696o);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract InterfaceC2820e b();

    protected abstract boolean c();

    protected boolean d() {
        InterfaceC2820e interfaceC2820eB = b();
        if (interfaceC2820eB == null || !interfaceC2820eB.isShowing()) {
            return true;
        }
        interfaceC2820eB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f14691j;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f14694m = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f14694m;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f14691j.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f14694m = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f14694m = false;
        this.f14695n = -1;
        Runnable runnable = this.f14692k;
        if (runnable != null) {
            this.f14691j.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
