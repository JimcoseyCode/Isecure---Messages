package androidx.recyclerview.widget;

import I0.AbstractC0805b;
import I0.z;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1664d0;
import androidx.core.view.C1657a;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import g1.AbstractC2660a;
import g1.AbstractC2661b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.D {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    static boolean f17767H0 = false;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    static boolean f17768I0 = false;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private static final int[] f17769J0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final float f17770K0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    static final boolean f17771L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    static final boolean f17772M0 = true;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    static final boolean f17773N0 = true;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    static final boolean f17774O0 = true;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private static final boolean f17775P0 = false;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private static final boolean f17776Q0 = false;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private static final Class[] f17777R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    static final Interpolator f17778S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    static final B f17779T0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f17780A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    final int[] f17781A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f17782B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    final List f17783B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f17784C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private Runnable f17785C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f17786D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private boolean f17787D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f17788E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f17789E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f17790F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f17791F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17792G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final p.b f17793G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f17794H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AccessibilityManager f17795I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private List f17796J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f17797K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    boolean f17798L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f17799M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f17800N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private l f17801O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private EdgeEffect f17802P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private EdgeEffect f17803Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private EdgeEffect f17804R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private EdgeEffect f17805S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    m f17806T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f17807U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f17808V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private VelocityTracker f17809W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f17810a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f17811b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f17812c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f17813d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f17814e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private s f17815f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f17816g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final int f17817g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y f17818h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final int f17819h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final w f17820i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f17821i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    SavedState f17822j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f17823j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    a f17824k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f17825k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b f17826l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    final D f17827l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final androidx.recyclerview.widget.p f17828m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    e f17829m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f17830n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    e.b f17831n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Runnable f17832o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    final A f17833o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Rect f17834p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private u f17835p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f17836q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private List f17837q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final RectF f17838r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    boolean f17839r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    h f17840s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    boolean f17841s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    p f17842t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private m.a f17843t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List f17844u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f17845u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ArrayList f17846v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    androidx.recyclerview.widget.k f17847v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList f17848w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final int[] f17849w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t f17850x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private androidx.core.view.E f17851x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f17852y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final int[] f17853y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f17854z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final int[] f17855z0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f17857b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17868m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f17869n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f17870o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f17871p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17872q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17856a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17858c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17859d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17860e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17861f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f17862g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f17863h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f17864i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f17865j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f17866k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f17867l = false;

        void a(int i10) {
            if ((this.f17860e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f17860e));
        }

        public int b() {
            return this.f17863h ? this.f17858c - this.f17859d : this.f17861f;
        }

        public int c() {
            return this.f17856a;
        }

        public boolean d() {
            return this.f17856a != -1;
        }

        public boolean e() {
            return this.f17863h;
        }

        void f(h hVar) {
            this.f17860e = 1;
            this.f17861f = hVar.d();
            this.f17863h = false;
            this.f17864i = false;
            this.f17865j = false;
        }

        public boolean g() {
            return this.f17867l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f17856a + ", mData=" + this.f17857b + ", mItemCount=" + this.f17861f + ", mIsMeasuring=" + this.f17865j + ", mPreviousLayoutItemCount=" + this.f17858c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f17859d + ", mStructureChanged=" + this.f17862g + ", mInPreLayout=" + this.f17863h + ", mRunSimpleAnimations=" + this.f17866k + ", mRunPredictiveAnimations=" + this.f17867l + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class B extends l {
        B() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class C {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class D implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f17873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f17874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        OverScroller f17875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Interpolator f17876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f17877k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f17878l;

        D() {
            Interpolator interpolator = RecyclerView.f17778S0;
            this.f17876j = interpolator;
            this.f17877k = false;
            this.f17878l = false;
            this.f17875i = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC1658a0.c0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f17874h = 0;
            this.f17873g = 0;
            Interpolator interpolator = this.f17876j;
            Interpolator interpolator2 = RecyclerView.f17778S0;
            if (interpolator != interpolator2) {
                this.f17876j = interpolator2;
                this.f17875i = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f17875i.fling(0, 0, i10, i11, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES);
            d();
        }

        void d() {
            if (this.f17877k) {
                this.f17878l = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f17778S0;
            }
            if (this.f17876j != interpolator) {
                this.f17876j = interpolator;
                this.f17875i = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f17874h = 0;
            this.f17873g = 0;
            RecyclerView.this.setScrollState(2);
            this.f17875i.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f17875i.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17842t == null) {
                f();
                return;
            }
            this.f17878l = false;
            this.f17877k = true;
            recyclerView.A();
            OverScroller overScroller = this.f17875i;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f17873g;
                int i13 = currY - this.f17874h;
                this.f17873g = currX;
                this.f17874h = currY;
                int iX = RecyclerView.this.x(i12);
                int iZ = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f17781A0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(iX, iZ, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f17781A0;
                    iX -= iArr2[0];
                    iZ -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(iX, iZ);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f17840s != null) {
                    int[] iArr3 = recyclerView3.f17781A0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.p1(iX, iZ, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f17781A0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iX -= i14;
                    iZ -= i15;
                    z zVar = recyclerView4.f17842t.f17931g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.f17833o0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else if (zVar.f() >= iB) {
                            zVar.p(iB - 1);
                            zVar.j(i14, i15);
                        } else {
                            zVar.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = iX;
                int i17 = iZ;
                if (!RecyclerView.this.f17846v.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f17781A0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f17781A0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                z zVar2 = RecyclerView.this.f17842t.f17931g;
                if ((zVar2 == null || !zVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i20, currVelocity);
                    }
                    if (RecyclerView.f17774O0) {
                        RecyclerView.this.f17831n0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f17829m0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f17842t.f17931g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f17877k = false;
            if (this.f17878l) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.E1(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class E {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final List f17880t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f17881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference f17882b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17890j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RecyclerView f17898r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        h f17899s;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17883c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17884d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f17885e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17886f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17887g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        E f17888h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        E f17889i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List f17891k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f17892l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f17893m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        w f17894n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f17895o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f17896p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17897q = -1;

        public E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f17881a = view;
        }

        private void g() {
            if (this.f17891k == null) {
                ArrayList arrayList = new ArrayList();
                this.f17891k = arrayList;
                this.f17892l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, boolean z10) {
            if (this.f17884d == -1) {
                this.f17884d = this.f17883c;
            }
            if (this.f17887g == -1) {
                this.f17887g = this.f17883c;
            }
            if (z10) {
                this.f17887g += i10;
            }
            this.f17883c += i10;
            if (this.f17881a.getLayoutParams() != null) {
                ((q) this.f17881a.getLayoutParams()).f17951c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i10 = this.f17897q;
            if (i10 != -1) {
                this.f17896p = i10;
            } else {
                this.f17896p = AbstractC1658a0.w(this.f17881a);
            }
            recyclerView.s1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.s1(this, this.f17896p);
            this.f17896p = 0;
        }

        void D() {
            if (RecyclerView.f17767H0 && x()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f17890j = 0;
            this.f17883c = -1;
            this.f17884d = -1;
            this.f17885e = -1L;
            this.f17887g = -1;
            this.f17893m = 0;
            this.f17888h = null;
            this.f17889i = null;
            d();
            this.f17896p = 0;
            this.f17897q = -1;
            RecyclerView.u(this);
        }

        void E() {
            if (this.f17884d == -1) {
                this.f17884d = this.f17883c;
            }
        }

        void F(int i10, int i11) {
            this.f17890j = (i10 & i11) | (this.f17890j & (~i11));
        }

        public final void G(boolean z10) {
            int i10 = this.f17893m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f17893m = i11;
            if (i11 < 0) {
                this.f17893m = 0;
                if (RecyclerView.f17767H0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                toString();
            } else if (!z10 && i11 == 1) {
                this.f17890j |= 16;
            } else if (z10 && i11 == 0) {
                this.f17890j &= -17;
            }
            if (RecyclerView.f17768I0) {
                toString();
            }
        }

        void H(w wVar, boolean z10) {
            this.f17894n = wVar;
            this.f17895o = z10;
        }

        boolean I() {
            return (this.f17890j & 16) != 0;
        }

        boolean J() {
            return (this.f17890j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        }

        void K() {
            this.f17894n.O(this);
        }

        boolean L() {
            return (this.f17890j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            } else if ((1024 & this.f17890j) == 0) {
                g();
                this.f17891k.add(obj);
            }
        }

        void b(int i10) {
            this.f17890j = i10 | this.f17890j;
        }

        void c() {
            this.f17884d = -1;
            this.f17887g = -1;
        }

        void d() {
            List list = this.f17891k;
            if (list != null) {
                list.clear();
            }
            this.f17890j &= -1025;
        }

        void e() {
            this.f17890j &= -33;
        }

        void f() {
            this.f17890j &= -257;
        }

        boolean h() {
            return (this.f17890j & 16) == 0 && AbstractC1658a0.N(this.f17881a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            A(i11, z10);
            this.f17883c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f17898r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.h0(this);
        }

        public final long k() {
            return this.f17885e;
        }

        public final int l() {
            return this.f17886f;
        }

        public final int m() {
            int i10 = this.f17887g;
            return i10 == -1 ? this.f17883c : i10;
        }

        public final int n() {
            return this.f17884d;
        }

        List o() {
            if ((this.f17890j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                return f17880t;
            }
            List list = this.f17891k;
            return (list == null || list.size() == 0) ? f17880t : this.f17892l;
        }

        boolean p(int i10) {
            return (i10 & this.f17890j) != 0;
        }

        boolean q() {
            return (this.f17890j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 || t();
        }

        boolean r() {
            return (this.f17881a.getParent() == null || this.f17881a.getParent() == this.f17898r) ? false : true;
        }

        boolean s() {
            return (this.f17890j & 1) != 0;
        }

        boolean t() {
            return (this.f17890j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f17883c + " id=" + this.f17885e + ", oldPos=" + this.f17884d + ", pLpos:" + this.f17887g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f17895o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f17893m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f17881a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f17890j & 16) == 0 && !AbstractC1658a0.N(this.f17881a);
        }

        boolean v() {
            return (this.f17890j & 8) != 0;
        }

        boolean w() {
            return this.f17894n != null;
        }

        boolean x() {
            return (this.f17890j & 256) != 0;
        }

        boolean y() {
            return (this.f17890j & 2) != 0;
        }

        boolean z() {
            return (this.f17890j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC1778a implements Runnable {
        RunnableC1778a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f17782B || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f17852y) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f17788E) {
                recyclerView2.f17786D = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC1779b implements Runnable {
        RunnableC1779b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f17806T;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f17845u0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class InterpolatorC1780c implements Interpolator {
        InterpolatorC1780c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C1781d implements p.b {
        C1781d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(E e10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17842t.q1(e10.f17881a, recyclerView.f17820i);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(E e10, m.b bVar, m.b bVar2) {
            RecyclerView.this.o(e10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(E e10, m.b bVar, m.b bVar2) {
            RecyclerView.this.f17820i.O(e10);
            RecyclerView.this.q(e10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(E e10, m.b bVar, m.b bVar2) {
            e10.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17797K) {
                if (recyclerView.f17806T.b(e10, e10, bVar, bVar2)) {
                    RecyclerView.this.T0();
                }
            } else if (recyclerView.f17806T.d(e10, bVar, bVar2)) {
                RecyclerView.this.T0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C1782e implements b.InterfaceC0185b {
        C1782e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void a(View view) {
            E eL0 = RecyclerView.l0(view);
            if (eL0 != null) {
                eL0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void b() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public int c(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public E d(View view) {
            return RecyclerView.l0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void e(int i10) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                E eL0 = RecyclerView.l0(childAt);
                if (eL0 != null) {
                    if (eL0.x() && !eL0.J()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + eL0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f17768I0) {
                        eL0.toString();
                    }
                    eL0.b(256);
                }
            } else if (RecyclerView.f17767H0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void f(View view) {
            E eL0 = RecyclerView.l0(view);
            if (eL0 != null) {
                eL0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void g(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public View getChildAt(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0185b
        public void i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            E eL0 = RecyclerView.l0(view);
            if (eL0 != null) {
                if (!eL0.x() && !eL0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + eL0 + RecyclerView.this.V());
                }
                if (RecyclerView.f17768I0) {
                    eL0.toString();
                }
                eL0.f();
            } else if (RecyclerView.f17767H0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements a.InterfaceC0184a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void a(int i10, int i11) {
            RecyclerView.this.J0(i10, i11);
            RecyclerView.this.f17839r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.H1(i10, i11, obj);
            RecyclerView.this.f17841s0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public E e(int i10) {
            E eF0 = RecyclerView.this.f0(i10, true);
            if (eF0 == null) {
                return null;
            }
            if (!RecyclerView.this.f17826l.n(eF0.f17881a)) {
                return eF0;
            }
            boolean z10 = RecyclerView.f17767H0;
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void f(int i10, int i11) {
            RecyclerView.this.K0(i10, i11, false);
            RecyclerView.this.f17839r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void g(int i10, int i11) {
            RecyclerView.this.I0(i10, i11);
            RecyclerView.this.f17839r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0184a
        public void h(int i10, int i11) {
            RecyclerView.this.K0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17839r0 = true;
            recyclerView.f17833o0.f17859d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f18048a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f17842t.V0(recyclerView, bVar.f18049b, bVar.f18051d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f17842t.Y0(recyclerView2, bVar.f18049b, bVar.f18051d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f17842t.a1(recyclerView3, bVar.f18049b, bVar.f18051d, bVar.f18050c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f17842t.X0(recyclerView4, bVar.f18049b, bVar.f18051d, 1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17906a;

        static {
            int[] iArr = new int[h.a.values().length];
            f17906a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17906a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11);
            }
        }

        public void d(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface k {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class l {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(E e10) {
            e10.G(true);
            if (e10.f17888h != null && e10.f17889i == null) {
                e10.f17888h = null;
            }
            e10.f17889i = null;
            if (e10.I() || RecyclerView.this.e1(e10.f17881a) || !e10.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e10.f17881a, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f17953a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17954b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set f17955c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f17956a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f17957b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f17958c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f17959d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f17953a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f17953a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f17954b++;
        }

        void b(h hVar) {
            this.f17955c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f17953a.size(); i10++) {
                a aVar = (a) this.f17953a.valueAt(i10);
                Iterator it = aVar.f17956a.iterator();
                while (it.hasNext()) {
                    L0.a.a(((E) it.next()).f17881a);
                }
                aVar.f17956a.clear();
            }
        }

        void d() {
            this.f17954b--;
        }

        void e(h hVar, boolean z10) {
            this.f17955c.remove(hVar);
            if (this.f17955c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f17953a.size(); i10++) {
                SparseArray sparseArray = this.f17953a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f17956a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    L0.a.a(((E) arrayList.get(i11)).f17881a);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f17959d = l(aVarI.f17959d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f17958c = l(aVarI.f17958c, j10);
        }

        public E h(int i10) {
            a aVar = (a) this.f17953a.get(i10);
            if (aVar == null || aVar.f17956a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f17956a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((E) arrayList.get(size)).r()) {
                    return (E) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f17954b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(E e10) {
            int iL = e10.l();
            ArrayList arrayList = i(iL).f17956a;
            if (((a) this.f17953a.get(iL)).f17957b <= arrayList.size()) {
                L0.a.a(e10.f17881a);
            } else {
                if (RecyclerView.f17767H0 && arrayList.contains(e10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                e10.D();
                arrayList.add(e10);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f17959d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f17958c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface x {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17833o0.f17862g = true;
            recyclerView.W0(true);
            if (RecyclerView.this.f17824k.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f17824k.r(i10, i11)) {
                d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f17824k.s(i10, i11)) {
                d();
            }
        }

        void d() {
            if (RecyclerView.f17773N0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17854z && recyclerView.f17852y) {
                    AbstractC1658a0.c0(recyclerView, recyclerView.f17832o);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f17794H = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f17970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f17971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f17974f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f17976h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17969a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f17975g = new a(0, 0);

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f17977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f17978b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f17979c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f17980d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f17981e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f17982f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f17983g;

            public a(int i10, int i11) {
                this(i10, i11, androidx.customview.widget.a.INVALID_ID, null);
            }

            private void e() {
                if (this.f17981e != null && this.f17979c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f17979c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f17980d >= 0;
            }

            public void b(int i10) {
                this.f17980d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f17980d;
                if (i10 >= 0) {
                    this.f17980d = -1;
                    recyclerView.C0(i10);
                    this.f17982f = false;
                } else {
                    if (!this.f17982f) {
                        this.f17983g = 0;
                        return;
                    }
                    e();
                    recyclerView.f17827l0.e(this.f17977a, this.f17978b, this.f17979c, this.f17981e);
                    this.f17983g++;
                    this.f17982f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f17977a = i10;
                this.f17978b = i11;
                this.f17979c = i12;
                this.f17981e = interpolator;
                this.f17982f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f17980d = -1;
                this.f17982f = false;
                this.f17983g = 0;
                this.f17977a = i10;
                this.f17978b = i11;
                this.f17979c = i12;
                this.f17981e = interpolator;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i10);
            }
            return null;
        }

        public View b(int i10) {
            return this.f17970b.f17842t.H(i10);
        }

        public int c() {
            return this.f17970b.f17842t.O();
        }

        public int d(View view) {
            return this.f17970b.j0(view);
        }

        public p e() {
            return this.f17971c;
        }

        public int f() {
            return this.f17969a;
        }

        public boolean g() {
            return this.f17972d;
        }

        public boolean h() {
            return this.f17973e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f17970b;
            if (this.f17969a == -1 || recyclerView == null) {
                r();
            }
            if (this.f17972d && this.f17974f == null && this.f17971c != null && (pointFA = a(this.f17969a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.p1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f17972d = false;
            View view = this.f17974f;
            if (view != null) {
                if (d(view) == this.f17969a) {
                    o(this.f17974f, recyclerView.f17833o0, this.f17975g);
                    this.f17975g.c(recyclerView);
                    r();
                } else {
                    this.f17974f = null;
                }
            }
            if (this.f17973e) {
                l(i10, i11, recyclerView.f17833o0, this.f17975g);
                boolean zA = this.f17975g.a();
                this.f17975g.c(recyclerView);
                if (zA && this.f17973e) {
                    this.f17972d = true;
                    recyclerView.f17827l0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f17974f = view;
                boolean z10 = RecyclerView.f17767H0;
            }
        }

        protected abstract void l(int i10, int i11, A a10, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, A a10, a aVar);

        public void p(int i10) {
            this.f17969a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f17827l0.f();
            this.f17970b = recyclerView;
            this.f17971c = pVar;
            int i10 = this.f17969a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f17833o0.f17856a = i10;
            this.f17973e = true;
            this.f17972d = true;
            this.f17974f = b(f());
            m();
            this.f17970b.f17827l0.d();
            this.f17976h = true;
        }

        protected final void r() {
            if (this.f17973e) {
                this.f17973e = false;
                n();
                this.f17970b.f17833o0.f17856a = -1;
                this.f17974f = null;
                this.f17969a = -1;
                this.f17972d = false;
                this.f17971c.j1(this);
                this.f17971c = null;
                this.f17970b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f17777R0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f17778S0 = new InterpolatorC1780c();
        f17779T0 = new B();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strO0 = o0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strO0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f17777R0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strO0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strO0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strO0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strO0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e16);
            }
        }
    }

    private boolean B0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f17834p.set(0, 0, view.getWidth(), view.getHeight());
        this.f17836q.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f17834p);
        offsetDescendantRectToMyCoords(view2, this.f17836q);
        byte b10 = -1;
        int i12 = this.f17842t.d0() == 1 ? -1 : 1;
        Rect rect = this.f17834p;
        int i13 = rect.left;
        Rect rect2 = this.f17836q;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    private boolean C1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17802P;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.f17802P, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f17804R;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.f17804R, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f17803Q;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.f17803Q, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f17805S;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.f17805S, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private boolean D(int i10, int i11) {
        a0(this.f17849w0);
        int[] iArr = this.f17849w0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void F0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f17842t;
        if (pVar == null || this.f17788E) {
            return;
        }
        int[] iArr = this.f17781A0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.f17842t.q();
        int i13 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iB1 = i10 - b1(i10, height);
        int iC1 = i11 - c1(i11, width);
        B1(i13, i12);
        if (L(zP ? iB1 : 0, zQ ? iC1 : 0, this.f17781A0, this.f17853y0, i12)) {
            int[] iArr2 = this.f17781A0;
            iB1 -= iArr2[0];
            iC1 -= iArr2[1];
        }
        o1(zP ? iB1 : 0, zQ ? iC1 : 0, motionEvent, i12);
        e eVar = this.f17829m0;
        if (eVar != null && (iB1 != 0 || iC1 != 0)) {
            eVar.f(this, iB1, iC1);
        }
        E1(i12);
    }

    private void G() {
        int i10 = this.f17792G;
        this.f17792G = 0;
        if (i10 == 0 || !z0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC0805b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void G1() {
        this.f17827l0.f();
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private void I() {
        this.f17833o0.a(1);
        W(this.f17833o0);
        this.f17833o0.f17865j = false;
        A1();
        this.f17828m.f();
        N0();
        V0();
        m1();
        A a10 = this.f17833o0;
        a10.f17864i = a10.f17866k && this.f17841s0;
        this.f17841s0 = false;
        this.f17839r0 = false;
        a10.f17863h = a10.f17867l;
        a10.f17861f = this.f17840s.d();
        a0(this.f17849w0);
        if (this.f17833o0.f17866k) {
            int iG = this.f17826l.g();
            for (int i10 = 0; i10 < iG; i10++) {
                E eL0 = l0(this.f17826l.f(i10));
                if (!eL0.J() && (!eL0.t() || this.f17840s.h())) {
                    this.f17828m.e(eL0, this.f17806T.t(this.f17833o0, eL0, m.e(eL0), eL0.o()));
                    if (this.f17833o0.f17864i && eL0.y() && !eL0.v() && !eL0.J() && !eL0.t()) {
                        this.f17828m.c(i0(eL0), eL0);
                    }
                }
            }
        }
        if (this.f17833o0.f17867l) {
            n1();
            A a11 = this.f17833o0;
            boolean z10 = a11.f17862g;
            a11.f17862g = false;
            this.f17842t.b1(this.f17820i, a11);
            this.f17833o0.f17862g = z10;
            for (int i11 = 0; i11 < this.f17826l.g(); i11++) {
                E eL02 = l0(this.f17826l.f(i11));
                if (!eL02.J() && !this.f17828m.i(eL02)) {
                    int iE = m.e(eL02);
                    boolean zP = eL02.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    m.b bVarT = this.f17806T.t(this.f17833o0, eL02, iE, eL02.o());
                    if (zP) {
                        Y0(eL02, bVarT);
                    } else {
                        this.f17828m.a(eL02, bVarT);
                    }
                }
            }
            v();
        } else {
            v();
        }
        O0();
        D1(false);
        this.f17833o0.f17860e = 2;
    }

    private void J() {
        A1();
        N0();
        this.f17833o0.a(6);
        this.f17824k.j();
        this.f17833o0.f17861f = this.f17840s.d();
        this.f17833o0.f17859d = 0;
        if (this.f17822j != null && this.f17840s.b()) {
            Parcelable parcelable = this.f17822j.f17900i;
            if (parcelable != null) {
                this.f17842t.g1(parcelable);
            }
            this.f17822j = null;
        }
        A a10 = this.f17833o0;
        a10.f17863h = false;
        this.f17842t.b1(this.f17820i, a10);
        A a11 = this.f17833o0;
        a11.f17862g = false;
        a11.f17866k = a11.f17866k && this.f17806T != null;
        a11.f17860e = 4;
        O0();
        D1(false);
    }

    private void K() {
        RecyclerView recyclerView;
        this.f17833o0.a(4);
        A1();
        N0();
        A a10 = this.f17833o0;
        a10.f17860e = 1;
        if (a10.f17866k) {
            for (int iG = this.f17826l.g() - 1; iG >= 0; iG--) {
                E eL0 = l0(this.f17826l.f(iG));
                if (!eL0.J()) {
                    long jI0 = i0(eL0);
                    m.b bVarS = this.f17806T.s(this.f17833o0, eL0);
                    E eG = this.f17828m.g(jI0);
                    if (eG == null || eG.J()) {
                        this.f17828m.d(eL0, bVarS);
                    } else {
                        boolean zH = this.f17828m.h(eG);
                        boolean zH2 = this.f17828m.h(eL0);
                        if (zH && eG == eL0) {
                            this.f17828m.d(eL0, bVarS);
                        } else {
                            m.b bVarN = this.f17828m.n(eG);
                            this.f17828m.d(eL0, bVarS);
                            m.b bVarM = this.f17828m.m(eL0);
                            if (bVarN == null) {
                                r0(jI0, eL0, eG);
                            } else {
                                p(eG, eL0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f17828m.o(recyclerView.f17793G0);
        } else {
            recyclerView = this;
        }
        recyclerView.f17842t.p1(recyclerView.f17820i);
        A a11 = recyclerView.f17833o0;
        a11.f17858c = a11.f17861f;
        recyclerView.f17797K = false;
        recyclerView.f17798L = false;
        a11.f17866k = false;
        a11.f17867l = false;
        recyclerView.f17842t.f17932h = false;
        ArrayList arrayList = recyclerView.f17820i.f17961b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f17842t;
        if (pVar.f17938n) {
            pVar.f17937m = 0;
            pVar.f17938n = false;
            recyclerView.f17820i.P();
        }
        recyclerView.f17842t.c1(recyclerView.f17833o0);
        O0();
        D1(false);
        recyclerView.f17828m.f();
        int[] iArr = recyclerView.f17849w0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        Z0();
        k1();
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.f17850x;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f17850x = null;
        }
        return true;
    }

    private void Q0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17808V) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f17808V = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f17812c0 = x10;
            this.f17810a0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f17813d0 = y10;
            this.f17811b0 = y10;
        }
    }

    private boolean U0() {
        return this.f17806T != null && this.f17842t.P1();
    }

    private void V0() {
        boolean z10;
        if (this.f17797K) {
            this.f17824k.w();
            if (this.f17798L) {
                this.f17842t.W0(this);
            }
        }
        if (U0()) {
            this.f17824k.u();
        } else {
            this.f17824k.j();
        }
        boolean z11 = this.f17839r0 || this.f17841s0;
        this.f17833o0.f17866k = this.f17782B && this.f17806T != null && ((z10 = this.f17797K) || z11 || this.f17842t.f17932h) && (!z10 || this.f17840s.h());
        A a10 = this.f17833o0;
        a10.f17867l = a10.f17866k && z11 && !this.f17797K && U0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void X0(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 < 0.0f) {
            S();
            androidx.core.widget.d.d(this.f17802P, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        } else {
            if (f11 <= 0.0f) {
                z10 = false;
                if (f13 >= 0.0f) {
                    U();
                    androidx.core.widget.d.d(this.f17803Q, (-f13) / getHeight(), f10 / getWidth());
                } else if (f13 > 0.0f) {
                    R();
                    androidx.core.widget.d.d(this.f17805S, f13 / getHeight(), 1.0f - (f10 / getWidth()));
                } else {
                    z11 = z10;
                }
                if (z11 && f11 == 0.0f && f13 == 0.0f) {
                    return;
                }
                AbstractC1658a0.b0(this);
            }
            T();
            androidx.core.widget.d.d(this.f17804R, f11 / getWidth(), f12 / getHeight());
        }
        z10 = true;
        if (f13 >= 0.0f) {
        }
        if (z11) {
        }
        AbstractC1658a0.b0(this);
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f17848w.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f17848w.get(i10);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.f17850x = tVar;
                return true;
            }
        }
        return false;
    }

    private void Z0() {
        View viewFindViewById;
        if (!this.f17825k0 || this.f17840s == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f17776Q0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f17826l.n(focusedChild)) {
                    return;
                }
            } else if (this.f17826l.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewC0 = null;
        E eE0 = (this.f17833o0.f17869n == -1 || !this.f17840s.h()) ? null : e0(this.f17833o0.f17869n);
        if (eE0 != null && !this.f17826l.n(eE0.f17881a) && eE0.f17881a.hasFocusable()) {
            viewC0 = eE0.f17881a;
        } else if (this.f17826l.g() > 0) {
            viewC0 = c0();
        }
        if (viewC0 != null) {
            int i10 = this.f17833o0.f17870o;
            if (i10 != -1 && (viewFindViewById = viewC0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewC0 = viewFindViewById;
            }
            viewC0.requestFocus();
        }
    }

    private void a0(int[] iArr) {
        int iG = this.f17826l.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ViewDefaults.NUMBER_OF_LINES;
        int i11 = androidx.customview.widget.a.INVALID_ID;
        for (int i12 = 0; i12 < iG; i12++) {
            E eL0 = l0(this.f17826l.f(i12));
            if (!eL0.J()) {
                int iM = eL0.m();
                if (iM < i10) {
                    i10 = iM;
                }
                if (iM > i11) {
                    i11 = iM;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void a1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f17802P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f17802P.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f17803Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f17803Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17804R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f17804R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17805S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f17805S.isFinished();
        }
        if (zIsFinished) {
            AbstractC1658a0.b0(this);
        }
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewB0 = b0(viewGroup.getChildAt(i10));
            if (recyclerViewB0 != null) {
                return recyclerViewB0;
            }
        }
        return null;
    }

    private int b1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f17802P;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17804R;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f17804R.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f17804R, width, height);
                    if (androidx.core.widget.d.b(this.f17804R) == 0.0f) {
                        this.f17804R.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f17802P.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.f17802P, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.f17802P) == 0.0f) {
                    this.f17802P.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private View c0() {
        E eD0;
        A a10 = this.f17833o0;
        int i10 = a10.f17868m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = a10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            E eD02 = d0(i11);
            if (eD02 == null) {
                break;
            }
            if (eD02.f17881a.hasFocusable()) {
                return eD02.f17881a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (eD0 = d0(iMin)) == null) {
                return null;
            }
        } while (!eD0.f17881a.hasFocusable());
        return eD0.f17881a;
    }

    private int c1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f17803Q;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17805S;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f17805S.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f17805S, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.f17805S) == 0.0f) {
                        this.f17805S.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f17803Q.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.f17803Q, -height, width);
                if (androidx.core.widget.d.b(this.f17803Q) == 0.0f) {
                    this.f17803Q.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private androidx.core.view.E getScrollingChildHelper() {
        if (this.f17851x0 == null) {
            this.f17851x0 = new androidx.core.view.E(this);
        }
        return this.f17851x0;
    }

    private void i(E e10) {
        View view = e10.f17881a;
        boolean z10 = view.getParent() == this;
        this.f17820i.O(k0(view));
        if (e10.x()) {
            this.f17826l.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f17826l.k(view);
        } else {
            this.f17826l.b(view, true);
        }
    }

    private void j1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f17834p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f17951c) {
                Rect rect = qVar.f17950b;
                Rect rect2 = this.f17834p;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f17834p);
            offsetRectIntoDescendantCoords(view, this.f17834p);
        }
        this.f17842t.w1(this, view, this.f17834p, !this.f17782B, view2 == null);
    }

    private void k1() {
        A a10 = this.f17833o0;
        a10.f17869n = -1L;
        a10.f17868m = -1;
        a10.f17870o = -1;
    }

    static E l0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f17949a;
    }

    private void l1() {
        VelocityTracker velocityTracker = this.f17809W;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        E1(0);
        a1();
    }

    static void m0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f17950b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void m1() {
        View focusedChild = (this.f17825k0 && hasFocus() && this.f17840s != null) ? getFocusedChild() : null;
        E eY = focusedChild != null ? Y(focusedChild) : null;
        if (eY == null) {
            k1();
            return;
        }
        this.f17833o0.f17869n = this.f17840s.h() ? eY.k() : -1L;
        this.f17833o0.f17868m = this.f17797K ? -1 : eY.v() ? eY.f17884d : eY.j();
        this.f17833o0.f17870o = n0(eY.f17881a);
    }

    private int n0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String o0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void p(E e10, E e11, m.b bVar, m.b bVar2, boolean z10, boolean z11) {
        e10.G(false);
        if (z10) {
            i(e10);
        }
        if (e10 != e11) {
            if (z11) {
                i(e11);
            }
            e10.f17888h = e11;
            i(e10);
            this.f17820i.O(e10);
            e11.G(false);
            e11.f17889i = e10;
        }
        if (this.f17806T.b(e10, e11, bVar, bVar2)) {
            T0();
        }
    }

    private float q0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f17816g * 0.015f));
        float f10 = f17770K0;
        return (float) (((double) (this.f17816g * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private void r0(long j10, E e10, E e11) {
        int iG = this.f17826l.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eL0 = l0(this.f17826l.f(i10));
            if (eL0 != e10 && i0(eL0) == j10) {
                h hVar = this.f17840s;
                if (hVar == null || !hVar.h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + eL0 + " \n View Holder 2:" + e10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + eL0 + " \n View Holder 2:" + e10 + V());
            }
        }
        Objects.toString(e11);
        Objects.toString(e10);
        V();
    }

    private void r1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f17840s;
        if (hVar2 != null) {
            hVar2.x(this.f17818h);
            this.f17840s.q(this);
        }
        if (!z10 || z11) {
            d1();
        }
        this.f17824k.w();
        h hVar3 = this.f17840s;
        this.f17840s = hVar;
        if (hVar != null) {
            hVar.v(this.f17818h);
            hVar.m(this);
        }
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.I0(hVar3, this.f17840s);
        }
        this.f17820i.y(hVar3, this.f17840s, z10);
        this.f17833o0.f17862g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f17767H0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f17768I0 = z10;
    }

    private void t() {
        l1();
        setScrollState(0);
    }

    private boolean t0() {
        int iG = this.f17826l.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eL0 = l0(this.f17826l.f(i10));
            if (eL0 != null && !eL0.J() && eL0.y()) {
                return true;
            }
        }
        return false;
    }

    private boolean t1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return q0(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    static void u(E e10) {
        WeakReference weakReference = e10.f17882b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e10.f17881a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e10.f17882b = null;
        }
    }

    private void v0() {
        if (AbstractC1658a0.x(this) == 0) {
            AbstractC1658a0.u0(this, 8);
        }
    }

    private void w0() {
        this.f17826l = new b(new C1782e());
    }

    private int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    void A() {
        if (!this.f17782B || this.f17797K) {
            D0.l.a("RV FullInvalidate");
            H();
            D0.l.b();
            return;
        }
        if (this.f17824k.p()) {
            if (!this.f17824k.o(4) || this.f17824k.o(11)) {
                if (this.f17824k.p()) {
                    D0.l.a("RV FullInvalidate");
                    H();
                    D0.l.b();
                    return;
                }
                return;
            }
            D0.l.a("RV PartialInvalidate");
            A1();
            N0();
            this.f17824k.u();
            if (!this.f17786D) {
                if (t0()) {
                    H();
                } else {
                    this.f17824k.i();
                }
            }
            D1(true);
            O0();
            D0.l.b();
        }
    }

    public boolean A0() {
        return this.f17799M > 0;
    }

    void A1() {
        int i10 = this.f17784C + 1;
        this.f17784C = i10;
        if (i10 != 1 || this.f17788E) {
            return;
        }
        this.f17786D = false;
    }

    public boolean B1(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    void C(int i10, int i11) {
        setMeasuredDimension(p.s(i10, getPaddingLeft() + getPaddingRight(), AbstractC1658a0.A(this)), p.s(i11, getPaddingTop() + getPaddingBottom(), AbstractC1658a0.z(this)));
    }

    void C0(int i10) {
        if (this.f17842t == null) {
            return;
        }
        setScrollState(2);
        this.f17842t.B1(i10);
        awakenScrollBars();
    }

    void D0() {
        int iJ = this.f17826l.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.f17826l.i(i10).getLayoutParams()).f17951c = true;
        }
        this.f17820i.s();
    }

    void D1(boolean z10) {
        if (this.f17784C < 1) {
            if (f17767H0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f17784C = 1;
        }
        if (!z10 && !this.f17788E) {
            this.f17786D = false;
        }
        if (this.f17784C == 1) {
            if (z10 && this.f17786D && !this.f17788E && this.f17842t != null && this.f17840s != null) {
                H();
            }
            if (!this.f17788E) {
                this.f17786D = false;
            }
        }
        this.f17784C--;
    }

    void E(View view) {
        E eL0 = l0(view);
        L0(view);
        h hVar = this.f17840s;
        if (hVar != null && eL0 != null) {
            hVar.s(eL0);
        }
        List list = this.f17796J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17796J.get(size)).b(view);
            }
        }
    }

    void E0() {
        int iJ = this.f17826l.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eL0 = l0(this.f17826l.i(i10));
            if (eL0 != null && !eL0.J()) {
                eL0.b(6);
            }
        }
        D0();
        this.f17820i.t();
    }

    public void E1(int i10) {
        getScrollingChildHelper().s(i10);
    }

    void F(View view) {
        E eL0 = l0(view);
        M0(view);
        h hVar = this.f17840s;
        if (hVar != null && eL0 != null) {
            hVar.t(eL0);
        }
        List list = this.f17796J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17796J.get(size)).a(view);
            }
        }
    }

    public void F1() {
        setScrollState(0);
        G1();
    }

    public void G0(int i10) {
        int iG = this.f17826l.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f17826l.f(i11).offsetLeftAndRight(i10);
        }
    }

    void H() {
        if (this.f17840s == null || this.f17842t == null) {
            return;
        }
        this.f17833o0.f17865j = false;
        boolean z10 = this.f17787D0 && !(this.f17789E0 == getWidth() && this.f17791F0 == getHeight());
        this.f17789E0 = 0;
        this.f17791F0 = 0;
        this.f17787D0 = false;
        if (this.f17833o0.f17860e == 1) {
            I();
            this.f17842t.D1(this);
            J();
        } else if (this.f17824k.q() || z10 || this.f17842t.s0() != getWidth() || this.f17842t.b0() != getHeight()) {
            this.f17842t.D1(this);
            J();
        } else {
            this.f17842t.D1(this);
        }
        K();
    }

    public void H0(int i10) {
        int iG = this.f17826l.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f17826l.f(i11).offsetTopAndBottom(i10);
        }
    }

    void H1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f17826l.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f17826l.i(i14);
            E eL0 = l0(viewI);
            if (eL0 != null && !eL0.J() && (i12 = eL0.f17883c) >= i10 && i12 < i13) {
                eL0.b(2);
                eL0.a(obj);
                ((q) viewI.getLayoutParams()).f17951c = true;
            }
        }
        this.f17820i.R(i10, i11);
    }

    void I0(int i10, int i11) {
        int iJ = this.f17826l.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            E eL0 = l0(this.f17826l.i(i12));
            if (eL0 != null && !eL0.J() && eL0.f17883c >= i10) {
                if (f17768I0) {
                    eL0.toString();
                }
                eL0.A(i11, false);
                this.f17833o0.f17862g = true;
            }
        }
        this.f17820i.v(i10, i11);
        requestLayout();
    }

    void J0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f17826l.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            E eL0 = l0(this.f17826l.i(i16));
            if (eL0 != null && (i15 = eL0.f17883c) >= i13 && i15 <= i12) {
                if (f17768I0) {
                    eL0.toString();
                }
                if (eL0.f17883c == i10) {
                    eL0.A(i11 - i10, false);
                } else {
                    eL0.A(i14, false);
                }
                this.f17833o0.f17862g = true;
            }
        }
        this.f17820i.w(i10, i11);
        requestLayout();
    }

    void K0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f17826l.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            E eL0 = l0(this.f17826l.i(i13));
            if (eL0 != null && !eL0.J()) {
                int i14 = eL0.f17883c;
                if (i14 >= i12) {
                    if (f17768I0) {
                        eL0.toString();
                    }
                    eL0.A(-i11, z10);
                    this.f17833o0.f17862g = true;
                } else if (i14 >= i10) {
                    if (f17768I0) {
                        eL0.toString();
                    }
                    eL0.i(i10 - 1, -i11, z10);
                    this.f17833o0.f17862g = true;
                }
            }
        }
        this.f17820i.x(i10, i11, z10);
        requestLayout();
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void N(int i10) {
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.i1(i10);
        }
        R0(i10);
        u uVar = this.f17835p0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List list = this.f17837q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17837q0.get(size)).a(this, i10);
            }
        }
    }

    void N0() {
        this.f17799M++;
    }

    void O(int i10, int i11) {
        this.f17800N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        S0(i10, i11);
        u uVar = this.f17835p0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List list = this.f17837q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17837q0.get(size)).b(this, i10, i11);
            }
        }
        this.f17800N--;
    }

    void O0() {
        P0(true);
    }

    void P() {
        int i10;
        for (int size = this.f17783B0.size() - 1; size >= 0; size--) {
            E e10 = (E) this.f17783B0.get(size);
            if (e10.f17881a.getParent() == this && !e10.J() && (i10 = e10.f17897q) != -1) {
                AbstractC1658a0.s0(e10.f17881a, i10);
                e10.f17897q = -1;
            }
        }
        this.f17783B0.clear();
    }

    void P0(boolean z10) {
        int i10 = this.f17799M - 1;
        this.f17799M = i10;
        if (i10 < 1) {
            if (f17767H0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.f17799M = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    void R() {
        if (this.f17805S != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f17801O.a(this, 3);
        this.f17805S = edgeEffectA;
        if (this.f17830n) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void S() {
        if (this.f17802P != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f17801O.a(this, 0);
        this.f17802P = edgeEffectA;
        if (this.f17830n) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T() {
        if (this.f17804R != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f17801O.a(this, 2);
        this.f17804R = edgeEffectA;
        if (this.f17830n) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0() {
        if (this.f17845u0 || !this.f17852y) {
            return;
        }
        AbstractC1658a0.c0(this, this.f17785C0);
        this.f17845u0 = true;
    }

    void U() {
        if (this.f17803Q != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f17801O.a(this, 1);
        this.f17803Q = edgeEffectA;
        if (this.f17830n) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f17840s + ", layout:" + this.f17842t + ", context:" + getContext();
    }

    final void W(A a10) {
        if (getScrollState() != 2) {
            a10.f17871p = 0;
            a10.f17872q = 0;
        } else {
            OverScroller overScroller = this.f17827l0.f17875i;
            a10.f17871p = overScroller.getFinalX() - overScroller.getCurrX();
            a10.f17872q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void W0(boolean z10) {
        this.f17798L = z10 | this.f17798L;
        this.f17797K = true;
        E0();
    }

    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public E Y(View view) {
        View viewX = X(view);
        if (viewX == null) {
            return null;
        }
        return k0(viewX);
    }

    void Y0(E e10, m.b bVar) {
        e10.F(0, 8192);
        if (this.f17833o0.f17864i && e10.y() && !e10.v() && !e10.J()) {
            this.f17828m.c(i0(e10), e10);
        }
        this.f17828m.e(e10, bVar);
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f17802P.isFinished()) {
                this.f17802P.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f17804R.isFinished()) {
                this.f17804R.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f17803Q.isFinished()) {
                this.f17803Q.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f17805S.isFinished()) {
                this.f17805S.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        AbstractC1658a0.b0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f17842t;
        if (pVar == null || !pVar.J0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f17842t.r((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.p()) {
            return this.f17842t.v(this.f17833o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.p()) {
            return this.f17842t.w(this.f17833o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.p()) {
            return this.f17842t.x(this.f17833o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.q()) {
            return this.f17842t.y(this.f17833o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.q()) {
            return this.f17842t.z(this.f17833o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.f17842t;
        if (pVar != null && pVar.q()) {
            return this.f17842t.A(this.f17833o0);
        }
        return 0;
    }

    public E d0(int i10) {
        E e10 = null;
        if (this.f17797K) {
            return null;
        }
        int iJ = this.f17826l.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            E eL0 = l0(this.f17826l.i(i11));
            if (eL0 != null && !eL0.v() && h0(eL0) == i10) {
                if (!this.f17826l.n(eL0.f17881a)) {
                    return eL0;
                }
                e10 = eL0;
            }
        }
        return e10;
    }

    void d1() {
        m mVar = this.f17806T;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.o1(this.f17820i);
            this.f17842t.p1(this.f17820i);
        }
        this.f17820i.c();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f17846v.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f17846v.get(i10)).i(canvas, this, this.f17833o0);
        }
        EdgeEffect edgeEffect = this.f17802P;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f17830n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f17802P;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f17803Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f17830n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f17803Q;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f17804R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f17830n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f17804R;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f17805S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f17830n) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f17805S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f17806T == null || this.f17846v.size() <= 0 || !this.f17806T.p()) ? z10 : true) {
            AbstractC1658a0.b0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public E e0(long j10) {
        h hVar = this.f17840s;
        E e10 = null;
        if (hVar != null && hVar.h()) {
            int iJ = this.f17826l.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                E eL0 = l0(this.f17826l.i(i10));
                if (eL0 != null && !eL0.v() && eL0.k() == j10) {
                    if (!this.f17826l.n(eL0.f17881a)) {
                        return eL0;
                    }
                    e10 = eL0;
                }
            }
        }
        return e10;
    }

    boolean e1(View view) {
        A1();
        boolean zR = this.f17826l.r(view);
        if (zR) {
            E eL0 = l0(view);
            this.f17820i.O(eL0);
            this.f17820i.H(eL0);
            if (f17768I0) {
                Objects.toString(view);
                toString();
            }
        }
        D1(!zR);
        return zR;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    E f0(int i10, boolean z10) {
        int iJ = this.f17826l.j();
        E e10 = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            E eL0 = l0(this.f17826l.i(i11));
            if (eL0 != null && !eL0.v()) {
                if (z10) {
                    if (eL0.f17883c != i10) {
                        continue;
                    } else {
                        if (!this.f17826l.n(eL0.f17881a)) {
                            return eL0;
                        }
                        e10 = eL0;
                    }
                } else if (eL0.m() != i10) {
                    continue;
                }
            }
        }
        return e10;
    }

    public void f1(o oVar) {
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f17846v.remove(oVar);
        if (this.f17846v.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        D0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewN0;
        boolean z10;
        View viewU0 = this.f17842t.U0(view, i10);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z11 = (this.f17840s == null || this.f17842t == null || A0() || this.f17788E) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f17842t.q()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f17775P0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f17842t.p()) {
                int i12 = (this.f17842t.d0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f17775P0) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                A();
                if (X(view) == null) {
                    return null;
                }
                A1();
                this.f17842t.N0(view, i10, this.f17820i, this.f17833o0);
                D1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                A();
                if (X(view) == null) {
                    return null;
                }
                A1();
                viewN0 = this.f17842t.N0(view, i10, this.f17820i, this.f17833o0);
                D1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return B0(view, viewN0, i10) ? viewN0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        j1(viewN0, null);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean g0(int i10, int i11) {
        int iMax;
        int i12;
        p pVar = this.f17842t;
        if (pVar == null || this.f17788E) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.f17842t.q();
        if (iP == 0 || Math.abs(i10) < this.f17817g0) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < this.f17817g0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f17802P;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f17804R;
                if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                    if (t1(this.f17804R, i10, getWidth())) {
                        this.f17804R.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i13 = -i10;
                if (t1(this.f17802P, i13, getWidth())) {
                    this.f17802P.onAbsorb(i13);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f17803Q;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f17805S;
                if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != 0.0f) {
                    if (t1(this.f17805S, i11, getHeight())) {
                        this.f17805S.onAbsorb(i11);
                        i11 = 0;
                    }
                    i12 = 0;
                }
                i12 = i11;
                i11 = 0;
            } else {
                int i14 = -i11;
                if (t1(this.f17803Q, i14, getHeight())) {
                    this.f17803Q.onAbsorb(i14);
                    i11 = 0;
                }
                i12 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i15 = this.f17819h0;
            iMax = Math.max(-i15, Math.min(iMax, i15));
            int i16 = this.f17819h0;
            i11 = Math.max(-i16, Math.min(i11, i16));
            this.f17827l0.b(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iP != 0 || zQ;
            dispatchNestedFling(f10, f11, z10);
            s sVar = this.f17815f0;
            if (sVar != null && sVar.a(i10, i12)) {
                return true;
            }
            if (z10) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                B1(iP, 1);
                int i17 = this.f17819h0;
                int iMax2 = Math.max(-i17, Math.min(i10, i17));
                int i18 = this.f17819h0;
                this.f17827l0.b(iMax2, Math.max(-i18, Math.min(i12, i18)));
                return true;
            }
        }
        return false;
    }

    public void g1(t tVar) {
        this.f17848w.remove(tVar);
        if (this.f17850x == tVar) {
            this.f17850x = null;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f17842t;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f17842t;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f17840s;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f17842t;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f17830n;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f17847v0;
    }

    public l getEdgeEffectFactory() {
        return this.f17801O;
    }

    public m getItemAnimator() {
        return this.f17806T;
    }

    public int getItemDecorationCount() {
        return this.f17846v.size();
    }

    public p getLayoutManager() {
        return this.f17842t;
    }

    public int getMaxFlingVelocity() {
        return this.f17819h0;
    }

    public int getMinFlingVelocity() {
        return this.f17817g0;
    }

    long getNanoTime() {
        if (f17774O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f17815f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f17825k0;
    }

    public v getRecycledViewPool() {
        return this.f17820i.i();
    }

    public int getScrollState() {
        return this.f17807U;
    }

    int h0(E e10) {
        if (e10.p(524) || !e10.s()) {
            return -1;
        }
        return this.f17824k.e(e10.f17883c);
    }

    public void h1(u uVar) {
        List list = this.f17837q0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    long i0(E e10) {
        return this.f17840s.h() ? e10.k() : e10.f17883c;
    }

    void i1() {
        E e10;
        int iG = this.f17826l.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f17826l.f(i10);
            E eK0 = k0(viewF);
            if (eK0 != null && (e10 = eK0.f17889i) != null) {
                View view = e10.f17881a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f17852y;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f17788E;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    public int j0(View view) {
        E eL0 = l0(view);
        if (eL0 != null) {
            return eL0.m();
        }
        return -1;
    }

    public void k(o oVar, int i10) {
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f17846v.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f17846v.add(oVar);
        } else {
            this.f17846v.add(i10, oVar);
        }
        D0();
        requestLayout();
    }

    public E k0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void l(r rVar) {
        if (this.f17796J == null) {
            this.f17796J = new ArrayList();
        }
        this.f17796J.add(rVar);
    }

    public void m(t tVar) {
        this.f17848w.add(tVar);
    }

    public void n(u uVar) {
        if (this.f17837q0 == null) {
            this.f17837q0 = new ArrayList();
        }
        this.f17837q0.add(uVar);
    }

    void n1() {
        int iJ = this.f17826l.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eL0 = l0(this.f17826l.i(i10));
            if (f17767H0 && eL0.f17883c == -1 && !eL0.v()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!eL0.J()) {
                eL0.E();
            }
        }
    }

    void o(E e10, m.b bVar, m.b bVar2) {
        e10.G(false);
        if (this.f17806T.a(e10, bVar, bVar2)) {
            T0();
        }
    }

    boolean o1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f17840s != null) {
            int[] iArr = this.f17781A0;
            iArr[0] = 0;
            iArr[1] = 0;
            p1(i10, i11, iArr);
            int[] iArr2 = this.f17781A0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f17846v.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f17781A0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i13, i14, i15, i16, this.f17853y0, i12, iArr3);
        int[] iArr4 = this.f17781A0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f17812c0;
        int[] iArr5 = this.f17853y0;
        int i24 = iArr5[0];
        this.f17812c0 = i23 - i24;
        int i25 = this.f17813d0;
        int i26 = iArr5[1];
        this.f17813d0 = i25 - i26;
        int[] iArr6 = this.f17855z0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.C.a(motionEvent, 8194)) {
                X0(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            w(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            O(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f17799M = 0;
        this.f17852y = true;
        this.f17782B = this.f17782B && !isLayoutRequested();
        this.f17820i.z();
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.E(this);
        }
        this.f17845u0 = false;
        if (f17774O0) {
            ThreadLocal threadLocal = e.f18144k;
            e eVar = (e) threadLocal.get();
            this.f17829m0 = eVar;
            if (eVar == null) {
                this.f17829m0 = new e();
                Display displayS = AbstractC1658a0.s(this);
                if (isInEditMode() || displayS == null) {
                    refreshRate = 60.0f;
                    e eVar2 = this.f17829m0;
                    eVar2.f18148i = (long) (1.0E9f / refreshRate);
                    threadLocal.set(eVar2);
                } else {
                    refreshRate = displayS.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    e eVar22 = this.f17829m0;
                    eVar22.f18148i = (long) (1.0E9f / refreshRate);
                    threadLocal.set(eVar22);
                }
            }
            this.f17829m0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f17806T;
        if (mVar != null) {
            mVar.k();
        }
        F1();
        this.f17852y = false;
        p pVar = this.f17842t;
        if (pVar != null) {
            pVar.F(this, this.f17820i);
        }
        this.f17783B0.clear();
        removeCallbacks(this.f17785C0);
        this.f17828m.j();
        this.f17820i.A();
        L0.a.b(this);
        if (!f17774O0 || (eVar = this.f17829m0) == null) {
            return;
        }
        eVar.j(this);
        this.f17829m0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f17846v.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f17846v.get(i10)).g(canvas, this, this.f17833o0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f17842t != null && !this.f17788E && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f17842t.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f17842t.p() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f10 != 0.0f || axisValue != 0.0f) {
                    F0((int) (axisValue * this.f17821i0), (int) (f10 * this.f17823j0), motionEvent, 1);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f17842t.q()) {
                    f10 = -axisValue2;
                    if (f10 != 0.0f) {
                        F0((int) (axisValue * this.f17821i0), (int) (f10 * this.f17823j0), motionEvent, 1);
                    }
                } else {
                    if (this.f17842t.p()) {
                        axisValue = axisValue2;
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f10 != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f17788E) {
            return false;
        }
        this.f17850x = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f17842t;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f17842t.q();
        if (this.f17809W == null) {
            this.f17809W = VelocityTracker.obtain();
        }
        this.f17809W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f17790F) {
                this.f17790F = false;
            }
            this.f17808V = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f17812c0 = x10;
            this.f17810a0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f17813d0 = y10;
            this.f17811b0 = y10;
            if (C1(motionEvent) || this.f17807U == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                E1(1);
            }
            int[] iArr = this.f17855z0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zP;
            if (zQ) {
                i10 = (zP ? 1 : 0) | 2;
            }
            B1(i10, 0);
        } else if (actionMasked == 1) {
            this.f17809W.clear();
            E1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f17808V);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f17807U != 1) {
                int i11 = x11 - this.f17810a0;
                int i12 = y11 - this.f17811b0;
                if (!zP || Math.abs(i11) <= this.f17814e0) {
                    z10 = false;
                } else {
                    this.f17812c0 = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i12) > this.f17814e0) {
                    this.f17813d0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f17808V = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f17812c0 = x12;
            this.f17810a0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f17813d0 = y12;
            this.f17811b0 = y12;
        } else if (actionMasked == 6) {
            Q0(motionEvent);
        }
        return this.f17807U == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        D0.l.a("RV OnLayout");
        H();
        D0.l.b();
        this.f17782B = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.f17842t;
        if (pVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f17842t.d1(this.f17820i, this.f17833o0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f17787D0 = z10;
            if (z10 || this.f17840s == null) {
                return;
            }
            if (this.f17833o0.f17860e == 1) {
                I();
            }
            this.f17842t.E1(i10, i11);
            this.f17833o0.f17865j = true;
            J();
            this.f17842t.H1(i10, i11);
            if (this.f17842t.K1()) {
                this.f17842t.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f17833o0.f17865j = true;
                J();
                this.f17842t.H1(i10, i11);
            }
            this.f17789E0 = getMeasuredWidth();
            this.f17791F0 = getMeasuredHeight();
            return;
        }
        if (this.f17854z) {
            this.f17842t.d1(this.f17820i, this.f17833o0, i10, i11);
            return;
        }
        if (this.f17794H) {
            A1();
            N0();
            V0();
            O0();
            A a10 = this.f17833o0;
            if (a10.f17867l) {
                a10.f17863h = true;
            } else {
                this.f17824k.j();
                this.f17833o0.f17863h = false;
            }
            this.f17794H = false;
            D1(false);
        } else if (this.f17833o0.f17867l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f17840s;
        if (hVar != null) {
            this.f17833o0.f17861f = hVar.d();
        } else {
            this.f17833o0.f17861f = 0;
        }
        A1();
        this.f17842t.d1(this.f17820i, this.f17833o0, i10, i11);
        D1(false);
        this.f17833o0.f17863h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (A0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f17822j = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f17822j;
        if (savedState2 != null) {
            savedState.b(savedState2);
            return savedState;
        }
        p pVar = this.f17842t;
        if (pVar != null) {
            savedState.f17900i = pVar.h1();
            return savedState;
        }
        savedState.f17900i = null;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[PHI: r1
      0x00c2: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f17788E || this.f17790F) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f17842t;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f17842t.q();
        if (this.f17809W == null) {
            this.f17809W = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f17855z0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f17855z0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f17808V = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f17812c0 = x10;
            this.f17810a0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f17813d0 = y10;
            this.f17811b0 = y10;
            int i10 = zP;
            if (zQ) {
                i10 = (zP ? 1 : 0) | 2;
            }
            B1(i10, 0);
        } else {
            if (actionMasked == 1) {
                this.f17809W.addMovement(motionEventObtain);
                this.f17809W.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS, this.f17819h0);
                float f10 = zP ? -this.f17809W.getXVelocity(this.f17808V) : 0.0f;
                float f11 = zQ ? -this.f17809W.getYVelocity(this.f17808V) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !g0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                l1();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f17808V);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f17812c0 - x11;
                int iMax2 = this.f17813d0 - y11;
                if (this.f17807U != 1) {
                    if (zP) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f17814e0) : Math.min(0, iMax + this.f17814e0);
                        if (iMax != 0) {
                            z10 = true;
                        }
                        if (zQ) {
                        }
                        if (z10) {
                        }
                    } else {
                        z10 = false;
                        if (zQ) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f17814e0) : Math.min(0, iMax2 + this.f17814e0);
                            if (iMax2 != 0) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                if (this.f17807U == 1) {
                    int[] iArr3 = this.f17781A0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iB1 = iMax - b1(iMax, motionEvent.getY());
                    int iC1 = iMax2 - c1(iMax2, motionEvent.getX());
                    if (L(zP ? iB1 : 0, zQ ? iC1 : 0, this.f17781A0, this.f17853y0, 0)) {
                        int[] iArr4 = this.f17781A0;
                        iB1 -= iArr4[0];
                        iC1 -= iArr4[1];
                        int[] iArr5 = this.f17855z0;
                        int i11 = iArr5[0];
                        int[] iArr6 = this.f17853y0;
                        iArr5[0] = i11 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f17853y0;
                    this.f17812c0 = x11 - iArr7[0];
                    this.f17813d0 = y11 - iArr7[1];
                    if (o1(zP ? iB1 : 0, zQ ? iC1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    e eVar = this.f17829m0;
                    if (eVar != null && (iB1 != 0 || iC1 != 0)) {
                        eVar.f(this, iB1, iC1);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.f17808V = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f17812c0 = x12;
                this.f17810a0 = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f17813d0 = y12;
                this.f17811b0 = y12;
            } else if (actionMasked == 6) {
                Q0(motionEvent);
            }
        }
        this.f17809W.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    Rect p0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f17951c) {
            return qVar.f17950b;
        }
        if (this.f17833o0.e() && (qVar.b() || qVar.d())) {
            return qVar.f17950b;
        }
        Rect rect = qVar.f17950b;
        rect.set(0, 0, 0, 0);
        int size = this.f17846v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17834p.set(0, 0, 0, 0);
            ((o) this.f17846v.get(i10)).e(this.f17834p, view, this, this.f17833o0);
            int i11 = rect.left;
            Rect rect2 = this.f17834p;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f17951c = false;
        return rect;
    }

    void p1(int i10, int i11, int[] iArr) {
        A1();
        N0();
        D0.l.a("RV Scroll");
        W(this.f17833o0);
        int iA1 = i10 != 0 ? this.f17842t.A1(i10, this.f17820i, this.f17833o0) : 0;
        int iC1 = i11 != 0 ? this.f17842t.C1(i11, this.f17820i, this.f17833o0) : 0;
        D0.l.b();
        i1();
        O0();
        D1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    void q(E e10, m.b bVar, m.b bVar2) {
        i(e10);
        e10.G(false);
        if (this.f17806T.c(e10, bVar, bVar2)) {
            T0();
        }
    }

    public void q1(int i10) {
        if (this.f17788E) {
            return;
        }
        F1();
        p pVar = this.f17842t;
        if (pVar == null) {
            return;
        }
        pVar.B1(i10);
        awakenScrollBars();
    }

    void r(String str) {
        if (A0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.f17800N > 0) {
            new IllegalStateException(PointerEventHelper.POINTER_TYPE_UNKNOWN + V());
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        E eL0 = l0(view);
        if (eL0 != null) {
            if (eL0.x()) {
                eL0.f();
            } else if (!eL0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + eL0 + V());
            }
        } else if (f17767H0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f17842t.f1(this, this.f17833o0, view, view2) && view2 != null) {
            j1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f17842t.v1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f17848w.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17848w.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f17784C != 0 || this.f17788E) {
            this.f17786D = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(E e10) {
        m mVar = this.f17806T;
        return mVar == null || mVar.g(e10, e10.o());
    }

    public boolean s0() {
        return !this.f17782B || this.f17797K || this.f17824k.p();
    }

    boolean s1(E e10, int i10) {
        if (!A0()) {
            AbstractC1658a0.s0(e10.f17881a, i10);
            return true;
        }
        e10.f17897q = i10;
        this.f17783B0.add(e10);
        return false;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f17842t;
        if (pVar == null || this.f17788E) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f17842t.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            o1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (u1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f17847v0 = kVar;
        AbstractC1658a0.k0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        r1(hVar, false, true);
        W0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f17830n) {
            y0();
        }
        this.f17830n = z10;
        super.setClipToPadding(z10);
        if (this.f17782B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        H0.g.g(lVar);
        this.f17801O = lVar;
        y0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f17854z = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f17806T;
        if (mVar2 != null) {
            mVar2.k();
            this.f17806T.v(null);
        }
        this.f17806T = mVar;
        if (mVar != null) {
            mVar.v(this.f17843t0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f17820i.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f17842t) {
            return;
        }
        F1();
        if (this.f17842t != null) {
            m mVar = this.f17806T;
            if (mVar != null) {
                mVar.k();
            }
            this.f17842t.o1(this.f17820i);
            this.f17842t.p1(this.f17820i);
            this.f17820i.c();
            if (this.f17852y) {
                this.f17842t.F(this, this.f17820i);
            }
            this.f17842t.I1(null);
            this.f17842t = null;
        } else {
            this.f17820i.c();
        }
        this.f17826l.o();
        this.f17842t = pVar;
        if (pVar != null) {
            if (pVar.f17926b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f17926b.V());
            }
            pVar.I1(this);
            if (this.f17852y) {
                this.f17842t.E(this);
            }
        }
        this.f17820i.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f17815f0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f17835p0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f17825k0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f17820i.J(vVar);
    }

    void setScrollState(int i10) {
        if (i10 == this.f17807U) {
            return;
        }
        if (f17768I0) {
            new Exception();
        }
        this.f17807U = i10;
        if (i10 != 2) {
            G1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0 || i10 != 1) {
            this.f17814e0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f17814e0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(C c10) {
        this.f17820i.K(c10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f17788E) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f17788E = true;
                this.f17790F = true;
                F1();
                return;
            }
            this.f17788E = false;
            if (this.f17786D && this.f17842t != null && this.f17840s != null) {
                requestLayout();
            }
            this.f17786D = false;
        }
    }

    void u0() {
        this.f17824k = new a(new f());
    }

    boolean u1(AccessibilityEvent accessibilityEvent) {
        if (!A0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC0805b.a(accessibilityEvent) : 0;
        this.f17792G |= iA != 0 ? iA : 0;
        return true;
    }

    void v() {
        int iJ = this.f17826l.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eL0 = l0(this.f17826l.i(i10));
            if (!eL0.J()) {
                eL0.c();
            }
        }
        this.f17820i.d();
    }

    public void v1(int i10, int i11) {
        w1(i10, i11, null);
    }

    void w(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f17802P;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f17802P.onRelease();
            zIsFinished = this.f17802P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f17804R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f17804R.onRelease();
            zIsFinished |= this.f17804R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17803Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f17803Q.onRelease();
            zIsFinished |= this.f17803Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17805S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f17805S.onRelease();
            zIsFinished |= this.f17805S.isFinished();
        }
        if (zIsFinished) {
            AbstractC1658a0.b0(this);
        }
    }

    public void w1(int i10, int i11, Interpolator interpolator) {
        x1(i10, i11, interpolator, androidx.customview.widget.a.INVALID_ID);
    }

    int x(int i10) {
        return y(i10, this.f17802P, this.f17804R, getWidth());
    }

    void x0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC2661b.f28099a), resources.getDimensionPixelSize(AbstractC2661b.f28101c), resources.getDimensionPixelOffset(AbstractC2661b.f28100b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void x1(int i10, int i11, Interpolator interpolator, int i12) {
        y1(i10, i11, interpolator, i12, false);
    }

    void y0() {
        this.f17805S = null;
        this.f17803Q = null;
        this.f17804R = null;
        this.f17802P = null;
    }

    void y1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f17842t;
        if (pVar == null || this.f17788E) {
            return;
        }
        if (!pVar.p()) {
            i10 = 0;
        }
        if (!this.f17842t.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            B1(i13, 1);
        }
        this.f17827l0.e(i10, i11, i12, interpolator);
    }

    int z(int i10) {
        return y(i10, this.f17803Q, this.f17805S, getHeight());
    }

    boolean z0() {
        AccessibilityManager accessibilityManager = this.f17795I;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void z1(int i10) {
        p pVar;
        if (this.f17788E || (pVar = this.f17842t) == null) {
            return;
        }
        pVar.M1(this, this.f17833o0, i10);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2660a.f28098a);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Parcelable f17900i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17900i = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f17900i = savedState.f17900i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f17900i, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17818h = new y();
        this.f17820i = new w();
        this.f17828m = new androidx.recyclerview.widget.p();
        this.f17832o = new RunnableC1778a();
        this.f17834p = new Rect();
        this.f17836q = new Rect();
        this.f17838r = new RectF();
        this.f17844u = new ArrayList();
        this.f17846v = new ArrayList();
        this.f17848w = new ArrayList();
        this.f17784C = 0;
        this.f17797K = false;
        this.f17798L = false;
        this.f17799M = 0;
        this.f17800N = 0;
        this.f17801O = f17779T0;
        this.f17806T = new c();
        this.f17807U = 0;
        this.f17808V = -1;
        this.f17821i0 = Float.MIN_VALUE;
        this.f17823j0 = Float.MIN_VALUE;
        this.f17825k0 = true;
        this.f17827l0 = new D();
        this.f17831n0 = f17774O0 ? new e.b() : null;
        this.f17833o0 = new A();
        this.f17839r0 = false;
        this.f17841s0 = false;
        this.f17843t0 = new n();
        this.f17845u0 = false;
        this.f17849w0 = new int[2];
        this.f17853y0 = new int[2];
        this.f17855z0 = new int[2];
        this.f17781A0 = new int[2];
        this.f17783B0 = new ArrayList();
        this.f17785C0 = new RunnableC1779b();
        this.f17789E0 = 0;
        this.f17791F0 = 0;
        this.f17793G0 = new C1781d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17814e0 = viewConfiguration.getScaledTouchSlop();
        this.f17821i0 = AbstractC1664d0.f(viewConfiguration, context);
        this.f17823j0 = AbstractC1664d0.j(viewConfiguration, context);
        this.f17817g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17819h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17816g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f17806T.v(this.f17843t0);
        u0();
        w0();
        v0();
        if (AbstractC1658a0.w(this) == 0) {
            AbstractC1658a0.s0(this, 1);
        }
        this.f17795I = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1.c.f28102a, i10, 0);
        AbstractC1658a0.i0(this, context, g1.c.f28102a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(g1.c.f28111j);
        if (typedArrayObtainStyledAttributes.getInt(g1.c.f28105d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f17830n = typedArrayObtainStyledAttributes.getBoolean(g1.c.f28104c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(g1.c.f28106e, false);
        this.f17780A = z10;
        if (z10) {
            x0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g1.c.f28109h), typedArrayObtainStyledAttributes.getDrawable(g1.c.f28110i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g1.c.f28107f), typedArrayObtainStyledAttributes.getDrawable(g1.c.f28108g));
        }
        typedArrayObtainStyledAttributes.recycle();
        B(context, string, attributeSet, i10, 0);
        int[] iArr = f17769J0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC1658a0.i0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        L0.a.d(this, true);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        E f17949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f17950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f17951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f17952d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17950b = new Rect();
            this.f17951c = true;
            this.f17952d = false;
        }

        public int a() {
            return this.f17949a.m();
        }

        public boolean b() {
            return this.f17949a.y();
        }

        public boolean c() {
            return this.f17949a.v();
        }

        public boolean d() {
            return this.f17949a.t();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f17950b = new Rect();
            this.f17951c = true;
            this.f17952d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17950b = new Rect();
            this.f17951c = true;
            this.f17952d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17950b = new Rect();
            this.f17951c = true;
            this.f17952d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f17950b = new Rect();
            this.f17951c = true;
            this.f17952d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f17842t;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f17907a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17908b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f17909c = a.ALLOW;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(E e10, int i10) {
            boolean z10 = e10.f17899s == null;
            if (z10) {
                e10.f17883c = i10;
                if (h()) {
                    e10.f17885e = e(i10);
                }
                e10.F(1, 519);
                D0.l.a("RV OnBindView");
            }
            e10.f17899s = this;
            if (RecyclerView.f17767H0) {
                if (e10.f17881a.getParent() == null && AbstractC1658a0.P(e10.f17881a) != e10.x()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + e10.x() + ", attached to window: " + AbstractC1658a0.P(e10.f17881a) + ", holder: " + e10);
                }
                if (e10.f17881a.getParent() == null && AbstractC1658a0.P(e10.f17881a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + e10);
                }
            }
            o(e10, i10, e10.o());
            if (z10) {
                e10.d();
                ViewGroup.LayoutParams layoutParams = e10.f17881a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f17951c = true;
                }
                D0.l.b();
            }
        }

        boolean b() {
            int i10 = g.f17906a[this.f17909c.ordinal()];
            return i10 != 1 && (i10 != 2 || d() > 0);
        }

        public final E c(ViewGroup viewGroup, int i10) {
            try {
                D0.l.a("RV CreateView");
                E eP = p(viewGroup, i10);
                if (eP.f17881a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                eP.f17886f = i10;
                return eP;
            } finally {
                D0.l.b();
            }
        }

        public abstract int d();

        public long e(int i10) {
            return -1L;
        }

        public int f(int i10) {
            return 0;
        }

        public final boolean g() {
            return this.f17907a.a();
        }

        public final boolean h() {
            return this.f17908b;
        }

        public final void i() {
            this.f17907a.b();
        }

        public final void j(int i10) {
            this.f17907a.c(i10, 1);
        }

        public final void k(int i10, int i11) {
            this.f17907a.d(i10, i11);
        }

        public final void l(int i10) {
            this.f17907a.d(i10, 1);
        }

        public abstract void n(E e10, int i10);

        public void o(E e10, int i10, List list) {
            n(e10, i10);
        }

        public abstract E p(ViewGroup viewGroup, int i10);

        public boolean r(E e10) {
            return false;
        }

        public void v(j jVar) {
            this.f17907a.registerObserver(jVar);
        }

        public void w(boolean z10) {
            if (g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f17908b = z10;
        }

        public void x(j jVar) {
            this.f17907a.unregisterObserver(jVar);
        }

        public void m(RecyclerView recyclerView) {
        }

        public void q(RecyclerView recyclerView) {
        }

        public void s(E e10) {
        }

        public void t(E e10) {
        }

        public void u(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f17914a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f17915b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17916c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f17917d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f17918e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f17919f = 250;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        interface a {
            void a(E e10);
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f17921b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f17922c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f17923d;

            public b a(E e10) {
                return b(e10, 0);
            }

            public b b(E e10, int i10) {
                View view = e10.f17881a;
                this.f17920a = view.getLeft();
                this.f17921b = view.getTop();
                this.f17922c = view.getRight();
                this.f17923d = view.getBottom();
                return this;
            }
        }

        static int e(E e10) {
            int i10 = e10.f17890j;
            int i11 = i10 & 14;
            if (e10.t()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iN = e10.n();
                int iJ = e10.j();
                if (iN != -1 && iJ != -1 && iN != iJ) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(E e10, b bVar, b bVar2);

        public abstract boolean b(E e10, E e11, b bVar, b bVar2);

        public abstract boolean c(E e10, b bVar, b bVar2);

        public abstract boolean d(E e10, b bVar, b bVar2);

        public abstract boolean f(E e10);

        public boolean g(E e10, List list) {
            return f(e10);
        }

        public final void h(E e10) {
            r(e10);
            a aVar = this.f17914a;
            if (aVar != null) {
                aVar.a(e10);
            }
        }

        public final void i() {
            if (this.f17915b.size() <= 0) {
                this.f17915b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f17915b.get(0));
                throw null;
            }
        }

        public abstract void j(E e10);

        public abstract void k();

        public long l() {
            return this.f17916c;
        }

        public long m() {
            return this.f17919f;
        }

        public long n() {
            return this.f17918e;
        }

        public long o() {
            return this.f17917d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public b s(A a10, E e10) {
            return q().a(e10);
        }

        public b t(A a10, E e10, int i10, List list) {
            return q().a(e10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f17914a = aVar;
        }

        public void r(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f17925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f17926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o.b f17927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o.b f17928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f17929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f17930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        z f17931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f17932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f17933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f17934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f17935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f17936l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17937m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f17938n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f17939o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f17940p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f17941q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f17942r;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.i0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.s0() - p.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i10) {
                return p.this.N(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.b0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i10) {
                return p.this.N(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public interface c {
            void a(int i10, int i11);
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f17946b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f17947c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f17948d;
        }

        public p() {
            a aVar = new a();
            this.f17927c = aVar;
            b bVar = new b();
            this.f17928d = bVar;
            this.f17929e = new androidx.recyclerview.widget.o(aVar);
            this.f17930f = new androidx.recyclerview.widget.o(bVar);
            this.f17932h = false;
            this.f17933i = false;
            this.f17934j = false;
            this.f17935k = true;
            this.f17936l = true;
        }

        private static boolean A0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f17925a.d(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int P(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 < 0) {
                    if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                        i11 = 0;
                        i13 = 0;
                    } else {
                        i13 = iMax;
                    }
                }
                i11 = 1073741824;
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1) {
                if (i13 == -2) {
                    if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                        i13 = iMax;
                        i11 = Integer.MIN_VALUE;
                    } else {
                        i13 = iMax;
                        i11 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i10, boolean z10) {
            E eL0 = RecyclerView.l0(view);
            if (z10 || eL0.v()) {
                this.f17926b.f17828m.b(eL0);
            } else {
                this.f17926b.f17828m.p(eL0);
            }
            q qVar = (q) view.getLayoutParams();
            if (eL0.L() || eL0.w()) {
                if (eL0.w()) {
                    eL0.K();
                } else {
                    eL0.e();
                }
                this.f17925a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f17926b) {
                int iM = this.f17925a.m(view);
                if (i10 == -1) {
                    i10 = this.f17925a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f17926b.indexOfChild(view) + this.f17926b.V());
                }
                if (iM != i10) {
                    this.f17926b.f17842t.F0(iM, i10);
                }
            } else {
                this.f17925a.a(view, i10, false);
                qVar.f17951c = true;
                z zVar = this.f17931g;
                if (zVar != null && zVar.h()) {
                    this.f17931g.k(view);
                }
            }
            if (qVar.f17952d) {
                if (RecyclerView.f17768I0) {
                    Objects.toString(qVar.f17949a);
                }
                eL0.f17881a.invalidate();
                qVar.f17952d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1.c.f28102a, i10, i11);
            dVar.f17945a = typedArrayObtainStyledAttributes.getInt(g1.c.f28103b, 1);
            dVar.f17946b = typedArrayObtainStyledAttributes.getInt(g1.c.f28113l, 1);
            dVar.f17947c = typedArrayObtainStyledAttributes.getBoolean(g1.c.f28112k, false);
            dVar.f17948d = typedArrayObtainStyledAttributes.getBoolean(g1.c.f28114m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f17926b.f17834p;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        private void z1(w wVar, int i10, View view) {
            E eL0 = RecyclerView.l0(view);
            if (eL0.J()) {
                if (RecyclerView.f17768I0) {
                    eL0.toString();
                }
            } else if (eL0.t() && !eL0.v() && !this.f17926b.f17840s.h()) {
                u1(i10);
                wVar.H(eL0);
            } else {
                C(i10);
                wVar.I(view);
                this.f17926b.f17828m.k(eL0);
            }
        }

        public abstract int A(A a10);

        public abstract int A1(int i10, w wVar, A a10);

        public void B(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(wVar, iO, N(iO));
            }
        }

        public boolean B0() {
            z zVar = this.f17931g;
            return zVar != null && zVar.h();
        }

        public abstract void B1(int i10);

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f17929e.b(view, 24579) && this.f17930f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int C1(int i10, w wVar, A a10);

        public void D0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f17950b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f17933i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectP0 = this.f17926b.p0(view);
            int i12 = i10 + rectP0.left + rectP0.right;
            int i13 = i11 + rectP0.top + rectP0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i10, int i11) {
            this.f17941q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f17939o = mode;
            if (mode == 0 && !RecyclerView.f17772M0) {
                this.f17941q = 0;
            }
            this.f17942r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f17940p = mode2;
            if (mode2 != 0 || RecyclerView.f17772M0) {
                return;
            }
            this.f17942r = 0;
        }

        void F(RecyclerView recyclerView, w wVar) {
            this.f17933i = false;
            M0(recyclerView, wVar);
        }

        public void F0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f17926b.toString());
            }
        }

        public void F1(int i10, int i11) {
            this.f17926b.setMeasuredDimension(i10, i11);
        }

        public View G(View view) {
            View viewX;
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView == null || (viewX = recyclerView.X(view)) == null || this.f17925a.n(viewX)) {
                return null;
            }
            return viewX;
        }

        public void G0(int i10) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                recyclerView.G0(i10);
            }
        }

        public void G1(Rect rect, int i10, int i11) {
            F1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                E eL0 = RecyclerView.l0(viewN);
                if (eL0 != null && eL0.m() == i10 && !eL0.J() && (this.f17926b.f17833o0.e() || !eL0.v())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                recyclerView.H0(i10);
            }
        }

        void H1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f17926b.C(i10, i11);
                return;
            }
            int i12 = androidx.customview.widget.a.INVALID_ID;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f17926b.f17834p;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f17926b.f17834p.set(i15, i13, i12, i14);
            G1(this.f17926b.f17834p, i10, i11);
        }

        public abstract q I();

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f17926b = null;
                this.f17925a = null;
                this.f17941q = 0;
                this.f17942r = 0;
            } else {
                this.f17926b = recyclerView;
                this.f17925a = recyclerView.f17826l;
                this.f17941q = recyclerView.getWidth();
                this.f17942r = recyclerView.getHeight();
            }
            this.f17939o = 1073741824;
            this.f17940p = 1073741824;
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean J1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f17935k && A0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        boolean L1(View view, int i10, int i11, q qVar) {
            return (this.f17935k && A0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f17950b.bottom;
        }

        public void M0(RecyclerView recyclerView, w wVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, A a10, int i10);

        public View N(int i10) {
            androidx.recyclerview.widget.b bVar = this.f17925a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public abstract View N0(View view, int i10, w wVar, A a10);

        public void N1(z zVar) {
            z zVar2 = this.f17931g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f17931g.r();
            }
            this.f17931g = zVar;
            zVar.q(this.f17926b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f17925a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17926b;
            P0(recyclerView.f17820i, recyclerView.f17833o0, accessibilityEvent);
        }

        void O1() {
            z zVar = this.f17931g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void P0(w wVar, A a10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f17926b.canScrollVertically(-1) && !this.f17926b.canScrollHorizontally(-1) && !this.f17926b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f17926b.f17840s;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.d());
            }
        }

        public boolean P1() {
            return false;
        }

        void Q0(I0.z zVar) {
            RecyclerView recyclerView = this.f17926b;
            R0(recyclerView.f17820i, recyclerView.f17833o0, zVar);
        }

        public boolean R() {
            RecyclerView recyclerView = this.f17926b;
            return recyclerView != null && recyclerView.f17830n;
        }

        public void R0(w wVar, A a10, I0.z zVar) {
            if (this.f17926b.canScrollVertically(-1) || this.f17926b.canScrollHorizontally(-1)) {
                zVar.a(8192);
                zVar.R0(true);
            }
            if (this.f17926b.canScrollVertically(1) || this.f17926b.canScrollHorizontally(1)) {
                zVar.a(4096);
                zVar.R0(true);
            }
            zVar.y0(z.f.b(o0(wVar, a10), S(wVar, a10), z0(wVar, a10), p0(wVar, a10)));
        }

        public int S(w wVar, A a10) {
            return -1;
        }

        void S0(View view, I0.z zVar) {
            E eL0 = RecyclerView.l0(view);
            if (eL0 == null || eL0.v() || this.f17925a.n(eL0.f17881a)) {
                return;
            }
            RecyclerView recyclerView = this.f17926b;
            T0(recyclerView.f17820i, recyclerView.f17833o0, view, zVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void U(View view, Rect rect) {
            RecyclerView.m0(view, rect);
        }

        public View U0(View view, int i10) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f17950b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f17950b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f17925a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            Z0(recyclerView, i10, i11);
        }

        public int b0() {
            return this.f17942r;
        }

        public abstract void b1(w wVar, A a10);

        public int c0() {
            return this.f17940p;
        }

        public int d0() {
            return AbstractC1658a0.y(this.f17926b);
        }

        public void d1(w wVar, A a10, int i10, int i11) {
            this.f17926b.C(i10, i11);
        }

        public int e() {
            RecyclerView recyclerView = this.f17926b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f17950b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.A0();
        }

        public int f0() {
            return AbstractC1658a0.z(this.f17926b);
        }

        public boolean f1(RecyclerView recyclerView, A a10, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return AbstractC1658a0.A(this.f17926b);
        }

        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(z zVar) {
            if (this.f17931g == zVar) {
                this.f17931g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f17926b;
            return l1(recyclerView.f17820i, recyclerView.f17833o0, i10, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean l1(w wVar, A a10, int i10, Bundle bundle) {
            int iK0;
            int iI0;
            int i11;
            int i12;
            if (this.f17926b == null) {
                return false;
            }
            int iB0 = b0();
            int iS0 = s0();
            Rect rect = new Rect();
            if (this.f17926b.getMatrix().isIdentity() && this.f17926b.getGlobalVisibleRect(rect)) {
                iB0 = rect.height();
                iS0 = rect.width();
            }
            if (i10 == 4096) {
                iK0 = this.f17926b.canScrollVertically(1) ? (iB0 - k0()) - h0() : 0;
                if (this.f17926b.canScrollHorizontally(1)) {
                    iI0 = (iS0 - i0()) - j0();
                    i11 = iK0;
                    i12 = iI0;
                }
                i11 = iK0;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iK0 = this.f17926b.canScrollVertically(-1) ? -((iB0 - k0()) - h0()) : 0;
                if (this.f17926b.canScrollHorizontally(-1)) {
                    iI0 = -((iS0 - i0()) - j0());
                    i11 = iK0;
                    i12 = iI0;
                }
                i11 = iK0;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f17926b.y1(i12, i11, null, androidx.customview.widget.a.INVALID_ID, true);
            return true;
        }

        public void m(View view, int i10) {
            n(view, i10, (q) view.getLayoutParams());
        }

        boolean m1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f17926b;
            return n1(recyclerView.f17820i, recyclerView.f17833o0, view, i10, bundle);
        }

        public void n(View view, int i10, q qVar) {
            E eL0 = RecyclerView.l0(view);
            if (eL0.v()) {
                this.f17926b.f17828m.b(eL0);
            } else {
                this.f17926b.f17828m.p(eL0);
            }
            this.f17925a.c(view, i10, qVar, eL0.v());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f17950b.right;
        }

        public boolean n1(w wVar, A a10, View view, int i10, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.p0(view));
            }
        }

        public int o0(w wVar, A a10) {
            return -1;
        }

        public void o1(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.l0(N(iO)).J()) {
                    r1(iO, wVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(w wVar, A a10) {
            return 0;
        }

        void p1(w wVar) {
            int iJ = wVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = wVar.n(i10);
                E eL0 = RecyclerView.l0(viewN);
                if (!eL0.J()) {
                    eL0.G(false);
                    if (eL0.x()) {
                        this.f17926b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f17926b.f17806T;
                    if (mVar != null) {
                        mVar.j(eL0);
                    }
                    eL0.G(true);
                    wVar.D(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f17926b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f17950b.top;
        }

        public void q1(View view, w wVar) {
            t1(view);
            wVar.G(view);
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f17950b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f17926b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f17926b.f17838r;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i10, w wVar) {
            View viewN = N(i10);
            u1(i10);
            wVar.G(viewN);
        }

        public int s0() {
            return this.f17941q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int t0() {
            return this.f17939o;
        }

        public void t1(View view) {
            this.f17925a.p(view);
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i10) {
            if (N(i10) != null) {
                this.f17925a.q(i10);
            }
        }

        public abstract int v(A a10);

        public boolean v0() {
            return this.f17933i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return w1(recyclerView, view, rect, z10, false);
        }

        public abstract int w(A a10);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.v1(i10, i11);
            }
            return true;
        }

        public abstract int x(A a10);

        public void x1() {
            RecyclerView recyclerView = this.f17926b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(A a10);

        public final boolean y0() {
            return this.f17936l;
        }

        public void y1() {
            this.f17932h = true;
        }

        public abstract int z(A a10);

        public boolean z0(w wVar, A a10) {
            return false;
        }

        public void K0(RecyclerView recyclerView) {
        }

        public void L0(RecyclerView recyclerView) {
        }

        public void W0(RecyclerView recyclerView) {
        }

        public void c1(A a10) {
        }

        public void g1(Parcelable parcelable) {
        }

        public void i1(int i10) {
        }

        public void I0(h hVar, h hVar2) {
        }

        public void u(int i10, c cVar) {
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void T0(w wVar, A a10, View view, I0.z zVar) {
        }

        public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void t(int i10, int i11, A a10, c cVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f17960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f17961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f17962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f17963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        v f17966g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f17960a = arrayList;
            this.f17961b = null;
            this.f17962c = new ArrayList();
            this.f17963d = Collections.unmodifiableList(arrayList);
            this.f17964e = 2;
            this.f17965f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            v vVar = this.f17966g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(E e10, int i10, int i11, long j10) {
            e10.f17899s = null;
            e10.f17898r = RecyclerView.this;
            int iL = e10.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f17966g.m(iL, nanoTime, j10)) {
                return false;
            }
            if (e10.x()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(e10.f17881a, recyclerView.getChildCount(), e10.f17881a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f17840s.a(e10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(e10.f17881a);
            }
            this.f17966g.f(e10.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e10);
            if (RecyclerView.this.f17833o0.e()) {
                e10.f17887g = i11;
            }
            return true;
        }

        private void b(E e10) {
            if (RecyclerView.this.z0()) {
                View view = e10.f17881a;
                if (AbstractC1658a0.w(view) == 0) {
                    AbstractC1658a0.s0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f17847v0;
                if (kVar == null) {
                    return;
                }
                C1657a c1657aC = kVar.c();
                if (c1657aC instanceof k.a) {
                    ((k.a) c1657aC).d(view);
                }
                AbstractC1658a0.k0(view, c1657aC);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(E e10) {
            View view = e10.f17881a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f17966g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17840s == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f17966g.b(RecyclerView.this.f17840s);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f17962c.size(); i10++) {
                L0.a.a(((E) this.f17962c.get(i10)).f17881a);
            }
            B(RecyclerView.this.f17840s);
        }

        void D(View view) {
            E eL0 = RecyclerView.l0(view);
            eL0.f17894n = null;
            eL0.f17895o = false;
            eL0.e();
            H(eL0);
        }

        void E() {
            for (int size = this.f17962c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f17962c.clear();
            if (RecyclerView.f17774O0) {
                RecyclerView.this.f17831n0.b();
            }
        }

        void F(int i10) {
            boolean z10 = RecyclerView.f17767H0;
            E e10 = (E) this.f17962c.get(i10);
            if (RecyclerView.f17768I0) {
                Objects.toString(e10);
            }
            a(e10, true);
            this.f17962c.remove(i10);
        }

        public void G(View view) {
            E eL0 = RecyclerView.l0(view);
            if (eL0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (eL0.w()) {
                eL0.K();
            } else if (eL0.L()) {
                eL0.e();
            }
            H(eL0);
            if (RecyclerView.this.f17806T == null || eL0.u()) {
                return;
            }
            RecyclerView.this.f17806T.j(eL0);
        }

        void H(E e10) {
            boolean z10;
            boolean z11 = true;
            if (e10.w() || e10.f17881a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e10.w());
                sb.append(" isAttached:");
                sb.append(e10.f17881a.getParent() != null);
                sb.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e10.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e10 + RecyclerView.this.V());
            }
            if (e10.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean zH = e10.h();
            h hVar = RecyclerView.this.f17840s;
            boolean z12 = hVar != null && zH && hVar.r(e10);
            if (RecyclerView.f17767H0 && this.f17962c.contains(e10)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + e10 + RecyclerView.this.V());
            }
            if (z12 || e10.u()) {
                if (this.f17965f <= 0 || e10.p(526)) {
                    z10 = false;
                } else {
                    int size = this.f17962c.size();
                    if (size >= this.f17965f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f17774O0 && size > 0 && !RecyclerView.this.f17831n0.d(e10.f17883c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f17831n0.d(((E) this.f17962c.get(i10)).f17883c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f17962c.add(size, e10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(e10, true);
                }
                z = z10;
            } else {
                if (RecyclerView.f17768I0) {
                    RecyclerView.this.V();
                }
                z11 = false;
            }
            RecyclerView.this.f17828m.q(e10);
            if (z || z11 || !zH) {
                return;
            }
            L0.a.a(e10.f17881a);
            e10.f17899s = null;
            e10.f17898r = null;
        }

        void I(View view) {
            E eL0 = RecyclerView.l0(view);
            if (!eL0.p(12) && eL0.y() && !RecyclerView.this.s(eL0)) {
                if (this.f17961b == null) {
                    this.f17961b = new ArrayList();
                }
                eL0.H(this, true);
                this.f17961b.add(eL0);
                return;
            }
            if (!eL0.t() || eL0.v() || RecyclerView.this.f17840s.h()) {
                eL0.H(this, false);
                this.f17960a.add(eL0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.f17840s);
            v vVar2 = this.f17966g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f17966g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f17966g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f17964e = i10;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01fa A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        E N(int i10, boolean z10, long j10) {
            E eC;
            boolean z11;
            E e10;
            boolean z12;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            RecyclerView recyclerViewB0;
            if (i10 < 0 || i10 >= RecyclerView.this.f17833o0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f17833o0.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.f17833o0.e()) {
                eC = h(i10);
                if (eC != null) {
                    z11 = true;
                }
                if (eC == null && (eC = m(i10, z10)) != null) {
                    if (Q(eC)) {
                        if (!z10) {
                            eC.b(4);
                            if (eC.w()) {
                                RecyclerView.this.removeDetachedView(eC.f17881a, false);
                                eC.K();
                            } else if (eC.L()) {
                                eC.e();
                            }
                            H(eC);
                        }
                        eC = null;
                    } else {
                        z11 = true;
                    }
                }
                if (eC == null) {
                    int iM = RecyclerView.this.f17824k.m(i10);
                    if (iM < 0 || iM >= RecyclerView.this.f17840s.d()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f17833o0.b() + RecyclerView.this.V());
                    }
                    int iF = RecyclerView.this.f17840s.f(iM);
                    if (RecyclerView.this.f17840s.h() && (eC = l(RecyclerView.this.f17840s.e(iM), iF, z10)) != null) {
                        eC.f17883c = iM;
                        z11 = true;
                    }
                    if (eC == null) {
                        boolean z13 = RecyclerView.f17767H0;
                        E eH = i().h(iF);
                        if (eH != null) {
                            eH.D();
                            if (RecyclerView.f17771L0) {
                                r(eH);
                            }
                        }
                        eC = eH;
                    }
                    if (eC == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f17966g.n(iF, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        eC = recyclerView.f17840s.c(recyclerView, iF);
                        if (RecyclerView.f17774O0 && (recyclerViewB0 = RecyclerView.b0(eC.f17881a)) != null) {
                            eC.f17882b = new WeakReference(recyclerViewB0);
                        }
                        this.f17966g.g(iF, RecyclerView.this.getNanoTime() - nanoTime);
                        boolean z14 = RecyclerView.f17767H0;
                    }
                }
                e10 = eC;
                z12 = z11;
                if (z12 && !RecyclerView.this.f17833o0.e() && e10.p(8192)) {
                    e10.F(0, 8192);
                    if (RecyclerView.this.f17833o0.f17866k) {
                        int iE = m.e(e10) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.Y0(e10, recyclerView2.f17806T.t(recyclerView2.f17833o0, e10, iE, e10.o()));
                    }
                }
                if (RecyclerView.this.f17833o0.e() || !e10.s()) {
                    if (e10.s() || e10.z() || e10.t()) {
                        if (!RecyclerView.f17767H0 && e10.v()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + e10 + RecyclerView.this.V());
                        }
                        zM = M(e10, RecyclerView.this.f17824k.m(i10), i10, j10);
                    }
                    layoutParams = e10.f17881a.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        e10.f17881a.setLayoutParams(qVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        e10.f17881a.setLayoutParams(qVar);
                    }
                    qVar.f17949a = e10;
                    qVar.f17952d = z12 && zM;
                    return e10;
                }
                e10.f17887g = i10;
                zM = false;
                layoutParams = e10.f17881a.getLayoutParams();
                if (layoutParams == null) {
                }
                qVar.f17949a = e10;
                qVar.f17952d = z12 && zM;
                return e10;
            }
            eC = null;
            z11 = false;
            if (eC == null) {
                if (Q(eC)) {
                }
            }
            if (eC == null) {
            }
            e10 = eC;
            z12 = z11;
            if (z12) {
                e10.F(0, 8192);
                if (RecyclerView.this.f17833o0.f17866k) {
                }
            }
            if (RecyclerView.this.f17833o0.e()) {
                if (e10.s()) {
                }
                if (!RecyclerView.f17767H0) {
                }
                zM = M(e10, RecyclerView.this.f17824k.m(i10), i10, j10);
            }
            layoutParams = e10.f17881a.getLayoutParams();
            if (layoutParams == null) {
            }
            qVar.f17949a = e10;
            qVar.f17952d = z12 && zM;
            return e10;
        }

        void O(E e10) {
            if (e10.f17895o) {
                this.f17961b.remove(e10);
            } else {
                this.f17960a.remove(e10);
            }
            e10.f17894n = null;
            e10.f17895o = false;
            e10.e();
        }

        void P() {
            p pVar = RecyclerView.this.f17842t;
            this.f17965f = this.f17964e + (pVar != null ? pVar.f17937m : 0);
            for (int size = this.f17962c.size() - 1; size >= 0 && this.f17962c.size() > this.f17965f; size--) {
                F(size);
            }
        }

        boolean Q(E e10) {
            if (e10.v()) {
                if (!RecyclerView.f17767H0 || RecyclerView.this.f17833o0.e()) {
                    return RecyclerView.this.f17833o0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = e10.f17883c;
            if (i10 >= 0 && i10 < RecyclerView.this.f17840s.d()) {
                if (RecyclerView.this.f17833o0.e() || RecyclerView.this.f17840s.f(e10.f17883c) == e10.l()) {
                    return !RecyclerView.this.f17840s.h() || e10.k() == RecyclerView.this.f17840s.e(e10.f17883c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e10 + RecyclerView.this.V());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f17962c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f17962c.get(size);
                if (e10 != null && (i12 = e10.f17883c) >= i10 && i12 < i13) {
                    e10.b(2);
                    F(size);
                }
            }
        }

        void a(E e10, boolean z10) {
            RecyclerView.u(e10);
            View view = e10.f17881a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f17847v0;
            if (kVar != null) {
                C1657a c1657aC = kVar.c();
                AbstractC1658a0.k0(view, c1657aC instanceof k.a ? ((k.a) c1657aC).c(view) : null);
            }
            if (z10) {
                g(e10);
            }
            e10.f17899s = null;
            e10.f17898r = null;
            i().k(e10);
        }

        public void c() {
            this.f17960a.clear();
            E();
        }

        void d() {
            int size = this.f17962c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((E) this.f17962c.get(i10)).c();
            }
            int size2 = this.f17960a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((E) this.f17960a.get(i11)).c();
            }
            ArrayList arrayList = this.f17961b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((E) this.f17961b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f17960a.clear();
            ArrayList arrayList = this.f17961b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f17833o0.b()) {
                return !RecyclerView.this.f17833o0.e() ? i10 : RecyclerView.this.f17824k.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f17833o0.b() + RecyclerView.this.V());
        }

        void g(E e10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f17844u.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f17844u.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f17840s;
            if (hVar != null) {
                hVar.u(e10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17833o0 != null) {
                recyclerView.f17828m.q(e10);
            }
            if (RecyclerView.f17768I0) {
                Objects.toString(e10);
            }
        }

        E h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f17961b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    E e10 = (E) this.f17961b.get(i11);
                    if (!e10.L() && e10.m() == i10) {
                        e10.b(32);
                        return e10;
                    }
                }
                if (RecyclerView.this.f17840s.h() && (iM = RecyclerView.this.f17824k.m(i10)) > 0 && iM < RecyclerView.this.f17840s.d()) {
                    long jE = RecyclerView.this.f17840s.e(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        E e11 = (E) this.f17961b.get(i12);
                        if (!e11.L() && e11.k() == jE) {
                            e11.b(32);
                            return e11;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f17966g == null) {
                this.f17966g = new v();
                u();
            }
            return this.f17966g;
        }

        int j() {
            return this.f17960a.size();
        }

        public List k() {
            return this.f17963d;
        }

        E l(long j10, int i10, boolean z10) {
            for (int size = this.f17960a.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f17960a.get(size);
                if (e10.k() == j10 && !e10.L()) {
                    if (i10 == e10.l()) {
                        e10.b(32);
                        if (e10.v() && !RecyclerView.this.f17833o0.e()) {
                            e10.F(2, 14);
                        }
                        return e10;
                    }
                    if (!z10) {
                        this.f17960a.remove(size);
                        RecyclerView.this.removeDetachedView(e10.f17881a, false);
                        D(e10.f17881a);
                    }
                }
            }
            int size2 = this.f17962c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                E e11 = (E) this.f17962c.get(size2);
                if (e11.k() == j10 && !e11.r()) {
                    if (i10 == e11.l()) {
                        if (!z10) {
                            this.f17962c.remove(size2);
                        }
                        return e11;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        E m(int i10, boolean z10) {
            View viewE;
            int size = this.f17960a.size();
            for (int i11 = 0; i11 < size; i11++) {
                E e10 = (E) this.f17960a.get(i11);
                if (!e10.L() && e10.m() == i10 && !e10.t() && (RecyclerView.this.f17833o0.f17863h || !e10.v())) {
                    e10.b(32);
                    return e10;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f17826l.e(i10)) == null) {
                int size2 = this.f17962c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    E e11 = (E) this.f17962c.get(i12);
                    if (!e11.t() && e11.m() == i10 && !e11.r()) {
                        if (!z10) {
                            this.f17962c.remove(i12);
                        }
                        if (RecyclerView.f17768I0) {
                            e11.toString();
                        }
                        return e11;
                    }
                }
                return null;
            }
            E eL0 = RecyclerView.l0(viewE);
            RecyclerView.this.f17826l.s(viewE);
            int iM = RecyclerView.this.f17826l.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f17826l.d(iM);
                I(viewE);
                eL0.b(8224);
                return eL0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + eL0 + RecyclerView.this.V());
        }

        View n(int i10) {
            return ((E) this.f17960a.get(i10)).f17881a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f17881a;
        }

        void s() {
            int size = this.f17962c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((E) this.f17962c.get(i10)).f17881a.getLayoutParams();
                if (qVar != null) {
                    qVar.f17951c = true;
                }
            }
        }

        void t() {
            int size = this.f17962c.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e10 = (E) this.f17962c.get(i10);
                if (e10 != null) {
                    e10.b(6);
                    e10.a(null);
                }
            }
            h hVar = RecyclerView.this.f17840s;
            if (hVar == null || !hVar.h()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f17962c.size();
            for (int i12 = 0; i12 < size; i12++) {
                E e10 = (E) this.f17962c.get(i12);
                if (e10 != null && e10.f17883c >= i10) {
                    if (RecyclerView.f17768I0) {
                        e10.toString();
                    }
                    e10.A(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f17962c.size();
            for (int i16 = 0; i16 < size; i16++) {
                E e10 = (E) this.f17962c.get(i16);
                if (e10 != null && (i15 = e10.f17883c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        e10.A(i11 - i10, false);
                    } else {
                        e10.A(i12, false);
                    }
                    if (RecyclerView.f17768I0) {
                        e10.toString();
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f17962c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f17962c.get(size);
                if (e10 != null) {
                    int i13 = e10.f17883c;
                    if (i13 >= i12) {
                        if (RecyclerView.f17768I0) {
                            e10.toString();
                        }
                        e10.A(-i11, z10);
                    } else if (i13 >= i10) {
                        e10.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(C c10) {
        }
    }

    public void L0(View view) {
    }

    public void M0(View view) {
    }

    public void R0(int i10) {
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class o {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, A a10) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, A a10) {
            f(canvas, recyclerView);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, A a10) {
            h(canvas, recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class u {
        public abstract void b(RecyclerView recyclerView, int i10, int i11);

        public void a(RecyclerView recyclerView, int i10) {
        }
    }

    public void S0(int i10, int i11) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }
}
