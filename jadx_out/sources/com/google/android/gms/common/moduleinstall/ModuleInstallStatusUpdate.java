package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3268i;
import s4.AbstractC3325b;
import u4.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f21299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Long f21300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f21302l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f21304b;

        a(long j10, long j11) {
            AbstractC3268i.m(j11);
            this.f21303a = j10;
            this.f21304b = j11;
        }
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f21297g = i10;
        this.f21298h = i11;
        this.f21299i = l10;
        this.f21300j = l11;
        this.f21301k = i12;
        this.f21302l = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int X() {
        return this.f21297g;
    }

    public int e() {
        return this.f21301k;
    }

    public int s() {
        return this.f21298h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, X());
        AbstractC3325b.j(parcel, 2, s());
        AbstractC3325b.m(parcel, 3, this.f21299i, false);
        AbstractC3325b.m(parcel, 4, this.f21300j, false);
        AbstractC3325b.j(parcel, 5, e());
        AbstractC3325b.b(parcel, iA);
    }
}
