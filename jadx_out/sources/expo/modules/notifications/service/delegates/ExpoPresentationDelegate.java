package expo.modules.notifications.service.delegates;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Pair;
import androidx.core.app.p;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.SoundResolver;
import expo.modules.notifications.notifications.enums.NotificationPriority;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.notifications.model.NotificationContent;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.service.interfaces.PresentationDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 12\u00020\u0001:\u00011B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0094@¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00062"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;", "Lexpo/modules/notifications/service/interfaces/PresentationDelegate;", "Landroid/content/Context;", "context", "Landroidx/core/app/p;", "notificationManager", "<init>", "(Landroid/content/Context;Landroidx/core/app/p;)V", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Landroid/net/Uri;", "getNotificationSoundUri", "(Lexpo/modules/notifications/notifications/model/Notification;)Landroid/net/Uri;", "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "behavior", "Li7/B;", "presentNotification", "(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "request", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNotifyId", "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAllPresentedNotifications", "()Ljava/util/Collection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIERS_KEY, "dismissNotifications", "(Ljava/util/Collection;)V", "dismissAllNotifications", "()V", NotificationsService.NOTIFICATION_BEHAVIOR_KEY, "Landroid/app/Notification;", "createNotification", "(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Ln7/f;)Ljava/lang/Object;", "Landroid/service/notification/StatusBarNotification;", "statusBarNotification", "getNotification", "(Landroid/service/notification/StatusBarNotification;)Lexpo/modules/notifications/notifications/model/Notification;", "Landroid/os/Bundle;", "bundle", "Lorg/json/JSONObject;", "fromBundle", "(Landroid/os/Bundle;)Lorg/json/JSONObject;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/core/app/p;", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoPresentationDelegate implements PresentationDelegate {
    protected static final int ANDROID_NOTIFICATION_ID = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    protected static final String INTERNAL_IDENTIFIER_AUTHORITY = "foreign_notifications";
    protected static final String INTERNAL_IDENTIFIER_ID_KEY = "id";
    protected static final String INTERNAL_IDENTIFIER_SCHEME = "expo-notifications";
    protected static final String INTERNAL_IDENTIFIER_TAG_KEY = "tag";
    private final Context context;
    private final p notificationManager;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0084T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ANDROID_NOTIFICATION_ID", PointerEventHelper.POINTER_TYPE_UNKNOWN, "INTERNAL_IDENTIFIER_SCHEME", PointerEventHelper.POINTER_TYPE_UNKNOWN, "INTERNAL_IDENTIFIER_AUTHORITY", "INTERNAL_IDENTIFIER_TAG_KEY", "INTERNAL_IDENTIFIER_ID_KEY", "parseNotificationIdentifier", "Landroid/util/Pair;", NotificationsService.IDENTIFIER_KEY, "getInternalIdentifierKey", NotificationsService.NOTIFICATION_KEY, "Landroid/service/notification/StatusBarNotification;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final String getInternalIdentifierKey(StatusBarNotification notification) {
            AbstractC2855l.g(notification, "notification");
            Uri.Builder builderBuildUpon = Uri.parse("expo-notifications://foreign_notifications").buildUpon();
            String tag = notification.getTag();
            if (tag != null) {
                builderBuildUpon.appendQueryParameter(ExpoPresentationDelegate.INTERNAL_IDENTIFIER_TAG_KEY, tag);
            }
            builderBuildUpon.appendQueryParameter("id", String.valueOf(notification.getId()));
            String string = builderBuildUpon.toString();
            AbstractC2855l.f(string, "with(...)");
            return string;
        }

        public final Pair<String, Integer> parseNotificationIdentifier(String identifier) {
            AbstractC2855l.g(identifier, "identifier");
            try {
                Uri uri = Uri.parse(identifier);
                if (!AbstractC2855l.b(ExpoPresentationDelegate.INTERNAL_IDENTIFIER_SCHEME, uri.getScheme()) || !AbstractC2855l.b(ExpoPresentationDelegate.INTERNAL_IDENTIFIER_AUTHORITY, uri.getAuthority())) {
                    return null;
                }
                String queryParameter = uri.getQueryParameter(ExpoPresentationDelegate.INTERNAL_IDENTIFIER_TAG_KEY);
                String queryParameter2 = uri.getQueryParameter("id");
                AbstractC2855l.d(queryParameter2);
                return new Pair<>(queryParameter, Integer.valueOf(Integer.parseInt(queryParameter2)));
            } catch (NullPointerException | NumberFormatException | UnsupportedOperationException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: expo.modules.notifications.service.delegates.ExpoPresentationDelegate$presentNotification$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.notifications.service.delegates.ExpoPresentationDelegate$presentNotification$1", f = "ExpoPresentationDelegate.kt", l = {106}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ NotificationBehaviorRecord $behavior;
        final /* synthetic */ Notification $notification;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Notification notification, NotificationBehaviorRecord notificationBehaviorRecord, n7.f fVar) {
            super(2, fVar);
            this.$notification = notification;
            this.$behavior = notificationBehaviorRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ExpoPresentationDelegate.this.new AnonymousClass1(this.$notification, this.$behavior, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ExpoPresentationDelegate expoPresentationDelegate = ExpoPresentationDelegate.this;
                Notification notification = this.$notification;
                NotificationBehaviorRecord notificationBehaviorRecord = this.$behavior;
                this.label = 1;
                obj = expoPresentationDelegate.createNotification(notification, notificationBehaviorRecord, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            p.h(ExpoPresentationDelegate.this.getContext()).o(this.$notification.getNotificationRequest().getIdentifier(), ExpoPresentationDelegate.this.getNotifyId(this.$notification.getNotificationRequest()), (android.app.Notification) obj);
            return C2735B.f28704a;
        }
    }

    public ExpoPresentationDelegate(Context context, p notificationManager) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(notificationManager, "notificationManager");
        this.context = context;
        this.notificationManager = notificationManager;
    }

    static /* synthetic */ Object createNotification$suspendImpl(ExpoPresentationDelegate expoPresentationDelegate, Notification notification, NotificationBehaviorRecord notificationBehaviorRecord, n7.f fVar) {
        ExpoNotificationBuilder expoNotificationBuilder = new ExpoNotificationBuilder(expoPresentationDelegate.context, notification, new SharedPreferencesNotificationCategoriesStore(expoPresentationDelegate.context));
        expoNotificationBuilder.setAllowedBehavior(notificationBehaviorRecord);
        return expoNotificationBuilder.build(fVar);
    }

    private final Uri getNotificationSoundUri(Notification notification) {
        NotificationChannel notificationChannelK;
        if (Build.VERSION.SDK_INT < 26) {
            return new SoundResolver(this.context).resolve(notification.getNotificationRequest().getContent().getSoundName());
        }
        String notificationChannel = notification.getNotificationRequest().getTrigger().getNotificationChannel();
        if (notificationChannel == null || (notificationChannelK = this.notificationManager.k(notificationChannel)) == null) {
            return null;
        }
        return notificationChannelK.getSound();
    }

    protected Object createNotification(Notification notification, NotificationBehaviorRecord notificationBehaviorRecord, n7.f fVar) {
        return createNotification$suspendImpl(this, notification, notificationBehaviorRecord, fVar);
    }

    @Override // expo.modules.notifications.service.interfaces.PresentationDelegate
    public void dismissAllNotifications() {
        p.h(this.context).c();
    }

    @Override // expo.modules.notifications.service.interfaces.PresentationDelegate
    public void dismissNotifications(Collection<String> identifiers) {
        Object next;
        AbstractC2855l.g(identifiers, "identifiers");
        for (String str : identifiers) {
            Pair<String, Integer> notificationIdentifier = INSTANCE.parseNotificationIdentifier(str);
            if (notificationIdentifier != null) {
                p pVarH = p.h(this.context);
                String str2 = (String) notificationIdentifier.first;
                Object second = notificationIdentifier.second;
                AbstractC2855l.f(second, "second");
                pVarH.b(str2, ((Number) second).intValue());
            } else {
                Iterator<T> it = getAllPresentedNotifications().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (AbstractC2855l.b(((Notification) next).getNotificationRequest().getIdentifier(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Notification notification = (Notification) next;
                p.h(this.context).b(str, getNotifyId(notification != null ? notification.getNotificationRequest() : null));
            }
        }
    }

    protected JSONObject fromBundle(Bundle bundle) {
        AbstractC2855l.g(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException unused) {
                Objects.toString(bundle.get(str));
            }
        }
        return jSONObject;
    }

    @Override // expo.modules.notifications.service.interfaces.PresentationDelegate
    public Collection<Notification> getAllPresentedNotifications() {
        Object systemService = this.context.getSystemService(NotificationsService.NOTIFICATION_KEY);
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
        AbstractC2855l.f(activeNotifications, "getActiveNotifications(...)");
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            AbstractC2855l.d(statusBarNotification);
            Notification notification = getNotification(statusBarNotification);
            if (notification != null) {
                arrayList.add(notification);
            }
        }
        return arrayList;
    }

    protected final Context getContext() {
        return this.context;
    }

    protected Notification getNotification(StatusBarNotification statusBarNotification) {
        AbstractC2855l.g(statusBarNotification, "statusBarNotification");
        android.app.Notification notification = statusBarNotification.getNotification();
        byte[] byteArray = notification.extras.getByteArray(ExpoNotificationBuilder.EXTRAS_MARSHALLED_NOTIFICATION_REQUEST_KEY);
        if (byteArray != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                NotificationRequest notificationRequestCreateFromParcel = NotificationRequest.CREATOR.createFromParcel(parcelObtain);
                AbstractC2855l.f(notificationRequestCreateFromParcel, "createFromParcel(...)");
                parcelObtain.recycle();
                return new Notification(notificationRequestCreateFromParcel, new Date(statusBarNotification.getPostTime()));
            } catch (Exception unused) {
                statusBarNotification.getTag();
                statusBarNotification.getId();
            }
        }
        NotificationContent.Builder builder = new NotificationContent.Builder();
        CharSequence charSequenceC = androidx.core.app.l.c(notification);
        NotificationContent.Builder title = builder.setTitle(charSequenceC != null ? charSequenceC.toString() : null);
        CharSequence charSequenceB = androidx.core.app.l.b(notification);
        NotificationContent.Builder text = title.setText(charSequenceB != null ? charSequenceB.toString() : null);
        CharSequence charSequenceF = androidx.core.app.l.f(notification);
        NotificationContent.Builder sound = text.setSubtitle(charSequenceF != null ? charSequenceF.toString() : null).setAutoDismiss(androidx.core.app.l.a(notification)).setSticky(androidx.core.app.l.e(notification)).setPriority(NotificationPriority.fromNativeValue(notification.priority)).setVibrationPattern(notification.vibrate).setSound(notification.sound);
        Bundle extras = notification.extras;
        AbstractC2855l.f(extras, "extras");
        return new Notification(new NotificationRequest(INSTANCE.getInternalIdentifierKey(statusBarNotification), sound.setBody(fromBundle(extras)).build(), null), new Date(statusBarNotification.getPostTime()));
    }

    protected int getNotifyId(NotificationRequest request) {
        return 0;
    }

    @Override // expo.modules.notifications.service.interfaces.PresentationDelegate
    public void presentNotification(Notification notification, NotificationBehaviorRecord behavior) {
        AbstractC2855l.g(notification, "notification");
        if (behavior == null || behavior.getShouldPresentAlert()) {
            AbstractC1417k.d(O.a(C1404d0.b()), null, null, new AnonymousClass1(notification, behavior, null), 3, null);
        } else if (behavior.getShouldPlaySound()) {
            Uri notificationSoundUri = getNotificationSoundUri(notification);
            if (notificationSoundUri == null) {
                notificationSoundUri = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
            RingtoneManager.getRingtone(this.context, notificationSoundUri).play();
        }
    }

    public /* synthetic */ ExpoPresentationDelegate(Context context, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? p.h(context) : pVar);
    }
}
