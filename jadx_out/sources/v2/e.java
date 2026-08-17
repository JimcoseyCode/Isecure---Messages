package V2;

import Y2.C1515a;
import g3.D;
import g3.i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11632a = new e();

    private e() {
    }

    public static final d a(D poolFactory, h3.d platformDecoder, C1515a closeableReferenceFactory) {
        AbstractC2855l.g(poolFactory, "poolFactory");
        AbstractC2855l.g(platformDecoder, "platformDecoder");
        AbstractC2855l.g(closeableReferenceFactory, "closeableReferenceFactory");
        i iVarB = poolFactory.b();
        AbstractC2855l.f(iVarB, "getBitmapPool(...)");
        return new a(iVarB, closeableReferenceFactory);
    }
}
