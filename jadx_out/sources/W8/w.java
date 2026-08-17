package W8;

import R8.InterfaceC1408f0;
import R8.U;
import R8.X;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends R8.J implements X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ X f12209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final R8.J f12210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f12211k;

    /* JADX WARN: Multi-variable type inference failed */
    public w(R8.J j10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f12209i = x10 == null ? U.a() : x10;
        this.f12210j = j10;
        this.f12211k = str;
    }

    @Override // R8.X
    public InterfaceC1408f0 D0(long j10, Runnable runnable, n7.j jVar) {
        return this.f12209i.D0(j10, runnable, jVar);
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        this.f12210j.J0(jVar, runnable);
    }

    @Override // R8.J
    public void K0(n7.j jVar, Runnable runnable) {
        this.f12210j.K0(jVar, runnable);
    }

    @Override // R8.J
    public boolean L0(n7.j jVar) {
        return this.f12210j.L0(jVar);
    }

    @Override // R8.J
    public String toString() {
        return this.f12211k;
    }
}
