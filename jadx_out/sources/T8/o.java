package T8;

import R8.AbstractC1426o0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class o {
    public static final void a(v vVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC1426o0.a("Channel was consumed, consumer had failed", th);
            }
        }
        vVar.k(cancellationExceptionA);
    }
}
