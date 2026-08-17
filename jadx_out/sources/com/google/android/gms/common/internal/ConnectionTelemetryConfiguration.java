package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.E;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new E();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RootTelemetryConfiguration f21158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f21161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f21163l;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f21158g = rootTelemetryConfiguration;
        this.f21159h = z10;
        this.f21160i = z11;
        this.f21161j = iArr;
        this.f21162k = i10;
        this.f21163l = iArr2;
    }

    public int[] X() {
        return this.f21163l;
    }

    public int e() {
        return this.f21162k;
    }

    public boolean k0() {
        return this.f21159h;
    }

    public boolean l0() {
        return this.f21160i;
    }

    public int[] s() {
        return this.f21161j;
    }

    public final RootTelemetryConfiguration t0() {
        return this.f21158g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, this.f21158g, i10, false);
        AbstractC3325b.c(parcel, 2, k0());
        AbstractC3325b.c(parcel, 3, l0());
        AbstractC3325b.k(parcel, 4, s(), false);
        AbstractC3325b.j(parcel, 5, e());
        AbstractC3325b.k(parcel, 6, X(), false);
        AbstractC3325b.b(parcel, iA);
    }
}
