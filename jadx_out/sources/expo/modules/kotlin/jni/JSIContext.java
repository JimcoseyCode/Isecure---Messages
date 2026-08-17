package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.exception.JavaScriptEvaluateException;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectId;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u00102\n\u0010)\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u0004\u0018\u00010\u00132\n\u0010)\u001a\u0006\u0012\u0002\b\u000300H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0004¢\u0006\u0004\b5\u0010\u0018J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u0018J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcom/facebook/jni/HybridData;", "mHybridData", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/runtime/Runtime;", "runtimeHolder", "<init>", "(Lcom/facebook/jni/HybridData;Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Li7/B;", "evaluateVoidScript", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasModule", "(Ljava/lang/String;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getJavaScriptModulesName", "()[Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "finalize", "close", "getHybridDataForJNIDeallocator", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "Ljava/lang/ref/WeakReference;", "getRuntimeHolder", "()Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class JSIContext implements Destructible, AutoCloseable {

    @DoNotStrip
    private final HybridData mHybridData;
    private final WeakReference<Runtime> runtimeHolder;

    @DoNotStrip
    public JSIContext(HybridData mHybridData, WeakReference<Runtime> runtimeHolder) {
        AbstractC2855l.g(mHybridData, "mHybridData");
        AbstractC2855l.g(runtimeHolder, "runtimeHolder");
        this.mHybridData = mHybridData;
        this.runtimeHolder = runtimeHolder;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final native JavaScriptObject createObject();

    @DoNotStrip
    public final void deleteSharedObject(int id) {
        SharedObjectRegistry sharedObjectRegistry;
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (sharedObjectRegistry = runtime.getSharedObjectRegistry()) == null) {
            return;
        }
        sharedObjectRegistry.m249deletekyJHjyY$expo_modules_core_release(SharedObjectId.m236constructorimpl(id));
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script) throws JavaScriptEvaluateException;

    public final native void evaluateVoidScript(String script) throws JavaScriptEvaluateException;

    protected final void finalize() throws Throwable {
        close();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    @DoNotStrip
    public final JavaScriptModuleObject_ getJavaScriptModuleObject(String name) {
        AppContext appContext;
        ModuleRegistry registry;
        ModuleHolder<?> moduleHolder;
        AbstractC2855l.g(name, "name");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null || (moduleHolder = registry.getModuleHolder(name)) == null) {
            return null;
        }
        return moduleHolder.getJsObject();
    }

    @DoNotStrip
    public final String[] getJavaScriptModulesName() {
        AppContext appContext;
        ModuleRegistry registry;
        Map<String, ModuleHolder<?>> registry2;
        Set<String> setKeySet;
        String[] strArr;
        Runtime runtime = this.runtimeHolder.get();
        return (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null || (registry2 = registry.getRegistry()) == null || (setKeySet = registry2.keySet()) == null || (strArr = (String[]) setKeySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    @DoNotStrip
    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        ClassRegistry classRegistry;
        AbstractC2855l.g(cls, "native");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (classRegistry = runtime.getClassRegistry()) == null) {
            return null;
        }
        return classRegistry.toJavaScriptObject$expo_modules_core_release(cls);
    }

    public final WeakReference<Runtime> getRuntimeHolder() {
        return this.runtimeHolder;
    }

    @DoNotStrip
    public final JavaScriptObject getSharedObject(int id) {
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null) {
            return null;
        }
        return SharedObjectId.m240toJavaScriptObjectNullimpl(SharedObjectId.m236constructorimpl(id), runtime);
    }

    public final native JavaScriptObject global();

    @DoNotStrip
    public final boolean hasModule(String name) {
        AppContext appContext;
        ModuleRegistry registry;
        AbstractC2855l.g(name, "name");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null) {
            return false;
        }
        return registry.hasModule(name);
    }

    @DoNotStrip
    public final void registerClass(Class<?> cls, JavaScriptObject js) {
        ClassRegistry classRegistry;
        AbstractC2855l.g(cls, "native");
        AbstractC2855l.g(js, "js");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (classRegistry = runtime.getClassRegistry()) == null) {
            return;
        }
        classRegistry.add$expo_modules_core_release(cls, js);
    }

    @DoNotStrip
    public final void registerSharedObject(Object obj, JavaScriptObject js) {
        SharedObjectRegistry sharedObjectRegistry;
        AbstractC2855l.g(obj, "native");
        AbstractC2855l.g(js, "js");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (sharedObjectRegistry = runtime.getSharedObjectRegistry()) == null) {
            return;
        }
        SharedObjectId.m235boximpl(sharedObjectRegistry.m248add5WKnsLU$expo_modules_core_release((SharedObject) obj, js));
    }

    public final native void setNativeStateForSharedObject(int id, JavaScriptObject js);
}
