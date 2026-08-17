package expo.modules.keepawake;

import C7.o;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lexpo/modules/keepawake/KeepAwakeModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "keepAwakeManager", "Lexpo/modules/keepawake/ExpoKeepAwakeManager;", "getKeepAwakeManager", "()Lexpo/modules/keepawake/ExpoKeepAwakeManager;", "keepAwakeManager$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-keep-awake_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeepAwakeModule extends Module {

    /* JADX INFO: renamed from: keepAwakeManager$delegate, reason: from kotlin metadata */
    private final Lazy keepAwakeManager = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.keepawake.c
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return KeepAwakeModule.keepAwakeManager_delegate$lambda$0(this.f26565g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpoKeepAwakeManager getKeepAwakeManager() {
        return (ExpoKeepAwakeManager) this.keepAwakeManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExpoKeepAwakeManager keepAwakeManager_delegate$lambda$0(KeepAwakeModule keepAwakeModule) {
        return new ExpoKeepAwakeManager(keepAwakeModule.getAppContext());
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoKeepAwake");
            boolean zB = AbstractC2855l.b(String.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("activate", new AnyType[0], new Function2() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.AppContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getKeepAwakeManager().activate((String) promise);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.AppContextLost {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.AppContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getKeepAwakeManager().activate((String) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("activate", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("activate", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("activate", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("activate", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("activate", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("activate", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("activate", intAsyncFunctionComponent);
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("deactivate", new AnyType[0], new Function2() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.AppContextLost {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.getKeepAwakeManager().deactivate((String) promise);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.AppContextLost {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                Function1 function12 = new Function1() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.AppContextLost {
                        AbstractC2855l.g(objArr, "<destruct>");
                        this.this$0.getKeepAwakeManager().deactivate((String) objArr[0]);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls4) ? new IntAsyncFunctionComponent("deactivate", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new BoolAsyncFunctionComponent("deactivate", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new DoubleAsyncFunctionComponent("deactivate", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls) ? new FloatAsyncFunctionComponent("deactivate", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("deactivate", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("deactivate", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deactivate", intAsyncFunctionComponent2);
            AnyType[] anyTypeArr3 = new AnyType[0];
            Function1 function13 = new Function1() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$4$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.valueOf(this.this$0.getKeepAwakeManager().isActivated());
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("isActivated", AbstractC2855l.b(Boolean.class, cls4) ? new IntAsyncFunctionComponent("isActivated", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls3) ? new BoolAsyncFunctionComponent("isActivated", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls2) ? new DoubleAsyncFunctionComponent("isActivated", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, cls) ? new FloatAsyncFunctionComponent("isActivated", anyTypeArr3, function13) : AbstractC2855l.b(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isActivated", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("isActivated", anyTypeArr3, function13));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
