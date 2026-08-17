package j9;

import i7.AbstractC2738a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IOException f29047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IOException f29048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IOException firstConnectException) {
        super(firstConnectException);
        AbstractC2855l.g(firstConnectException, "firstConnectException");
        this.f29048h = firstConnectException;
        this.f29047g = firstConnectException;
    }

    public final void a(IOException e10) {
        AbstractC2855l.g(e10, "e");
        AbstractC2738a.a(this.f29048h, e10);
        this.f29047g = e10;
    }

    public final IOException b() {
        return this.f29048h;
    }

    public final IOException c() {
        return this.f29047g;
    }
}
