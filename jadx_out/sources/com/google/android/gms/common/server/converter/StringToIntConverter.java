package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f21327h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f21328i = new SparseArray();

    StringToIntConverter(int i10, ArrayList arrayList) {
        this.f21326g = i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            e(zacVar.f21332h, zacVar.f21333i);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        String str = (String) this.f21328i.get(((Integer) obj).intValue());
        return (str == null && this.f21327h.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public StringToIntConverter e(String str, int i10) {
        this.f21327h.put(str, Integer.valueOf(i10));
        this.f21328i.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21326g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21327h.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f21327h.get(str)).intValue()));
        }
        AbstractC3325b.t(parcel, 2, arrayList, false);
        AbstractC3325b.b(parcel, iA);
    }
}
