package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.react.uimanager.ViewDefaults;
import f.AbstractC2568a;
import f.AbstractC2577j;
import java.lang.reflect.Method;
import k.InterfaceC2820e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class S implements InterfaceC2820e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static Method f14714M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static Method f14715N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AdapterView.OnItemClickListener f14716A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f14717B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final i f14718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final h f14719D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final g f14720E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final e f14721F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Runnable f14722G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final Handler f14723H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Rect f14724I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Rect f14725J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f14726K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    PopupWindow f14727L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f14728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ListAdapter f14729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    N f14730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f14736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f14742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f14743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DataSetObserver f14745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f14746y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f14747z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewR = S.this.r();
            if (viewR == null || viewR.getWindowToken() == null) {
                return;
            }
            S.this.show();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (S.this.isShowing()) {
                S.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            S.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = S.this.f14727L) != null && popupWindow.isShowing() && x10 >= 0 && x10 < S.this.f14727L.getWidth() && y10 >= 0 && y10 < S.this.f14727L.getHeight()) {
                S s10 = S.this;
                s10.f14723H.postDelayed(s10.f14718C, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            S s11 = S.this;
            s11.f14723H.removeCallbacks(s11.f14718C);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            N n10 = S.this.f14730i;
            if (n10 == null || !n10.isAttachedToWindow() || S.this.f14730i.getCount() <= S.this.f14730i.getChildCount()) {
                return;
            }
            int childCount = S.this.f14730i.getChildCount();
            S s10 = S.this;
            if (childCount <= s10.f14742u) {
                s10.f14727L.setInputMethodMode(2);
                S.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14714M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f14715N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public S(Context context) {
        this(context, null, AbstractC2568a.f26717D);
    }

    private void A() {
        View view = this.f14743v;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14743v);
            }
        }
    }

    private void M(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f14727L, z10);
            return;
        }
        Method method = f14714M;
        if (method != null) {
            try {
                method.invoke(this.f14727L, Boolean.valueOf(z10));
            } catch (Exception unused) {
            }
        }
    }

    private int c() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f14730i == null) {
            Context context = this.f14728g;
            this.f14722G = new a();
            N nQ = q(context, !this.f14726K);
            this.f14730i = nQ;
            Drawable drawable = this.f14747z;
            if (drawable != null) {
                nQ.setSelector(drawable);
            }
            this.f14730i.setAdapter(this.f14729h);
            this.f14730i.setOnItemClickListener(this.f14716A);
            this.f14730i.setFocusable(true);
            this.f14730i.setFocusableInTouchMode(true);
            this.f14730i.setOnItemSelectedListener(new b());
            this.f14730i.setOnScrollListener(this.f14720E);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f14717B;
            if (onItemSelectedListener != null) {
                this.f14730i.setOnItemSelectedListener(onItemSelectedListener);
            }
            N n10 = this.f14730i;
            View view2 = this.f14743v;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f14744w;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(n10, layoutParams);
                } else if (i12 == 1) {
                    linearLayout.addView(n10, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f14732k;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = n10;
            }
            this.f14727L.setContentView(view);
        } else {
            View view3 = this.f14743v;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f14727L.getBackground();
        if (background != null) {
            background.getPadding(this.f14724I);
            Rect rect = this.f14724I;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f14736o) {
                this.f14734m = -i14;
            }
        } else {
            this.f14724I.setEmpty();
            i10 = 0;
        }
        int iS = s(r(), this.f14734m, this.f14727L.getInputMethodMode() == 2);
        if (this.f14740s || this.f14731j == -1) {
            return iS + i10;
        }
        int i15 = this.f14732k;
        if (i15 == -2) {
            int i16 = this.f14728g.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f14724I;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), androidx.customview.widget.a.INVALID_ID);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f14728g.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f14724I;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f14730i.d(iMakeMeasureSpec, 0, -1, iS - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f14730i.getPaddingTop() + this.f14730i.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int s(View view, int i10, boolean z10) {
        return c.a(this.f14727L, view, i10, z10);
    }

    public void B(View view) {
        this.f14746y = view;
    }

    public void C(int i10) {
        this.f14727L.setAnimationStyle(i10);
    }

    public void D(int i10) {
        Drawable background = this.f14727L.getBackground();
        if (background == null) {
            P(i10);
            return;
        }
        background.getPadding(this.f14724I);
        Rect rect = this.f14724I;
        this.f14732k = rect.left + rect.right + i10;
    }

    public void E(int i10) {
        this.f14739r = i10;
    }

    public void F(Rect rect) {
        this.f14725J = rect != null ? new Rect(rect) : null;
    }

    public void G(int i10) {
        this.f14727L.setInputMethodMode(i10);
    }

    public void H(boolean z10) {
        this.f14726K = z10;
        this.f14727L.setFocusable(z10);
    }

    public void I(PopupWindow.OnDismissListener onDismissListener) {
        this.f14727L.setOnDismissListener(onDismissListener);
    }

    public void J(AdapterView.OnItemClickListener onItemClickListener) {
        this.f14716A = onItemClickListener;
    }

    public void K(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f14717B = onItemSelectedListener;
    }

    public void L(boolean z10) {
        this.f14738q = true;
        this.f14737p = z10;
    }

    public void N(int i10) {
        this.f14744w = i10;
    }

    public void O(int i10) {
        N n10 = this.f14730i;
        if (!isShowing() || n10 == null) {
            return;
        }
        n10.setListSelectionHidden(false);
        n10.setSelection(i10);
        if (n10.getChoiceMode() != 0) {
            n10.setItemChecked(i10, true);
        }
    }

    public void P(int i10) {
        this.f14732k = i10;
    }

    public void d() {
        N n10 = this.f14730i;
        if (n10 != null) {
            n10.setListSelectionHidden(true);
            n10.requestLayout();
        }
    }

    @Override // k.InterfaceC2820e
    public void dismiss() {
        this.f14727L.dismiss();
        A();
        this.f14727L.setContentView(null);
        this.f14730i = null;
        this.f14723H.removeCallbacks(this.f14718C);
    }

    public void e(Drawable drawable) {
        this.f14727L.setBackgroundDrawable(drawable);
    }

    public int f() {
        return this.f14733l;
    }

    public void g(int i10) {
        this.f14733l = i10;
    }

    public Drawable i() {
        return this.f14727L.getBackground();
    }

    @Override // k.InterfaceC2820e
    public boolean isShowing() {
        return this.f14727L.isShowing();
    }

    @Override // k.InterfaceC2820e
    public ListView j() {
        return this.f14730i;
    }

    public void l(int i10) {
        this.f14734m = i10;
        this.f14736o = true;
    }

    public int o() {
        if (this.f14736o) {
            return this.f14734m;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f14745x;
        if (dataSetObserver == null) {
            this.f14745x = new f();
        } else {
            ListAdapter listAdapter2 = this.f14729h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f14729h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14745x);
        }
        N n10 = this.f14730i;
        if (n10 != null) {
            n10.setAdapter(this.f14729h);
        }
    }

    N q(Context context, boolean z10) {
        return new N(context, z10);
    }

    public View r() {
        return this.f14746y;
    }

    @Override // k.InterfaceC2820e
    public void show() {
        int iC = c();
        boolean zY = y();
        androidx.core.widget.h.b(this.f14727L, this.f14735n);
        if (this.f14727L.isShowing()) {
            if (r().isAttachedToWindow()) {
                int width = this.f14732k;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = r().getWidth();
                }
                int i10 = this.f14731j;
                if (i10 == -1) {
                    if (!zY) {
                        iC = -1;
                    }
                    if (zY) {
                        this.f14727L.setWidth(this.f14732k == -1 ? -1 : 0);
                        this.f14727L.setHeight(0);
                    } else {
                        this.f14727L.setWidth(this.f14732k == -1 ? -1 : 0);
                        this.f14727L.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iC = i10;
                }
                this.f14727L.setOutsideTouchable((this.f14741t || this.f14740s) ? false : true);
                this.f14727L.update(r(), this.f14733l, this.f14734m, width < 0 ? -1 : width, iC < 0 ? -1 : iC);
                return;
            }
            return;
        }
        int width2 = this.f14732k;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = r().getWidth();
        }
        int i11 = this.f14731j;
        if (i11 == -1) {
            iC = -1;
        } else if (i11 != -2) {
            iC = i11;
        }
        this.f14727L.setWidth(width2);
        this.f14727L.setHeight(iC);
        M(true);
        this.f14727L.setOutsideTouchable((this.f14741t || this.f14740s) ? false : true);
        this.f14727L.setTouchInterceptor(this.f14719D);
        if (this.f14738q) {
            androidx.core.widget.h.a(this.f14727L, this.f14737p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f14715N;
            if (method != null) {
                try {
                    method.invoke(this.f14727L, this.f14725J);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.f14727L, this.f14725J);
        }
        androidx.core.widget.h.c(this.f14727L, r(), this.f14733l, this.f14734m, this.f14739r);
        this.f14730i.setSelection(-1);
        if (!this.f14726K || this.f14730i.isInTouchMode()) {
            d();
        }
        if (this.f14726K) {
            return;
        }
        this.f14723H.post(this.f14721F);
    }

    public Object t() {
        if (isShowing()) {
            return this.f14730i.getSelectedItem();
        }
        return null;
    }

    public long u() {
        if (isShowing()) {
            return this.f14730i.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int v() {
        if (isShowing()) {
            return this.f14730i.getSelectedItemPosition();
        }
        return -1;
    }

    public View w() {
        if (isShowing()) {
            return this.f14730i.getSelectedView();
        }
        return null;
    }

    public int x() {
        return this.f14732k;
    }

    public boolean y() {
        return this.f14727L.getInputMethodMode() == 2;
    }

    public boolean z() {
        return this.f14726K;
    }

    public S(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public S(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f14731j = -2;
        this.f14732k = -2;
        this.f14735n = 1002;
        this.f14739r = 0;
        this.f14740s = false;
        this.f14741t = false;
        this.f14742u = ViewDefaults.NUMBER_OF_LINES;
        this.f14744w = 0;
        this.f14718C = new i();
        this.f14719D = new h();
        this.f14720E = new g();
        this.f14721F = new e();
        this.f14724I = new Rect();
        this.f14728g = context;
        this.f14723H = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f27090l1, i10, i11);
        this.f14733l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC2577j.f27095m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC2577j.f27100n1, 0);
        this.f14734m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14736o = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1645s c1645s = new C1645s(context, attributeSet, i10, i11);
        this.f14727L = c1645s;
        c1645s.setInputMethodMode(1);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            N n10;
            if (i10 == -1 || (n10 = S.this.f14730i) == null) {
                return;
            }
            n10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || S.this.y() || S.this.f14727L.getContentView() == null) {
                return;
            }
            S s10 = S.this;
            s10.f14723H.removeCallbacks(s10.f14718C);
            S.this.f14718C.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
