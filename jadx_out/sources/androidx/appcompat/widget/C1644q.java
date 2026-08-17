package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1644q extends ImageView {
    private final C1631d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1643p mImageHelper;

    public C1644q(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.b();
        }
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            return c1643p.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            return c1643p.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null && drawable != null && !this.mHasLevel) {
            c1643p.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1643p c1643p2 = this.mImageHelper;
        if (c1643p2 != null) {
            c1643p2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1643p c1643p = this.mImageHelper;
        if (c1643p != null) {
            c1643p.k(mode);
        }
    }

    public C1644q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1644q(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        this.mHasLevel = false;
        b0.a(this, getContext());
        C1631d c1631d = new C1631d(this);
        this.mBackgroundTintHelper = c1631d;
        c1631d.e(attributeSet, i10);
        C1643p c1643p = new C1643p(this);
        this.mImageHelper = c1643p;
        c1643p.g(attributeSet, i10);
    }
}
