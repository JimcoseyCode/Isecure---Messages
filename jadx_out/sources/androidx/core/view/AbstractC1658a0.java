package androidx.core.view;

import I0.z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1657a;
import androidx.core.view.C1690q0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import v0.AbstractC3415c;

/* JADX INFO: renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1658a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f16511a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f16512b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16513c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f16514d = {AbstractC3415c.f32797b, AbstractC3415c.f32798c, AbstractC3415c.f32809n, AbstractC3415c.f32820y, AbstractC3415c.f32777B, AbstractC3415c.f32778C, AbstractC3415c.f32779D, AbstractC3415c.f32780E, AbstractC3415c.f32781F, AbstractC3415c.f32782G, AbstractC3415c.f32799d, AbstractC3415c.f32800e, AbstractC3415c.f32801f, AbstractC3415c.f32802g, AbstractC3415c.f32803h, AbstractC3415c.f32804i, AbstractC3415c.f32805j, AbstractC3415c.f32806k, AbstractC3415c.f32807l, AbstractC3415c.f32808m, AbstractC3415c.f32810o, AbstractC3415c.f32811p, AbstractC3415c.f32812q, AbstractC3415c.f32813r, AbstractC3415c.f32814s, AbstractC3415c.f32815t, AbstractC3415c.f32816u, AbstractC3415c.f32817v, AbstractC3415c.f32818w, AbstractC3415c.f32819x, AbstractC3415c.f32821z, AbstractC3415c.f32776A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K f16515e = new K() { // from class: androidx.core.view.Z
        @Override // androidx.core.view.K
        public final C1663d onReceiveContent(C1663d c1663d) {
            return AbstractC1658a0.a(c1663d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f16516f = new e();

    /* JADX INFO: renamed from: androidx.core.view.a0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1658a0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f16519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16521d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f16520c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f16518a);
            if (this.f16519b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC1658a0.j(view);
                view.setTag(this.f16518a, obj);
                AbstractC1658a0.T(view, this.f16521d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f16518a = i10;
            this.f16519b = cls;
            this.f16521d = i11;
            this.f16520c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return AbstractC1668f0.f16552b ? AbstractC1668f0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h {

        /* JADX INFO: renamed from: androidx.core.view.a0$h$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            L0 f16522a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f16523b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f16524c;

            a(View view, I i10) {
                this.f16523b = view;
                this.f16524c = i10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                L0 l0Z = L0.z(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f16523b);
                    if (l0Z.equals(this.f16522a)) {
                        return this.f16524c.a(view, l0Z).x();
                    }
                }
                this.f16522a = l0Z;
                L0 l0A = this.f16524c.a(view, l0Z);
                if (i10 >= 30) {
                    return l0A.x();
                }
                AbstractC1658a0.h0(view);
                return l0A.x();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC3415c.f32795T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static L0 b(View view, L0 l02, Rect rect) {
            WindowInsets windowInsetsX = l02.x();
            if (windowInsetsX != null) {
                return L0.z(view.computeSystemWindowInsets(windowInsetsX, rect), view);
            }
            rect.setEmpty();
            return l02;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f10) {
            view.setElevation(f10);
        }

        static void m(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void n(View view, I i10) {
            a aVar = i10 != null ? new a(view, i10) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC3415c.f32788M, aVar);
            }
            if (view.getTag(AbstractC3415c.f32787L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC3415c.f32795T));
            }
        }

        static void o(View view, String str) {
            view.setTransitionName(str);
        }

        static void p(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void q(View view, float f10) {
            view.setZ(f10);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i {
        public static L0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            L0 l0Y = L0.y(rootWindowInsets);
            l0Y.u(l0Y);
            l0Y.d(view.getRootView());
            return l0Y;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class j {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$k */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class k {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$l */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$m */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class m {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static l1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return l1.h(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$n */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1663d b(View view, C1663d c1663d) {
            ContentInfo contentInfoF = c1663d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c1663d : C1663d.g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$o */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f16525d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f16526a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f16527b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f16528c = null;

        o() {
        }

        static o a(View view) {
            o oVar = (o) view.getTag(AbstractC3415c.f32793R);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(AbstractC3415c.f32793R, oVar2);
            return oVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f16526a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f16527b == null) {
                this.f16527b = new SparseArray();
            }
            return this.f16527b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC3415c.f32794S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f16526a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f16525d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f16526a == null) {
                        this.f16526a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f16525d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f16526a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f16526a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f16528c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f16528c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumWidth();
    }

    public static void A0(View view, String str) {
        h.o(view, str);
    }

    public static String[] B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(AbstractC3415c.f32790O);
    }

    public static void B0(View view, float f10) {
        h.p(view, f10);
    }

    public static int C(View view) {
        return view.getPaddingEnd();
    }

    public static void C0(View view, C1690q0.b bVar) {
        C1690q0.d(view, bVar);
    }

    public static int D(View view) {
        return view.getPaddingStart();
    }

    public static void D0(View view, float f10) {
        h.q(view, f10);
    }

    public static ViewParent E(View view) {
        return view.getParentForAccessibility();
    }

    private static f E0() {
        return new c(AbstractC3415c.f32792Q, CharSequence.class, 64, 30);
    }

    public static L0 F(View view) {
        return i.a(view);
    }

    public static void F0(View view) {
        h.r(view);
    }

    public static CharSequence G(View view) {
        return (CharSequence) E0().e(view);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static l1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC1688p0.b(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static boolean M(View view) {
        return l(view) != null;
    }

    public static boolean N(View view) {
        return view.hasTransientState();
    }

    public static boolean O(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean P(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean Q(View view) {
        return view.isLaidOut();
    }

    public static boolean R(View view) {
        return h.i(view);
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) j0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void T(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(n(view));
                    t0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(n(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void U(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void V(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static L0 W(View view, L0 l02) {
        WindowInsets windowInsetsX = l02.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsX);
            if (!windowInsetsB.equals(windowInsetsX)) {
                return L0.z(windowInsetsB, view);
            }
        }
        return l02;
    }

    public static void X(View view, I0.z zVar) {
        view.onInitializeAccessibilityNodeInfo(zVar.c1());
    }

    private static f Y() {
        return new b(AbstractC3415c.f32786K, CharSequence.class, 8, 28);
    }

    public static boolean Z(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static C1663d a0(View view, C1663d c1663d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c1663d);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c1663d);
        }
        J j10 = (J) view.getTag(AbstractC3415c.f32789N);
        if (j10 == null) {
            return u(view).onReceiveContent(c1663d);
        }
        C1663d c1663dA = j10.a(view, c1663d);
        if (c1663dA == null) {
            return null;
        }
        return u(view).onReceiveContent(c1663dA);
    }

    private static f b() {
        return new d(AbstractC3415c.f32785J, Boolean.class, 28);
    }

    public static void b0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int c(View view, CharSequence charSequence, I0.C c10) {
        int iP = p(view, charSequence);
        if (iP != -1) {
            d(view, new z.a(iP, charSequence, c10));
        }
        return iP;
    }

    public static void c0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    private static void d(View view, z.a aVar) {
        j(view);
        f0(aVar.b(), view);
        o(view).add(aVar);
        T(view, 0);
    }

    public static void d0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C1678k0 e(View view) {
        if (f16511a == null) {
            f16511a = new WeakHashMap();
        }
        C1678k0 c1678k0 = (C1678k0) f16511a.get(view);
        if (c1678k0 != null) {
            return c1678k0;
        }
        C1678k0 c1678k02 = new C1678k0(view);
        f16511a.put(view, c1678k02);
        return c1678k02;
    }

    public static void e0(View view, int i10) {
        f0(i10, view);
        T(view, 0);
    }

    public static L0 f(View view, L0 l02, Rect rect) {
        return h.b(view, l02, rect);
    }

    private static void f0(int i10, View view) {
        List listO = o(view);
        for (int i11 = 0; i11 < listO.size(); i11++) {
            if (((z.a) listO.get(i11)).b() == i10) {
                listO.remove(i11);
                return;
            }
        }
    }

    public static L0 g(View view, L0 l02) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsX = l02.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? m.a(view, windowInsetsX) : g.a(view, windowInsetsX);
            if (!windowInsetsA.equals(windowInsetsX)) {
                return L0.z(windowInsetsA, view);
            }
        }
        return l02;
    }

    public static void g0(View view, z.a aVar, CharSequence charSequence, I0.C c10) {
        if (c10 == null && charSequence == null) {
            e0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, c10));
        }
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).b(view, keyEvent);
    }

    public static void h0(View view) {
        g.c(view);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).f(keyEvent);
    }

    public static void i0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    static void j(View view) {
        C1657a c1657aK = k(view);
        if (c1657aK == null) {
            c1657aK = new C1657a();
        }
        k0(view, c1657aK);
    }

    private static f j0() {
        return new a(AbstractC3415c.f32791P, Boolean.class, 28);
    }

    public static C1657a k(View view) {
        View.AccessibilityDelegate accessibilityDelegateL = l(view);
        if (accessibilityDelegateL == null) {
            return null;
        }
        return accessibilityDelegateL instanceof C1657a.C0162a ? ((C1657a.C0162a) accessibilityDelegateL).f16510a : new C1657a(accessibilityDelegateL);
    }

    public static void k0(View view, C1657a c1657a) {
        if (c1657a == null && (l(view) instanceof C1657a.C0162a)) {
            c1657a = new C1657a();
        }
        t0(view);
        view.setAccessibilityDelegate(c1657a == null ? null : c1657a.getBridge());
    }

    private static View.AccessibilityDelegate l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : m(view);
    }

    public static void l0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate m(View view) {
        if (f16513c) {
            return null;
        }
        if (f16512b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16512b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16513c = true;
                return null;
            }
        }
        try {
            Object obj = f16512b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16513c = true;
            return null;
        }
    }

    public static void m0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static CharSequence n(View view) {
        return (CharSequence) Y().e(view);
    }

    public static void n0(View view, CharSequence charSequence) {
        Y().f(view, charSequence);
        if (charSequence != null) {
            f16516f.a(view);
        } else {
            f16516f.d(view);
        }
    }

    private static List o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC3415c.f32783H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC3415c.f32783H, arrayList2);
        return arrayList2;
    }

    public static void o0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    private static int p(View view, CharSequence charSequence) {
        List listO = o(view);
        for (int i10 = 0; i10 < listO.size(); i10++) {
            if (TextUtils.equals(charSequence, ((z.a) listO.get(i10)).c())) {
                return ((z.a) listO.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f16514d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listO.size(); i14++) {
                z10 &= ((z.a) listO.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void p0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static ColorStateList q(View view) {
        return h.c(view);
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static PorterDuff.Mode r(View view) {
        return h.d(view);
    }

    public static void r0(View view, float f10) {
        h.l(view, f10);
    }

    public static Display s(View view) {
        return view.getDisplay();
    }

    public static void s0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static float t(View view) {
        return h.e(view);
    }

    private static void t0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K u(View view) {
        return view instanceof K ? (K) view : f16515e;
    }

    public static void u0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.b(view, i10);
        }
    }

    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static void v0(View view, boolean z10) {
        h.m(view, z10);
    }

    public static int w(View view) {
        return view.getImportantForAccessibility();
    }

    public static void w0(View view, I i10) {
        h.n(view, i10);
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.a(view);
        }
        return 0;
    }

    public static void x0(View view, boolean z10) {
        j0().f(view, Boolean.valueOf(z10));
    }

    public static int y(View view) {
        return view.getLayoutDirection();
    }

    public static void y0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static int z(View view) {
        return view.getMinimumHeight();
    }

    public static void z0(View view, CharSequence charSequence) {
        E0().f(view, charSequence);
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakHashMap f16517g = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                AbstractC1658a0.T(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f16517g.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f16517g.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f16517g.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ C1663d a(C1663d c1663d) {
        return c1663d;
    }
}
