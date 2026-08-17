package expo.modules.kotlin.sharedobjects;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.runtime.Runtime;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constructor-impl", "(I)I", "getValue", "()I", "toNativeObject", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "runtime", "Lexpo/modules/kotlin/runtime/Runtime;", "toNativeObject-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toNativeObjectOrNull", "toNativeObjectOrNull-impl", "toJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toWeakJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString-impl", "(I)Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedObjectId {
    private final int value;

    private /* synthetic */ SharedObjectId(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SharedObjectId m235boximpl(int i10) {
        return new SharedObjectId(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m237equalsimpl(int i10, Object obj) {
        return (obj instanceof SharedObjectId) && i10 == ((SharedObjectId) obj).m245unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m238equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m239hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: toJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptObject m240toJavaScriptObjectNullimpl(int i10, Runtime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        SharedObject sharedObjectM242toNativeObjectOrNullimpl = m242toNativeObjectOrNullimpl(i10, runtime);
        if (sharedObjectM242toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtime.getSharedObjectRegistry().toJavaScriptObjectOrNull$expo_modules_core_release(sharedObjectM242toNativeObjectOrNullimpl);
    }

    /* JADX INFO: renamed from: toNativeObject-impl, reason: not valid java name */
    public static final SharedObject m241toNativeObjectimpl(int i10, Runtime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        return runtime.getSharedObjectRegistry().m250toNativeObjectkyJHjyY$expo_modules_core_release(i10);
    }

    /* JADX INFO: renamed from: toNativeObjectOrNull-impl, reason: not valid java name */
    public static final SharedObject m242toNativeObjectOrNullimpl(int i10, Runtime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        return runtime.getSharedObjectRegistry().m251toNativeObjectOrNullkyJHjyY$expo_modules_core_release(i10);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m243toStringimpl(int i10) {
        return "SharedObjectId(value=" + i10 + ")";
    }

    /* JADX INFO: renamed from: toWeakJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptWeakObject m244toWeakJavaScriptObjectNullimpl(int i10, Runtime runtime) {
        AbstractC2855l.g(runtime, "runtime");
        SharedObject sharedObjectM242toNativeObjectOrNullimpl = m242toNativeObjectOrNullimpl(i10, runtime);
        if (sharedObjectM242toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtime.getSharedObjectRegistry().toWeakJavaScriptObjectOrNull$expo_modules_core_release(sharedObjectM242toNativeObjectOrNullimpl);
    }

    public boolean equals(Object obj) {
        return m237equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m239hashCodeimpl(this.value);
    }

    public String toString() {
        return m243toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m245unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m236constructorimpl(int i10) {
        return i10;
    }
}
