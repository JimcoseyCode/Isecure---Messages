package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0884h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C0884h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21554i;

    public zzt(String str, String str2, int i10) {
        this.f21552g = str;
        this.f21553h = str2;
        this.f21554i = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 2, this.f21552g, false);
        AbstractC3325b.p(parcel, 3, this.f21553h, false);
        AbstractC3325b.j(parcel, 4, this.f21554i);
        AbstractC3325b.b(parcel, iA);
    }
}
