package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Calendar f23159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f23160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f23161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f23162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f23163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f23164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f23165m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarE = v.e(calendar);
        this.f23159g = calendarE;
        this.f23160h = calendarE.get(2);
        this.f23161i = calendarE.get(1);
        this.f23162j = calendarE.getMaximum(7);
        this.f23163k = calendarE.getActualMaximum(5);
        this.f23164l = calendarE.getTimeInMillis();
    }

    static Month j(int i10, int i11) {
        Calendar calendarM = v.m();
        calendarM.set(1, i10);
        calendarM.set(2, i11);
        return new Month(calendarM);
    }

    static Month p(long j10) {
        Calendar calendarM = v.m();
        calendarM.setTimeInMillis(j10);
        return new Month(calendarM);
    }

    static Month q() {
        return new Month(v.k());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f23160h == month.f23160h && this.f23161i == month.f23161i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f23159g.compareTo(month.f23159g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23160h), Integer.valueOf(this.f23161i)});
    }

    int s(int i10) {
        int i11 = this.f23159g.get(7);
        if (i10 <= 0) {
            i10 = this.f23159g.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f23162j : i12;
    }

    long t(int i10) {
        Calendar calendarE = v.e(this.f23159g);
        calendarE.set(5, i10);
        return calendarE.getTimeInMillis();
    }

    int u(long j10) {
        Calendar calendarE = v.e(this.f23159g);
        calendarE.setTimeInMillis(j10);
        return calendarE.get(5);
    }

    String v() {
        if (this.f23165m == null) {
            this.f23165m = h.l(this.f23159g.getTimeInMillis());
        }
        return this.f23165m;
    }

    long w() {
        return this.f23159g.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23161i);
        parcel.writeInt(this.f23160h);
    }

    Month x(int i10) {
        Calendar calendarE = v.e(this.f23159g);
        calendarE.add(2, i10);
        return new Month(calendarE);
    }

    int y(Month month) {
        if (this.f23159g instanceof GregorianCalendar) {
            return ((month.f23161i - this.f23161i) * 12) + (month.f23160h - this.f23160h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
