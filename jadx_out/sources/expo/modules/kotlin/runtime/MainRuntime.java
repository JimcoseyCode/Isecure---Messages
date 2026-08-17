package expo.modules.kotlin.runtime;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.defaultmodules.CoreModule;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.MainRuntimeInstaller;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import i7.C2735B;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\"\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lexpo/modules/kotlin/runtime/MainRuntime;", "Lexpo/modules/kotlin/runtime/Runtime;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isJSIContextInitialized", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "source", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "eval", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lkotlin/Function0;", "Li7/B;", "block", "schedule", "(Lw7/a;)V", "install$expo_modules_core_release", "()V", "install", "deallocate$expo_modules_core_release", "deallocate", "Ljava/lang/ref/WeakReference;", "getReactContextHolder", "()Ljava/lang/ref/WeakReference;", "appContextHolder", "Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "Lexpo/modules/kotlin/jni/JSIContext;", "getJsiContext", "()Lexpo/modules/kotlin/jni/JSIContext;", "setJsiContext", "(Lexpo/modules/kotlin/jni/JSIContext;)V", "Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/defaultmodules/CoreModule;", "coreModule", "Lexpo/modules/kotlin/ModuleHolder;", "getCoreModule$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "deallocator", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "getDeallocator$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/JNIDeallocator;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "sharedObjectRegistry", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "getSharedObjectRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "classRegistry", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getClassRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainRuntime extends Runtime {
    private final WeakReference<AppContext> appContextHolder;
    private final ClassRegistry classRegistry;
    private final ModuleHolder<CoreModule> coreModule;
    private final JNIDeallocator deallocator;
    public JSIContext jsiContext;
    private final WeakReference<ReactApplicationContext> reactContextHolder;
    private final SharedObjectRegistry sharedObjectRegistry;

    public MainRuntime(AppContext appContext, WeakReference<ReactApplicationContext> reactContextHolder) {
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(reactContextHolder, "reactContextHolder");
        this.reactContextHolder = reactContextHolder;
        WeakReference<AppContext> weakReferenceWeak = UtilsKt.weak(appContext);
        this.appContextHolder = weakReferenceWeak;
        CoreModule coreModule = new CoreModule();
        coreModule.set_appContextHolder$expo_modules_core_release(weakReferenceWeak);
        this.coreModule = new ModuleHolder<>(coreModule, null);
        this.deallocator = new JNIDeallocator(false, 1, null);
        this.sharedObjectRegistry = new SharedObjectRegistry(this);
        this.classRegistry = new ClassRegistry();
    }

    private final boolean isJSIContextInitialized() {
        return this.jsiContext != null;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public void deallocate$expo_modules_core_release() {
        getDeallocator().deallocate$expo_modules_core_release();
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public JavaScriptValue eval(String source) {
        AbstractC2855l.g(source, "source");
        return getJsiContext().evaluateScript(source);
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public AppContext getAppContext() {
        return this.appContextHolder.get();
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    /* JADX INFO: renamed from: getClassRegistry$expo_modules_core_release, reason: from getter */
    public ClassRegistry getClassRegistry() {
        return this.classRegistry;
    }

    public final ModuleHolder<CoreModule> getCoreModule$expo_modules_core_release() {
        return this.coreModule;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    /* JADX INFO: renamed from: getDeallocator$expo_modules_core_release, reason: from getter */
    public JNIDeallocator getDeallocator() {
        return this.deallocator;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public JSIContext getJsiContext() {
        JSIContext jSIContext = this.jsiContext;
        if (jSIContext != null) {
            return jSIContext;
        }
        AbstractC2855l.y("jsiContext");
        return null;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public ReactApplicationContext getReactContext() {
        return this.reactContextHolder.get();
    }

    public final WeakReference<ReactApplicationContext> getReactContextHolder() {
        return this.reactContextHolder;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    /* JADX INFO: renamed from: getSharedObjectRegistry$expo_modules_core_release, reason: from getter */
    public SharedObjectRegistry getSharedObjectRegistry() {
        return this.sharedObjectRegistry;
    }

    /* JADX WARN: Finally extract failed */
    public final void install$expo_modules_core_release() {
        JavaScriptContextHolder javaScriptContextHolder;
        synchronized (this) {
            if (isJSIContextInitialized()) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            AbstractC2861a.c("[ExpoModulesCore] " + (this + ".install"));
            try {
                ReactApplicationContext reactApplicationContext = getReactContextHolder().get();
                if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                    Long lValueOf = Long.valueOf(javaScriptContextHolder.getContext());
                    if (lValueOf.longValue() == 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Logger.error$default(CoreLoggerKt.getLogger(), "❌ Cannot install JSI interop - JS runtime pointer is null", null, 2, null);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        MainRuntimeInstaller mainRuntimeInstaller = new MainRuntimeInstaller(this);
                        RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                        AbstractC2855l.d(runtimeExecutor);
                        setJsiContext(mainRuntimeInstaller.install(jLongValue, runtimeExecutor));
                        CoreLoggerKt.getLogger().info("✅ JSI interop was installed");
                    }
                }
            } catch (Throwable th) {
                try {
                    CoreLoggerKt.getLogger().error("❌ Cannot install JSI interop: " + th, th);
                } finally {
                    AbstractC2861a.f();
                }
            }
            C2735B c2735b = C2735B.f28704a;
        }
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public void schedule(final InterfaceC3487a block) {
        AbstractC2855l.g(block, "block");
        ReactApplicationContext reactContext = getReactContext();
        if (reactContext != null) {
            reactContext.runOnJSQueueThread(new Runnable() { // from class: b7.a
                @Override // java.lang.Runnable
                public final void run() {
                    block.invoke();
                }
            });
        }
    }

    public void setJsiContext(JSIContext jSIContext) {
        AbstractC2855l.g(jSIContext, "<set-?>");
        this.jsiContext = jSIContext;
    }
}
