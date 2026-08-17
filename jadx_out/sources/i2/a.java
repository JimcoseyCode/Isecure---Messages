package I2;

import C2.d;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2.a f3918a;

    public a(R2.a animatedDrawableBackend) {
        AbstractC2855l.g(animatedDrawableBackend, "animatedDrawableBackend");
        this.f3918a = animatedDrawableBackend;
    }

    @Override // C2.d
    public int a() {
        return this.f3918a.a();
    }

    @Override // C2.d
    public int b() {
        return this.f3918a.b();
    }

    @Override // C2.d
    public int h() {
        return this.f3918a.getHeight();
    }

    @Override // C2.d
    public int i() {
        return this.f3918a.d();
    }

    @Override // C2.d
    public int j(int i10) {
        return this.f3918a.f(i10);
    }

    @Override // C2.d
    public int l() {
        return this.f3918a.getWidth();
    }
}
