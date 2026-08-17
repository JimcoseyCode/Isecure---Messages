package com.google.android.gms.internal.mlkit_code_scanner;

import G4.E6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new E6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21422n;

    public zzoo(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f21415g = i10;
        this.f21416h = i11;
        this.f21417i = i12;
        this.f21418j = i13;
        this.f21419k = i14;
        this.f21420l = i15;
        this.f21421m = z10;
        this.f21422n = str;
    }

    public final boolean A0() {
        return this.f21421m;
    }

    public final int X() {
        return this.f21419k;
    }

    public final int e() {
        return this.f21417i;
    }

    public final int k0() {
        return this.f21416h;
    }

    public final int l0() {
        return this.f21420l;
    }

    public final int s() {
        return this.f21418j;
    }

    public final int t0() {
        return this.f21415g;
    }

    public final String u0() {
        return this.f21422n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21415g);
        AbstractC3325b.j(parcel, 2, this.f21416h);
        AbstractC3325b.j(parcel, 3, this.f21417i);
        AbstractC3325b.j(parcel, 4, this.f21418j);
        AbstractC3325b.j(parcel, 5, this.f21419k);
        AbstractC3325b.j(parcel, 6, this.f21420l);
        AbstractC3325b.c(parcel, 7, this.f21421m);
        AbstractC3325b.p(parcel, 8, this.f21422n, false);
        AbstractC3325b.b(parcel, iA);
    }
}
