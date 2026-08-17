package expo.modules.notifications.notifications.channels;

import C7.o;
import android.app.NotificationChannelGroup;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.Promise;
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
import expo.modules.notifications.notifications.channels.NotificationsChannelProviderAccessor;
import expo.modules.notifications.notifications.channels.managers.NotificationsChannelGroupManager;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelGroupSerializer;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lexpo/modules/notifications/notifications/channels/NotificationChannelGroupManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/channels/NotificationsChannelProviderAccessor;", "<init>", "()V", "groupManager", "Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;", "getGroupManager", "()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;", "groupManager$delegate", "Lkotlin/Lazy;", "groupSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;", "getGroupSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;", "groupSerializer$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getNameFromOptions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "groupOptions", "Lexpo/modules/core/arguments/ReadableArguments;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationChannelGroupManagerModule extends Module implements NotificationsChannelProviderAccessor {

    /* JADX INFO: renamed from: groupManager$delegate, reason: from kotlin metadata */
    private final Lazy groupManager = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.e
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return NotificationChannelGroupManagerModule.groupManager_delegate$lambda$0(this.f26683g);
        }
    });

    /* JADX INFO: renamed from: groupSerializer$delegate, reason: from kotlin metadata */
    private final Lazy groupSerializer = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.f
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return NotificationChannelGroupManagerModule.groupSerializer_delegate$lambda$1(this.f26684g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelGroupManager getGroupManager() {
        return (NotificationsChannelGroupManager) this.groupManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelGroupSerializer getGroupSerializer() {
        return (NotificationsChannelGroupSerializer) this.groupSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNameFromOptions(ReadableArguments groupOptions) {
        String string = groupOptions.getString("name");
        AbstractC2855l.f(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelGroupManager groupManager_delegate$lambda$0(NotificationChannelGroupManagerModule notificationChannelGroupManagerModule) {
        return notificationChannelGroupManagerModule.getChannelProvider(notificationChannelGroupManagerModule.getAppContext().getRegistry()).getGroupManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelGroupSerializer groupSerializer_delegate$lambda$1(NotificationChannelGroupManagerModule notificationChannelGroupManagerModule) {
        return notificationChannelGroupManagerModule.getChannelProvider(notificationChannelGroupManagerModule.getAppContext().getRegistry()).getGroupSerializer();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoNotificationChannelGroupManager");
            if (AbstractC2855l.b(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationChannelGroupAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        NotificationChannelGroup notificationChannelGroup;
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT < 26 || (notificationChannelGroup = this.this$0.getGroupManager().getNotificationChannelGroup(str)) == null) {
                            return;
                        }
                        this.this$0.getGroupSerializer().toBundle(notificationChannelGroup);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getNotificationChannelGroupAsync", new AnyType[]{anyType}, new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        NotificationChannelGroup notificationChannelGroup;
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT < 26 || (notificationChannelGroup = this.this$0.getGroupManager().getNotificationChannelGroup(str)) == null) {
                            return null;
                        }
                        return this.this$0.getGroupSerializer().toBundle(notificationChannelGroup);
                    }
                });
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getNotificationChannelGroupAsync", untypedAsyncFunctionComponent);
            moduleDefinitionBuilder.getAsyncFunctions().put("getNotificationChannelGroupsAsync", new UntypedAsyncFunctionComponent("getNotificationChannelGroupsAsync", new AnyType[0], new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends Bundle> invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    List<NotificationChannelGroup> notificationChannelGroups = this.this$0.getGroupManager().getNotificationChannelGroups();
                    AbstractC2855l.f(notificationChannelGroups, "getNotificationChannelGroups(...)");
                    NotificationsChannelGroupSerializer groupSerializer = this.this$0.getGroupSerializer();
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(notificationChannelGroups, 10));
                    Iterator<T> it2 = notificationChannelGroups.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(groupSerializer.toBundle(androidx.core.app.o.a(it2.next())));
                    }
                    return arrayList;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ReadableArguments.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(ReadableArguments.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ReadableArguments.class);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setNotificationChannelGroupAsync", new UntypedAsyncFunctionComponent("setNotificationChannelGroupAsync", new AnyType[]{anyType2, anyType3}, new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Bundle invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[1];
                    String str = (String) obj;
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    NotificationChannelGroup notificationChannelGroupCreateNotificationChannelGroup = this.this$0.getGroupManager().createNotificationChannelGroup(str, this.this$0.getNameFromOptions(readableArguments), readableArguments);
                    NotificationsChannelGroupSerializer groupSerializer = this.this$0.getGroupSerializer();
                    AbstractC2855l.d(notificationChannelGroupCreateNotificationChannelGroup);
                    return groupSerializer.toBundle(notificationChannelGroupCreateNotificationChannelGroup);
                }
            }));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("deleteNotificationChannelGroupAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.this$0.getGroupManager().deleteNotificationChannelGroup(str);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$9
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr = {anyType4};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.this$0.getGroupManager().deleteNotificationChannelGroup(str);
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteNotificationChannelGroupAsync", intAsyncFunctionComponent);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelProviderAccessor
    public NotificationsChannelsProvider getChannelProvider(ModuleRegistry moduleRegistry) {
        return NotificationsChannelProviderAccessor.DefaultImpls.getChannelProvider(this, moduleRegistry);
    }
}
