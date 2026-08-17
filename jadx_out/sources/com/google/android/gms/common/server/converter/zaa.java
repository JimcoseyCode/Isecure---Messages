package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StringToIntConverter f21330h;

    zaa(int i10, StringToIntConverter stringToIntConverter) {
        this.f21329g = i10;
        this.f21330h = stringToIntConverter;
    }

    public static zaa e(FastJsonResponse.a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.a s() {
        StringToIntConverter stringToIntConverter = this.f21330h;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21329g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.o(parcel, 2, this.f21330h, i10, false);
        AbstractC3325b.b(parcel, iA);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f21329g = 1;
        this.f21330h = stringToIntConverter;
    }
}
