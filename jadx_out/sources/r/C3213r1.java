package r;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: renamed from: r.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3213r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Size f31477e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Size f31478f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Size f31479g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f31480h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile C3213r1 f31481i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayManager f31482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Size f31483b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v.l f31484c = new v.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.d f31485d = new v.d();

    private C3213r1(Context context) {
        this.f31482a = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
    }

    private Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f31477e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f31484c.a(sizeB);
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (O.d.d(size, f31478f) && (size = this.f31485d.a()) == null) {
            size = f31479g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C3213r1 c(Context context) {
        if (f31481i == null) {
            synchronized (f31480h) {
                try {
                    if (f31481i == null) {
                        f31481i = new C3213r1(context);
                    }
                } finally {
                }
            }
        }
        return f31481i;
    }

    private Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f31482a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z10);
        if (displayE == null && z10) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    Size f() {
        if (this.f31483b != null) {
            return this.f31483b;
        }
        this.f31483b = a();
        return this.f31483b;
    }

    void g() {
        this.f31483b = a();
    }
}
