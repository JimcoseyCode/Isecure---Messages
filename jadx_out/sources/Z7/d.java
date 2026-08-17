package Z7;

import C8.v0;
import L7.m0;
import b8.InterfaceC1826j;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class d implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f13636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m0 f13637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f13638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v0 f13639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC1826j f13640k;

    public d(e eVar, m0 m0Var, a aVar, v0 v0Var, InterfaceC1826j interfaceC1826j) {
        this.f13636g = eVar;
        this.f13637h = m0Var;
        this.f13638i = aVar;
        this.f13639j = v0Var;
        this.f13640k = interfaceC1826j;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return e.e(this.f13636g, this.f13637h, this.f13638i, this.f13639j, this.f13640k);
    }
}
