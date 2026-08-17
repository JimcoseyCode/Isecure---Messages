package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import r4.AbstractC3268i;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21006h;

    Scope(int i10, String str) {
        AbstractC3268i.f(str, "scopeUri must not be null or empty");
        this.f21005g = i10;
        this.f21006h = str;
    }

    public String e() {
        return this.f21006h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f21006h.equals(((Scope) obj).f21006h);
        }
        return false;
    }

    public int hashCode() {
        return this.f21006h.hashCode();
    }

    public String toString() {
        return this.f21006h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21005g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.p(parcel, 2, e(), false);
        AbstractC3325b.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
