package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.R9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new R9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21648h;

    public zzyd(int i10, boolean z10) {
        this.f21647g = i10;
        this.f21648h = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21647g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.c(parcel, 2, this.f21648h);
        AbstractC3325b.b(parcel, iA);
    }
}
