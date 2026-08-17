package J6;

import I6.g;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import j7.AbstractC2793j;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: J6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1274d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f6591J = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Void f6592K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f6593L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f6594M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static short f6595N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private i f6596A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f6597B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private e f6598C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f6599D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f6600E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f6601F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f6602G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f6603H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f6604I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f6605a = new int[12];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f6607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f6609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WritableArray f6616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WritableArray f6617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0060d[] f6620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f6622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short f6623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f6624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f6625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f6629y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6630z;

    /* JADX INFO: renamed from: J6.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1274d handler, MotionEvent event, IllegalArgumentException e10) {
            super(P8.q.j("\n    handler: " + kotlin.jvm.internal.D.b(handler.getClass()).o() + "\n    state: " + handler.S() + "\n    view: " + handler.W() + "\n    orchestrator: " + handler.P() + "\n    isEnabled: " + handler.d0() + "\n    isActive: " + handler.Z() + "\n    isAwaiting: " + handler.a0() + "\n    trackedPointersCount: " + handler.f6606b + "\n    trackedPointers: " + AbstractC2793j.Z(handler.f6605a, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + event + "\n      "), e10);
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(event, "event");
            AbstractC2855l.g(e10, "e");
        }
    }

    /* JADX INFO: renamed from: J6.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int i10) {
            if (AbstractC1274d.f6593L == null) {
                AbstractC1274d.f6593L = new MotionEvent.PointerProperties[12];
                AbstractC1274d.f6594M = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = AbstractC1274d.f6593L;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    AbstractC2855l.y("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = i10 - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = AbstractC1274d.f6593L;
                if (pointerPropertiesArr2 == null) {
                    AbstractC2855l.y("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = AbstractC1274d.f6594M;
                if (pointerCoordsArr2 == null) {
                    AbstractC2855l.y("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                i10--;
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: J6.d$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6631a = new a(null);

        /* JADX INFO: renamed from: J6.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(AbstractC1274d abstractC1274d, ReadableMap readableMap) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("hitSlop"));
                    abstractC1274d.z0(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                AbstractC2855l.d(map);
                float pixelFromDIP2 = map.hasKey("horizontal") ? PixelUtil.toPixelFromDIP(map.getDouble("horizontal")) : Float.NaN;
                float pixelFromDIP3 = pixelFromDIP2;
                float pixelFromDIP4 = map.hasKey("vertical") ? PixelUtil.toPixelFromDIP(map.getDouble("vertical")) : Float.NaN;
                float pixelFromDIP5 = pixelFromDIP4;
                if (map.hasKey(ViewProps.LEFT)) {
                    pixelFromDIP2 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.LEFT));
                }
                float f10 = pixelFromDIP2;
                if (map.hasKey(ViewProps.TOP)) {
                    pixelFromDIP4 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.TOP));
                }
                float f11 = pixelFromDIP4;
                if (map.hasKey(ViewProps.RIGHT)) {
                    pixelFromDIP3 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.RIGHT));
                }
                float f12 = pixelFromDIP3;
                if (map.hasKey(ViewProps.BOTTOM)) {
                    pixelFromDIP5 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.BOTTOM));
                }
                abstractC1274d.z0(f10, f11, f12, pixelFromDIP5, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
            }

            private a() {
            }
        }

        protected abstract AbstractC1274d a(Context context);

        public final AbstractC1274d b(Context context, int i10) {
            AbstractC1274d abstractC1274dA = a(context);
            abstractC1274dA.I0(i10);
            return abstractC1274dA;
        }

        public abstract K6.b c(AbstractC1274d abstractC1274d);

        public abstract String d();

        public abstract Class e();

        public void f(AbstractC1274d handler, ReadableMap config) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            handler.s0();
            if (config.hasKey("shouldCancelWhenOutside")) {
                handler.G0(config.getBoolean("shouldCancelWhenOutside"));
            }
            if (config.hasKey(ViewProps.ENABLED)) {
                handler.y0(config.getBoolean(ViewProps.ENABLED));
            }
            if (config.hasKey("hitSlop")) {
                f6631a.b(handler, config);
            }
            if (config.hasKey("needsPointerData")) {
                handler.C0(config.getBoolean("needsPointerData"));
            }
            if (config.hasKey("manualActivation")) {
                handler.f6626v = config.getBoolean("manualActivation");
            }
            if (config.hasKey("mouseButton")) {
                handler.B0(config.getInt("mouseButton"));
            }
        }
    }

    /* JADX INFO: renamed from: J6.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0060d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f6633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f6634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f6635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f6636e;

        public C0060d(int i10, float f10, float f11, float f12, float f13) {
            this.f6632a = i10;
            this.f6633b = f10;
            this.f6634c = f11;
            this.f6635d = f12;
            this.f6636e = f13;
        }

        public final float a() {
            return this.f6635d;
        }

        public final float b() {
            return this.f6636e;
        }

        public final int c() {
            return this.f6632a;
        }

        public final float d() {
            return this.f6633b;
        }

        public final float e() {
            return this.f6634c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0060d)) {
                return false;
            }
            C0060d c0060d = (C0060d) obj;
            return this.f6632a == c0060d.f6632a && Float.compare(this.f6633b, c0060d.f6633b) == 0 && Float.compare(this.f6634c, c0060d.f6634c) == 0 && Float.compare(this.f6635d, c0060d.f6635d) == 0 && Float.compare(this.f6636e, c0060d.f6636e) == 0;
        }

        public final void f(float f10) {
            this.f6635d = f10;
        }

        public final void g(float f10) {
            this.f6636e = f10;
        }

        public final void h(float f10) {
            this.f6633b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f6632a) * 31) + Float.hashCode(this.f6633b)) * 31) + Float.hashCode(this.f6634c)) * 31) + Float.hashCode(this.f6635d)) * 31) + Float.hashCode(this.f6636e);
        }

        public final void i(float f10) {
            this.f6634c = f10;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f6632a + ", x=" + this.f6633b + ", y=" + this.f6634c + ", absoluteX=" + this.f6635d + ", absoluteY=" + this.f6636e + ")";
        }
    }

    public AbstractC1274d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.f6607c = iArr;
        this.f6614j = true;
        C0060d[] c0060dArr = new C0060d[12];
        for (int i11 = 0; i11 < 12; i11++) {
            c0060dArr[i11] = null;
        }
        this.f6620p = c0060dArr;
        this.f6599D = 3;
    }

    private final void A(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C();
        this.f6616l = null;
        this.f6618n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f6620p[pointerId] = new C0060d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f6607c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f6607c[1]);
        C0060d c0060d = this.f6620p[pointerId];
        AbstractC2855l.d(c0060d);
        n(c0060d);
        this.f6620p[pointerId] = null;
        this.f6619o--;
        y();
    }

    private final void C() {
        this.f6617m = null;
        for (C0060d c0060d : this.f6620p) {
            if (c0060d != null) {
                o(c0060d);
            }
        }
    }

    private final int E() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f6606b) {
            int i11 = 0;
            while (true) {
                iArr = this.f6605a;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private final void F0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f6599D = i10;
    }

    private final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC1274d abstractC1274d) {
        abstractC1274d.q();
    }

    private final boolean b0(int i10) {
        int i11 = this.f6600E;
        return i11 == 0 ? i10 == 1 : (i10 & i11) != 0;
    }

    private final boolean e0(int i10) {
        return this.f6605a[i10] != -1;
    }

    private final void h0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f6610f == i10) {
            return;
        }
        if (this.f6619o > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
            r();
        }
        int i11 = this.f6610f;
        this.f6610f = i10;
        if (i10 == 4) {
            short s10 = f6595N;
            f6595N = (short) (s10 + 1);
            this.f6623s = s10;
        }
        i iVar = this.f6596A;
        AbstractC2855l.d(iVar);
        iVar.A(this, i10, i11);
        p0(i10, i11);
    }

    private final boolean i0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f6606b) {
            return true;
        }
        int length = this.f6605a.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.f6605a[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MotionEvent m(MotionEvent motionEvent) throws a {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        if (!i0(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 2;
        int i11 = 0;
        if (actionMasked == 0) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f6605a[motionEvent.getPointerId(actionIndex)] != -1) {
                i10 = this.f6606b == 1 ? 0 : 5;
            }
        } else if (actionMasked == 1) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f6605a[motionEvent.getPointerId(actionIndex)] != -1) {
                i10 = this.f6606b == 1 ? 1 : 6;
            }
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                i10 = actionMasked;
                actionIndex = -1;
            }
        }
        f6591J.d(this.f6606b);
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        int pointerCount = motionEvent.getPointerCount();
        int i12 = i10;
        int i13 = 0;
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i11 >= pointerCount) {
                break;
            }
            int pointerId = motionEvent.getPointerId(i11);
            if (this.f6605a[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr3 = f6593L;
                if (pointerPropertiesArr3 == null) {
                    AbstractC2855l.y("pointerProps");
                    pointerPropertiesArr3 = null;
                }
                motionEvent.getPointerProperties(i11, pointerPropertiesArr3[i13]);
                MotionEvent.PointerProperties[] pointerPropertiesArr4 = f6593L;
                if (pointerPropertiesArr4 == null) {
                    AbstractC2855l.y("pointerProps");
                    pointerPropertiesArr4 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i13];
                AbstractC2855l.d(pointerProperties);
                pointerProperties.id = this.f6605a[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = f6594M;
                if (pointerCoordsArr3 == null) {
                    AbstractC2855l.y("pointerCoords");
                } else {
                    pointerCoordsArr2 = pointerCoordsArr3;
                }
                motionEvent.getPointerCoords(i11, pointerCoordsArr2[i13]);
                if (i11 == actionIndex) {
                    i12 |= i13 << 8;
                }
                i13++;
            }
            i11++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr5 = f6593L;
        if (pointerPropertiesArr5 == null) {
            AbstractC2855l.y("pointerProps");
            pointerPropertiesArr5 = null;
        }
        if (pointerPropertiesArr5.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = f6594M;
            if (pointerCoordsArr4 == null) {
                AbstractC2855l.y("pointerCoords");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = motionEvent.getDownTime();
                    long eventTime = motionEvent.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr6 = f6593L;
                    if (pointerPropertiesArr6 == null) {
                        AbstractC2855l.y("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr6;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = f6594M;
                    if (pointerCoordsArr5 == null) {
                        AbstractC2855l.y("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i12, i13, pointerPropertiesArr2, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                    AbstractC2855l.f(motionEventObtain, "obtain(...)");
                    float f10 = -rawX;
                    float f11 = -rawY;
                    motionEvent.offsetLocation(f10, f11);
                    motionEventObtain.offsetLocation(f10, f11);
                    return motionEventObtain;
                } catch (IllegalArgumentException e10) {
                    throw new a(this, motionEvent, e10);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = f6594M;
        if (pointerCoordsArr6 == null) {
            AbstractC2855l.y("pointerCoords");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = f6593L;
        if (pointerPropertiesArr7 == null) {
            AbstractC2855l.y("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr7;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerPropertiesArr.length);
    }

    private final void n(C0060d c0060d) {
        if (this.f6616l == null) {
            this.f6616l = Arguments.createArray();
        }
        WritableArray writableArray = this.f6616l;
        AbstractC2855l.d(writableArray);
        writableArray.pushMap(u(c0060d));
    }

    private final void o(C0060d c0060d) {
        if (this.f6617m == null) {
            this.f6617m = Arguments.createArray();
        }
        WritableArray writableArray = this.f6617m;
        AbstractC2855l.d(writableArray);
        writableArray.pushMap(u(c0060d));
    }

    private final void r() {
        this.f6618n = 4;
        this.f6616l = null;
        C();
        for (C0060d c0060d : this.f6620p) {
            if (c0060d != null) {
                n(c0060d);
            }
        }
        this.f6619o = 0;
        AbstractC2793j.r(this.f6620p, null, 0, 0, 6, null);
        y();
    }

    private final WritableMap u(C0060d c0060d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", c0060d.c());
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(c0060d.d()));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(c0060d.e()));
        writableMapCreateMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(c0060d.a()));
        writableMapCreateMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(c0060d.b()));
        return writableMapCreateMap;
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f6616l = null;
        this.f6618n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f6620p[pointerId] = new C0060d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f6607c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f6607c[1]);
        this.f6619o++;
        C0060d c0060d = this.f6620p[pointerId];
        AbstractC2855l.d(c0060d);
        n(c0060d);
        C();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z10) {
        if (this.f6609e != null && this.f6614j != z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: J6.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1274d.b(this.f6590g);
                }
            });
        }
        this.f6614j = z10;
    }

    private final void z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f6616l = null;
        this.f6618n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            C0060d c0060d = this.f6620p[motionEvent.getPointerId(i11)];
            if (c0060d != null && (c0060d.d() != motionEvent.getX(i11) || c0060d.e() != motionEvent.getY(i11))) {
                c0060d.h(motionEvent.getX(i11));
                c0060d.i(motionEvent.getY(i11));
                c0060d.f((motionEvent2.getX(i11) + rawX) - this.f6607c[0]);
                c0060d.g((motionEvent2.getY(i11) + rawY) - this.f6607c[1]);
                n(c0060d);
                i10++;
            }
        }
        if (i10 > 0) {
            C();
            y();
        }
    }

    public final void A0(e eVar) {
        this.f6598C = eVar;
    }

    public final void B() {
        int i10 = this.f6610f;
        if (i10 == 2 || i10 == 4) {
            h0(5);
        }
    }

    protected final void B0(int i10) {
        this.f6600E = i10;
    }

    public final void C0(boolean z10) {
        this.f6621q = z10;
    }

    public final void D() {
        int i10 = this.f6610f;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            k0();
            h0(1);
        }
    }

    protected final void D0(int i10) {
        this.f6629y = i10;
    }

    public final void E0(r rVar) {
        this.f6597B = rVar;
    }

    public final int F() {
        return this.f6615k;
    }

    public final int G() {
        return this.f6601F;
    }

    protected final void G0(boolean z10) {
        this.f6630z = z10;
    }

    public final void H0(boolean z10) {
        this.f6604I = z10;
    }

    public final short I() {
        return this.f6623s;
    }

    public final void I0(int i10) {
        this.f6608d = i10;
    }

    public final float J() {
        return (this.f6624t + this.f6627w) - this.f6607c[0];
    }

    protected final boolean J0(MotionEvent sourceEvent) {
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || b0(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !b0(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float K() {
        return (this.f6625u + this.f6628x) - this.f6607c[1];
    }

    public boolean K0(AbstractC1274d handler) {
        e eVar;
        AbstractC2855l.g(handler, "handler");
        if (handler == this || (eVar = this.f6598C) == null) {
            return false;
        }
        return eVar.d(this, handler);
    }

    public final float L() {
        return this.f6624t;
    }

    public boolean L0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        if (handler == this) {
            return true;
        }
        e eVar = this.f6598C;
        if (eVar != null) {
            return eVar.a(this, handler);
        }
        return false;
    }

    public final float M() {
        return this.f6625u;
    }

    public boolean M0(AbstractC1274d handler) {
        e eVar;
        AbstractC2855l.g(handler, "handler");
        if (handler == this || (eVar = this.f6598C) == null) {
            return false;
        }
        return eVar.b(this, handler);
    }

    public final boolean N() {
        return this.f6621q;
    }

    public final boolean N0(AbstractC1274d handler) {
        e eVar;
        AbstractC2855l.g(handler, "handler");
        if (handler == this || (eVar = this.f6598C) == null) {
            return false;
        }
        return eVar.c(this, handler);
    }

    public final int O() {
        return this.f6629y;
    }

    public final void O0(int i10) {
        if (e0(i10)) {
            return;
        }
        this.f6605a[i10] = E();
        this.f6606b++;
    }

    protected final i P() {
        return this.f6596A;
    }

    public final void P0(int i10) {
        if (e0(i10)) {
            this.f6605a[i10] = -1;
            this.f6606b--;
        }
    }

    public final int Q() {
        return this.f6599D;
    }

    protected final PointF Q0(PointF point) {
        PointF pointFL;
        AbstractC2855l.g(point, "point");
        i iVar = this.f6596A;
        if (iVar != null && (pointFL = iVar.L(this.f6609e, point)) != null) {
            return pointFL;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final boolean R() {
        return this.f6604I;
    }

    public final void R0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            x(event, sourceEvent);
            z(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            z(event, sourceEvent);
            A(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            z(event, sourceEvent);
        }
    }

    public final int S() {
        return this.f6610f;
    }

    public final boolean S0(MotionEvent event) {
        int i10;
        AbstractC2855l.g(event, "event");
        return (!this.f6614j || (i10 = this.f6610f) == 1 || i10 == 3 || i10 == 5 || !e0(event.getPointerId(event.getActionIndex()))) ? false : true;
    }

    public final int T() {
        return this.f6608d;
    }

    public final void T0(InterfaceC3487a closure) {
        AbstractC2855l.g(closure, "closure");
        this.f6613i = true;
        closure.invoke();
        this.f6613i = false;
    }

    public final int U() {
        return this.f6618n;
    }

    public final int V() {
        return this.f6619o;
    }

    public final View W() {
        return this.f6609e;
    }

    public final void X(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i10;
        AbstractC2855l.g(transformedEvent, "transformedEvent");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (!this.f6614j || (i10 = this.f6610f) == 3 || i10 == 1 || i10 == 5 || this.f6606b < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {m(transformedEvent), m(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.f6611g = motionEvent.getX();
            this.f6612h = motionEvent.getY();
            this.f6629y = motionEvent.getPointerCount();
            boolean zG0 = g0(this.f6609e, this.f6611g, this.f6612h);
            this.f6613i = zG0;
            if (this.f6630z && !zG0) {
                int i11 = this.f6610f;
                if (i11 == 4) {
                    q();
                    return;
                } else {
                    if (i11 == 2) {
                        D();
                        return;
                    }
                    return;
                }
            }
            k kVar = k.f6658a;
            this.f6624t = kVar.b(motionEvent, true);
            this.f6625u = kVar.c(motionEvent, true);
            this.f6627w = motionEvent.getRawX() - motionEvent.getX();
            this.f6628x = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                F0(sourceEvent);
            }
            if (com.swmansion.gesturehandler.react.a.c(sourceEvent)) {
                m0(motionEvent, motionEvent2);
            } else {
                l0(motionEvent, motionEvent2);
            }
            if (!AbstractC2855l.b(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (AbstractC2855l.b(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (a unused) {
            D();
        }
    }

    public final boolean Y(AbstractC1274d other) {
        AbstractC2855l.g(other, "other");
        int length = this.f6605a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f6605a[i10] != -1 && other.f6605a[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return this.f6602G;
    }

    public final boolean a0() {
        return this.f6603H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(AbstractC1274d of) {
        View view;
        AbstractC2855l.g(of, "of");
        View view2 = this.f6609e;
        Object parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null) {
                if (AbstractC2855l.b(view, of.f6609e)) {
                    return true;
                }
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            return false;
        }
        view = null;
    }

    public final boolean d0() {
        return this.f6614j;
    }

    public final boolean f0() {
        return this.f6613i;
    }

    public final boolean g0(View view, float f10, float f11) {
        float f12;
        g.a aVar = I6.g.f5050a;
        AbstractC2855l.d(view);
        if (aVar.e(view)) {
            return aVar.c(view, f10, f11);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f6622r;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            b bVar = f6591J;
            float f17 = bVar.c(f13) ? 0.0f - f13 : 0.0f;
            f = bVar.c(f14) ? 0.0f - f14 : 0.0f;
            if (bVar.c(f15)) {
                width += f15;
            }
            if (bVar.c(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (bVar.c(f18)) {
                if (!bVar.c(f13)) {
                    f17 = width - f18;
                } else if (!bVar.c(f15)) {
                    width = f18 + f17;
                }
            }
            if (bVar.c(f19)) {
                if (!bVar.c(f14)) {
                    f = height - f19;
                } else if (!bVar.c(f16)) {
                    height = f19 + f;
                }
            }
            f12 = f;
            f = f17;
        } else {
            f12 = 0.0f;
        }
        return f <= f10 && f10 <= width && f12 <= f11 && f11 <= height;
    }

    public final void k() {
        l(false);
    }

    public void l(boolean z10) {
        if (!this.f6626v || z10) {
            int i10 = this.f6610f;
            if (i10 == 0 || i10 == 2) {
                h0(4);
            }
        }
    }

    protected abstract void l0(MotionEvent motionEvent, MotionEvent motionEvent2);

    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
    }

    public final void p() {
        if (this.f6610f == 0) {
            h0(2);
        }
    }

    public final void q() {
        int i10 = this.f6610f;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f6603H) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, i iVar) {
        if (this.f6609e != null || this.f6596A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f6605a, -1);
        this.f6606b = 0;
        this.f6610f = 0;
        this.f6609e = view;
        this.f6596A = iVar;
        Activity activityH = H(view != null ? view.getContext() : null);
        View viewFindViewById = activityH != null ? activityH.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.f6607c);
        } else {
            int[] iArr = this.f6607c;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        n0();
    }

    public final void r0() {
        this.f6609e = null;
        this.f6596A = null;
        Arrays.fill(this.f6605a, -1);
        this.f6606b = 0;
        this.f6619o = 0;
        AbstractC2793j.r(this.f6620p, null, 0, 0, 6, null);
        this.f6618n = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.f6617m;
        this.f6617m = null;
        return writableArray;
    }

    public void s0() {
        this.f6621q = false;
        this.f6626v = false;
        this.f6630z = false;
        y0(true);
        this.f6622r = (float[]) f6592K;
        this.f6600E = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.f6616l;
        this.f6616l = null;
        return writableArray;
    }

    public String toString() {
        String simpleName;
        View view = this.f6609e;
        if (view == null) {
            simpleName = null;
        } else {
            AbstractC2855l.d(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f6608d + "]:" + simpleName;
    }

    public final void u0(int i10) {
        this.f6615k = i10;
    }

    public void v(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        r rVar = this.f6597B;
        if (rVar != null) {
            rVar.b(this, event);
        }
    }

    public final void v0(int i10) {
        this.f6601F = i10;
    }

    public void w(int i10, int i11) {
        r rVar = this.f6597B;
        if (rVar != null) {
            rVar.c(this, i10, i11);
        }
    }

    public final void w0(boolean z10) {
        this.f6602G = z10;
    }

    public final void x0(boolean z10) {
        this.f6603H = z10;
    }

    public void y() {
        r rVar;
        if (this.f6616l == null || (rVar = this.f6597B) == null) {
            return;
        }
        rVar.a(this);
    }

    public final void z0(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f6622r == null) {
            this.f6622r = new float[6];
        }
        float[] fArr = this.f6622r;
        AbstractC2855l.d(fArr);
        fArr[0] = f10;
        float[] fArr2 = this.f6622r;
        AbstractC2855l.d(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = this.f6622r;
        AbstractC2855l.d(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = this.f6622r;
        AbstractC2855l.d(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = this.f6622r;
        AbstractC2855l.d(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = this.f6622r;
        AbstractC2855l.d(fArr6);
        fArr6[5] = f15;
        b bVar = f6591J;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (bVar.c(f15) && !bVar.c(f13) && !bVar.c(f11)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    protected void j0() {
    }

    protected void k0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }

    public void t0() {
    }

    protected void p0(int i10, int i11) {
    }
}
