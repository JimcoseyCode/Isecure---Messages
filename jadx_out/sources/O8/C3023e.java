package o8;

import C8.v0;
import D8.e;
import L7.InterfaceC1276a;

/* JADX INFO: renamed from: o8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3023e implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1276a f30515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1276a f30516c;

    public C3023e(boolean z10, InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        this.f30514a = z10;
        this.f30515b = interfaceC1276a;
        this.f30516c = interfaceC1276a2;
    }

    @Override // D8.e.a
    public boolean a(v0 v0Var, v0 v0Var2) {
        return C3025g.h(this.f30514a, this.f30515b, this.f30516c, v0Var, v0Var2);
    }
}
