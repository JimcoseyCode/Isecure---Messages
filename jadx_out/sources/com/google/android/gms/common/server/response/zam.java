package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f21356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final FastJsonResponse.Field f21357i;

    zam(int i10, String str, FastJsonResponse.Field field) {
        this.f21355g = i10;
        this.f21356h = str;
        this.f21357i = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21355g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f21356h, false);
        AbstractC3325b.o(parcel, 3, this.f21357i, i10, false);
        AbstractC3325b.b(parcel, iA);
    }

    zam(String str, FastJsonResponse.Field field) {
        this.f21355g = 1;
        this.f21356h = str;
        this.f21357i = field;
    }
}
