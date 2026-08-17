package com.google.android.material.timepicker;

import Q4.j;
import Q4.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import b5.AbstractC1807a;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f23965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ValueAnimator f23966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f23968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f23969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f23973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f23974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f23975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Paint f23976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RectF f23977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f23978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f23979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private double f23981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23983z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9149j0);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f23983z = AbstractC1807a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + o.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f23983z);
        float fCos = (((float) Math.cos(this.f23981x)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f23981x))) + f11;
        this.f23976s.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f23974q, this.f23976s);
        double dSin = Math.sin(this.f23981x);
        double dCos = Math.cos(this.f23981x);
        this.f23976s.setStrokeWidth(this.f23978u);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f23976s);
        canvas.drawCircle(f10, f11, this.f23975r, this.f23976s);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f23982y * 0.66f) : this.f23982y;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f23967j) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    private void l() {
        this.f23966i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f24002a, valueAnimator);
            }
        });
        this.f23966i.addListener(new a());
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f23979v = f11;
        this.f23981x = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f23983z);
        float fCos = width + (((float) Math.cos(this.f23981x)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f23981x)));
        RectF rectF = this.f23977t;
        int i10 = this.f23974q;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f23973p.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f23973p.add(bVar);
    }

    public RectF e() {
        return this.f23977t;
    }

    public float g() {
        return this.f23979v;
    }

    public int i() {
        return this.f23974q;
    }

    public void m(int i10) {
        this.f23982y = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        this.f23966i.cancel();
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f23966i.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f23966i.setDuration(this.f23964g);
        this.f23966i.setInterpolator(this.f23965h);
        this.f23966i.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f23966i.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f23968k = x10;
            this.f23969l = y10;
            this.f23970m = true;
            this.f23980w = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f23968k);
            int i11 = (int) (y10 - this.f23969l);
            this.f23970m = (i10 * i10) + (i11 * i11) > this.f23971n;
            z11 = this.f23980w;
            boolean z13 = actionMasked == 1;
            if (this.f23972o) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f23980w |= k(x10, y10, z11, z10, z12);
        return true;
    }

    void q(boolean z10) {
        if (this.f23972o && !z10) {
            this.f23983z = 1;
        }
        this.f23972o = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23966i = new ValueAnimator();
        this.f23973p = new ArrayList();
        Paint paint = new Paint();
        this.f23976s = paint;
        this.f23977t = new RectF();
        this.f23983z = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9788s1, i10, j.f9400B);
        this.f23964g = c5.d.f(context, Q4.a.f9159o0, 200);
        this.f23965h = c5.d.g(context, Q4.a.f9173v0, R4.a.f10025b);
        this.f23982y = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9804u1, 0);
        this.f23974q = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9812v1, 0);
        this.f23978u = getResources().getDimensionPixelSize(Q4.c.f9194G);
        this.f23975r = r7.getDimensionPixelSize(Q4.c.f9192E);
        int color = typedArrayObtainStyledAttributes.getColor(k.f9796t1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f23971n = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        l();
    }
}
