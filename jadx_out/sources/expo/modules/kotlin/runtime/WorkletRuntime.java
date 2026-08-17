package expo.modules.kotlin.runtime;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.WorkletRuntimeInstaller;
import expo.modules.kotlin.jni.worklets.WorkletNativeRuntime;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001eR\u001a\u0010/\u001a\u00020.8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/runtime/WorkletRuntime;", "Lexpo/modules/kotlin/runtime/Runtime;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isJSIContextInitialized", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "source", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "eval", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lkotlin/Function0;", "Li7/B;", "block", "schedule", "(Lw7/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "runtimePointer", "install$expo_modules_core_release", "(J)V", "install", "deallocate$expo_modules_core_release", "()V", "deallocate", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "Lexpo/modules/kotlin/jni/JSIContext;", "getJsiContext", "()Lexpo/modules/kotlin/jni/JSIContext;", "setJsiContext", "(Lexpo/modules/kotlin/jni/JSIContext;)V", "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "mWorkletNativeRuntime", "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "getMWorkletNativeRuntime$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "setMWorkletNativeRuntime$expo_modules_core_release", "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;)V", "appContextHolder", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "sharedObjectRegistry", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "getSharedObjectRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "classRegistry", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getClassRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "deallocator", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "getDeallocator$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/JNIDeallocator;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkletRuntime extends Runtime {
    private final WeakReference<AppContext> appContextHolder;
    private final ClassRegistry classRegistry;
    private final JNIDeallocator deallocator;
    public JSIContext jsiContext;
    private WorkletNativeRuntime mWorkletNativeRuntime;
    private final WeakReference<ReactApplicationContext> reactContextHolder;
    private final SharedObjectRegistry sharedObjectRegistry;

    public WorkletRuntime(AppContext appContext, WeakReference<ReactApplicationContext> reactContextHolder) {
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(reactContextHolder, "reactContextHolder");
        this.reactContextHolder = reactContextHolder;
        this.appContextHolder = UtilsKt.weak(appContext);
        this.sharedObjectRegistry = new SharedObjectRegistry(this);
        this.classRegistry = new ClassRegistry();
        this.deallocator = new JNIDeallocator(false, 1, null);
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

    /* JADX INFO: renamed from: getMWorkletNativeRuntime$expo_modules_core_release, reason: from getter */
    public final WorkletNativeRuntime getMWorkletNativeRuntime() {
        return this.mWorkletNativeRuntime;
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public ReactApplicationContext getReactContext() {
        return this.reactContextHolder.get();
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    /* JADX INFO: renamed from: getSharedObjectRegistry$expo_modules_core_release, reason: from getter */
    public SharedObjectRegistry getSharedObjectRegistry() {
        return this.sharedObjectRegistry;
    }

    public final void install$expo_modules_core_release(long runtimePointer) {
        synchronized (this) {
            if (isJSIContextInitialized()) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            AbstractC2861a.c("[ExpoModulesCore] " + (this + ".install on runtime " + runtimePointer));
            try {
                setMWorkletNativeRuntime$expo_modules_core_release(new WorkletNativeRuntime(runtimePointer));
                setJsiContext(new WorkletRuntimeInstaller(this).install(runtimePointer));
                CoreLoggerKt.getLogger().info("✅ JSI interop was installed");
                C2735B c2735b = C2735B.f28704a;
            } finally {
                AbstractC2861a.f();
            }
        }
    }

    @Override // expo.modules.kotlin.runtime.Runtime
    public void schedule(final InterfaceC3487a block) {
        AbstractC2855l.g(block, "block");
        ReactApplicationContext reactContext = getReactContext();
        if (reactContext != null) {
            reactContext.runOnJSQueueThread(new Runnable() { // from class: b7.b
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

    public final void setMWorkletNativeRuntime$expo_modules_core_release(WorkletNativeRuntime workletNativeRuntime) {
        this.mWorkletNativeRuntime = workletNativeRuntime;
    }
}
