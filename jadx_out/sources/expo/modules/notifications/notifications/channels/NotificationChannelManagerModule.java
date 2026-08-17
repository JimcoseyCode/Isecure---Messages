package expo.modules.notifications.notifications.channels;

import C7.o;
import android.app.NotificationChannel;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.logging.Logger;
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
import expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.notifications.enums.NotificationImportance;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0003R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lexpo/modules/notifications/notifications/channels/NotificationChannelManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/channels/NotificationsChannelProviderAccessor;", "<init>", "()V", "channelManager", "Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;", "getChannelManager", "()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;", "channelManager$delegate", "Lkotlin/Lazy;", "channelSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;", "getChannelSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;", "channelSerializer$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getNameFromOptions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "channelOptions", "Lexpo/modules/core/arguments/ReadableArguments;", "getImportanceFromOptions", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationChannelManagerModule extends Module implements NotificationsChannelProviderAccessor {

    /* JADX INFO: renamed from: channelManager$delegate, reason: from kotlin metadata */
    private final Lazy channelManager = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.g
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return NotificationChannelManagerModule.channelManager_delegate$lambda$0(this.f26685g);
        }
    });

    /* JADX INFO: renamed from: channelSerializer$delegate, reason: from kotlin metadata */
    private final Lazy channelSerializer = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.h
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return NotificationChannelManagerModule.channelSerializer_delegate$lambda$1(this.f26686g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelManager channelManager_delegate$lambda$0(NotificationChannelManagerModule notificationChannelManagerModule) {
        return notificationChannelManagerModule.getChannelProvider(notificationChannelManagerModule.getAppContext().getRegistry()).getChannelManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelSerializer channelSerializer_delegate$lambda$1(NotificationChannelManagerModule notificationChannelManagerModule) {
        return notificationChannelManagerModule.getChannelProvider(notificationChannelManagerModule.getAppContext().getRegistry()).getChannelSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelManager getChannelManager() {
        return (NotificationsChannelManager) this.channelManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelSerializer getChannelSerializer() {
        return (NotificationsChannelSerializer) this.channelSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImportanceFromOptions(ReadableArguments channelOptions) {
        NotificationImportance notificationImportanceFromEnumValue = NotificationImportance.fromEnumValue(channelOptions.getInt("importance", NotificationImportance.DEFAULT.getEnumValue()));
        Objects.requireNonNull(notificationImportanceFromEnumValue);
        return notificationImportanceFromEnumValue.getNativeValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getNameFromOptions(ReadableArguments channelOptions) {
        String string = channelOptions.getString("name");
        AbstractC2855l.f(string, "getString(...)");
        return string;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        Class cls;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        AnyTypeProvider anyTypeProvider;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoNotificationChannelManager");
            AnyType[] anyTypeArr = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends Bundle> invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    if (Build.VERSION.SDK_INT < 26) {
                        return AbstractC2800q.j();
                    }
                    List<NotificationChannel> notificationChannels = this.this$0.getChannelManager().getNotificationChannels();
                    AbstractC2855l.f(notificationChannels, "getNotificationChannels(...)");
                    NotificationsChannelSerializer channelSerializer = this.this$0.getChannelSerializer();
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(notificationChannels, 10));
                    Iterator<T> it2 = notificationChannels.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(channelSerializer.toBundle(i.a(it2.next())));
                    }
                    return arrayList;
                }
            };
            Class cls2 = Integer.TYPE;
            boolean zB = AbstractC2855l.b(List.class, cls2);
            Class cls3 = Float.TYPE;
            Class cls4 = Double.TYPE;
            Class cls5 = Boolean.TYPE;
            moduleDefinitionBuilder2.getAsyncFunctions().put("getNotificationChannelsAsync", zB ? new IntAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : AbstractC2855l.b(List.class, cls5) ? new BoolAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : AbstractC2855l.b(List.class, cls4) ? new DoubleAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : AbstractC2855l.b(List.class, cls3) ? new FloatAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : AbstractC2855l.b(List.class, String.class) ? new StringAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationChannelAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        NotificationChannel notificationChannel;
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = this.this$0.getChannelManager().getNotificationChannel(str)) == null) {
                            return;
                        }
                        this.this$0.getChannelSerializer().toBundle(notificationChannel);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$3
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getNotificationChannelAsync", new AnyType[]{anyType}, new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        NotificationChannel notificationChannel;
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = this.this$0.getChannelManager().getNotificationChannel(str)) == null) {
                            return null;
                        }
                        return this.this$0.getChannelSerializer().toBundle(notificationChannel);
                    }
                });
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getNotificationChannelAsync", untypedAsyncFunctionComponent);
            TypeConverterProvider converters2 = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType2 == null) {
                cls = ReadableArguments.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            } else {
                cls = ReadableArguments.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            }
            AnyType anyType3 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType3 == null) {
                NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$6 notificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$6 = new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ReadableArguments.class);
                    }
                };
                C7.d dVarB2 = D.b(cls);
                anyTypeProvider = anyTypeProvider2;
                anyType3 = new AnyType(new LazyKType(dVarB2, false, notificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$6), converters2);
            } else {
                anyTypeProvider = anyTypeProvider2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setNotificationChannelAsync", new UntypedAsyncFunctionComponent("setNotificationChannelAsync", new AnyType[]{anyType2, anyType3}, new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Bundle invoke(Object[] objArr) {
                    Logger jsLogger;
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[1];
                    String str = (String) obj;
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    if (!this.this$0.getChannelManager().customSoundExists(readableArguments) && (jsLogger = this.this$0.getAppContext().getJsLogger()) != null) {
                        Logger.error$default(jsLogger, "expo-notifications: Custom sound '" + readableArguments.getString("sound", null) + "' not found in native app. Make sure the sound file (e.g. 'custom_sound.wav') is included in the expo-notifications config plugin sounds array in app config.", null, 2, null);
                    }
                    NotificationChannel notificationChannelCreateNotificationChannel = this.this$0.getChannelManager().createNotificationChannel(str, this.this$0.getNameFromOptions(readableArguments), this.this$0.getImportanceFromOptions(readableArguments), readableArguments);
                    NotificationsChannelSerializer channelSerializer = this.this$0.getChannelSerializer();
                    AbstractC2855l.d(notificationChannelCreateNotificationChannel);
                    return channelSerializer.toBundle(notificationChannelCreateNotificationChannel);
                }
            }));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("deleteNotificationChannelAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.this$0.getChannelManager().deleteNotificationChannel(str);
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
                    anyType4 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$9
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr2 = {anyType4};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.this$0.getChannelManager().deleteNotificationChannel(str);
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls2) ? new IntAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls5) ? new BoolAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new DoubleAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new FloatAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteNotificationChannelAsync", intAsyncFunctionComponent);
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
