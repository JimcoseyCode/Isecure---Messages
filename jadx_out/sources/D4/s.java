package d4;

import android.content.Context;
import e4.InterfaceC2404c;
import e4.InterfaceC2405d;
import f4.InterfaceC2613b;
import g4.InterfaceC2673a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f25650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f25656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f25657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f25658i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f25650a = provider;
        this.f25651b = provider2;
        this.f25652c = provider3;
        this.f25653d = provider4;
        this.f25654e = provider5;
        this.f25655f = provider6;
        this.f25656g = provider7;
        this.f25657h = provider8;
        this.f25658i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, X3.e eVar, InterfaceC2405d interfaceC2405d, x xVar, Executor executor, InterfaceC2613b interfaceC2613b, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, InterfaceC2404c interfaceC2404c) {
        return new r(context, eVar, interfaceC2405d, xVar, executor, interfaceC2613b, interfaceC2673a, interfaceC2673a2, interfaceC2404c);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f25650a.get(), (X3.e) this.f25651b.get(), (InterfaceC2405d) this.f25652c.get(), (x) this.f25653d.get(), (Executor) this.f25654e.get(), (InterfaceC2613b) this.f25655f.get(), (InterfaceC2673a) this.f25656g.get(), (InterfaceC2673a) this.f25657h.get(), (InterfaceC2404c) this.f25658i.get());
    }
}
