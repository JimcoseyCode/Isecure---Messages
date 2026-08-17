package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.jni.ArrayBuffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0011\b\u0013\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/jni/NativeArrayBuffer;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/ArrayBuffer;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "(Ljava/nio/ByteBuffer;)V", "buffer", "initHybrid", "(Ljava/nio/ByteBuffer;)Lcom/facebook/jni/HybridData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValid", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", "()I", ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "readByte", "(I)B", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read2Byte", "(I)S", "read4Byte", "(I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read8Byte", "(I)J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readFloat", "(I)F", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readDouble", "(I)D", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "Li7/B;", "finalize", "()V", "getHybridDataForJNIDeallocator", "()Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class NativeArrayBuffer implements Destructible, ArrayBuffer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @DoNotStrip
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/jni/NativeArrayBuffer$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "allocate", "Lexpo/modules/kotlin/jni/NativeArrayBuffer;", "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, "wrap", "byteBuffer", "Ljava/nio/ByteBuffer;", "copyOf", "other", "Lexpo/modules/kotlin/jni/ArrayBuffer;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeArrayBuffer allocate(int size) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size);
            AbstractC2855l.d(byteBufferAllocateDirect);
            return new NativeArrayBuffer(byteBufferAllocateDirect);
        }

        public final NativeArrayBuffer copyOf(ArrayBuffer other) {
            AbstractC2855l.g(other, "other");
            return copyOf(other.toDirectBuffer());
        }

        public final NativeArrayBuffer wrap(ByteBuffer byteBuffer) {
            AbstractC2855l.g(byteBuffer, "byteBuffer");
            byteBuffer.rewind();
            return new NativeArrayBuffer(byteBuffer);
        }

        private Companion() {
        }

        public final NativeArrayBuffer copyOf(ByteBuffer byteBuffer) {
            AbstractC2855l.g(byteBuffer, "byteBuffer");
            byteBuffer.rewind();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.rewind();
            byteBuffer.rewind();
            AbstractC2855l.d(byteBufferAllocateDirect);
            return new NativeArrayBuffer(byteBufferAllocateDirect);
        }
    }

    @DoNotStrip
    private NativeArrayBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native HybridData initHybrid(ByteBuffer buffer);

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

    /* JADX WARN: Multi-variable type inference failed */
    public NativeArrayBuffer(ByteBuffer byteBuffer) throws Exceptions.IllegalArgument {
        AbstractC2855l.g(byteBuffer, "byteBuffer");
        if (byteBuffer.isDirect()) {
            this.mHybridData = initHybrid(byteBuffer);
        } else {
            throw new Exceptions.IllegalArgument("ArrayBuffers can only be created from direct ByteBuffers", null, 2, 0 == true ? 1 : 0);
        }
    }
}
