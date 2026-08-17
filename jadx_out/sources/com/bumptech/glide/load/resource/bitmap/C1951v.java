package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1951v implements v1.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.l f19279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19280c;

    public C1951v(v1.l lVar, boolean z10) {
        this.f19279b = lVar;
        this.f19280c = z10;
    }

    private x1.v c(Context context, x1.v vVar) {
        return V.d(context.getResources(), vVar);
    }

    @Override // v1.l
    public x1.v a(Context context, x1.v vVar, int i10, int i11) {
        y1.d dVarG = com.bumptech.glide.b.d(context).g();
        Drawable drawable = (Drawable) vVar.get();
        x1.v vVarA = AbstractC1950u.a(dVarG, drawable, i10, i11);
        if (vVarA != null) {
            x1.v vVarA2 = this.f19279b.a(context, vVarA, i10, i11);
            if (!vVarA2.equals(vVarA)) {
                return c(context, vVarA2);
            }
            vVarA2.recycle();
            return vVar;
        }
        if (!this.f19280c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof C1951v) {
            return this.f19279b.equals(((C1951v) obj).f19279b);
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        return this.f19279b.hashCode();
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f19279b.updateDiskCacheKey(messageDigest);
    }

    public v1.l b() {
        return this;
    }
}
