package com.facebook.react.internal.turbomodule.core;

import P8.q;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\fJ;\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\nH\u0002¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014¨\u0006 "}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getMethodDescriptorsFromModule", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getMethodsFromModule", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/reflect/Method;", "(Lcom/facebook/react/bridge/NativeModule;)[Ljava/lang/reflect/Method;", "createJniSignature", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", "methodName", "paramClasses", "Ljava/lang/Class;", "returnClass", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;", "convertParamClassToJniType", "paramClass", "convertReturnClassToJniType", "convertClassToJniType", "cls", "getJsArgCount", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)I", "createJSIReturnKind", "MethodDescriptor", "ParsingException", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModuleInteropUtils {
    public static final TurboModuleInteropUtils INSTANCE = new TurboModuleInteropUtils();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "methodName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jniSignature", "jsiReturnKind", "jsArgCount", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {
        public final String jniSignature;
        public final int jsArgCount;
        public final String jsiReturnKind;
        public final String methodName;

        public MethodDescriptor(String methodName, String jniSignature, String jsiReturnKind, int i10) {
            AbstractC2855l.g(methodName, "methodName");
            AbstractC2855l.g(jniSignature, "jniSignature");
            AbstractC2855l.g(jsiReturnKind, "jsiReturnKind");
            this.methodName = methodName;
            this.jniSignature = jniSignature;
            this.jsiReturnKind = jsiReturnKind;
            this.jsArgCount = i10;
        }
    }

    private TurboModuleInteropUtils() {
    }

    private final String convertClassToJniType(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Class must have a canonical name");
        }
        return "L" + q.D(canonicalName, '.', '/', false, 4, null) + ";";
    }

    private final String convertParamClassToJniType(String moduleName, String methodName, Class<?> paramClass) {
        if (AbstractC2855l.b(paramClass, Boolean.TYPE)) {
            return "Z";
        }
        if (AbstractC2855l.b(paramClass, Integer.TYPE)) {
            return "I";
        }
        if (AbstractC2855l.b(paramClass, Double.TYPE)) {
            return "D";
        }
        if (AbstractC2855l.b(paramClass, Float.TYPE)) {
            return "F";
        }
        if (AbstractC2855l.b(paramClass, Boolean.class) || AbstractC2855l.b(paramClass, Integer.class) || AbstractC2855l.b(paramClass, Double.class) || AbstractC2855l.b(paramClass, Float.class) || AbstractC2855l.b(paramClass, String.class) || AbstractC2855l.b(paramClass, Callback.class) || AbstractC2855l.b(paramClass, Promise.class) || AbstractC2855l.b(paramClass, ReadableMap.class) || AbstractC2855l.b(paramClass, ReadableArray.class) || AbstractC2855l.b(paramClass, Dynamic.class)) {
            return convertClassToJniType(paramClass);
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JNI signature. Detected unsupported parameter class: " + paramClass.getCanonicalName());
    }

    private final String convertReturnClassToJniType(String moduleName, String methodName, Class<?> returnClass) {
        if (AbstractC2855l.b(returnClass, Boolean.TYPE)) {
            return "Z";
        }
        if (AbstractC2855l.b(returnClass, Integer.TYPE)) {
            return "I";
        }
        if (AbstractC2855l.b(returnClass, Double.TYPE)) {
            return "D";
        }
        if (AbstractC2855l.b(returnClass, Float.TYPE)) {
            return "F";
        }
        if (AbstractC2855l.b(returnClass, Void.TYPE)) {
            return "V";
        }
        if (AbstractC2855l.b(returnClass, Boolean.class) || AbstractC2855l.b(returnClass, Integer.class) || AbstractC2855l.b(returnClass, Double.class) || AbstractC2855l.b(returnClass, Float.class) || AbstractC2855l.b(returnClass, String.class) || AbstractC2855l.b(returnClass, WritableMap.class) || AbstractC2855l.b(returnClass, WritableArray.class) || AbstractC2855l.b(returnClass, Map.class)) {
            return convertClassToJniType(returnClass);
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JNI signature. Detected unsupported return class: " + returnClass.getCanonicalName());
    }

    private final String createJSIReturnKind(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        for (int i10 = 0; i10 < paramClasses.length; i10++) {
            if (AbstractC2855l.b(paramClasses[i10], Promise.class)) {
                if (i10 == paramClasses.length - 1) {
                    return "PromiseKind";
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
            }
        }
        if (AbstractC2855l.b(returnClass, Boolean.TYPE) || AbstractC2855l.b(returnClass, Boolean.class)) {
            return "BooleanKind";
        }
        if (AbstractC2855l.b(returnClass, Double.TYPE) || AbstractC2855l.b(returnClass, Double.class) || AbstractC2855l.b(returnClass, Float.TYPE) || AbstractC2855l.b(returnClass, Float.class) || AbstractC2855l.b(returnClass, Integer.TYPE) || AbstractC2855l.b(returnClass, Integer.class)) {
            return "NumberKind";
        }
        if (AbstractC2855l.b(returnClass, String.class)) {
            return "StringKind";
        }
        if (AbstractC2855l.b(returnClass, Void.TYPE)) {
            return "VoidKind";
        }
        if (AbstractC2855l.b(returnClass, WritableMap.class) || AbstractC2855l.b(returnClass, Map.class)) {
            return "ObjectKind";
        }
        if (AbstractC2855l.b(returnClass, WritableArray.class)) {
            return "ArrayKind";
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Detected unsupported return class: " + returnClass.getCanonicalName());
    }

    private final String createJniSignature(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : paramClasses) {
            sb.append(convertParamClassToJniType(moduleName, methodName, cls));
        }
        sb.append(")");
        sb.append(convertReturnClassToJniType(moduleName, methodName, returnClass));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    private final int getJsArgCount(String moduleName, String methodName, Class<?>[] paramClasses) {
        for (int i10 = 0; i10 < paramClasses.length; i10++) {
            if (AbstractC2855l.b(paramClasses[i10], Promise.class)) {
                if (i10 == paramClasses.length - 1) {
                    return paramClasses.length - 1;
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
            }
        }
        return paramClasses.length;
    }

    public static final List<MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
        AbstractC2855l.g(module, "module");
        Method[] methodsFromModule = INSTANCE.getMethodsFromModule(module);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Method method : methodsFromModule) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            String name = module.getName();
            AbstractC2855l.f(name, "getName(...)");
            String name2 = method.getName();
            if (reactMethod != null || AbstractC2855l.b("getConstants", name2)) {
                if (hashSet.contains(name2)) {
                    throw new ParsingException(name, "Module exports two methods to JavaScript with the same name: \"" + name2);
                }
                AbstractC2855l.d(name2);
                hashSet.add(name2);
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (AbstractC2855l.b("getConstants", name2)) {
                    if (!AbstractC2855l.b(returnType, Map.class)) {
                        throw new ParsingException(name, "getConstants must return a Map");
                    }
                } else if (reactMethod != null) {
                    boolean zIsBlockingSynchronousMethod = reactMethod.isBlockingSynchronousMethod();
                    Class cls = Void.TYPE;
                    if ((zIsBlockingSynchronousMethod && AbstractC2855l.b(returnType, cls)) || (!reactMethod.isBlockingSynchronousMethod() && !AbstractC2855l.b(returnType, cls))) {
                        throw new ParsingException(name, "TurboModule system assumes returnType == void iff the method is synchronous.");
                    }
                }
                TurboModuleInteropUtils turboModuleInteropUtils = INSTANCE;
                AbstractC2855l.d(parameterTypes);
                AbstractC2855l.d(returnType);
                arrayList.add(new MethodDescriptor(name2, turboModuleInteropUtils.createJniSignature(name, name2, parameterTypes, returnType), turboModuleInteropUtils.createJSIReturnKind(name, name2, parameterTypes, returnType), turboModuleInteropUtils.getJsArgCount(name, name2, parameterTypes)));
            }
        }
        return arrayList;
    }

    private final Method[] getMethodsFromModule(NativeModule module) {
        Class<?> cls = module.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            superclass = null;
        }
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC2855l.f(declaredMethods, "getDeclaredMethods(...)");
        return declaredMethods;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "methodName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ParsingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(String moduleName, String message) {
            super("Unable to parse @ReactMethod annotations from native module: " + moduleName + ". Details: " + message);
            AbstractC2855l.g(moduleName, "moduleName");
            AbstractC2855l.g(message, "message");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(String moduleName, String methodName, String message) {
            super("Unable to parse @ReactMethod annotation from native module method: " + moduleName + "." + methodName + "(). Details: " + message);
            AbstractC2855l.g(moduleName, "moduleName");
            AbstractC2855l.g(methodName, "methodName");
            AbstractC2855l.g(message, "message");
        }
    }
}
