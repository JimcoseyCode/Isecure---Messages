package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new C2160m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f22451h;

    public zzam(int i10, String[] strArr) {
        this.f22450g = i10;
        this.f22451h = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f22450g);
        AbstractC3325b.q(parcel, 2, this.f22451h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
