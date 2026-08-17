package expo.modules.kotlin.jni.decorators;

import C7.d;
import C7.e;
import C7.o;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.classcomponent.ClassDefinitionData;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.jni.Destructible;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import expo.modules.kotlin.modules.ModuleDefinitionBuilderKt;
import expo.modules.kotlin.objects.ConstantComponent;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponent;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\f\u0010\rJF\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 ¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u001cH\u0086 ¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0086 ¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010'H\u0086 ¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\b+\u0010,J\\\u00102\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010/2\u0006\u00101\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 ¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0004¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\bJ\u0011\u0010:\u001a\u00020\u000b*\u000209¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u000b*\u0002092\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u000b*\u0002092\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bA\u0010BJ'\u0010G\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u00020\u000b*\u00020D2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020\u000b*\u00020D2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bK\u0010LJ5\u0010P\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bP\u0010QJ1\u0010T\u001a\u00020\u000b*\u00020N2\u0006\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/NativeMap;", "constants", "Li7/B;", "registerConstants", "(Lcom/facebook/react/bridge/NativeMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "takesOwner", "enumerable", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/ExpectedType;", "desiredTypes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cppReturnType", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "registerSyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;ILexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "registerAsyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "registerProperty", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;", "registerConstant", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;)V", "jsDecoratorsBridgingObject", "registerObject", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "prototypeDecorator", "constructorDecorator", "Ljava/lang/Class;", "ownerClass", "isSharedRef", "registerClass", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;ZLjava/lang/Class;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "registerModuleName", "(Ljava/lang/String;)V", "finalize", "()V", "getHybridDataForJNIDeallocator", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "exportConstants", "(Lexpo/modules/kotlin/objects/ObjectDefinitionData;)V", "objectName", "Lexpo/modules/kotlin/AppContext;", "appContext", "exportFunctions", "(Lexpo/modules/kotlin/objects/ObjectDefinitionData;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)V", "exportProperties", "(Lexpo/modules/kotlin/objects/ObjectDefinitionData;Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "Lexpo/modules/kotlin/runtime/Runtime;", "runtime", "exportClasses", "(Ljava/util/List;Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/runtime/Runtime;)V", "exportClass", "(Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/runtime/Runtime;)V", "exportStaticFunctions", "(Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "modulesName", "exportViewPrototypes", "(Ljava/util/Map;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/runtime/Runtime;)V", "moduleName", "viewKey", "exportViewPrototype", "(Lexpo/modules/kotlin/views/ViewManagerDefinition;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/runtime/Runtime;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSDecoratorsBridgingObject implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;

    public JSDecoratorsBridgingObject(JNIDeallocator jniDeallocator) {
        AbstractC2855l.g(jniDeallocator, "jniDeallocator");
        this.mHybridData = initHybrid();
        jniDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object registerModuleName$lambda$0(String str, Object[] it) {
        AbstractC2855l.g(it, "it");
        return str;
    }

    public final void exportClass(ClassDefinitionData classDefinitionData, AppContext appContext, Runtime runtime) {
        AbstractC2855l.g(classDefinitionData, "<this>");
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(runtime, "runtime");
        AbstractC2861a.c("[ExpoModulesCore] " + ("Attaching class " + classDefinitionData.getName()));
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.getDeallocator());
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(runtime.getDeallocator());
            jSDecoratorsBridgingObject.exportConstants(classDefinitionData.getObjectDefinition());
            jSDecoratorsBridgingObject.exportFunctions(classDefinitionData.getObjectDefinition(), classDefinitionData.getName(), appContext);
            jSDecoratorsBridgingObject.exportProperties(classDefinitionData.getObjectDefinition(), appContext);
            jSDecoratorsBridgingObject2.exportStaticFunctions(classDefinitionData, classDefinitionData.getName(), appContext);
            SyncFunctionComponent constructor = classDefinitionData.getConstructor();
            o ownerType = constructor.getOwnerType();
            e classifier = ownerType != null ? ownerType.getClassifier() : null;
            d dVar = classifier instanceof d ? (d) classifier : null;
            registerClass(classDefinitionData.getName(), jSDecoratorsBridgingObject, jSDecoratorsBridgingObject2, constructor.getTakesOwner$expo_modules_core_release(), dVar != null ? AbstractC3430a.b(dVar) : null, classDefinitionData.getIsSharedRef(), (ExpectedType[]) constructor.getCppRequiredTypes$expo_modules_core_release().toArray(new ExpectedType[0]), constructor.getJNIFunctionBody$expo_modules_core_release(classDefinitionData.getName(), appContext));
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void exportClasses(List<ClassDefinitionData> list, AppContext appContext, Runtime runtime) {
        AbstractC2855l.g(list, "<this>");
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(runtime, "runtime");
        if (list.isEmpty()) {
            return;
        }
        AbstractC2861a.c("[ExpoModulesCore] Attaching classes");
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                exportClass((ClassDefinitionData) it.next(), appContext, runtime);
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void exportConstants(ObjectDefinitionData objectDefinitionData) {
        AbstractC2855l.g(objectDefinitionData, "<this>");
        Map map = (Map) objectDefinitionData.getLegacyConstantsProvider().invoke();
        if (objectDefinitionData.getConstants().isEmpty() && map.isEmpty()) {
            return;
        }
        AbstractC2861a.c("[ExpoModulesCore] Exporting constants");
        try {
            if (!map.isEmpty()) {
                registerConstants(Arguments.makeNativeMap((Map<String, ? extends Object>) map));
            }
            Iterator<Map.Entry<String, ConstantComponent>> it = objectDefinitionData.getConstants().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().attachToJSObject(this);
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void exportFunctions(ObjectDefinitionData objectDefinitionData, String objectName, AppContext appContext) {
        AbstractC2855l.g(objectDefinitionData, "<this>");
        AbstractC2855l.g(objectName, "objectName");
        AbstractC2855l.g(appContext, "appContext");
        ConcatIterator<AnyFunction> functions = objectDefinitionData.getFunctions();
        if (functions.hasNext()) {
            AbstractC2861a.c("[ExpoModulesCore] Attaching functions");
            while (functions.hasNext()) {
                try {
                    functions.next().attachToJSObject(appContext, this, objectName);
                } catch (Throwable th) {
                    AbstractC2861a.f();
                    throw th;
                }
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        }
    }

    public final void exportProperties(ObjectDefinitionData objectDefinitionData, AppContext appContext) {
        AbstractC2855l.g(objectDefinitionData, "<this>");
        AbstractC2855l.g(appContext, "appContext");
        if (objectDefinitionData.getProperties().isEmpty()) {
            return;
        }
        AbstractC2861a.c("[ExpoModulesCore] Attaching properties");
        try {
            Iterator<Map.Entry<String, PropertyComponent>> it = objectDefinitionData.getProperties().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().attachToJSObject(appContext, this);
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void exportStaticFunctions(ClassDefinitionData classDefinitionData, String objectName, AppContext appContext) {
        AbstractC2855l.g(classDefinitionData, "<this>");
        AbstractC2855l.g(objectName, "objectName");
        AbstractC2855l.g(appContext, "appContext");
        ConcatIterator<AnyFunction> staticFunctions = classDefinitionData.getStaticFunctions();
        if (staticFunctions.hasNext()) {
            AbstractC2861a.c("[ExpoModulesCore] Attaching static functions");
            while (staticFunctions.hasNext()) {
                try {
                    staticFunctions.next().attachToJSObject(appContext, this, objectName);
                } catch (Throwable th) {
                    AbstractC2861a.f();
                    throw th;
                }
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        }
    }

    public final void exportViewPrototype(ViewManagerDefinition viewManagerDefinition, String moduleName, String viewKey, AppContext appContext, Runtime runtime) {
        AbstractC2855l.g(viewManagerDefinition, "<this>");
        AbstractC2855l.g(moduleName, "moduleName");
        AbstractC2855l.g(viewKey, "viewKey");
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(runtime, "runtime");
        List<BaseAsyncFunctionComponent> asyncFunctions = viewManagerDefinition.getAsyncFunctions();
        if (asyncFunctions.isEmpty()) {
            return;
        }
        AbstractC2861a.c("[ExpoModulesCore] " + ("Attaching view prototype for " + viewManagerDefinition.getName()));
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.getDeallocator());
            Iterator<T> it = asyncFunctions.iterator();
            while (it.hasNext()) {
                ((BaseAsyncFunctionComponent) it.next()).attachToJSObject(appContext, jSDecoratorsBridgingObject, viewManagerDefinition.getName());
            }
            if (!AbstractC2855l.b(viewKey, ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW)) {
                moduleName = moduleName + "_" + viewManagerDefinition.getName();
            }
            registerObject(moduleName, jSDecoratorsBridgingObject);
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void exportViewPrototypes(Map<String, ViewManagerDefinition> map, String modulesName, AppContext appContext, Runtime runtime) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(modulesName, "modulesName");
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(runtime, "runtime");
        if (map.isEmpty()) {
            return;
        }
        AbstractC2861a.c("[ExpoModulesCore] Attaching view prototypes");
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.getDeallocator());
            for (Map.Entry<String, ViewManagerDefinition> entry : map.entrySet()) {
                String str = modulesName;
                AppContext appContext2 = appContext;
                Runtime runtime2 = runtime;
                jSDecoratorsBridgingObject.exportViewPrototype(entry.getValue(), str, entry.getKey(), appContext2, runtime2);
                modulesName = str;
                appContext = appContext2;
                runtime = runtime2;
            }
            registerObject("ViewPrototypes", jSDecoratorsBridgingObject);
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final native void registerAsyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, JNIAsyncFunctionBody body);

    public final native void registerClass(String name, JSDecoratorsBridgingObject prototypeDecorator, JSDecoratorsBridgingObject constructorDecorator, boolean takesOwner, Class<?> ownerClass, boolean isSharedRef, ExpectedType[] desiredTypes, JNIFunctionBody body);

    public final native void registerConstant(String name, JNINoArgsFunctionBody getter);

    public final native void registerConstants(NativeMap constants);

    public final void registerModuleName(final String name) {
        AbstractC2855l.g(name, "name");
        registerProperty("__expo_module_name__", false, new ExpectedType[0], new JNIFunctionBody() { // from class: expo.modules.kotlin.jni.decorators.a
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return JSDecoratorsBridgingObject.registerModuleName$lambda$0(name, objArr);
            }
        }, false, new ExpectedType[0], null);
    }

    public final native void registerObject(String name, JSDecoratorsBridgingObject jsDecoratorsBridgingObject);

    public final native void registerProperty(String name, boolean getterTakesOwner, ExpectedType[] getterExpectedType, JNIFunctionBody getter, boolean setterTakesOwner, ExpectedType[] setterExpectedType, JNIFunctionBody setter);

    public final native void registerSyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, int cppReturnType, JNIFunctionBody body);
}
