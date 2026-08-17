package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new L();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22509i;

    public zzax(String str, String str2, int i10) {
        this.f22507g = str;
        this.f22508h = str2;
        this.f22509i = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22507g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        AbstractC3325b.p(parcel, 2, this.f22508h, false);
        AbstractC3325b.j(parcel, 3, this.f22509i);
        AbstractC3325b.b(parcel, iA);
    }
}
