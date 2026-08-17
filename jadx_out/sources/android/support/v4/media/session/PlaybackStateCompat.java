package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f13753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f13754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final long f13755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float f13756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f13757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f13758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final CharSequence f13759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f13760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    List f13761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final long f13762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Bundle f13763q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f13764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final CharSequence f13765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f13766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Bundle f13767j;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f13764g = parcel.readString();
            this.f13765h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13766i = parcel.readInt();
            this.f13767j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f13765h) + ", mIcon=" + this.f13766i + ", mExtras=" + this.f13767j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f13764g);
            TextUtils.writeToParcel(this.f13765h, parcel, i10);
            parcel.writeInt(this.f13766i);
            parcel.writeBundle(this.f13767j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f13753g = parcel.readInt();
        this.f13754h = parcel.readLong();
        this.f13756j = parcel.readFloat();
        this.f13760n = parcel.readLong();
        this.f13755i = parcel.readLong();
        this.f13757k = parcel.readLong();
        this.f13759m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13761o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f13762p = parcel.readLong();
        this.f13763q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f13758l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f13753g + ", position=" + this.f13754h + ", buffered position=" + this.f13755i + ", speed=" + this.f13756j + ", updated=" + this.f13760n + ", actions=" + this.f13757k + ", error code=" + this.f13758l + ", error message=" + this.f13759m + ", custom actions=" + this.f13761o + ", active item id=" + this.f13762p + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13753g);
        parcel.writeLong(this.f13754h);
        parcel.writeFloat(this.f13756j);
        parcel.writeLong(this.f13760n);
        parcel.writeLong(this.f13755i);
        parcel.writeLong(this.f13757k);
        TextUtils.writeToParcel(this.f13759m, parcel, i10);
        parcel.writeTypedList(this.f13761o);
        parcel.writeLong(this.f13762p);
        parcel.writeBundle(this.f13763q);
        parcel.writeInt(this.f13758l);
    }
}
