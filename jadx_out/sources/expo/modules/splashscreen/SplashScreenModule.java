package expo.modules.splashscreen;

import C7.o;
import R8.A0;
import R8.AbstractC1417k;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lexpo/modules/splashscreen/SplashScreenModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "userControlledAutoHideEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-splash-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SplashScreenModule extends Module {
    private boolean userControlledAutoHideEnabled;

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoSplashScreen");
            AnyType[] anyTypeArr = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    this.this$0.userControlledAutoHideEnabled = true;
                    SplashScreenManager.INSTANCE.setPreventAutoHideCalled(true);
                    return Boolean.TRUE;
                }
            };
            Class cls = Integer.TYPE;
            boolean zB = AbstractC2855l.b(Boolean.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            moduleDefinitionBuilder.getAsyncFunctions().put("preventAutoHideAsync", zB ? new IntAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1) : AbstractC2855l.b(Boolean.class, cls4) ? new BoolAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1) : AbstractC2855l.b(Boolean.class, cls3) ? new DoubleAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1) : AbstractC2855l.b(Boolean.class, cls2) ? new FloatAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1) : AbstractC2855l.b(Boolean.class, String.class) ? new StringAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("preventAutoHideAsync", anyTypeArr, function1));
            AnyType[] anyTypeArr2 = new AnyType[0];
            Function1 function12 = new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$2
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    SplashScreenManager.INSTANCE.setPreventAutoHideCalled(true);
                    return C2735B.f28704a;
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("internalPreventAutoHideAsync", AbstractC2855l.b(C2735B.class, cls) ? new IntAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("internalPreventAutoHideAsync", anyTypeArr2, function12));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(SplashScreenOptions.class), Boolean.FALSE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(SplashScreenOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SplashScreenOptions.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr3 = {anyType};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(A0.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(A0.class));
                returnTypeProvider.getTypes().put(D.b(A0.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("setOptions", new SyncFunctionComponent("setOptions", anyTypeArr3, returnType, new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return AbstractC1417k.d(this.this$0.getAppContext().getMainQueue(), null, null, new SplashScreenModule$definition$1$3$1((SplashScreenOptions) objArr[0], null), 3, null);
                }
            }));
            AnyType[] anyTypeArr4 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("hide", new SyncFunctionComponent("hide", anyTypeArr4, returnType2, new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    SplashScreenManager.INSTANCE.hide();
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder.getAsyncFunctions().put("hideAsync", new UntypedAsyncFunctionComponent("hideAsync", new AnyType[0], new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    SplashScreenManager.INSTANCE.hide();
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder.getAsyncFunctions().put("internalMaybeHideAsync", new UntypedAsyncFunctionComponent("internalMaybeHideAsync", new AnyType[0], new Function1() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    if (!this.this$0.userControlledAutoHideEnabled) {
                        SplashScreenManager.INSTANCE.hide();
                    }
                    return C2735B.f28704a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.splashscreen.SplashScreenModule$definition$lambda$7$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m349invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m349invoke() {
                    SplashScreenManager.INSTANCE.unregisterContentAppearedListener();
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
}
