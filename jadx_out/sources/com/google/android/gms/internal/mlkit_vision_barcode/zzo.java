package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0829c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C0829c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f21537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f21538h;

    public zzo(double d10, double d11) {
        this.f21537g = d10;
        this.f21538h = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.f(parcel, 2, this.f21537g);
        AbstractC3325b.f(parcel, 3, this.f21538h);
        AbstractC3325b.b(parcel, iA);
    }
}
