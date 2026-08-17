package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new r4.x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f21184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f21188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f21189o;

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21181g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.j(parcel, 2, this.f21182h);
        AbstractC3325b.j(parcel, 3, this.f21183i);
        AbstractC3325b.l(parcel, 4, this.f21184j);
        AbstractC3325b.l(parcel, 5, this.f21185k);
        AbstractC3325b.p(parcel, 6, this.f21186l, false);
        AbstractC3325b.p(parcel, 7, this.f21187m, false);
        AbstractC3325b.j(parcel, 8, this.f21188n);
        AbstractC3325b.j(parcel, 9, this.f21189o);
        AbstractC3325b.b(parcel, iA);
    }

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f21181g = i10;
        this.f21182h = i11;
        this.f21183i = i12;
        this.f21184j = j10;
        this.f21185k = j11;
        this.f21186l = str;
        this.f21187m = str2;
        this.f21188n = i13;
        this.f21189o = i14;
    }
}
