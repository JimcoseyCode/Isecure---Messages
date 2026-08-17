package kotlin.jvm.internal;

import C7.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends y implements C7.n {
    public w(Class cls, String str, String str2, int i10) {
        super(AbstractC2846c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    protected C7.c computeReflected() {
        return D.l(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return r(obj, obj2);
    }

    @Override // C7.k
    /* JADX INFO: renamed from: getGetter */
    public n.a h0() {
        return ((C7.n) getReflected()).h0();
    }
}
