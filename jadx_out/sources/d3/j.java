package d3;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f25572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25573k;

    public j(Drawable drawable) {
        this.f25572j = drawable;
    }

    @Override // d3.g
    public Drawable U() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f25572j;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // d3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25572j = null;
        this.f25573k = true;
    }

    @Override // d3.e, d3.m
    public int getHeight() {
        Drawable drawable = this.f25572j;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // d3.e, d3.m
    public int getWidth() {
        Drawable drawable = this.f25572j;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // d3.e
    public boolean isClosed() {
        return this.f25573k;
    }

    @Override // d3.e
    public int l() {
        return getWidth() * getHeight() * 4;
    }
}
