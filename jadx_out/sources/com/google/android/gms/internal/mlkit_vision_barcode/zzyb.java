package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.Q9;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new Q9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f21635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Point[] f21636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzxu f21638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzxx f21639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zzxy f21640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zzya f21641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zzxz f21642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zzxv f21643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final zzxr f21644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final zzxs f21645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final zzxt f21646u;

    public zzyb(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.f21632g = i10;
        this.f21633h = str;
        this.f21634i = str2;
        this.f21635j = bArr;
        this.f21636k = pointArr;
        this.f21637l = i11;
        this.f21638m = zzxuVar;
        this.f21639n = zzxxVar;
        this.f21640o = zzxyVar;
        this.f21641p = zzyaVar;
        this.f21642q = zzxzVar;
        this.f21643r = zzxvVar;
        this.f21644s = zzxrVar;
        this.f21645t = zzxsVar;
        this.f21646u = zzxtVar;
    }

    public final zzxx A0() {
        return this.f21639n;
    }

    public final zzxy D0() {
        return this.f21640o;
    }

    public final zzxz J0() {
        return this.f21642q;
    }

    public final zzya K0() {
        return this.f21641p;
    }

    public final String L0() {
        return this.f21633h;
    }

    public final String M0() {
        return this.f21634i;
    }

    public final byte[] N0() {
        return this.f21635j;
    }

    public final Point[] O0() {
        return this.f21636k;
    }

    public final zzxr X() {
        return this.f21644s;
    }

    public final int e() {
        return this.f21632g;
    }

    public final zzxs k0() {
        return this.f21645t;
    }

    public final zzxt l0() {
        return this.f21646u;
    }

    public final int s() {
        return this.f21637l;
    }

    public final zzxu t0() {
        return this.f21638m;
    }

    public final zzxv u0() {
        return this.f21643r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21632g);
        AbstractC3325b.p(parcel, 2, this.f21633h, false);
        AbstractC3325b.p(parcel, 3, this.f21634i, false);
        AbstractC3325b.e(parcel, 4, this.f21635j, false);
        AbstractC3325b.s(parcel, 5, this.f21636k, i10, false);
        AbstractC3325b.j(parcel, 6, this.f21637l);
        AbstractC3325b.o(parcel, 7, this.f21638m, i10, false);
        AbstractC3325b.o(parcel, 8, this.f21639n, i10, false);
        AbstractC3325b.o(parcel, 9, this.f21640o, i10, false);
        AbstractC3325b.o(parcel, 10, this.f21641p, i10, false);
        AbstractC3325b.o(parcel, 11, this.f21642q, i10, false);
        AbstractC3325b.o(parcel, 12, this.f21643r, i10, false);
        AbstractC3325b.o(parcel, 13, this.f21644s, i10, false);
        AbstractC3325b.o(parcel, 14, this.f21645t, i10, false);
        AbstractC3325b.o(parcel, 15, this.f21646u, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
