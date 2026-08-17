package d8;

import C8.N0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d8.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2351I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f25684k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2351I f25685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2351I f25686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2351I f25687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2351I f25688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2351I f25689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2351I f25690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2351I f25691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2351I f25692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2351I f25693t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2351I f25699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2351I f25701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2351I f25702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f25703j;

    /* JADX INFO: renamed from: d8.I$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: d8.I$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25704a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f593l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f592k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25704a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        C2351I c2351i = new C2351I(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f25685l = c2351i;
        C2351I c2351i2 = new C2351I(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f25686m = c2351i2;
        f25687n = new C2351I(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f25688o = new C2351I(z10, z11, z12, z13, z14, c2351i, false, null, null, z15, 988, null);
        f25689p = new C2351I(false, false, z15, false, false, c2351i2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z16 = false;
        C2351I c2351i3 = null;
        C2351I c2351i4 = null;
        f25690q = new C2351I(z10, true, z12, z13, z14, c2351i, z16, c2351i3, c2351i4, z15, 988, defaultConstructorMarker);
        boolean z17 = false;
        boolean z18 = true;
        f25691r = new C2351I(z10, z17, z12, z18, z14, c2351i, z16, c2351i3, c2351i4, z15, 983, defaultConstructorMarker);
        f25692s = new C2351I(z10, z17, z12, z18, z14, c2351i, z16, c2351i3, c2351i4, z15, 919, defaultConstructorMarker);
        f25693t = new C2351I(z10, z17, true, false, z14, c2351i, z16, c2351i3, c2351i4, z15, 984, defaultConstructorMarker);
    }

    public C2351I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C2351I c2351i, boolean z15, C2351I c2351i2, C2351I c2351i3, boolean z16) {
        this.f25694a = z10;
        this.f25695b = z11;
        this.f25696c = z12;
        this.f25697d = z13;
        this.f25698e = z14;
        this.f25699f = c2351i;
        this.f25700g = z15;
        this.f25701h = c2351i2;
        this.f25702i = c2351i3;
        this.f25703j = z16;
    }

    public final boolean a() {
        return this.f25700g;
    }

    public final boolean b() {
        return this.f25703j;
    }

    public final boolean c() {
        return this.f25695b;
    }

    public final boolean d() {
        return this.f25694a;
    }

    public final boolean e() {
        return this.f25696c;
    }

    public final C2351I f(N0 effectiveVariance, boolean z10) {
        AbstractC2855l.g(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f25696c) {
            int i10 = b.f25704a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                C2351I c2351i = this.f25701h;
                if (c2351i != null) {
                    return c2351i;
                }
            } else if (i10 != 2) {
                C2351I c2351i2 = this.f25699f;
                if (c2351i2 != null) {
                    return c2351i2;
                }
            } else {
                C2351I c2351i3 = this.f25702i;
                if (c2351i3 != null) {
                    return c2351i3;
                }
            }
        }
        return this;
    }

    public final C2351I g() {
        return new C2351I(this.f25694a, true, this.f25696c, this.f25697d, this.f25698e, this.f25699f, this.f25700g, this.f25701h, this.f25702i, false, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2351I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C2351I c2351i, boolean z15, C2351I c2351i2, C2351I c2351i3, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        c2351i = (i10 & 32) != 0 ? null : c2351i;
        this(z10, z11, z12, z13, z14, c2351i, (i10 & 64) != 0 ? true : z15, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? c2351i : c2351i2, (i10 & 256) != 0 ? c2351i : c2351i3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z16);
    }
}
