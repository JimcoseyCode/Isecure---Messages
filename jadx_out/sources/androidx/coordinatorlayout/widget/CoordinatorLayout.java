package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1692s;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u0.AbstractC3396a;
import u0.AbstractC3397b;
import u0.AbstractC3398c;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements F, G {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final Class[] f16218A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final ThreadLocal f16219B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final Comparator f16220C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final H0.e f16221D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final String f16222z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f16223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f16224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f16225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f16226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f16227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f16228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f16229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f16231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f16232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f16233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f16234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private L0 f16236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f16238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f16239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private I f16240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final H f16241y;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements I {
        a() {
        }

        @Override // androidx.core.view.I
        public L0 a(View view, L0 l02) {
            return CoordinatorLayout.this.V(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        c getBehavior();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(f fVar) {
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public L0 f(CoordinatorLayout coordinatorLayout, View view, L0 l02) {
            return l02;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f16239w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f16239w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class h implements Comparator {
        h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = AbstractC1658a0.L(view);
            float fL2 = AbstractC1658a0.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f16222z = r02 != null ? r02.getName() : null;
        f16220C = new h();
        f16218A = new Class[]{Context.class, AttributeSet.class};
        f16219B = new ThreadLocal();
        f16221D = new H0.f(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(View view, View view2, int i10) {
        Rect rectC = c();
        Rect rectC2 = c();
        try {
            q(view2, rectC);
            r(view, i10, rectC, rectC2);
            view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
        } finally {
            N(rectC);
            N(rectC2);
        }
    }

    private void B(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC1692s.b(S(fVar.f16247c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iT = t(i10) - measuredWidth;
        if (i12 == 1) {
            iT += measuredWidth / 2;
        } else if (i12 == 5) {
            iT += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iT, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent C(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void D(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC1658a0.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectC = c();
            Rect rectC2 = c();
            rectC2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectC)) {
                rectC.set(rectC2);
            } else if (!rectC2.contains(rectC)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectC.toShortString() + " | Bounds:" + rectC2.toShortString());
            }
            N(rectC2);
            if (rectC.isEmpty()) {
                N(rectC);
                return;
            }
            int iB = AbstractC1692s.b(fVar.f16252h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectC.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f16254j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                U(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectC.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f16254j) < (i14 = rect.bottom)) {
                U(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                U(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectC.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f16253i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                T(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectC.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f16253i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                T(view, width - i11);
            }
            if (!z12) {
                T(view, 0);
            }
            N(rectC);
        }
    }

    static c I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f16222z;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f16219B;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f16218A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean J(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean K(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f16225i;
        w(list);
        int size = list.size();
        MotionEvent motionEventC = null;
        boolean zJ = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zJ || z10) || actionMasked == 0) {
                if (!z10 && !zJ && cVarE != null && (zJ = J(cVarE, view, motionEvent, i10))) {
                    this.f16232p = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventC == null) {
                                    motionEventC = C(motionEvent);
                                }
                                J(cVarE2, view2, motionEventC, i10);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventC == null) {
                    motionEventC = C(motionEvent);
                }
                J(cVarE, view, motionEventC, i10);
            }
        }
        list.clear();
        if (motionEventC != null) {
            motionEventC.recycle();
        }
        return zJ;
    }

    private void L() {
        this.f16223g.clear();
        this.f16224h.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarV = v(childAt);
            fVarV.d(this, childAt);
            this.f16224h.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarV.b(this, childAt, childAt2)) {
                        if (!this.f16224h.d(childAt2)) {
                            this.f16224h.b(childAt2);
                        }
                        this.f16224h.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f16223g.addAll(this.f16224h.j());
        Collections.reverse(this.f16223g);
    }

    private static void N(Rect rect) {
        rect.setEmpty();
        f16221D.release(rect);
    }

    private void P() {
        View view = this.f16232p;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarE.D(this, this.f16232p, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f16232p = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f16229m = false;
    }

    private static int Q(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int R(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int S(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void T(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f16253i;
        if (i11 != i10) {
            AbstractC1658a0.U(view, i10 - i11);
            fVar.f16253i = i10;
        }
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f16254j;
        if (i11 != i10) {
            AbstractC1658a0.V(view, i10 - i11);
            fVar.f16254j = i10;
        }
    }

    private void W() {
        if (!AbstractC1658a0.v(this)) {
            AbstractC1658a0.w0(this, null);
            return;
        }
        if (this.f16240x == null) {
            this.f16240x = new a();
        }
        AbstractC1658a0.w0(this, this.f16240x);
        setSystemUiVisibility(1280);
    }

    private static Rect c() {
        Rect rect = (Rect) f16221D.acquire();
        return rect == null ? new Rect() : rect;
    }

    private void e() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int f(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void g(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private L0 h(L0 l02) {
        c cVarE;
        if (l02.p()) {
            return l02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC1658a0.v(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                l02 = cVarE.f(this, childAt, l02);
                if (l02.p()) {
                    return l02;
                }
            }
        }
        return l02;
    }

    private void s(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iB = AbstractC1692s.b(Q(fVar.f16247c), i10);
        int iB2 = AbstractC1692s.b(R(fVar.f16248d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int t(int i10) {
        int[] iArr = this.f16231o;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        toString();
        return 0;
    }

    private void w(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f16220C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean x(View view) {
        return this.f16224h.k(view);
    }

    private void z(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectC = c();
        rectC.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f16236t != null && AbstractC1658a0.v(this) && !AbstractC1658a0.v(view)) {
            rectC.left += this.f16236t.k();
            rectC.top += this.f16236t.m();
            rectC.right -= this.f16236t.l();
            rectC.bottom -= this.f16236t.j();
        }
        Rect rectC2 = c();
        AbstractC1692s.a(R(fVar.f16247c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectC, rectC2, i10);
        view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
        N(rectC);
        N(rectC2);
    }

    void E(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f16255k != null) {
            Rect rectC = c();
            Rect rectC2 = c();
            Rect rectC3 = c();
            q(fVar.f16255k, rectC);
            n(view, false, rectC2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            s(i10, rectC, rectC3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectC3.left == rectC2.left && rectC3.top == rectC2.top) ? false : true;
            g(fVar, rectC3, measuredWidth, measuredHeight);
            int i11 = rectC3.left - rectC2.left;
            int i12 = rectC3.top - rectC2.top;
            if (i11 != 0) {
                AbstractC1658a0.U(view, i11);
            }
            if (i12 != 0) {
                AbstractC1658a0.V(view, i12);
            }
            if (z10 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f16255k);
            }
            N(rectC);
            N(rectC2);
            N(rectC3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void F(int i10) {
        int i11;
        boolean zH;
        int iY = AbstractC1658a0.y(this);
        int size = this.f16223g.size();
        Rect rectC = c();
        Rect rectC2 = c();
        Rect rectC3 = c();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f16223g.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f16256l == ((View) this.f16223g.get(i13))) {
                        E(view, iY);
                    }
                }
                n(view, true, rectC2);
                if (fVar.f16251g != 0 && !rectC2.isEmpty()) {
                    int iB = AbstractC1692s.b(fVar.f16251g, iY);
                    int i14 = iB & 112;
                    if (i14 == 48) {
                        rectC.top = Math.max(rectC.top, rectC2.bottom);
                    } else if (i14 == 80) {
                        rectC.bottom = Math.max(rectC.bottom, getHeight() - rectC2.top);
                    }
                    int i15 = iB & 7;
                    if (i15 == 3) {
                        rectC.left = Math.max(rectC.left, rectC2.right);
                    } else if (i15 == 5) {
                        rectC.right = Math.max(rectC.right, getWidth() - rectC2.left);
                    }
                }
                if (fVar.f16252h != 0 && view.getVisibility() == 0) {
                    D(view, rectC, iY);
                }
                if (i10 != 2) {
                    u(view, rectC3);
                    if (!rectC3.equals(rectC2)) {
                        M(view, rectC2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = (View) this.f16223g.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            c cVarE = fVar2.e();
                            if (cVarE != null && cVarE.e(this, view2, view)) {
                                if (i10 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i10 != 2) {
                                        zH = cVarE.h(this, view2, view);
                                    } else {
                                        cVarE.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.o(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                    }
                }
            }
        }
        N(rectC);
        N(rectC2);
        N(rectC3);
    }

    public void G(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f16255k;
        if (view2 != null) {
            A(view, view2, i10);
            return;
        }
        int i11 = fVar.f16249e;
        if (i11 >= 0) {
            B(view, i11, i10);
        } else {
            z(view, i10);
        }
    }

    public void H(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void M(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void O() {
        if (this.f16230n && this.f16234r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f16234r);
        }
        this.f16235s = false;
    }

    final L0 V(L0 l02) {
        if (H0.c.a(this.f16236t, l02)) {
            return l02;
        }
        this.f16236t = l02;
        boolean z10 = false;
        boolean z11 = l02 != null && l02.m() > 0;
        this.f16237u = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        L0 l0H = h(l02);
        requestLayout();
        return l0H;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    void d() {
        if (this.f16230n) {
            if (this.f16234r == null) {
                this.f16234r = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f16234r);
        }
        this.f16235s = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f16245a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f16226j == null) {
                    this.f16226j = new Paint();
                }
                this.f16226j.setColor(fVar.f16245a.c(this, view));
                this.f16226j.setAlpha(f(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f16226j);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16238v;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    final List<View> getDependencySortedChildren() {
        L();
        return Collections.unmodifiableList(this.f16223g);
    }

    public final L0 getLastWindowInsets() {
        return this.f16236t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f16241y.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f16238v;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void i(View view) {
        ArrayList arrayListH = this.f16224h.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            View view2 = (View) arrayListH.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    void j() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (x(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f16235s) {
            if (z10) {
                d();
            } else {
                O();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void n(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            q(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List o(View view) {
        List listI = this.f16224h.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        P();
        if (this.f16235s) {
            if (this.f16234r == null) {
                this.f16234r = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f16234r);
        }
        if (this.f16236t == null && AbstractC1658a0.v(this)) {
            AbstractC1658a0.h0(this);
        }
        this.f16230n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P();
        if (this.f16235s && this.f16234r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f16234r);
        }
        View view = this.f16233q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f16230n = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f16237u || this.f16238v == null) {
            return;
        }
        L0 l02 = this.f16236t;
        int iM = l02 != null ? l02.m() : 0;
        if (iM > 0) {
            this.f16238v.setBounds(0, 0, getWidth(), iM);
            this.f16238v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            P();
        }
        boolean zK = K(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zK;
        }
        this.f16232p = null;
        P();
        return zK;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iY = AbstractC1658a0.y(this);
        int size = this.f16223g.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f16223g.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iY))) {
                G(view, iY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarE;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        View view;
        int i24;
        int i25;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.L();
        coordinatorLayout.j();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iY = AbstractC1658a0.y(coordinatorLayout);
        boolean z10 = iY == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f16236t != null && AbstractC1658a0.v(coordinatorLayout);
        int size3 = coordinatorLayout.f16223g.size();
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        while (i28 < size3) {
            View view2 = (View) coordinatorLayout.f16223g.get(i28);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i18 = size3;
                i15 = i28;
                i20 = paddingLeft;
                i16 = iY;
                suggestedMinimumWidth = i29;
                i24 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i30 = fVar.f16249e;
                if (i30 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iT = coordinatorLayout.t(i30);
                    int iB = AbstractC1692s.b(S(fVar.f16247c), iY) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB == 3 && !z10) || (iB == 5 && z10)) {
                        iMax = Math.max(0, (size - paddingRight) - iT);
                    } else if ((iB == 5 && !z10) || (iB == 3 && z10)) {
                        iMax = Math.max(0, iT - paddingLeft);
                    }
                    int i31 = i28;
                    i14 = iMax;
                    i13 = i31;
                    if (z11 || AbstractC1658a0.v(view2)) {
                        i15 = i13;
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        i15 = i13;
                        int iK = coordinatorLayout.f16236t.k() + coordinatorLayout.f16236t.l();
                        int iM = coordinatorLayout.f16236t.m() + coordinatorLayout.f16236t.j();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iK, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM, mode2);
                    }
                    cVarE = fVar.e();
                    if (cVarE == null) {
                        i18 = size3;
                        int i32 = iMakeMeasureSpec;
                        view = view2;
                        int i33 = i12;
                        i16 = iY;
                        i17 = i33;
                        i20 = paddingLeft;
                        i21 = i29;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                        int i34 = iMakeMeasureSpec2;
                        boolean zM = cVarE.m(this, view, i32, i14, i34, 0);
                        i23 = i32;
                        i19 = i14;
                        i22 = i34;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax2 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        suggestedMinimumHeight = iMax2;
                    } else {
                        int i35 = i12;
                        i16 = iY;
                        i17 = i35;
                        i18 = size3;
                        i19 = i14;
                        i20 = paddingLeft;
                        i21 = i29;
                        i22 = iMakeMeasureSpec2;
                        i23 = iMakeMeasureSpec;
                        view = view2;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.H(view3, i23, i19, i22, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax22 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax22;
                }
                i13 = i28;
                i14 = 0;
                if (z11) {
                    i15 = i13;
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                    cVarE = fVar.e();
                    if (cVarE == null) {
                    }
                    View view32 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.H(view32, i23, i19, i22, 0);
                    view = view32;
                    suggestedMinimumWidth = Math.max(i21, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax222 = Math.max(i17, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax222;
                }
            }
            i28 = i15 + 1;
            paddingLeft = i20;
            paddingRight = i24;
            iY = i16;
            size3 = i18;
        }
        int i36 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i36), View.resolveSizeAndState(suggestedMinimumHeight, i11, i36 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zN = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zN |= cVarE.n(this, childAt, view2, f12, f13, z11);
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zN) {
            F(1);
        }
        return zN;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zO = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zO |= cVarE.o(this, childAt, view2, f12, f13);
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray sparseArray = savedState.f16242i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = v(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        savedState.f16242i = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f16232p;
        boolean z10 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zK = cVarE != null ? cVarE.D(this, this.f16232p, motionEvent) : false;
        } else {
            zK = K(motionEvent, 1);
            if (actionMasked != 0 && zK) {
                z10 = true;
            }
        }
        if (this.f16232p == null || actionMasked == 3) {
            zK |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent motionEventC = C(motionEvent);
            super.onTouchEvent(motionEventC);
            motionEventC.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zK;
        }
        this.f16232p = null;
        P();
        return zK;
    }

    public List p(View view) {
        List listG = this.f16224h.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    void q(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void r(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        s(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        g(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f16229m) {
            return;
        }
        if (this.f16232p == null) {
            e();
        }
        P();
        this.f16229m = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        W();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16239w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f16238v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16238v = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16238v.setState(getDrawableState());
                }
                AbstractC3606a.m(this.f16238v, AbstractC1658a0.y(this));
                this.f16238v.setVisible(getVisibility() == 0, false);
                this.f16238v.setCallback(this);
            }
            AbstractC1658a0.b0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f16238v;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f16238v.setVisible(z10, false);
    }

    void u(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f v(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f16246b) {
            if (view instanceof b) {
                fVar.n(((b) view).getBehavior());
                fVar.f16246b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    dVar.value().getName();
                }
            }
            fVar.f16246b = true;
        }
        return fVar;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16238v;
    }

    public boolean y(View view, int i10, int i11) {
        Rect rectC = c();
        q(view, rectC);
        try {
            return rectC.contains(i10, i11);
        } finally {
            N(rectC);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3396a.f32644a);
    }

    @Override // androidx.core.view.F
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f16227k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, this.f16227k[0]) : Math.min(iMax, this.f16227k[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, this.f16227k[1]) : Math.min(iMax2, this.f16227k[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            F(1);
        }
    }

    @Override // androidx.core.view.F
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f16228l);
    }

    @Override // androidx.core.view.F
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c cVarE;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f16241y.c(view, view2, i10, i11);
        this.f16233q = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarE.v(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.F
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    fVar.q(i11, zA);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.F
    public void onStopNestedScroll(View view, int i10) {
        this.f16241y.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f16233q = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i10);
        this.f16223g = new ArrayList();
        this.f16224h = new androidx.coordinatorlayout.widget.a();
        this.f16225i = new ArrayList();
        this.f16227k = new int[2];
        this.f16228l = new int[2];
        this.f16241y = new H(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3398c.f32646a, 0, AbstractC3397b.f32645a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3398c.f32646a, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            AbstractC1658a0.i0(coordinatorLayout, context2, AbstractC3398c.f32646a, attributeSet, typedArray, 0, AbstractC3397b.f32645a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            AbstractC1658a0.i0(coordinatorLayout, context2, AbstractC3398c.f32646a, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(AbstractC3398c.f32647b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f16231o = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f16231o.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f16231o[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f16238v = typedArray.getDrawable(AbstractC3398c.f32648c);
        typedArray.recycle();
        W();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC1658a0.w(this) == 0) {
            AbstractC1658a0.s0(this, 1);
        }
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f16227k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    if (i12 > 0) {
                        iMin = Math.max(i15, this.f16227k[0]);
                    } else {
                        iMin = Math.min(i15, this.f16227k[0]);
                    }
                    i15 = iMin;
                    if (i13 > 0) {
                        iMin2 = Math.max(i16, this.f16227k[1]);
                    } else {
                        iMin2 = Math.min(i16, this.f16227k[1]);
                    }
                    i16 = iMin2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            F(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        SparseArray f16242i;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f16242i = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f16242i.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f16242i;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f16242i.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f16242i.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f16245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f16246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f16253i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16254j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f16255k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f16256l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f16257m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f16258n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f16259o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f16260p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f16261q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f16262r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f16246b = false;
            this.f16247c = 0;
            this.f16248d = 0;
            this.f16249e = -1;
            this.f16250f = -1;
            this.f16251g = 0;
            this.f16252h = 0;
            this.f16261q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f16250f);
            this.f16255k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f16256l = null;
                    this.f16255k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f16250f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f16256l = null;
                this.f16255k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f16256l = null;
                    this.f16255k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f16256l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC1692s.b(((f) view.getLayoutParams()).f16251g, i10);
            return iB != 0 && (AbstractC1692s.b(this.f16252h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f16255k.getId() != this.f16250f) {
                return false;
            }
            View view2 = this.f16255k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f16256l = null;
                    this.f16255k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f16256l = view2;
            return true;
        }

        boolean a() {
            return this.f16255k == null && this.f16250f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f16256l || r(view2, AbstractC1658a0.y(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f16245a;
            return cVar != null && cVar.e(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f16245a == null) {
                this.f16257m = false;
            }
            return this.f16257m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f16250f == -1) {
                this.f16256l = null;
                this.f16255k = null;
                return null;
            }
            if (this.f16255k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f16255k;
        }

        public c e() {
            return this.f16245a;
        }

        boolean f() {
            return this.f16260p;
        }

        Rect g() {
            return this.f16261q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f16257m;
            if (z10) {
                return true;
            }
            c cVar = this.f16245a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f16257m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f16258n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f16259o;
        }

        void j() {
            this.f16260p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f16257m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f16245a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f16245a = cVar;
                this.f16262r = null;
                this.f16246b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z10) {
            this.f16260p = z10;
        }

        void p(Rect rect) {
            this.f16261q.set(rect);
        }

        void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f16258n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f16259o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16246b = false;
            this.f16247c = 0;
            this.f16248d = 0;
            this.f16249e = -1;
            this.f16250f = -1;
            this.f16251g = 0;
            this.f16252h = 0;
            this.f16261q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3398c.f32649d);
            this.f16247c = typedArrayObtainStyledAttributes.getInteger(AbstractC3398c.f32650e, 0);
            this.f16250f = typedArrayObtainStyledAttributes.getResourceId(AbstractC3398c.f32651f, -1);
            this.f16248d = typedArrayObtainStyledAttributes.getInteger(AbstractC3398c.f32652g, 0);
            this.f16249e = typedArrayObtainStyledAttributes.getInteger(AbstractC3398c.f32656k, -1);
            this.f16251g = typedArrayObtainStyledAttributes.getInt(AbstractC3398c.f32655j, 0);
            this.f16252h = typedArrayObtainStyledAttributes.getInt(AbstractC3398c.f32654i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC3398c.f32653h);
            this.f16246b = zHasValue;
            if (zHasValue) {
                this.f16245a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(AbstractC3398c.f32653h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f16245a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f16246b = false;
            this.f16247c = 0;
            this.f16248d = 0;
            this.f16249e = -1;
            this.f16250f = -1;
            this.f16251g = 0;
            this.f16252h = 0;
            this.f16261q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16246b = false;
            this.f16247c = 0;
            this.f16248d = 0;
            this.f16249e = -1;
            this.f16250f = -1;
            this.f16251g = 0;
            this.f16252h = 0;
            this.f16261q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16246b = false;
            this.f16247c = 0;
            this.f16248d = 0;
            this.f16249e = -1;
            this.f16250f = -1;
            this.f16251g = 0;
            this.f16252h = 0;
            this.f16261q = new Rect();
        }
    }
}
