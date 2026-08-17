package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import l6.C2883i;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new C2883i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f24384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24386k;

    public VisionImageMetadataParcel(int i10, int i11, int i12, long j10, int i13) {
        this.f24382g = i10;
        this.f24383h = i11;
        this.f24386k = i12;
        this.f24384i = j10;
        this.f24385j = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f24382g);
        AbstractC3325b.j(parcel, 2, this.f24383h);
        AbstractC3325b.j(parcel, 3, this.f24386k);
        AbstractC3325b.l(parcel, 4, this.f24384i);
        AbstractC3325b.j(parcel, 5, this.f24385j);
        AbstractC3325b.b(parcel, iA);
    }
}
