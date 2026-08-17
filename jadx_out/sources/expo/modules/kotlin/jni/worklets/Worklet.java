package expo.modules.kotlin.jni.worklets;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.runtime.WorkletRuntime;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\nJ0\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 ¢\u0006\u0004\b\t\u0010\rJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000e\u0010\nJ0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000e\u0010\u0011J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\u0013J-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u0006*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/Worklet;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/worklets/Serializable;", "serializable", "<init>", "(Lexpo/modules/kotlin/jni/worklets/Serializable;)V", "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "workletNativeRuntime", "Li7/B;", "schedule", "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V", "execute", "Lexpo/modules/kotlin/runtime/WorkletRuntime;", "runtime", "(Lexpo/modules/kotlin/runtime/WorkletRuntime;)V", "arguments", "(Lexpo/modules/kotlin/runtime/WorkletRuntime;[Ljava/lang/Object;)V", "Lexpo/modules/kotlin/jni/worklets/Serializable;", "getEnforceHolder", "(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "enforceHolder", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Worklet {
    private final Serializable serializable;

    public Worklet(Serializable serializable) {
        AbstractC2855l.g(serializable, "serializable");
        this.serializable = serializable;
    }

    private final native void execute(WorkletNativeRuntime workletNativeRuntime, Serializable serializable);

    private final native void execute(WorkletNativeRuntime workletNativeRuntime, Serializable serializable, Object[] args);

    private final WorkletNativeRuntime getEnforceHolder(WorkletRuntime workletRuntime) {
        WorkletNativeRuntime mWorkletNativeRuntime$expo_modules_core_release = workletRuntime.getMWorkletNativeRuntime();
        if (mWorkletNativeRuntime$expo_modules_core_release != null) {
            return mWorkletNativeRuntime$expo_modules_core_release;
        }
        throw new IllegalStateException("Worklet runtime is not installed.");
    }

    private final native void schedule(WorkletNativeRuntime workletNativeRuntime, Serializable serializable);

    private final native void schedule(WorkletNativeRuntime workletNativeRuntime, Serializable serializable, Object[] args);

    public final void execute(WorkletRuntime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        execute(getEnforceHolder(runtime), this.serializable);
    }

    public final void schedule(WorkletRuntime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        schedule(getEnforceHolder(runtime), this.serializable);
    }

    public final void execute(WorkletRuntime runtime, Object... arguments) {
        AbstractC2855l.g(runtime, "runtime");
        AbstractC2855l.g(arguments, "arguments");
        WorkletNativeRuntime enforceHolder = getEnforceHolder(runtime);
        ArrayList arrayList = new ArrayList(arguments.length);
        for (Object obj : arguments) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj, null, true, 2, null));
        }
        execute(enforceHolder, this.serializable, arrayList.toArray(new Object[0]));
    }

    public final void schedule(WorkletRuntime runtime, Object... arguments) {
        AbstractC2855l.g(runtime, "runtime");
        AbstractC2855l.g(arguments, "arguments");
        WorkletNativeRuntime enforceHolder = getEnforceHolder(runtime);
        ArrayList arrayList = new ArrayList(arguments.length);
        for (Object obj : arguments) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj, null, true, 2, null));
        }
        schedule(enforceHolder, this.serializable, arrayList.toArray(new Object[0]));
    }
}
