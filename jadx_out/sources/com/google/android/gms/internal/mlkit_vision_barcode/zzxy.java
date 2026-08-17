package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.ea;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxy> CREATOR = new ea();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21626h;

    public zzxy(String str, String str2) {
        this.f21625g = str;
        this.f21626h = str2;
    }

    public final String e() {
        return this.f21625g;
    }

    public final String s() {
        return this.f21626h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21625g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f21626h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
