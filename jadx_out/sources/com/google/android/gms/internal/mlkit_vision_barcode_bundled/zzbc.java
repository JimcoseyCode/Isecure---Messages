package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C2180q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzbt f22527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zzbv f22528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22529i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22530j;

    public zzbc(zzbt zzbtVar, zzbv zzbvVar, boolean z10, boolean z11) {
        this.f22527g = zzbtVar;
        this.f22528h = zzbvVar;
        this.f22530j = z11;
    }

    public final zzbt e() {
        return this.f22527g;
    }

    public final boolean s() {
        return this.f22530j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, this.f22527g, i10, false);
        AbstractC3325b.o(parcel, 2, this.f22528h, i10, false);
        AbstractC3325b.c(parcel, 3, this.f22529i);
        AbstractC3325b.c(parcel, 4, this.f22530j);
        AbstractC3325b.b(parcel, iA);
    }
}
