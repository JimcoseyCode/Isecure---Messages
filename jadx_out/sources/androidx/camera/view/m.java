package androidx.camera.view;

import F.L;
import F.M;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.m;
import androidx.camera.view.n;
import androidx.core.view.AbstractC1658a0;
import androidx.lifecycle.AbstractC1776x;
import com.facebook.react.uimanager.ViewProps;
import j0.C2759a;
import java.util.concurrent.atomic.AtomicReference;
import l0.C2860a;
import y.AbstractC3583h0;
import y.AbstractC3591l0;
import y.I0;
import y.L0;
import y.V;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FrameLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final c f15367u = c.PERFORMANCE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f15368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    n f15369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final s f15370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final f f15371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f15372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final androidx.lifecycle.A f15373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final AtomicReference f15374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o f15375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2759a f15376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    L f15377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MotionEvent f15378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f15379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View.OnLayoutChangeListener f15380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final p0.c f15381t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements p0.c {
        a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.e eVar, M m10) {
            if (i.a(m.this.f15374m, eVar, null)) {
                eVar.i(e.IDLE);
            }
            eVar.f();
            m10.c().e(eVar);
        }

        public static /* synthetic */ void d(a aVar, M m10, I0 i02, I0.h hVar) {
            m mVar;
            n nVar;
            aVar.getClass();
            AbstractC3583h0.a("PreviewView", "Preview transformation info updated. " + hVar);
            m.this.f15371j.r(hVar, i02.q(), m10.r().k() == 0);
            if (hVar.d() == -1 || ((nVar = (mVar = m.this).f15369h) != null && (nVar instanceof w))) {
                m.this.f15372k = true;
            } else {
                mVar.f15372k = false;
            }
            m.this.d();
        }

        @Override // y.p0.c
        public void a(final I0 i02) {
            n wVar;
            if (!H.y.d()) {
                androidx.core.content.a.h(m.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f15381t.a(i02);
                    }
                });
                return;
            }
            AbstractC3583h0.a("PreviewView", "Surface requested by Preview.");
            final M m10 = i02.m();
            m.this.f15377p = m10.r();
            m.this.f15375n.g(m10.r().i());
            i02.x(androidx.core.content.a.h(m.this.getContext()), new I0.i() { // from class: androidx.camera.view.k
                @Override // y.I0.i
                public final void a(I0.h hVar) {
                    m.a.d(this.f15361a, m10, i02, hVar);
                }
            });
            m mVar = m.this;
            if (!m.e(mVar.f15369h, i02, mVar.f15368g)) {
                m mVar2 = m.this;
                if (m.f(i02, mVar2.f15368g)) {
                    m mVar3 = m.this;
                    wVar = new D(mVar3, mVar3.f15371j);
                } else {
                    m mVar4 = m.this;
                    wVar = new w(mVar4, mVar4.f15371j);
                }
                mVar2.f15369h = wVar;
            }
            L lR = m10.r();
            m mVar5 = m.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(lR, mVar5.f15373l, mVar5.f15369h);
            m.this.f15374m.set(eVar);
            m10.c().c(androidx.core.content.a.h(m.this.getContext()), eVar);
            m.this.f15369h.g(i02, new n.a() { // from class: androidx.camera.view.l
                @Override // androidx.camera.view.n.a
                public final void a() {
                    m.a.c(this.f15364a, eVar, m10);
                }
            });
            m mVar6 = m.this;
            if (mVar6.indexOfChild(mVar6.f15370i) == -1) {
                m mVar7 = m.this;
                mVar7.addView(mVar7.f15370i);
            }
            m.this.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f15387g;

        c(int i10) {
            this.f15387g = i10;
        }

        static c j(int i10) {
            for (c cVar : values()) {
                if (cVar.f15387g == i10) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        int k() {
            return this.f15387g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f15395g;

        d(int i10) {
            this.f15395g = i10;
        }

        static d j(int i10) {
            for (d dVar : values()) {
                if (dVar.f15395g == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        int k() {
            return this.f15395g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum e {
        IDLE,
        STREAMING
    }

    public m(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(m mVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mVar.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        mVar.d();
        mVar.b(true);
    }

    private void b(boolean z10) {
        H.y.b();
        getViewPort();
    }

    static boolean e(n nVar, I0 i02, c cVar) {
        return (nVar instanceof w) && !f(i02, cVar);
    }

    static boolean f(I0 i02, c cVar) {
        boolean zEquals = i02.m().r().n().equals("androidx.camera.camera2.legacy");
        boolean z10 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z10) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
    }

    private V.i getScreenFlashInternal() {
        return this.f15370i.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    private void setScreenFlashUiInfo(V.i iVar) {
        AbstractC3583h0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public L0 c(int i10) {
        H.y.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new L0.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void d() {
        H.y.b();
        if (this.f15369h != null) {
            i();
            this.f15369h.h();
        }
        this.f15375n.f(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f15379r, new Handler(Looper.getMainLooper()));
    }

    public Bitmap getBitmap() {
        H.y.b();
        n nVar = this.f15369h;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    public AbstractC1653a getController() {
        H.y.b();
        return null;
    }

    Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        H.y.b();
        return this.f15368g;
    }

    public AbstractC3591l0 getMeteringPointFactory() {
        H.y.b();
        return this.f15375n;
    }

    public C2860a getOutputTransform() {
        Matrix matrixJ;
        H.y.b();
        try {
            matrixJ = this.f15371j.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f15371j.i();
        if (matrixJ == null || rectI == null) {
            AbstractC3583h0.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixJ.preConcat(H.z.b(rectI));
        if (this.f15369h instanceof D) {
            matrixJ.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC3583h0.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C2860a(matrixJ, new Size(rectI.width(), rectI.height()));
    }

    public AbstractC1776x getPreviewStreamState() {
        return this.f15373l;
    }

    public d getScaleType() {
        H.y.b();
        return this.f15371j.g();
    }

    public V.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        H.y.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f15371j.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public p0.c getSurfaceProvider() {
        H.y.b();
        return this.f15381t;
    }

    public L0 getViewPort() {
        H.y.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return c(defaultDisplay.getRotation());
    }

    void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f15379r);
    }

    void i() {
        Display defaultDisplay;
        L l10;
        if (!this.f15372k || (defaultDisplay = getDefaultDisplay()) == null || (l10 = this.f15377p) == null) {
            return;
        }
        this.f15371j.o(l10.p(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            g();
        }
        addOnLayoutChangeListener(this.f15380s);
        n nVar = this.f15369h;
        if (nVar != null) {
            nVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f15380s);
        n nVar = this.f15369h;
        if (nVar != null) {
            nVar.e();
        }
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f15378q = null;
        return super.performClick();
    }

    public void setController(AbstractC1653a abstractC1653a) {
        H.y.b();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        H.y.b();
        this.f15368g = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        H.y.b();
        this.f15371j.q(dVar);
        d();
        b(false);
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f15370i.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        H.y.b();
        this.f15370i.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c cVar = f15367u;
        this.f15368g = cVar;
        f fVar = new f();
        this.f15371j = fVar;
        this.f15372k = true;
        this.f15373l = new androidx.lifecycle.A(e.IDLE);
        this.f15374m = new AtomicReference();
        this.f15375n = new o(fVar);
        this.f15379r = new b();
        this.f15380s = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                m.a(this.f15356g, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f15381t = new a();
        H.y.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f15407a, i10, i11);
        AbstractC1658a0.i0(this, context, p.f15407a, attributeSet, typedArrayObtainStyledAttributes, i10, i11);
        try {
            setScaleType(d.j(typedArrayObtainStyledAttributes.getInteger(p.f15409c, fVar.g().k())));
            setImplementationMode(c.j(typedArrayObtainStyledAttributes.getInteger(p.f15408b, cVar.k())));
            typedArrayObtainStyledAttributes.recycle();
            this.f15376o = new C2759a(context, new C2759a.b() { // from class: androidx.camera.view.h
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.black));
            }
            s sVar = new s(context);
            this.f15370i = sVar;
            sVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display defaultDisplay = m.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i10) {
                return;
            }
            m.this.d();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
