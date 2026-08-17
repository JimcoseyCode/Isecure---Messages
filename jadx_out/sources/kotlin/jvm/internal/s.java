package kotlin.jvm.internal;

import C7.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends y implements C7.l {
    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC2846c
    protected C7.c computeReflected() {
        return D.j(this);
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return get();
    }

    @Override // C7.k
    public l.a getGetter() {
        return ((C7.l) getReflected()).getGetter();
    }
}
