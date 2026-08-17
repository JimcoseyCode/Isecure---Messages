package com.facebook.react.modules.network;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.E;
import e9.x;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.AbstractC3386c;
import t9.C3391h;
import t9.F;
import t9.j;
import t9.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\b\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/network/ProgressResponseBody;", "Le9/E;", "responseBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Le9/E;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lt9/F;", "source", "(Lt9/F;)Lt9/F;", "Le9/x;", "contentType", "()Le9/x;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentLength", "()J", "totalBytesRead", "Lt9/j;", "()Lt9/j;", "Le9/E;", "Lcom/facebook/react/modules/network/ProgressListener;", "bufferedSource", "Lt9/j;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressResponseBody extends E {
    private j bufferedSource;
    private final ProgressListener progressListener;
    private final E responseBody;
    private long totalBytesRead;

    public ProgressResponseBody(E responseBody, ProgressListener progressListener) {
        AbstractC2855l.g(responseBody, "responseBody");
        AbstractC2855l.g(progressListener, "progressListener");
        this.responseBody = responseBody;
        this.progressListener = progressListener;
    }

    @Override // e9.E
    public long contentLength() {
        return this.responseBody.contentLength();
    }

    @Override // e9.E
    public x contentType() {
        return this.responseBody.contentType();
    }

    @Override // e9.E
    public j source() {
        if (this.bufferedSource == null) {
            this.bufferedSource = AbstractC3386c.a().b(source(this.responseBody.source()));
        }
        j jVar = this.bufferedSource;
        if (jVar != null) {
            return jVar;
        }
        AbstractC2855l.y("bufferedSource");
        return null;
    }

    /* JADX INFO: renamed from: totalBytesRead, reason: from getter */
    public final long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    private final F source(F source) {
        return new n(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody.source.1
            @Override // t9.n, t9.F
            public long read(C3391h sink, long byteCount) throws IOException {
                AbstractC2855l.g(sink, "sink");
                long j10 = super.read(sink, byteCount);
                ProgressResponseBody progressResponseBody = this;
                if (j10 != -1) {
                    progressResponseBody.totalBytesRead += j10;
                }
                progressResponseBody.progressListener.onProgress(progressResponseBody.totalBytesRead, progressResponseBody.responseBody.contentLength(), j10 == -1);
                return j10;
            }
        };
    }
}
