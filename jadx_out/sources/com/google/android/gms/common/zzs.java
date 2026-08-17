package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.K;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f21387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f21389j;

    zzs(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f21386g = str;
        n nVar = null;
        if (iBinder != null) {
            try {
                B4.a aVarB = K.d(iBinder).b();
                byte[] bArr = aVarB == null ? null : (byte[]) B4.b.f(aVarB);
                if (bArr != null) {
                    nVar = new n(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f21387h = nVar;
        this.f21388i = z10;
        this.f21389j = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21386g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.p(parcel, 1, str, false);
        m mVar = this.f21387h;
        if (mVar == null) {
            mVar = null;
        }
        AbstractC3325b.i(parcel, 2, mVar, false);
        AbstractC3325b.c(parcel, 3, this.f21388i);
        AbstractC3325b.c(parcel, 4, this.f21389j);
        AbstractC3325b.b(parcel, iA);
    }
}
