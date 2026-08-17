package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: expo.modules.kotlin.jni.JavaScriptModuleObject, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "decorator", "Li7/B;", "decorate", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "finalize", "()V", "toString", "()Ljava/lang/String;", "getHybridDataForJNIDeallocator", "Ljava/lang/String;", "getName", "mHybridData", "Lcom/facebook/jni/HybridData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValid", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptModuleObject_ implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;

    /* JADX INFO: renamed from: name, reason: from kotlin metadata and from toString */
    private final String JavaScriptModuleObject_;

    public JavaScriptModuleObject_(JNIDeallocator jniDeallocator, String name) {
        AbstractC2855l.g(jniDeallocator, "jniDeallocator");
        AbstractC2855l.g(name, "name");
        this.JavaScriptModuleObject_ = name;
        this.mHybridData = initHybrid();
        jniDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    public final native void decorate(JSDecoratorsBridgingObject decorator);

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getJavaScriptModuleObject_() {
        return this.JavaScriptModuleObject_;
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public String toString() {
        return "JavaScriptModuleObject_" + this.JavaScriptModuleObject_;
    }
}
