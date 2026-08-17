package expo.modules.kotlin.modules;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.EnumExtensionsKt;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.providers.AppContextProvider;
import expo.modules.kotlin.runtime.MainRuntime;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.AbstractC2746i;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\u0004\b\t\u0010\rJ5\u0010\t\u001a\u00020\b\"\u0012\b\u0000\u0010\u0010*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u0012JC\u0010\t\u001a\u00020\b\"\u0012\b\u0000\u0010\u0010*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R.\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b+\u0010%\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b2\u00103R\u0011\u00107\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0014\u0010:\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Landroid/os/Bundle;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Li7/B;", "sendEvent", "(Ljava/lang/String;Landroid/os/Bundle;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/String;Ljava/util/Map;)V", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", "enum", "(Ljava/lang/Enum;Landroid/os/Bundle;)V", "(Ljava/lang/Enum;Ljava/util/Map;)V", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "_appContextHolder", "Ljava/lang/ref/WeakReference;", "get_appContextHolder$expo_modules_core_release", "()Ljava/lang/ref/WeakReference;", "set_appContextHolder$expo_modules_core_release", "(Ljava/lang/ref/WeakReference;)V", "get_appContextHolder$expo_modules_core_release$annotations", "Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter$delegate", "Lkotlin/Lazy;", "getModuleEventEmitter", "()Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter", "Lkotlin/Lazy;", "LR8/N;", "coroutineScopeDelegate", "getCoroutineScopeDelegate", "()Lkotlin/Lazy;", "setCoroutineScopeDelegate", "(Lkotlin/Lazy;)V", "getCoroutineScopeDelegate$annotations", "Lexpo/modules/kotlin/runtime/Runtime;", "getRuntimeContext", "()Lexpo/modules/kotlin/runtime/Runtime;", "getRuntimeContext$annotations", "runtimeContext", "getRuntime", "runtime", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "registry", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Module implements AppContextProvider {
    public Lazy coroutineScopeDelegate;
    private WeakReference<AppContext> _appContextHolder = new WeakReference<>(null);

    /* JADX INFO: renamed from: moduleEventEmitter$delegate, reason: from kotlin metadata */
    private final Lazy moduleEventEmitter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return Module.moduleEventEmitter_delegate$lambda$2(this.f26616g);
        }
    });

    private final EventEmitter getModuleEventEmitter() {
        return (EventEmitter) this.moduleEventEmitter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventEmitter moduleEventEmitter_delegate$lambda$2(Module module) {
        return module.getAppContext().eventEmitter(module);
    }

    public static /* synthetic */ void sendEvent$default(Module module, String str, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i10 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        module.sendEvent(str, bundle);
    }

    public TypeConverterProvider converters() {
        return null;
    }

    public abstract ModuleDefinitionData definition();

    @Override // expo.modules.kotlin.providers.AppContextProvider
    public AppContext getAppContext() {
        AppContext appContext = this._appContextHolder.get();
        if (appContext != null) {
            return appContext;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public final Lazy getCoroutineScopeDelegate() {
        Lazy lazy = this.coroutineScopeDelegate;
        if (lazy != null) {
            return lazy;
        }
        AbstractC2855l.y("coroutineScopeDelegate");
        return null;
    }

    public final ModuleRegistry getRegistry() {
        return getAppContext().getRegistry();
    }

    public final Runtime getRuntime() {
        AppContext appContext = this._appContextHolder.get();
        MainRuntime runtime = appContext != null ? appContext.getRuntime() : null;
        if (runtime != null) {
            return runtime;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the hosting runtime.");
    }

    public final Runtime getRuntimeContext() {
        return getRuntime();
    }

    public final WeakReference<AppContext> get_appContextHolder$expo_modules_core_release() {
        return this._appContextHolder;
    }

    public final void sendEvent(String name, Bundle body) {
        AbstractC2855l.g(name, "name");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(name, body);
        }
    }

    public final void setCoroutineScopeDelegate(Lazy lazy) {
        AbstractC2855l.g(lazy, "<set-?>");
        this.coroutineScopeDelegate = lazy;
    }

    public final void set_appContextHolder$expo_modules_core_release(WeakReference<AppContext> weakReference) {
        AbstractC2855l.g(weakReference, "<set-?>");
        this._appContextHolder = weakReference;
    }

    public static /* synthetic */ void sendEvent$default(Module module, Enum r12, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i10 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        module.sendEvent(r12, bundle);
    }

    public final void sendEvent(String name, Map<String, ? extends Object> body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(name, body);
        }
    }

    public static /* synthetic */ void sendEvent$default(Module module, Enum r12, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        module.sendEvent(r12, map);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Landroid/os/Bundle;)V */
    public final void sendEvent(Enum r22, Bundle body) {
        AbstractC2855l.g(r22, "enum");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(EnumExtensionsKt.convertToString(r22), body);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;)V */
    public final void sendEvent(Enum r22, Map body) {
        AbstractC2855l.g(r22, "enum");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(EnumExtensionsKt.convertToString(r22), (Map<?, ?>) body);
        }
    }

    public static /* synthetic */ void getCoroutineScopeDelegate$annotations() {
    }

    public static /* synthetic */ void getRuntimeContext$annotations() {
    }

    public static /* synthetic */ void get_appContextHolder$expo_modules_core_release$annotations() {
    }
}
