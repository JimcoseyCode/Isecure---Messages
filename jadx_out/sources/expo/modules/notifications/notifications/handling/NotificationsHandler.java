package expo.modules.notifications.notifications.handling;

import C7.d;
import C7.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.NotificationWasAlreadyHandledException;
import expo.modules.notifications.notifications.NotificationManager;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.interfaces.NotificationListener;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.notifications.model.RemoteNotificationContent;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/notifications/notifications/handling/NotificationsHandler;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "behavior", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Li7/B;", "handleNotificationAsync", "(Ljava/lang/String;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Lexpo/modules/kotlin/Promise;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "onNotificationReceived", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;", "task", "onTaskFinished", "(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V", "Landroid/os/HandlerThread;", "notificationsHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tasksMap", "Ljava/util/Map;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationsHandler extends Module implements NotificationListener {
    private Handler handler;
    private HandlerThread notificationsHandlerThread;
    private final Map<String, SingleNotificationHandlerTask> tasksMap = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotificationAsync(String identifier, NotificationBehaviorRecord behavior, Promise promise) throws NotificationWasAlreadyHandledException {
        SingleNotificationHandlerTask singleNotificationHandlerTask = this.tasksMap.get(identifier);
        if (singleNotificationHandlerTask == null) {
            throw new NotificationWasAlreadyHandledException(identifier);
        }
        singleNotificationHandlerTask.processNotificationWithBehavior(behavior, promise);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            final ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoNotificationsHandlerModule");
            moduleDefinitionBuilder.Events("onHandleNotification", "onHandleNotificationTimeout");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.handling.NotificationsHandler$definition$lambda$3$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m323invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m323invoke() {
                    NotificationManager.INSTANCE.addListener(this.this$0);
                    this.this$0.notificationsHandlerThread = new HandlerThread("NotificationsHandlerThread - " + moduleDefinitionBuilder.getClass());
                    HandlerThread handlerThread = this.this$0.notificationsHandlerThread;
                    HandlerThread handlerThread2 = null;
                    if (handlerThread == null) {
                        AbstractC2855l.y("notificationsHandlerThread");
                        handlerThread = null;
                    }
                    handlerThread.start();
                    NotificationsHandler notificationsHandler = this.this$0;
                    HandlerThread handlerThread3 = this.this$0.notificationsHandlerThread;
                    if (handlerThread3 == null) {
                        AbstractC2855l.y("notificationsHandlerThread");
                    } else {
                        handlerThread2 = handlerThread3;
                    }
                    notificationsHandler.handler = new Handler(handlerThread2.getLooper());
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.handling.NotificationsHandler$definition$lambda$3$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m324invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m324invoke() {
                    NotificationManager.INSTANCE.removeListener(this.this$0);
                    Iterator it = this.this$0.tasksMap.values().iterator();
                    while (it.hasNext()) {
                        ((SingleNotificationHandlerTask) it.next()).stop();
                    }
                    HandlerThread handlerThread = this.this$0.notificationsHandlerThread;
                    if (handlerThread == null) {
                        AbstractC2855l.y("notificationsHandlerThread");
                        handlerThread = null;
                    }
                    handlerThread.quit();
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.handling.NotificationsHandler$definition$lambda$3$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(NotificationBehaviorRecord.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(NotificationBehaviorRecord.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.handling.NotificationsHandler$definition$lambda$3$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(NotificationBehaviorRecord.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("handleNotificationAsync", new AsyncFunctionWithPromiseComponent("handleNotificationAsync", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.notifications.notifications.handling.NotificationsHandler$definition$lambda$3$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws NotificationWasAlreadyHandledException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    NotificationBehaviorRecord notificationBehaviorRecord = (NotificationBehaviorRecord) objArr[1];
                    this.$receiver$inlined.handleNotificationAsync((String) obj, notificationBehaviorRecord, promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NotificationWasAlreadyHandledException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
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
        Context reactContext = getAppContext().getReactContext();
        if (reactContext == null) {
            return;
        }
        INotificationContent content = notification.getNotificationRequest().getContent();
        if ((content instanceof RemoteNotificationContent) && ((RemoteNotificationContent) content).getIsDataOnly()) {
            return;
        }
        EventEmitter eventEmitter = getAppContext().eventEmitter(this);
        Handler handler = this.handler;
        if (handler == null) {
            AbstractC2855l.y("handler");
            handler = null;
        }
        SingleNotificationHandlerTask singleNotificationHandlerTask = new SingleNotificationHandlerTask(reactContext, eventEmitter, handler, notification, this);
        this.tasksMap.put(singleNotificationHandlerTask.getIdentifier(), singleNotificationHandlerTask);
        singleNotificationHandlerTask.start();
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationResponseIntentReceived(Bundle bundle) {
        NotificationListener.DefaultImpls.onNotificationResponseIntentReceived(this, bundle);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public boolean onNotificationResponseReceived(NotificationResponse notificationResponse) {
        return NotificationListener.DefaultImpls.onNotificationResponseReceived(this, notificationResponse);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationsDropped() {
        NotificationListener.DefaultImpls.onNotificationsDropped(this);
    }

    public final void onTaskFinished(SingleNotificationHandlerTask task) {
        AbstractC2855l.g(task, "task");
        this.tasksMap.remove(task.getIdentifier());
    }
}
