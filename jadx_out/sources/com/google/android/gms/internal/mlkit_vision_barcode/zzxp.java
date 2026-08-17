package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.O9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new O9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f21573h;

    public zzxp(int i10, String[] strArr) {
        this.f21572g = i10;
        this.f21573h = strArr;
    }

    public final int e() {
        return this.f21572g;
    }

    public final String[] s() {
        return this.f21573h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21572g);
        AbstractC3325b.q(parcel, 2, this.f21573h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
