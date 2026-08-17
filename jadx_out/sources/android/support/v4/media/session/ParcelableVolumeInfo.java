package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13752k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f13748g = parcel.readInt();
        this.f13750i = parcel.readInt();
        this.f13751j = parcel.readInt();
        this.f13752k = parcel.readInt();
        this.f13749h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13748g);
        parcel.writeInt(this.f13750i);
        parcel.writeInt(this.f13751j);
        parcel.writeInt(this.f13752k);
        parcel.writeInt(this.f13749h);
    }
}
