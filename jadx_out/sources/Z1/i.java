package z1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f34201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34202d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f34203i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f34204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f34205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f34206c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f34208e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f34207d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f34209f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f34210g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f34211h = 4194304;

        static {
            f34203i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f34208e = f34203i;
            this.f34204a = context;
            this.f34205b = (ActivityManager) context.getSystemService("activity");
            this.f34206c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f34205b)) {
                return;
            }
            this.f34208e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f34212a;

        b(DisplayMetrics displayMetrics) {
            this.f34212a = displayMetrics;
        }

        @Override // z1.i.c
        public int a() {
            return this.f34212a.heightPixels;
        }

        @Override // z1.i.c
        public int b() {
            return this.f34212a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f34201c = aVar.f34204a;
        int i10 = e(aVar.f34205b) ? aVar.f34211h / 2 : aVar.f34211h;
        this.f34202d = i10;
        int iC = c(aVar.f34205b, aVar.f34209f, aVar.f34210g);
        float fB = aVar.f34206c.b() * aVar.f34206c.a() * 4;
        int iRound = Math.round(aVar.f34208e * fB);
        int iRound2 = Math.round(fB * aVar.f34207d);
        int i11 = iC - i10;
        if (iRound2 + iRound <= i11) {
            this.f34200b = iRound2;
            this.f34199a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f34208e;
            float f12 = aVar.f34207d;
            float f13 = f10 / (f11 + f12);
            this.f34200b = Math.round(f12 * f13);
            this.f34199a = Math.round(f13 * aVar.f34208e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            f(this.f34200b);
            f(this.f34199a);
            f(i10);
            f(iC);
            aVar.f34205b.getMemoryClass();
            e(aVar.f34205b);
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f34201c, i10);
    }

    public int a() {
        return this.f34202d;
    }

    public int b() {
        return this.f34199a;
    }

    public int d() {
        return this.f34200b;
    }
}
