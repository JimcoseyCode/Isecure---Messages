package expo.modules.notifications.notifications.presentation;

import C7.d;
import C7.o;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
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
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lkotlin/Function2;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "Li7/B;", "Lexpo/modules/notifications/ResultReceiverBody;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Landroid/os/ResultReceiver;", "createResultReceiver", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "dismissNotificationAsync", "(Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "dismissAllNotificationsAsync", "(Lexpo/modules/kotlin/Promise;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATIONS_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "serializeNotifications", "(Ljava/util/Collection;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoNotificationPresentationModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B dismissAllNotificationsAsync$lambda$4(Promise promise, int i10, Bundle bundle) {
        if (i10 == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            promise.reject("ERR_NOTIFICATIONS_DISMISSAL_FAILED", "Notifications could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B dismissNotificationAsync$lambda$3(Promise promise, int i10, Bundle bundle) {
        if (i10 == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            promise.reject("ERR_NOTIFICATION_DISMISSAL_FAILED", "Notification could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    protected final ResultReceiver createResultReceiver(Function2 body) {
        AbstractC2855l.g(body, "body");
        return UtilsKt.createDefaultResultReceiver(null, body);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Object obj;
        AnyTypeProvider anyTypeProvider;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoNotificationPresenter");
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getPresentedNotificationsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws Exceptions.ReactContextLost {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context context = this.this$0.getContext();
                        ExpoNotificationPresentationModule expoNotificationPresentationModule = this.this$0;
                        companion.getAllPresented(context, expoNotificationPresentationModule.createResultReceiver(new ExpoNotificationPresentationModule$definition$1$1$1(promise, expoNotificationPresentationModule)));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context context = this.this$0.getContext();
                        ExpoNotificationPresentationModule expoNotificationPresentationModule = this.this$0;
                        companion.getAllPresented(context, expoNotificationPresentationModule.createResultReceiver(new ExpoNotificationPresentationModule$definition$1$1$1(promise, expoNotificationPresentationModule)));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getPresentedNotificationsAsync", intAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType2 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyTypeProvider = anyTypeProvider2;
                obj = String.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            } else {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                obj = String.class;
                anyTypeProvider = anyTypeProvider2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("dismissNotificationAsync", new AsyncFunctionWithPromiseComponent("dismissNotificationAsync", new AnyType[]{anyType2}, new Function2() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    this.$receiver$inlined.dismissNotificationAsync((String) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("dismissAllNotificationsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.$receiver$inlined.dismissAllNotificationsAsync(promise);
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr2 = {anyType3};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.$receiver$inlined.dismissAllNotificationsAsync((Promise) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, obj) ? new StringAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("dismissAllNotificationsAsync", intAsyncFunctionComponent2);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    protected void dismissAllNotificationsAsync(final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        NotificationsService.INSTANCE.dismissAll(getContext(), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.presentation.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExpoNotificationPresentationModule.dismissAllNotificationsAsync$lambda$4(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected void dismissNotificationAsync(String identifier, final Promise promise) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(promise, "promise");
        NotificationsService.INSTANCE.dismiss(getContext(), new String[]{identifier}, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.presentation.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExpoNotificationPresentationModule.dismissNotificationAsync$lambda$3(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected List<Bundle> serializeNotifications(Collection<? extends Notification> notifications) {
        AbstractC2855l.g(notifications, "notifications");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(notifications, 10));
        Iterator<T> it = notifications.iterator();
        while (it.hasNext()) {
            arrayList.add(NotificationSerializer.toBundle((Notification) it.next()));
        }
        return arrayList;
    }
}
