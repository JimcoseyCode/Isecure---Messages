package r0;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q0.C3109a;
import r0.C3241d;
import s0.C3314c;
import s0.n;
import s0.p;

/* JADX INFO: renamed from: r0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3242e {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static float f31635I0 = 0.5f;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    boolean f31637A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public float[] f31639B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    protected C3242e[] f31641C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    protected C3242e[] f31643D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    C3242e f31645E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    C3242e f31647F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f31649G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f31651H0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f31653J;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C3241d f31664U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C3241d[] f31665V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected ArrayList f31666W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean[] f31667X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public b[] f31668Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C3242e f31669Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f31671a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f31673b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3314c f31674c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f31675c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3314c f31676d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected int f31677d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected int f31679e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected int f31681f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f31683g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f31685h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected int f31687i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected int f31689j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    int f31691k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected int f31693l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f31695m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    float f31697n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f31699o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Object f31701p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f31703q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f31705r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private String f31707s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private String f31709t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f31711u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    boolean f31713v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f31715w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    int f31717x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    int f31719y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    boolean f31721z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31670a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f31672b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0.l f31678e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f31680f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f31682g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f31684h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31686i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31688j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31690k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31692l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31694m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3109a f31696n = new C3109a(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31698o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31700p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31702q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f31704r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31706s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31708t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31710u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31712v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31714w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f31716x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f31718y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31720z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f31636A = 1.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f31638B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f31640C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f31642D = 1.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f31644E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    float f31646F = 1.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int[] f31648G = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f31650H = 0.0f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f31652I = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f31654K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f31655L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f31656M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C3241d f31657N = new C3241d(this, C3241d.b.LEFT);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C3241d f31658O = new C3241d(this, C3241d.b.TOP);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C3241d f31659P = new C3241d(this, C3241d.b.RIGHT);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C3241d f31660Q = new C3241d(this, C3241d.b.BOTTOM);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C3241d f31661R = new C3241d(this, C3241d.b.BASELINE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    C3241d f31662S = new C3241d(this, C3241d.b.CENTER_X);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    C3241d f31663T = new C3241d(this, C3241d.b.CENTER_Y);

    /* JADX INFO: renamed from: r0.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f31723b;

        static {
            int[] iArr = new int[b.values().length];
            f31723b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31723b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31723b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31723b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C3241d.b.values().length];
            f31722a = iArr2;
            try {
                iArr2[C3241d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31722a[C3241d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31722a[C3241d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31722a[C3241d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31722a[C3241d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31722a[C3241d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31722a[C3241d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31722a[C3241d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31722a[C3241d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: r0.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C3242e() {
        C3241d c3241d = new C3241d(this, C3241d.b.CENTER);
        this.f31664U = c3241d;
        this.f31665V = new C3241d[]{this.f31657N, this.f31659P, this.f31658O, this.f31660Q, this.f31661R, c3241d};
        this.f31666W = new ArrayList();
        this.f31667X = new boolean[2];
        b bVar = b.FIXED;
        this.f31668Y = new b[]{bVar, bVar};
        this.f31669Z = null;
        this.f31671a0 = 0;
        this.f31673b0 = 0;
        this.f31675c0 = 0.0f;
        this.f31677d0 = -1;
        this.f31679e0 = 0;
        this.f31681f0 = 0;
        this.f31683g0 = 0;
        this.f31685h0 = 0;
        this.f31687i0 = 0;
        this.f31689j0 = 0;
        this.f31691k0 = 0;
        float f10 = f31635I0;
        this.f31697n0 = f10;
        this.f31699o0 = f10;
        this.f31703q0 = 0;
        this.f31705r0 = 0;
        this.f31707s0 = null;
        this.f31709t0 = null;
        this.f31715w0 = false;
        this.f31717x0 = 0;
        this.f31719y0 = 0;
        this.f31639B0 = new float[]{-1.0f, -1.0f};
        this.f31641C0 = new C3242e[]{null, null};
        this.f31643D0 = new C3242e[]{null, null};
        this.f31645E0 = null;
        this.f31647F0 = null;
        this.f31649G0 = -1;
        this.f31651H0 = -1;
        d();
    }

    private boolean c0(int i10) {
        C3241d c3241d;
        C3241d c3241d2;
        int i11 = i10 * 2;
        C3241d[] c3241dArr = this.f31665V;
        C3241d c3241d3 = c3241dArr[i11];
        C3241d c3241d4 = c3241d3.f31620f;
        return (c3241d4 == null || c3241d4.f31620f == c3241d3 || (c3241d2 = (c3241d = c3241dArr[i11 + 1]).f31620f) == null || c3241d2.f31620f != c3241d) ? false : true;
    }

    private void d() {
        this.f31666W.add(this.f31657N);
        this.f31666W.add(this.f31658O);
        this.f31666W.add(this.f31659P);
        this.f31666W.add(this.f31660Q);
        this.f31666W.add(this.f31662S);
        this.f31666W.add(this.f31663T);
        this.f31666W.add(this.f31664U);
        this.f31666W.add(this.f31661R);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:376:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(o0.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, o0.i iVar, o0.i iVar2, b bVar, boolean z14, C3241d c3241d, C3241d c3241d2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        int i18;
        boolean z21;
        int i19;
        int i20;
        int iMin;
        o0.i iVar3;
        int i21;
        int i22;
        o0.i iVar4;
        int i23;
        o0.i iVar5;
        int i24;
        boolean z22;
        boolean z23;
        int i25;
        o0.i iVarQ;
        o0.i iVarQ2;
        o0.i iVar6;
        int i26;
        char c10;
        char c11;
        C3241d c3241d3;
        boolean z24;
        o0.i iVar7;
        o0.i iVar8;
        o0.i iVar9;
        o0.i iVar10;
        boolean z25;
        boolean z26;
        int i27;
        int i28;
        int i29;
        boolean z27;
        boolean z28;
        C3242e c3242e;
        o0.i iVar11;
        o0.i iVar12;
        C3242e c3242e2;
        C3242e c3242e3;
        boolean z29;
        int i30;
        boolean z30;
        int iMin2;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z31;
        boolean z32;
        C3242e c3242e4;
        int i38;
        C3242e c3242e5;
        o0.d dVar2 = dVar;
        o0.i iVarQ3 = dVar2.q(c3241d);
        o0.i iVarQ4 = dVar2.q(c3241d2);
        o0.i iVarQ5 = dVar2.q(c3241d.j());
        o0.i iVarQ6 = dVar2.q(c3241d2.j());
        o0.d.w();
        boolean zO = c3241d.o();
        boolean zO2 = c3241d2.o();
        boolean zO3 = this.f31664U.o();
        int i39 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i39++;
        }
        int i40 = z15 ? 3 : i14;
        int i41 = a.f31723b[bVar.ordinal()];
        if (i41 != 1 && i41 != 2 && i41 != 3 && i41 == 4) {
            i18 = i40;
            z21 = i18 != 4;
            i19 = this.f31692l;
            if (i19 != -1 && z10) {
                this.f31692l = -1;
                i11 = i19;
                z21 = false;
            }
            i20 = this.f31694m;
            if (i20 != -1 || z10) {
                i20 = i11;
            } else {
                this.f31694m = -1;
                z21 = false;
            }
            int i42 = i20;
            if (this.f31705r0 != 8) {
                iMin = 0;
                z21 = false;
            } else {
                iMin = i42;
            }
            if (z20) {
                iVar3 = iVarQ6;
                i21 = 8;
            } else {
                if (!zO && !zO2 && !zO3) {
                    dVar2.f(iVarQ3, i10);
                } else if (zO && !zO2) {
                    iVar3 = iVarQ6;
                    i21 = 8;
                    dVar2.e(iVarQ3, iVarQ5, c3241d.f(), 8);
                }
                iVar3 = iVarQ6;
                i21 = 8;
            }
            if (z21) {
                if (z14) {
                    dVar2.e(iVarQ4, iVarQ3, 0, 3);
                    if (i12 > 0) {
                        dVar2.h(iVarQ4, iVarQ3, i12, 8);
                    }
                    if (i13 < Integer.MAX_VALUE) {
                        dVar2.j(iVarQ4, iVarQ3, i13, 8);
                    }
                } else {
                    dVar2.e(iVarQ4, iVarQ3, iMin, i21);
                }
                i25 = i17;
                iVar4 = iVarQ4;
                i23 = i39;
                z22 = z21;
                iVar5 = iVar3;
                z23 = z13;
            } else {
                if (i39 == 2 || z15 || !(i18 == 1 || i18 == 0)) {
                    int i43 = i16 == -2 ? iMin : i16;
                    int i44 = i17 == -2 ? iMin : i17;
                    if (iMin > 0 && i18 != 1) {
                        iMin = 0;
                    }
                    if (i43 > 0) {
                        dVar2.h(iVarQ4, iVarQ3, i43, 8);
                        iMin = Math.max(iMin, i43);
                    }
                    if (i44 > 0) {
                        if (!z11 || i18 != 1) {
                            dVar2.j(iVarQ4, iVarQ3, i44, 8);
                        }
                        iMin = Math.min(iMin, i44);
                    }
                    if (i18 == 1) {
                        if (z11) {
                            dVar2.e(iVarQ4, iVarQ3, iMin, 8);
                        } else if (z17) {
                            dVar2.e(iVarQ4, iVarQ3, iMin, 5);
                            dVar2.j(iVarQ4, iVarQ3, iMin, 8);
                        } else {
                            dVar2.e(iVarQ4, iVarQ3, iMin, 5);
                            dVar2.j(iVarQ4, iVarQ3, iMin, 8);
                        }
                        iVar4 = iVarQ4;
                        z22 = z21;
                        iVar5 = iVar3;
                        z23 = z13;
                        i24 = i43;
                        i25 = i44;
                        i23 = i39;
                    } else {
                        if (i18 == 2) {
                            C3241d.b bVarK = c3241d.k();
                            C3241d.b bVar2 = C3241d.b.TOP;
                            if (bVarK == bVar2 || c3241d.k() == C3241d.b.BOTTOM) {
                                iVarQ = dVar2.q(this.f31669Z.o(bVar2));
                                iVarQ2 = dVar2.q(this.f31669Z.o(C3241d.b.BOTTOM));
                            } else {
                                iVarQ = dVar2.q(this.f31669Z.o(C3241d.b.LEFT));
                                iVarQ2 = dVar2.q(this.f31669Z.o(C3241d.b.RIGHT));
                            }
                            o0.i iVar13 = iVarQ2;
                            iVar4 = iVarQ4;
                            i22 = i44;
                            i23 = i39;
                            iVar5 = iVar3;
                            dVar2.d(dVar2.r().k(iVar4, iVarQ3, iVar13, iVarQ, f11));
                            if (z11) {
                                z21 = false;
                            }
                            i24 = i43;
                            z22 = z21;
                            z23 = z13;
                        } else {
                            i22 = i44;
                            iVar4 = iVarQ4;
                            i23 = i39;
                            iVar5 = iVar3;
                            i24 = i43;
                            z22 = z21;
                            z23 = true;
                        }
                        i25 = i22;
                    }
                    if (!z20) {
                        iVar6 = iVar2;
                        i26 = 8;
                        c10 = 1;
                        c11 = 2;
                    } else {
                        if (!z17) {
                            if (!zO && !zO2 && !zO3) {
                                iVar11 = iVar5;
                                i32 = 5;
                                z30 = z11;
                                i38 = i32;
                            } else if (!zO || zO2) {
                                if (!zO && zO2) {
                                    dVar2.e(iVar4, iVar5, -c3241d2.f(), 8);
                                    if (z11) {
                                        if (this.f31688j && iVarQ3.f30408m && (c3242e4 = this.f31669Z) != null) {
                                            C3243f c3243f = (C3243f) c3242e4;
                                            if (z10) {
                                                c3243f.t1(c3241d);
                                            } else {
                                                c3243f.y1(c3241d);
                                            }
                                        } else {
                                            i32 = 5;
                                            dVar2.h(iVarQ3, iVar, 0, 5);
                                            iVar11 = iVar5;
                                            z30 = z11;
                                            i38 = i32;
                                        }
                                    }
                                } else if (zO && zO2) {
                                    C3242e c3242e6 = c3241d.f31620f.f31618d;
                                    C3242e c3242e7 = c3241d2.f31620f.f31618d;
                                    C3242e c3242eK = K();
                                    int i45 = 6;
                                    if (z22) {
                                        if (i18 == 0) {
                                            if (i25 != 0 || i24 != 0) {
                                                i36 = 5;
                                                i37 = 5;
                                                z31 = true;
                                                z32 = false;
                                                z25 = true;
                                            } else if (iVarQ5.f30408m && iVar5.f30408m) {
                                                dVar2.e(iVarQ3, iVarQ5, c3241d.f(), 8);
                                                dVar2.e(iVar4, iVar5, -c3241d2.f(), 8);
                                                return;
                                            } else {
                                                i36 = 8;
                                                i37 = 8;
                                                z31 = false;
                                                z32 = true;
                                                z25 = false;
                                            }
                                            if ((c3242e6 instanceof C3238a) || (c3242e7 instanceof C3238a)) {
                                                o0.i iVar14 = iVar5;
                                                iVar7 = iVarQ3;
                                                iVar8 = iVar14;
                                                z26 = z31;
                                                z27 = z32;
                                                z24 = true;
                                                i29 = 4;
                                            } else {
                                                o0.i iVar15 = iVar5;
                                                iVar7 = iVarQ3;
                                                iVar8 = iVar15;
                                                i29 = i37;
                                                z26 = z31;
                                                z27 = z32;
                                                z24 = true;
                                            }
                                            i28 = i36;
                                            iVar9 = iVarQ5;
                                            i27 = 6;
                                        } else {
                                            if (i18 == 2) {
                                                if ((c3242e6 instanceof C3238a) || (c3242e7 instanceof C3238a)) {
                                                    o0.i iVar16 = iVar5;
                                                    iVar7 = iVarQ3;
                                                    iVar8 = iVar16;
                                                    iVar9 = iVarQ5;
                                                    i27 = 6;
                                                    z24 = true;
                                                    i29 = 4;
                                                } else {
                                                    o0.i iVar17 = iVar5;
                                                    iVar7 = iVarQ3;
                                                    iVar8 = iVar17;
                                                    iVar9 = iVarQ5;
                                                    i27 = 6;
                                                    z24 = true;
                                                    i29 = 5;
                                                }
                                                i28 = 5;
                                            } else if (i18 == 1) {
                                                o0.i iVar18 = iVar5;
                                                iVar7 = iVarQ3;
                                                iVar8 = iVar18;
                                                iVar9 = iVarQ5;
                                                i27 = 6;
                                                z24 = true;
                                                i29 = 4;
                                                i28 = 8;
                                            } else if (i18 != 3) {
                                                z24 = true;
                                                o0.i iVar19 = iVar5;
                                                iVar7 = iVarQ3;
                                                iVar8 = iVar19;
                                                dVar2 = dVar;
                                                iVar9 = iVarQ5;
                                                i27 = 6;
                                                i29 = 4;
                                                i28 = 5;
                                                z25 = false;
                                                z26 = false;
                                                z27 = false;
                                            } else if (this.f31644E == -1) {
                                                if (z18) {
                                                    o0.i iVar20 = iVar5;
                                                    iVar7 = iVarQ3;
                                                    iVar8 = iVar20;
                                                    dVar2 = dVar;
                                                    iVar9 = iVarQ5;
                                                    z24 = true;
                                                    i27 = z11 ? 5 : 4;
                                                } else {
                                                    o0.i iVar21 = iVar5;
                                                    iVar7 = iVarQ3;
                                                    iVar8 = iVar21;
                                                    dVar2 = dVar;
                                                    iVar9 = iVarQ5;
                                                    z24 = true;
                                                    i27 = 8;
                                                }
                                                i29 = 5;
                                                i28 = 8;
                                                z25 = true;
                                                z26 = true;
                                                z27 = true;
                                            } else {
                                                if (z15) {
                                                    if (i15 != 2) {
                                                        z24 = true;
                                                        if (i15 != 1) {
                                                            i34 = 8;
                                                            i35 = 5;
                                                        }
                                                        o0.i iVar22 = iVar5;
                                                        iVar7 = iVarQ3;
                                                        iVar8 = iVar22;
                                                        i28 = i34;
                                                        i29 = i35;
                                                        z25 = z24;
                                                        z26 = z25;
                                                        z27 = z26;
                                                        iVar9 = iVarQ5;
                                                        i27 = 6;
                                                    } else {
                                                        z24 = true;
                                                    }
                                                    i34 = 5;
                                                    i35 = 4;
                                                    o0.i iVar222 = iVar5;
                                                    iVar7 = iVarQ3;
                                                    iVar8 = iVar222;
                                                    i28 = i34;
                                                    i29 = i35;
                                                    z25 = z24;
                                                    z26 = z25;
                                                    z27 = z26;
                                                    iVar9 = iVarQ5;
                                                    i27 = 6;
                                                } else {
                                                    z24 = true;
                                                    if (i25 > 0) {
                                                        o0.i iVar23 = iVar5;
                                                        iVar7 = iVarQ3;
                                                        iVar8 = iVar23;
                                                        dVar2 = dVar;
                                                        z25 = true;
                                                        z26 = true;
                                                        z27 = true;
                                                        iVar9 = iVarQ5;
                                                        i27 = 6;
                                                        i29 = 5;
                                                    } else if (i25 != 0 || i24 != 0) {
                                                        o0.i iVar24 = iVar5;
                                                        iVar7 = iVarQ3;
                                                        iVar8 = iVar24;
                                                        dVar2 = dVar;
                                                        z25 = true;
                                                        z26 = true;
                                                        z27 = true;
                                                        iVar9 = iVarQ5;
                                                        i27 = 6;
                                                        i29 = 4;
                                                    } else if (z18) {
                                                        o0.i iVar25 = iVar5;
                                                        iVar7 = iVarQ3;
                                                        iVar8 = iVar25;
                                                        i28 = (c3242e6 == c3242eK || c3242e7 == c3242eK) ? 5 : 4;
                                                        z25 = true;
                                                        z26 = true;
                                                        z27 = true;
                                                        iVar9 = iVarQ5;
                                                        i27 = 6;
                                                        i29 = 4;
                                                    } else {
                                                        o0.i iVar26 = iVar5;
                                                        iVar7 = iVarQ3;
                                                        iVar8 = iVar26;
                                                        dVar2 = dVar;
                                                        z25 = true;
                                                        z26 = true;
                                                        z27 = true;
                                                        iVar9 = iVarQ5;
                                                        i27 = 6;
                                                        i29 = 8;
                                                    }
                                                    i28 = 5;
                                                }
                                                dVar2 = dVar;
                                            }
                                            z25 = true;
                                            z26 = true;
                                            z27 = false;
                                        }
                                        iVar10 = iVar2;
                                    } else {
                                        z24 = true;
                                        if (iVarQ5.f30408m && iVar5.f30408m) {
                                            o0.i iVar27 = iVar5;
                                            dVar.c(iVarQ3, iVarQ5, c3241d.f(), f10, iVar27, iVar4, c3241d2.f(), 8);
                                            if (z11 && z23) {
                                                int iF = c3241d2.f31620f != null ? c3241d2.f() : 0;
                                                if (iVar27 != iVar2) {
                                                    dVar.h(iVar2, iVar4, iF, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        o0.i iVar28 = iVar5;
                                        iVar7 = iVarQ3;
                                        iVar8 = iVar28;
                                        dVar2 = dVar;
                                        iVar9 = iVarQ5;
                                        iVar10 = iVar2;
                                        z25 = true;
                                        z26 = true;
                                        i27 = 6;
                                        i28 = 5;
                                        i29 = 4;
                                        z27 = false;
                                    }
                                    if (z25 && iVar9 == iVar8 && c3242e6 != c3242eK) {
                                        z25 = false;
                                        z28 = false;
                                    } else {
                                        z28 = z24;
                                    }
                                    if (z26) {
                                        if (z22 || z16 || z18 || iVar9 != iVar || iVar8 != iVar10) {
                                            z29 = z24;
                                            i33 = i27;
                                            z30 = z11;
                                        } else {
                                            z29 = z24;
                                            i33 = 8;
                                            z30 = false;
                                            i28 = 8;
                                            z28 = false;
                                        }
                                        o0.i iVar29 = iVar7;
                                        c3242e = c3242e6;
                                        c3242e2 = c3242e7;
                                        c3242e3 = c3242eK;
                                        i30 = 8;
                                        o0.i iVar30 = iVar4;
                                        dVar2.c(iVar29, iVar9, c3241d.f(), f10, iVar8, iVar30, c3241d2.f(), i33);
                                        o0.i iVar31 = iVar8;
                                        iVar12 = iVar29;
                                        iVar11 = iVar31;
                                        iVar4 = iVar30;
                                    } else {
                                        o0.i iVar32 = iVar7;
                                        c3242e = c3242e6;
                                        iVar11 = iVar8;
                                        iVar12 = iVar32;
                                        c3242e2 = c3242e7;
                                        c3242e3 = c3242eK;
                                        z29 = z24;
                                        i30 = 8;
                                        z30 = z11;
                                    }
                                    if (this.f31705r0 == i30 && !c3241d2.m()) {
                                        return;
                                    }
                                    if (z25) {
                                        int i46 = (!z30 || iVar9 == iVar11 || z22 || !((c3242e instanceof C3238a) || (c3242e2 instanceof C3238a))) ? i28 : 6;
                                        dVar2.h(iVar12, iVar9, c3241d.f(), i46);
                                        dVar2.j(iVar4, iVar11, -c3241d2.f(), i46);
                                        i28 = i46;
                                    }
                                    if (!z30 || !z19 || (c3242e instanceof C3238a) || (c3242e2 instanceof C3238a) || c3242e2 == c3242e3) {
                                        iMin2 = i29;
                                        i31 = i28;
                                        z29 = z28;
                                    } else {
                                        iMin2 = 6;
                                        i31 = 6;
                                    }
                                    if (z29) {
                                        if (z27 && (!z18 || z12)) {
                                            if (c3242e != c3242e3 && c3242e2 != c3242e3) {
                                                i45 = iMin2;
                                            }
                                            if ((c3242e instanceof C3245h) || (c3242e2 instanceof C3245h)) {
                                                i45 = 5;
                                            }
                                            if ((c3242e instanceof C3238a) || (c3242e2 instanceof C3238a)) {
                                                i45 = 5;
                                            }
                                            iMin2 = Math.max(z18 ? 5 : i45, iMin2);
                                        }
                                        if (z30) {
                                            iMin2 = Math.min(i31, iMin2);
                                            if (z15 && !z18 && (c3242e == c3242e3 || c3242e2 == c3242e3)) {
                                                iMin2 = 4;
                                            }
                                        }
                                        dVar2.e(iVar12, iVar9, c3241d.f(), iMin2);
                                        dVar2.e(iVar4, iVar11, -c3241d2.f(), iMin2);
                                    }
                                    if (z30) {
                                        int iF2 = iVar == iVar9 ? c3241d.f() : 0;
                                        if (iVar9 != iVar) {
                                            dVar2.h(iVar12, iVar, iF2, 5);
                                        }
                                    }
                                    if (!z30 || !z22 || i12 != 0 || i24 != 0) {
                                        i32 = 5;
                                        i38 = i32;
                                    } else if (z22 && i18 == 3) {
                                        dVar2.h(iVar4, iVar12, 0, i30);
                                        i32 = 5;
                                        i38 = i32;
                                    } else {
                                        i32 = 5;
                                        dVar2.h(iVar4, iVar12, 0, 5);
                                        i38 = i32;
                                    }
                                }
                                iVar11 = iVar5;
                                i32 = 5;
                                z30 = z11;
                                i38 = i32;
                            } else {
                                i38 = (z11 && (c3241d.f31620f.f31618d instanceof C3238a)) ? 8 : 5;
                                z30 = z11;
                                iVar11 = iVar5;
                            }
                            if (z30 && z23) {
                                int iF3 = c3241d2.f31620f != null ? c3241d2.f() : 0;
                                if (iVar11 != iVar2) {
                                    if (!this.f31688j || !iVar4.f30408m || (c3242e5 = this.f31669Z) == null) {
                                        dVar2.h(iVar2, iVar4, iF3, i38);
                                        return;
                                    }
                                    C3243f c3243f2 = (C3243f) c3242e5;
                                    if (z10) {
                                        c3243f2.s1(c3241d2);
                                        return;
                                    } else {
                                        c3243f2.x1(c3241d2);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        iVar6 = iVar2;
                        c11 = 2;
                        i26 = 8;
                        c10 = 1;
                    }
                    if (i23 < c11 && z11 && z23) {
                        dVar2.h(iVarQ3, iVar, 0, i26);
                        char c12 = (z10 || this.f31661R.f31620f == null) ? c10 : (char) 0;
                        if (!z10 && (c3241d3 = this.f31661R.f31620f) != null) {
                            C3242e c3242e8 = c3241d3.f31618d;
                            if (c3242e8.f31675c0 != 0.0f) {
                                b[] bVarArr = c3242e8.f31668Y;
                                b bVar3 = bVarArr[0];
                                b bVar4 = b.MATCH_CONSTRAINT;
                                c12 = (bVar3 == bVar4 && bVarArr[c10] == bVar4) ? c10 : (char) 0;
                            }
                        }
                        if (c12 != 0) {
                            dVar2.h(iVar6, iVar4, 0, i26);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int iMax = Math.max(i16, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                dVar2.e(iVarQ4, iVarQ3, iMax, 8);
                z23 = z13;
                i25 = i17;
                iVar4 = iVarQ4;
                i23 = i39;
                iVar5 = iVar3;
                z22 = false;
            }
            i24 = i16;
            if (!z20) {
            }
            if (i23 < c11) {
                return;
            } else {
                return;
            }
        }
        i18 = i40;
        i19 = this.f31692l;
        if (i19 != -1) {
            this.f31692l = -1;
            i11 = i19;
            z21 = false;
        }
        i20 = this.f31694m;
        if (i20 != -1) {
            i20 = i11;
        }
        int i422 = i20;
        if (this.f31705r0 != 8) {
        }
        if (z20) {
        }
        if (z21) {
        }
        i24 = i16;
        if (!z20) {
        }
        if (i23 < c11) {
        }
    }

    public b A() {
        return this.f31668Y[0];
    }

    public void A0(int i10) {
        this.f31657N.t(i10);
        this.f31679e0 = i10;
    }

    public int B() {
        C3241d c3241d = this.f31657N;
        int i10 = c3241d != null ? c3241d.f31621g : 0;
        C3241d c3241d2 = this.f31659P;
        return c3241d2 != null ? i10 + c3241d2.f31621g : i10;
    }

    public void B0(int i10) {
        this.f31658O.t(i10);
        this.f31681f0 = i10;
    }

    public int C() {
        return this.f31655L;
    }

    public void C0(int i10, int i11) {
        if (this.f31700p) {
            return;
        }
        this.f31658O.t(i10);
        this.f31660Q.t(i11);
        this.f31681f0 = i10;
        this.f31673b0 = i11 - i10;
        if (this.f31652I) {
            this.f31661R.t(i10 + this.f31691k0);
        }
        this.f31700p = true;
    }

    public int D() {
        return this.f31656M;
    }

    public void D0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f31679e0 = i10;
        this.f31681f0 = i11;
        if (this.f31705r0 == 8) {
            this.f31671a0 = 0;
            this.f31673b0 = 0;
            return;
        }
        b[] bVarArr = this.f31668Y;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f31671a0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f31673b0)) {
            i17 = i14;
        }
        this.f31671a0 = i16;
        this.f31673b0 = i17;
        int i18 = this.f31695m0;
        if (i17 < i18) {
            this.f31673b0 = i18;
        }
        int i19 = this.f31693l0;
        if (i16 < i19) {
            this.f31671a0 = i19;
        }
        int i20 = this.f31720z;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f31671a0 = Math.min(this.f31671a0, i20);
        }
        int i21 = this.f31640C;
        if (i21 > 0 && this.f31668Y[1] == b.MATCH_CONSTRAINT) {
            this.f31673b0 = Math.min(this.f31673b0, i21);
        }
        int i22 = this.f31671a0;
        if (i16 != i22) {
            this.f31692l = i22;
        }
        int i23 = this.f31673b0;
        if (i17 != i23) {
            this.f31694m = i23;
        }
    }

    public int E(int i10) {
        if (i10 == 0) {
            return T();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    public void E0(boolean z10) {
        this.f31652I = z10;
    }

    public int F() {
        return this.f31648G[1];
    }

    public void F0(int i10) {
        this.f31673b0 = i10;
        int i11 = this.f31695m0;
        if (i10 < i11) {
            this.f31673b0 = i11;
        }
    }

    public int G() {
        return this.f31648G[0];
    }

    public void G0(float f10) {
        this.f31697n0 = f10;
    }

    public int H() {
        return this.f31695m0;
    }

    public void H0(int i10) {
        this.f31717x0 = i10;
    }

    public int I() {
        return this.f31693l0;
    }

    public void I0(int i10, int i11) {
        this.f31679e0 = i10;
        int i12 = i11 - i10;
        this.f31671a0 = i12;
        int i13 = this.f31693l0;
        if (i12 < i13) {
            this.f31671a0 = i13;
        }
    }

    public C3242e J(int i10) {
        C3241d c3241d;
        C3241d c3241d2;
        if (i10 != 0) {
            if (i10 == 1 && (c3241d2 = (c3241d = this.f31660Q).f31620f) != null && c3241d2.f31620f == c3241d) {
                return c3241d2.f31618d;
            }
            return null;
        }
        C3241d c3241d3 = this.f31659P;
        C3241d c3241d4 = c3241d3.f31620f;
        if (c3241d4 == null || c3241d4.f31620f != c3241d3) {
            return null;
        }
        return c3241d4.f31618d;
    }

    public void J0(b bVar) {
        this.f31668Y[0] = bVar;
    }

    public C3242e K() {
        return this.f31669Z;
    }

    public void K0(int i10, int i11, int i12, float f10) {
        this.f31712v = i10;
        this.f31718y = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f31720z = i12;
        this.f31636A = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f31712v = 2;
    }

    public C3242e L(int i10) {
        C3241d c3241d;
        C3241d c3241d2;
        if (i10 != 0) {
            if (i10 == 1 && (c3241d2 = (c3241d = this.f31658O).f31620f) != null && c3241d2.f31620f == c3241d) {
                return c3241d2.f31618d;
            }
            return null;
        }
        C3241d c3241d3 = this.f31657N;
        C3241d c3241d4 = c3241d3.f31620f;
        if (c3241d4 == null || c3241d4.f31620f != c3241d3) {
            return null;
        }
        return c3241d4.f31618d;
    }

    public void L0(float f10) {
        this.f31639B0[0] = f10;
    }

    public int M() {
        return U() + this.f31671a0;
    }

    protected void M0(int i10, boolean z10) {
        this.f31667X[i10] = z10;
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f31678e;
        }
        if (i10 == 1) {
            return this.f31680f;
        }
        return null;
    }

    public void N0(boolean z10) {
        this.f31653J = z10;
    }

    public float O() {
        return this.f31699o0;
    }

    public void O0(boolean z10) {
        this.f31654K = z10;
    }

    public int P() {
        return this.f31719y0;
    }

    public void P0(int i10, int i11) {
        this.f31655L = i10;
        this.f31656M = i11;
        S0(false);
    }

    public b Q() {
        return this.f31668Y[1];
    }

    public void Q0(int i10) {
        this.f31648G[1] = i10;
    }

    public int R() {
        int i10 = this.f31657N != null ? this.f31658O.f31621g : 0;
        return this.f31659P != null ? i10 + this.f31660Q.f31621g : i10;
    }

    public void R0(int i10) {
        this.f31648G[0] = i10;
    }

    public int S() {
        return this.f31705r0;
    }

    public void S0(boolean z10) {
        this.f31686i = z10;
    }

    public int T() {
        if (this.f31705r0 == 8) {
            return 0;
        }
        return this.f31671a0;
    }

    public void T0(int i10) {
        if (i10 < 0) {
            this.f31695m0 = 0;
        } else {
            this.f31695m0 = i10;
        }
    }

    public int U() {
        C3242e c3242e = this.f31669Z;
        return (c3242e == null || !(c3242e instanceof C3243f)) ? this.f31679e0 : ((C3243f) c3242e).f31735Q0 + this.f31679e0;
    }

    public void U0(int i10) {
        if (i10 < 0) {
            this.f31693l0 = 0;
        } else {
            this.f31693l0 = i10;
        }
    }

    public int V() {
        C3242e c3242e = this.f31669Z;
        return (c3242e == null || !(c3242e instanceof C3243f)) ? this.f31681f0 : ((C3243f) c3242e).f31736R0 + this.f31681f0;
    }

    public void V0(int i10, int i11) {
        this.f31679e0 = i10;
        this.f31681f0 = i11;
    }

    public boolean W() {
        return this.f31652I;
    }

    public void W0(C3242e c3242e) {
        this.f31669Z = c3242e;
    }

    public boolean X(int i10) {
        if (i10 == 0) {
            return (this.f31657N.f31620f != null ? 1 : 0) + (this.f31659P.f31620f != null ? 1 : 0) < 2;
        }
        return ((this.f31658O.f31620f != null ? 1 : 0) + (this.f31660Q.f31620f != null ? 1 : 0)) + (this.f31661R.f31620f != null ? 1 : 0) < 2;
    }

    public void X0(float f10) {
        this.f31699o0 = f10;
    }

    public boolean Y() {
        int size = this.f31666W.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C3241d) this.f31666W.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void Y0(int i10) {
        this.f31719y0 = i10;
    }

    public boolean Z() {
        return (this.f31692l == -1 && this.f31694m == -1) ? false : true;
    }

    public void Z0(int i10, int i11) {
        this.f31681f0 = i10;
        int i12 = i11 - i10;
        this.f31673b0 = i12;
        int i13 = this.f31695m0;
        if (i12 < i13) {
            this.f31673b0 = i13;
        }
    }

    public boolean a0(int i10, int i11) {
        C3241d c3241d;
        C3241d c3241d2;
        if (i10 == 0) {
            C3241d c3241d3 = this.f31657N.f31620f;
            return c3241d3 != null && c3241d3.n() && (c3241d2 = this.f31659P.f31620f) != null && c3241d2.n() && (this.f31659P.f31620f.e() - this.f31659P.f()) - (this.f31657N.f31620f.e() + this.f31657N.f()) >= i11;
        }
        C3241d c3241d4 = this.f31658O.f31620f;
        if (c3241d4 != null && c3241d4.n() && (c3241d = this.f31660Q.f31620f) != null && c3241d.n() && (this.f31660Q.f31620f.e() - this.f31660Q.f()) - (this.f31658O.f31620f.e() + this.f31658O.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void a1(b bVar) {
        this.f31668Y[1] = bVar;
    }

    public void b0(C3241d.b bVar, C3242e c3242e, C3241d.b bVar2, int i10, int i11) {
        o(bVar).b(c3242e.o(bVar2), i10, i11, true);
    }

    public void b1(int i10, int i11, int i12, float f10) {
        this.f31714w = i10;
        this.f31638B = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f31640C = i12;
        this.f31642D = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f31714w = 2;
    }

    public void c1(float f10) {
        this.f31639B0[1] = f10;
    }

    public boolean d0() {
        return this.f31702q;
    }

    public void d1(int i10) {
        this.f31705r0 = i10;
    }

    public void e(C3243f c3243f, o0.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(c3243f, dVar, this);
            hashSet.remove(this);
            g(dVar, c3243f.N1(64));
        }
        if (i10 == 0) {
            HashSet hashSetD = this.f31657N.d();
            if (hashSetD != null) {
                Iterator it = hashSetD.iterator();
                while (it.hasNext()) {
                    ((C3241d) it.next()).f31618d.e(c3243f, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSetD2 = this.f31659P.d();
            if (hashSetD2 != null) {
                Iterator it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    ((C3241d) it2.next()).f31618d.e(c3243f, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetD3 = this.f31658O.d();
        if (hashSetD3 != null) {
            Iterator it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                ((C3241d) it3.next()).f31618d.e(c3243f, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD4 = this.f31660Q.d();
        if (hashSetD4 != null) {
            Iterator it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                ((C3241d) it4.next()).f31618d.e(c3243f, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD5 = this.f31661R.d();
        if (hashSetD5 != null) {
            Iterator it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                ((C3241d) it5.next()).f31618d.e(c3243f, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0(int i10) {
        return this.f31667X[i10];
    }

    public void e1(int i10) {
        this.f31671a0 = i10;
        int i11 = this.f31693l0;
        if (i10 < i11) {
            this.f31671a0 = i11;
        }
    }

    boolean f() {
        return (this instanceof l) || (this instanceof C3245h);
    }

    public boolean f0() {
        C3241d c3241d = this.f31657N;
        C3241d c3241d2 = c3241d.f31620f;
        if (c3241d2 != null && c3241d2.f31620f == c3241d) {
            return true;
        }
        C3241d c3241d3 = this.f31659P;
        C3241d c3241d4 = c3241d3.f31620f;
        return c3241d4 != null && c3241d4.f31620f == c3241d3;
    }

    public void f1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f31710u = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x056b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(o0.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        C3242e c3242e;
        C3242e c3242e2;
        boolean z13;
        boolean z14;
        int i10;
        o0.i iVar;
        int i11;
        int i12;
        boolean z15;
        int i13;
        b bVar;
        o0.i iVar2;
        boolean z16;
        b bVar2;
        boolean z17;
        b bVar3;
        o0.i iVar3;
        o0.i iVar4;
        o0.i iVar5;
        int i14;
        boolean z18;
        o0.i iVar6;
        o0.i iVar7;
        o0.i iVar8;
        int i15;
        int i16;
        char c10;
        int i17;
        C3242e c3242e3;
        o0.i iVar9;
        o0.i iVar10;
        o0.d dVar2;
        n nVar;
        s0.l lVar;
        int i18;
        int i19;
        boolean zF0;
        boolean zH0;
        s0.l lVar2;
        n nVar2;
        o0.d dVar3 = dVar;
        o0.i iVarQ = dVar3.q(this.f31657N);
        o0.i iVarQ2 = dVar3.q(this.f31659P);
        o0.i iVarQ3 = dVar3.q(this.f31658O);
        o0.i iVarQ4 = dVar3.q(this.f31660Q);
        o0.i iVarQ5 = dVar3.q(this.f31661R);
        C3242e c3242e4 = this.f31669Z;
        if (c3242e4 == null) {
            z11 = false;
            z12 = false;
        } else {
            z12 = c3242e4 != null && c3242e4.f31668Y[0] == b.WRAP_CONTENT;
            z11 = c3242e4 != null && c3242e4.f31668Y[1] == b.WRAP_CONTENT;
            int i20 = this.f31710u;
            if (i20 == 1) {
                z11 = false;
            } else if (i20 == 2) {
                z12 = false;
            } else if (i20 == 3) {
            }
        }
        if (this.f31705r0 == 8 && !Y()) {
            boolean[] zArr = this.f31667X;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z19 = this.f31698o;
        if (z19 || this.f31700p) {
            if (z19) {
                dVar3.f(iVarQ, this.f31679e0);
                dVar3.f(iVarQ2, this.f31679e0 + this.f31671a0);
                if (z12 && (c3242e2 = this.f31669Z) != null) {
                    if (this.f31690k) {
                        C3243f c3243f = (C3243f) c3242e2;
                        c3243f.t1(this.f31657N);
                        c3243f.s1(this.f31659P);
                    } else {
                        dVar3.h(dVar3.q(c3242e2.f31659P), iVarQ2, 0, 5);
                    }
                }
            }
            if (this.f31700p) {
                dVar3.f(iVarQ3, this.f31681f0);
                dVar3.f(iVarQ4, this.f31681f0 + this.f31673b0);
                if (this.f31661R.m()) {
                    dVar3.f(iVarQ5, this.f31681f0 + this.f31691k0);
                }
                if (z11 && (c3242e = this.f31669Z) != null) {
                    if (this.f31690k) {
                        C3243f c3243f2 = (C3243f) c3242e;
                        c3243f2.y1(this.f31658O);
                        c3243f2.x1(this.f31660Q);
                    } else {
                        dVar3.h(dVar3.q(c3242e.f31660Q), iVarQ4, 0, 5);
                    }
                }
            }
            if (this.f31698o && this.f31700p) {
                this.f31698o = false;
                this.f31700p = false;
                return;
            }
        }
        boolean z20 = o0.d.f30363r;
        if (z10 && (lVar2 = this.f31678e) != null && (nVar2 = this.f31680f) != null) {
            s0.f fVar = lVar2.f32174h;
            if (fVar.f32123j && lVar2.f32175i.f32123j && nVar2.f32174h.f32123j && nVar2.f32175i.f32123j) {
                dVar3.f(iVarQ, fVar.f32120g);
                dVar3.f(iVarQ2, this.f31678e.f32175i.f32120g);
                dVar3.f(iVarQ3, this.f31680f.f32174h.f32120g);
                dVar3.f(iVarQ4, this.f31680f.f32175i.f32120g);
                dVar3.f(iVarQ5, this.f31680f.f32149k.f32120g);
                if (this.f31669Z != null) {
                    if (z12 && this.f31682g[0] && !f0()) {
                        dVar3.h(dVar3.q(this.f31669Z.f31659P), iVarQ2, 0, 8);
                    }
                    if (z11 && this.f31682g[1] && !h0()) {
                        dVar3.h(dVar3.q(this.f31669Z.f31660Q), iVarQ4, 0, 8);
                    }
                }
                this.f31698o = false;
                this.f31700p = false;
                return;
            }
        }
        if (this.f31669Z != null) {
            if (c0(0)) {
                ((C3243f) this.f31669Z).p1(this, 0);
                zF0 = true;
            } else {
                zF0 = f0();
            }
            if (c0(1)) {
                ((C3243f) this.f31669Z).p1(this, 1);
                zH0 = true;
            } else {
                zH0 = h0();
            }
            if (!zF0 && z12 && this.f31705r0 != 8 && this.f31657N.f31620f == null && this.f31659P.f31620f == null) {
                dVar3.h(dVar3.q(this.f31669Z.f31659P), iVarQ2, 0, 1);
            }
            if (!zH0 && z11 && this.f31705r0 != 8 && this.f31658O.f31620f == null && this.f31660Q.f31620f == null && this.f31661R == null) {
                dVar3.h(dVar3.q(this.f31669Z.f31660Q), iVarQ4, 0, 1);
            }
            z13 = zF0;
            z14 = zH0;
        } else {
            z13 = false;
            z14 = false;
        }
        int i21 = this.f31671a0;
        int i22 = this.f31693l0;
        if (i21 >= i22) {
            i22 = i21;
        }
        int i23 = this.f31673b0;
        int i24 = this.f31695m0;
        if (i23 >= i24) {
            i24 = i23;
        }
        b[] bVarArr = this.f31668Y;
        b bVar4 = bVarArr[0];
        b bVar5 = b.MATCH_CONSTRAINT;
        boolean z21 = bVar4 != bVar5;
        b bVar6 = bVarArr[1];
        boolean z22 = bVar6 != bVar5;
        int i25 = this.f31677d0;
        this.f31644E = i25;
        int i26 = i22;
        float f10 = this.f31675c0;
        this.f31646F = f10;
        int i27 = this.f31712v;
        int i28 = this.f31714w;
        if (f10 > 0.0f) {
            i10 = i24;
            if (this.f31705r0 != 8) {
                i11 = (bVar4 == bVar5 && i27 == 0) ? 3 : i27;
                int i29 = (bVar6 == bVar5 && i28 == 0) ? 3 : i28;
                if (bVar4 == bVar5 && bVar6 == bVar5) {
                    iVar = iVarQ2;
                    i19 = 3;
                    if (i11 == 3 && i29 == 3) {
                        i1(z12, z11, z21, z22);
                    }
                    i12 = i29;
                    z15 = true;
                    int[] iArr = this.f31716x;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f31684h = z15;
                    if (z15) {
                        int i30 = this.f31644E;
                        i13 = -1;
                        boolean z23 = i30 == 0 || i30 == -1;
                        boolean z24 = !z15 && ((i18 = this.f31644E) == 1 || i18 == i13);
                        b bVar7 = this.f31668Y[0];
                        bVar = b.WRAP_CONTENT;
                        boolean z25 = bVar7 != bVar && (this instanceof C3243f);
                        int i31 = !z25 ? 0 : i26;
                        boolean z26 = !this.f31664U.o();
                        boolean[] zArr2 = this.f31667X;
                        boolean z27 = zArr2[0];
                        boolean z28 = zArr2[1];
                        if (this.f31706s != 2 || this.f31698o) {
                            iVar2 = iVarQ;
                            z16 = z15;
                            bVar2 = bVar;
                            z17 = z11;
                            i14 = i11;
                            z18 = z12;
                            bVar3 = bVar5;
                            iVar5 = iVarQ3;
                            iVar4 = iVarQ4;
                            iVar3 = iVarQ5;
                        } else {
                            if (z10 && (lVar = this.f31678e) != null) {
                                s0.f fVar2 = lVar.f32174h;
                                if (fVar2.f32123j && lVar.f32175i.f32123j) {
                                    if (z10) {
                                        dVar3.f(iVarQ, fVar2.f32120g);
                                        o0.i iVar11 = iVar;
                                        dVar3.f(iVar11, this.f31678e.f32175i.f32120g);
                                        if (this.f31669Z != null && z12 && this.f31682g[0] && !f0()) {
                                            dVar3.h(dVar3.q(this.f31669Z.f31659P), iVar11, 0, 8);
                                        }
                                        iVar2 = iVarQ;
                                        z16 = z15;
                                        bVar2 = bVar;
                                        z17 = z11;
                                        iVar = iVar11;
                                    }
                                    i14 = i11;
                                    z18 = z12;
                                    bVar3 = bVar5;
                                    iVar5 = iVarQ3;
                                    iVar4 = iVarQ4;
                                    iVar3 = iVarQ5;
                                }
                            }
                            o0.i iVar12 = iVar;
                            C3242e c3242e5 = this.f31669Z;
                            o0.i iVarQ6 = c3242e5 != null ? dVar3.q(c3242e5.f31659P) : null;
                            C3242e c3242e6 = this.f31669Z;
                            o0.i iVarQ7 = c3242e6 != null ? dVar3.q(c3242e6.f31657N) : null;
                            boolean z29 = this.f31682g[0];
                            b[] bVarArr2 = this.f31668Y;
                            iVar = iVar12;
                            b bVar8 = bVarArr2[0];
                            C3241d c3241d = this.f31657N;
                            o0.i iVar13 = iVarQ7;
                            C3241d c3241d2 = this.f31659P;
                            z16 = z15;
                            z18 = z12;
                            int i32 = this.f31679e0;
                            int i33 = this.f31693l0;
                            int i34 = this.f31648G[0];
                            float f11 = this.f31697n0;
                            boolean z30 = bVarArr2[1] == bVar5;
                            iVar2 = iVarQ;
                            boolean z31 = z11;
                            o0.i iVar14 = iVarQ6;
                            z17 = z31;
                            i14 = i11;
                            bVar3 = bVar5;
                            iVar5 = iVarQ3;
                            iVar4 = iVarQ4;
                            iVar3 = iVarQ5;
                            bVar2 = bVar;
                            dVar3 = dVar;
                            i(dVar3, true, z18, z17, z29, iVar13, iVar14, bVar8, z25, c3241d, c3241d2, i32, i31, i33, i34, f11, z23, z30, z13, z14, z27, i14, i12, this.f31718y, this.f31720z, this.f31636A, z26);
                        }
                        if (z10 || (nVar = this.f31680f) == null) {
                            iVar6 = iVar5;
                            iVar7 = iVar4;
                            iVar8 = iVar3;
                            i15 = 0;
                            i16 = 8;
                            c10 = 1;
                            i17 = 1;
                        } else {
                            s0.f fVar3 = nVar.f32174h;
                            if (fVar3.f32123j && nVar.f32175i.f32123j) {
                                int i35 = fVar3.f32120g;
                                iVar6 = iVar5;
                                dVar3.f(iVar6, i35);
                                iVar7 = iVar4;
                                dVar3.f(iVar7, this.f31680f.f32175i.f32120g);
                                iVar8 = iVar3;
                                dVar3.f(iVar8, this.f31680f.f32149k.f32120g);
                                C3242e c3242e7 = this.f31669Z;
                                if (c3242e7 == null || z14 || !z17) {
                                    i15 = 0;
                                    i16 = 8;
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    if (this.f31682g[1]) {
                                        i15 = 0;
                                        i16 = 8;
                                        dVar3.h(dVar3.q(c3242e7.f31660Q), iVar7, 0, 8);
                                    } else {
                                        i15 = 0;
                                        i16 = 8;
                                    }
                                }
                                i17 = i15;
                            }
                        }
                        if ((this.f31708t != 2 ? i15 : i17) != 0 || this.f31700p) {
                            c3242e3 = this;
                            iVar9 = iVar6;
                            iVar10 = iVar7;
                        } else {
                            boolean z32 = (this.f31668Y[c10] == bVar2 && (this instanceof C3243f)) ? c10 : i15;
                            int i36 = z32 != 0 ? i15 : i10;
                            C3242e c3242e8 = this.f31669Z;
                            o0.i iVarQ8 = c3242e8 != null ? dVar3.q(c3242e8.f31660Q) : null;
                            C3242e c3242e9 = this.f31669Z;
                            o0.i iVarQ9 = c3242e9 != null ? dVar3.q(c3242e9.f31658O) : null;
                            if (this.f31691k0 <= 0) {
                                boolean z33 = z26;
                                if (this.f31705r0 == i16) {
                                    C3241d c3241d3 = this.f31661R;
                                    if (c3241d3.f31620f != null) {
                                        dVar3.e(iVar8, iVar6, p(), i16);
                                        dVar3.e(iVar8, dVar3.q(this.f31661R.f31620f), this.f31661R.f(), i16);
                                        if (z17) {
                                            dVar3.h(iVarQ8, dVar3.q(this.f31660Q), i15, 5);
                                        }
                                        z33 = i15;
                                    } else if (this.f31705r0 == i16) {
                                        dVar3.e(iVar8, iVar6, c3241d3.f(), i16);
                                        z33 = z26;
                                    } else {
                                        dVar3.e(iVar8, iVar6, p(), i16);
                                        z33 = z26;
                                    }
                                }
                                boolean z34 = this.f31682g[c10];
                                b[] bVarArr3 = this.f31668Y;
                                int i37 = i15;
                                iVar9 = iVar6;
                                iVar10 = iVar7;
                                i(dVar, false, z17, z18, z34, iVarQ9, iVarQ8, bVarArr3[c10], z32, this.f31658O, this.f31660Q, this.f31681f0, i36, this.f31695m0, this.f31648G[c10], this.f31699o0, z24, bVarArr3[i37] == bVar3 ? c10 : i37, z14, z13, z28, i12, i14, this.f31638B, this.f31640C, this.f31642D, z33);
                                c3242e3 = this;
                            }
                        }
                        if (!z16) {
                            dVar2 = dVar;
                        } else if (c3242e3.f31644E == 1) {
                            dVar.k(iVar10, iVar9, iVar, iVar2, c3242e3.f31646F, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVar2, iVar10, iVar9, c3242e3.f31646F, 8);
                            dVar2 = dVar;
                        }
                        if (c3242e3.f31664U.o()) {
                            dVar2.b(c3242e3, c3242e3.f31664U.j().h(), (float) Math.toRadians(c3242e3.f31650H + 90.0f), c3242e3.f31664U.f());
                        }
                        c3242e3.f31698o = false;
                        c3242e3.f31700p = false;
                    }
                    i13 = -1;
                    if (z15) {
                    }
                    b bVar72 = this.f31668Y[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar72 != bVar) {
                    }
                    if (!z25) {
                    }
                    boolean z262 = !this.f31664U.o();
                    boolean[] zArr22 = this.f31667X;
                    boolean z272 = zArr22[0];
                    boolean z282 = zArr22[1];
                    if (this.f31706s != 2) {
                        iVar2 = iVarQ;
                        z16 = z15;
                        bVar2 = bVar;
                        z17 = z11;
                        i14 = i11;
                        z18 = z12;
                        bVar3 = bVar5;
                        iVar5 = iVarQ3;
                        iVar4 = iVarQ4;
                        iVar3 = iVarQ5;
                    }
                    if (z10) {
                        iVar6 = iVar5;
                        iVar7 = iVar4;
                        iVar8 = iVar3;
                        i15 = 0;
                        i16 = 8;
                        c10 = 1;
                        i17 = 1;
                    }
                    if ((this.f31708t != 2 ? i15 : i17) != 0) {
                        c3242e3 = this;
                        iVar9 = iVar6;
                        iVar10 = iVar7;
                    }
                    if (!z16) {
                    }
                    if (c3242e3.f31664U.o()) {
                    }
                    c3242e3.f31698o = false;
                    c3242e3.f31700p = false;
                }
                iVar = iVarQ2;
                i19 = 3;
                if (bVar4 != bVar5 || i11 != i19) {
                    if (bVar6 == bVar5 && i29 == i19) {
                        this.f31644E = 1;
                        if (i25 == -1) {
                            this.f31646F = 1.0f / f10;
                        }
                        i10 = (int) (this.f31646F * i21);
                        if (bVar4 != bVar5) {
                            i12 = 4;
                        }
                    }
                    i12 = i29;
                    z15 = true;
                    int[] iArr2 = this.f31716x;
                    iArr2[0] = i11;
                    iArr2[1] = i12;
                    this.f31684h = z15;
                    if (z15) {
                    }
                    if (z15) {
                    }
                    b bVar722 = this.f31668Y[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar722 != bVar) {
                    }
                    if (!z25) {
                    }
                    boolean z2622 = !this.f31664U.o();
                    boolean[] zArr222 = this.f31667X;
                    boolean z2722 = zArr222[0];
                    boolean z2822 = zArr222[1];
                    if (this.f31706s != 2) {
                    }
                    if (z10) {
                    }
                    if ((this.f31708t != 2 ? i15 : i17) != 0) {
                    }
                    if (!z16) {
                    }
                    if (c3242e3.f31664U.o()) {
                    }
                    c3242e3.f31698o = false;
                    c3242e3.f31700p = false;
                }
                this.f31644E = 0;
                i26 = (int) (i23 * f10);
                if (bVar6 == bVar5) {
                    i12 = i29;
                    z15 = true;
                    int[] iArr22 = this.f31716x;
                    iArr22[0] = i11;
                    iArr22[1] = i12;
                    this.f31684h = z15;
                    if (z15) {
                    }
                    if (z15) {
                    }
                    b bVar7222 = this.f31668Y[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar7222 != bVar) {
                    }
                    if (!z25) {
                    }
                    boolean z26222 = !this.f31664U.o();
                    boolean[] zArr2222 = this.f31667X;
                    boolean z27222 = zArr2222[0];
                    boolean z28222 = zArr2222[1];
                    if (this.f31706s != 2) {
                    }
                    if (z10) {
                    }
                    if ((this.f31708t != 2 ? i15 : i17) != 0) {
                    }
                    if (!z16) {
                    }
                    if (c3242e3.f31664U.o()) {
                    }
                    c3242e3.f31698o = false;
                    c3242e3.f31700p = false;
                }
                i11 = 4;
                i12 = i29;
            }
            z15 = false;
            int[] iArr222 = this.f31716x;
            iArr222[0] = i11;
            iArr222[1] = i12;
            this.f31684h = z15;
            if (z15) {
            }
            if (z15) {
            }
            b bVar72222 = this.f31668Y[0];
            bVar = b.WRAP_CONTENT;
            if (bVar72222 != bVar) {
            }
            if (!z25) {
            }
            boolean z262222 = !this.f31664U.o();
            boolean[] zArr22222 = this.f31667X;
            boolean z272222 = zArr22222[0];
            boolean z282222 = zArr22222[1];
            if (this.f31706s != 2) {
            }
            if (z10) {
            }
            if ((this.f31708t != 2 ? i15 : i17) != 0) {
            }
            if (!z16) {
            }
            if (c3242e3.f31664U.o()) {
            }
            c3242e3.f31698o = false;
            c3242e3.f31700p = false;
        }
        i10 = i24;
        iVar = iVarQ2;
        i11 = i27;
        i12 = i28;
        z15 = false;
        int[] iArr2222 = this.f31716x;
        iArr2222[0] = i11;
        iArr2222[1] = i12;
        this.f31684h = z15;
        if (z15) {
        }
        if (z15) {
        }
        b bVar722222 = this.f31668Y[0];
        bVar = b.WRAP_CONTENT;
        if (bVar722222 != bVar) {
        }
        if (!z25) {
        }
        boolean z2622222 = !this.f31664U.o();
        boolean[] zArr222222 = this.f31667X;
        boolean z2722222 = zArr222222[0];
        boolean z2822222 = zArr222222[1];
        if (this.f31706s != 2) {
        }
        if (z10) {
        }
        if ((this.f31708t != 2 ? i15 : i17) != 0) {
        }
        if (!z16) {
        }
        if (c3242e3.f31664U.o()) {
        }
        c3242e3.f31698o = false;
        c3242e3.f31700p = false;
    }

    public boolean g0() {
        return this.f31653J;
    }

    public void g1(int i10) {
        this.f31679e0 = i10;
    }

    public boolean h() {
        return this.f31705r0 != 8;
    }

    public boolean h0() {
        C3241d c3241d = this.f31658O;
        C3241d c3241d2 = c3241d.f31620f;
        if (c3241d2 != null && c3241d2.f31620f == c3241d) {
            return true;
        }
        C3241d c3241d3 = this.f31660Q;
        C3241d c3241d4 = c3241d3.f31620f;
        return c3241d4 != null && c3241d4.f31620f == c3241d3;
    }

    public void h1(int i10) {
        this.f31681f0 = i10;
    }

    public boolean i0() {
        return this.f31654K;
    }

    public void i1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f31644E == -1) {
            if (z12 && !z13) {
                this.f31644E = 0;
            } else if (!z12 && z13) {
                this.f31644E = 1;
                if (this.f31677d0 == -1) {
                    this.f31646F = 1.0f / this.f31646F;
                }
            }
        }
        if (this.f31644E == 0 && (!this.f31658O.o() || !this.f31660Q.o())) {
            this.f31644E = 1;
        } else if (this.f31644E == 1 && (!this.f31657N.o() || !this.f31659P.o())) {
            this.f31644E = 0;
        }
        if (this.f31644E == -1 && (!this.f31658O.o() || !this.f31660Q.o() || !this.f31657N.o() || !this.f31659P.o())) {
            if (this.f31658O.o() && this.f31660Q.o()) {
                this.f31644E = 0;
            } else if (this.f31657N.o() && this.f31659P.o()) {
                this.f31646F = 1.0f / this.f31646F;
                this.f31644E = 1;
            }
        }
        if (this.f31644E == -1) {
            int i10 = this.f31718y;
            if (i10 > 0 && this.f31638B == 0) {
                this.f31644E = 0;
            } else {
                if (i10 != 0 || this.f31638B <= 0) {
                    return;
                }
                this.f31646F = 1.0f / this.f31646F;
                this.f31644E = 1;
            }
        }
    }

    public void j(C3241d.b bVar, C3242e c3242e, C3241d.b bVar2, int i10) {
        C3241d.b bVar3;
        C3241d.b bVar4;
        boolean z10;
        C3241d.b bVar5 = C3241d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                C3241d.b bVar6 = C3241d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == C3241d.b.RIGHT) {
                    j(bVar6, c3242e, bVar2, 0);
                    j(C3241d.b.RIGHT, c3242e, bVar2, 0);
                    o(bVar5).a(c3242e.o(bVar2), 0);
                    return;
                }
                C3241d.b bVar7 = C3241d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == C3241d.b.BOTTOM) {
                    j(bVar7, c3242e, bVar2, 0);
                    j(C3241d.b.BOTTOM, c3242e, bVar2, 0);
                    o(bVar5).a(c3242e.o(bVar2), 0);
                    return;
                }
                return;
            }
            C3241d.b bVar8 = C3241d.b.LEFT;
            C3241d c3241dO = o(bVar8);
            C3241d.b bVar9 = C3241d.b.RIGHT;
            C3241d c3241dO2 = o(bVar9);
            C3241d.b bVar10 = C3241d.b.TOP;
            C3241d c3241dO3 = o(bVar10);
            C3241d.b bVar11 = C3241d.b.BOTTOM;
            C3241d c3241dO4 = o(bVar11);
            boolean z11 = true;
            if ((c3241dO == null || !c3241dO.o()) && (c3241dO2 == null || !c3241dO2.o())) {
                j(bVar8, c3242e, bVar8, 0);
                j(bVar9, c3242e, bVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((c3241dO3 == null || !c3241dO3.o()) && (c3241dO4 == null || !c3241dO4.o())) {
                j(bVar10, c3242e, bVar10, 0);
                j(bVar11, c3242e, bVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(bVar5).a(c3242e.o(bVar5), 0);
                return;
            }
            if (z10) {
                C3241d.b bVar12 = C3241d.b.CENTER_X;
                o(bVar12).a(c3242e.o(bVar12), 0);
                return;
            } else {
                if (z11) {
                    C3241d.b bVar13 = C3241d.b.CENTER_Y;
                    o(bVar13).a(c3242e.o(bVar13), 0);
                    return;
                }
                return;
            }
        }
        C3241d.b bVar14 = C3241d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = C3241d.b.LEFT) || bVar2 == C3241d.b.RIGHT)) {
            C3241d c3241dO5 = o(bVar4);
            C3241d c3241dO6 = c3242e.o(bVar2);
            C3241d c3241dO7 = o(C3241d.b.RIGHT);
            c3241dO5.a(c3241dO6, 0);
            c3241dO7.a(c3241dO6, 0);
            o(bVar14).a(c3241dO6, 0);
            return;
        }
        C3241d.b bVar15 = C3241d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = C3241d.b.TOP) || bVar2 == C3241d.b.BOTTOM)) {
            C3241d c3241dO8 = c3242e.o(bVar2);
            o(bVar3).a(c3241dO8, 0);
            o(C3241d.b.BOTTOM).a(c3241dO8, 0);
            o(bVar15).a(c3241dO8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            C3241d.b bVar16 = C3241d.b.LEFT;
            o(bVar16).a(c3242e.o(bVar16), 0);
            C3241d.b bVar17 = C3241d.b.RIGHT;
            o(bVar17).a(c3242e.o(bVar17), 0);
            o(bVar14).a(c3242e.o(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            C3241d.b bVar18 = C3241d.b.TOP;
            o(bVar18).a(c3242e.o(bVar18), 0);
            C3241d.b bVar19 = C3241d.b.BOTTOM;
            o(bVar19).a(c3242e.o(bVar19), 0);
            o(bVar15).a(c3242e.o(bVar2), 0);
            return;
        }
        C3241d c3241dO9 = o(bVar);
        C3241d c3241dO10 = c3242e.o(bVar2);
        if (c3241dO9.p(c3241dO10)) {
            C3241d.b bVar20 = C3241d.b.BASELINE;
            if (bVar == bVar20) {
                C3241d c3241dO11 = o(C3241d.b.TOP);
                C3241d c3241dO12 = o(C3241d.b.BOTTOM);
                if (c3241dO11 != null) {
                    c3241dO11.q();
                }
                if (c3241dO12 != null) {
                    c3241dO12.q();
                }
            } else if (bVar == C3241d.b.TOP || bVar == C3241d.b.BOTTOM) {
                C3241d c3241dO13 = o(bVar20);
                if (c3241dO13 != null) {
                    c3241dO13.q();
                }
                C3241d c3241dO14 = o(bVar5);
                if (c3241dO14.j() != c3241dO10) {
                    c3241dO14.q();
                }
                C3241d c3241dG = o(bVar).g();
                C3241d c3241dO15 = o(bVar15);
                if (c3241dO15.o()) {
                    c3241dG.q();
                    c3241dO15.q();
                }
            } else if (bVar == C3241d.b.LEFT || bVar == C3241d.b.RIGHT) {
                C3241d c3241dO16 = o(bVar5);
                if (c3241dO16.j() != c3241dO10) {
                    c3241dO16.q();
                }
                C3241d c3241dG2 = o(bVar).g();
                C3241d c3241dO17 = o(bVar14);
                if (c3241dO17.o()) {
                    c3241dG2.q();
                    c3241dO17.q();
                }
            }
            c3241dO9.a(c3241dO10, i10);
        }
    }

    public boolean j0() {
        return this.f31686i && this.f31705r0 != 8;
    }

    public void j1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f31678e.k();
        boolean zK2 = z11 & this.f31680f.k();
        s0.l lVar = this.f31678e;
        int i12 = lVar.f32174h.f32120g;
        n nVar = this.f31680f;
        int i13 = nVar.f32174h.f32120g;
        int i14 = lVar.f32175i.f32120g;
        int i15 = nVar.f32175i.f32120g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f31679e0 = i12;
        }
        if (zK2) {
            this.f31681f0 = i13;
        }
        if (this.f31705r0 == 8) {
            this.f31671a0 = 0;
            this.f31673b0 = 0;
            return;
        }
        if (zK) {
            if (this.f31668Y[0] == b.FIXED && i17 < (i11 = this.f31671a0)) {
                i17 = i11;
            }
            this.f31671a0 = i17;
            int i19 = this.f31693l0;
            if (i17 < i19) {
                this.f31671a0 = i19;
            }
        }
        if (zK2) {
            if (this.f31668Y[1] == b.FIXED && i18 < (i10 = this.f31673b0)) {
                i18 = i10;
            }
            this.f31673b0 = i18;
            int i20 = this.f31695m0;
            if (i18 < i20) {
                this.f31673b0 = i20;
            }
        }
    }

    public void k(C3241d c3241d, C3241d c3241d2, int i10) {
        if (c3241d.h() == this) {
            j(c3241d.k(), c3241d2.h(), c3241d2.k(), i10);
        }
    }

    public boolean k0() {
        if (this.f31698o) {
            return true;
        }
        return this.f31657N.n() && this.f31659P.n();
    }

    public void k1(o0.d dVar, boolean z10) {
        n nVar;
        s0.l lVar;
        int iX = dVar.x(this.f31657N);
        int iX2 = dVar.x(this.f31658O);
        int iX3 = dVar.x(this.f31659P);
        int iX4 = dVar.x(this.f31660Q);
        if (z10 && (lVar = this.f31678e) != null) {
            s0.f fVar = lVar.f32174h;
            if (fVar.f32123j) {
                s0.f fVar2 = lVar.f32175i;
                if (fVar2.f32123j) {
                    iX = fVar.f32120g;
                    iX3 = fVar2.f32120g;
                }
            }
        }
        if (z10 && (nVar = this.f31680f) != null) {
            s0.f fVar3 = nVar.f32174h;
            if (fVar3.f32123j) {
                s0.f fVar4 = nVar.f32175i;
                if (fVar4.f32123j) {
                    iX2 = fVar3.f32120g;
                    iX4 = fVar4.f32120g;
                }
            }
        }
        int i10 = iX4 - iX2;
        if (iX3 - iX < 0 || i10 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        D0(iX, iX2, iX3, iX4);
    }

    public void l(C3242e c3242e, float f10, int i10) {
        C3241d.b bVar = C3241d.b.CENTER;
        b0(bVar, c3242e, bVar, i10, 0);
        this.f31650H = f10;
    }

    public boolean l0() {
        if (this.f31700p) {
            return true;
        }
        return this.f31658O.n() && this.f31660Q.n();
    }

    public void m(o0.d dVar) {
        dVar.q(this.f31657N);
        dVar.q(this.f31658O);
        dVar.q(this.f31659P);
        dVar.q(this.f31660Q);
        if (this.f31691k0 > 0) {
            dVar.q(this.f31661R);
        }
    }

    public boolean m0() {
        return this.f31704r;
    }

    public void n() {
        if (this.f31678e == null) {
            this.f31678e = new s0.l(this);
        }
        if (this.f31680f == null) {
            this.f31680f = new n(this);
        }
    }

    public void n0() {
        this.f31702q = true;
    }

    public C3241d o(C3241d.b bVar) {
        switch (a.f31722a[bVar.ordinal()]) {
            case 1:
                return this.f31657N;
            case 2:
                return this.f31658O;
            case 3:
                return this.f31659P;
            case 4:
                return this.f31660Q;
            case 5:
                return this.f31661R;
            case 6:
                return this.f31664U;
            case 7:
                return this.f31662S;
            case 8:
                return this.f31663T;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void o0() {
        this.f31704r = true;
    }

    public int p() {
        return this.f31691k0;
    }

    public boolean p0() {
        b[] bVarArr = this.f31668Y;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f31697n0;
        }
        if (i10 == 1) {
            return this.f31699o0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f31657N.q();
        this.f31658O.q();
        this.f31659P.q();
        this.f31660Q.q();
        this.f31661R.q();
        this.f31662S.q();
        this.f31663T.q();
        this.f31664U.q();
        this.f31669Z = null;
        this.f31650H = 0.0f;
        this.f31671a0 = 0;
        this.f31673b0 = 0;
        this.f31675c0 = 0.0f;
        this.f31677d0 = -1;
        this.f31679e0 = 0;
        this.f31681f0 = 0;
        this.f31687i0 = 0;
        this.f31689j0 = 0;
        this.f31691k0 = 0;
        this.f31693l0 = 0;
        this.f31695m0 = 0;
        float f10 = f31635I0;
        this.f31697n0 = f10;
        this.f31699o0 = f10;
        b[] bVarArr = this.f31668Y;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f31701p0 = null;
        this.f31703q0 = 0;
        this.f31705r0 = 0;
        this.f31709t0 = null;
        this.f31711u0 = false;
        this.f31713v0 = false;
        this.f31717x0 = 0;
        this.f31719y0 = 0;
        this.f31721z0 = false;
        this.f31637A0 = false;
        float[] fArr = this.f31639B0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f31706s = -1;
        this.f31708t = -1;
        int[] iArr = this.f31648G;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f31712v = 0;
        this.f31714w = 0;
        this.f31636A = 1.0f;
        this.f31642D = 1.0f;
        this.f31720z = ViewDefaults.NUMBER_OF_LINES;
        this.f31640C = ViewDefaults.NUMBER_OF_LINES;
        this.f31718y = 0;
        this.f31638B = 0;
        this.f31684h = false;
        this.f31644E = -1;
        this.f31646F = 1.0f;
        this.f31715w0 = false;
        boolean[] zArr = this.f31682g;
        zArr[0] = true;
        zArr[1] = true;
        this.f31654K = false;
        boolean[] zArr2 = this.f31667X;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f31686i = true;
        int[] iArr2 = this.f31716x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f31692l = -1;
        this.f31694m = -1;
    }

    public int r() {
        return V() + this.f31673b0;
    }

    public void r0() {
        C3242e c3242eK = K();
        if (c3242eK != null && (c3242eK instanceof C3243f) && ((C3243f) K()).F1()) {
            return;
        }
        int size = this.f31666W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C3241d) this.f31666W.get(i10)).q();
        }
    }

    public Object s() {
        return this.f31701p0;
    }

    public void s0() {
        this.f31698o = false;
        this.f31700p = false;
        this.f31702q = false;
        this.f31704r = false;
        int size = this.f31666W.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C3241d) this.f31666W.get(i10)).r();
        }
    }

    public String t() {
        return this.f31707s0;
    }

    public void t0(o0.c cVar) {
        this.f31657N.s(cVar);
        this.f31658O.s(cVar);
        this.f31659P.s(cVar);
        this.f31660Q.s(cVar);
        this.f31661R.s(cVar);
        this.f31664U.s(cVar);
        this.f31662S.s(cVar);
        this.f31663T.s(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f31709t0;
        String str3 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (str2 != null) {
            str = "type: " + this.f31709t0 + " ";
        } else {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        sb.append(str);
        if (this.f31707s0 != null) {
            str3 = "id: " + this.f31707s0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f31679e0);
        sb.append(", ");
        sb.append(this.f31681f0);
        sb.append(") - (");
        sb.append(this.f31671a0);
        sb.append(" x ");
        sb.append(this.f31673b0);
        sb.append(")");
        return sb.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return Q();
        }
        return null;
    }

    public void u0(int i10) {
        this.f31691k0 = i10;
        this.f31652I = i10 > 0;
    }

    public float v() {
        return this.f31675c0;
    }

    public void v0(Object obj) {
        this.f31701p0 = obj;
    }

    public int w() {
        return this.f31677d0;
    }

    public void w0(String str) {
        this.f31707s0 = str;
    }

    public int x() {
        if (this.f31705r0 == 8) {
            return 0;
        }
        return this.f31673b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x0(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f31675c0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            i11 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : i10;
        } else {
            String strSubstring3 = str.substring(i, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f10 = Float.parseFloat(strSubstring3);
                float f11 = Float.parseFloat(strSubstring4);
                if (f10 > 0.0f && f11 > 0.0f) {
                    fAbs = i11 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                }
            }
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f31675c0 = fAbs;
            this.f31677d0 = i11;
        }
    }

    public float y() {
        return this.f31697n0;
    }

    public void y0(int i10) {
        if (this.f31652I) {
            int i11 = i10 - this.f31691k0;
            int i12 = this.f31673b0 + i11;
            this.f31681f0 = i11;
            this.f31658O.t(i11);
            this.f31660Q.t(i12);
            this.f31661R.t(i10);
            this.f31700p = true;
        }
    }

    public int z() {
        return this.f31717x0;
    }

    public void z0(int i10, int i11) {
        if (this.f31698o) {
            return;
        }
        this.f31657N.t(i10);
        this.f31659P.t(i11);
        this.f31679e0 = i10;
        this.f31671a0 = i11 - i10;
        this.f31698o = true;
    }
}
