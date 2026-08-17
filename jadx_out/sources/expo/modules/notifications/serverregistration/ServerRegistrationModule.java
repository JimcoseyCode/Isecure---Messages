package expo.modules.notifications.serverregistration;

import C7.o;
import android.content.Context;
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
import i7.AbstractC2746i;
import i7.C2735B;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\n\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lexpo/modules/notifications/serverregistration/ServerRegistrationModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "installationId", "Lexpo/modules/notifications/serverregistration/InstallationId;", "getInstallationId", "()Lexpo/modules/notifications/serverregistration/InstallationId;", "installationId$delegate", "Lkotlin/Lazy;", "mRegistrationInfo", "Lexpo/modules/notifications/serverregistration/RegistrationInfo;", "getMRegistrationInfo", "()Lexpo/modules/notifications/serverregistration/RegistrationInfo;", "mRegistrationInfo$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ServerRegistrationModule extends Module {

    /* JADX INFO: renamed from: installationId$delegate, reason: from kotlin metadata */
    private final Lazy installationId = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.serverregistration.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ServerRegistrationModule.installationId_delegate$lambda$0(this.f26696g);
        }
    });

    /* JADX INFO: renamed from: mRegistrationInfo$delegate, reason: from kotlin metadata */
    private final Lazy mRegistrationInfo = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.serverregistration.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ServerRegistrationModule.mRegistrationInfo_delegate$lambda$1(this.f26697g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final RegistrationInfo getMRegistrationInfo() {
        return (RegistrationInfo) this.mRegistrationInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallationId installationId_delegate$lambda$0(ServerRegistrationModule serverRegistrationModule) {
        return new InstallationId(serverRegistrationModule.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegistrationInfo mRegistrationInfo_delegate$lambda$1(ServerRegistrationModule serverRegistrationModule) {
        return new RegistrationInfo(serverRegistrationModule.getContext());
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("NotificationsServerRegistrationModule");
            AnyType[] anyTypeArr = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.notifications.serverregistration.ServerRegistrationModule$definition$lambda$4$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return this.$receiver$inlined.m345getInstallationId();
                }
            };
            Class cls = Integer.TYPE;
            boolean zB = AbstractC2855l.b(String.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            moduleDefinitionBuilder.getAsyncFunctions().put("getInstallationIdAsync", zB ? new IntAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls4) ? new BoolAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls3) ? new DoubleAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, cls2) ? new FloatAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getInstallationIdAsync", anyTypeArr, function1));
            moduleDefinitionBuilder.getAsyncFunctions().put("getRegistrationInfoAsync", new UntypedAsyncFunctionComponent("getRegistrationInfoAsync", new AnyType[0], new Function1() { // from class: expo.modules.notifications.serverregistration.ServerRegistrationModule$definition$lambda$4$$inlined$AsyncFunction$2
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return this.this$0.getMRegistrationInfo().get();
                }
            }));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("setRegistrationInfoAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.serverregistration.ServerRegistrationModule$definition$lambda$4$$inlined$AsyncFunction$3
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getMRegistrationInfo().set((String) promise);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.notifications.serverregistration.ServerRegistrationModule$definition$lambda$4$$inlined$AsyncFunction$4
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.f(String.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr2 = {anyType};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.serverregistration.ServerRegistrationModule$definition$lambda$4$$inlined$AsyncFunction$5
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getMRegistrationInfo().set((String) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("setRegistrationInfoAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setRegistrationInfoAsync", intAsyncFunctionComponent);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    protected final InstallationId getInstallationId() {
        return (InstallationId) this.installationId.getValue();
    }

    /* JADX INFO: renamed from: getInstallationId, reason: collision with other method in class */
    public String m345getInstallationId() {
        String orCreateUUID = getInstallationId().getOrCreateUUID();
        AbstractC2855l.f(orCreateUUID, "getOrCreateUUID(...)");
        return orCreateUUID;
    }
}
