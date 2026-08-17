package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new N4.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f22554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22555h;

    public zag(List list, String str) {
        this.f22554g = list;
        this.f22555h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f22554g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.r(parcel, 1, list, false);
        AbstractC3325b.p(parcel, 2, this.f22555h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
