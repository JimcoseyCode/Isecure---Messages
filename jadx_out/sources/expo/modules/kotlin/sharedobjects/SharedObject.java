package expo.modules.kotlin.sharedobjects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/runtime/Runtime;", "runtime", "<init>", "(Lexpo/modules/kotlin/runtime/Runtime;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "(Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "getJavaScriptObject", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "Li7/B;", "emit", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onStartListeningToEvent", "(Ljava/lang/String;)V", "onStopListeningToEvent", "sharedObjectDidRelease", "()V", "deallocate", "getAdditionalMemoryPressure", "Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "sharedObjectId", "I", "getSharedObjectId-HSeVr_g$expo_modules_core_release", "setSharedObjectId-kyJHjyY$expo_modules_core_release", "(I)V", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "getRuntimeContextHolder", "()Ljava/lang/ref/WeakReference;", "setRuntimeContextHolder", "(Ljava/lang/ref/WeakReference;)V", "getRuntime", "()Lexpo/modules/kotlin/runtime/Runtime;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public class SharedObject {
    private WeakReference<Runtime> runtimeContextHolder;
    private int sharedObjectId;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final JavaScriptWeakObject getJavaScriptObject() {
        int iM236constructorimpl = SharedObjectId.m236constructorimpl(this.sharedObjectId);
        Runtime runtime = getRuntime();
        if (runtime == null) {
            return null;
        }
        return SharedObjectId.m244toWeakJavaScriptObjectNullimpl(iM236constructorimpl, runtime);
    }

    private final Runtime getRuntime() {
        return this.runtimeContextHolder.get();
    }

    @DoNotStrip
    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    public final void emit(String eventName, Object... args) {
        Runtime runtime;
        JSIContext jsiContext;
        AbstractC2855l.g(eventName, "eventName");
        AbstractC2855l.g(args, "args");
        JavaScriptWeakObject javaScriptObject = getJavaScriptObject();
        if (javaScriptObject == null || (runtime = getRuntime()) == null || (jsiContext = runtime.getJsiContext()) == null) {
            return;
        }
        try {
            JNIUtils.Companion companion = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj, null, false, 6, null));
            }
            companion.emitEvent(javaScriptObject, jsiContext, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th) {
            CoreLoggerKt.getLogger().error("Unable to send event '" + eventName + "' by shared object of type " + getClass().getSimpleName(), th);
        }
    }

    public int getAdditionalMemoryPressure() {
        return 0;
    }

    public final AppContext getAppContext() {
        Runtime runtime = getRuntime();
        if (runtime != null) {
            return runtime.getAppContext();
        }
        return null;
    }

    public final WeakReference<Runtime> getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    /* JADX INFO: renamed from: getSharedObjectId-HSeVr_g$expo_modules_core_release, reason: not valid java name */
    public final int m233getSharedObjectIdHSeVr_g$expo_modules_core_release() {
        return this.sharedObjectId;
    }

    public void onStartListeningToEvent(String eventName) {
        AbstractC2855l.g(eventName, "eventName");
    }

    public void onStopListeningToEvent(String eventName) {
        AbstractC2855l.g(eventName, "eventName");
    }

    public final void setRuntimeContextHolder(WeakReference<Runtime> weakReference) {
        AbstractC2855l.g(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    /* JADX INFO: renamed from: setSharedObjectId-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final void m234setSharedObjectIdkyJHjyY$expo_modules_core_release(int i10) {
        this.sharedObjectId = i10;
    }

    public void sharedObjectDidRelease() {
        deallocate();
    }

    public SharedObject(Runtime runtime) {
        this.sharedObjectId = SharedObjectId.m236constructorimpl(0);
        this.runtimeContextHolder = UtilsKt.weak(runtime);
    }

    public /* synthetic */ SharedObject(Runtime runtime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runtime);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(AppContext appContext) {
        this(appContext.getRuntime());
        AbstractC2855l.g(appContext, "appContext");
    }

    public void deallocate() {
    }
}
