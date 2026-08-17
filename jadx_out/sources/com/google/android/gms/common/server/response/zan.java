package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r4.AbstractC3268i;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f21359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21360i;

    zan(int i10, ArrayList arrayList, String str) {
        this.f21358g = i10;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zalVar = (zal) arrayList.get(i11);
            String str2 = zalVar.f21353h;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) AbstractC3268i.k(zalVar.f21354i)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zamVar = (zam) zalVar.f21354i.get(i12);
                map2.put(zamVar.f21356h, zamVar.f21357i);
            }
            map.put(str2, map2);
        }
        this.f21359h = map;
        this.f21360i = (String) AbstractC3268i.k(str);
        X();
    }

    public final void X() {
        Iterator it = this.f21359h.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f21359h.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).u0(this);
            }
        }
    }

    public final String e() {
        return this.f21360i;
    }

    public final Map s(String str) {
        return (Map) this.f21359h.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f21359h.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f21359h.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21358g);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21359h.keySet()) {
            arrayList.add(new zal(str, (Map) this.f21359h.get(str)));
        }
        AbstractC3325b.t(parcel, 2, arrayList, false);
        AbstractC3325b.p(parcel, 3, this.f21360i, false);
        AbstractC3325b.b(parcel, iA);
    }
}
