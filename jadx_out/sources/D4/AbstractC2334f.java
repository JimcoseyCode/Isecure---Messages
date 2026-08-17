package d4;

import android.app.job.JobInfo;
import d4.C2331c;
import g4.InterfaceC2673a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: d4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2334f {

    /* JADX INFO: renamed from: d4.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC2673a f25610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f25611b = new HashMap();

        public a a(U3.e eVar, b bVar) {
            this.f25611b.put(eVar, bVar);
            return this;
        }

        public AbstractC2334f b() {
            if (this.f25610a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f25611b.keySet().size() < U3.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f25611b;
            this.f25611b = new HashMap();
            return AbstractC2334f.d(this.f25610a, map);
        }

        public a c(InterfaceC2673a interfaceC2673a) {
            this.f25610a = interfaceC2673a;
            return this;
        }
    }

    /* JADX INFO: renamed from: d4.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {

        /* JADX INFO: renamed from: d4.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C2331c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    /* JADX INFO: renamed from: d4.f$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static AbstractC2334f d(InterfaceC2673a interfaceC2673a, Map map) {
        return new C2330b(interfaceC2673a, map);
    }

    public static AbstractC2334f f(InterfaceC2673a interfaceC2673a) {
        return b().a(U3.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(U3.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(U3.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC2673a).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, U3.e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, ((b) h().get(eVar)).c());
        return builder;
    }

    abstract InterfaceC2673a e();

    public long g(U3.e eVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
