package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzbr f22531g;

    public zzbe(zzbr zzbrVar) {
        this.f22531g = zzbrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzbr zzbrVar = this.f22531g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, zzbrVar, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
