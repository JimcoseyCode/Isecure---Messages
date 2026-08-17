package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f21362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f21368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f21369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f21370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f21371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f21373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f21374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f21375u;

    WakeLockEvent(int i10, long j10, int i11, String str, int i12, List list, String str2, long j11, int i13, String str3, String str4, float f10, long j12, String str5, boolean z10) {
        this.f21361g = i10;
        this.f21362h = j10;
        this.f21363i = i11;
        this.f21364j = str;
        this.f21365k = str3;
        this.f21366l = str5;
        this.f21367m = i12;
        this.f21368n = list;
        this.f21369o = str2;
        this.f21370p = j11;
        this.f21371q = i13;
        this.f21372r = str4;
        this.f21373s = f10;
        this.f21374t = j12;
        this.f21375u = z10;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String X() {
        List list = this.f21368n;
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        String strJoin = list == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : TextUtils.join(",", list);
        int i10 = this.f21371q;
        String str2 = this.f21365k;
        String str3 = this.f21372r;
        float f10 = this.f21373s;
        String str4 = this.f21366l;
        int i11 = this.f21367m;
        String str5 = this.f21364j;
        boolean z10 = this.f21375u;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i11);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i10);
        sb.append("\t");
        if (str2 == null) {
            str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        sb.append(str2);
        sb.append("\t");
        if (str3 == null) {
            str3 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        sb.append(str3);
        sb.append("\t");
        sb.append(f10);
        sb.append("\t");
        if (str4 != null) {
            str = str4;
        }
        sb.append(str);
        sb.append("\t");
        sb.append(z10);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int e() {
        return this.f21363i;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long s() {
        return this.f21362h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.j(parcel, 1, this.f21361g);
        AbstractC3325b.l(parcel, 2, this.f21362h);
        AbstractC3325b.p(parcel, 4, this.f21364j, false);
        AbstractC3325b.j(parcel, 5, this.f21367m);
        AbstractC3325b.r(parcel, 6, this.f21368n, false);
        AbstractC3325b.l(parcel, 8, this.f21370p);
        AbstractC3325b.p(parcel, 10, this.f21365k, false);
        AbstractC3325b.j(parcel, 11, this.f21363i);
        AbstractC3325b.p(parcel, 12, this.f21369o, false);
        AbstractC3325b.p(parcel, 13, this.f21372r, false);
        AbstractC3325b.j(parcel, 14, this.f21371q);
        AbstractC3325b.g(parcel, 15, this.f21373s);
        AbstractC3325b.l(parcel, 16, this.f21374t);
        AbstractC3325b.p(parcel, 17, this.f21366l, false);
        AbstractC3325b.c(parcel, 18, this.f21375u);
        AbstractC3325b.b(parcel, iA);
    }
}
