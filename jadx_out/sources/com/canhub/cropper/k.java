package com.canhub.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Animation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f19615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CropOverlayView f19616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f19617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f19618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f19619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f19620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float[] f19621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f19622n;

    public k(ImageView imageView, CropOverlayView cropOverlayView) {
        AbstractC2855l.g(imageView, "imageView");
        AbstractC2855l.g(cropOverlayView, "cropOverlayView");
        this.f19615g = imageView;
        this.f19616h = cropOverlayView;
        this.f19617i = new float[8];
        this.f19618j = new float[8];
        this.f19619k = new RectF();
        this.f19620l = new RectF();
        this.f19621m = new float[9];
        this.f19622n = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void a(float[] boundPoints, Matrix imageMatrix) {
        AbstractC2855l.g(boundPoints, "boundPoints");
        AbstractC2855l.g(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f19618j, 0, 8);
        this.f19620l.set(this.f19616h.getCropWindowRect());
        imageMatrix.getValues(this.f19622n);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        AbstractC2855l.g(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f19619k;
        float f11 = rectF2.left;
        RectF rectF3 = this.f19620l;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f19617i[i10];
            fArr[i10] = f15 + ((this.f19618j[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f19616h;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.u(fArr, this.f19615g.getWidth(), this.f19615g.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f19621m[i11];
            fArr2[i11] = f16 + ((this.f19622n[i11] - f16) * f10);
        }
        ImageView imageView = this.f19615g;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    public final void b(float[] boundPoints, Matrix imageMatrix) {
        AbstractC2855l.g(boundPoints, "boundPoints");
        AbstractC2855l.g(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f19617i, 0, 8);
        this.f19619k.set(this.f19616h.getCropWindowRect());
        imageMatrix.getValues(this.f19621m);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AbstractC2855l.g(animation, "animation");
        this.f19615g.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        AbstractC2855l.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AbstractC2855l.g(animation, "animation");
    }
}
