package expo.modules.kotlin.sharedobjects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import i7.C2735B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR2\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\t0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Ljava/lang/Class;", "native", "Li7/B;", "delete", "(Ljava/lang/Class;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "js", "add$expo_modules_core_release", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "add", "toJavaScriptObject$expo_modules_core_release", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObject", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pairs", "Ljava/util/Map;", "getPairs$expo_modules_core_release", "()Ljava/util/Map;", "setPairs$expo_modules_core_release", "(Ljava/util/Map;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassRegistry {
    private Map<Class<?>, JavaScriptObject> pairs = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B add$lambda$0(ClassRegistry classRegistry, Class cls) {
        classRegistry.delete(cls);
        return C2735B.f28704a;
    }

    private final void delete(Class<?> cls) {
        this.pairs.remove(cls);
    }

    public final void add$expo_modules_core_release(final Class<?> cls, JavaScriptObject js) {
        AbstractC2855l.g(cls, "native");
        AbstractC2855l.g(js, "js");
        js.defineDeallocator$expo_modules_core_release(new InterfaceC3487a() { // from class: c7.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ClassRegistry.add$lambda$0(this.f18916g, cls);
            }
        });
        this.pairs.put(cls, js);
    }

    public final Map<Class<?>, JavaScriptObject> getPairs$expo_modules_core_release() {
        return this.pairs;
    }

    public final void setPairs$expo_modules_core_release(Map<Class<?>, JavaScriptObject> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.pairs = map;
    }

    public final JavaScriptObject toJavaScriptObject$expo_modules_core_release(Class<?> cls) {
        AbstractC2855l.g(cls, "native");
        return this.pairs.get(cls);
    }
}
