package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f23985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f23986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f23987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f23988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f23989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f23990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f23991m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f23988j = i10;
        this.f23989k = i11;
        this.f23990l = i12;
        this.f23987i = i13;
        this.f23991m = c(i10);
        this.f23985g = new b(59);
        this.f23986h = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f23988j == timeModel.f23988j && this.f23989k == timeModel.f23989k && this.f23987i == timeModel.f23987i && this.f23990l == timeModel.f23990l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23987i), Integer.valueOf(this.f23988j), Integer.valueOf(this.f23989k), Integer.valueOf(this.f23990l)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23988j);
        parcel.writeInt(this.f23989k);
        parcel.writeInt(this.f23990l);
        parcel.writeInt(this.f23987i);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
