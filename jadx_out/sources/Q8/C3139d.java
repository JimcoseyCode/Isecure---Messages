package q8;

import C8.AbstractC0407d0;
import L7.H;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: q8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3139d extends r {
    public C3139d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // q8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 a(H module) {
        AbstractC2855l.g(module, "module");
        AbstractC0407d0 abstractC0407d0T = module.n().t();
        AbstractC2855l.f(abstractC0407d0T, "getByteType(...)");
        return abstractC0407d0T;
    }

    @Override // q8.g
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
