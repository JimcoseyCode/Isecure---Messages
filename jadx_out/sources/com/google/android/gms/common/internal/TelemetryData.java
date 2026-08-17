package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new r4.p();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f21196h;

    public TelemetryData(int i10, List list) {
        this.f21195g = i10;
        this.f21196h = list;
    }

    public final void X(MethodInvocation methodInvocation) {
        if (this.f21196h == null) {
            this.f21196h = new ArrayList();
        }
        this.f21196h.add(methodInvocation);
    }

    public final int e() {
        return this.f21195g;
    }

    public final List s() {
        return this.f21196h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21195g);
        AbstractC3325b.t(parcel, 2, this.f21196h, false);
        AbstractC3325b.b(parcel, iA);
    }
}
