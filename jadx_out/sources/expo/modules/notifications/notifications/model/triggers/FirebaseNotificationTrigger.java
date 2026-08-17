package expo.modules.notifications.notifications.model.triggers;

import D0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.notifications.notifications.RemoteMessageSerializer;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.service.NotificationsService;
import i7.t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;", "Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "<init>", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNotificationChannel", "()Ljava/lang/String;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "describeContents", "()I", "dest", "flags", "Li7/B;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/google/firebase/messaging/RemoteMessage;", "getRemoteMessage", "()Lcom/google/firebase/messaging/RemoteMessage;", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FirebaseNotificationTrigger implements NotificationTrigger {
    private final RemoteMessage remoteMessage;
    public static final Parcelable.Creator<FirebaseNotificationTrigger> CREATOR = new Parcelable.Creator<FirebaseNotificationTrigger>() { // from class: expo.modules.notifications.notifications.model.triggers.FirebaseNotificationTrigger$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirebaseNotificationTrigger createFromParcel(Parcel parcel) {
            AbstractC2855l.g(parcel, "parcel");
            return new FirebaseNotificationTrigger(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirebaseNotificationTrigger[] newArray(int size) {
            return new FirebaseNotificationTrigger[size];
        }
    };

    public /* synthetic */ FirebaseNotificationTrigger(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationTrigger
    public String getNotificationChannel() {
        String strD;
        RemoteMessage.b bVarU0 = this.remoteMessage.u0();
        if (bVarU0 == null || (strD = bVarU0.d()) == null) {
            strD = (String) this.remoteMessage.s().get("channelId");
        }
        return strD == null ? NotificationTrigger.DefaultImpls.getNotificationChannel(this) : strD;
    }

    public final RemoteMessage getRemoteMessage() {
        return this.remoteMessage;
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationTrigger
    public Bundle toBundle() {
        return c.a(t.a(NotificationsService.EVENT_TYPE_KEY, "push"), t.a("remoteMessage", RemoteMessageSerializer.toBundle(this.remoteMessage)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AbstractC2855l.g(dest, "dest");
        dest.writeParcelable(this.remoteMessage, 0);
    }

    public FirebaseNotificationTrigger(RemoteMessage remoteMessage) {
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        this.remoteMessage = remoteMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private FirebaseNotificationTrigger(Parcel parcel) {
        RemoteMessage remoteMessage = (RemoteMessage) parcel.readParcelable(FirebaseNotificationTrigger.class.getClassLoader());
        if (remoteMessage != null) {
            this(remoteMessage);
            return;
        }
        throw new IllegalArgumentException("RemoteMessage from readParcelable must not be null");
    }
}
