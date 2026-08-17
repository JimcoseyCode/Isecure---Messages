package q8;

import C8.AbstractC0407d0;
import L7.H;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends g {
    public m(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // q8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 a(H module) {
        AbstractC2855l.g(module, "module");
        AbstractC0407d0 abstractC0407d0B = module.n().B();
        AbstractC2855l.f(abstractC0407d0B, "getFloatType(...)");
        return abstractC0407d0B;
    }

    @Override // q8.g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
