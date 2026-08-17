package expo.modules.kotlin.jni;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/jni/ArrayBuffer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readByte", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.POSITION, "read2Byte", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read4Byte", "read8Byte", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readFloat", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readDouble", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toDirectBuffer", "Ljava/nio/ByteBuffer;", "copy", "Lexpo/modules/kotlin/jni/NativeArrayBuffer;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ArrayBuffer {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static NativeArrayBuffer copy(ArrayBuffer arrayBuffer) {
            return NativeArrayBuffer.INSTANCE.copyOf(arrayBuffer);
        }
    }

    NativeArrayBuffer copy();

    short read2Byte(int position);

    int read4Byte(int position);

    long read8Byte(int position);

    byte readByte(int position);

    double readDouble(int position);

    float readFloat(int position);

    int size();

    ByteBuffer toDirectBuffer();
}
