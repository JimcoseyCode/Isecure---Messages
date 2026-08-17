package Y8;

import R8.AbstractC1430q0;
import R8.J;
import W8.F;
import W8.H;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1430q0 implements Executor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f13124j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final J f13125k = J.N0(k.f13142i, H.e("kotlinx.coroutines.io.parallelism", B7.d.d(64, F.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        f13125k.J0(jVar, runnable);
    }

    @Override // R8.J
    public void K0(n7.j jVar, Runnable runnable) {
        f13125k.K0(jVar, runnable);
    }

    @Override // R8.J
    public J M0(int i10, String str) {
        return k.f13142i.M0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        J0(n7.k.f30068g, runnable);
    }

    @Override // R8.J
    public String toString() {
        return "Dispatchers.IO";
    }
}
