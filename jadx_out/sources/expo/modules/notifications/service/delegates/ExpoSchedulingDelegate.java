package expo.modules.notifications.service.delegates;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.e;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.triggers.ChannelAwareTrigger;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.service.interfaces.SchedulingDelegate;
import java.io.IOException;
import java.io.InvalidClassException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoSchedulingDelegate;", "Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "triggerAtMillis", "Landroid/app/PendingIntent;", "operation", "Li7/B;", "setupAlarm", "(JLandroid/app/PendingIntent;)V", "setupScheduledNotifications", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "getAllScheduledNotifications", "()Ljava/util/Collection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "getScheduledNotification", "(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;", "request", "scheduleNotification", "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V", "triggerNotification", "(Ljava/lang/String;)V", NotificationsService.IDENTIFIERS_KEY, "removeScheduledNotifications", "(Ljava/util/Collection;)V", "removeAllScheduledNotifications", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationsStore;", "store", "Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationsStore;", "getStore", "()Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationsStore;", "Landroid/app/AlarmManager;", "alarmManager", "Landroid/app/AlarmManager;", "getAlarmManager", "()Landroid/app/AlarmManager;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoSchedulingDelegate implements SchedulingDelegate {
    private final AlarmManager alarmManager;
    private final Context context;
    private final SharedPreferencesNotificationsStore store;

    public ExpoSchedulingDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.store = new SharedPreferencesNotificationsStore(context);
        Object systemService = context.getSystemService("alarm");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.alarmManager = (AlarmManager) systemService;
    }

    private final void setupAlarm(long triggerAtMillis, PendingIntent operation) {
        if (Build.VERSION.SDK_INT < 31 || this.alarmManager.canScheduleExactAlarms()) {
            e.b(this.alarmManager, 0, triggerAtMillis, operation);
        } else {
            e.a(this.alarmManager, 0, triggerAtMillis, operation);
        }
    }

    protected final AlarmManager getAlarmManager() {
        return this.alarmManager;
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public Collection<NotificationRequest> getAllScheduledNotifications() {
        return this.store.getAllNotificationRequests();
    }

    protected final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public NotificationRequest getScheduledNotification(String identifier) {
        AbstractC2855l.g(identifier, "identifier");
        try {
            return this.store.getNotificationRequest(identifier);
        } catch (IOException | ClassNotFoundException | NullPointerException unused) {
            return null;
        }
    }

    protected final SharedPreferencesNotificationsStore getStore() {
        return this.store;
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public void removeAllScheduledNotifications() {
        Iterator<T> it = this.store.removeAllNotificationRequests().iterator();
        while (it.hasNext()) {
            this.alarmManager.cancel(NotificationsService.INSTANCE.createNotificationTrigger(this.context, (String) it.next()));
        }
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public void removeScheduledNotifications(Collection<String> identifiers) {
        AbstractC2855l.g(identifiers, "identifiers");
        for (String str : identifiers) {
            this.alarmManager.cancel(NotificationsService.INSTANCE.createNotificationTrigger(this.context, str));
            this.store.removeNotificationRequest(str);
        }
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public void scheduleNotification(NotificationRequest request) throws IOException {
        AbstractC2855l.g(request, "request");
        if (request.getTrigger() == null) {
            NotificationsService.Companion.receive$default(NotificationsService.INSTANCE, this.context, new Notification(request), null, 4, null);
            return;
        }
        if (!(request.getTrigger() instanceof SchedulableNotificationTrigger)) {
            if (request.getTrigger() instanceof ChannelAwareTrigger) {
                NotificationsService.Companion.receive$default(NotificationsService.INSTANCE, this.context, new Notification(request), null, 4, null);
                return;
            }
            throw new IllegalArgumentException("Notification request \"" + request.getIdentifier() + "\" does not have a schedulable trigger (it's " + request.getTrigger() + "). Refusing to schedule.");
        }
        NotificationTrigger trigger = request.getTrigger();
        AbstractC2855l.e(trigger, "null cannot be cast to non-null type expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger");
        Date dateNextTriggerDate = ((SchedulableNotificationTrigger) trigger).nextTriggerDate();
        if (dateNextTriggerDate == null) {
            request.getIdentifier();
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context context = this.context;
            String identifier = request.getIdentifier();
            AbstractC2855l.f(identifier, "getIdentifier(...)");
            NotificationsService.Companion.removeScheduledNotification$default(companion, context, identifier, null, 4, null);
            return;
        }
        this.store.saveNotificationRequest(request);
        long time = dateNextTriggerDate.getTime();
        NotificationsService.Companion companion2 = NotificationsService.INSTANCE;
        Context context2 = this.context;
        String identifier2 = request.getIdentifier();
        AbstractC2855l.f(identifier2, "getIdentifier(...)");
        setupAlarm(time, companion2.createNotificationTrigger(context2, identifier2));
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public void setupScheduledNotifications() {
        for (NotificationRequest notificationRequest : this.store.getAllNotificationRequests()) {
            try {
                scheduleNotification(notificationRequest);
            } catch (Exception e10) {
                notificationRequest.getIdentifier();
                e10.getMessage();
                e10.printStackTrace();
            }
        }
    }

    @Override // expo.modules.notifications.service.interfaces.SchedulingDelegate
    public void triggerNotification(String identifier) throws IOException {
        AbstractC2855l.g(identifier, "identifier");
        try {
            NotificationRequest notificationRequest = this.store.getNotificationRequest(identifier);
            AbstractC2855l.d(notificationRequest);
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            NotificationsService.Companion.receive$default(companion, this.context, new Notification(notificationRequest), null, 4, null);
            NotificationsService.Companion.schedule$default(companion, this.context, notificationRequest, null, 4, null);
        } catch (InvalidClassException e10) {
            e10.getMessage();
            e10.printStackTrace();
            NotificationsService.Companion.removeScheduledNotification$default(NotificationsService.INSTANCE, this.context, identifier, null, 4, null);
        } catch (ClassNotFoundException e11) {
            e11.getMessage();
            e11.printStackTrace();
            NotificationsService.Companion.removeScheduledNotification$default(NotificationsService.INSTANCE, this.context, identifier, null, 4, null);
        } catch (NullPointerException e12) {
            e12.getMessage();
            e12.printStackTrace();
            NotificationsService.Companion.removeScheduledNotification$default(NotificationsService.INSTANCE, this.context, identifier, null, 4, null);
        }
    }
}
