package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements InterfaceC2851h, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29396g;

    public n(int i10) {
        this.f29396g = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC2851h
    public int getArity() {
        return this.f29396g;
    }

    public String toString() {
        String strN = D.n(this);
        AbstractC2855l.f(strN, "renderLambdaToString(...)");
        return strN;
    }
}
