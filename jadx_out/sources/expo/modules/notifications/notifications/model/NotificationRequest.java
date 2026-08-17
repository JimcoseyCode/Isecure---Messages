package expo.modules.notifications.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationRequest implements Parcelable, Serializable {
    public static final Parcelable.Creator<NotificationRequest> CREATOR = new Parcelable.Creator<NotificationRequest>() { // from class: expo.modules.notifications.notifications.model.NotificationRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationRequest createFromParcel(Parcel parcel) {
            return new NotificationRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationRequest[] newArray(int i10) {
            return new NotificationRequest[i10];
        }
    };
    private INotificationContent mContent;
    private String mIdentifier;
    private NotificationTrigger mTrigger;

    public NotificationRequest(String str, INotificationContent iNotificationContent, NotificationTrigger notificationTrigger) {
        this.mIdentifier = str;
        this.mContent = iNotificationContent;
        this.mTrigger = notificationTrigger;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public INotificationContent getContent() {
        return this.mContent;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public NotificationTrigger getTrigger() {
        return this.mTrigger;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mIdentifier);
        parcel.writeParcelable(this.mContent, 0);
        parcel.writeParcelable(this.mTrigger, 0);
    }

    protected NotificationRequest(Parcel parcel) {
        this.mIdentifier = parcel.readString();
        this.mContent = (INotificationContent) parcel.readParcelable(getClass().getClassLoader());
        this.mTrigger = (NotificationTrigger) parcel.readParcelable(getClass().getClassLoader());
    }
}
