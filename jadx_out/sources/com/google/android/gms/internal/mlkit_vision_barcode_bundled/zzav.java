package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new I();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22504h;

    public zzav(String str, String str2) {
        this.f22503g = str;
        this.f22504h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22503g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f22504h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
