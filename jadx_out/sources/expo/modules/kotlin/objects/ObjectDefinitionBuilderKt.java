package expo.modules.kotlin.objects;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Li7/B;", "block", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Object", "(Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/modules/Module;", "(Lexpo/modules/kotlin/modules/Module;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ObjectDefinitionBuilderKt {
    public static final JavaScriptModuleObject_ Object(ModuleDefinitionBuilder moduleDefinitionBuilder, Function1 block) {
        AbstractC2855l.g(moduleDefinitionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        Module module = moduleDefinitionBuilder.getModule();
        AbstractC2855l.d(module);
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        block.invoke(objectDefinitionBuilder);
        ObjectDefinitionData objectDefinitionDataBuildObject = objectDefinitionBuilder.buildObject();
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap((Map<String, ? extends Object>) objectDefinitionDataBuildObject.getLegacyConstantsProvider().invoke());
        JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(module.getRuntime().getDeallocator());
        jSDecoratorsBridgingObject.registerConstants(writableNativeMapMakeNativeMap);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataBuildObject.getFunctions();
        while (functions.hasNext()) {
            functions.next().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject, "[Anonymous Object]");
        }
        Iterator<Map.Entry<String, PropertyComponent>> it = objectDefinitionDataBuildObject.getProperties().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject);
        }
        Iterator<Map.Entry<String, ConstantComponent>> it2 = objectDefinitionDataBuildObject.getConstants().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().attachToJSObject(jSDecoratorsBridgingObject);
        }
        JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(module.getRuntime().getDeallocator(), "[Anonymous Object]");
        javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
        return javaScriptModuleObject_;
    }

    public static final JavaScriptModuleObject_ Object(Module module, Function1 block) {
        AbstractC2855l.g(module, "<this>");
        AbstractC2855l.g(block, "block");
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        block.invoke(objectDefinitionBuilder);
        ObjectDefinitionData objectDefinitionDataBuildObject = objectDefinitionBuilder.buildObject();
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap((Map<String, ? extends Object>) objectDefinitionDataBuildObject.getLegacyConstantsProvider().invoke());
        JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(module.getRuntime().getDeallocator());
        jSDecoratorsBridgingObject.registerConstants(writableNativeMapMakeNativeMap);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataBuildObject.getFunctions();
        while (functions.hasNext()) {
            functions.next().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject, "[Anonymous Object]");
        }
        Iterator<Map.Entry<String, PropertyComponent>> it = objectDefinitionDataBuildObject.getProperties().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject);
        }
        Iterator<Map.Entry<String, ConstantComponent>> it2 = objectDefinitionDataBuildObject.getConstants().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().attachToJSObject(jSDecoratorsBridgingObject);
        }
        JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(module.getRuntime().getDeallocator(), "[Anonymous Object]");
        javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
        return javaScriptModuleObject_;
    }
}
