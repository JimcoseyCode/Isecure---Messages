package I4;

import P4.InterfaceC1373g;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: I4.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1091z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r4.m f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f4997b = new AtomicLong(-1);

    C1091z9(Context context, String str) {
        this.f4996a = r4.l.b(context, r4.n.a().b("mlkit:vision").a());
    }

    public static C1091z9 a(Context context) {
        return new C1091z9(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j10, Exception exc) {
        this.f4997b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.f4997b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f4997b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f4996a.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i10, i11, 0, j10, j11, null, null, 0, -1)))).e(new InterfaceC1373g() { // from class: I4.y9
            @Override // P4.InterfaceC1373g
            public final void onFailure(Exception exc) {
                this.f4984a.b(jElapsedRealtime, exc);
            }
        });
    }
}
