package expo.modules.notifications.notifications.background;

import C7.o;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
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
import expo.modules.notifications.ModuleNotFoundException;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.K;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lexpo/modules/notifications/notifications/background/ExpoBackgroundNotificationTasksModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "taskManager", "Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "getTaskManager", "()Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "taskManager$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoBackgroundNotificationTasksModule extends Module {

    /* JADX INFO: renamed from: taskManager$delegate, reason: from kotlin metadata */
    private final Lazy taskManager = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.background.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoBackgroundNotificationTasksModule.taskManager_delegate$lambda$0(this.f26676g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskManagerInterface getTaskManager() {
        return (TaskManagerInterface) this.taskManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskManagerInterface taskManager_delegate$lambda$0(ExpoBackgroundNotificationTasksModule expoBackgroundNotificationTasksModule) throws ModuleNotFoundException {
        Object module;
        try {
            module = expoBackgroundNotificationTasksModule.getAppContext().getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        TaskManagerInterface taskManagerInterface = (TaskManagerInterface) module;
        if (taskManagerInterface != null) {
            return taskManagerInterface;
        }
        throw new ModuleNotFoundException(D.b(TaskManagerInterface.class));
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoBackgroundNotificationTasksModule");
            boolean zB = AbstractC2855l.b(String.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("registerTaskAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exception {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getTaskManager().registerTask((String) promise, BackgroundRemoteNotificationTaskConsumer.class, K.i());
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exception {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getTaskManager().registerTask((String) objArr[0], BackgroundRemoteNotificationTaskConsumer.class, K.i());
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("registerTaskAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("registerTaskAsync", intAsyncFunctionComponent);
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("unregisterTaskAsync", new AnyType[0], new Function2() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exception {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getTaskManager().unregisterTask((String) promise, BackgroundRemoteNotificationTaskConsumer.class);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                Function1 function12 = new Function1() { // from class: expo.modules.notifications.notifications.background.ExpoBackgroundNotificationTasksModule$definition$lambda$3$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exception {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getTaskManager().unregisterTask((String) objArr[0], BackgroundRemoteNotificationTaskConsumer.class);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("unregisterTaskAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("unregisterTaskAsync", intAsyncFunctionComponent2);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
