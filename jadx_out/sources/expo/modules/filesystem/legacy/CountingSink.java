package expo.modules.filesystem.legacy;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.D;
import t9.m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/filesystem/legacy/CountingSink;", "Lt9/m;", "Lt9/D;", "sink", "Le9/C;", "requestBody", "Lexpo/modules/filesystem/legacy/CountingRequestListener;", "progressListener", "<init>", "(Lt9/D;Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V", "Lt9/h;", "source", PointerEventHelper.POINTER_TYPE_UNKNOWN, "byteCount", "Li7/B;", "write", "(Lt9/h;J)V", "Le9/C;", "Lexpo/modules/filesystem/legacy/CountingRequestListener;", "bytesWritten", "J", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CountingSink extends m {
    private long bytesWritten;
    private final CountingRequestListener progressListener;
    private final C requestBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountingSink(D sink, C requestBody, CountingRequestListener progressListener) {
        super(sink);
        AbstractC2855l.g(sink, "sink");
        AbstractC2855l.g(requestBody, "requestBody");
        AbstractC2855l.g(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // t9.m, t9.D
    public void write(C3391h source, long byteCount) {
        AbstractC2855l.g(source, "source");
        super.write(source, byteCount);
        long j10 = this.bytesWritten + byteCount;
        this.bytesWritten = j10;
        this.progressListener.onProgress(j10, this.requestBody.contentLength());
    }
}
