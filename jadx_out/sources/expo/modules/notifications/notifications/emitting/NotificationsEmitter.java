package expo.modules.notifications.notifications.emitting;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.notifications.notifications.NotificationManager;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.debug.DebugLogging;
import expo.modules.notifications.notifications.interfaces.NotificationListener;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/notifications/notifications/emitting/NotificationsEmitter;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", "<init>", "()V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Li7/B;", "onNotificationReceived", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "response", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onNotificationResponseReceived", "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)Z", "Landroid/os/Bundle;", "extras", "onNotificationResponseIntentReceived", "(Landroid/os/Bundle;)V", "onNotificationsDropped", "lastNotificationResponseBundle", "Landroid/os/Bundle;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationsEmitter extends Module implements NotificationListener {
    private Bundle lastNotificationResponseBundle;

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoNotificationsEmitter");
            moduleDefinitionBuilder.Events("onDidReceiveNotification", "onNotificationsDeleted", "onDidReceiveNotificationResponse");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m321invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m321invoke() {
                    NotificationManager.INSTANCE.addListener(this.this$0);
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m322invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m322invoke() {
                    NotificationManager.INSTANCE.removeListener(this.this$0);
                }
            }));
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Bundle.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Bundle.class));
                returnTypeProvider.getTypes().put(D.b(Bundle.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getLastNotificationResponse", new SyncFunctionComponent("getLastNotificationResponse", anyTypeArr, returnType, new Function1() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$Function$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return this.this$0.lastNotificationResponseBundle;
                }
            }));
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("clearLastNotificationResponse", new SyncFunctionComponent("clearLastNotificationResponse", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    this.this$0.lastNotificationResponseBundle = null;
                    return null;
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationReceived(Notification notification) {
        AbstractC2855l.g(notification, "notification");
        Bundle bundle = NotificationSerializer.toBundle(notification);
        AbstractC2855l.d(bundle);
        DebugLogging.logBundle("NotificationsEmitter.onNotificationReceived", bundle);
        sendEvent("onDidReceiveNotification", bundle);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationResponseIntentReceived(Bundle extras) {
        AbstractC2855l.g(extras, "extras");
        Bundle responseBundleFromExtras = NotificationSerializer.toResponseBundleFromExtras(extras);
        AbstractC2855l.f(responseBundleFromExtras, "toResponseBundleFromExtras(...)");
        DebugLogging.logBundle("NotificationsEmitter.onNotificationResponseIntentReceived", responseBundleFromExtras);
        this.lastNotificationResponseBundle = responseBundleFromExtras;
        sendEvent("onDidReceiveNotificationResponse", responseBundleFromExtras);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public boolean onNotificationResponseReceived(NotificationResponse response) {
        AbstractC2855l.g(response, "response");
        Bundle bundle = NotificationSerializer.toBundle(response);
        AbstractC2855l.d(bundle);
        DebugLogging.logBundle("NotificationsEmitter.onNotificationResponseReceived", bundle);
        this.lastNotificationResponseBundle = bundle;
        sendEvent("onDidReceiveNotificationResponse", bundle);
        return true;
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationsDropped() {
        sendEvent("onNotificationsDeleted", Bundle.EMPTY);
    }
}
