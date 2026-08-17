package expo.modules.notifications.tokens;

import C7.o;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.messaging.FirebaseMessaging;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import expo.modules.notifications.tokens.interfaces.FirebaseTokenListener;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/notifications/tokens/PushTokenModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/google/firebase/messaging/FirebaseMessaging;", "getFirebaseMessagingInstance", "(Lexpo/modules/kotlin/Promise;)Lcom/google/firebase/messaging/FirebaseMessaging;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "token", "Li7/B;", "onNewToken", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushTokenModule extends Module implements FirebaseTokenListener {
    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseMessaging getFirebaseMessagingInstance(Promise promise) {
        try {
            return FirebaseMessaging.r();
        } catch (IllegalStateException e10) {
            promise.reject("E_REGISTRATION_FAILED", "Make sure to complete the guide at https://docs.expo.dev/push-notifications/fcm-credentials/ : " + e10.getMessage(), e10);
            return null;
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            final ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoPushTokenManager");
            moduleDefinitionBuilder.Events("onDevicePushToken");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m346invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m346invoke() {
                    FirebaseMessagingDelegate.INSTANCE.addTokenListener(this.this$0);
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m347invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m347invoke() {
                    FirebaseMessagingDelegate.INSTANCE.removeTokenListener(this.this$0);
                }
            }));
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getDevicePushTokenAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        FirebaseMessaging firebaseMessagingInstance = this.this$0.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance == null) {
                            return;
                        }
                        firebaseMessagingInstance.u().c(new PushTokenModule$definition$1$3$1(promise, moduleDefinitionBuilder, this.this$0));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        FirebaseMessaging firebaseMessagingInstance = this.this$0.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance != null) {
                            firebaseMessagingInstance.u().c(new PushTokenModule$definition$1$3$1(promise, moduleDefinitionBuilder, this.this$0));
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getDevicePushTokenAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getDevicePushTokenAsync", intAsyncFunctionComponent);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("unregisterForNotificationsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        FirebaseMessaging firebaseMessagingInstance = this.this$0.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance == null) {
                            return;
                        }
                        firebaseMessagingInstance.o().c(new PushTokenModule$definition$1$4$1(promise));
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.tokens.PushTokenModule$definition$lambda$5$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        FirebaseMessaging firebaseMessagingInstance = this.this$0.getFirebaseMessagingInstance(promise);
                        if (firebaseMessagingInstance != null) {
                            firebaseMessagingInstance.o().c(new PushTokenModule$definition$1$4$1(promise));
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("unregisterForNotificationsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("unregisterForNotificationsAsync", intAsyncFunctionComponent2);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    @Override // expo.modules.notifications.tokens.interfaces.FirebaseTokenListener
    public void onNewToken(String token) {
        AbstractC2855l.g(token, "token");
        try {
            C2752o.a aVar = C2752o.f28721h;
            sendEvent("onDevicePushToken", K.f(t.a("devicePushToken", token)));
            C2752o.b(C2735B.f28704a);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            C2752o.b(AbstractC2753p.a(th));
        }
    }
}
