package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.InterfaceC2851h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends d implements InterfaceC2851h {
    private final int arity;

    public l(int i10, n7.f fVar) {
        super(fVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC2851h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM = D.m(this);
        AbstractC2855l.f(strM, "renderLambdaToString(...)");
        return strM;
    }
}
