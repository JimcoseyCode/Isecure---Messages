package com.facebook.react.modules.network;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C;
import e9.x;
import java.io.FilterOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.AbstractC3386c;
import t9.D;
import t9.InterfaceC3392i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/modules/network/ProgressRequestBody;", "Le9/C;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Le9/C;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lt9/i;", "sink", "Lt9/D;", "outputStreamSink", "(Lt9/i;)Lt9/D;", "Le9/x;", "contentType", "()Le9/x;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentLength", "()J", "Li7/B;", "writeTo", "(Lt9/i;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getBodyPreview", "()Ljava/lang/String;", "Le9/C;", "Lcom/facebook/react/modules/network/ProgressListener;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressRequestBody extends C {
    private long contentLength;
    private final ProgressListener progressListener;
    private final C requestBody;

    public ProgressRequestBody(C requestBody, ProgressListener progressListener) {
        AbstractC2855l.g(requestBody, "requestBody");
        AbstractC2855l.g(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    private final D outputStreamSink(InterfaceC3392i sink) {
        return AbstractC3386c.a().d(new FilterOutputStream(sink.E0()) { // from class: com.facebook.react.modules.network.ProgressRequestBody.outputStreamSink.1
            private long count;

            public final void sendProgressUpdate() throws IOException {
                long j10 = this.count;
                long jContentLength = ProgressRequestBody.this.contentLength();
                ProgressRequestBody.this.progressListener.onProgress(j10, jContentLength, j10 == jContentLength);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) throws IOException {
                AbstractC2855l.g(data, "data");
                super.write(data, offset, byteCount);
                this.count += (long) byteCount;
                sendProgressUpdate();
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int data) throws IOException {
                super.write(data);
                this.count++;
                sendProgressUpdate();
            }
        });
    }

    @Override // e9.C
    public long contentLength() throws IOException {
        if (this.contentLength == 0) {
            this.contentLength = this.requestBody.contentLength();
        }
        return this.contentLength;
    }

    @Override // e9.C
    public x contentType() {
        return this.requestBody.contentType();
    }

    public final String getBodyPreview() {
        return "[Preview unavailable]";
    }

    @Override // e9.C
    public void writeTo(InterfaceC3392i sink) throws IOException {
        AbstractC2855l.g(sink, "sink");
        InterfaceC3392i interfaceC3392iA = AbstractC3386c.a().a(outputStreamSink(sink));
        contentLength();
        this.requestBody.writeTo(interfaceC3392iA);
        interfaceC3392iA.flush();
    }
}
