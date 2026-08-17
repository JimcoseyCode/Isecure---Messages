package i9;

import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3487a f28839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f28840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f28841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC3487a interfaceC3487a, String str, boolean z10, String str2, boolean z11) {
        super(str2, z11);
        this.f28839e = interfaceC3487a;
        this.f28840f = str;
        this.f28841g = z10;
    }

    @Override // i9.a
    public long f() {
        this.f28839e.invoke();
        return -1L;
    }
}
