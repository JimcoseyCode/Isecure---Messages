package expo.modules.kotlin.sharedobjects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.InvalidSharedObjectIdException;
import expo.modules.kotlin.exception.UsingReleasedSharedObjectException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.runtime.Runtime;
import i7.C2735B;
import i7.t;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\u0019\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R>\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0.j\u0002`/0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/runtime/Runtime;", "runtime", "<init>", "(Lexpo/modules/kotlin/runtime/Runtime;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "pullNextId-HSeVr_g", "()I", "pullNextId", "ensureWasNotRelease-tuC-2VU", "(I)I", "ensureWasNotRelease", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "native", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "js", "add-5WKnsLU$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;Lexpo/modules/kotlin/jni/JavaScriptObject;)I", "add", "id", "Li7/B;", "delete-kyJHjyY$expo_modules_core_release", "(I)V", "delete", "toNativeObject-kyJHjyY$expo_modules_core_release", "(I)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toNativeObject", "toNativeObjectOrNull-kyJHjyY$expo_modules_core_release", "toNativeObjectOrNull", "toNativeObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/jni/JavaScriptObject;)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toJavaScriptObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObjectOrNull", "nativeObject", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectOrNull$expo_modules_core_release", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectOrNull", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "currentId", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectPair;", "pairs", "Ljava/util/Map;", "getPairs$expo_modules_core_release", "()Ljava/util/Map;", "setPairs$expo_modules_core_release", "(Ljava/util/Map;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedObjectRegistry {
    private int currentId;
    private Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> pairs;
    private final WeakReference<Runtime> runtimeContextHolder;

    public SharedObjectRegistry(Runtime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        this.runtimeContextHolder = UtilsKt.weak(runtime);
        this.currentId = SharedObjectId.m236constructorimpl(1);
        this.pairs = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ensureWasNotRelease-tuC-2VU, reason: not valid java name */
    private final int m246ensureWasNotReleasetuC2VU(int i10) throws UsingReleasedSharedObjectException {
        if (this.pairs.containsKey(SharedObjectId.m235boximpl(i10)) || i10 == 0 || i10 >= this.currentId) {
            return i10;
        }
        throw new UsingReleasedSharedObjectException();
    }

    /* JADX INFO: renamed from: pullNextId-HSeVr_g, reason: not valid java name */
    private final int m247pullNextIdHSeVr_g() {
        int i10;
        synchronized (this) {
            i10 = this.currentId;
            this.currentId = SharedObjectId.m236constructorimpl(i10 + 1);
        }
        return i10;
    }

    /* JADX INFO: renamed from: add-5WKnsLU$expo_modules_core_release, reason: not valid java name */
    public final int m248add5WKnsLU$expo_modules_core_release(SharedObject sharedObject, JavaScriptObject js) throws Exceptions.AppContextLost {
        AbstractC2855l.g(sharedObject, "native");
        AbstractC2855l.g(js, "js");
        int iM247pullNextIdHSeVr_g = m247pullNextIdHSeVr_g();
        sharedObject.m234setSharedObjectIdkyJHjyY$expo_modules_core_release(iM247pullNextIdHSeVr_g);
        JavaScriptObject.defineProperty$default(js, SharedObjectRegistryKt.sharedObjectIdPropertyName, iM247pullNextIdHSeVr_g, (List) null, 4, (Object) null);
        Runtime runtime = this.runtimeContextHolder.get();
        if (runtime == null) {
            throw new Exceptions.AppContextLost();
        }
        runtime.getJsiContext().setNativeStateForSharedObject(iM247pullNextIdHSeVr_g, js);
        int additionalMemoryPressure = sharedObject.getAdditionalMemoryPressure();
        if (additionalMemoryPressure > 0) {
            js.setExternalMemoryPressure(additionalMemoryPressure);
        }
        if (sharedObject instanceof SharedRef) {
            JavaScriptObject.defineProperty$default(js, "nativeRefType", ((SharedRef) sharedObject).getNativeRefType(), (List) null, 4, (Object) null);
        }
        JavaScriptWeakObject javaScriptWeakObjectCreateWeak = js.createWeak();
        synchronized (this) {
            this.pairs.put(SharedObjectId.m235boximpl(iM247pullNextIdHSeVr_g), t.a(sharedObject, javaScriptWeakObjectCreateWeak));
            C2735B c2735b = C2735B.f28704a;
        }
        if (sharedObject.getRuntimeContextHolder().get() == null) {
            sharedObject.setRuntimeContextHolder(UtilsKt.weak(runtime));
        }
        return iM247pullNextIdHSeVr_g;
    }

    /* JADX INFO: renamed from: delete-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final void m249deletekyJHjyY$expo_modules_core_release(int id) {
        Pair<SharedObject, JavaScriptWeakObject> pairRemove;
        synchronized (this) {
            pairRemove = this.pairs.remove(SharedObjectId.m235boximpl(id));
        }
        if (pairRemove != null) {
            SharedObject sharedObject = (SharedObject) pairRemove.getFirst();
            sharedObject.m234setSharedObjectIdkyJHjyY$expo_modules_core_release(SharedObjectId.m236constructorimpl(0));
            sharedObject.sharedObjectDidRelease();
        }
    }

    public final Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> getPairs$expo_modules_core_release() {
        return this.pairs;
    }

    public final void setPairs$expo_modules_core_release(Map<SharedObjectId, Pair<SharedObject, JavaScriptWeakObject>> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.pairs = map;
    }

    public final JavaScriptObject toJavaScriptObjectOrNull$expo_modules_core_release(SharedObject sharedObject) {
        JavaScriptObject javaScriptObjectLock;
        JavaScriptWeakObject javaScriptWeakObject;
        AbstractC2855l.g(sharedObject, "native");
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m235boximpl(sharedObject.m233getSharedObjectIdHSeVr_g$expo_modules_core_release()));
            javaScriptObjectLock = (pair == null || (javaScriptWeakObject = (JavaScriptWeakObject) pair.d()) == null) ? null : javaScriptWeakObject.lock();
        }
        return javaScriptObjectLock;
    }

    /* JADX INFO: renamed from: toNativeObject-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final SharedObject m250toNativeObjectkyJHjyY$expo_modules_core_release(int id) throws InvalidSharedObjectIdException {
        Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m235boximpl(m246ensureWasNotReleasetuC2VU(id)));
        SharedObject sharedObject = pair != null ? (SharedObject) pair.c() : null;
        if (sharedObject != null) {
            return sharedObject;
        }
        throw new InvalidSharedObjectIdException();
    }

    public final SharedObject toNativeObjectOrNull$expo_modules_core_release(JavaScriptObject js) {
        AbstractC2855l.g(js, "js");
        if (!js.hasProperty(SharedObjectRegistryKt.sharedObjectIdPropertyName)) {
            return null;
        }
        Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m235boximpl(SharedObjectId.m236constructorimpl(js.getProperty(SharedObjectRegistryKt.sharedObjectIdPropertyName).getInt())));
        if (pair != null) {
            return (SharedObject) pair.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: toNativeObjectOrNull-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final SharedObject m251toNativeObjectOrNullkyJHjyY$expo_modules_core_release(int id) {
        SharedObject sharedObject;
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m235boximpl(id));
            sharedObject = pair != null ? (SharedObject) pair.c() : null;
        }
        return sharedObject;
    }

    public final JavaScriptWeakObject toWeakJavaScriptObjectOrNull$expo_modules_core_release(SharedObject nativeObject) {
        JavaScriptWeakObject javaScriptWeakObject;
        AbstractC2855l.g(nativeObject, "nativeObject");
        synchronized (this) {
            Pair<SharedObject, JavaScriptWeakObject> pair = this.pairs.get(SharedObjectId.m235boximpl(nativeObject.m233getSharedObjectIdHSeVr_g$expo_modules_core_release()));
            javaScriptWeakObject = pair != null ? (JavaScriptWeakObject) pair.d() : null;
        }
        return javaScriptWeakObject;
    }
}
