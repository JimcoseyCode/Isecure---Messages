package d4;

import e4.InterfaceC2405d;
import f4.InterfaceC2613b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f25665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25668d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f25665a = provider;
        this.f25666b = provider2;
        this.f25667c = provider3;
        this.f25668d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC2405d interfaceC2405d, x xVar, InterfaceC2613b interfaceC2613b) {
        return new v(executor, interfaceC2405d, xVar, interfaceC2613b);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f25665a.get(), (InterfaceC2405d) this.f25666b.get(), (x) this.f25667c.get(), (InterfaceC2613b) this.f25668d.get());
    }
}
