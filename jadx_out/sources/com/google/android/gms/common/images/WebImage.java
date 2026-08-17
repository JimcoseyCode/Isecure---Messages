package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import r4.AbstractC3267h;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f21147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21149j;

    WebImage(int i10, Uri uri, int i11, int i12) {
        this.f21146g = i10;
        this.f21147h = uri;
        this.f21148i = i11;
        this.f21149j = i12;
    }

    public Uri e() {
        return this.f21147h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (AbstractC3267h.a(this.f21147h, webImage.f21147h) && this.f21148i == webImage.f21148i && this.f21149j == webImage.f21149j) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f21149j;
    }

    public int getWidth() {
        return this.f21148i;
    }

    public int hashCode() {
        return AbstractC3267h.b(this.f21147h, Integer.valueOf(this.f21148i), Integer.valueOf(this.f21149j));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f21148i), Integer.valueOf(this.f21149j), this.f21147h.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21146g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.o(parcel, 2, e(), i10, false);
        AbstractC3325b.j(parcel, 3, getWidth());
        AbstractC3325b.j(parcel, 4, getHeight());
        AbstractC3325b.b(parcel, iA);
    }
}
