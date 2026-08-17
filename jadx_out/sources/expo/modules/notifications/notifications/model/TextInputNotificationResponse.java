package expo.modules.notifications.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class TextInputNotificationResponse extends NotificationResponse {
    public static final Parcelable.Creator<TextInputNotificationResponse> CREATOR = new Parcelable.Creator<TextInputNotificationResponse>() { // from class: expo.modules.notifications.notifications.model.TextInputNotificationResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInputNotificationResponse createFromParcel(Parcel parcel) {
            return new TextInputNotificationResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInputNotificationResponse[] newArray(int i10) {
            return new TextInputNotificationResponse[i10];
        }
    };
    private String mUserText;

    public TextInputNotificationResponse(NotificationAction notificationAction, Notification notification, String str) {
        super(notificationAction, notification);
        this.mUserText = str;
    }

    public String getUserText() {
        return this.mUserText;
    }

    @Override // expo.modules.notifications.notifications.model.NotificationResponse, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mUserText);
    }

    protected TextInputNotificationResponse(Parcel parcel) {
        super(parcel);
        this.mUserText = parcel.readString();
    }
}
