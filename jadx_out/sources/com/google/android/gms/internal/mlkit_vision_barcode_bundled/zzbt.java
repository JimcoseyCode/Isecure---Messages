package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new E();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f22537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22539i;

    public zzbt(float[] fArr, int i10, boolean z10) {
        this.f22537g = fArr;
        this.f22538h = i10;
        this.f22539i = z10;
    }

    public final float[] X() {
        return this.f22537g;
    }

    public final int e() {
        return this.f22538h;
    }

    public final boolean s() {
        return this.f22539i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f22537g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.h(parcel, 1, fArr, false);
        AbstractC3325b.j(parcel, 2, this.f22538h);
        AbstractC3325b.c(parcel, 3, this.f22539i);
        AbstractC3325b.b(parcel, iA);
    }
}
