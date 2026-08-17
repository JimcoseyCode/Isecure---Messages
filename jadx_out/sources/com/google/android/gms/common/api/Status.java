package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o4.AbstractC3010c;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PendingIntent f21017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ConnectionResult f21018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f21007k = new Status(-1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f21008l = new Status(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Status f21009m = new Status(14);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Status f21010n = new Status(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f21011o = new Status(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f21012p = new Status(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f21014r = new Status(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f21013q = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f21015g = i10;
        this.f21016h = str;
        this.f21017i = pendingIntent;
        this.f21018j = connectionResult;
    }

    public String X() {
        return this.f21016h;
    }

    public ConnectionResult e() {
        return this.f21018j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f21015g == status.f21015g && AbstractC3267h.a(this.f21016h, status.f21016h) && AbstractC3267h.a(this.f21017i, status.f21017i) && AbstractC3267h.a(this.f21018j, status.f21018j);
    }

    public int hashCode() {
        return AbstractC3267h.b(Integer.valueOf(this.f21015g), this.f21016h, this.f21017i, this.f21018j);
    }

    public boolean k0() {
        return this.f21017i != null;
    }

    public boolean l0() {
        return this.f21015g <= 0;
    }

    public int s() {
        return this.f21015g;
    }

    public final String t0() {
        String str = this.f21016h;
        return str != null ? str : AbstractC3010c.a(this.f21015g);
    }

    public String toString() {
        AbstractC3267h.a aVarC = AbstractC3267h.c(this);
        aVarC.a("statusCode", t0());
        aVarC.a("resolution", this.f21017i);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, s());
        AbstractC3325b.p(parcel, 2, X(), false);
        AbstractC3325b.o(parcel, 3, this.f21017i, i10, false);
        AbstractC3325b.o(parcel, 4, e(), i10, false);
        AbstractC3325b.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.X(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
