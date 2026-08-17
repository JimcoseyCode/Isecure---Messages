package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f21353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ArrayList f21354i;

    zal(int i10, String str, ArrayList arrayList) {
        this.f21352g = i10;
        this.f21353h = str;
        this.f21354i = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21352g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, this.f21353h, false);
        AbstractC3325b.t(parcel, 3, this.f21354i, false);
        AbstractC3325b.b(parcel, iA);
    }

    zal(String str, Map map) {
        ArrayList arrayList;
        this.f21352g = 1;
        this.f21353h = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f21354i = arrayList;
    }
}
