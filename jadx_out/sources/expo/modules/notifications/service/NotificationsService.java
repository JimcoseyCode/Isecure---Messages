package expo.modules.notifications.service;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.core.app.t;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationAction;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.notifications.model.NotificationCategory;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.notifications.model.TextInputNotificationAction;
import expo.modules.notifications.notifications.model.TextInputNotificationResponse;
import expo.modules.notifications.service.delegates.ExpoCategoriesDelegate;
import expo.modules.notifications.service.delegates.ExpoHandlingDelegate;
import expo.modules.notifications.service.delegates.ExpoPresentationDelegate;
import expo.modules.notifications.service.delegates.ExpoSchedulingDelegate;
import expo.modules.notifications.service.interfaces.CategoriesDelegate;
import expo.modules.notifications.service.interfaces.HandlingDelegate;
import expo.modules.notifications.service.interfaces.PresentationDelegate;
import expo.modules.notifications.service.interfaces.SchedulingDelegate;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m7.AbstractC2941a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010&\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0016J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0016J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\u0016J\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0016¨\u0006,"}, d2 = {"Lexpo/modules/notifications/service/NotificationsService;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Lexpo/modules/notifications/service/interfaces/PresentationDelegate;", "getPresentationDelegate", "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;", "Lexpo/modules/notifications/service/interfaces/HandlingDelegate;", "getHandlingDelegate", "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;", "Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;", "getCategoriesDelegate", "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;", "Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;", "getSchedulingDelegate", "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;", "Landroid/content/Intent;", "intent", "Li7/B;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleIntent", "onPresentNotification", "Landroid/os/Bundle;", "onGetAllPresentedNotifications", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;", "onDismissNotifications", "onDismissAllNotifications", "onReceiveNotification", "onReceiveNotificationResponse", "onNotificationsDropped", "onGetCategories", "onSetCategory", "onDeleteCategory", "onGetAllScheduledNotifications", "onGetScheduledNotification", "onScheduleNotification", "onNotificationTriggered", "onRemoveScheduledNotifications", "onRemoveAllScheduledNotifications", "onSetupScheduledNotifications", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationsService extends BroadcastReceiver {
    private static final String DELETE_CATEGORY_TYPE = "deleteCategory";
    private static final String DISMISS_ALL_TYPE = "dismissAll";
    private static final String DISMISS_SELECTED_TYPE = "dismissSelected";
    private static final String DROPPED_TYPE = "dropped";
    public static final int ERROR_CODE = 1;
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EXCEPTION_KEY = "exception";
    private static final String GET_ALL_DISPLAYED_TYPE = "getAllDisplayed";
    private static final String GET_ALL_SCHEDULED_TYPE = "getAllScheduled";
    private static final String GET_CATEGORIES_TYPE = "getCategories";
    private static final String GET_SCHEDULED_TYPE = "getScheduled";
    public static final String GOOGLE_MESSAGE_ID_KEY = "google.message_id";
    public static final String IDENTIFIERS_KEY = "identifiers";
    public static final String IDENTIFIER_KEY = "identifier";
    public static final String NOTIFICATIONS_KEY = "notifications";
    public static final String NOTIFICATION_ACTION_BYTES_KEY = "notificationActionBytes";
    public static final String NOTIFICATION_ACTION_KEY = "notificationAction";
    public static final String NOTIFICATION_BEHAVIOR_KEY = "notificationBehavior";
    public static final String NOTIFICATION_BYTES_KEY = "notificationBytes";
    public static final String NOTIFICATION_CATEGORIES_KEY = "notificationCategories";
    public static final String NOTIFICATION_CATEGORY_KEY = "notificationCategory";
    public static final String NOTIFICATION_EVENT_ACTION = "expo.modules.notifications.NOTIFICATION_EVENT";
    public static final String NOTIFICATION_KEY = "notification";
    public static final String NOTIFICATION_REQUESTS_KEY = "notificationRequests";
    public static final String NOTIFICATION_REQUEST_KEY = "notificationRequest";
    public static final String NOTIFICATION_RESPONSE_KEY = "notificationResponse";
    private static final String PRESENT_TYPE = "present";
    public static final String RECEIVER_KEY = "receiver";
    private static final String RECEIVE_RESPONSE_TYPE = "receiveResponse";
    private static final String RECEIVE_TYPE = "receive";
    private static final String REMOVE_ALL_TYPE = "removeAll";
    private static final String REMOVE_SELECTED_TYPE = "removeSelected";
    private static final String SCHEDULE_TYPE = "schedule";
    private static final String SET_CATEGORY_TYPE = "setCategory";
    public static final String SUCCEEDED_KEY = "succeeded";
    public static final int SUCCESS_CODE = 0;
    public static final String TEXT_INPUT_NOTIFICATION_RESPONSE_KEY = "textInputNotificationResponse";
    private static final String TRIGGER_TYPE = "trigger";
    public static final String USER_TEXT_RESPONSE_KEY = "userTextResponse";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> SETUP_ACTIONS = AbstractC2800q.m("android.intent.action.BOOT_COMPLETED", "android.intent.action.REBOOT", "android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.QUICKBOOT_POWERON", "com.htc.intent.action.QUICKBOOT_POWERON");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b#\u0010\u0015J\u0015\u0010$\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010\u0015J)\u0010)\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b/\u0010\u0015J+\u00100\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b0\u0010-J)\u00103\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b3\u00104J)\u00105\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b5\u0010-J/\u00107\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b9\u0010\u0015J\u001d\u0010<\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0004¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020>2\u0006\u0010+\u001a\u00020\u001fH\u0004¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001f¢\u0006\u0004\bG\u0010HJ%\u0010K\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020:2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020O2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010O2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\bR\u0010QJ\u001d\u0010T\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:2\u0006\u0010S\u001a\u00020O¢\u0006\u0004\bT\u0010UR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010_\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010\\R\u0014\u0010`\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010\\R\u0014\u0010a\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010b\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010\\R\u0014\u0010c\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010\\R\u0014\u0010d\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010\\R\u0014\u0010e\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010\\R\u0014\u0010f\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010\\R\u0014\u0010g\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010\\R\u0014\u0010h\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010\\R\u0014\u0010i\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010\\R\u0014\u0010j\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010\\R\u0014\u0010k\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010\\R\u0014\u0010l\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010\\R\u0014\u0010m\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010\\R\u0014\u0010o\u001a\u00020n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bq\u0010pR\u0014\u0010r\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010\\R\u0014\u0010s\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bs\u0010\\R\u0014\u0010t\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010\\R\u0014\u0010u\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010\\R\u0014\u0010v\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010\\R\u0014\u0010w\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010\\R\u0014\u0010x\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010\\R\u0014\u0010y\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\by\u0010\\R\u0014\u0010z\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bz\u0010\\R\u0014\u0010{\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b{\u0010\\R\u0014\u0010|\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010\\R\u0014\u0010}\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010\\R\u0014\u0010~\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010\\R\u0014\u0010\u007f\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010\\R\u0016\u0010\u0080\u0001\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\\R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\\R\u0016\u0010\u0082\u0001\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\\R\u0016\u0010\u0083\u0001\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\\R\u0016\u0010\u0084\u0001\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\\¨\u0006\u0085\u0001"}, d2 = {"Lexpo/modules/notifications/service/NotificationsService$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/os/Parcelable;", "objectToMarshal", PointerEventHelper.POINTER_TYPE_UNKNOWN, "marshalObject", "(Landroid/os/Parcelable;)[B", "T", "Landroid/os/Parcelable$Creator;", "creator", "byteArray", "unmarshalObject", "(Landroid/os/Parcelable$Creator;[B)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/os/ResultReceiver;", NotificationsService.RECEIVER_KEY, "Li7/B;", "getAllPresented", "(Landroid/content/Context;Landroid/os/ResultReceiver;)V", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "behavior", NotificationsService.PRESENT_TYPE, "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Landroid/os/ResultReceiver;)V", NotificationsService.RECEIVE_TYPE, "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Landroid/os/ResultReceiver;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIERS_KEY, "dismiss", "(Landroid/content/Context;[Ljava/lang/String;Landroid/os/ResultReceiver;)V", NotificationsService.DISMISS_ALL_TYPE, "handleDropped", "(Landroid/content/Context;)V", NotificationsService.GET_CATEGORIES_TYPE, "Lexpo/modules/notifications/notifications/model/NotificationCategory;", "category", NotificationsService.SET_CATEGORY_TYPE, "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/NotificationCategory;Landroid/os/ResultReceiver;)V", NotificationsService.IDENTIFIER_KEY, NotificationsService.DELETE_CATEGORY_TYPE, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "resultReceiver", "getAllScheduledNotifications", "getScheduledNotification", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", NotificationsService.NOTIFICATION_REQUEST_KEY, NotificationsService.SCHEDULE_TYPE, "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/NotificationRequest;Landroid/os/ResultReceiver;)V", "removeScheduledNotification", PointerEventHelper.POINTER_TYPE_UNKNOWN, "removeScheduledNotifications", "(Landroid/content/Context;Ljava/util/Collection;Landroid/os/ResultReceiver;)V", "removeAllScheduledNotifications", "Landroid/content/Intent;", "intent", "doWork", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/net/Uri$Builder;", "getUriBuilder", "()Landroid/net/Uri$Builder;", "getUriBuilderForIdentifier", "(Ljava/lang/String;)Landroid/net/Uri$Builder;", "Landroid/content/pm/ActivityInfo;", "findDesignatedBroadcastReceiver", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;", "Landroid/app/PendingIntent;", "createNotificationTrigger", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "Lexpo/modules/notifications/notifications/model/NotificationAction;", "action", "createNotificationResponseIntent", "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroid/app/PendingIntent;", "createNotificationResponseBroadcastIntent", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "getNotificationResponseFromBroadcastIntent", "(Landroid/content/Intent;)Lexpo/modules/notifications/notifications/model/NotificationResponse;", "getNotificationResponseFromOpenIntent", NotificationsService.NOTIFICATION_RESPONSE_KEY, "setNotificationResponseToIntent", "(Landroid/content/Intent;Lexpo/modules/notifications/notifications/model/NotificationResponse;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "SETUP_ACTIONS", "Ljava/util/List;", "getSETUP_ACTIONS", "()Ljava/util/List;", "NOTIFICATION_EVENT_ACTION", "Ljava/lang/String;", "USER_TEXT_RESPONSE_KEY", "GET_ALL_DISPLAYED_TYPE", "PRESENT_TYPE", "DISMISS_SELECTED_TYPE", "DISMISS_ALL_TYPE", "RECEIVE_TYPE", "RECEIVE_RESPONSE_TYPE", "DROPPED_TYPE", "GET_CATEGORIES_TYPE", "SET_CATEGORY_TYPE", "DELETE_CATEGORY_TYPE", "SCHEDULE_TYPE", "TRIGGER_TYPE", "GET_ALL_SCHEDULED_TYPE", "GET_SCHEDULED_TYPE", "REMOVE_SELECTED_TYPE", "REMOVE_ALL_TYPE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "SUCCESS_CODE", "I", "ERROR_CODE", "EVENT_TYPE_KEY", "EXCEPTION_KEY", "RECEIVER_KEY", "GOOGLE_MESSAGE_ID_KEY", "NOTIFICATION_KEY", "NOTIFICATION_RESPONSE_KEY", "TEXT_INPUT_NOTIFICATION_RESPONSE_KEY", "SUCCEEDED_KEY", "IDENTIFIERS_KEY", "IDENTIFIER_KEY", "NOTIFICATION_BEHAVIOR_KEY", "NOTIFICATIONS_KEY", "NOTIFICATION_CATEGORY_KEY", "NOTIFICATION_CATEGORIES_KEY", "NOTIFICATION_REQUEST_KEY", "NOTIFICATION_REQUESTS_KEY", "NOTIFICATION_ACTION_KEY", "NOTIFICATION_BYTES_KEY", "NOTIFICATION_ACTION_BYTES_KEY", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void deleteCategory$default(Companion companion, Context context, String str, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.deleteCategory(context, str, resultReceiver);
        }

        public static /* synthetic */ void dismiss$default(Companion companion, Context context, String[] strArr, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.dismiss(context, strArr, resultReceiver);
        }

        public static /* synthetic */ void dismissAll$default(Companion companion, Context context, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                resultReceiver = null;
            }
            companion.dismissAll(context, resultReceiver);
        }

        public static /* synthetic */ void getAllPresented$default(Companion companion, Context context, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                resultReceiver = null;
            }
            companion.getAllPresented(context, resultReceiver);
        }

        public static /* synthetic */ void getAllScheduledNotifications$default(Companion companion, Context context, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                resultReceiver = null;
            }
            companion.getAllScheduledNotifications(context, resultReceiver);
        }

        public static /* synthetic */ void getCategories$default(Companion companion, Context context, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                resultReceiver = null;
            }
            companion.getCategories(context, resultReceiver);
        }

        public static /* synthetic */ void getScheduledNotification$default(Companion companion, Context context, String str, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.getScheduledNotification(context, str, resultReceiver);
        }

        private final byte[] marshalObject(Parcelable objectToMarshal) {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC2855l.f(parcelObtain, "obtain(...)");
            objectToMarshal.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            AbstractC2855l.f(bArrMarshall, "marshall(...)");
            parcelObtain.recycle();
            return bArrMarshall;
        }

        public static /* synthetic */ void present$default(Companion companion, Context context, Notification notification, NotificationBehaviorRecord notificationBehaviorRecord, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                notificationBehaviorRecord = null;
            }
            if ((i10 & 8) != 0) {
                resultReceiver = null;
            }
            companion.present(context, notification, notificationBehaviorRecord, resultReceiver);
        }

        public static /* synthetic */ void receive$default(Companion companion, Context context, Notification notification, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.receive(context, notification, resultReceiver);
        }

        public static /* synthetic */ void removeAllScheduledNotifications$default(Companion companion, Context context, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                resultReceiver = null;
            }
            companion.removeAllScheduledNotifications(context, resultReceiver);
        }

        public static /* synthetic */ void removeScheduledNotification$default(Companion companion, Context context, String str, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.removeScheduledNotification(context, str, resultReceiver);
        }

        public static /* synthetic */ void removeScheduledNotifications$default(Companion companion, Context context, Collection collection, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.removeScheduledNotifications(context, collection, resultReceiver);
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, NotificationRequest notificationRequest, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.schedule(context, notificationRequest, resultReceiver);
        }

        public static /* synthetic */ void setCategory$default(Companion companion, Context context, NotificationCategory notificationCategory, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.setCategory(context, notificationCategory, resultReceiver);
        }

        private final <T> T unmarshalObject(Parcelable.Creator<T> creator, byte[] byteArray) {
            if (byteArray == null) {
                return null;
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC2855l.f(parcelObtain, "obtain(...)");
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                T tCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return tCreateFromParcel;
            } catch (Exception unused) {
                return null;
            }
        }

        public final Intent createNotificationResponseBroadcastIntent(Context context, Intent intent) {
            Notification notification;
            NotificationAction notificationAction;
            NotificationAction notificationAction2;
            Bundle bundleO;
            AbstractC2855l.g(context, "context");
            String string = null;
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras == null || (notification = (Notification) extras.getParcelable(NotificationsService.NOTIFICATION_KEY)) == null) {
                Parcelable.Creator<Notification> CREATOR = Notification.CREATOR;
                AbstractC2855l.f(CREATOR, "CREATOR");
                notification = (Notification) unmarshalObject(CREATOR, extras != null ? extras.getByteArray(NotificationsService.NOTIFICATION_BYTES_KEY) : null);
            }
            if (extras == null || (notificationAction = (NotificationAction) extras.getParcelable(NotificationsService.NOTIFICATION_ACTION_KEY)) == null) {
                Parcelable.Creator<NotificationAction> CREATOR2 = NotificationAction.CREATOR;
                AbstractC2855l.f(CREATOR2, "CREATOR");
                notificationAction = (NotificationAction) unmarshalObject(CREATOR2, extras != null ? extras.getByteArray(NotificationsService.NOTIFICATION_ACTION_BYTES_KEY) : null);
            }
            if (notification == null || notificationAction == null) {
                throw new IllegalArgumentException("notification (" + notification + ") and action (" + notificationAction + ") should not be null");
            }
            if (intent != null && (bundleO = t.o(intent)) != null) {
                string = bundleO.getString(NotificationsService.USER_TEXT_RESPONSE_KEY);
            }
            boolean z10 = string != null && (notificationAction instanceof TextInputNotificationAction);
            if (z10) {
                TextInputNotificationAction textInputNotificationAction = (TextInputNotificationAction) notificationAction;
                notificationAction2 = new TextInputNotificationAction(textInputNotificationAction.getIdentifier(), textInputNotificationAction.getTitle(), false, textInputNotificationAction.getPlaceholder());
            } else {
                notificationAction2 = new NotificationAction(notificationAction.getIdentifier(), notificationAction.getTitle(), false);
            }
            Intent intent2 = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath(notification.getNotificationRequest().getIdentifier()).appendPath("actions").appendPath(notificationAction2.getIdentifier()).build());
            ActivityInfo activityInfoFindDesignatedBroadcastReceiver = NotificationsService.INSTANCE.findDesignatedBroadcastReceiver(context, intent2);
            if (activityInfoFindDesignatedBroadcastReceiver != null) {
                intent2.setComponent(new ComponentName(activityInfoFindDesignatedBroadcastReceiver.packageName, activityInfoFindDesignatedBroadcastReceiver.name));
            }
            intent2.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.RECEIVE_RESPONSE_TYPE);
            intent2.putExtra(NotificationsService.NOTIFICATION_KEY, notification);
            intent2.putExtra(NotificationsService.NOTIFICATION_ACTION_KEY, (Parcelable) notificationAction2);
            if (z10) {
                t tVarA = new t.e(NotificationsService.USER_TEXT_RESPONSE_KEY).a();
                AbstractC2855l.f(tVarA, "build(...)");
                Bundle bundle = new Bundle();
                bundle.putString(NotificationsService.USER_TEXT_RESPONSE_KEY, string);
                t.b(new t[]{tVarA}, intent2, bundle);
            }
            return intent2;
        }

        public final PendingIntent createNotificationResponseIntent(Context context, Notification notification, NotificationAction action) {
            String className;
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(notification, "notification");
            AbstractC2855l.g(action, "action");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath(notification.getNotificationRequest().getIdentifier()).appendPath("actions").appendPath(action.getIdentifier()).build());
            Companion companion = NotificationsService.INSTANCE;
            ActivityInfo activityInfoFindDesignatedBroadcastReceiver = companion.findDesignatedBroadcastReceiver(context, intent);
            if (activityInfoFindDesignatedBroadcastReceiver != null) {
                intent.setComponent(new ComponentName(activityInfoFindDesignatedBroadcastReceiver.packageName, activityInfoFindDesignatedBroadcastReceiver.name));
            }
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.RECEIVE_RESPONSE_TYPE);
            intent.putExtra(NotificationsService.NOTIFICATION_KEY, notification);
            intent.putExtra(NotificationsService.NOTIFICATION_ACTION_KEY, (Parcelable) action);
            byte[] bArrMarshalObject = companion.marshalObject(notification);
            if (bArrMarshalObject != null) {
                intent.putExtra(NotificationsService.NOTIFICATION_BYTES_KEY, bArrMarshalObject);
            }
            byte[] bArrMarshalObject2 = companion.marshalObject(action);
            if (bArrMarshalObject2 != null) {
                intent.putExtra(NotificationsService.NOTIFICATION_ACTION_BYTES_KEY, bArrMarshalObject2);
            }
            if (action.opensAppToForeground() && Build.VERSION.SDK_INT >= 31) {
                return ExpoHandlingDelegate.INSTANCE.createPendingIntentForOpeningApp(context, intent);
            }
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            AbstractC2855l.f(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent createNotificationTrigger(Context context, String identifier) {
            String className;
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifier, "identifier");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("scheduled").appendPath(identifier).appendPath(NotificationsService.TRIGGER_TYPE).build());
            ActivityInfo activityInfoFindDesignatedBroadcastReceiver = NotificationsService.INSTANCE.findDesignatedBroadcastReceiver(context, intent);
            if (activityInfoFindDesignatedBroadcastReceiver != null) {
                intent.setComponent(new ComponentName(activityInfoFindDesignatedBroadcastReceiver.packageName, activityInfoFindDesignatedBroadcastReceiver.name));
            }
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.TRIGGER_TYPE);
            intent.putExtra(NotificationsService.IDENTIFIER_KEY, identifier);
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            AbstractC2855l.f(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final void deleteCategory(Context context, String identifier, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifier, "identifier");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("categories").appendPath(identifier).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.DELETE_CATEGORY_TYPE);
            intent.putExtra(NotificationsService.IDENTIFIER_KEY, identifier);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void dismiss(Context context, String[] identifiers, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifiers, "identifiers");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("dismiss").build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.DISMISS_SELECTED_TYPE);
            intent.putExtra(NotificationsService.IDENTIFIERS_KEY, identifiers);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void dismissAll(Context context, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("dismiss").build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.DISMISS_ALL_TYPE);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void doWork(Context context, Intent intent) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(intent, "intent");
            ActivityInfo activityInfoFindDesignatedBroadcastReceiver = findDesignatedBroadcastReceiver(context, intent);
            if (activityInfoFindDesignatedBroadcastReceiver == null) {
                intent.getAction();
            } else {
                intent.setComponent(new ComponentName(activityInfoFindDesignatedBroadcastReceiver.packageName, activityInfoFindDesignatedBroadcastReceiver.name));
                context.sendBroadcast(intent);
            }
        }

        public final ActivityInfo findDesignatedBroadcastReceiver(Context context, Intent intent) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(intent, "intent");
            Intent intent2 = new Intent(intent.getAction()).setPackage(context.getPackageName());
            AbstractC2855l.f(intent2, "setPackage(...)");
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
            AbstractC2855l.f(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
            ResolveInfo resolveInfo = (ResolveInfo) AbstractC2800q.g0(listQueryBroadcastReceivers);
            if (resolveInfo != null) {
                return resolveInfo.activityInfo;
            }
            return null;
        }

        public final void getAllPresented(Context context, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.GET_ALL_DISPLAYED_TYPE);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void getAllScheduledNotifications(Context context, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION);
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.GET_ALL_SCHEDULED_TYPE);
            intent.putExtra(NotificationsService.RECEIVER_KEY, resultReceiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void getCategories(Context context, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("categories").build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.GET_CATEGORIES_TYPE);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final NotificationResponse getNotificationResponseFromBroadcastIntent(Intent intent) {
            String string;
            AbstractC2855l.g(intent, "intent");
            Notification notification = (Notification) intent.getParcelableExtra(NotificationsService.NOTIFICATION_KEY);
            if (notification == null) {
                Parcelable.Creator<Notification> CREATOR = Notification.CREATOR;
                AbstractC2855l.f(CREATOR, "CREATOR");
                notification = (Notification) unmarshalObject(CREATOR, intent.getByteArrayExtra(NotificationsService.NOTIFICATION_BYTES_KEY));
                if (notification == null) {
                    throw new IllegalArgumentException("notification not found in the intent extras.");
                }
            }
            NotificationAction notificationAction = (NotificationAction) intent.getParcelableExtra(NotificationsService.NOTIFICATION_ACTION_KEY);
            if (notificationAction == null) {
                Parcelable.Creator<NotificationAction> CREATOR2 = NotificationAction.CREATOR;
                AbstractC2855l.f(CREATOR2, "CREATOR");
                notificationAction = (NotificationAction) unmarshalObject(CREATOR2, intent.getByteArrayExtra(NotificationsService.NOTIFICATION_ACTION_BYTES_KEY));
                if (notificationAction == null) {
                    throw new IllegalArgumentException("notificationAction not found in the intent extras.");
                }
            }
            if (!(notificationAction instanceof TextInputNotificationAction)) {
                return new NotificationResponse(notificationAction, notification);
            }
            Bundle bundleO = t.o(intent);
            if (bundleO == null || (string = bundleO.getString(NotificationsService.USER_TEXT_RESPONSE_KEY)) == null) {
                string = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            return new TextInputNotificationResponse(notificationAction, notification, string);
        }

        @DoNotStrip
        public final NotificationResponse getNotificationResponseFromOpenIntent(Intent intent) {
            AbstractC2855l.g(intent, "intent");
            byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationsService.NOTIFICATION_RESPONSE_KEY);
            if (byteArrayExtra != null) {
                Companion companion = NotificationsService.INSTANCE;
                Parcelable.Creator<NotificationResponse> CREATOR = NotificationResponse.CREATOR;
                AbstractC2855l.f(CREATOR, "CREATOR");
                return (NotificationResponse) companion.unmarshalObject(CREATOR, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra(NotificationsService.TEXT_INPUT_NOTIFICATION_RESPONSE_KEY);
            if (byteArrayExtra2 == null) {
                return null;
            }
            Companion companion2 = NotificationsService.INSTANCE;
            Parcelable.Creator<TextInputNotificationResponse> CREATOR2 = TextInputNotificationResponse.CREATOR;
            AbstractC2855l.f(CREATOR2, "CREATOR");
            return (NotificationResponse) companion2.unmarshalObject(CREATOR2, byteArrayExtra2);
        }

        public final List<String> getSETUP_ACTIONS() {
            return NotificationsService.SETUP_ACTIONS;
        }

        @DoNotStrip
        public final void getScheduledNotification(Context context, String identifier, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifier, "identifier");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("scheduled").appendPath(identifier).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.GET_SCHEDULED_TYPE);
            intent.putExtra(NotificationsService.IDENTIFIER_KEY, identifier);
            intent.putExtra(NotificationsService.RECEIVER_KEY, resultReceiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        protected final Uri.Builder getUriBuilder() {
            Uri.Builder builderBuildUpon = Uri.parse("expo-notifications://notifications/").buildUpon();
            AbstractC2855l.f(builderBuildUpon, "buildUpon(...)");
            return builderBuildUpon;
        }

        protected final Uri.Builder getUriBuilderForIdentifier(String identifier) {
            AbstractC2855l.g(identifier, "identifier");
            Uri.Builder builderAppendPath = getUriBuilder().appendPath(identifier);
            AbstractC2855l.f(builderAppendPath, "appendPath(...)");
            return builderAppendPath;
        }

        public final void handleDropped(Context context) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION);
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.DROPPED_TYPE);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void present(Context context, Notification notification, NotificationBehaviorRecord behavior, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(notification, "notification");
            String identifier = notification.getNotificationRequest().getIdentifier();
            AbstractC2855l.f(identifier, "getIdentifier(...)");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilderForIdentifier(identifier).appendPath(NotificationsService.PRESENT_TYPE).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.PRESENT_TYPE);
            intent.putExtra(NotificationsService.NOTIFICATION_KEY, notification);
            intent.putExtra(NotificationsService.NOTIFICATION_BEHAVIOR_KEY, behavior);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void receive(Context context, Notification notification, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(notification, "notification");
            String identifier = notification.getNotificationRequest().getIdentifier();
            AbstractC2855l.f(identifier, "getIdentifier(...)");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilderForIdentifier(identifier).appendPath(NotificationsService.RECEIVE_TYPE).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.RECEIVE_TYPE);
            intent.putExtra(NotificationsService.NOTIFICATION_KEY, notification);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void removeAllScheduledNotifications(Context context, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION);
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.REMOVE_ALL_TYPE);
            intent.putExtra(NotificationsService.RECEIVER_KEY, resultReceiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void removeScheduledNotification(Context context, String identifier, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifier, "identifier");
            removeScheduledNotifications(context, AbstractC2800q.e(identifier), resultReceiver);
        }

        public final void removeScheduledNotifications(Context context, Collection<String> identifiers, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(identifiers, "identifiers");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("scheduled").build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.REMOVE_SELECTED_TYPE);
            intent.putExtra(NotificationsService.IDENTIFIERS_KEY, (String[]) identifiers.toArray(new String[0]));
            intent.putExtra(NotificationsService.RECEIVER_KEY, resultReceiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void schedule(Context context, NotificationRequest notificationRequest, ResultReceiver resultReceiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(notificationRequest, "notificationRequest");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("scheduled").appendPath(notificationRequest.getIdentifier()).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.SCHEDULE_TYPE);
            intent.putExtra(NotificationsService.NOTIFICATION_REQUEST_KEY, (Parcelable) notificationRequest);
            intent.putExtra(NotificationsService.RECEIVER_KEY, resultReceiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void setCategory(Context context, NotificationCategory category, ResultReceiver receiver) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(category, "category");
            Intent intent = new Intent(NotificationsService.NOTIFICATION_EVENT_ACTION, getUriBuilder().appendPath("categories").appendPath(category.getIdentifier()).build());
            intent.putExtra(NotificationsService.EVENT_TYPE_KEY, NotificationsService.SET_CATEGORY_TYPE);
            intent.putExtra(NotificationsService.NOTIFICATION_CATEGORY_KEY, (Parcelable) category);
            intent.putExtra(NotificationsService.RECEIVER_KEY, receiver);
            C2735B c2735b = C2735B.f28704a;
            doWork(context, intent);
        }

        public final void setNotificationResponseToIntent(Intent intent, NotificationResponse notificationResponse) {
            AbstractC2855l.g(intent, "intent");
            String str = NotificationsService.NOTIFICATION_RESPONSE_KEY;
            AbstractC2855l.g(notificationResponse, "notificationResponse");
            try {
                if (notificationResponse instanceof TextInputNotificationResponse) {
                    str = NotificationsService.TEXT_INPUT_NOTIFICATION_RESPONSE_KEY;
                }
                AbstractC2855l.d(intent.putExtra(str, marshalObject(notificationResponse)));
            } catch (Exception e10) {
                notificationResponse.getActionIdentifier();
                e10.printStackTrace();
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B onReceive$lambda$1(Intent intent, BroadcastReceiver.PendingResult pendingResult, NotificationsService notificationsService, Context context) {
        if (intent != null) {
            try {
                notificationsService.handleIntent(context, intent);
            } catch (Throwable th) {
                pendingResult.finish();
                throw th;
            }
        }
        pendingResult.finish();
        return C2735B.f28704a;
    }

    protected CategoriesDelegate getCategoriesDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        return new ExpoCategoriesDelegate(context);
    }

    protected HandlingDelegate getHandlingDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        return new ExpoHandlingDelegate(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected PresentationDelegate getPresentationDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        return new ExpoPresentationDelegate(context, null, 2, 0 == true ? 1 : 0);
    }

    protected SchedulingDelegate getSchedulingDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        return new ExpoSchedulingDelegate(context);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x0047, B:21:0x004c, B:23:0x0054, B:72:0x011d, B:26:0x005d, B:28:0x0065, B:29:0x006a, B:31:0x0072, B:32:0x0077, B:34:0x007f, B:35:0x0084, B:37:0x008c, B:38:0x0092, B:40:0x009a, B:41:0x009f, B:43:0x00a7, B:44:0x00ad, B:46:0x00b5, B:47:0x00b9, B:49:0x00c1, B:50:0x00c5, B:52:0x00cd, B:53:0x00d1, B:55:0x00d9, B:56:0x00dd, B:58:0x00e5, B:59:0x00e9, B:61:0x00f1, B:62:0x00f6, B:64:0x00fe, B:65:0x0103, B:67:0x010b, B:68:0x0110, B:70:0x0118, B:74:0x0124, B:75:0x013d), top: B:82:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        if (AbstractC2800q.X(SETUP_ACTIONS, intent.getAction())) {
            onSetupScheduledNotifications(context, intent);
            return;
        }
        if (intent.getAction() != NOTIFICATION_EVENT_ACTION) {
            throw new IllegalArgumentException("Received intent of unrecognized action: " + intent.getAction() + ". Ignoring.");
        }
        Bundle extras = intent.getExtras();
        Bundle bundleOnDeleteCategory = null;
        Object obj = extras != null ? extras.get(RECEIVER_KEY) : null;
        ResultReceiver resultReceiver = obj instanceof ResultReceiver ? (ResultReceiver) obj : null;
        try {
            String stringExtra = intent.getStringExtra(EVENT_TYPE_KEY);
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -2144315324:
                        if (stringExtra.equals(RECEIVE_RESPONSE_TYPE)) {
                            onReceiveNotificationResponse(context, intent);
                            if (resultReceiver == null) {
                                resultReceiver.send(0, bundleOnDeleteCategory);
                                C2735B c2735b = C2735B.f28704a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -2002465847:
                        if (stringExtra.equals(DELETE_CATEGORY_TYPE)) {
                            bundleOnDeleteCategory = onDeleteCategory(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -1734918526:
                        if (stringExtra.equals(GET_ALL_SCHEDULED_TYPE)) {
                            bundleOnDeleteCategory = onGetAllScheduledNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -1326613834:
                        if (stringExtra.equals(GET_ALL_DISPLAYED_TYPE)) {
                            bundleOnDeleteCategory = onGetAllPresentedNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -1059891784:
                        if (stringExtra.equals(TRIGGER_TYPE)) {
                            onNotificationTriggered(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -697920873:
                        if (stringExtra.equals(SCHEDULE_TYPE)) {
                            onScheduleNotification(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -577380539:
                        if (stringExtra.equals(DISMISS_SELECTED_TYPE)) {
                            onDismissNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -402879681:
                        if (stringExtra.equals(REMOVE_SELECTED_TYPE)) {
                            onRemoveScheduledNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -318277445:
                        if (stringExtra.equals(PRESENT_TYPE)) {
                            onPresentNotification(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case -170315273:
                        if (stringExtra.equals(GET_SCHEDULED_TYPE)) {
                            bundleOnDeleteCategory = onGetScheduledNotification(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 648465079:
                        if (stringExtra.equals(DISMISS_ALL_TYPE)) {
                            onDismissAllNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 998768146:
                        if (stringExtra.equals(GET_CATEGORIES_TYPE)) {
                            bundleOnDeleteCategory = onGetCategories(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 1082290915:
                        if (stringExtra.equals(RECEIVE_TYPE)) {
                            onReceiveNotification(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 1282345597:
                        if (stringExtra.equals(REMOVE_ALL_TYPE)) {
                            onRemoveAllScheduledNotifications(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 1925736384:
                        if (stringExtra.equals(DROPPED_TYPE)) {
                            onNotificationsDropped(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                    case 2039831424:
                        if (stringExtra.equals(SET_CATEGORY_TYPE)) {
                            bundleOnDeleteCategory = onSetCategory(context, intent);
                            if (resultReceiver == null) {
                            }
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Received event of unrecognized type: " + stringExtra + ". Ignoring.");
        } catch (Exception e10) {
            intent.getAction();
            e10.getMessage();
            e10.printStackTrace();
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(EXCEPTION_KEY, e10);
                C2735B c2735b2 = C2735B.f28704a;
                resultReceiver.send(1, bundle);
            }
        }
    }

    public Bundle onDeleteCategory(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        CategoriesDelegate categoriesDelegate = getCategoriesDelegate(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString(IDENTIFIER_KEY) : null;
        AbstractC2855l.d(string);
        bundle.putBoolean(SUCCEEDED_KEY, categoriesDelegate.deleteCategory(string));
        return bundle;
    }

    public void onDismissAllNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        getPresentationDelegate(context).dismissAllNotifications();
    }

    public void onDismissNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        PresentationDelegate presentationDelegate = getPresentationDelegate(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray(IDENTIFIERS_KEY) : null;
        AbstractC2855l.d(stringArray);
        presentationDelegate.dismissNotifications(AbstractC2793j.e(stringArray));
    }

    public Bundle onGetAllPresentedNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(NOTIFICATIONS_KEY, new ArrayList<>(getPresentationDelegate(context).getAllPresentedNotifications()));
        return bundle;
    }

    public Bundle onGetAllScheduledNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(NOTIFICATION_REQUESTS_KEY, new ArrayList<>(getSchedulingDelegate(context).getAllScheduledNotifications()));
        return bundle;
    }

    public Bundle onGetCategories(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(NOTIFICATION_CATEGORIES_KEY, new ArrayList<>(getCategoriesDelegate(context).getCategories()));
        return bundle;
    }

    public Bundle onGetScheduledNotification(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        SchedulingDelegate schedulingDelegate = getSchedulingDelegate(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString(IDENTIFIER_KEY) : null;
        AbstractC2855l.d(string);
        bundle.putParcelable(NOTIFICATION_REQUEST_KEY, schedulingDelegate.getScheduledNotification(string));
        return bundle;
    }

    public void onNotificationTriggered(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        SchedulingDelegate schedulingDelegate = getSchedulingDelegate(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString(IDENTIFIER_KEY) : null;
        AbstractC2855l.d(string);
        schedulingDelegate.triggerNotification(string);
    }

    public void onNotificationsDropped(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        getHandlingDelegate(context).handleNotificationsDropped();
    }

    public void onPresentNotification(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        PresentationDelegate presentationDelegate = getPresentationDelegate(context);
        Bundle extras = intent.getExtras();
        Notification notification = extras != null ? (Notification) extras.getParcelable(NOTIFICATION_KEY) : null;
        AbstractC2855l.d(notification);
        Bundle extras2 = intent.getExtras();
        presentationDelegate.presentNotification(notification, extras2 != null ? (NotificationBehaviorRecord) extras2.getParcelable(NOTIFICATION_BEHAVIOR_KEY) : null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        AbstractC2855l.g(context, "context");
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        AbstractC2941a.b(false, false, null, null, 0, new InterfaceC3487a() { // from class: expo.modules.notifications.service.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return NotificationsService.onReceive$lambda$1(intent, pendingResultGoAsync, this, context);
            }
        }, 31, null);
    }

    public void onReceiveNotification(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        HandlingDelegate handlingDelegate = getHandlingDelegate(context);
        Parcelable parcelableExtra = intent.getParcelableExtra(NOTIFICATION_KEY);
        AbstractC2855l.d(parcelableExtra);
        handlingDelegate.handleNotification((Notification) parcelableExtra);
    }

    public void onReceiveNotificationResponse(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        getHandlingDelegate(context).handleNotificationResponse(INSTANCE.getNotificationResponseFromBroadcastIntent(intent));
    }

    public void onRemoveAllScheduledNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        getSchedulingDelegate(context).removeAllScheduledNotifications();
    }

    public void onRemoveScheduledNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        SchedulingDelegate schedulingDelegate = getSchedulingDelegate(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray(IDENTIFIERS_KEY) : null;
        AbstractC2855l.d(stringArray);
        schedulingDelegate.removeScheduledNotifications(AbstractC2793j.e(stringArray));
    }

    public void onScheduleNotification(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        SchedulingDelegate schedulingDelegate = getSchedulingDelegate(context);
        Bundle extras = intent.getExtras();
        NotificationRequest notificationRequest = extras != null ? (NotificationRequest) extras.getParcelable(NOTIFICATION_REQUEST_KEY) : null;
        AbstractC2855l.d(notificationRequest);
        schedulingDelegate.scheduleNotification(notificationRequest);
    }

    public Bundle onSetCategory(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        Bundle bundle = new Bundle();
        CategoriesDelegate categoriesDelegate = getCategoriesDelegate(context);
        Parcelable parcelableExtra = intent.getParcelableExtra(NOTIFICATION_CATEGORY_KEY);
        AbstractC2855l.d(parcelableExtra);
        bundle.putParcelable(NOTIFICATION_CATEGORY_KEY, categoriesDelegate.setCategory((NotificationCategory) parcelableExtra));
        return bundle;
    }

    public void onSetupScheduledNotifications(Context context, Intent intent) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(intent, "intent");
        getSchedulingDelegate(context).setupScheduledNotifications();
    }
}
