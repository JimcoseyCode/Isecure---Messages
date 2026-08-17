package h3;

import android.os.Build;
import f2.C2601b;
import g3.D;
import g3.i;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f28288a = new e();

    private e() {
    }

    public static final d a(D poolFactory, boolean z10, boolean z11, f platformDecoderOptions) {
        AbstractC2855l.g(poolFactory, "poolFactory");
        AbstractC2855l.g(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i iVarB = poolFactory.b();
            AbstractC2855l.f(iVarB, "getBitmapPool(...)");
            return new c(iVarB, b(poolFactory, z11), platformDecoderOptions);
        }
        i iVarB2 = poolFactory.b();
        AbstractC2855l.f(iVarB2, "getBitmapPool(...)");
        return new C2703a(iVarB2, b(poolFactory, z11), platformDecoderOptions);
    }

    public static final H0.e b(D poolFactory, boolean z10) {
        AbstractC2855l.g(poolFactory, "poolFactory");
        if (z10) {
            C2601b INSTANCE = C2601b.f27219a;
            AbstractC2855l.f(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iE = poolFactory.e();
        H0.f fVar = new H0.f(iE);
        for (int i10 = 0; i10 < iE; i10++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C2601b.c());
            AbstractC2855l.f(byteBufferAllocate, "allocate(...)");
            fVar.release(byteBufferAllocate);
        }
        return fVar;
    }
}
