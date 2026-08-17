package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ContextChain f19680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f19681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f19682k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ContextChain[] newArray(int i10) {
            return new ContextChain[i10];
        }
    }

    protected ContextChain(Parcel parcel) {
        this.f19678g = parcel.readString();
        this.f19679h = parcel.readString();
        this.f19682k = parcel.readString();
        this.f19680i = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    protected String a() {
        return this.f19682k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContextChain contextChain = (ContextChain) obj;
            if (Objects.equals(a(), contextChain.a()) && Objects.equals(this.f19680i, contextChain.f19680i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f19680i, a());
    }

    public String toString() {
        if (this.f19681j == null) {
            this.f19681j = a();
            if (this.f19680i != null) {
                this.f19681j = this.f19680i.toString() + '/' + this.f19681j;
            }
        }
        return this.f19681j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19678g);
        parcel.writeString(this.f19679h);
        parcel.writeString(a());
        parcel.writeParcelable(this.f19680i, i10);
    }
}
