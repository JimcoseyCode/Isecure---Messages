package Q8;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f9886h = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f9887i = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f9888j = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f9889k = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f9890l = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f9891m = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f9892n = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ d[] f9893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f9894p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeUnit f9895g;

    static {
        d[] dVarArrH = h();
        f9893o = dVarArrH;
        f9894p = AbstractC3083a.a(dVarArrH);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.f9895g = timeUnit;
    }

    private static final /* synthetic */ d[] h() {
        return new d[]{f9886h, f9887i, f9888j, f9889k, f9890l, f9891m, f9892n};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9893o.clone();
    }

    public final TimeUnit j() {
        return this.f9895g;
    }
}
