package r4;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: r4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3269j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C3269j f31930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RootTelemetryConfiguration f31931c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RootTelemetryConfiguration f31932a;

    private C3269j() {
    }

    public static synchronized C3269j b() {
        try {
            if (f31930b == null) {
                f31930b = new C3269j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f31930b;
    }

    public RootTelemetryConfiguration a() {
        return this.f31932a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f31932a = f31931c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f31932a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.l0() < rootTelemetryConfiguration.l0()) {
            this.f31932a = rootTelemetryConfiguration;
        }
    }
}
