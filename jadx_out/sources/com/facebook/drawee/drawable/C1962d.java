package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1962d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19700f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f19703c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19701a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19704d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19705e = -1;

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f19701a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f19702b) {
            drawable.setColorFilter(this.f19703c);
        }
        int i11 = this.f19704d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f19705e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public final void b(int i10) {
        this.f19701a = i10;
    }

    public final void c(ColorFilter colorFilter) {
        this.f19703c = colorFilter;
        this.f19702b = colorFilter != null;
    }

    public final void d(boolean z10) {
        this.f19704d = z10 ? 1 : 0;
    }

    public final void e(boolean z10) {
        this.f19705e = z10 ? 1 : 0;
    }
}
