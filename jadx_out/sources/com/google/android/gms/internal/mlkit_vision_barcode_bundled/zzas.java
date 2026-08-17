package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new C2210x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f22492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f22493h;

    public zzas(double d10, double d11) {
        this.f22492g = d10;
        this.f22493h = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f22492g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.f(parcel, 1, d10);
        AbstractC3325b.f(parcel, 2, this.f22493h);
        AbstractC3325b.b(parcel, iA);
    }
}
