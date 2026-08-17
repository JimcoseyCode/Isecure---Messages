package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0818b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C0818b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f21536j;

    public zzn(int i10, String str, String str2, String str3) {
        this.f21533g = i10;
        this.f21534h = str;
        this.f21535i = str2;
        this.f21536j = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21533g);
        AbstractC3325b.p(parcel, 3, this.f21534h, false);
        AbstractC3325b.p(parcel, 4, this.f21535i, false);
        AbstractC3325b.p(parcel, 5, this.f21536j, false);
        AbstractC3325b.b(parcel, iA);
    }
}
