package kotlin.jvm.internal;

import C7.i;
import C7.m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends q implements C7.i {
    public o(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    protected C7.c computeReflected() {
        return D.e(this);
    }

    @Override // C7.m
    public Object getDelegate(Object obj) {
        return ((C7.i) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // C7.k
    /* JADX INFO: renamed from: getGetter */
    public m.a h0() {
        return ((C7.i) getReflected()).h0();
    }

    @Override // C7.h
    public i.a h() {
        return ((C7.i) getReflected()).h();
    }
}
