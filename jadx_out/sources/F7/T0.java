package F7;

import kotlin.Lazy;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class T0 implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U0 f1975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f1977i;

    public T0(U0 u02, int i10, Lazy lazy) {
        this.f1975g = u02;
        this.f1976h = i10;
        this.f1977i = lazy;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return U0.s(this.f1975g, this.f1976h, this.f1977i);
    }
}
