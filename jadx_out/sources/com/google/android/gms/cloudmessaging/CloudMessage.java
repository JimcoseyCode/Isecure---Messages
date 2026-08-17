package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import expo.modules.notifications.service.NotificationsService;
import m4.C2899b;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C2899b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Intent f20968g;

    public CloudMessage(Intent intent) {
        this.f20968g = intent;
    }

    final Integer X() {
        if (this.f20968g.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f20968g.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public Intent e() {
        return this.f20968g;
    }

    public String s() {
        String stringExtra = this.f20968g.getStringExtra(NotificationsService.GOOGLE_MESSAGE_ID_KEY);
        return stringExtra == null ? this.f20968g.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.o(parcel, 1, this.f20968g, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
