package expo.modules.kotlin.objects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/objects/ConstantComponent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Lkotlin/Function0;", "getter", "<init>", "(Ljava/lang/String;Lw7/a;)V", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "Li7/B;", "attachToJSObject", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lw7/a;", "getGetter", "()Lw7/a;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstantComponent {
    private final InterfaceC3487a getter;
    private final String name;

    public ConstantComponent(String name, InterfaceC3487a getter) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(getter, "getter");
        this.name = name;
        this.getter = getter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attachToJSObject$lambda$0(ConstantComponent constantComponent) {
        return JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, constantComponent.getter.invoke(), null, false, 6, null);
    }

    public final void attachToJSObject(JSDecoratorsBridgingObject jsObject) {
        AbstractC2855l.g(jsObject, "jsObject");
        jsObject.registerConstant(this.name, new JNINoArgsFunctionBody() { // from class: expo.modules.kotlin.objects.a
            @Override // expo.modules.kotlin.jni.JNINoArgsFunctionBody
            public final Object invoke() {
                return ConstantComponent.attachToJSObject$lambda$0(this.f26617a);
            }
        });
    }

    public final InterfaceC3487a getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }
}
