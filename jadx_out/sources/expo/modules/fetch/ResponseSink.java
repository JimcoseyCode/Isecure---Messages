package expo.modules.fetch;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/fetch/ResponseSink;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "data", "Li7/B;", "appendBufferBody$expo_release", "([B)V", "appendBufferBody", PointerEventHelper.POINTER_TYPE_UNKNOWN, "directBuffer", "Ljava/nio/ByteBuffer;", "finalize", "(Z)Ljava/nio/ByteBuffer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bodyQueue", "Ljava/util/List;", "isFinalized", "Z", "value", "bodyUsed", "getBodyUsed", "()Z", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResponseSink {
    private final List<byte[]> bodyQueue = new ArrayList();
    private boolean bodyUsed;
    private boolean isFinalized;

    public final void appendBufferBody$expo_release(byte[] data) {
        AbstractC2855l.g(data, "data");
        this.bodyUsed = true;
        this.bodyQueue.add(data);
    }

    public final ByteBuffer finalize(boolean directBuffer) {
        Iterator<T> it = this.bodyQueue.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocateDirect = directBuffer ? ByteBuffer.allocateDirect(length) : ByteBuffer.allocate(length);
        Iterator<byte[]> it2 = this.bodyQueue.iterator();
        while (it2.hasNext()) {
            byteBufferAllocateDirect.put(it2.next());
        }
        this.bodyQueue.clear();
        this.bodyUsed = true;
        this.isFinalized = true;
        AbstractC2855l.d(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    public final boolean getBodyUsed() {
        return this.bodyUsed;
    }
}
