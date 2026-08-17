package expo.modules.notifications.notifications.triggers;

import D0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import i7.t;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.G;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0013\u001a\u00020\f2.\u0010\u0012\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f\"\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lexpo/modules/notifications/notifications/triggers/ChannelAwareTrigger;", "Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;", "Ljava/io/Serializable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "channelId", "<init>", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "describeContents", "()I", "getNotificationChannel", "()Ljava/lang/String;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pairs", "bundleWithChannelId", "([Lkotlin/Pair;)Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "flags", "Li7/B;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getChannelId", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ChannelAwareTrigger implements NotificationTrigger, Serializable {
    public static final Parcelable.Creator<ChannelAwareTrigger> CREATOR = new Creator();
    private final String channelId;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChannelAwareTrigger> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAwareTrigger createFromParcel(Parcel parcel) {
            AbstractC2855l.g(parcel, "parcel");
            return new ChannelAwareTrigger(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAwareTrigger[] newArray(int i10) {
            return new ChannelAwareTrigger[i10];
        }
    }

    public ChannelAwareTrigger(String str) {
        this.channelId = str;
    }

    protected final Bundle bundleWithChannelId(Pair<String, ? extends Object>... pairs) {
        AbstractC2855l.g(pairs, "pairs");
        G g10 = new G(2);
        g10.a(t.a("channelId", getChannelId()));
        g10.b(pairs);
        return c.a((Pair[]) g10.d(new Pair[g10.c()]));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChannelId() {
        return this.channelId;
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationTrigger
    public String getNotificationChannel() {
        return getChannelId();
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationTrigger
    public Bundle toBundle() {
        return bundleWithChannelId(new Pair[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AbstractC2855l.g(dest, "dest");
        dest.writeString(this.channelId);
    }
}
