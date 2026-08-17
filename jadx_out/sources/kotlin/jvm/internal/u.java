package kotlin.jvm.internal;

import C7.m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends y implements C7.m {
    public u() {
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    protected C7.c computeReflected() {
        return D.k(this);
    }

    @Override // C7.m
    public Object getDelegate(Object obj) {
        return ((C7.m) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // C7.k
    /* JADX INFO: renamed from: getGetter */
    public m.a h0() {
        return ((C7.m) getReflected()).h0();
    }
}
