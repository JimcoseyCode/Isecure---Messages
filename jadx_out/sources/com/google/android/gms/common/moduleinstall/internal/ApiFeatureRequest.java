package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import o4.g;
import r4.AbstractC3267h;
import r4.AbstractC3268i;
import s4.AbstractC3325b;
import v4.C3427c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C3427c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Comparator f21305k = new Comparator() { // from class: v4.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.e().equals(feature2.e()) ? feature.e().compareTo(feature2.e()) : (feature.s() > feature2.s() ? 1 : (feature.s() == feature2.s() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f21306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21309j;

    public ApiFeatureRequest(List list, boolean z10, String str, String str2) {
        AbstractC3268i.k(list);
        this.f21306g = list;
        this.f21307h = z10;
        this.f21308i = str;
        this.f21309j = str2;
    }

    static ApiFeatureRequest X(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f21305k);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((g) it.next()).d());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, null, null);
    }

    public static ApiFeatureRequest e(u4.d dVar) {
        return X(dVar.a(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f21307h == apiFeatureRequest.f21307h && AbstractC3267h.a(this.f21306g, apiFeatureRequest.f21306g) && AbstractC3267h.a(this.f21308i, apiFeatureRequest.f21308i) && AbstractC3267h.a(this.f21309j, apiFeatureRequest.f21309j);
    }

    public final int hashCode() {
        return AbstractC3267h.b(Boolean.valueOf(this.f21307h), this.f21306g, this.f21308i, this.f21309j);
    }

    public List s() {
        return this.f21306g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.t(parcel, 1, s(), false);
        AbstractC3325b.c(parcel, 2, this.f21307h);
        AbstractC3325b.p(parcel, 3, this.f21308i, false);
        AbstractC3325b.p(parcel, 4, this.f21309j, false);
        AbstractC3325b.b(parcel, iA);
    }
}
