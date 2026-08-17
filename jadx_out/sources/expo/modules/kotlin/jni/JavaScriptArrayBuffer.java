package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.jni.ArrayBuffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0096 ¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0004¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'¨\u0006("}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/ArrayBuffer;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValid", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", "()I", ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "readByte", "(I)B", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read2Byte", "(I)S", "read4Byte", "(I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read8Byte", "(I)J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readFloat", "(I)F", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readDouble", "(I)D", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "Li7/B;", "finalize", "()V", "getHybridDataForJNIDeallocator", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptArrayBuffer implements Destructible, ArrayBuffer {

    @DoNotStrip
    private final HybridData mHybridData;

    @DoNotStrip
    private JavaScriptArrayBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public NativeArrayBuffer copy() {
        return ArrayBuffer.DefaultImpls.copy(this);
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native short read2Byte(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native int read4Byte(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native long read8Byte(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native byte readByte(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native double readDouble(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native float readFloat(int position);

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native int size();

    @Override // expo.modules.kotlin.jni.ArrayBuffer
    public native ByteBuffer toDirectBuffer();
}
