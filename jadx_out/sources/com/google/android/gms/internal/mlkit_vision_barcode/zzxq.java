package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.S9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxq> CREATOR = new S9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21581n;

    public zzxq(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f21574g = i10;
        this.f21575h = i11;
        this.f21576i = i12;
        this.f21577j = i13;
        this.f21578k = i14;
        this.f21579l = i15;
        this.f21580m = z10;
        this.f21581n = str;
    }

    public final boolean A0() {
        return this.f21580m;
    }

    public final int X() {
        return this.f21578k;
    }

    public final int e() {
        return this.f21576i;
    }

    public final int k0() {
        return this.f21575h;
    }

    public final int l0() {
        return this.f21579l;
    }

    public final int s() {
        return this.f21577j;
    }

    public final int t0() {
        return this.f21574g;
    }

    public final String u0() {
        return this.f21581n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21574g);
        AbstractC3325b.j(parcel, 2, this.f21575h);
        AbstractC3325b.j(parcel, 3, this.f21576i);
        AbstractC3325b.j(parcel, 4, this.f21577j);
        AbstractC3325b.j(parcel, 5, this.f21578k);
        AbstractC3325b.j(parcel, 6, this.f21579l);
        AbstractC3325b.c(parcel, 7, this.f21580m);
        AbstractC3325b.p(parcel, 8, this.f21581n, false);
        AbstractC3325b.b(parcel, iA);
    }
}
