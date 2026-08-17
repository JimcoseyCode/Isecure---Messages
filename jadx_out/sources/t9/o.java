package t9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class o extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private G f32611f;

    public o(G delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f32611f = delegate;
    }

    @Override // t9.G
    public G a() {
        return this.f32611f.a();
    }

    @Override // t9.G
    public G b() {
        return this.f32611f.b();
    }

    @Override // t9.G
    public long c() {
        return this.f32611f.c();
    }

    @Override // t9.G
    public G d(long j10) {
        return this.f32611f.d(j10);
    }

    @Override // t9.G
    public boolean e() {
        return this.f32611f.e();
    }

    @Override // t9.G
    public void f() throws InterruptedIOException {
        this.f32611f.f();
    }

    @Override // t9.G
    public G g(long j10, TimeUnit unit) {
        AbstractC2855l.g(unit, "unit");
        return this.f32611f.g(j10, unit);
    }

    @Override // t9.G
    public long h() {
        return this.f32611f.h();
    }

    public final G i() {
        return this.f32611f;
    }

    public final o j(G delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f32611f = delegate;
        return this;
    }
}
