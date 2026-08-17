package expo.modules.notifications.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationAction implements Parcelable, Serializable {
    public static final Parcelable.Creator<NotificationAction> CREATOR = new Parcelable.Creator<NotificationAction>() { // from class: expo.modules.notifications.notifications.model.NotificationAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationAction createFromParcel(Parcel parcel) {
            return new NotificationAction(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationAction[] newArray(int i10) {
            return new NotificationAction[i10];
        }
    };
    private final String mIdentifier;
    private final boolean mOpensAppToForeground;
    private final String mTitle;

    public NotificationAction(String str, String str2, boolean z10) {
        this.mIdentifier = str;
        this.mTitle = str2;
        this.mOpensAppToForeground = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean opensAppToForeground() {
        return this.mOpensAppToForeground;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mIdentifier);
        parcel.writeString(this.mTitle);
        parcel.writeByte(this.mOpensAppToForeground ? (byte) 1 : (byte) 0);
    }

    protected NotificationAction(Parcel parcel) {
        this.mIdentifier = parcel.readString();
        this.mTitle = parcel.readString();
        this.mOpensAppToForeground = parcel.readByte() != 0;
    }
}
