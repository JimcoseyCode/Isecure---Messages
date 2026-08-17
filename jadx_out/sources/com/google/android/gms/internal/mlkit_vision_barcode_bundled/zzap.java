package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new C2198u();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzat f22467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zzau[] f22470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zzar[] f22471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f22472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzam[] f22473m;

    public zzap(zzat zzatVar, String str, String str2, zzau[] zzauVarArr, zzar[] zzarVarArr, String[] strArr, zzam[] zzamVarArr) {
        this.f22467g = zzatVar;
        this.f22468h = str;
        this.f22469i = str2;
        this.f22470j = zzauVarArr;
        this.f22471k = zzarVarArr;
        this.f22472l = strArr;
        this.f22473m = zzamVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzat zzatVar = this.f22467g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, zzatVar, i10, false);
        AbstractC3325b.p(parcel, 2, this.f22468h, false);
        AbstractC3325b.p(parcel, 3, this.f22469i, false);
        AbstractC3325b.s(parcel, 4, this.f22470j, i10, false);
        AbstractC3325b.s(parcel, 5, this.f22471k, i10, false);
        AbstractC3325b.q(parcel, 6, this.f22472l, false);
        AbstractC3325b.s(parcel, 7, this.f22473m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
