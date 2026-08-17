package com.facebook.react.bridge;

import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006¢\u0006\u0002\u0010\rR\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "moduleInstances", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "getJavaScriptModule", "T", "instance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "JavaScriptModuleInvocationHandler", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<Class<? extends JavaScriptModule>, JavaScriptModule> moduleInstances = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getJSModuleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsModuleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getJSModuleName(Class<? extends JavaScriptModule> jsModuleInterface) {
            AbstractC2855l.g(jsModuleInterface, "jsModuleInterface");
            String simpleName = jsModuleInterface.getSimpleName();
            AbstractC2855l.d(simpleName);
            int iI0 = P8.q.i0(simpleName, '$', 0, false, 6, null);
            if (iI0 != -1) {
                AbstractC2855l.d(simpleName);
                simpleName = simpleName.substring(iI0 + 1);
                AbstractC2855l.f(simpleName, "substring(...)");
            }
            AbstractC2855l.d(simpleName);
            return simpleName;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "catalystInstance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "<init>", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)V", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getJSModuleName", "invoke", PointerEventHelper.POINTER_TYPE_UNKNOWN, "proxy", "method", "Ljava/lang/reflect/Method;", "args", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class JavaScriptModuleInvocationHandler implements InvocationHandler {
        private final CatalystInstance catalystInstance;
        private final Class<? extends JavaScriptModule> moduleInterface;
        private String name;

        public JavaScriptModuleInvocationHandler(CatalystInstance catalystInstance, Class<? extends JavaScriptModule> moduleInterface) {
            AbstractC2855l.g(catalystInstance, "catalystInstance");
            AbstractC2855l.g(moduleInterface, "moduleInterface");
            this.catalystInstance = catalystInstance;
            this.moduleInterface = moduleInterface;
            if (ReactBuildConfig.DEBUG) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator itA = AbstractC2845b.a(moduleInterface.getDeclaredMethods());
                while (itA.hasNext()) {
                    Method method = (Method) itA.next();
                    String name = method.getName();
                    AbstractC2855l.f(name, "getName(...)");
                    if (!linkedHashSet.add(name)) {
                        throw new AssertionError("Method overloading is unsupported: " + this.moduleInterface.getName() + "#" + method.getName());
                    }
                }
            }
        }

        private final String getJSModuleName() {
            String str = this.name;
            if (str != null) {
                return str;
            }
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.moduleInterface);
            this.name = jSModuleName;
            return jSModuleName;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            AbstractC2855l.g(proxy, "proxy");
            AbstractC2855l.g(method, "method");
            WritableNativeArray writableNativeArrayFromJavaArgs = args != null ? Arguments.fromJavaArgs(args) : new WritableNativeArray();
            CatalystInstance catalystInstance = this.catalystInstance;
            String jSModuleName = getJSModuleName();
            String name = method.getName();
            AbstractC2855l.f(name, "getName(...)");
            catalystInstance.callFunction(jSModuleName, name, writableNativeArrayFromJavaArgs);
            return null;
        }
    }

    public static final String getJSModuleName(Class<? extends JavaScriptModule> cls) {
        return INSTANCE.getJSModuleName(cls);
    }

    public final synchronized <T extends JavaScriptModule> T getJavaScriptModule(CatalystInstance instance, Class<T> moduleInterface) {
        AbstractC2855l.g(instance, "instance");
        AbstractC2855l.g(moduleInterface, "moduleInterface");
        T t10 = (T) this.moduleInstances.get(moduleInterface);
        if (t10 != null) {
            return t10;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(moduleInterface.getClassLoader(), new Class[]{moduleInterface}, new JavaScriptModuleInvocationHandler(instance, moduleInterface));
        AbstractC2855l.e(objNewProxyInstance, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule");
        T t11 = (T) objNewProxyInstance;
        this.moduleInstances.put((Class<? extends JavaScriptModule>) moduleInterface, t11);
        return t11;
    }
}
