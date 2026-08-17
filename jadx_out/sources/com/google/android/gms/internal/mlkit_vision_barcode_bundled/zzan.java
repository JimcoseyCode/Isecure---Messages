package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C2189s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f22455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f22458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f22459n;

    public zzan(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f22452g = i10;
        this.f22453h = i11;
        this.f22454i = i12;
        this.f22455j = i13;
        this.f22456k = i14;
        this.f22457l = i15;
        this.f22458m = z10;
        this.f22459n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22452g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, this.f22453h);
        AbstractC3325b.j(parcel, 3, this.f22454i);
        AbstractC3325b.j(parcel, 4, this.f22455j);
        AbstractC3325b.j(parcel, 5, this.f22456k);
        AbstractC3325b.j(parcel, 6, this.f22457l);
        AbstractC3325b.c(parcel, 7, this.f22458m);
        AbstractC3325b.p(parcel, 8, this.f22459n, false);
        AbstractC3325b.b(parcel, iA);
    }
}
