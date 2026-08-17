package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1727u;
import androidx.datastore.preferences.protobuf.C1728v;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class M implements Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f16758r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f16759s = i0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f16761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J f16764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final T f16767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f16768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f16769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f16770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f16771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O f16772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1731y f16773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f0 f16774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC1721n f16775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final E f16776q;

    private M(int[] iArr, Object[] objArr, int i10, int i11, J j10, T t10, boolean z10, int[] iArr2, int i12, int i13, O o10, InterfaceC1731y interfaceC1731y, f0 f0Var, AbstractC1721n abstractC1721n, E e10) {
        this.f16760a = iArr;
        this.f16761b = objArr;
        this.f16762c = i10;
        this.f16763d = i11;
        this.f16766g = j10 instanceof AbstractC1726t;
        this.f16767h = t10;
        this.f16765f = abstractC1721n != null && abstractC1721n.e(j10);
        this.f16768i = z10;
        this.f16769j = iArr2;
        this.f16770k = i12;
        this.f16771l = i13;
        this.f16772m = o10;
        this.f16773n = interfaceC1731y;
        this.f16774o = f0Var;
        this.f16775p = abstractC1721n;
        this.f16764e = j10;
        this.f16776q = e10;
    }

    private static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1726t) {
            return ((AbstractC1726t) obj).B();
        }
        return true;
    }

    private boolean B(Object obj, Object obj2, int i10) {
        long jX = X(i10) & 1048575;
        return i0.w(obj, jX) == i0.w(obj2, jX);
    }

    private boolean C(Object obj, int i10, int i11) {
        return i0.w(obj, (long) (X(i11) & 1048575)) == i10;
    }

    private static boolean D(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long E(Object obj, long j10) {
        return i0.x(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r0 = r10.f16770k;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r0 >= r10.f16771l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r4 = r10.n(r2, r10.f16769j[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06d2 A[Catch: all -> 0x06f3, TRY_LEAVE, TryCatch #10 {all -> 0x06f3, blocks: (B:227:0x06cc, B:229:0x06d2, B:240:0x06f7, B:241:0x06fc), top: B:272:0x06cc }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x072d A[LOOP:4: B:254:0x0729->B:256:0x072d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0740  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F(f0 f0Var, AbstractC1721n abstractC1721n, Object obj, X x10, C1720m c1720m) throws Throwable {
        f0 f0Var2;
        Object obj2;
        int i10;
        Object objN;
        Object obj3;
        Object objF;
        f0 f0Var3;
        AbstractC1721n abstractC1721n2;
        Object objB;
        f0 f0Var4;
        Object objN2;
        X x11;
        M m10;
        List listC;
        Object obj4;
        List listC2;
        Object obj5;
        M m11 = this;
        C1720m c1720m2 = c1720m;
        C1724q c1724qD = null;
        Object objG = null;
        while (true) {
            try {
                int iZ = x10.z();
                int iW = m11.W(iZ);
                if (iW >= 0) {
                    obj3 = obj;
                    C1720m c1720m3 = c1720m2;
                    objF = objG;
                    f0Var3 = f0Var;
                    X x12 = x10;
                    try {
                        int iJ0 = m11.j0(iW);
                        try {
                        } catch (C1728v.a unused) {
                            f0Var2 = f0Var3;
                        }
                        switch (i0(iJ0)) {
                            case 0:
                                i0.K(obj3, Q(iJ0), x12.readDouble());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 1:
                                i0.L(obj3, Q(iJ0), x12.readFloat());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 2:
                                i0.N(obj3, Q(iJ0), x12.L());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 3:
                                i0.N(obj3, Q(iJ0), x12.c());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 4:
                                i0.M(obj3, Q(iJ0), x12.E());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 5:
                                i0.N(obj3, Q(iJ0), x12.d());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 6:
                                i0.M(obj3, Q(iJ0), x12.h());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 7:
                                i0.E(obj3, Q(iJ0), x12.i());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 8:
                                m11.a0(obj3, iJ0, x12);
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 9:
                                J j10 = (J) m11.K(obj3, iW);
                                x12.o(j10, m11.r(iW), c1720m3);
                                m11.g0(obj3, iW, j10);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 10:
                                i0.O(obj3, Q(iJ0), x12.C());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 11:
                                i0.M(obj3, Q(iJ0), x12.l());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 12:
                                int iS = x12.s();
                                m11.p(iW);
                                i0.M(obj3, Q(iJ0), iS);
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                                i0.M(obj3, Q(iJ0), x12.H());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                                i0.N(obj3, Q(iJ0), x12.j());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                                i0.M(obj3, Q(iJ0), x12.v());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 16:
                                i0.N(obj3, Q(iJ0), x12.w());
                                m11.d0(obj3, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 17:
                                J j11 = (J) m11.K(obj3, iW);
                                x12.t(j11, m11.r(iW), c1720m3);
                                m11.g0(obj3, iW, j11);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                                x12.J(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                                x12.D(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                                x12.m(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                                x12.k(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                                x12.p(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                                x12.N(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                                x12.u(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                                x12.x(m11.f16773n.c(obj3, Q(iJ0)));
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                                m11.b0(obj3, iJ0, x12);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                                f0Var2 = f0Var3;
                                obj2 = obj3;
                                M m12 = m11;
                                try {
                                    c1720m3 = c1720m;
                                } catch (C1728v.a unused2) {
                                    c1720m3 = c1720m;
                                    m11 = m12;
                                    x12 = x12;
                                }
                                try {
                                    m11.Z(obj2, iJ0, x12, m12.r(iW), c1720m3);
                                    objG = objF;
                                } catch (C1728v.a unused3) {
                                    objG = objF;
                                    try {
                                        if (f0Var2.q(x12)) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                                x11 = x12;
                                m10 = m11;
                                x11.I(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 29:
                                x11 = x12;
                                f0Var2 = f0Var3;
                                obj2 = obj3;
                                m10 = m11;
                                try {
                                    try {
                                        x11.g(m10.f16773n.c(obj2, Q(iJ0)));
                                        c1720m3 = c1720m;
                                        m11 = m10;
                                        objG = objF;
                                    } catch (C1728v.a unused4) {
                                        c1720m3 = c1720m;
                                        m11 = m10;
                                        objG = objF;
                                        x12 = x11;
                                        if (f0Var2.q(x12)) {
                                            if (objG == null) {
                                                objG = f0Var2.f(obj2);
                                            }
                                            if (!f0Var2.m(objG, x12, 0)) {
                                                objN2 = objG;
                                                for (int i11 = m11.f16770k; i11 < m11.f16771l; i11++) {
                                                    objN2 = m11.n(obj2, m11.f16769j[i11], objN2, f0Var2, obj);
                                                }
                                                if (objN2 == null) {
                                                    return;
                                                }
                                                f0Var2.o(obj2, objN2);
                                            }
                                        } else if (!x12.G()) {
                                            objN2 = objG;
                                            for (int i12 = m11.f16770k; i12 < m11.f16771l; i12++) {
                                                objN2 = m11.n(obj2, m11.f16769j[i12], objN2, f0Var2, obj);
                                            }
                                            if (objN2 == null) {
                                                return;
                                            }
                                            f0Var2.o(obj2, objN2);
                                        }
                                    }
                                    c1720m2 = c1720m3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    m11 = m10;
                                    objG = objF;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var5 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 30:
                                m10 = m11;
                                obj2 = obj3;
                                x11 = x12;
                                objG = objF;
                                try {
                                    listC = m10.f16773n.c(obj2, Q(iJ0));
                                    x11.q(listC);
                                    m10.p(iW);
                                    obj4 = obj2;
                                } catch (C1728v.a unused5) {
                                    f0Var2 = f0Var;
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                    x12 = x11;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    f0Var2 = f0Var;
                                }
                                try {
                                    objG = a0.z(obj4, iZ, listC, null, objG, f0Var);
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                } catch (C1728v.a unused6) {
                                    f0Var2 = f0Var;
                                    c1720m3 = c1720m;
                                    obj2 = obj4;
                                    m11 = m10;
                                    x12 = x11;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj4;
                                    f0Var2 = f0Var;
                                    m11 = m10;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var52 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case 31:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.e(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.n(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 33:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.b(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 34:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.f(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 35:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.J(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 36:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.D(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 37:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.m(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 38:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.k(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 39:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.p(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 40:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.N(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 41:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.u(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 42:
                                x11 = x12;
                                objG = objF;
                                m10 = m11;
                                x11.x(m10.f16773n.c(obj3, Q(iJ0)));
                                c1720m3 = c1720m;
                                objF = objG;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 43:
                                x11 = x12;
                                obj2 = obj3;
                                objG = objF;
                                m10 = m11;
                                try {
                                    x11.g(m10.f16773n.c(obj2, Q(iJ0)));
                                    c1720m3 = c1720m;
                                    objF = objG;
                                    m11 = m10;
                                    objG = objF;
                                } catch (C1728v.a unused7) {
                                    f0Var2 = f0Var;
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                    x12 = x11;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    f0Var2 = f0Var;
                                    m11 = m10;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var522 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case 44:
                                m10 = m11;
                                obj4 = obj3;
                                x11 = x12;
                                try {
                                    listC2 = m10.f16773n.c(obj4, Q(iJ0));
                                    x11.q(listC2);
                                    m10.p(iW);
                                    objG = objF;
                                } catch (C1728v.a unused8) {
                                    objG = objF;
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj2 = obj4;
                                    objG = objF;
                                }
                                try {
                                    objG = a0.z(obj4, iZ, listC2, null, objG, f0Var3);
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                } catch (C1728v.a unused9) {
                                    f0Var2 = f0Var;
                                    c1720m3 = c1720m;
                                    obj2 = obj4;
                                    m11 = m10;
                                    x12 = x11;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj4;
                                    f0Var2 = f0Var;
                                    m11 = m10;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var5222 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case BuildConfig.VERSION_CODE /* 45 */:
                                m10 = m11;
                                obj5 = obj3;
                                x11 = x12;
                                x11.e(m10.f16773n.c(obj5, Q(iJ0)));
                                c1720m3 = c1720m;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 46:
                                m10 = m11;
                                obj5 = obj3;
                                x11 = x12;
                                x11.n(m10.f16773n.c(obj5, Q(iJ0)));
                                c1720m3 = c1720m;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 47:
                                m10 = m11;
                                obj5 = obj3;
                                x11 = x12;
                                x11.b(m10.f16773n.c(obj5, Q(iJ0)));
                                c1720m3 = c1720m;
                                m11 = m10;
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 48:
                                m10 = m11;
                                obj5 = obj3;
                                x11 = x12;
                                f0Var2 = f0Var3;
                                try {
                                    x11.f(m10.f16773n.c(obj5, Q(iJ0)));
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                    objG = objF;
                                } catch (C1728v.a unused10) {
                                    c1720m3 = c1720m;
                                    obj2 = obj5;
                                    m11 = m10;
                                    objG = objF;
                                    x12 = x11;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj2 = obj5;
                                    m11 = m10;
                                    objG = objF;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var52222 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case 49:
                                f0Var2 = f0Var3;
                                try {
                                    obj2 = obj;
                                } catch (Throwable th10) {
                                    th = th10;
                                    m10 = m11;
                                    obj5 = obj;
                                    obj2 = obj5;
                                    m11 = m10;
                                    objG = objF;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var522222 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    m11.Y(obj2, Q(iJ0), x10, m11.r(iW), c1720m);
                                    m10 = m11;
                                    obj5 = obj2;
                                    x11 = x10;
                                    c1720m3 = c1720m;
                                    m11 = m10;
                                    objG = objF;
                                } catch (C1728v.a unused11) {
                                    c1720m3 = c1720m;
                                    x12 = x10;
                                    objG = objF;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    m10 = m11;
                                    m11 = m10;
                                    objG = objF;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var5222222 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            case 50:
                                f0Var2 = f0Var3;
                                try {
                                    try {
                                        m11.G(obj3, iW, m11.q(iW), c1720m3, x10);
                                        c1720m3 = c1720m;
                                        objG = objF;
                                    } catch (C1728v.a unused12) {
                                        obj2 = obj;
                                        x12 = x10;
                                        c1720m3 = c1720m;
                                        objG = objF;
                                        if (f0Var2.q(x12)) {
                                        }
                                    }
                                    c1720m2 = c1720m3;
                                } catch (Throwable th12) {
                                    th = th12;
                                    obj2 = obj;
                                }
                                break;
                            case 51:
                                i0.O(obj3, Q(iJ0), Double.valueOf(x12.readDouble()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 52:
                                i0.O(obj3, Q(iJ0), Float.valueOf(x12.readFloat()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 53:
                                i0.O(obj3, Q(iJ0), Long.valueOf(x12.L()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 54:
                                i0.O(obj3, Q(iJ0), Long.valueOf(x12.c()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 55:
                                i0.O(obj3, Q(iJ0), Integer.valueOf(x12.E()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 56:
                                i0.O(obj3, Q(iJ0), Long.valueOf(x12.d()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 57:
                                i0.O(obj3, Q(iJ0), Integer.valueOf(x12.h()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 58:
                                i0.O(obj3, Q(iJ0), Boolean.valueOf(x12.i()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 59:
                                m11.a0(obj3, iJ0, x12);
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 60:
                                J j12 = (J) m11.L(obj3, iZ, iW);
                                x12.o(j12, m11.r(iW), c1720m3);
                                m11.h0(obj3, iZ, iW, j12);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 61:
                                i0.O(obj3, Q(iJ0), x12.C());
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 62:
                                i0.O(obj3, Q(iJ0), Integer.valueOf(x12.l()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 63:
                                int iS2 = x12.s();
                                m11.p(iW);
                                i0.O(obj3, Q(iJ0), Integer.valueOf(iS2));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                i0.O(obj3, Q(iJ0), Integer.valueOf(x12.H()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 65:
                                i0.O(obj3, Q(iJ0), Long.valueOf(x12.j()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 66:
                                i0.O(obj3, Q(iJ0), Integer.valueOf(x12.v()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 67:
                                i0.O(obj3, Q(iJ0), Long.valueOf(x12.w()));
                                m11.e0(obj3, iZ, iW);
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                            case 68:
                                f0Var2 = f0Var3;
                                try {
                                    J j13 = (J) m11.L(obj3, iZ, iW);
                                    x12.t(j13, m11.r(iW), c1720m3);
                                    m11.h0(obj3, iZ, iW, j13);
                                    objG = objF;
                                } catch (C1728v.a unused13) {
                                    obj2 = obj3;
                                    objG = objF;
                                    if (f0Var2.q(x12)) {
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    obj2 = obj3;
                                    objG = objF;
                                    i10 = m11.f16770k;
                                    objN = objG;
                                    while (i10 < m11.f16771l) {
                                    }
                                    f0 f0Var52222222 = f0Var2;
                                    if (objN != null) {
                                    }
                                    throw th;
                                }
                                c1720m2 = c1720m3;
                                break;
                            default:
                                if (objF == null) {
                                    objF = f0Var3.f(obj3);
                                }
                                if (!f0Var3.m(objF, x12, 0)) {
                                    Object objN3 = objF;
                                    for (int i13 = m11.f16770k; i13 < m11.f16771l; i13++) {
                                        objN3 = m11.n(obj3, m11.f16769j[i13], objN3, f0Var3, obj);
                                    }
                                    if (objN3 != null) {
                                        f0Var3.o(obj3, objN3);
                                        return;
                                    }
                                    return;
                                }
                                objG = objF;
                                c1720m2 = c1720m3;
                                break;
                                break;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        f0Var2 = f0Var3;
                        obj2 = obj3;
                        objG = objF;
                        i10 = m11.f16770k;
                        objN = objG;
                        while (i10 < m11.f16771l) {
                        }
                        f0 f0Var522222222 = f0Var2;
                        if (objN != null) {
                        }
                        throw th;
                    }
                } else {
                    if (iZ == Integer.MAX_VALUE) {
                        int i14 = m11.f16770k;
                        Object objN4 = objG;
                        while (i14 < m11.f16771l) {
                            objN4 = m11.n(obj, m11.f16769j[i14], objN4, f0Var, obj);
                            i14++;
                            m11 = m11;
                        }
                        if (objN4 != null) {
                            f0Var.o(obj, objN4);
                        }
                        return;
                    }
                    M m13 = m11;
                    try {
                        if (m13.f16765f) {
                            abstractC1721n2 = abstractC1721n;
                            objB = abstractC1721n2.b(c1720m2, m13.f16764e, iZ);
                        } else {
                            abstractC1721n2 = abstractC1721n;
                            objB = null;
                        }
                        if (objB != null) {
                            if (c1724qD == null) {
                                try {
                                    c1724qD = abstractC1721n.d(obj);
                                } catch (Throwable th15) {
                                    th = th15;
                                    obj2 = obj;
                                    f0Var2 = f0Var;
                                    m11 = m13;
                                }
                            }
                            Object obj6 = objG;
                            C1724q c1724q = c1724qD;
                            try {
                                c1724qD = c1724q;
                                objG = abstractC1721n2.g(obj, x10, objB, c1720m2, c1724q, obj6, f0Var);
                                c1720m2 = c1720m2;
                                m11 = m13;
                            } catch (Throwable th16) {
                                th = th16;
                                obj2 = obj;
                                objF = obj6;
                                f0Var4 = f0Var;
                                f0Var2 = f0Var4;
                                m11 = m13;
                                objG = objF;
                                i10 = m11.f16770k;
                                objN = objG;
                                while (i10 < m11.f16771l) {
                                }
                                f0 f0Var5222222222 = f0Var2;
                                if (objN != null) {
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objF = objG;
                            f0Var4 = f0Var;
                            C1720m c1720m4 = c1720m2;
                            try {
                                if (f0Var4.q(x10)) {
                                    try {
                                        if (!x10.G()) {
                                        }
                                        c1720m2 = c1720m4;
                                        m11 = m13;
                                        objG = objF;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        f0Var2 = f0Var4;
                                        m11 = m13;
                                        objG = objF;
                                        i10 = m11.f16770k;
                                        objN = objG;
                                        while (i10 < m11.f16771l) {
                                        }
                                        f0 f0Var52222222222 = f0Var2;
                                        if (objN != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objF == null) {
                                        objF = f0Var4.f(obj2);
                                    }
                                    if (!f0Var4.m(objF, x10, 0)) {
                                    }
                                    c1720m2 = c1720m4;
                                    m11 = m13;
                                    objG = objF;
                                }
                            } catch (Throwable th18) {
                                th = th18;
                                m11 = m13;
                                f0Var2 = f0Var4;
                            }
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        obj3 = obj;
                        objF = objG;
                        f0Var3 = f0Var;
                        m11 = m13;
                        f0Var2 = f0Var3;
                        obj2 = obj3;
                    }
                }
                objG = objF;
            } catch (Throwable th20) {
                th = th20;
                f0Var2 = f0Var;
                obj2 = obj;
            }
            i10 = m11.f16770k;
            objN = objG;
            while (i10 < m11.f16771l) {
                objN = m11.n(obj2, m11.f16769j[i10], objN, f0Var2, obj);
                i10++;
                m11 = this;
            }
            f0 f0Var522222222222 = f0Var2;
            if (objN != null) {
                f0Var522222222222.o(obj2, objN);
            }
            throw th;
        }
        f0Var2.o(obj2, objN2);
    }

    private final void G(Object obj, int i10, Object obj2, C1720m c1720m, X x10) {
        long jQ = Q(j0(i10));
        Object objZ = i0.z(obj, jQ);
        if (objZ == null) {
            objZ = this.f16776q.e(obj2);
            i0.O(obj, jQ, objZ);
        } else if (this.f16776q.g(objZ)) {
            Object objE = this.f16776q.e(obj2);
            this.f16776q.a(objE, objZ);
            i0.O(obj, jQ, objE);
            objZ = objE;
        }
        x10.r(this.f16776q.d(objZ), this.f16776q.c(obj2), c1720m);
    }

    private void H(Object obj, Object obj2, int i10) {
        if (v(obj2, i10)) {
            long jQ = Q(j0(i10));
            Unsafe unsafe = f16759s;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            Y yR = r(i10);
            if (!v(obj, i10)) {
                if (A(object)) {
                    Object objNewInstance = yR.newInstance();
                    yR.a(objNewInstance, object);
                    unsafe.putObject(obj, jQ, objNewInstance);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                d0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!A(object2)) {
                Object objNewInstance2 = yR.newInstance();
                yR.a(objNewInstance2, object2);
                unsafe.putObject(obj, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            yR.a(object2, object);
        }
    }

    private void I(Object obj, Object obj2, int i10) {
        int iP = P(i10);
        if (C(obj2, iP, i10)) {
            long jQ = Q(j0(i10));
            Unsafe unsafe = f16759s;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            Y yR = r(i10);
            if (!C(obj, iP, i10)) {
                if (A(object)) {
                    Object objNewInstance = yR.newInstance();
                    yR.a(objNewInstance, object);
                    unsafe.putObject(obj, jQ, objNewInstance);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                e0(obj, iP, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!A(object2)) {
                Object objNewInstance2 = yR.newInstance();
                yR.a(objNewInstance2, object2);
                unsafe.putObject(obj, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            yR.a(object2, object);
        }
    }

    private void J(Object obj, Object obj2, int i10) {
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        int iP = P(i10);
        switch (i0(iJ0)) {
            case 0:
                if (v(obj2, i10)) {
                    i0.K(obj, jQ, i0.u(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 1:
                if (v(obj2, i10)) {
                    i0.L(obj, jQ, i0.v(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 2:
                if (v(obj2, i10)) {
                    i0.N(obj, jQ, i0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 3:
                if (v(obj2, i10)) {
                    i0.N(obj, jQ, i0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 4:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 5:
                if (v(obj2, i10)) {
                    i0.N(obj, jQ, i0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 6:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 7:
                if (v(obj2, i10)) {
                    i0.E(obj, jQ, i0.p(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 8:
                if (v(obj2, i10)) {
                    i0.O(obj, jQ, i0.z(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 9:
                H(obj, obj2, i10);
                break;
            case 10:
                if (v(obj2, i10)) {
                    i0.O(obj, jQ, i0.z(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 11:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 12:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                if (v(obj2, i10)) {
                    i0.N(obj, jQ, i0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                if (v(obj2, i10)) {
                    i0.M(obj, jQ, i0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 16:
                if (v(obj2, i10)) {
                    i0.N(obj, jQ, i0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 17:
                H(obj, obj2, i10);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f16773n.a(obj, obj2, jQ);
                break;
            case 50:
                a0.E(this.f16776q, obj, obj2, jQ);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (C(obj2, iP, i10)) {
                    i0.O(obj, jQ, i0.z(obj2, jQ));
                    e0(obj, iP, i10);
                }
                break;
            case 60:
                I(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
                if (C(obj2, iP, i10)) {
                    i0.O(obj, jQ, i0.z(obj2, jQ));
                    e0(obj, iP, i10);
                }
                break;
            case 68:
                I(obj, obj2, i10);
                break;
        }
    }

    private Object K(Object obj, int i10) {
        Y yR = r(i10);
        long jQ = Q(j0(i10));
        if (!v(obj, i10)) {
            return yR.newInstance();
        }
        Object object = f16759s.getObject(obj, jQ);
        if (A(object)) {
            return object;
        }
        Object objNewInstance = yR.newInstance();
        if (object != null) {
            yR.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object L(Object obj, int i10, int i11) {
        Y yR = r(i11);
        if (!C(obj, i10, i11)) {
            return yR.newInstance();
        }
        Object object = f16759s.getObject(obj, Q(j0(i11)));
        if (A(object)) {
            return object;
        }
        Object objNewInstance = yR.newInstance();
        if (object != null) {
            yR.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    static M M(Class cls, H h10, O o10, InterfaceC1731y interfaceC1731y, f0 f0Var, AbstractC1721n abstractC1721n, E e10) {
        if (h10 instanceof W) {
            return O((W) h10, o10, interfaceC1731y, f0Var, abstractC1721n, e10);
        }
        android.support.v4.media.session.b.a(h10);
        return N(null, o10, interfaceC1731y, f0Var, abstractC1721n, e10);
    }

    static M N(c0 c0Var, O o10, InterfaceC1731y interfaceC1731y, f0 f0Var, AbstractC1721n abstractC1721n, E e10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static M O(W w10, O o10, InterfaceC1731y interfaceC1731y, f0 f0Var, AbstractC1721n abstractC1721n, E e10) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        String str;
        int i29;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        int iObjectFieldOffset3;
        int i32;
        Field fieldC0;
        char cCharAt9;
        int i33;
        int i34;
        Object obj;
        Field fieldC02;
        Object obj2;
        Field fieldC03;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        String strE = w10.e();
        int length = strE.length();
        char c10 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (strE.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt2 = strE.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i41 = iCharAt2 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strE.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt2 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f16758r;
            i14 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt3 = strE.charAt(i40);
            if (iCharAt3 >= 55296) {
                int i44 = iCharAt3 & 8191;
                int i45 = 13;
                while (true) {
                    i24 = i43 + 1;
                    cCharAt8 = strE.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i24;
                }
                iCharAt3 = i44 | (cCharAt8 << i45);
                i43 = i24;
            }
            int i46 = i43 + 1;
            int iCharAt4 = strE.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    cCharAt7 = strE.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                iCharAt4 = i47 | (cCharAt7 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int iCharAt5 = strE.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    cCharAt6 = strE.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                iCharAt5 = i50 | (cCharAt6 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int iCharAt6 = strE.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    cCharAt5 = strE.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                iCharAt6 = i53 | (cCharAt5 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            iCharAt = strE.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    cCharAt4 = strE.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            int iCharAt7 = strE.charAt(i55);
            if (iCharAt7 >= 55296) {
                int i59 = iCharAt7 & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    cCharAt3 = strE.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                iCharAt7 = i59 | (cCharAt3 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strE.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    cCharAt2 = strE.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strE.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    cCharAt = strE.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i12 = iCharAt5;
            i13 = i67;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i40 = i64;
            i16 = iCharAt6;
        }
        Unsafe unsafe = f16759s;
        Object[] objArrD = w10.d();
        Class<?> cls = w10.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i68 = i15 + i13;
        int i69 = i68;
        int i70 = i15;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int iCharAt10 = strE.charAt(i40);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = strE.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i25 = i37;
            } else {
                i25 = i73;
            }
            int i77 = i25 + 1;
            int iCharAt11 = strE.charAt(i25);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    cCharAt11 = strE.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i26 = i36;
            } else {
                i26 = i77;
            }
            int i81 = iCharAt11 & 255;
            int i82 = length;
            if ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int[] iArr4 = iArr3;
            if (i81 >= 51) {
                int i83 = i26 + 1;
                int iCharAt12 = strE.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i35 = i83 + 1;
                        cCharAt10 = strE.charAt(i83);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i35;
                        c11 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i35;
                }
                int i86 = i81 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    i34 = i11 + 1;
                    objArr[((i72 / 3) * 2) + 1] = objArrD[i11];
                } else {
                    if (i86 == 12 && (w10.c().equals(T.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i34 = i11 + 1;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i11];
                    }
                    int i88 = iCharAt12 * 2;
                    obj = objArrD[i88];
                    if (obj instanceof Field) {
                        fieldC02 = c0(cls, (String) obj);
                        objArrD[i88] = fieldC02;
                    } else {
                        fieldC02 = (Field) obj;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldC02);
                    int i89 = i88 + 1;
                    obj2 = objArrD[i89];
                    if (obj2 instanceof Field) {
                        fieldC03 = c0(cls, (String) obj2);
                        objArrD[i89] = fieldC03;
                    } else {
                        fieldC03 = (Field) obj2;
                    }
                    str = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC03);
                    i32 = iObjectFieldOffset4;
                    i31 = 0;
                    i27 = iCharAt10;
                    i40 = i87;
                }
                i11 = i34;
                int i882 = iCharAt12 * 2;
                obj = objArrD[i882];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset42 = (int) unsafe.objectFieldOffset(fieldC02);
                int i892 = i882 + 1;
                obj2 = objArrD[i892];
                if (obj2 instanceof Field) {
                }
                str = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC03);
                i32 = iObjectFieldOffset42;
                i31 = 0;
                i27 = iCharAt10;
                i40 = i87;
            } else {
                int i90 = i11 + 1;
                Field fieldC04 = c0(cls, (String) objArrD[i11]);
                if (i81 == 9 || i81 == 17) {
                    i27 = iCharAt10;
                    objArr[((i72 / 3) * 2) + 1] = fieldC04.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i27 = iCharAt10;
                        i33 = i11 + 2;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i90];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i27 = iCharAt10;
                        if (w10.c() == T.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i33 = i11 + 2;
                            objArr[((i72 / 3) * 2) + 1] = objArrD[i90];
                        }
                    } else if (i81 == 50) {
                        int i91 = i70 + 1;
                        iArr[i70] = i72;
                        int i92 = (i72 / 3) * 2;
                        int i93 = i11 + 2;
                        objArr[i92] = objArrD[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            i28 = i11 + 3;
                            objArr[i92 + 1] = objArrD[i93];
                            i27 = iCharAt10;
                            i70 = i91;
                        } else {
                            i28 = i93;
                            i70 = i91;
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC04);
                        if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                            str = strE;
                            i29 = i28;
                            iObjectFieldOffset2 = 1048575;
                            i30 = i26;
                            i31 = 0;
                        } else {
                            int i94 = i26 + 1;
                            int iCharAt13 = strE.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i95 = iCharAt13 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i30 = i94 + 1;
                                    cCharAt9 = strE.charAt(i94);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i95 |= (cCharAt9 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i30;
                                }
                                iCharAt13 = i95 | (cCharAt9 << i96);
                            } else {
                                i30 = i94;
                            }
                            int i97 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i97];
                            str = strE;
                            if (obj3 instanceof Field) {
                                fieldC0 = (Field) obj3;
                            } else {
                                fieldC0 = c0(cls, (String) obj3);
                                objArrD[i97] = fieldC0;
                            }
                            i29 = i28;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC0);
                            i31 = iCharAt13 % 32;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        iObjectFieldOffset3 = i98;
                        i32 = iObjectFieldOffset;
                        i11 = i29;
                        i40 = i30;
                    } else {
                        i27 = iCharAt10;
                    }
                    i28 = i33;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC04);
                    if ((iCharAt11 & 4096) == 0) {
                        str = strE;
                        i29 = i28;
                        iObjectFieldOffset2 = 1048575;
                        i30 = i26;
                        i31 = 0;
                        int i982 = iObjectFieldOffset2;
                        if (i81 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        iObjectFieldOffset3 = i982;
                        i32 = iObjectFieldOffset;
                        i11 = i29;
                        i40 = i30;
                    }
                }
                i28 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC04);
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i99 = i72 + 1;
            iArr4[i72] = i27;
            int i100 = i72 + 2;
            int i101 = iObjectFieldOffset3;
            iArr4[i99] = ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? androidx.customview.widget.a.INVALID_ID : 0) | (i81 << 20) | i32;
            i72 += 3;
            iArr4[i100] = (i31 << 20) | i101;
            length = i82;
            iArr3 = iArr4;
            strE = str;
            c10 = 55296;
        }
        return new M(iArr3, objArr, i12, i16, w10.b(), w10.c(), false, iArr, i15, i68, o10, interfaceC1731y, f0Var, abstractC1721n, e10);
    }

    private int P(int i10) {
        return this.f16760a[i10];
    }

    private static long Q(int i10) {
        return i10 & 1048575;
    }

    private static boolean R(Object obj, long j10) {
        return ((Boolean) i0.z(obj, j10)).booleanValue();
    }

    private static double S(Object obj, long j10) {
        return ((Double) i0.z(obj, j10)).doubleValue();
    }

    private static float T(Object obj, long j10) {
        return ((Float) i0.z(obj, j10)).floatValue();
    }

    private static int U(Object obj, long j10) {
        return ((Integer) i0.z(obj, j10)).intValue();
    }

    private static long V(Object obj, long j10) {
        return ((Long) i0.z(obj, j10)).longValue();
    }

    private int W(int i10) {
        if (i10 < this.f16762c || i10 > this.f16763d) {
            return -1;
        }
        return f0(i10, 0);
    }

    private int X(int i10) {
        return this.f16760a[i10 + 2];
    }

    private void Y(Object obj, long j10, X x10, Y y10, C1720m c1720m) {
        x10.F(this.f16773n.c(obj, j10), y10, c1720m);
    }

    private void Z(Object obj, int i10, X x10, Y y10, C1720m c1720m) {
        x10.K(this.f16773n.c(obj, Q(i10)), y10, c1720m);
    }

    private void a0(Object obj, int i10, X x10) {
        if (u(i10)) {
            i0.O(obj, Q(i10), x10.M());
        } else if (this.f16766g) {
            i0.O(obj, Q(i10), x10.y());
        } else {
            i0.O(obj, Q(i10), x10.C());
        }
    }

    private void b0(Object obj, int i10, X x10) {
        if (u(i10)) {
            x10.B(this.f16773n.c(obj, Q(i10)));
        } else {
            x10.A(this.f16773n.c(obj, Q(i10)));
        }
    }

    private static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void d0(Object obj, int i10) {
        int iX = X(i10);
        long j10 = 1048575 & iX;
        if (j10 == 1048575) {
            return;
        }
        i0.M(obj, j10, (1 << (iX >>> 20)) | i0.w(obj, j10));
    }

    private void e0(Object obj, int i10, int i11) {
        i0.M(obj, X(i11) & 1048575, i10);
    }

    private int f0(int i10, int i11) {
        int length = (this.f16760a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iP = P(i13);
            if (i10 == iP) {
                return i13;
            }
            if (i10 < iP) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void g0(Object obj, int i10, Object obj2) {
        f16759s.putObject(obj, Q(j0(i10)), obj2);
        d0(obj, i10);
    }

    private void h0(Object obj, int i10, int i11, Object obj2) {
        f16759s.putObject(obj, Q(j0(i11)), obj2);
        e0(obj, i10, i11);
    }

    private boolean i(Object obj, Object obj2, int i10) {
        return v(obj, i10) == v(obj2, i10);
    }

    private static int i0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean j(Object obj, long j10) {
        return i0.p(obj, j10);
    }

    private int j0(int i10) {
        return this.f16760a[i10 + 1];
    }

    private static void k(Object obj) {
        if (A(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k0(Object obj, l0 l0Var) {
        Map.Entry entry;
        Iterator it;
        boolean z10;
        Map.Entry entry2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        M m10 = this;
        if (m10.f16765f) {
            C1724q c1724qC = m10.f16775p.c(obj);
            if (c1724qC.j()) {
                entry = null;
                it = null;
            } else {
                Iterator itN = c1724qC.n();
                entry = (Map.Entry) itN.next();
                it = itN;
            }
        }
        int length = m10.f16760a.length;
        Unsafe unsafe = f16759s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iJ0 = m10.j0(i14);
            int iP = m10.P(i14);
            int iI0 = i0(iJ0);
            if (iI0 <= 17) {
                int i16 = m10.f16760a[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                int i18 = 1 << (i16 >>> 20);
                entry2 = entry;
                i10 = i13;
                i11 = i15;
                i12 = i18;
            } else {
                z10 = true;
                entry2 = entry;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry2 != null && m10.f16775p.a(entry2) <= iP) {
                m10.f16775p.j(l0Var, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jQ = Q(iJ0);
            switch (iI0) {
                case 0:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.writeDouble(iP, l(obj, jQ));
                    }
                    break;
                case 1:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.writeFloat(iP, o(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 2:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.o(iP, unsafe.getLong(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 3:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.m(iP, unsafe.getLong(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 4:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.s(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 5:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.g(iP, unsafe.getLong(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 6:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.d(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 7:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.p(iP, j(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 8:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        m10.n0(iP, unsafe.getObject(obj, jQ), l0Var);
                    }
                    break;
                case 9:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.y(iP, unsafe.getObject(obj, jQ), m10.r(i14));
                    }
                    break;
                case 10:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.v(iP, (AbstractC1713f) unsafe.getObject(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 11:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.b(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 12:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.F(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.q(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.w(iP, unsafe.getLong(obj, jQ));
                    }
                    m10 = this;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.K(iP, unsafe.getInt(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 16:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.C(iP, unsafe.getLong(obj, jQ));
                    }
                    m10 = this;
                    break;
                case 17:
                    if (m10.w(obj, i14, i10, i11, i12)) {
                        l0Var.M(iP, unsafe.getObject(obj, jQ), m10.r(i14));
                    }
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    a0.N(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    a0.R(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    a0.U(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    a0.c0(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    a0.T(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    a0.Q(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    a0.P(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    a0.L(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    a0.a0(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    a0.V(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, m10.r(i14));
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    a0.M(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var);
                    break;
                case 29:
                    z11 = false;
                    a0.b0(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case 30:
                    z11 = false;
                    a0.O(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case 31:
                    z11 = false;
                    a0.W(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    z11 = false;
                    a0.X(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case 33:
                    z11 = false;
                    a0.Y(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case 34:
                    z11 = false;
                    a0.Z(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, false);
                    break;
                case 35:
                    a0.N(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 36:
                    a0.R(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 37:
                    a0.U(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 38:
                    a0.c0(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 39:
                    a0.T(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 40:
                    a0.Q(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 41:
                    a0.P(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 42:
                    a0.L(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 43:
                    a0.b0(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 44:
                    a0.O(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case BuildConfig.VERSION_CODE /* 45 */:
                    a0.W(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 46:
                    a0.X(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 47:
                    a0.Y(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 48:
                    a0.Z(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, z10);
                    break;
                case 49:
                    a0.S(m10.P(i14), (List) unsafe.getObject(obj, jQ), l0Var, m10.r(i14));
                    break;
                case 50:
                    m10.m0(l0Var, iP, unsafe.getObject(obj, jQ), i14);
                    break;
                case 51:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.writeDouble(iP, S(obj, jQ));
                    }
                    break;
                case 52:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.writeFloat(iP, T(obj, jQ));
                    }
                    break;
                case 53:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.o(iP, V(obj, jQ));
                    }
                    break;
                case 54:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.m(iP, V(obj, jQ));
                    }
                    break;
                case 55:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.s(iP, U(obj, jQ));
                    }
                    break;
                case 56:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.g(iP, V(obj, jQ));
                    }
                    break;
                case 57:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.d(iP, U(obj, jQ));
                    }
                    break;
                case 58:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.p(iP, R(obj, jQ));
                    }
                    break;
                case 59:
                    if (m10.C(obj, iP, i14)) {
                        m10.n0(iP, unsafe.getObject(obj, jQ), l0Var);
                    }
                    break;
                case 60:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.y(iP, unsafe.getObject(obj, jQ), m10.r(i14));
                    }
                    break;
                case 61:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.v(iP, (AbstractC1713f) unsafe.getObject(obj, jQ));
                    }
                    break;
                case 62:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.b(iP, U(obj, jQ));
                    }
                    break;
                case 63:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.F(iP, U(obj, jQ));
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.q(iP, U(obj, jQ));
                    }
                    break;
                case 65:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.w(iP, V(obj, jQ));
                    }
                    break;
                case 66:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.K(iP, U(obj, jQ));
                    }
                    break;
                case 67:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.C(iP, V(obj, jQ));
                    }
                    break;
                case 68:
                    if (m10.C(obj, iP, i14)) {
                        l0Var.M(iP, unsafe.getObject(obj, jQ), m10.r(i14));
                    }
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry2;
        }
        while (entry != null) {
            m10.f16775p.j(l0Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        m10.o0(m10.f16774o, obj, l0Var);
    }

    private static double l(Object obj, long j10) {
        return i0.u(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l0(Object obj, l0 l0Var) {
        Iterator itE;
        Map.Entry entry;
        o0(this.f16774o, obj, l0Var);
        if (this.f16765f) {
            C1724q c1724qC = this.f16775p.c(obj);
            if (c1724qC.j()) {
                itE = null;
                entry = null;
            } else {
                itE = c1724qC.e();
                entry = (Map.Entry) itE.next();
            }
        }
        for (int length = this.f16760a.length - 3; length >= 0; length -= 3) {
            int iJ0 = j0(length);
            int iP = P(length);
            while (entry != null && this.f16775p.a(entry) > iP) {
                this.f16775p.j(l0Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            switch (i0(iJ0)) {
                case 0:
                    if (v(obj, length)) {
                        l0Var.writeDouble(iP, l(obj, Q(iJ0)));
                    }
                    break;
                case 1:
                    if (v(obj, length)) {
                        l0Var.writeFloat(iP, o(obj, Q(iJ0)));
                    }
                    break;
                case 2:
                    if (v(obj, length)) {
                        l0Var.o(iP, E(obj, Q(iJ0)));
                    }
                    break;
                case 3:
                    if (v(obj, length)) {
                        l0Var.m(iP, E(obj, Q(iJ0)));
                    }
                    break;
                case 4:
                    if (v(obj, length)) {
                        l0Var.s(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case 5:
                    if (v(obj, length)) {
                        l0Var.g(iP, E(obj, Q(iJ0)));
                    }
                    break;
                case 6:
                    if (v(obj, length)) {
                        l0Var.d(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case 7:
                    if (v(obj, length)) {
                        l0Var.p(iP, j(obj, Q(iJ0)));
                    }
                    break;
                case 8:
                    if (v(obj, length)) {
                        n0(iP, i0.z(obj, Q(iJ0)), l0Var);
                    }
                    break;
                case 9:
                    if (v(obj, length)) {
                        l0Var.y(iP, i0.z(obj, Q(iJ0)), r(length));
                    }
                    break;
                case 10:
                    if (v(obj, length)) {
                        l0Var.v(iP, (AbstractC1713f) i0.z(obj, Q(iJ0)));
                    }
                    break;
                case 11:
                    if (v(obj, length)) {
                        l0Var.b(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case 12:
                    if (v(obj, length)) {
                        l0Var.F(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    if (v(obj, length)) {
                        l0Var.q(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    if (v(obj, length)) {
                        l0Var.w(iP, E(obj, Q(iJ0)));
                    }
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    if (v(obj, length)) {
                        l0Var.K(iP, t(obj, Q(iJ0)));
                    }
                    break;
                case 16:
                    if (v(obj, length)) {
                        l0Var.C(iP, E(obj, Q(iJ0)));
                    }
                    break;
                case 17:
                    if (v(obj, length)) {
                        l0Var.M(iP, i0.z(obj, Q(iJ0)), r(length));
                    }
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    a0.N(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    a0.R(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    a0.U(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    a0.c0(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    a0.T(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    a0.Q(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    a0.P(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    a0.L(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    a0.a0(P(length), (List) i0.z(obj, Q(iJ0)), l0Var);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    a0.V(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, r(length));
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    a0.M(P(length), (List) i0.z(obj, Q(iJ0)), l0Var);
                    break;
                case 29:
                    a0.b0(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case 30:
                    a0.O(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case 31:
                    a0.W(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    a0.X(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case 33:
                    a0.Y(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case 34:
                    a0.Z(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, false);
                    break;
                case 35:
                    a0.N(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 36:
                    a0.R(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 37:
                    a0.U(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 38:
                    a0.c0(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 39:
                    a0.T(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 40:
                    a0.Q(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 41:
                    a0.P(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 42:
                    a0.L(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 43:
                    a0.b0(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 44:
                    a0.O(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case BuildConfig.VERSION_CODE /* 45 */:
                    a0.W(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 46:
                    a0.X(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 47:
                    a0.Y(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 48:
                    a0.Z(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, true);
                    break;
                case 49:
                    a0.S(P(length), (List) i0.z(obj, Q(iJ0)), l0Var, r(length));
                    break;
                case 50:
                    m0(l0Var, iP, i0.z(obj, Q(iJ0)), length);
                    break;
                case 51:
                    if (C(obj, iP, length)) {
                        l0Var.writeDouble(iP, S(obj, Q(iJ0)));
                    }
                    break;
                case 52:
                    if (C(obj, iP, length)) {
                        l0Var.writeFloat(iP, T(obj, Q(iJ0)));
                    }
                    break;
                case 53:
                    if (C(obj, iP, length)) {
                        l0Var.o(iP, V(obj, Q(iJ0)));
                    }
                    break;
                case 54:
                    if (C(obj, iP, length)) {
                        l0Var.m(iP, V(obj, Q(iJ0)));
                    }
                    break;
                case 55:
                    if (C(obj, iP, length)) {
                        l0Var.s(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case 56:
                    if (C(obj, iP, length)) {
                        l0Var.g(iP, V(obj, Q(iJ0)));
                    }
                    break;
                case 57:
                    if (C(obj, iP, length)) {
                        l0Var.d(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case 58:
                    if (C(obj, iP, length)) {
                        l0Var.p(iP, R(obj, Q(iJ0)));
                    }
                    break;
                case 59:
                    if (C(obj, iP, length)) {
                        n0(iP, i0.z(obj, Q(iJ0)), l0Var);
                    }
                    break;
                case 60:
                    if (C(obj, iP, length)) {
                        l0Var.y(iP, i0.z(obj, Q(iJ0)), r(length));
                    }
                    break;
                case 61:
                    if (C(obj, iP, length)) {
                        l0Var.v(iP, (AbstractC1713f) i0.z(obj, Q(iJ0)));
                    }
                    break;
                case 62:
                    if (C(obj, iP, length)) {
                        l0Var.b(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case 63:
                    if (C(obj, iP, length)) {
                        l0Var.F(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (C(obj, iP, length)) {
                        l0Var.q(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case 65:
                    if (C(obj, iP, length)) {
                        l0Var.w(iP, V(obj, Q(iJ0)));
                    }
                    break;
                case 66:
                    if (C(obj, iP, length)) {
                        l0Var.K(iP, U(obj, Q(iJ0)));
                    }
                    break;
                case 67:
                    if (C(obj, iP, length)) {
                        l0Var.C(iP, V(obj, Q(iJ0)));
                    }
                    break;
                case 68:
                    if (C(obj, iP, length)) {
                        l0Var.M(iP, i0.z(obj, Q(iJ0)), r(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f16775p.j(l0Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
    }

    private boolean m(Object obj, Object obj2, int i10) {
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        switch (i0(iJ0)) {
            case 0:
                if (!i(obj, obj2, i10) || Double.doubleToLongBits(i0.u(obj, jQ)) != Double.doubleToLongBits(i0.u(obj2, jQ))) {
                }
                break;
            case 1:
                if (!i(obj, obj2, i10) || Float.floatToIntBits(i0.v(obj, jQ)) != Float.floatToIntBits(i0.v(obj2, jQ))) {
                }
                break;
            case 2:
                if (!i(obj, obj2, i10) || i0.x(obj, jQ) != i0.x(obj2, jQ)) {
                }
                break;
            case 3:
                if (!i(obj, obj2, i10) || i0.x(obj, jQ) != i0.x(obj2, jQ)) {
                }
                break;
            case 4:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case 5:
                if (!i(obj, obj2, i10) || i0.x(obj, jQ) != i0.x(obj2, jQ)) {
                }
                break;
            case 6:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case 7:
                if (!i(obj, obj2, i10) || i0.p(obj, jQ) != i0.p(obj2, jQ)) {
                }
                break;
            case 8:
                if (!i(obj, obj2, i10) || !a0.H(i0.z(obj, jQ), i0.z(obj2, jQ))) {
                }
                break;
            case 9:
                if (!i(obj, obj2, i10) || !a0.H(i0.z(obj, jQ), i0.z(obj2, jQ))) {
                }
                break;
            case 10:
                if (!i(obj, obj2, i10) || !a0.H(i0.z(obj, jQ), i0.z(obj2, jQ))) {
                }
                break;
            case 11:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case 12:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                if (!i(obj, obj2, i10) || i0.x(obj, jQ) != i0.x(obj2, jQ)) {
                }
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                if (!i(obj, obj2, i10) || i0.w(obj, jQ) != i0.w(obj2, jQ)) {
                }
                break;
            case 16:
                if (!i(obj, obj2, i10) || i0.x(obj, jQ) != i0.x(obj2, jQ)) {
                }
                break;
            case 17:
                if (!i(obj, obj2, i10) || !a0.H(i0.z(obj, jQ), i0.z(obj2, jQ))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!B(obj, obj2, i10) || !a0.H(i0.z(obj, jQ), i0.z(obj2, jQ))) {
                }
                break;
        }
        return true;
    }

    private void m0(l0 l0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            l0Var.J(i10, this.f16776q.c(q(i11)), this.f16776q.h(obj));
        }
    }

    private Object n(Object obj, int i10, Object obj2, f0 f0Var, Object obj3) {
        P(i10);
        if (i0.z(obj, Q(j0(i10))) == null) {
            return obj2;
        }
        p(i10);
        return obj2;
    }

    private void n0(int i10, Object obj, l0 l0Var) {
        if (obj instanceof String) {
            l0Var.l(i10, (String) obj);
        } else {
            l0Var.v(i10, (AbstractC1713f) obj);
        }
    }

    private static float o(Object obj, long j10) {
        return i0.v(obj, j10);
    }

    private void o0(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.t(f0Var.g(obj), l0Var);
    }

    private AbstractC1727u.a p(int i10) {
        android.support.v4.media.session.b.a(this.f16761b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i10) {
        return this.f16761b[(i10 / 3) * 2];
    }

    private Y r(int i10) {
        int i11 = (i10 / 3) * 2;
        Y y10 = (Y) this.f16761b[i11];
        if (y10 != null) {
            return y10;
        }
        Y yC = U.a().c((Class) this.f16761b[i11 + 1]);
        this.f16761b[i11] = yC;
        return yC;
    }

    private int s(f0 f0Var, Object obj) {
        return f0Var.h(f0Var.g(obj));
    }

    private static int t(Object obj, long j10) {
        return i0.w(obj, j10);
    }

    private static boolean u(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean v(Object obj, int i10) {
        boolean zEquals;
        int iX = X(i10);
        long j10 = 1048575 & iX;
        if (j10 != 1048575) {
            return (i0.w(obj, j10) & (1 << (iX >>> 20))) != 0;
        }
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        switch (i0(iJ0)) {
            case 0:
                return Double.doubleToRawLongBits(i0.u(obj, jQ)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.v(obj, jQ)) != 0;
            case 2:
                return i0.x(obj, jQ) != 0;
            case 3:
                return i0.x(obj, jQ) != 0;
            case 4:
                return i0.w(obj, jQ) != 0;
            case 5:
                return i0.x(obj, jQ) != 0;
            case 6:
                return i0.w(obj, jQ) != 0;
            case 7:
                return i0.p(obj, jQ);
            case 8:
                Object objZ = i0.z(obj, jQ);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof AbstractC1713f)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC1713f.f16826h.equals(objZ);
                }
                break;
            case 9:
                return i0.z(obj, jQ) != null;
            case 10:
                zEquals = AbstractC1713f.f16826h.equals(i0.z(obj, jQ));
                break;
            case 11:
                return i0.w(obj, jQ) != 0;
            case 12:
                return i0.w(obj, jQ) != 0;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return i0.w(obj, jQ) != 0;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return i0.x(obj, jQ) != 0;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return i0.w(obj, jQ) != 0;
            case 16:
                return i0.x(obj, jQ) != 0;
            case 17:
                return i0.z(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean w(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? v(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean x(Object obj, int i10, Y y10) {
        return y10.d(i0.z(obj, Q(i10)));
    }

    private boolean y(Object obj, int i10, int i11) {
        List list = (List) i0.z(obj, Q(i10));
        if (list.isEmpty()) {
            return true;
        }
        Y yR = r(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!yR.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean z(Object obj, int i10, int i11) {
        Map mapH = this.f16776q.h(i0.z(obj, Q(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f16776q.c(q(i11)).f16751c.h() != k0.c.MESSAGE) {
            return true;
        }
        Y yC = null;
        for (Object obj2 : mapH.values()) {
            if (yC == null) {
                yC = U.a().c(obj2.getClass());
            }
            if (!yC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f16760a.length; i10 += 3) {
            J(obj, obj2, i10);
        }
        a0.F(this.f16774o, obj, obj2);
        if (this.f16765f) {
            a0.D(this.f16775p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(Object obj, X x10, C1720m c1720m) throws Throwable {
        c1720m.getClass();
        k(obj);
        F(this.f16774o, this.f16775p, obj, x10, c1720m);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Object obj) {
        if (A(obj)) {
            if (obj instanceof AbstractC1726t) {
                AbstractC1726t abstractC1726t = (AbstractC1726t) obj;
                abstractC1726t.l();
                abstractC1726t.k();
                abstractC1726t.D();
            }
            int length = this.f16760a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iJ0 = j0(i10);
                long jQ = Q(iJ0);
                int iI0 = i0(iJ0);
                if (iI0 != 9) {
                    if (iI0 != 60 && iI0 != 68) {
                        switch (iI0) {
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                            case 29:
                            case 30:
                            case 31:
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f16773n.b(obj, jQ);
                                break;
                            case 50:
                                Unsafe unsafe = f16759s;
                                Object object = unsafe.getObject(obj, jQ);
                                if (object != null) {
                                    unsafe.putObject(obj, jQ, this.f16776q.b(object));
                                }
                                break;
                        }
                    } else if (C(obj, P(i10), i10)) {
                        r(i10).c(f16759s.getObject(obj, jQ));
                    }
                } else if (v(obj, i10)) {
                    r(i10).c(f16759s.getObject(obj, jQ));
                }
            }
            this.f16774o.j(obj);
            if (this.f16765f) {
                this.f16775p.f(obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f16770k) {
            int i15 = this.f16769j[i13];
            int iP = P(i15);
            int iJ0 = j0(i15);
            int i16 = this.f16760a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f16759s.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            Object obj2 = obj;
            if (D(iJ0) && !w(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int iI0 = i0(iJ0);
            if (iI0 == 9 || iI0 == 17) {
                if (w(obj2, i15, i10, i11, i18) && !x(obj2, iJ0, r(i15))) {
                    return false;
                }
            } else if (iI0 == 27) {
                if (!y(obj2, iJ0, i15)) {
                    return false;
                }
            } else if (iI0 == 60 || iI0 == 68) {
                if (C(obj2, iP, i15) && !x(obj2, iJ0, r(i15))) {
                    return false;
                }
            } else if (iI0 != 49) {
                if (iI0 == 50 && !z(obj2, iJ0, i15)) {
                    return false;
                }
            }
            i13++;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        return !this.f16765f || this.f16775p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void e(Object obj, l0 l0Var) {
        if (l0Var.h() == l0.a.DESCENDING) {
            l0(obj, l0Var);
        } else {
            k0(obj, l0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean f(Object obj, Object obj2) {
        int length = this.f16760a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f16774o.g(obj).equals(this.f16774o.g(obj2))) {
            return false;
        }
        if (this.f16765f) {
            return this.f16775p.c(obj).equals(this.f16775p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int i10;
        int iH;
        int iP;
        int iW;
        int i11;
        int iO;
        int iQ;
        M m10 = this;
        Object obj2 = obj;
        Unsafe unsafe = f16759s;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < m10.f16760a.length) {
            int iJ0 = m10.j0(i13);
            int iI0 = i0(iJ0);
            int iP2 = m10.P(i13);
            int i17 = m10.f16760a[i13 + 2];
            int i18 = i17 & i12;
            if (iI0 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long jQ = Q(iJ0);
            if (iI0 < r.f16980U.h() || iI0 > r.f16993h0.h()) {
                i18 = 0;
            }
            switch (iI0) {
                case 0:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iH = AbstractC1716i.h(iP2, 0.0d);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 1:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.p(iP2, 0.0f);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 2:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.w(iP2, unsafe.getLong(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 3:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.R(iP2, unsafe.getLong(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 4:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.u(iP2, unsafe.getInt(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 5:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.n(iP2, 0L);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 6:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.l(iP2, 0);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 7:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.c(iP2, true);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 8:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(obj2, jQ);
                        iW = object instanceof AbstractC1713f ? AbstractC1716i.f(iP2, (AbstractC1713f) object) : AbstractC1716i.M(iP2, (String) object);
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 9:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iH = a0.o(iP2, unsafe.getObject(obj2, jQ), m10.r(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 10:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.f(iP2, (AbstractC1713f) unsafe.getObject(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 11:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.P(iP2, unsafe.getInt(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 12:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.j(iP2, unsafe.getInt(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.E(iP2, 0);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1716i.G(iP2, 0L);
                        i15 = i19 + iP;
                        m10 = this;
                        obj2 = obj;
                    }
                    m10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.I(iP2, unsafe.getInt(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 16:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1716i.K(iP2, unsafe.getLong(obj2, jQ));
                        i15 = i19 + iW;
                        m10 = this;
                    }
                    m10 = this;
                    i15 = i19;
                    break;
                case 17:
                    if (m10.w(obj2, i13, i16, i14, i10)) {
                        iH = AbstractC1716i.r(iP2, (J) unsafe.getObject(obj2, jQ), m10.r(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    iH = a0.h(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    iH = a0.f(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    iH = a0.m(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    iH = a0.x(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    iH = a0.k(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    iH = a0.h(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    iH = a0.f(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    iH = a0.a(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    iH = a0.u(iP2, (List) unsafe.getObject(obj2, jQ));
                    i15 = i19 + iH;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    iH = a0.p(iP2, (List) unsafe.getObject(obj2, jQ), m10.r(i13));
                    i15 = i19 + iH;
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    iH = a0.c(iP2, (List) unsafe.getObject(obj2, jQ));
                    i15 = i19 + iH;
                    break;
                case 29:
                    iH = a0.v(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case 30:
                    iH = a0.d(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case 31:
                    iH = a0.f(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    iH = a0.h(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case 33:
                    iH = a0.q(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case 34:
                    iH = a0.s(iP2, (List) unsafe.getObject(obj2, jQ), false);
                    i15 = i19 + iH;
                    break;
                case 35:
                    i11 = a0.i((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 36:
                    i11 = a0.g((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 37:
                    i11 = a0.n((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 38:
                    i11 = a0.y((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 39:
                    i11 = a0.l((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 40:
                    i11 = a0.i((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 41:
                    i11 = a0.g((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 42:
                    i11 = a0.b((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 43:
                    i11 = a0.w((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 44:
                    i11 = a0.e((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case BuildConfig.VERSION_CODE /* 45 */:
                    i11 = a0.g((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 46:
                    i11 = a0.i((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 47:
                    i11 = a0.r((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 48:
                    i11 = a0.t((List) unsafe.getObject(obj2, jQ));
                    if (i11 > 0) {
                        if (m10.f16768i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1716i.O(iP2);
                        iQ = AbstractC1716i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 49:
                    iH = a0.j(iP2, (List) unsafe.getObject(obj2, jQ), m10.r(i13));
                    i15 = i19 + iH;
                    break;
                case 50:
                    iH = m10.f16776q.f(iP2, unsafe.getObject(obj2, jQ), m10.q(i13));
                    i15 = i19 + iH;
                    break;
                case 51:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.h(iP2, 0.0d);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 52:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.p(iP2, 0.0f);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 53:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.w(iP2, V(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 54:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.R(iP2, V(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 55:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.u(iP2, U(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 56:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.n(iP2, 0L);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 57:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.l(iP2, 0);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 58:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.c(iP2, true);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 59:
                    if (m10.C(obj2, iP2, i13)) {
                        Object object2 = unsafe.getObject(obj2, jQ);
                        iH = object2 instanceof AbstractC1713f ? AbstractC1716i.f(iP2, (AbstractC1713f) object2) : AbstractC1716i.M(iP2, (String) object2);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 60:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = a0.o(iP2, unsafe.getObject(obj2, jQ), m10.r(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 61:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.f(iP2, (AbstractC1713f) unsafe.getObject(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 62:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.P(iP2, U(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 63:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.j(iP2, U(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.E(iP2, 0);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 65:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.G(iP2, 0L);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 66:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.I(iP2, U(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 67:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.K(iP2, V(obj2, jQ));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 68:
                    if (m10.C(obj2, iP2, i13)) {
                        iH = AbstractC1716i.r(iP2, (J) unsafe.getObject(obj2, jQ), m10.r(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iS = i15 + m10.s(m10.f16774o, obj2);
        return m10.f16765f ? iS + m10.f16775p.c(obj2).h() : iS;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int h(Object obj) {
        int i10;
        int iF;
        int length = this.f16760a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iJ0 = j0(i12);
            int iP = P(i12);
            long jQ = Q(iJ0);
            int iHashCode = 37;
            switch (i0(iJ0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(Double.doubleToLongBits(i0.u(obj, jQ)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(i0.v(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(i0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(i0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(i0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.c(i0.p(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) i0.z(obj, jQ)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = i0.z(obj, jQ);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = i0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(i0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    i10 = i11 * 53;
                    iF = i0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC1727u.f(i0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = i0.z(obj, jQ);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case BuildConfig.VERSION_CODE /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = i0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = i0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(Double.doubleToLongBits(S(obj, jQ)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(T(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.c(R(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) i0.z(obj, jQ)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = i0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = i0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1727u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = i0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f16774o.g(obj).hashCode();
        return this.f16765f ? (iHashCode2 * 53) + this.f16775p.c(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object newInstance() {
        return this.f16772m.a(this.f16764e);
    }
}
