package expo.modules.kotlin.runtime;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import kotlin.Metadata;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\nH ¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u00108 X¡\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8 X \u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8 X \u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lexpo/modules/kotlin/runtime/Runtime;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "source", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "eval", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lkotlin/Function0;", "Li7/B;", "block", "schedule", "(Lw7/a;)V", "deallocate$expo_modules_core_release", "deallocate", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "getDeallocator", "()Lexpo/modules/kotlin/jni/JNIDeallocator;", "getDeallocator$annotations", "deallocator", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "appContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lexpo/modules/kotlin/jni/JSIContext;", "getJsiContext", "()Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "getSharedObjectRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "sharedObjectRegistry", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getClassRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "classRegistry", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Runtime {
    public abstract void deallocate$expo_modules_core_release();

    public abstract JavaScriptValue eval(String source);

    public abstract AppContext getAppContext();

    /* JADX INFO: renamed from: getClassRegistry$expo_modules_core_release */
    public abstract ClassRegistry getClassRegistry();

    public abstract JNIDeallocator getDeallocator();

    public abstract JSIContext getJsiContext();

    public abstract ReactApplicationContext getReactContext();

    /* JADX INFO: renamed from: getSharedObjectRegistry$expo_modules_core_release */
    public abstract SharedObjectRegistry getSharedObjectRegistry();

    public abstract void schedule(InterfaceC3487a block);

    public static /* synthetic */ void getDeallocator$annotations() {
    }
}
