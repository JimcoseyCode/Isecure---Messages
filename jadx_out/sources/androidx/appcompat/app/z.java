package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static z f14187d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f14189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f14190c = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f14192b;

        a() {
        }
    }

    z(Context context, LocationManager locationManager) {
        this.f14188a = context;
        this.f14189b = locationManager;
    }

    static z a(Context context) {
        if (f14187d == null) {
            Context applicationContext = context.getApplicationContext();
            f14187d = new z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f14187d;
    }

    private Location b() {
        Location locationC = androidx.core.content.d.b(this.f14188a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.d.b(this.f14188a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f14189b.isProviderEnabled(str)) {
                return this.f14189b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f14190c.f14192b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f14190c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        y yVarB = y.b();
        yVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        yVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = yVarB.f14186c == 1;
        long j11 = yVarB.f14185b;
        long j12 = yVarB.f14184a;
        yVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = yVarB.f14185b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f14191a = z10;
        aVar.f14192b = j10;
    }

    boolean d() {
        a aVar = this.f14190c;
        if (e()) {
            return aVar.f14191a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f14191a;
        }
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
