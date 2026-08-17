package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.fa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new fa();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21628h;

    public zzxz(String str, String str2) {
        this.f21627g = str;
        this.f21628h = str2;
    }

    public final String e() {
        return this.f21627g;
    }

    public final String s() {
        return this.f21628h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21627g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f21628h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
