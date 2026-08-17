package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR = new F();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f22540g;

    public zzbv(float[] fArr) {
        this.f22540g = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f22540g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.h(parcel, 1, fArr, false);
        AbstractC3325b.b(parcel, iA);
    }
}
