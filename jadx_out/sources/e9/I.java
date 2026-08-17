package e9;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public abstract void onClosed(H h10, int i10, String str);

    public void onClosing(H webSocket, int i10, String reason) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(reason, "reason");
    }

    public abstract void onFailure(H h10, Throwable th, D d10);

    public abstract void onMessage(H h10, String str);

    public void onMessage(H webSocket, t9.k bytes) {
        AbstractC2855l.g(webSocket, "webSocket");
        AbstractC2855l.g(bytes, "bytes");
    }

    public abstract void onOpen(H h10, D d10);
}
