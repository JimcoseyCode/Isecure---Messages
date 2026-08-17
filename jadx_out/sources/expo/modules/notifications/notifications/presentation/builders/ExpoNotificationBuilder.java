package expo.modules.notifications.notifications.presentation.builders;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import androidx.core.app.l;
import androidx.core.app.t;
import androidx.customview.widget.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.SoundResolver;
import expo.modules.notifications.notifications.enums.NotificationPriority;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationAction;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.notifications.model.NotificationCategory;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.notifications.model.TextInputNotificationAction;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.service.delegates.SharedPreferencesNotificationCategoriesStore;
import i7.AbstractC2753p;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0005\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0004¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b\"\u0010#J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020*8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0016\u00107\u001a\u0004\u0018\u0001048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;", "Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;", "Landroid/content/Context;", "context", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;", "store", "<init>", "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;)V", "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;", "content", "Landroidx/core/app/l$e;", "builder", "Li7/B;", "applySoundsAndVibrations", "(Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Landroidx/core/app/l$e;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldPlaySound", "()Z", "shouldVibrate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "categoryIdentifier", "addActionsToBuilder", "(Landroidx/core/app/l$e;Ljava/lang/String;)V", "Lexpo/modules/notifications/notifications/model/NotificationAction;", "action", "Landroidx/core/app/l$a;", "buildButtonAction", "(Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroidx/core/app/l$a;", "Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;", "buildTextInputAction", "(Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;)Landroidx/core/app/l$a;", "Landroid/app/Notification;", "build", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "request", PointerEventHelper.POINTER_TYPE_UNKNOWN, "marshallNotificationRequest", "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)[B", "Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getPriority", "()I", "priority", "Landroid/graphics/Bitmap;", "getLargeIcon", "()Landroid/graphics/Bitmap;", "largeIcon", "getIcon", "icon", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getColor", "()Ljava/lang/Number;", ViewProps.COLOR, "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoNotificationBuilder extends BaseNotificationBuilder {
    public static final String EXTRAS_BODY_KEY = "body";
    public static final String EXTRAS_MARSHALLED_NOTIFICATION_REQUEST_KEY = "expo.notification_request";
    public static final String META_DATA_DEFAULT_COLOR_KEY = "expo.modules.notifications.default_notification_color";
    public static final String META_DATA_DEFAULT_ICON_KEY = "expo.modules.notifications.default_notification_icon";
    public static final String META_DATA_LARGE_ICON_KEY = "expo.modules.notifications.large_notification_icon";
    private final SharedPreferencesNotificationCategoriesStore store;

    /* JADX INFO: renamed from: expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder$build$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder", f = "ExpoNotificationBuilder.kt", l = {151}, m = "build$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return ExpoNotificationBuilder.build$suspendImpl(ExpoNotificationBuilder.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoNotificationBuilder(Context context, Notification notification, SharedPreferencesNotificationCategoriesStore store) {
        super(context, notification);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(notification, "notification");
        AbstractC2855l.g(store, "store");
        this.store = store;
    }

    private final void applySoundsAndVibrations(INotificationContent content, l.e builder) {
        boolean zShouldPlaySound = shouldPlaySound();
        boolean zShouldVibrate = shouldVibrate();
        if (!zShouldPlaySound && !zShouldVibrate) {
            builder.x(true);
        }
        if (Build.VERSION.SDK_INT < 26) {
            boolean z10 = false;
            boolean z11 = zShouldPlaySound && content.getShouldPlayDefaultSound();
            if (zShouldVibrate && content.getShouldUseDefaultVibrationPattern()) {
                z10 = true;
            }
            if (z10 && z11) {
                AbstractC2855l.d(builder.m(-1));
                return;
            }
            if (zShouldPlaySound) {
                if (content.getSoundName() != null) {
                    builder.z(new SoundResolver(getContext()).resolve(content.getSoundName()));
                } else if (z11) {
                    builder.m(1);
                    builder.z(Settings.System.DEFAULT_NOTIFICATION_URI);
                }
            }
            if (zShouldVibrate) {
                long[] vibrationPattern = content.getVibrationPattern();
                if (vibrationPattern != null) {
                    builder.D(vibrationPattern);
                } else if (z10) {
                    builder.m(2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object build$suspendImpl(ExpoNotificationBuilder expoNotificationBuilder, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        l.e eVarCreateBuilder;
        l.e eVar;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = expoNotificationBuilder.new AnonymousClass1(fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            eVarCreateBuilder = expoNotificationBuilder.createBuilder();
            eVarCreateBuilder.y(expoNotificationBuilder.getIcon());
            eVarCreateBuilder.v(expoNotificationBuilder.getPriority());
            INotificationContent notificationContent = expoNotificationBuilder.getNotificationContent();
            eVarCreateBuilder.g(notificationContent.getIsAutoDismiss());
            eVarCreateBuilder.u(notificationContent.getIsSticky());
            eVarCreateBuilder.l(notificationContent.getTitle());
            eVarCreateBuilder.k(notificationContent.getText());
            eVarCreateBuilder.B(notificationContent.getSubText());
            eVarCreateBuilder.A(new l.c().h(notificationContent.getText()));
            Number color = expoNotificationBuilder.getColor();
            if (color != null) {
                eVarCreateBuilder.i(color.intValue());
            }
            Number badgeCount = expoNotificationBuilder.getNotificationContent().getBadgeCount();
            if (badgeCount != null) {
                eVarCreateBuilder.t(badgeCount.intValue());
            }
            String categoryId = expoNotificationBuilder.getNotificationContent().getCategoryId();
            if (categoryId != null) {
                expoNotificationBuilder.addActionsToBuilder(eVarCreateBuilder, categoryId);
            }
            expoNotificationBuilder.applySoundsAndVibrations(notificationContent, eVarCreateBuilder);
            if (notificationContent.getBody() != null) {
                Bundle bundleE = eVarCreateBuilder.e();
                AbstractC2855l.f(bundleE, "getExtras(...)");
                bundleE.putString(EXTRAS_BODY_KEY, String.valueOf(notificationContent.getBody()));
                eVarCreateBuilder.o(bundleE);
            }
            Bundle bundle = new Bundle();
            NotificationRequest notificationRequest = expoNotificationBuilder.getNotification().getNotificationRequest();
            AbstractC2855l.f(notificationRequest, "getNotificationRequest(...)");
            bundle.putByteArray(EXTRAS_MARSHALLED_NOTIFICATION_REQUEST_KEY, expoNotificationBuilder.marshallNotificationRequest(notificationRequest));
            eVarCreateBuilder.c(bundle);
            eVarCreateBuilder.j(NotificationsService.INSTANCE.createNotificationResponseIntent(expoNotificationBuilder.getContext(), expoNotificationBuilder.getNotification(), new NotificationAction(NotificationResponse.DEFAULT_ACTION_IDENTIFIER, null, true)));
            if (!expoNotificationBuilder.getNotificationContent().containsImage()) {
                eVarCreateBuilder.q(expoNotificationBuilder.getLargeIcon());
                android.app.Notification notificationD = eVarCreateBuilder.d();
                AbstractC2855l.f(notificationD, "build(...)");
                return notificationD;
            }
            INotificationContent notificationContent2 = expoNotificationBuilder.getNotificationContent();
            Context context = expoNotificationBuilder.getContext();
            anonymousClass1.L$0 = eVarCreateBuilder;
            anonymousClass1.label = 1;
            Object image = notificationContent2.getImage(context, anonymousClass1);
            if (image == objE) {
                return objE;
            }
            obj = image;
            eVar = eVarCreateBuilder;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (l.e) anonymousClass1.L$0;
            AbstractC2753p.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            eVar.q(bitmap);
        }
        eVarCreateBuilder = eVar;
        android.app.Notification notificationD2 = eVarCreateBuilder.d();
        AbstractC2855l.f(notificationD2, "build(...)");
        return notificationD2;
    }

    private final int getPriority() {
        NotificationPriority priority = getNotificationContent().getPriority();
        NotificationBehaviorRecord notificationBehavior = getNotificationBehavior();
        if (notificationBehavior == null) {
            if (priority != null) {
                return priority.getNativeValue();
            }
            return 1;
        }
        NotificationPriority priorityOverride = notificationBehavior.getPriorityOverride();
        if (priorityOverride != null) {
            return priorityOverride.getNativeValue();
        }
        if (priority == null) {
            priority = NotificationPriority.DEFAULT;
        }
        int nativeValue = priority.getNativeValue();
        return (int) (notificationBehavior.getShouldPresentAlert() ? Math.max(1.0d, nativeValue) : Math.min(0.0d, nativeValue));
    }

    private final boolean shouldPlaySound() {
        NotificationBehaviorRecord notificationBehavior = getNotificationBehavior();
        return (notificationBehavior != null ? notificationBehavior.getShouldPlaySound() : true) && (getNotificationContent().getShouldPlayDefaultSound() || getNotificationContent().getSoundName() != null);
    }

    private final boolean shouldVibrate() {
        NotificationBehaviorRecord notificationBehavior = getNotificationBehavior();
        return (notificationBehavior != null ? notificationBehavior.getShouldPlaySound() : true) && (getNotificationContent().getShouldUseDefaultVibrationPattern() || getNotificationContent().getVibrationPattern() != null);
    }

    public void addActionsToBuilder(l.e builder, String categoryIdentifier) {
        AbstractC2855l.g(builder, "builder");
        AbstractC2855l.g(categoryIdentifier, "categoryIdentifier");
        List<NotificationAction> listJ = AbstractC2800q.j();
        try {
            NotificationCategory notificationCategory = this.store.getNotificationCategory(categoryIdentifier);
            if (notificationCategory != null) {
                List<NotificationAction> actions = notificationCategory.getActions();
                AbstractC2855l.f(actions, "getActions(...)");
                listJ = actions;
            }
        } catch (IOException e10) {
            H h10 = H.f29375a;
            AbstractC2855l.f(String.format("Could not read category with identifier: %s. %s", Arrays.copyOf(new Object[]{categoryIdentifier, e10.getMessage()}, 2)), "format(...)");
        } catch (ClassNotFoundException e11) {
            H h11 = H.f29375a;
            AbstractC2855l.f(String.format("Could not read category with identifier: %s. %s", Arrays.copyOf(new Object[]{categoryIdentifier, e11.getMessage()}, 2)), "format(...)");
        }
        for (NotificationAction notificationAction : listJ) {
            if (notificationAction instanceof TextInputNotificationAction) {
                builder.b(buildTextInputAction((TextInputNotificationAction) notificationAction));
            } else {
                builder.b(buildButtonAction(notificationAction));
            }
        }
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationBuilder
    public Object build(n7.f fVar) {
        return build$suspendImpl(this, fVar);
    }

    protected final l.a buildButtonAction(NotificationAction action) {
        AbstractC2855l.g(action, "action");
        l.a aVarB = new l.a.C0159a(getIcon(), action.getTitle(), NotificationsService.INSTANCE.createNotificationResponseIntent(getContext(), getNotification(), action)).b();
        AbstractC2855l.f(aVarB, "build(...)");
        return aVarB;
    }

    protected final l.a buildTextInputAction(TextInputNotificationAction action) {
        AbstractC2855l.g(action, "action");
        PendingIntent pendingIntentCreateNotificationResponseIntent = NotificationsService.INSTANCE.createNotificationResponseIntent(getContext(), getNotification(), action);
        t tVarA = new t.e(NotificationsService.USER_TEXT_RESPONSE_KEY).b(action.getPlaceholder()).a();
        AbstractC2855l.f(tVarA, "build(...)");
        l.a aVarB = new l.a.C0159a(getIcon(), action.getTitle(), pendingIntentCreateNotificationResponseIntent).a(tVarA).b();
        AbstractC2855l.f(aVarB, "build(...)");
        return aVarB;
    }

    protected Number getColor() {
        Number color = getNotificationContent().getColor();
        if (color == null) {
            color = null;
            try {
                ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                AbstractC2855l.f(applicationInfo, "getApplicationInfo(...)");
                if (applicationInfo.metaData.containsKey(META_DATA_DEFAULT_COLOR_KEY)) {
                    return Integer.valueOf(getContext().getResources().getColor(applicationInfo.metaData.getInt(META_DATA_DEFAULT_COLOR_KEY), null));
                }
            } catch (Exception unused) {
            }
        }
        return color;
    }

    protected int getIcon() {
        try {
            ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            AbstractC2855l.f(applicationInfo, "getApplicationInfo(...)");
            if (applicationInfo.metaData.containsKey(META_DATA_DEFAULT_ICON_KEY)) {
                return applicationInfo.metaData.getInt(META_DATA_DEFAULT_ICON_KEY);
            }
        } catch (Exception unused) {
        }
        return getContext().getApplicationInfo().icon;
    }

    protected final Bitmap getLargeIcon() {
        try {
            ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            AbstractC2855l.f(applicationInfo, "getApplicationInfo(...)");
            if (!applicationInfo.metaData.containsKey(META_DATA_LARGE_ICON_KEY)) {
                return null;
            }
            return BitmapFactory.decodeResource(getContext().getResources(), applicationInfo.metaData.getInt(META_DATA_LARGE_ICON_KEY));
        } catch (Exception unused) {
            return null;
        }
    }

    protected final byte[] marshallNotificationRequest(NotificationRequest request) {
        AbstractC2855l.g(request, "request");
        try {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC2855l.f(parcelObtain, "obtain(...)");
            request.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception unused) {
            request.getIdentifier();
            return null;
        }
    }
}
