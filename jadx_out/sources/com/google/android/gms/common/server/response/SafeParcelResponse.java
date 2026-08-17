package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import r4.AbstractC3268i;
import s4.AbstractC3324a;
import s4.AbstractC3325b;
import y4.j;
import y4.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Parcel f21346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21347i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zan f21348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21351m;

    SafeParcelResponse(int i10, Parcel parcel, zan zanVar) {
        this.f21345g = i10;
        this.f21346h = (Parcel) AbstractC3268i.k(parcel);
        this.f21348j = zanVar;
        this.f21349k = zanVar == null ? null : zanVar.e();
        this.f21350l = 2;
    }

    private final void i(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).e(), entry);
        }
        sb.append('{');
        int iF = AbstractC3324a.F(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(AbstractC3324a.u(iY));
            if (entry2 != null) {
                if (z10) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.A0()) {
                    int i10 = field.f21337j;
                    switch (i10) {
                        case 0:
                            l(sb, field, FastJsonResponse.f(field, Integer.valueOf(AbstractC3324a.A(parcel, iY))));
                            break;
                        case 1:
                            l(sb, field, FastJsonResponse.f(field, AbstractC3324a.c(parcel, iY)));
                            break;
                        case 2:
                            l(sb, field, FastJsonResponse.f(field, Long.valueOf(AbstractC3324a.B(parcel, iY))));
                            break;
                        case 3:
                            l(sb, field, FastJsonResponse.f(field, Float.valueOf(AbstractC3324a.x(parcel, iY))));
                            break;
                        case 4:
                            l(sb, field, FastJsonResponse.f(field, Double.valueOf(AbstractC3324a.w(parcel, iY))));
                            break;
                        case 5:
                            l(sb, field, FastJsonResponse.f(field, AbstractC3324a.a(parcel, iY)));
                            break;
                        case 6:
                            l(sb, field, FastJsonResponse.f(field, Boolean.valueOf(AbstractC3324a.v(parcel, iY))));
                            break;
                        case 7:
                            l(sb, field, FastJsonResponse.f(field, AbstractC3324a.o(parcel, iY)));
                            break;
                        case 8:
                        case 9:
                            l(sb, field, FastJsonResponse.f(field, AbstractC3324a.g(parcel, iY)));
                            break;
                        case 10:
                            Bundle bundleF = AbstractC3324a.f(parcel, iY);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleF.keySet()) {
                                map2.put(str2, (String) AbstractC3268i.k(bundleF.getString(str2)));
                            }
                            l(sb, field, FastJsonResponse.f(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else if (field.f21338k) {
                    sb.append("[");
                    switch (field.f21337j) {
                        case 0:
                            y4.b.e(sb, AbstractC3324a.j(parcel, iY));
                            break;
                        case 1:
                            y4.b.g(sb, AbstractC3324a.d(parcel, iY));
                            break;
                        case 2:
                            y4.b.f(sb, AbstractC3324a.k(parcel, iY));
                            break;
                        case 3:
                            y4.b.d(sb, AbstractC3324a.i(parcel, iY));
                            break;
                        case 4:
                            y4.b.c(sb, AbstractC3324a.h(parcel, iY));
                            break;
                        case 5:
                            y4.b.g(sb, AbstractC3324a.b(parcel, iY));
                            break;
                        case 6:
                            y4.b.h(sb, AbstractC3324a.e(parcel, iY));
                            break;
                        case 7:
                            y4.b.i(sb, AbstractC3324a.p(parcel, iY));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrM = AbstractC3324a.m(parcel, iY);
                            int length = parcelArrM.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                parcelArrM[i11].setDataPosition(0);
                                i(sb, field.t0(), parcelArrM[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f21337j) {
                        case 0:
                            sb.append(AbstractC3324a.A(parcel, iY));
                            break;
                        case 1:
                            sb.append(AbstractC3324a.c(parcel, iY));
                            break;
                        case 2:
                            sb.append(AbstractC3324a.B(parcel, iY));
                            break;
                        case 3:
                            sb.append(AbstractC3324a.x(parcel, iY));
                            break;
                        case 4:
                            sb.append(AbstractC3324a.w(parcel, iY));
                            break;
                        case 5:
                            sb.append(AbstractC3324a.a(parcel, iY));
                            break;
                        case 6:
                            sb.append(AbstractC3324a.v(parcel, iY));
                            break;
                        case 7:
                            String strO = AbstractC3324a.o(parcel, iY);
                            sb.append("\"");
                            sb.append(j.a(strO));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrG = AbstractC3324a.g(parcel, iY);
                            sb.append("\"");
                            sb.append(y4.c.a(bArrG));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrG2 = AbstractC3324a.g(parcel, iY);
                            sb.append("\"");
                            sb.append(y4.c.b(bArrG2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleF2 = AbstractC3324a.f(parcel, iY);
                            Set<String> setKeySet = bundleF2.keySet();
                            sb.append("{");
                            boolean z11 = true;
                            for (String str3 : setKeySet) {
                                if (!z11) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(j.a(bundleF2.getString(str3)));
                                sb.append("\"");
                                z11 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelL = AbstractC3324a.l(parcel, iY);
                            parcelL.setDataPosition(0);
                            i(sb, field.t0(), parcelL);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == iF) {
            sb.append('}');
            return;
        }
        throw new AbstractC3324a.C0356a("Overread allowed size end=" + iF, parcel);
    }

    private static final void j(StringBuilder sb, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(j.a(AbstractC3268i.k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(y4.c.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(y4.c.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                k.a(sb, (HashMap) AbstractC3268i.k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    private static final void l(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (!field.f21336i) {
            j(sb, field.f21335h, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb.append(",");
            }
            j(sb, field.f21335h, arrayList.get(i10));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        zan zanVar = this.f21348j;
        if (zanVar == null) {
            return null;
        }
        return zanVar.s((String) AbstractC3268i.k(this.f21349k));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i10 = this.f21350l;
        if (i10 == 0) {
            int iA = AbstractC3325b.a(this.f21346h);
            this.f21351m = iA;
            AbstractC3325b.b(this.f21346h, iA);
            this.f21350l = 2;
        } else if (i10 == 1) {
            AbstractC3325b.b(this.f21346h, this.f21351m);
            this.f21350l = 2;
        }
        return this.f21346h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        AbstractC3268i.l(this.f21348j, "Cannot convert to JSON on client side.");
        Parcel parcelH = h();
        parcelH.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        i(sb, (Map) AbstractC3268i.k(this.f21348j.s((String) AbstractC3268i.k(this.f21349k))), parcelH);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21345g;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, i11);
        AbstractC3325b.n(parcel, 2, h(), false);
        int i12 = this.f21347i;
        AbstractC3325b.o(parcel, 3, i12 != 0 ? i12 != 1 ? this.f21348j : this.f21348j : null, i10, false);
        AbstractC3325b.b(parcel, iA);
    }
}
