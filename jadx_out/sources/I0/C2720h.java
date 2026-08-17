package i0;

import F.v1;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import com.facebook.react.uimanager.events.PointerEventHelper;
import g0.p0;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: i0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2720h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f28670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f28671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraUseInconsistentTimebaseQuirk f28672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28673d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v1 f28674e;

    /* JADX INFO: renamed from: i0.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28675a;

        static {
            int[] iArr = new int[v1.values().length];
            f28675a = iArr;
            try {
                iArr[v1.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28675a[v1.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C2720h(p0 p0Var, v1 v1Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f28670a = p0Var;
        this.f28671b = v1Var;
        this.f28672c = cameraUseInconsistentTimebaseQuirk;
    }

    private long a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long jA = this.f28670a.a();
            long jB = this.f28670a.b();
            long jA2 = this.f28670a.a();
            long j12 = jA2 - jA;
            if (i10 == 0 || j12 < j10) {
                j11 = jB - ((jA + jA2) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0L, j11);
    }

    private boolean c() {
        return this.f28670a.b() - this.f28670a.a() > 3000000;
    }

    private boolean d(long j10) {
        return Math.abs(j10 - this.f28670a.b()) < Math.abs(j10 - this.f28670a.a());
    }

    private v1 e(long j10) {
        boolean z10;
        String str;
        if (this.f28672c != null) {
            AbstractC3583h0.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else {
            if (!c()) {
                return this.f28671b;
            }
            z10 = true;
        }
        v1 v1Var = d(j10) ? v1.REALTIME : v1.UPTIME;
        if (!z10 || v1Var == this.f28671b) {
            AbstractC3583h0.a("VideoTimebaseConverter", "Detect input timebase = " + v1Var);
            return v1Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        AbstractC3583h0.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.f28671b, v1Var));
        return v1Var;
    }

    public long b(long j10) {
        if (this.f28674e == null) {
            this.f28674e = e(j10);
        }
        int i10 = a.f28675a[this.f28674e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return j10;
            }
            throw new AssertionError("Unknown timebase: " + this.f28674e);
        }
        if (this.f28673d == -1) {
            this.f28673d = a();
            AbstractC3583h0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f28673d);
        }
        return j10 - this.f28673d;
    }
}
