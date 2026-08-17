package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;
import u4.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PendingIntent f21294g;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f21294g = pendingIntent;
    }

    public PendingIntent e() {
        return this.f21294g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, e(), i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
