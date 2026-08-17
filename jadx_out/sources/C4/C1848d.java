package c4;

import d4.x;
import e4.InterfaceC2405d;
import f4.InterfaceC2613b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: renamed from: c4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1848d implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f18817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f18818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f18819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f18820e;

    public C1848d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f18816a = provider;
        this.f18817b = provider2;
        this.f18818c = provider3;
        this.f18819d = provider4;
        this.f18820e = provider5;
    }

    public static C1848d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C1848d(provider, provider2, provider3, provider4, provider5);
    }

    public static C1847c c(Executor executor, X3.e eVar, x xVar, InterfaceC2405d interfaceC2405d, InterfaceC2613b interfaceC2613b) {
        return new C1847c(executor, eVar, xVar, interfaceC2405d, interfaceC2613b);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1847c get() {
        return c((Executor) this.f18816a.get(), (X3.e) this.f18817b.get(), (x) this.f18818c.get(), (InterfaceC2405d) this.f18819d.get(), (InterfaceC2613b) this.f18820e.get());
    }
}
