package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.J1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new J1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f21496h;

    public zzi(int i10, String[] strArr) {
        this.f21495g = i10;
        this.f21496h = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21495g);
        AbstractC3325b.q(parcel, 3, this.f21496h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
