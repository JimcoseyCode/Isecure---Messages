package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import j3.C2768b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        AbstractC2855l.g(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        if (C2768b.d()) {
            C2768b.a("RoundedNinePatchDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (C2768b.d()) {
                C2768b.b();
                return;
            }
            return;
        }
        m();
        l();
        canvas.clipPath(this.f19784k);
        super.draw(canvas);
        if (C2768b.d()) {
            C2768b.b();
        }
    }
}
