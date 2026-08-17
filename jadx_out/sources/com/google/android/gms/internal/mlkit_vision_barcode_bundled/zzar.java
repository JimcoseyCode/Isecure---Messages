package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new C2206w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22491j;

    public zzar(int i10, String str, String str2, String str3) {
        this.f22488g = i10;
        this.f22489h = str;
        this.f22490i = str2;
        this.f22491j = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22488g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f22489h, false);
        AbstractC3325b.p(parcel, 3, this.f22490i, false);
        AbstractC3325b.p(parcel, 4, this.f22491j, false);
        AbstractC3325b.b(parcel, iA);
    }
}
