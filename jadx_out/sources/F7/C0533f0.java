package F7;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: F7.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0533f0 implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0539i0 f2049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f2050h;

    public C0533f0(C0539i0 c0539i0, String str) {
        this.f2049g = c0539i0;
        this.f2050h = str;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C0539i0.i0(this.f2049g, this.f2050h);
    }
}
