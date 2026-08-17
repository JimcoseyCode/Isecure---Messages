package expo.modules.filesystem.legacy;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C;
import e9.x;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.InterfaceC3392i;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/filesystem/legacy/CountingRequestBody;", "Le9/C;", "requestBody", "Lexpo/modules/filesystem/legacy/CountingRequestListener;", "progressListener", "<init>", "(Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V", "Le9/x;", "contentType", "()Le9/x;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentLength", "()J", "Lt9/i;", "sink", "Li7/B;", "writeTo", "(Lt9/i;)V", "Le9/C;", "Lexpo/modules/filesystem/legacy/CountingRequestListener;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CountingRequestBody extends C {
    private final CountingRequestListener progressListener;
    private final C requestBody;

    public CountingRequestBody(C requestBody, CountingRequestListener progressListener) {
        AbstractC2855l.g(requestBody, "requestBody");
        AbstractC2855l.g(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // e9.C
    public long contentLength() throws IOException {
        return this.requestBody.contentLength();
    }

    @Override // e9.C
    public x contentType() {
        return this.requestBody.contentType();
    }

    @Override // e9.C
    public void writeTo(InterfaceC3392i sink) {
        AbstractC2855l.g(sink, "sink");
        InterfaceC3392i interfaceC3392iC = s.c(new CountingSink(sink, this, this.progressListener));
        this.requestBody.writeTo(interfaceC3392iC);
        interfaceC3392iC.flush();
    }
}
