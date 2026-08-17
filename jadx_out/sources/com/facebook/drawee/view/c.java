package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import c2.i;
import com.facebook.drawee.view.a;
import j3.C2768b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private float mAspectRatio;
    private b mDraweeHolder;
    private Object mExtraData;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final a.C0210a mMeasureSpec;

    public c(Context context) {
        super(context);
        this.mMeasureSpec = new a.C0210a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }

    private void a(Context context) {
        try {
            if (C2768b.d()) {
                C2768b.a("DraweeView#init");
            }
            if (this.mInitialised) {
                if (C2768b.d()) {
                    C2768b.b();
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.mInitialised = true;
            this.mDraweeHolder = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (C2768b.d()) {
                    C2768b.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z10;
            if (C2768b.d()) {
                C2768b.b();
            }
        } catch (Throwable th) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th;
        }
    }

    private void b() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        sGlobalLegacyVisibilityHandlingEnabled = z10;
    }

    protected void doAttach() {
        this.mDraweeHolder.k();
    }

    protected void doDetach() {
        this.mDraweeHolder.l();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public B2.a getController() {
        return this.mDraweeHolder.f();
    }

    public Object getExtraData() {
        return this.mExtraData;
    }

    public B2.b getHierarchy() {
        return this.mDraweeHolder.g();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.h();
    }

    public boolean hasController() {
        return this.mDraweeHolder.f() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.i();
    }

    protected void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        onAttach();
    }

    protected void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0210a c0210a = this.mMeasureSpec;
        c0210a.f19827a = i10;
        c0210a.f19828b = i11;
        a.b(c0210a, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0210a c0210a2 = this.mMeasureSpec;
        super.onMeasure(c0210a2.f19827a, c0210a2.f19828b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        b();
    }

    public void resetActualImage() {
        setController(null);
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f10;
        requestLayout();
    }

    public void setController(B2.a aVar) {
        this.mDraweeHolder.p(aVar);
        super.setImageDrawable(this.mDraweeHolder.h());
    }

    public void setExtraData(Object obj) {
        this.mExtraData = obj;
    }

    public void setHierarchy(B2.b bVar) {
        this.mDraweeHolder.q(bVar);
        super.setImageDrawable(this.mDraweeHolder.h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.mDraweeHolder.o();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.mDraweeHolder.o();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        a(getContext());
        this.mDraweeHolder.o();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.mDraweeHolder.o();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.mLegacyVisibilityHandlingEnabled = z10;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b bVar = this.mDraweeHolder;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
