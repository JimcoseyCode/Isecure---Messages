package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Month f23136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Month f23137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final DateValidator f23138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Month f23139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f23142m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface DateValidator extends Parcelable {
        boolean W(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f23143f = v.a(Month.j(1900, 0).f23164l);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f23144g = v.a(Month.j(2100, 11).f23164l);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f23145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f23147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DateValidator f23149e;

        b(CalendarConstraints calendarConstraints) {
            this.f23145a = f23143f;
            this.f23146b = f23144g;
            this.f23149e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f23145a = calendarConstraints.f23136g.f23164l;
            this.f23146b = calendarConstraints.f23137h.f23164l;
            this.f23147c = Long.valueOf(calendarConstraints.f23139j.f23164l);
            this.f23148d = calendarConstraints.f23140k;
            this.f23149e = calendarConstraints.f23138i;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f23149e);
            Month monthP = Month.p(this.f23145a);
            Month monthP2 = Month.p(this.f23146b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f23147c;
            return new CalendarConstraints(monthP, monthP2, dateValidator, l10 == null ? null : Month.p(l10.longValue()), this.f23148d, null);
        }

        public b b(long j10) {
            this.f23147c = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f23136g.equals(calendarConstraints.f23136g) && this.f23137h.equals(calendarConstraints.f23137h) && H0.c.a(this.f23139j, calendarConstraints.f23139j) && this.f23140k == calendarConstraints.f23140k && this.f23138i.equals(calendarConstraints.f23138i);
    }

    Month f(Month month) {
        return month.compareTo(this.f23136g) < 0 ? this.f23136g : month.compareTo(this.f23137h) > 0 ? this.f23137h : month;
    }

    public DateValidator g() {
        return this.f23138i;
    }

    Month h() {
        return this.f23137h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23136g, this.f23137h, this.f23139j, Integer.valueOf(this.f23140k), this.f23138i});
    }

    int i() {
        return this.f23140k;
    }

    int j() {
        return this.f23142m;
    }

    Month l() {
        return this.f23139j;
    }

    Month n() {
        return this.f23136g;
    }

    int o() {
        return this.f23141l;
    }

    boolean p(long j10) {
        if (this.f23136g.t(1) > j10) {
            return false;
        }
        Month month = this.f23137h;
        return j10 <= month.t(month.f23163k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f23136g, 0);
        parcel.writeParcelable(this.f23137h, 0);
        parcel.writeParcelable(this.f23139j, 0);
        parcel.writeParcelable(this.f23138i, 0);
        parcel.writeInt(this.f23140k);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f23136g = month;
        this.f23137h = month2;
        this.f23139j = month3;
        this.f23140k = i10;
        this.f23138i = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > v.m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f23142m = month.y(month2) + 1;
        this.f23141l = (month2.f23161i - month.f23161i) + 1;
    }
}
