package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0950n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C0950n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21494k;

    public zzan(int i10, int i11, int i12, long j10, int i13) {
        this.f21490g = i10;
        this.f21491h = i11;
        this.f21492i = i12;
        this.f21493j = j10;
        this.f21494k = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21490g);
        AbstractC3325b.j(parcel, 3, this.f21491h);
        AbstractC3325b.j(parcel, 4, this.f21492i);
        AbstractC3325b.l(parcel, 5, this.f21493j);
        AbstractC3325b.j(parcel, 6, this.f21494k);
        AbstractC3325b.b(parcel, iA);
    }
}
