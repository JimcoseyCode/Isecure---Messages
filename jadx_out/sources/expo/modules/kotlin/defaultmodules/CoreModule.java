package expo.modules.kotlin.defaultmodules;

import C7.d;
import C7.o;
import P8.q;
import R8.AbstractC1415j;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactDelegate;
import expo.modules.BuildConfig;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.KModuleEventEmitterWrapperKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.jni.JavaScriptArrayBuffer;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionBuilderKt;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.uuidv5.InvalidNamespaceException;
import expo.modules.kotlin.uuidv5.Uuidv5Kt;
import expo.modules.kotlin.views.CallbacksDefinition;
import expo.modules.kotlin.views.ViewManagerDefinition;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/CoreModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoreModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("expoModulesCoreVersion");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Map.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Map.class));
                returnTypeProvider.getTypes().put(D.b(Map.class), returnType);
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    List listG0 = q.G0((CharSequence) AbstractC2800q.e0(q.G0(BuildConfig.EXPO_MODULES_CORE_VERSION, new String[]{"-"}, false, 0, 6, null)), new String[]{"."}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(listG0, 10));
                    Iterator it2 = listG0.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    }
                    return K.l(t.a("version", BuildConfig.EXPO_MODULES_CORE_VERSION), t.a("major", Integer.valueOf(((Number) arrayList.get(0)).intValue())), t.a("minor", Integer.valueOf(((Number) arrayList.get(1)).intValue())), t.a("patch", Integer.valueOf(((Number) arrayList.get(2)).intValue())));
                }
            }));
            moduleDefinitionBuilder.getProperties().put("expoModulesCoreVersion", propertyComponentBuilder);
            PropertyComponentBuilder propertyComponentBuilder2 = new PropertyComponentBuilder("cacheDir");
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType2);
            }
            propertyComponentBuilder2.setGetter(new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Uri.fromFile(this.this$0.getContext().getCacheDir()) + "/";
                }
            }));
            moduleDefinitionBuilder.getProperties().put("cacheDir", propertyComponentBuilder2);
            PropertyComponentBuilder propertyComponentBuilder3 = new PropertyComponentBuilder("documentsDir");
            AnyType[] anyTypeArr3 = new AnyType[0];
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType3);
            }
            propertyComponentBuilder3.setGetter(new SyncFunctionComponent("get", anyTypeArr3, returnType3, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Uri.fromFile(this.this$0.getContext().getFilesDir()) + "/";
                }
            }));
            moduleDefinitionBuilder.getProperties().put("documentsDir", propertyComponentBuilder3);
            AnyType[] anyTypeArr4 = new AnyType[0];
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType4);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("uuidv4", new SyncFunctionComponent("uuidv4", anyTypeArr4, returnType4, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return UUID.randomUUID().toString();
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                cls = Object.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            } else {
                cls = Object.class;
            }
            AnyType[] anyTypeArr5 = {anyType, anyType2};
            ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType5);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("uuidv5", new SyncFunctionComponent("uuidv5", anyTypeArr5, returnType5, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws InvalidNamespaceException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) obj;
                    try {
                        UUID uuidFromString = UUID.fromString(str);
                        AbstractC2855l.d(uuidFromString);
                        return Uuidv5Kt.uuidv5(uuidFromString, str2).toString();
                    } catch (IllegalArgumentException unused) {
                        throw new InvalidNamespaceException(str);
                    }
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr6 = {anyType3, anyType4};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(D.b(Map.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(D.b(Map.class));
                returnTypeProvider.getTypes().put(D.b(Map.class), returnType6);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getViewConfig", new SyncFunctionComponent("getViewConfig", anyTypeArr6, returnType6, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    String[] names;
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    ModuleHolder<?> moduleHolder = this.this$0.getAppContext().getRegistry().getModuleHolder((String) obj);
                    LinkedHashMap linkedHashMap = null;
                    if (moduleHolder == null) {
                        return null;
                    }
                    Map<String, ViewManagerDefinition> viewManagerDefinitions = moduleHolder.getDefinition().getViewManagerDefinitions();
                    if (str == null) {
                        str = ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW;
                    }
                    ViewManagerDefinition viewManagerDefinition = viewManagerDefinitions.get(str);
                    if (viewManagerDefinition == null) {
                        return null;
                    }
                    Set<String> setKeySet = viewManagerDefinition.getProps$expo_modules_core_release().keySet();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(setKeySet, 10)), 16));
                    for (Object obj2 : setKeySet) {
                        linkedHashMap2.put(obj2, Boolean.TRUE);
                    }
                    CallbacksDefinition callbacksDefinition = viewManagerDefinition.getCallbacksDefinition();
                    if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
                        linkedHashMap = new LinkedHashMap(B7.d.d(K.e(names.length), 16));
                        for (String str2 : names) {
                            Pair pairA = t.a(KModuleEventEmitterWrapperKt.normalizeEventName(str2), K.f(t.a("registrationName", str2)));
                            linkedHashMap.put(pairA.c(), pairA.d());
                        }
                    }
                    return K.l(t.a("validAttributes", linkedHashMap2), t.a("directEventTypes", linkedHashMap));
                }
            }));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("reloadAppAsync", new AnyType[0], new Function2() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.MissingActivity {
                        ReactDelegate reactDelegate;
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Activity throwingActivity = this.this$0.getAppContext().getThrowingActivity();
                        ReactActivity reactActivity = throwingActivity instanceof ReactActivity ? (ReactActivity) throwingActivity : null;
                        if (reactActivity == null || (reactDelegate = reactActivity.getReactDelegate()) == null) {
                            return;
                        }
                        reactDelegate.reload();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.MissingActivity {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
                if (anyType5 == null) {
                    anyType5 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr7 = {anyType5};
                Function1 function1 = new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.MissingActivity {
                        ReactDelegate reactDelegate;
                        AbstractC2855l.g(objArr, "<destruct>");
                        Activity throwingActivity = this.this$0.getAppContext().getThrowingActivity();
                        ReactActivity reactActivity = throwingActivity instanceof ReactActivity ? (ReactActivity) throwingActivity : null;
                        if (reactActivity != null && (reactDelegate = reactActivity.getReactDelegate()) != null) {
                            reactDelegate.reload();
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1) : new UntypedAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("reloadAppAsync", intAsyncFunctionComponent);
            AnyType[] anyTypeArr8 = new AnyType[0];
            ReturnType returnType7 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType7 == null) {
                returnType7 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType7);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("installOnUIRuntime", new SyncFunctionComponent("installOnUIRuntime", anyTypeArr8, returnType7, new Function1() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    JavaScriptValue javaScriptValue = this.this$0.getAppContext().getRuntime().getJsiContext().global().get("_WORKLET_RUNTIME");
                    if (javaScriptValue == null) {
                        throw new IllegalStateException("UI Runtime is not available. Make sure you have Reanimated installed and imported in your project.");
                    }
                    javaScriptValue.isObject();
                    JavaScriptObject object = javaScriptValue.getObject();
                    object.isArrayBuffer();
                    JavaScriptArrayBuffer arrayBuffer = object.getArrayBuffer();
                    arrayBuffer.size();
                    AbstractC1415j.b(null, new CoreModule$definition$1$8$4(this.this$0, arrayBuffer.read8Byte(0), null), 1, null);
                    return C2735B.f28704a;
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
