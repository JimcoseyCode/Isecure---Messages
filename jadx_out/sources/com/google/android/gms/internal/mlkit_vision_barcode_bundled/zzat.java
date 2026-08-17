package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new G();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f22498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f22499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f22500m;

    public zzat(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22494g = str;
        this.f22495h = str2;
        this.f22496i = str3;
        this.f22497j = str4;
        this.f22498k = str5;
        this.f22499l = str6;
        this.f22500m = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22494g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f22495h, false);
        AbstractC3325b.p(parcel, 3, this.f22496i, false);
        AbstractC3325b.p(parcel, 4, this.f22497j, false);
        AbstractC3325b.p(parcel, 5, this.f22498k, false);
        AbstractC3325b.p(parcel, 6, this.f22499l, false);
        AbstractC3325b.p(parcel, 7, this.f22500m, false);
        AbstractC3325b.b(parcel, iA);
    }
}
