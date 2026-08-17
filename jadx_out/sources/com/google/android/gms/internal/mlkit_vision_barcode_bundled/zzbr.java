package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new D();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f22533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f22535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22536k;

    public zzbr(boolean z10, byte[] bArr, boolean z11, float f10, boolean z12) {
        this.f22532g = z10;
        this.f22533h = bArr;
        this.f22534i = z11;
        this.f22535j = f10;
        this.f22536k = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f22532g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.c(parcel, 1, z10);
        AbstractC3325b.e(parcel, 2, this.f22533h, false);
        AbstractC3325b.c(parcel, 3, this.f22534i);
        AbstractC3325b.g(parcel, 4, this.f22535j);
        AbstractC3325b.c(parcel, 5, this.f22536k);
        AbstractC3325b.b(parcel, iA);
    }
}
