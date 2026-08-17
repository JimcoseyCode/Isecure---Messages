package R8;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class X0 extends CancellationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient A0 f10165g;

    public X0(String str, A0 a02) {
        super(str);
        this.f10165g = a02;
    }

    public X0(String str) {
        this(str, null);
    }
}
