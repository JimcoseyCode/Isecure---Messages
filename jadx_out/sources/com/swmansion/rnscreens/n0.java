package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.d0;
import i7.C2735B;
import i7.C2750m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends ReactViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f25294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f25295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f25296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f25297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f25298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f25299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f25300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o0 f25304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f25306s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f25307g = new a("NONE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f25308h = new a("WORDS", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f25309i = new a("SENTENCES", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f25310j = new a("CHARACTERS", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ a[] f25311k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25312l;

        static {
            a[] aVarArrH = h();
            f25311k = aVarArrH;
            f25312l = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f25307g, f25308h, f25309i, f25310j};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25311k.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f25313g = new d("TEXT", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f25314h = new c("PHONE", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f25315i = new C0242b("NUMBER", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f25316j = new a("EMAIL", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ b[] f25317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25318l;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int j(a capitalize) {
                AbstractC2855l.g(capitalize, "capitalize");
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.n0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0242b extends b {
            C0242b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int j(a capitalize) {
                AbstractC2855l.g(capitalize, "capitalize");
                return 2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int j(a capitalize) {
                AbstractC2855l.g(capitalize, "capitalize");
                return 3;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class d extends b {

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25319a;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.f25307g.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.f25308h.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.f25309i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.f25310j.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f25319a = iArr;
                }
            }

            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int j(a capitalize) {
                AbstractC2855l.g(capitalize, "capitalize");
                int i10 = a.f25319a[capitalize.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new C2750m();
            }
        }

        static {
            b[] bVarArrH = h();
            f25317k = bVarArrH;
            f25318l = AbstractC3083a.a(bVarArrH);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f25313g, f25314h, f25315i, f25316j};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25317k.clone();
        }

        public abstract int j(a aVar);

        private b(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements SearchView.m {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            n0.this.q(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            n0.this.r(str);
            return true;
        }
    }

    public n0(ReactContext reactContext) {
        super(reactContext);
        this.f25294g = b.f25313g;
        this.f25295h = a.f25307g;
        this.f25300m = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.f25301n = true;
        this.f25303p = true;
        this.f25306s = UIManagerHelper.getSurfaceId(this);
    }

    private final a0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof d0) {
            return ((d0) parent).getConfig();
        }
        return null;
    }

    private final X getScreenStackFragment() {
        a0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void l() {
        v(new M6.o(this.f25306s, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void m(boolean z10) {
        v(z10 ? new M6.p(this.f25306s, getId()) : new M6.m(this.f25306s, getId()));
    }

    private final void o() {
        v(new M6.q(this.f25306s, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(String str) {
        v(new M6.n(this.f25306s, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String str) {
        v(new M6.r(this.f25306s, getId(), str));
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.k0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                n0.w(this.f25289a, view, z10);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.l0
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return n0.x(this.f25291a);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.y(this.f25293g, view);
            }
        });
    }

    private final void setToolbarElementsVisibility(int i10) {
        int i11 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            a0 headerConfig = getHeaderConfig();
            d0 d0VarG = headerConfig != null ? headerConfig.g(i11) : null;
            if ((d0VarG != null ? d0VarG.getType() : null) != d0.a.f25104k && d0VarG != null) {
                d0VarG.setVisibility(i10);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B t(n0 n0Var, C2291d newSearchView) {
        X screenStackFragment;
        C2291d searchView;
        AbstractC2855l.g(newSearchView, "newSearchView");
        if (n0Var.f25304q == null) {
            n0Var.f25304q = new o0(newSearchView);
        }
        n0Var.z();
        if (n0Var.f25302o && (screenStackFragment = n0Var.getScreenStackFragment()) != null && (searchView = screenStackFragment.getSearchView()) != null) {
            searchView.q0();
        }
        return C2735B.f28704a;
    }

    private final void v(Event event) {
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(n0 n0Var, View view, boolean z10) {
        n0Var.m(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(n0 n0Var) {
        n0Var.l();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(n0 n0Var, View view) {
        n0Var.o();
    }

    private final void z() {
        X screenStackFragment = getScreenStackFragment();
        C2291d searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.f25305r) {
                setSearchViewListeners(searchView);
                this.f25305r = true;
            }
            searchView.setInputType(this.f25294g.j(this.f25295h));
            o0 o0Var = this.f25304q;
            if (o0Var != null) {
                o0Var.h(this.f25296i);
            }
            o0 o0Var2 = this.f25304q;
            if (o0Var2 != null) {
                o0Var2.i(this.f25297j);
            }
            o0 o0Var3 = this.f25304q;
            if (o0Var3 != null) {
                o0Var3.e(this.f25298k);
            }
            o0 o0Var4 = this.f25304q;
            if (o0Var4 != null) {
                o0Var4.f(this.f25299l);
            }
            o0 o0Var5 = this.f25304q;
            if (o0Var5 != null) {
                o0Var5.g(this.f25300m, this.f25303p);
            }
            searchView.setOverrideBackAction(this.f25301n);
        }
    }

    public final a getAutoCapitalize() {
        return this.f25295h;
    }

    public final boolean getAutoFocus() {
        return this.f25302o;
    }

    public final Integer getHeaderIconColor() {
        return this.f25298k;
    }

    public final Integer getHintTextColor() {
        return this.f25299l;
    }

    public final b getInputType() {
        return this.f25294g;
    }

    public final String getPlaceholder() {
        return this.f25300m;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f25301n;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f25303p;
    }

    public final Integer getTextColor() {
        return this.f25296i;
    }

    public final Integer getTintColor() {
        return this.f25297j;
    }

    public final void i() {
        C2291d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void j() {
        C2291d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.o0();
    }

    public final void k() {
        C2291d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.p0();
    }

    public final void n() {
        C2291d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.q0();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.n0(new Function1() { // from class: com.swmansion.rnscreens.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.t(this.f25282g, (C2291d) obj);
                }
            });
        }
    }

    public final void p(String str) {
        X screenStackFragment;
        C2291d searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void setAutoCapitalize(a aVar) {
        AbstractC2855l.g(aVar, "<set-?>");
        this.f25295h = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f25302o = z10;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f25298k = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f25299l = num;
    }

    public final void setInputType(b bVar) {
        AbstractC2855l.g(bVar, "<set-?>");
        this.f25294g = bVar;
    }

    public final void setPlaceholder(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.f25300m = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f25301n = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f25303p = z10;
    }

    public final void setTextColor(Integer num) {
        this.f25296i = num;
    }

    public final void setTintColor(Integer num) {
        this.f25297j = num;
    }

    public final void u() {
        z();
    }

    public final void s(boolean z10) {
    }
}
