package com.google.android.gms.internal.mlkit_vision_barcode;

import I4.C0895i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C0895i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21489h;

    public zzah() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        return this.f21488g == zzahVar.f21488g && AbstractC3267h.a(Boolean.valueOf(this.f21489h), Boolean.valueOf(zzahVar.f21489h));
    }

    public final int hashCode() {
        return AbstractC3267h.b(Integer.valueOf(this.f21488g), Boolean.valueOf(this.f21489h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 2, this.f21488g);
        AbstractC3325b.c(parcel, 3, this.f21489h);
        AbstractC3325b.b(parcel, iA);
    }

    public zzah(int i10, boolean z10) {
        this.f21488g = i10;
        this.f21489h = z10;
    }
}
