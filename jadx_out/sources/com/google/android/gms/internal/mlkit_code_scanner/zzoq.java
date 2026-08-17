package com.google.android.gms.internal.mlkit_code_scanner;

import G4.G6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new G6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzou f21430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zzov[] f21433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zzos[] f21434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f21435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzon[] f21436m;

    public zzoq(zzou zzouVar, String str, String str2, zzov[] zzovVarArr, zzos[] zzosVarArr, String[] strArr, zzon[] zzonVarArr) {
        this.f21430g = zzouVar;
        this.f21431h = str;
        this.f21432i = str2;
        this.f21433j = zzovVarArr;
        this.f21434k = zzosVarArr;
        this.f21435l = strArr;
        this.f21436m = zzonVarArr;
    }

    public final String X() {
        return this.f21432i;
    }

    public final zzou e() {
        return this.f21430g;
    }

    public final zzon[] k0() {
        return this.f21436m;
    }

    public final zzos[] l0() {
        return this.f21434k;
    }

    public final String s() {
        return this.f21431h;
    }

    public final zzov[] t0() {
        return this.f21433j;
    }

    public final String[] u0() {
        return this.f21435l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, this.f21430g, i10, false);
        AbstractC3325b.p(parcel, 2, this.f21431h, false);
        AbstractC3325b.p(parcel, 3, this.f21432i, false);
        AbstractC3325b.s(parcel, 4, this.f21433j, i10, false);
        AbstractC3325b.s(parcel, 5, this.f21434k, i10, false);
        AbstractC3325b.q(parcel, 6, this.f21435l, false);
        AbstractC3325b.s(parcel, 7, this.f21436m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
