package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import h5.h;

/* JADX INFO: renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2229h extends h5.h {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    b f23833O;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends AbstractC2229h {
        c(b bVar) {
            super(bVar);
        }

        @Override // h5.h
        protected void w(Canvas canvas) {
            if (this.f23833O.f23834x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f23833O.f23834x);
            } else {
                canvas.clipRect(this.f23833O.f23834x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2229h u0(b bVar) {
        return new c(bVar);
    }

    static AbstractC2229h v0(h5.l lVar) {
        if (lVar == null) {
            lVar = new h5.l();
        }
        return u0(new b(lVar, new RectF()));
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f23833O = new b(this.f23833O);
        return this;
    }

    boolean w0() {
        return !this.f23833O.f23834x.isEmpty();
    }

    void x0() {
        y0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void y0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f23833O.f23834x.left && f11 == this.f23833O.f23834x.top && f12 == this.f23833O.f23834x.right && f13 == this.f23833O.f23834x.bottom) {
            return;
        }
        this.f23833O.f23834x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void z0(RectF rectF) {
        y0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends h.c {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f23834x;

        @Override // h5.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC2229h abstractC2229hU0 = AbstractC2229h.u0(this);
            abstractC2229hU0.invalidateSelf();
            return abstractC2229hU0;
        }

        private b(h5.l lVar, RectF rectF) {
            super(lVar, null);
            this.f23834x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f23834x = bVar.f23834x;
        }
    }

    private AbstractC2229h(b bVar) {
        super(bVar);
        this.f23833O = bVar;
    }
}
