package com.google.android.gms.internal.mlkit_code_scanner;

import G4.D6;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoz> CREATOR = new D6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f21476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Point[] f21477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f21478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzos f21479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzov f21480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zzow f21481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zzoy f21482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zzox f21483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zzot f21484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final zzop f21485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final zzoq f21486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final zzor f21487u;

    public zzoz(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzos zzosVar, zzov zzovVar, zzow zzowVar, zzoy zzoyVar, zzox zzoxVar, zzot zzotVar, zzop zzopVar, zzoq zzoqVar, zzor zzorVar) {
        this.f21473g = i10;
        this.f21474h = str;
        this.f21475i = str2;
        this.f21476j = bArr;
        this.f21477k = pointArr;
        this.f21478l = i11;
        this.f21479m = zzosVar;
        this.f21480n = zzovVar;
        this.f21481o = zzowVar;
        this.f21482p = zzoyVar;
        this.f21483q = zzoxVar;
        this.f21484r = zzotVar;
        this.f21485s = zzopVar;
        this.f21486t = zzoqVar;
        this.f21487u = zzorVar;
    }

    public final zzov A0() {
        return this.f21480n;
    }

    public final zzow D0() {
        return this.f21481o;
    }

    public final zzox J0() {
        return this.f21483q;
    }

    public final zzoy K0() {
        return this.f21482p;
    }

    public final String L0() {
        return this.f21474h;
    }

    public final String M0() {
        return this.f21475i;
    }

    public final byte[] N0() {
        return this.f21476j;
    }

    public final zzop X() {
        return this.f21485s;
    }

    public final int e() {
        return this.f21473g;
    }

    public final zzoq k0() {
        return this.f21486t;
    }

    public final zzor l0() {
        return this.f21487u;
    }

    public final int s() {
        return this.f21478l;
    }

    public final zzos t0() {
        return this.f21479m;
    }

    public final zzot u0() {
        return this.f21484r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21473g);
        AbstractC3325b.p(parcel, 2, this.f21474h, false);
        AbstractC3325b.p(parcel, 3, this.f21475i, false);
        AbstractC3325b.e(parcel, 4, this.f21476j, false);
        AbstractC3325b.s(parcel, 5, this.f21477k, i10, false);
        AbstractC3325b.j(parcel, 6, this.f21478l);
        AbstractC3325b.o(parcel, 7, this.f21479m, i10, false);
        AbstractC3325b.o(parcel, 8, this.f21480n, i10, false);
        AbstractC3325b.o(parcel, 9, this.f21481o, i10, false);
        AbstractC3325b.o(parcel, 10, this.f21482p, i10, false);
        AbstractC3325b.o(parcel, 11, this.f21483q, i10, false);
        AbstractC3325b.o(parcel, 12, this.f21484r, i10, false);
        AbstractC3325b.o(parcel, 13, this.f21485s, i10, false);
        AbstractC3325b.o(parcel, 14, this.f21486t, i10, false);
        AbstractC3325b.o(parcel, 15, this.f21487u, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
