package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.U9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxs> CREATOR = new U9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzxw f21589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zzxx[] f21592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zzxu[] f21593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f21594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzxp[] f21595m;

    public zzxs(zzxw zzxwVar, String str, String str2, zzxx[] zzxxVarArr, zzxu[] zzxuVarArr, String[] strArr, zzxp[] zzxpVarArr) {
        this.f21589g = zzxwVar;
        this.f21590h = str;
        this.f21591i = str2;
        this.f21592j = zzxxVarArr;
        this.f21593k = zzxuVarArr;
        this.f21594l = strArr;
        this.f21595m = zzxpVarArr;
    }

    public final String X() {
        return this.f21591i;
    }

    public final zzxw e() {
        return this.f21589g;
    }

    public final zzxp[] k0() {
        return this.f21595m;
    }

    public final zzxu[] l0() {
        return this.f21593k;
    }

    public final String s() {
        return this.f21590h;
    }

    public final zzxx[] t0() {
        return this.f21592j;
    }

    public final String[] u0() {
        return this.f21594l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, this.f21589g, i10, false);
        AbstractC3325b.p(parcel, 2, this.f21590h, false);
        AbstractC3325b.p(parcel, 3, this.f21591i, false);
        AbstractC3325b.s(parcel, 4, this.f21592j, i10, false);
        AbstractC3325b.s(parcel, 5, this.f21593k, i10, false);
        AbstractC3325b.q(parcel, 6, this.f21594l, false);
        AbstractC3325b.s(parcel, 7, this.f21595m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
