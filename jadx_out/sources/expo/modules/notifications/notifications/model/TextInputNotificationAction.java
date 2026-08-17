package expo.modules.notifications.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class TextInputNotificationAction extends NotificationAction {
    public static final Parcelable.Creator<TextInputNotificationAction> CREATOR = new Parcelable.Creator<TextInputNotificationAction>() { // from class: expo.modules.notifications.notifications.model.TextInputNotificationAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInputNotificationAction createFromParcel(Parcel parcel) {
            return new TextInputNotificationAction(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInputNotificationAction[] newArray(int i10) {
            return new TextInputNotificationAction[i10];
        }
    };
    private final String mPlaceholder;

    public String getPlaceholder() {
        return this.mPlaceholder;
    }

    @Override // expo.modules.notifications.notifications.model.NotificationAction, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mPlaceholder);
    }

    public TextInputNotificationAction(String str, String str2, boolean z10, String str3) {
        super(str, str2, z10);
        this.mPlaceholder = str3;
    }

    private TextInputNotificationAction(Parcel parcel) {
        super(parcel);
        this.mPlaceholder = parcel.readString();
    }
}
