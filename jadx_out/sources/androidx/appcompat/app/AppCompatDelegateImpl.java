package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1637j;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q0;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1682m0;
import androidx.core.view.AbstractC1694t;
import androidx.core.view.AbstractC1696u;
import androidx.core.view.C1678k0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.lifecycle.AbstractC1764k;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f.AbstractC2568a;
import f.AbstractC2570c;
import f.AbstractC2573f;
import f.AbstractC2574g;
import f.AbstractC2576i;
import f.AbstractC2577j;
import g.AbstractC2619a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.g implements e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final m0.i f14018p0 = new m0.i();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final boolean f14019q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int[] f14020r0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final boolean f14021s0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    androidx.appcompat.view.b f14022A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    ActionBarContextView f14023B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    PopupWindow f14024C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    Runnable f14025D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    C1678k0 f14026E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f14027F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f14028G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ViewGroup f14029H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private TextView f14030I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private View f14031J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f14032K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f14033L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f14034M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f14035N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f14036O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f14037P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f14038Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f14039R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private PanelFeatureState[] f14040S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private PanelFeatureState f14041T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f14042U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f14043V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f14044W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f14045X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Configuration f14046Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f14047Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f14048a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f14049b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f14050c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private p f14051d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private p f14052e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f14053f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f14054g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Runnable f14055h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f14056i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Rect f14057j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Rect f14058k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private androidx.appcompat.app.s f14059l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private u f14060m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private OnBackInvokedDispatcher f14061n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private OnBackInvokedCallback f14062o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Object f14063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Context f14064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Window f14065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private n f14066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final androidx.appcompat.app.e f14067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    AbstractC1627a f14068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    MenuInflater f14069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f14070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private G f14071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private h f14072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private s f14073z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f14080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f14081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f14082i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f14083j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f14084k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f14085l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f14086m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f14087n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f14088o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f14089p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f14090q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f14091r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f14092s;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f14093g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            boolean f14094h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Bundle f14095i;

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f14093g = parcel.readInt();
                boolean z10 = parcel.readInt() == 1;
                savedState.f14094h = z10;
                if (z10) {
                    savedState.f14095i = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f14093g);
                parcel.writeInt(this.f14094h ? 1 : 0);
                if (this.f14094h) {
                    parcel.writeBundle(this.f14095i);
                }
            }
        }

        PanelFeatureState(int i10) {
            this.f14074a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f14083j == null) {
                return null;
            }
            if (this.f14084k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f14085l, AbstractC2574g.f26874j);
                this.f14084k = cVar;
                cVar.f(aVar);
                this.f14083j.b(this.f14084k);
            }
            return this.f14084k.l(this.f14080g);
        }

        public boolean b() {
            if (this.f14081h == null) {
                return false;
            }
            return this.f14082i != null || this.f14084k.j().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f14083j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.f14084k);
            }
            this.f14083j = eVar;
            if (eVar == null || (cVar = this.f14084k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC2568a.f26729a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(AbstractC2568a.f26718E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(AbstractC2576i.f26901c, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f14085l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(AbstractC2577j.f27154y0);
            this.f14075b = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26911B0, 0);
            this.f14079f = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f26906A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f14054g0 & 1) != 0) {
                appCompatDelegateImpl.k0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f14054g0 & 4096) != 0) {
                appCompatDelegateImpl2.k0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f14053f0 = false;
            appCompatDelegateImpl3.f14054g0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements I {
        b() {
        }

        @Override // androidx.core.view.I
        public L0 a(View view, L0 l02) {
            int iM = l02.m();
            int iG1 = AppCompatDelegateImpl.this.g1(l02, null);
            if (iM != iG1) {
                l02 = l02.r(l02.k(), iG1, l02.l(), l02.j());
            }
            return AbstractC1658a0.W(view, l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends AbstractC1682m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1680l0
            public void b(View view) {
                AppCompatDelegateImpl.this.f14023B.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f14026E.g(null);
                AppCompatDelegateImpl.this.f14026E = null;
            }

            @Override // androidx.core.view.AbstractC1682m0, androidx.core.view.InterfaceC1680l0
            public void c(View view) {
                AppCompatDelegateImpl.this.f14023B.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f14024C.showAtLocation(appCompatDelegateImpl.f14023B, 55, 0, 0);
            AppCompatDelegateImpl.this.l0();
            if (!AppCompatDelegateImpl.this.W0()) {
                AppCompatDelegateImpl.this.f14023B.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f14023B.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f14023B.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f14026E = AbstractC1658a0.e(appCompatDelegateImpl2.f14023B).b(1.0f);
                AppCompatDelegateImpl.this.f14026E.g(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends AbstractC1682m0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            AppCompatDelegateImpl.this.f14023B.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f14026E.g(null);
            AppCompatDelegateImpl.this.f14026E = null;
        }

        @Override // androidx.core.view.AbstractC1682m0, androidx.core.view.InterfaceC1680l0
        public void c(View view) {
            AppCompatDelegateImpl.this.f14023B.setVisibility(0);
            if (AppCompatDelegateImpl.this.f14023B.getParent() instanceof View) {
                AbstractC1658a0.h0((View) AppCompatDelegateImpl.this.f14023B.getParent());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f implements androidx.appcompat.app.b {
        f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            AppCompatDelegateImpl.this.b0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackX0 = AppCompatDelegateImpl.this.x0();
            if (callbackX0 == null) {
                return true;
            }
            callbackX0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f14104a;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends AbstractC1682m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1680l0
            public void b(View view) {
                AppCompatDelegateImpl.this.f14023B.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f14024C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f14023B.getParent() instanceof View) {
                    AbstractC1658a0.h0((View) AppCompatDelegateImpl.this.f14023B.getParent());
                }
                AppCompatDelegateImpl.this.f14023B.k();
                AppCompatDelegateImpl.this.f14026E.g(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f14026E = null;
                AbstractC1658a0.h0(appCompatDelegateImpl2.f14029H);
            }
        }

        public i(b.a aVar) {
            this.f14104a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f14104a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f14024C != null) {
                appCompatDelegateImpl.f14065r.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f14025D);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f14023B != null) {
                appCompatDelegateImpl2.l0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f14026E = AbstractC1658a0.e(appCompatDelegateImpl3.f14023B).b(0.0f);
                AppCompatDelegateImpl.this.f14026E.g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.e eVar = appCompatDelegateImpl4.f14067t;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f14022A);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f14022A = null;
            AbstractC1658a0.h0(appCompatDelegateImpl5.f14029H);
            AppCompatDelegateImpl.this.e1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f14104a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            AbstractC1658a0.h0(AppCompatDelegateImpl.this.f14029H);
            return this.f14104a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f14104a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static D0.h b(Configuration configuration) {
            return D0.h.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(D0.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.g()));
        }

        static void d(Configuration configuration, D0.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.g()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.p
                public final void onBackInvoked() {
                    appCompatDelegateImpl.F0();
                }
            };
            androidx.appcompat.app.l.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.l.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.k.a(obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class n extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private g f14107h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f14108i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f14109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f14110k;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f14109j = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f14109j = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f14108i = true;
                callback.onContentChanged();
            } finally {
                this.f14108i = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f14110k = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f14110k = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f14109j ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.I0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f14107h = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f14064q, callback);
            androidx.appcompat.view.b bVarR = AppCompatDelegateImpl.this.R(aVar);
            if (bVarR != null) {
                return aVar.e(bVarR);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f14108i) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f14107h;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.L0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f14110k) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                AppCompatDelegateImpl.this.M0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            g gVar = this.f14107h;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            PanelFeatureState panelFeatureStateV0 = AppCompatDelegateImpl.this.v0(0, true);
            if (panelFeatureStateV0 == null || (eVar = panelFeatureStateV0.f14083j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (AppCompatDelegateImpl.this.D0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f14112c;

        o(Context context) {
            super();
            this.f14112c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return j.a(this.f14112c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f14114a;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f14114a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f14064q.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f14114a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f14114a == null) {
                this.f14114a = new a();
            }
            AppCompatDelegateImpl.this.f14064q.registerReceiver(this.f14114a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z f14117c;

        q(z zVar) {
            super();
            this.f14117c = zVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return this.f14117c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.d0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC2619a.b(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z11 = eVarF != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                eVar = eVarF;
            }
            PanelFeatureState panelFeatureStateO0 = appCompatDelegateImpl.o0(eVar);
            if (panelFeatureStateO0 != null) {
                if (!z11) {
                    AppCompatDelegateImpl.this.e0(panelFeatureStateO0, z10);
                } else {
                    AppCompatDelegateImpl.this.a0(panelFeatureStateO0.f14074a, panelFeatureStateO0, eVarF);
                    AppCompatDelegateImpl.this.e0(panelFeatureStateO0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackX0;
            if (eVar != eVar.F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f14034M || (callbackX0 = appCompatDelegateImpl.x0()) == null || AppCompatDelegateImpl.this.f14045X) {
                return true;
            }
            callbackX0.onMenuOpened(108, eVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private boolean A0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(q0());
        panelFeatureState.f14080g = new r(panelFeatureState.f14085l);
        panelFeatureState.f14076c = 81;
        return true;
    }

    private boolean B0(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f14064q;
        int i10 = panelFeatureState.f14074a;
        if ((i10 == 0 || i10 == 108) && this.f14071x != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC2568a.f26732d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC2568a.f26733e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC2568a.f26733e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        panelFeatureState.c(eVar);
        return true;
    }

    private void C0(int i10) {
        this.f14054g0 = (1 << i10) | this.f14054g0;
        if (this.f14053f0) {
            return;
        }
        AbstractC1658a0.c0(this.f14065r.getDecorView(), this.f14055h0);
        this.f14053f0 = true;
    }

    private boolean H0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateV0 = v0(i10, true);
        if (panelFeatureStateV0.f14088o) {
            return false;
        }
        return R0(panelFeatureStateV0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean K0(int i10, KeyEvent keyEvent) {
        boolean zR0;
        AudioManager audioManager;
        G g10;
        if (this.f14022A != null) {
            return false;
        }
        boolean zG = true;
        PanelFeatureState panelFeatureStateV0 = v0(i10, true);
        if (i10 != 0 || (g10 = this.f14071x) == null || !g10.d() || ViewConfiguration.get(this.f14064q).hasPermanentMenuKey()) {
            boolean z10 = panelFeatureStateV0.f14088o;
            if (z10 || panelFeatureStateV0.f14087n) {
                e0(panelFeatureStateV0, true);
                zG = z10;
            } else if (panelFeatureStateV0.f14086m) {
                if (panelFeatureStateV0.f14091r) {
                    panelFeatureStateV0.f14086m = false;
                    zR0 = R0(panelFeatureStateV0, keyEvent);
                } else {
                    zR0 = true;
                }
                if (zR0) {
                    O0(panelFeatureStateV0, keyEvent);
                }
            } else {
                zG = false;
            }
        } else if (this.f14071x.b()) {
            zG = this.f14071x.g();
        } else if (!this.f14045X && R0(panelFeatureStateV0, keyEvent)) {
            zG = this.f14071x.h();
        }
        if (zG && (audioManager = (AudioManager) this.f14064q.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zG;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f14088o || this.f14045X) {
            return;
        }
        if (panelFeatureState.f14074a == 0 && (this.f14064q.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackX0 = x0();
        if (callbackX0 != null && !callbackX0.onMenuOpened(panelFeatureState.f14074a, panelFeatureState.f14083j)) {
            e0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f14064q.getSystemService("window");
        if (windowManager == null || !R0(panelFeatureState, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = panelFeatureState.f14080g;
        if (viewGroup != null && !panelFeatureState.f14090q) {
            View view = panelFeatureState.f14082i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i10 = -1;
            }
            panelFeatureState.f14087n = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f14077d, panelFeatureState.f14078e, 1002, 8519680, -3);
            layoutParams2.gravity = panelFeatureState.f14076c;
            layoutParams2.windowAnimations = panelFeatureState.f14079f;
            windowManager.addView(panelFeatureState.f14080g, layoutParams2);
            panelFeatureState.f14088o = true;
            if (panelFeatureState.f14074a != 0) {
                e1();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (!A0(panelFeatureState) || panelFeatureState.f14080g == null) {
                return;
            }
        } else if (panelFeatureState.f14090q && viewGroup.getChildCount() > 0) {
            panelFeatureState.f14080g.removeAllViews();
        }
        if (!z0(panelFeatureState) || !panelFeatureState.b()) {
            panelFeatureState.f14090q = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f14081h.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        }
        panelFeatureState.f14080g.setBackgroundResource(panelFeatureState.f14075b);
        ViewParent parent = panelFeatureState.f14081h.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(panelFeatureState.f14081h);
        }
        panelFeatureState.f14080g.addView(panelFeatureState.f14081h, layoutParams3);
        if (!panelFeatureState.f14081h.hasFocus()) {
            panelFeatureState.f14081h.requestFocus();
        }
        i10 = -2;
        panelFeatureState.f14087n = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f14077d, panelFeatureState.f14078e, 1002, 8519680, -3);
        layoutParams22.gravity = panelFeatureState.f14076c;
        layoutParams22.windowAnimations = panelFeatureState.f14079f;
        windowManager.addView(panelFeatureState.f14080g, layoutParams22);
        panelFeatureState.f14088o = true;
        if (panelFeatureState.f14074a != 0) {
        }
    }

    private boolean Q0(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f14086m || R0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f14083j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f14071x == null) {
            e0(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private boolean R0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        G g10;
        G g11;
        G g12;
        if (this.f14045X) {
            return false;
        }
        if (panelFeatureState.f14086m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f14041T;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            e0(panelFeatureState2, false);
        }
        Window.Callback callbackX0 = x0();
        if (callbackX0 != null) {
            panelFeatureState.f14082i = callbackX0.onCreatePanelView(panelFeatureState.f14074a);
        }
        int i10 = panelFeatureState.f14074a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (g12 = this.f14071x) != null) {
            g12.c();
        }
        if (panelFeatureState.f14082i == null && (!z10 || !(P0() instanceof x))) {
            androidx.appcompat.view.menu.e eVar = panelFeatureState.f14083j;
            if (eVar == null || panelFeatureState.f14091r) {
                if (eVar == null && (!B0(panelFeatureState) || panelFeatureState.f14083j == null)) {
                    return false;
                }
                if (z10 && this.f14071x != null) {
                    if (this.f14072y == null) {
                        this.f14072y = new h();
                    }
                    this.f14071x.a(panelFeatureState.f14083j, this.f14072y);
                }
                panelFeatureState.f14083j.i0();
                if (!callbackX0.onCreatePanelMenu(panelFeatureState.f14074a, panelFeatureState.f14083j)) {
                    panelFeatureState.c(null);
                    if (z10 && (g10 = this.f14071x) != null) {
                        g10.a(null, this.f14072y);
                    }
                    return false;
                }
                panelFeatureState.f14091r = false;
            }
            panelFeatureState.f14083j.i0();
            Bundle bundle = panelFeatureState.f14092s;
            if (bundle != null) {
                panelFeatureState.f14083j.S(bundle);
                panelFeatureState.f14092s = null;
            }
            if (!callbackX0.onPreparePanel(0, panelFeatureState.f14082i, panelFeatureState.f14083j)) {
                if (z10 && (g11 = this.f14071x) != null) {
                    g11.a(null, this.f14072y);
                }
                panelFeatureState.f14083j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f14089p = z11;
            panelFeatureState.f14083j.setQwertyMode(z11);
            panelFeatureState.f14083j.h0();
        }
        panelFeatureState.f14086m = true;
        panelFeatureState.f14087n = false;
        this.f14041T = panelFeatureState;
        return true;
    }

    private void S0(boolean z10) {
        G g10 = this.f14071x;
        if (g10 == null || !g10.d() || (ViewConfiguration.get(this.f14064q).hasPermanentMenuKey() && !this.f14071x.f())) {
            PanelFeatureState panelFeatureStateV0 = v0(0, true);
            panelFeatureStateV0.f14090q = true;
            e0(panelFeatureStateV0, false);
            O0(panelFeatureStateV0, null);
            return;
        }
        Window.Callback callbackX0 = x0();
        if (this.f14071x.b() && z10) {
            this.f14071x.g();
            if (this.f14045X) {
                return;
            }
            callbackX0.onPanelClosed(108, v0(0, true).f14083j);
            return;
        }
        if (callbackX0 == null || this.f14045X) {
            return;
        }
        if (this.f14053f0 && (this.f14054g0 & 1) != 0) {
            this.f14065r.getDecorView().removeCallbacks(this.f14055h0);
            this.f14055h0.run();
        }
        PanelFeatureState panelFeatureStateV02 = v0(0, true);
        androidx.appcompat.view.menu.e eVar = panelFeatureStateV02.f14083j;
        if (eVar == null || panelFeatureStateV02.f14091r || !callbackX0.onPreparePanel(0, panelFeatureStateV02.f14082i, eVar)) {
            return;
        }
        callbackX0.onMenuOpened(108, panelFeatureStateV02.f14083j);
        this.f14071x.h();
    }

    private int T0(int i10) {
        if (i10 == 8) {
            return 108;
        }
        if (i10 == 9) {
            return 109;
        }
        return i10;
    }

    private boolean U(boolean z10) {
        return V(z10, true);
    }

    private boolean V(boolean z10, boolean z11) {
        if (this.f14045X) {
            return false;
        }
        int iZ = Z();
        int iE0 = E0(this.f14064q, iZ);
        D0.h hVarY = Build.VERSION.SDK_INT < 33 ? Y(this.f14064q) : null;
        if (!z11 && hVarY != null) {
            hVarY = u0(this.f14064q.getResources().getConfiguration());
        }
        boolean zD1 = d1(iE0, hVarY, z10);
        if (iZ == 0) {
            t0(this.f14064q).e();
        } else {
            p pVar = this.f14051d0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iZ == 3) {
            s0(this.f14064q).e();
            return zD1;
        }
        p pVar2 = this.f14052e0;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zD1;
    }

    private void W() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f14029H.findViewById(R.id.content);
        View decorView = this.f14065r.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f14064q.obtainStyledAttributes(AbstractC2577j.f27154y0);
        typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26956K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26961L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26946I0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26946I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26951J0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26951J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26936G0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26936G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26941H0)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC2577j.f26941H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void X(Window window) {
        if (this.f14065r != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f14066s = nVar;
        window.setCallback(nVar);
        f0 f0VarU = f0.u(this.f14064q, null, f14020r0);
        Drawable drawableH = f0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        f0VarU.x();
        this.f14065r = window;
        if (Build.VERSION.SDK_INT < 33 || this.f14061n0 != null) {
            return;
        }
        N(null);
    }

    private boolean X0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f14065r.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Z() {
        int i10 = this.f14047Z;
        return i10 != -100 ? i10 : androidx.appcompat.app.g.o();
    }

    private void a1() {
        if (this.f14028G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d b1() {
        for (Context baseContext = this.f14064q; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void c0() {
        p pVar = this.f14051d0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f14052e0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c1(Configuration configuration) {
        Activity activity = (Activity) this.f14063p;
        if (activity instanceof androidx.lifecycle.r) {
            if (((androidx.lifecycle.r) activity).getLifecycle().b().j(AbstractC1764k.b.f17592i)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f14044W || this.f14045X) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean d1(int i10, D0.h hVar, boolean z10) {
        boolean z11;
        Configuration configurationF0 = f0(this.f14064q, i10, hVar, null, false);
        int iR0 = r0(this.f14064q);
        Configuration configuration = this.f14046Y;
        if (configuration == null) {
            configuration = this.f14064q.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationF0.uiMode & 48;
        D0.h hVarU0 = u0(configuration);
        D0.h hVarU02 = hVar == null ? null : u0(configurationF0);
        int i13 = i11 != i12 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : 0;
        if (hVarU02 != null && !hVarU0.equals(hVarU02)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~iR0) & i13) != 0 && z10 && this.f14043V && (f14021s0 || this.f14044W)) {
            Object obj = this.f14063p;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f14063p).getWindow().getDecorView().setLayoutDirection(configurationF0.getLayoutDirection());
                }
                androidx.core.app.b.q((Activity) this.f14063p);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i13 == 0) {
            z12 = z11;
        } else {
            f1(i12, hVarU02, (i13 & iR0) == i13, null);
        }
        if (z12) {
            Object obj2 = this.f14063p;
            if (obj2 instanceof androidx.appcompat.app.d) {
                if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                    ((androidx.appcompat.app.d) obj2).onNightModeChanged(i10);
                }
                if ((i13 & 4) != 0) {
                    ((androidx.appcompat.app.d) this.f14063p).onLocalesChanged(hVar);
                }
            }
        }
        if (hVarU02 != null) {
            V0(u0(this.f14064q.getResources().getConfiguration()));
        }
        return z12;
    }

    private Configuration f0(Context context, int i10, D0.h hVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            U0(configuration2, hVar);
        }
        return configuration2;
    }

    private void f1(int i10, D0.h hVar, boolean z10, Configuration configuration) {
        Resources resources = this.f14064q.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            U0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            w.a(resources);
        }
        int i11 = this.f14048a0;
        if (i11 != 0) {
            this.f14064q.setTheme(i11);
            this.f14064q.getTheme().applyStyle(this.f14048a0, true);
        }
        if (z10 && (this.f14063p instanceof Activity)) {
            c1(configuration2);
        }
    }

    private ViewGroup g0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f14064q.obtainStyledAttributes(AbstractC2577j.f27154y0);
        if (!typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f26921D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f26966M0, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f26921D0, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f26926E0, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f26931F0, false)) {
            I(10);
        }
        this.f14037P = typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27159z0, false);
        typedArrayObtainStyledAttributes.recycle();
        n0();
        this.f14065r.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f14064q);
        if (this.f14038Q) {
            viewGroup = this.f14036O ? (ViewGroup) layoutInflaterFrom.inflate(AbstractC2574g.f26879o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(AbstractC2574g.f26878n, (ViewGroup) null);
        } else if (this.f14037P) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC2574g.f26870f, (ViewGroup) null);
            this.f14035N = false;
            this.f14034M = false;
        } else if (this.f14034M) {
            TypedValue typedValue = new TypedValue();
            this.f14064q.getTheme().resolveAttribute(AbstractC2568a.f26732d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f14064q, typedValue.resourceId) : this.f14064q).inflate(AbstractC2574g.f26880p, (ViewGroup) null);
            G g10 = (G) viewGroup.findViewById(AbstractC2573f.f26855q);
            this.f14071x = g10;
            g10.setWindowCallback(x0());
            if (this.f14035N) {
                this.f14071x.i(109);
            }
            if (this.f14032K) {
                this.f14071x.i(2);
            }
            if (this.f14033L) {
                this.f14071x.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f14034M + ", windowActionBarOverlay: " + this.f14035N + ", android:windowIsFloating: " + this.f14037P + ", windowActionModeOverlay: " + this.f14036O + ", windowNoTitle: " + this.f14038Q + " }");
        }
        AbstractC1658a0.w0(viewGroup, new b());
        if (this.f14071x == null) {
            this.f14030I = (TextView) viewGroup.findViewById(AbstractC2573f.f26835N);
        }
        q0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC2573f.f26840b);
        ViewGroup viewGroup2 = (ViewGroup) this.f14065r.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f14065r.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void h1(View view) {
        view.setBackgroundColor((AbstractC1658a0.K(view) & 8192) != 0 ? androidx.core.content.a.c(this.f14064q, AbstractC2570c.f26757b) : androidx.core.content.a.c(this.f14064q, AbstractC2570c.f26756a));
    }

    private void m0() {
        if (this.f14028G) {
            return;
        }
        this.f14029H = g0();
        CharSequence charSequenceW0 = w0();
        if (!TextUtils.isEmpty(charSequenceW0)) {
            G g10 = this.f14071x;
            if (g10 != null) {
                g10.setWindowTitle(charSequenceW0);
            } else if (P0() != null) {
                P0().x(charSequenceW0);
            } else {
                TextView textView = this.f14030I;
                if (textView != null) {
                    textView.setText(charSequenceW0);
                }
            }
        }
        W();
        N0(this.f14029H);
        this.f14028G = true;
        PanelFeatureState panelFeatureStateV0 = v0(0, false);
        if (this.f14045X) {
            return;
        }
        if (panelFeatureStateV0 == null || panelFeatureStateV0.f14083j == null) {
            C0(108);
        }
    }

    private void n0() {
        if (this.f14065r == null) {
            Object obj = this.f14063p;
            if (obj instanceof Activity) {
                X(((Activity) obj).getWindow());
            }
        }
        if (this.f14065r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration p0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & JfifUtil.MARKER_SOFn;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & JfifUtil.MARKER_SOFn)) {
                configuration3.screenLayout |= i30 & JfifUtil.MARKER_SOFn;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int r0(Context context) {
        if (!this.f14050c0 && (this.f14063p instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f14063p.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f14049b0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f14049b0 = 0;
            }
        }
        this.f14050c0 = true;
        return this.f14049b0;
    }

    private p s0(Context context) {
        if (this.f14052e0 == null) {
            this.f14052e0 = new o(context);
        }
        return this.f14052e0;
    }

    private p t0(Context context) {
        if (this.f14051d0 == null) {
            this.f14051d0 = new q(z.a(context));
        }
        return this.f14051d0;
    }

    private void y0() {
        m0();
        if (this.f14034M && this.f14068u == null) {
            Object obj = this.f14063p;
            if (obj instanceof Activity) {
                this.f14068u = new A((Activity) this.f14063p, this.f14035N);
            } else if (obj instanceof Dialog) {
                this.f14068u = new A((Dialog) this.f14063p);
            }
            AbstractC1627a abstractC1627a = this.f14068u;
            if (abstractC1627a != null) {
                abstractC1627a.r(this.f14056i0);
            }
        }
    }

    private boolean z0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f14082i;
        if (view != null) {
            panelFeatureState.f14081h = view;
            return true;
        }
        if (panelFeatureState.f14083j == null) {
            return false;
        }
        if (this.f14073z == null) {
            this.f14073z = new s();
        }
        View view2 = (View) panelFeatureState.a(this.f14073z);
        panelFeatureState.f14081h = view2;
        return view2 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A() {
        if (this.f14063p instanceof Activity) {
            androidx.appcompat.app.g.G(this);
        }
        if (this.f14053f0) {
            this.f14065r.getDecorView().removeCallbacks(this.f14055h0);
        }
        this.f14045X = true;
        if (this.f14047Z != -100) {
            Object obj = this.f14063p;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f14018p0.put(this.f14063p.getClass().getName(), Integer.valueOf(this.f14047Z));
            } else {
                f14018p0.remove(this.f14063p.getClass().getName());
            }
        }
        AbstractC1627a abstractC1627a = this.f14068u;
        if (abstractC1627a != null) {
            abstractC1627a.m();
        }
        c0();
    }

    @Override // androidx.appcompat.app.g
    public void B(Bundle bundle) {
        m0();
    }

    @Override // androidx.appcompat.app.g
    public void C() {
        AbstractC1627a abstractC1627aU = u();
        if (abstractC1627aU != null) {
            abstractC1627aU.v(true);
        }
    }

    public boolean D0() {
        return this.f14027F;
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        V(true, false);
    }

    int E0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return t0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return s0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.g
    public void F() {
        AbstractC1627a abstractC1627aU = u();
        if (abstractC1627aU != null) {
            abstractC1627aU.v(false);
        }
    }

    boolean F0() {
        boolean z10 = this.f14042U;
        this.f14042U = false;
        PanelFeatureState panelFeatureStateV0 = v0(0, false);
        if (panelFeatureStateV0 != null && panelFeatureStateV0.f14088o) {
            if (!z10) {
                e0(panelFeatureStateV0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f14022A;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC1627a abstractC1627aU = u();
        return abstractC1627aU != null && abstractC1627aU.g();
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f14042U = (keyEvent.getFlags() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        } else if (i10 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean I(int i10) {
        int iT0 = T0(i10);
        if (this.f14038Q && iT0 == 108) {
            return false;
        }
        if (this.f14034M && iT0 == 1) {
            this.f14034M = false;
        }
        if (iT0 == 1) {
            a1();
            this.f14038Q = true;
            return true;
        }
        if (iT0 == 2) {
            a1();
            this.f14032K = true;
            return true;
        }
        if (iT0 == 5) {
            a1();
            this.f14033L = true;
            return true;
        }
        if (iT0 == 10) {
            a1();
            this.f14036O = true;
            return true;
        }
        if (iT0 == 108) {
            a1();
            this.f14034M = true;
            return true;
        }
        if (iT0 != 109) {
            return this.f14065r.requestFeature(iT0);
        }
        a1();
        this.f14035N = true;
        return true;
    }

    boolean I0(int i10, KeyEvent keyEvent) {
        AbstractC1627a abstractC1627aU = u();
        if (abstractC1627aU != null && abstractC1627aU.n(i10, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f14041T;
        if (panelFeatureState != null && Q0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f14041T;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f14087n = true;
            }
            return true;
        }
        if (this.f14041T == null) {
            PanelFeatureState panelFeatureStateV0 = v0(0, true);
            R0(panelFeatureStateV0, keyEvent);
            boolean zQ0 = Q0(panelFeatureStateV0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateV0.f14086m = false;
            if (zQ0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void J(int i10) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.f14029H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f14064q).inflate(i10, viewGroup);
        this.f14066s.c(this.f14065r.getCallback());
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                K0(0, keyEvent);
                return true;
            }
        } else if (F0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void K(View view) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.f14029H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f14066s.c(this.f14065r.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.f14029H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f14066s.c(this.f14065r.getCallback());
    }

    void L0(int i10) {
        AbstractC1627a abstractC1627aU;
        if (i10 != 108 || (abstractC1627aU = u()) == null) {
            return;
        }
        abstractC1627aU.h(true);
    }

    void M0(int i10) {
        if (i10 == 108) {
            AbstractC1627a abstractC1627aU = u();
            if (abstractC1627aU != null) {
                abstractC1627aU.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            PanelFeatureState panelFeatureStateV0 = v0(i10, true);
            if (panelFeatureStateV0.f14088o) {
                e0(panelFeatureStateV0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.N(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f14061n0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f14062o0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f14062o0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f14063p;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f14061n0 = onBackInvokedDispatcher;
            } else {
                this.f14061n0 = m.a((Activity) this.f14063p);
            }
        }
        e1();
    }

    @Override // androidx.appcompat.app.g
    public void O(Toolbar toolbar) {
        if (this.f14063p instanceof Activity) {
            AbstractC1627a abstractC1627aU = u();
            if (abstractC1627aU instanceof A) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f14069v = null;
            if (abstractC1627aU != null) {
                abstractC1627aU.m();
            }
            this.f14068u = null;
            if (toolbar != null) {
                x xVar = new x(toolbar, w0(), this.f14066s);
                this.f14068u = xVar;
                this.f14066s.e(xVar.f14170c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f14066s.e(null);
            }
            w();
        }
    }

    @Override // androidx.appcompat.app.g
    public void P(int i10) {
        this.f14048a0 = i10;
    }

    final AbstractC1627a P0() {
        return this.f14068u;
    }

    @Override // androidx.appcompat.app.g
    public final void Q(CharSequence charSequence) {
        this.f14070w = charSequence;
        G g10 = this.f14071x;
        if (g10 != null) {
            g10.setWindowTitle(charSequence);
            return;
        }
        if (P0() != null) {
            P0().x(charSequence);
            return;
        }
        TextView textView = this.f14030I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b R(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f14022A;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        AbstractC1627a abstractC1627aU = u();
        if (abstractC1627aU != null) {
            androidx.appcompat.view.b bVarY = abstractC1627aU.y(iVar);
            this.f14022A = bVarY;
            if (bVarY != null && (eVar = this.f14067t) != null) {
                eVar.onSupportActionModeStarted(bVarY);
            }
        }
        if (this.f14022A == null) {
            this.f14022A = Z0(iVar);
        }
        e1();
        return this.f14022A;
    }

    void U0(Configuration configuration, D0.h hVar) {
        k.d(configuration, hVar);
    }

    void V0(D0.h hVar) {
        k.c(hVar);
    }

    final boolean W0() {
        ViewGroup viewGroup;
        return this.f14028G && (viewGroup = this.f14029H) != null && viewGroup.isLaidOut();
    }

    D0.h Y(Context context) {
        D0.h hVarT;
        if (Build.VERSION.SDK_INT >= 33 || (hVarT = androidx.appcompat.app.g.t()) == null) {
            return null;
        }
        D0.h hVarU0 = u0(context.getApplicationContext().getResources().getConfiguration());
        D0.h hVarB = v.b(hVarT, hVarU0);
        return hVarB.e() ? hVarU0 : hVarB;
    }

    boolean Y0() {
        if (this.f14061n0 == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateV0 = v0(0, false);
        return (panelFeatureStateV0 != null && panelFeatureStateV0.f14088o) || this.f14022A != null;
    }

    androidx.appcompat.view.b Z0(b.a aVar) {
        androidx.appcompat.view.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.e eVar;
        l0();
        androidx.appcompat.view.b bVar = this.f14022A;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f14067t;
        if (eVar2 == null || this.f14045X) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = eVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                bVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f14022A = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f14023B == null) {
                if (this.f14037P) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f14064q.getTheme();
                    theme.resolveAttribute(AbstractC2568a.f26732d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f14064q.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f14064q, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f14064q;
                    }
                    this.f14023B = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, AbstractC2568a.f26734f);
                    this.f14024C = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.f14024C.setContentView(this.f14023B);
                    this.f14024C.setWidth(-1);
                    dVar.getTheme().resolveAttribute(AbstractC2568a.f26730b, typedValue, true);
                    this.f14023B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f14024C.setHeight(-2);
                    this.f14025D = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f14029H.findViewById(AbstractC2573f.f26847i);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(q0()));
                        this.f14023B = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f14023B != null) {
                l0();
                this.f14023B.k();
                androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f14023B.getContext(), this.f14023B, aVar, this.f14024C == null);
                if (aVar.b(eVar3, eVar3.e())) {
                    eVar3.k();
                    this.f14023B.h(eVar3);
                    this.f14022A = eVar3;
                    if (W0()) {
                        this.f14023B.setAlpha(0.0f);
                        C1678k0 c1678k0B = AbstractC1658a0.e(this.f14023B).b(1.0f);
                        this.f14026E = c1678k0B;
                        c1678k0B.g(new e());
                    } else {
                        this.f14023B.setAlpha(1.0f);
                        this.f14023B.setVisibility(0);
                        if (this.f14023B.getParent() instanceof View) {
                            AbstractC1658a0.h0((View) this.f14023B.getParent());
                        }
                    }
                    if (this.f14024C != null) {
                        this.f14065r.getDecorView().post(this.f14025D);
                    }
                } else {
                    this.f14022A = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f14022A;
        if (bVar2 != null && (eVar = this.f14067t) != null) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        e1();
        return this.f14022A;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateO0;
        Window.Callback callbackX0 = x0();
        if (callbackX0 == null || this.f14045X || (panelFeatureStateO0 = o0(eVar.F())) == null) {
            return false;
        }
        return callbackX0.onMenuItemSelected(panelFeatureStateO0.f14074a, menuItem);
    }

    void a0(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f14040S;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f14083j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f14088o) && !this.f14045X) {
            this.f14066s.d(this.f14065r.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        S0(true);
    }

    void b0(androidx.appcompat.view.menu.e eVar) {
        if (this.f14039R) {
            return;
        }
        this.f14039R = true;
        this.f14071x.j();
        Window.Callback callbackX0 = x0();
        if (callbackX0 != null && !this.f14045X) {
            callbackX0.onPanelClosed(108, eVar);
        }
        this.f14039R = false;
    }

    void d0(int i10) {
        e0(v0(i10, true), true);
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ((ViewGroup) this.f14029H.findViewById(R.id.content)).addView(view, layoutParams);
        this.f14066s.c(this.f14065r.getCallback());
    }

    void e0(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        G g10;
        if (z10 && panelFeatureState.f14074a == 0 && (g10 = this.f14071x) != null && g10.b()) {
            b0(panelFeatureState.f14083j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f14064q.getSystemService("window");
        if (windowManager != null && panelFeatureState.f14088o && (viewGroup = panelFeatureState.f14080g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                a0(panelFeatureState.f14074a, panelFeatureState, null);
            }
        }
        panelFeatureState.f14086m = false;
        panelFeatureState.f14087n = false;
        panelFeatureState.f14088o = false;
        panelFeatureState.f14081h = null;
        panelFeatureState.f14090q = true;
        if (this.f14041T == panelFeatureState) {
            this.f14041T = null;
        }
        if (panelFeatureState.f14074a == 0) {
            e1();
        }
    }

    void e1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zY0 = Y0();
            if (zY0 && this.f14062o0 == null) {
                this.f14062o0 = m.b(this.f14061n0, this);
            } else {
                if (zY0 || (onBackInvokedCallback = this.f14062o0) == null) {
                    return;
                }
                m.c(this.f14061n0, onBackInvokedCallback);
                this.f14062o0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean f() {
        return U(true);
    }

    final int g1(L0 l02, Rect rect) {
        boolean z10;
        boolean z11;
        int iM = l02 != null ? l02.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f14023B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14023B.getLayoutParams();
            if (this.f14023B.isShown()) {
                if (this.f14057j0 == null) {
                    this.f14057j0 = new Rect();
                    this.f14058k0 = new Rect();
                }
                Rect rect2 = this.f14057j0;
                Rect rect3 = this.f14058k0;
                if (l02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(l02.k(), l02.m(), l02.l(), l02.j());
                }
                q0.a(this.f14029H, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                L0 l0F = AbstractC1658a0.F(this.f14029H);
                int iK = l0F == null ? 0 : l0F.k();
                int iL = l0F == null ? 0 : l0F.l();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f14031J != null) {
                    View view = this.f14031J;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.f14031J.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f14064q);
                    this.f14031J = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.f14029H.addView(this.f14031J, -1, layoutParams);
                }
                View view3 = this.f14031J;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    h1(this.f14031J);
                }
                if (!this.f14036O && z) {
                    iM = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f14023B.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f14031J;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View h0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f14059l0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f14064q.obtainStyledAttributes(AbstractC2577j.f27154y0);
            String string = typedArrayObtainStyledAttributes.getString(AbstractC2577j.f26916C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f14059l0 = new androidx.appcompat.app.s();
            } else {
                try {
                    this.f14059l0 = (androidx.appcompat.app.s) this.f14064q.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f14059l0 = new androidx.appcompat.app.s();
                }
            }
        }
        boolean z11 = f14019q0;
        boolean zX0 = false;
        if (z11) {
            if (this.f14060m0 == null) {
                this.f14060m0 = new u();
            }
            if (this.f14060m0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zX0 = X0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zX0 = true;
                }
                z10 = zX0;
            }
        } else {
            z10 = zX0;
        }
        return this.f14059l0.r(view, str, context, attributeSet, z10, z11, true, p0.c());
    }

    @Override // androidx.appcompat.app.g
    public Context i(Context context) {
        Context context2;
        this.f14043V = true;
        int iE0 = E0(context, Z());
        if (androidx.appcompat.app.g.x(context)) {
            androidx.appcompat.app.g.T(context);
        }
        D0.h hVarY = Y(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(f0(context2, iE0, hVarY, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(f0(context2, iE0, hVarY, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f14021s0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationF0 = f0(context2, iE0, hVarY, !configuration2.equals(configuration3) ? p0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, AbstractC2576i.f26902d);
        dVar.a(configurationF0);
        try {
            if (context2.getTheme() != null) {
                AbstractC3461h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void i0() {
        androidx.appcompat.view.menu.e eVar;
        G g10 = this.f14071x;
        if (g10 != null) {
            g10.j();
        }
        if (this.f14024C != null) {
            this.f14065r.getDecorView().removeCallbacks(this.f14025D);
            if (this.f14024C.isShowing()) {
                try {
                    this.f14024C.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f14024C = null;
        }
        l0();
        PanelFeatureState panelFeatureStateV0 = v0(0, false);
        if (panelFeatureStateV0 == null || (eVar = panelFeatureStateV0.f14083j) == null) {
            return;
        }
        eVar.close();
    }

    boolean j0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f14063p;
        if (((obj instanceof AbstractC1694t.a) || (obj instanceof androidx.appcompat.app.r)) && (decorView = this.f14065r.getDecorView()) != null && AbstractC1694t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f14066s.b(this.f14065r.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? G0(keyCode, keyEvent) : J0(keyCode, keyEvent);
    }

    void k0(int i10) {
        PanelFeatureState panelFeatureStateV0;
        PanelFeatureState panelFeatureStateV02 = v0(i10, true);
        if (panelFeatureStateV02.f14083j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateV02.f14083j.U(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateV02.f14092s = bundle;
            }
            panelFeatureStateV02.f14083j.i0();
            panelFeatureStateV02.f14083j.clear();
        }
        panelFeatureStateV02.f14091r = true;
        panelFeatureStateV02.f14090q = true;
        if ((i10 != 108 && i10 != 0) || this.f14071x == null || (panelFeatureStateV0 = v0(0, false)) == null) {
            return;
        }
        panelFeatureStateV0.f14086m = false;
        R0(panelFeatureStateV0, null);
    }

    @Override // androidx.appcompat.app.g
    public View l(int i10) {
        m0();
        return this.f14065r.findViewById(i10);
    }

    void l0() {
        C1678k0 c1678k0 = this.f14026E;
        if (c1678k0 != null) {
            c1678k0.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public Context n() {
        return this.f14064q;
    }

    PanelFeatureState o0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f14040S;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f14083j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return h0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public final androidx.appcompat.app.b p() {
        return new f();
    }

    @Override // androidx.appcompat.app.g
    public int q() {
        return this.f14047Z;
    }

    final Context q0() {
        AbstractC1627a abstractC1627aU = u();
        Context contextJ = abstractC1627aU != null ? abstractC1627aU.j() : null;
        return contextJ == null ? this.f14064q : contextJ;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater s() {
        if (this.f14069v == null) {
            y0();
            AbstractC1627a abstractC1627a = this.f14068u;
            this.f14069v = new androidx.appcompat.view.g(abstractC1627a != null ? abstractC1627a.j() : this.f14064q);
        }
        return this.f14069v;
    }

    @Override // androidx.appcompat.app.g
    public AbstractC1627a u() {
        y0();
        return this.f14068u;
    }

    D0.h u0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.g
    public void v() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f14064q);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC1696u.a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    protected PanelFeatureState v0(int i10, boolean z10) {
        PanelFeatureState[] panelFeatureStateArr = this.f14040S;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f14040S = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.g
    public void w() {
        if (P0() == null || u().k()) {
            return;
        }
        C0(0);
    }

    final CharSequence w0() {
        Object obj = this.f14063p;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f14070w;
    }

    final Window.Callback x0() {
        return this.f14065r.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void y(Configuration configuration) {
        AbstractC1627a abstractC1627aU;
        if (this.f14034M && this.f14028G && (abstractC1627aU = u()) != null) {
            abstractC1627aU.l(configuration);
        }
        C1637j.b().g(this.f14064q);
        this.f14046Y = new Configuration(this.f14064q.getResources().getConfiguration());
        V(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void z(Bundle bundle) {
        String strC;
        this.f14043V = true;
        U(false);
        n0();
        Object obj = this.f14063p;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC1627a abstractC1627aP0 = P0();
                if (abstractC1627aP0 == null) {
                    this.f14056i0 = true;
                } else {
                    abstractC1627aP0.r(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f14046Y = new Configuration(this.f14064q.getResources().getConfiguration());
        this.f14044W = true;
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d dVarB1;
        this.f14026E = null;
        this.f14027F = true;
        this.f14047Z = -100;
        this.f14055h0 = new a();
        this.f14064q = context;
        this.f14067t = eVar;
        this.f14063p = obj;
        if (this.f14047Z == -100 && (obj instanceof Dialog) && (dVarB1 = b1()) != null) {
            this.f14047Z = dVarB1.getDelegate().q();
        }
        if (this.f14047Z == -100) {
            m0.i iVar = f14018p0;
            Integer num = (Integer) iVar.get(obj.getClass().getName());
            if (num != null) {
                this.f14047Z = num.intValue();
                iVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            X(window);
        }
        C1637j.h();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.i0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.g
    public void D(Bundle bundle) {
    }

    void N0(ViewGroup viewGroup) {
    }
}
