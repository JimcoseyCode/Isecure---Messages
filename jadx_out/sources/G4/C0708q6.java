package G4;

import P4.InterfaceC1373g;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: G4.q6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r4.m f3342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f3343b = new AtomicLong(-1);

    C0708q6(Context context, String str) {
        this.f3342a = r4.l.b(context, r4.n.a().b("mlkit:vision").a());
    }

    public static C0708q6 a(Context context) {
        return new C0708q6(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j10, Exception exc) {
        this.f3343b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f3343b.get() != -1 && jElapsedRealtime - this.f3343b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f3342a.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(24323, i11, 0, j10, j11, null, null, 0)))).e(new InterfaceC1373g() { // from class: G4.o6
            @Override // P4.InterfaceC1373g
            public final void onFailure(Exception exc) {
                this.f3302a.b(jElapsedRealtime, exc);
            }
        });
    }
}
