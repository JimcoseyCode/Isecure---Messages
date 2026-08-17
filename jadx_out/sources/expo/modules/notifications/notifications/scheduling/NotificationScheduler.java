package expo.modules.notifications.notifications.scheduling;

import C7.d;
import C7.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.InvalidArgumentException;
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
import expo.modules.notifications.notifications.ArgumentsNotificationContentBuilder;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.notifications.model.NotificationContent;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.notifications.triggers.ChannelAwareTrigger;
import expo.modules.notifications.notifications.triggers.DailyTrigger;
import expo.modules.notifications.notifications.triggers.DateTrigger;
import expo.modules.notifications.notifications.triggers.MonthlyTrigger;
import expo.modules.notifications.notifications.triggers.TimeIntervalTrigger;
import expo.modules.notifications.notifications.triggers.WeeklyTrigger;
import expo.modules.notifications.notifications.triggers.YearlyTrigger;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lkotlin/Function2;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "Li7/B;", "Lexpo/modules/notifications/ResultReceiverBody;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Landroid/os/ResultReceiver;", "createResultReceiver", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "cancelScheduledNotificationAsync", "(Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "cancelAllScheduledNotificationsAsync", "(Lexpo/modules/kotlin/Promise;)V", "Lexpo/modules/core/arguments/ReadableArguments;", "params", "Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;", "triggerFromParams", "(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;", "Lexpo/modules/notifications/notifications/model/NotificationContent;", "content", "notificationTrigger", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "createNotificationRequest", "(Ljava/lang/String;Lexpo/modules/notifications/notifications/model/NotificationContent;Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;)Lexpo/modules/notifications/notifications/model/NotificationRequest;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requests", PointerEventHelper.POINTER_TYPE_UNKNOWN, "serializeScheduledNotificationRequests", "(Ljava/util/Collection;)Ljava/util/List;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/content/Context;", "getSchedulingContext", "()Landroid/content/Context;", "schedulingContext", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationScheduler extends Module {
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B cancelAllScheduledNotificationsAsync$lambda$6(Promise promise, int i10, Bundle bundle) {
        if (i10 == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            promise.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel all notifications.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B cancelScheduledNotificationAsync$lambda$5(Promise promise, int i10, Bundle bundle) {
        if (i10 == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            promise.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel notification.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return C2735B.f28704a;
    }

    public void cancelAllScheduledNotificationsAsync(final Promise promise) {
        AbstractC2855l.g(promise, "promise");
        NotificationsService.INSTANCE.removeAllScheduledNotifications(getSchedulingContext(), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.scheduling.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NotificationScheduler.cancelAllScheduledNotificationsAsync$lambda$6(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    public void cancelScheduledNotificationAsync(String identifier, final Promise promise) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(promise, "promise");
        NotificationsService.INSTANCE.removeScheduledNotification(getSchedulingContext(), identifier, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.scheduling.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NotificationScheduler.cancelScheduledNotificationAsync$lambda$5(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected NotificationRequest createNotificationRequest(String identifier, NotificationContent content, NotificationTrigger notificationTrigger) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(content, "content");
        return new NotificationRequest(identifier, content, notificationTrigger);
    }

    protected final ResultReceiver createResultReceiver(Function2 body) {
        AbstractC2855l.g(body, "body");
        return UtilsKt.createDefaultResultReceiver(this.handler, body);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        AsyncFunctionComponent intAsyncFunctionComponent;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Class cls2;
        AnyTypeProvider anyTypeProvider;
        Class cls3;
        Class cls4;
        Boolean bool;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoNotificationScheduler");
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls5 = Float.TYPE;
            Class cls6 = Double.TYPE;
            Class cls7 = Boolean.TYPE;
            Class cls8 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getAllScheduledNotificationsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.ReactContextLost {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context schedulingContext = this.this$0.getSchedulingContext();
                        NotificationScheduler notificationScheduler = this.this$0;
                        companion.getAllScheduledNotifications(schedulingContext, notificationScheduler.createResultReceiver(new NotificationScheduler$definition$1$1$1(promise, notificationScheduler)));
                    }
                });
                cls = ReadableArguments.class;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    cls = ReadableArguments.class;
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                } else {
                    cls = ReadableArguments.class;
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        Context schedulingContext = this.this$0.getSchedulingContext();
                        NotificationScheduler notificationScheduler = this.this$0;
                        companion.getAllScheduledNotifications(schedulingContext, notificationScheduler.createResultReceiver(new NotificationScheduler$definition$1$1$1(promise, notificationScheduler)));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls8) ? new IntAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls7) ? new BoolAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls6) ? new DoubleAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls5) ? new FloatAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getAllScheduledNotificationsAsync", intAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool2 = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool2));
            if (anyType2 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyTypeProvider = anyTypeProvider2;
                cls2 = String.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            } else {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                cls2 = String.class;
                anyTypeProvider = anyTypeProvider2;
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool2));
            if (anyType3 == null) {
                cls3 = cls5;
                anyType3 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ReadableArguments.class);
                    }
                }), converters2);
            } else {
                cls3 = cls5;
            }
            d dVarB2 = D.b(cls);
            Boolean bool3 = Boolean.TRUE;
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool3));
            if (anyType4 == null) {
                bool = bool3;
                cls4 = cls6;
                anyType4 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ReadableArguments.class);
                    }
                }), converters2);
            } else {
                cls4 = cls6;
                bool = bool3;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("scheduleNotificationAsync", new AsyncFunctionWithPromiseComponent("scheduleNotificationAsync", new AnyType[]{anyType2, anyType3, anyType4}, new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$4
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[2];
                    final String str = (String) obj;
                    try {
                        NotificationContent notificationContentBuild = new ArgumentsNotificationContentBuilder(this.this$0.getSchedulingContext()).setPayload((ReadableArguments) obj2).build();
                        NotificationScheduler notificationScheduler = this.this$0;
                        AbstractC2855l.d(notificationContentBuild);
                        NotificationsService.INSTANCE.schedule(this.this$0.getSchedulingContext(), notificationScheduler.createNotificationRequest(str, notificationContentBuild, this.this$0.triggerFromParams(readableArguments)), this.this$0.createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                invoke(((Number) obj3).intValue(), (Bundle) obj4);
                                return C2735B.f28704a;
                            }

                            public final void invoke(int i10, Bundle bundle) {
                                if (i10 == 0) {
                                    promise.resolve(str);
                                    return;
                                }
                                Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
                                Exception exc = serializable instanceof Exception ? (Exception) serializable : null;
                                promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + (exc != null ? exc.getMessage() : null), exc);
                            }
                        }));
                    } catch (InvalidArgumentException e10) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + e10.getMessage(), e10);
                    } catch (NullPointerException e11) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. Encountered unexpected null value. " + e11.getMessage(), e11);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("cancelScheduledNotificationAsync", new AsyncFunctionWithPromiseComponent("cancelScheduledNotificationAsync", new AnyType[]{anyType5}, new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    this.$receiver$inlined.cancelScheduledNotificationAsync((String) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("cancelAllScheduledNotificationsAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.$receiver$inlined.cancelAllScheduledNotificationsAsync(promise);
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool2));
                if (anyType6 == null) {
                    anyType6 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr2 = {anyType6};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.$receiver$inlined.cancelAllScheduledNotificationsAsync((Promise) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls8) ? new IntAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls7) ? new BoolAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new DoubleAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new FloatAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new StringAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("cancelAllScheduledNotificationsAsync", intAsyncFunctionComponent2);
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ReadableArguments.class);
                    }
                }), converters5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getNextTriggerDateAsync", new AsyncFunctionWithPromiseComponent("getNextTriggerDateAsync", new AnyType[]{anyType7}, new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$8
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    try {
                        NotificationTrigger notificationTriggerTriggerFromParams = this.this$0.triggerFromParams((ReadableArguments) objArr[0]);
                        if (notificationTriggerTriggerFromParams instanceof SchedulableNotificationTrigger) {
                            if (((SchedulableNotificationTrigger) notificationTriggerTriggerFromParams).nextTriggerDate() == null) {
                                promise.resolve((Object) null);
                                return;
                            } else {
                                promise.resolve(r5.getTime());
                                return;
                            }
                        }
                        String name = notificationTriggerTriggerFromParams == null ? "null" : notificationTriggerTriggerFromParams.getClass().getName();
                        H h10 = H.f29375a;
                        String str = String.format("It is not possible to get next trigger date for triggers other than calendar-based. Provided trigger resulted in %s trigger.", Arrays.copyOf(new Object[]{name}, 1));
                        AbstractC2855l.f(str, "format(...)");
                        promise.reject("ERR_NOTIFICATIONS_INVALID_CALENDAR_TRIGGER", str, null);
                    } catch (InvalidArgumentException e10) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. " + e10.getMessage(), e10);
                    } catch (NullPointerException e11) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. Encountered unexpected null value. " + e11.getMessage(), e11);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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

    protected Context getSchedulingContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    protected List<Bundle> serializeScheduledNotificationRequests(Collection<? extends NotificationRequest> requests) {
        AbstractC2855l.g(requests, "requests");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(requests, 10));
        Iterator<T> it = requests.iterator();
        while (it.hasNext()) {
            arrayList.add(NotificationSerializer.toBundle((NotificationRequest) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final NotificationTrigger triggerFromParams(ReadableArguments params) throws InvalidArgumentException {
        Number number;
        if (params == null) {
            return null;
        }
        String string = params.getString("channelId", null);
        String string2 = params.getString(NotificationsService.EVENT_TYPE_KEY);
        if (string2 != null) {
            switch (string2.hashCode()) {
                case -791707519:
                    if (string2.equals("weekly")) {
                        Object obj = params.get("weekday");
                        Number number2 = obj instanceof Number ? (Number) obj : null;
                        Object obj2 = params.get("hour");
                        Number number3 = obj2 instanceof Number ? (Number) obj2 : null;
                        Object obj3 = params.get("minute");
                        number = obj3 instanceof Number ? (Number) obj3 : null;
                        if (number2 == null || number3 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for weekly trigger.");
                        }
                        return new WeeklyTrigger(string, number2.intValue(), number3.intValue(), number.intValue());
                    }
                    break;
                case -734561654:
                    if (string2.equals("yearly")) {
                        Object obj4 = params.get("day");
                        Number number4 = obj4 instanceof Number ? (Number) obj4 : null;
                        Object obj5 = params.get("month");
                        Number number5 = obj5 instanceof Number ? (Number) obj5 : null;
                        Object obj6 = params.get("hour");
                        Number number6 = obj6 instanceof Number ? (Number) obj6 : null;
                        Object obj7 = params.get("minute");
                        number = obj7 instanceof Number ? (Number) obj7 : null;
                        if (number4 == null || number5 == null || number6 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for yearly trigger.");
                        }
                        return new YearlyTrigger(string, number4.intValue(), number5.intValue(), number6.intValue(), number.intValue());
                    }
                    break;
                case 3076014:
                    if (string2.equals("date")) {
                        Object obj8 = params.get("timestamp");
                        number = obj8 instanceof Number ? (Number) obj8 : null;
                        if (number != null) {
                            return new DateTrigger(string, number.longValue());
                        }
                        throw new InvalidArgumentException("Invalid value provided as date of trigger.");
                    }
                    break;
                case 95346201:
                    if (string2.equals("daily")) {
                        Object obj9 = params.get("hour");
                        Number number7 = obj9 instanceof Number ? (Number) obj9 : null;
                        Object obj10 = params.get("minute");
                        number = obj10 instanceof Number ? (Number) obj10 : null;
                        if (number7 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for daily trigger.");
                        }
                        return new DailyTrigger(string, number7.intValue(), number.intValue());
                    }
                    break;
                case 738950403:
                    if (string2.equals("channel")) {
                        return new ChannelAwareTrigger(string);
                    }
                    break;
                case 913014450:
                    if (string2.equals("timeInterval")) {
                        Object obj11 = params.get("seconds");
                        number = obj11 instanceof Number ? (Number) obj11 : null;
                        if (number != null) {
                            return new TimeIntervalTrigger(string, number.longValue(), params.getBoolean("repeats"), null, 8, null);
                        }
                        throw new InvalidArgumentException("Invalid value provided as interval of trigger.");
                    }
                    break;
                case 1236635661:
                    if (string2.equals("monthly")) {
                        Object obj12 = params.get("day");
                        Number number8 = obj12 instanceof Number ? (Number) obj12 : null;
                        Object obj13 = params.get("hour");
                        Number number9 = obj13 instanceof Number ? (Number) obj13 : null;
                        Object obj14 = params.get("minute");
                        number = obj14 instanceof Number ? (Number) obj14 : null;
                        if (number8 == null || number9 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for yearly trigger.");
                        }
                        return new MonthlyTrigger(string, number8.intValue(), number9.intValue(), number.intValue());
                    }
                    break;
            }
        }
        throw new InvalidArgumentException("Trigger of type: " + string2 + " is not supported on Android.");
    }
}
