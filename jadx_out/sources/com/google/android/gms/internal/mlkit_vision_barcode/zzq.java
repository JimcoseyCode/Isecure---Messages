package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0851e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C0851e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21547h;

    public zzq(int i10, String str) {
        this.f21546g = i10;
        this.f21547h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21546g);
        AbstractC3325b.p(parcel, 3, this.f21547h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
