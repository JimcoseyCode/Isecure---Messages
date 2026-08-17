package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.ha;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyu> CREATOR = new ha();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21653k;

    public zzyu(int i10, int i11, int i12, int i13, long j10) {
        this.f21649g = i10;
        this.f21650h = i11;
        this.f21651i = i12;
        this.f21652j = i13;
        this.f21653k = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21649g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, this.f21650h);
        AbstractC3325b.j(parcel, 3, this.f21651i);
        AbstractC3325b.j(parcel, 4, this.f21652j);
        AbstractC3325b.l(parcel, 5, this.f21653k);
        AbstractC3325b.b(parcel, iA);
    }
}
