package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcc> CREATOR = new M();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f22544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f22545k;

    public zzcc(int i10, int i11, int i12, int i13, long j10) {
        this.f22541g = i10;
        this.f22542h = i11;
        this.f22543i = i12;
        this.f22544j = i13;
        this.f22545k = j10;
    }

    public final int X() {
        return this.f22544j;
    }

    public final int e() {
        return this.f22543i;
    }

    public final int k0() {
        return this.f22542h;
    }

    public final int s() {
        return this.f22541g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f22541g);
        AbstractC3325b.j(parcel, 2, this.f22542h);
        AbstractC3325b.j(parcel, 3, this.f22543i);
        AbstractC3325b.j(parcel, 4, this.f22544j);
        AbstractC3325b.l(parcel, 5, this.f22545k);
        AbstractC3325b.b(parcel, iA);
    }
}
