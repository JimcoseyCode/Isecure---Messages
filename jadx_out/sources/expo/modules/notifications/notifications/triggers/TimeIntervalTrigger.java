package expo.modules.notifications.notifications.triggers;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.service.NotificationsService;
import i7.t;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010 R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lexpo/modules/notifications/notifications/triggers/TimeIntervalTrigger;", "Lexpo/modules/notifications/notifications/triggers/ChannelAwareTrigger;", "Lexpo/modules/notifications/notifications/interfaces/SchedulableNotificationTrigger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "channelId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timeInterval", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isRepeating", "Ljava/util/Date;", "triggerDate", "<init>", "(Ljava/lang/String;JZLjava/util/Date;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "nextTriggerDate", "()Ljava/util/Date;", "Landroid/os/Parcel;", "dest", PointerEventHelper.POINTER_TYPE_UNKNOWN, "flags", "Li7/B;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "J", "getTimeInterval", "()J", "Z", "()Z", "Ljava/util/Date;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeIntervalTrigger extends ChannelAwareTrigger implements SchedulableNotificationTrigger {
    public static final Parcelable.Creator<TimeIntervalTrigger> CREATOR = new Creator();
    private final String channelId;
    private final boolean isRepeating;
    private final long timeInterval;
    private Date triggerDate;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TimeIntervalTrigger> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeIntervalTrigger createFromParcel(Parcel parcel) {
            AbstractC2855l.g(parcel, "parcel");
            return new TimeIntervalTrigger(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeIntervalTrigger[] newArray(int i10) {
            return new TimeIntervalTrigger[i10];
        }
    }

    public /* synthetic */ TimeIntervalTrigger(String str, long j10, boolean z10, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, z10, (i10 & 8) != 0 ? new Date(System.currentTimeMillis() + (((long) ProgressBarContainerView.MAX_PROGRESS) * j10)) : date);
    }

    @Override // expo.modules.notifications.notifications.triggers.ChannelAwareTrigger
    public String getChannelId() {
        return this.channelId;
    }

    public final long getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX INFO: renamed from: isRepeating, reason: from getter */
    public final boolean getIsRepeating() {
        return this.isRepeating;
    }

    @Override // expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger
    public Date nextTriggerDate() {
        Date date = new Date();
        if (this.isRepeating && this.triggerDate.before(date)) {
            long j10 = this.timeInterval * ((long) ProgressBarContainerView.MAX_PROGRESS);
            this.triggerDate.setTime(date.getTime() + (j10 - ((date.getTime() - this.triggerDate.getTime()) % j10)));
        }
        if (this.triggerDate.before(date)) {
            return null;
        }
        return this.triggerDate;
    }

    @Override // expo.modules.notifications.notifications.triggers.ChannelAwareTrigger, expo.modules.notifications.notifications.interfaces.NotificationTrigger
    public Bundle toBundle() {
        return bundleWithChannelId(t.a(NotificationsService.EVENT_TYPE_KEY, "timeInterval"), t.a("repeats", Boolean.valueOf(this.isRepeating)), t.a("seconds", Long.valueOf(this.timeInterval)));
    }

    @Override // expo.modules.notifications.notifications.triggers.ChannelAwareTrigger, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC2855l.g(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeLong(this.timeInterval);
        dest.writeInt(this.isRepeating ? 1 : 0);
        dest.writeSerializable(this.triggerDate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeIntervalTrigger(String str, long j10, boolean z10, Date triggerDate) {
        super(str);
        AbstractC2855l.g(triggerDate, "triggerDate");
        this.channelId = str;
        this.timeInterval = j10;
        this.isRepeating = z10;
        this.triggerDate = triggerDate;
    }
}
