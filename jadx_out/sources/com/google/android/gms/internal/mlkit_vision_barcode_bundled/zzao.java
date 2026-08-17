package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C2194t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f22464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zzan f22465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zzan f22466m;

    public zzao(String str, String str2, String str3, String str4, String str5, zzan zzanVar, zzan zzanVar2) {
        this.f22460g = str;
        this.f22461h = str2;
        this.f22462i = str3;
        this.f22463j = str4;
        this.f22464k = str5;
        this.f22465l = zzanVar;
        this.f22466m = zzanVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22460g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f22461h, false);
        AbstractC3325b.p(parcel, 3, this.f22462i, false);
        AbstractC3325b.p(parcel, 4, this.f22463j, false);
        AbstractC3325b.p(parcel, 5, this.f22464k, false);
        AbstractC3325b.o(parcel, 6, this.f22465l, i10, false);
        AbstractC3325b.o(parcel, 7, this.f22466m, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
