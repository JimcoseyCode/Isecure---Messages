package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0894h9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C0894h9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f21504n;

    public zzj(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f21497g = i10;
        this.f21498h = i11;
        this.f21499i = i12;
        this.f21500j = i13;
        this.f21501k = i14;
        this.f21502l = i15;
        this.f21503m = z10;
        this.f21504n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21497g);
        AbstractC3325b.j(parcel, 3, this.f21498h);
        AbstractC3325b.j(parcel, 4, this.f21499i);
        AbstractC3325b.j(parcel, 5, this.f21500j);
        AbstractC3325b.j(parcel, 6, this.f21501k);
        AbstractC3325b.j(parcel, 7, this.f21502l);
        AbstractC3325b.c(parcel, 8, this.f21503m);
        AbstractC3325b.p(parcel, 9, this.f21504n, false);
        AbstractC3325b.b(parcel, iA);
    }
}
