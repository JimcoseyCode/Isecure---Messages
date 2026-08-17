package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import f.AbstractC2577j;

/* JADX INFO: renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1627a {
    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(Drawable drawable);

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(float f10);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public androidx.appcompat.view.b y(b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class C0145a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14121a;

        public C0145a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14121a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f27128t);
            this.f14121a = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27133u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0145a(int i10, int i11) {
            super(i10, i11);
            this.f14121a = 8388627;
        }

        public C0145a(C0145a c0145a) {
            super((ViewGroup.MarginLayoutParams) c0145a);
            this.f14121a = 0;
            this.f14121a = c0145a.f14121a;
        }

        public C0145a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14121a = 0;
        }
    }

    void m() {
    }

    public void l(Configuration configuration) {
    }
}
