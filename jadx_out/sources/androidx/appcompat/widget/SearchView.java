package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.customview.view.AbsSavedState;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2568a;
import f.AbstractC2571d;
import f.AbstractC2573f;
import f.AbstractC2574g;
import f.AbstractC2575h;
import f.AbstractC2577j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends Q implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    static final o f14755v0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final ImageView f14756A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final ImageView f14757B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final ImageView f14758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final View f14759D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p f14760E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Rect f14761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Rect f14762G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f14763H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int[] f14764I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final ImageView f14765J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Drawable f14766K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f14767L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f14768M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Intent f14769N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Intent f14770O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final CharSequence f14771P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private m f14772Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private l f14773R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    View.OnFocusChangeListener f14774S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View.OnClickListener f14775T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f14776U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f14777V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    K0.a f14778W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f14779a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f14780b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f14781c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f14782d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f14783e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f14784f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private CharSequence f14785g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private CharSequence f14786h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f14787i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f14788j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    SearchableInfo f14789k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Bundle f14790l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Runnable f14791m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Runnable f14792n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final WeakHashMap f14793o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final View.OnClickListener f14794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    View.OnKeyListener f14795q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f14796r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f14797s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f14798t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private TextWatcher f14799u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final SearchAutoComplete f14800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View f14801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f14802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final View f14803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ImageView f14804z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f14805i;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f14805i + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f14805i));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14805i = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class SearchAutoComplete extends C1630c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f14806k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private SearchView f14807l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f14808m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f14809n;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC2568a.f26741m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return JfifUtil.MARKER_SOFn;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return JfifUtil.MARKER_SOFn;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f14755v0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f14808m) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f14808m = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f14806k <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1630c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f14808m) {
                removeCallbacks(this.f14809n);
                post(this.f14809n);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f14807l.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f14807l.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f14807l.hasFocus() && getVisibility() == 0) {
                this.f14808m = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f14808m = false;
                removeCallbacks(this.f14809n);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f14808m = true;
                    return;
                }
                this.f14808m = false;
                removeCallbacks(this.f14809n);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f14807l = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f14806k = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f14809n = new a();
            this.f14806k = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K0.a aVar = SearchView.this.f14778W;
            if (aVar instanceof Z) {
                aVar.a(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f14774S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f14804z) {
                searchView.T();
                return;
            }
            if (view == searchView.f14757B) {
                searchView.P();
                return;
            }
            if (view == searchView.f14756A) {
                searchView.U();
            } else if (view == searchView.f14758C) {
                searchView.Y();
            } else if (view == searchView.f14800v) {
                searchView.F();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f14789k0 == null) {
                return false;
            }
            if (searchView.f14800v.isPopupShowing() && SearchView.this.f14800v.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f14800v.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f14800v.getText().toString());
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface l {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface n {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f14821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f14822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f14823c;

        o() {
            this.f14821a = null;
            this.f14822b = null;
            this.f14823c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f14821a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f14822b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f14823c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14822b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14821a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14823c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f14825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f14826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f14827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f14828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f14829f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f14828e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f14825b = new Rect();
            this.f14827d = new Rect();
            this.f14826c = new Rect();
            a(rect, rect2);
            this.f14824a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f14825b.set(rect);
            this.f14827d.set(rect);
            Rect rect3 = this.f14827d;
            int i10 = this.f14828e;
            rect3.inset(-i10, -i10);
            this.f14826c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f14829f;
                    if (z11 && !this.f14827d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f14829f;
                        this.f14829f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f14825b.contains(x10, y10)) {
                this.f14829f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f14826c.contains(x10, y10)) {
                Rect rect = this.f14826c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f14824a.getWidth() / 2, this.f14824a.getHeight() / 2);
            }
            return this.f14824a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f14755v0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f14786h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f14790l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f14789k0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        String strN;
        try {
            try {
                String strN2 = Z.n(cursor, "suggest_intent_action");
                if (strN2 == null) {
                    strN2 = this.f14789k0.getSuggestIntentAction();
                }
                if (strN2 == null) {
                    strN2 = "android.intent.action.SEARCH";
                }
                String str2 = strN2;
                String strN3 = Z.n(cursor, "suggest_intent_data");
                if (strN3 == null) {
                    strN3 = this.f14789k0.getSuggestIntentData();
                }
                if (strN3 != null && (strN = Z.n(cursor, "suggest_intent_data_id")) != null) {
                    strN3 = strN3 + "/" + Uri.encode(strN);
                }
                return A(str2, strN3 == null ? null : Uri.parse(strN3), Z.n(cursor, "suggest_intent_extra_data"), Z.n(cursor, "suggest_intent_query"), i10, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f14790l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f14800v.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.f14763H);
        getLocationInWindow(this.f14764I);
        int[] iArr = this.f14763H;
        int i10 = iArr[1];
        int[] iArr2 = this.f14764I;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f14776U || this.f14766K == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f14800v.getTextSize()) * 1.25d);
        this.f14766K.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f14766K), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f14789k0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f14789k0.getVoiceSearchLaunchWebSearch() ? this.f14769N : this.f14789k0.getVoiceSearchLaunchRecognizer() ? this.f14770O : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f14779a0 || this.f14784f0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            intent.toString();
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor cursorB = this.f14778W.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorB, i11, str));
        return true;
    }

    private void Z() {
        post(this.f14791m0);
    }

    private void a0(int i10) {
        Editable text = this.f14800v.getText();
        Cursor cursorB = this.f14778W.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f14778W.convertToString(cursorB);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f14800v.getText());
        this.f14757B.setVisibility(!zIsEmpty || (this.f14776U && !this.f14787i0) ? 0 : 8);
        Drawable drawable = this.f14757B.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f14800v;
        if (queryHint == null) {
            queryHint = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f14800v.setThreshold(this.f14789k0.getSuggestThreshold());
        this.f14800v.setImeOptions(this.f14789k0.getImeOptions());
        int inputType = this.f14789k0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f14789k0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f14800v.setInputType(inputType);
        K0.a aVar = this.f14778W;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f14789k0.getSuggestAuthority() != null) {
            Z z10 = new Z(getContext(), this, this.f14789k0, this.f14793o0);
            this.f14778W = z10;
            this.f14800v.setAdapter(z10);
            ((Z) this.f14778W).w(this.f14781c0 ? 2 : 1);
        }
    }

    private void g0() {
        this.f14803y.setVisibility((L() && (this.f14756A.getVisibility() == 0 || this.f14758C.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC2571d.f26768e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC2571d.f26769f);
    }

    private void h0(boolean z10) {
        this.f14756A.setVisibility((this.f14779a0 && L() && hasFocus() && (z10 || !this.f14784f0)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.f14777V = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f14800v.getText());
        this.f14804z.setVisibility(i11);
        h0(!zIsEmpty);
        this.f14801w.setVisibility(z10 ? 8 : 0);
        if (this.f14765J.getDrawable() != null && !this.f14776U) {
            i10 = 0;
        }
        this.f14765J.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f14784f0 && !J() && z10) {
            this.f14756A.setVisibility(8);
            i10 = 0;
        }
        this.f14758C.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f14800v.setText(charSequence);
        this.f14800v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f14800v);
            return;
        }
        o oVar = f14755v0;
        oVar.b(this.f14800v);
        oVar.a(this.f14800v);
    }

    public boolean J() {
        return this.f14777V;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f14800v.getText())) {
            this.f14800v.setText(PointerEventHelper.POINTER_TYPE_UNKNOWN);
            this.f14800v.requestFocus();
            this.f14800v.setImeVisibility(true);
        } else if (this.f14776U) {
            l lVar = this.f14773R;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f14800v.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i10) {
        a0(i10);
        return true;
    }

    protected void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f14800v.requestFocus();
        this.f14800v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f14775T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f14800v.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f14772Q;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f14789k0 != null) {
                N(0, null, text.toString());
            }
            this.f14800v.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f14789k0 != null && this.f14778W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f14800v.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f14800v.setSelection(i10 == 21 ? 0 : this.f14800v.length());
                this.f14800v.setListSelection(0);
                this.f14800v.clearListSelection();
                this.f14800v.b();
                return true;
            }
            if (i10 == 19) {
                this.f14800v.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f14800v.getText();
        this.f14786h0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        if (this.f14772Q != null && !TextUtils.equals(charSequence, this.f14785g0)) {
            this.f14772Q.a(charSequence.toString());
        }
        this.f14785g0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f14800v.hasFocus()) {
            F();
        }
    }

    void Y() {
        SearchableInfo searchableInfo = this.f14789k0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.f14769N, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.f14770O, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f14800v.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f14800v;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f14786h0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f14782d0 = true;
        super.clearFocus();
        this.f14800v.clearFocus();
        this.f14800v.setImeVisibility(false);
        this.f14782d0 = false;
    }

    void d0() {
        int[] iArr = this.f14800v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f14802x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f14803y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f14800v.getImeOptions();
    }

    public int getInputType() {
        return this.f14800v.getInputType();
    }

    public int getMaxWidth() {
        return this.f14783e0;
    }

    public CharSequence getQuery() {
        return this.f14800v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f14780b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f14789k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f14771P : getContext().getText(this.f14789k0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f14768M;
    }

    int getSuggestionRowLayout() {
        return this.f14767L;
    }

    public K0.a getSuggestionsAdapter() {
        return this.f14778W;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        b0(PointerEventHelper.POINTER_TYPE_UNKNOWN, false);
        clearFocus();
        i0(true);
        this.f14800v.setImeOptions(this.f14788j0);
        this.f14787i0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f14787i0) {
            return;
        }
        this.f14787i0 = true;
        int imeOptions = this.f14800v.getImeOptions();
        this.f14788j0 = imeOptions;
        this.f14800v.setImeOptions(imeOptions | 33554432);
        this.f14800v.setText(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f14791m0);
        post(this.f14792n0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f14800v, this.f14761F);
            Rect rect = this.f14762G;
            Rect rect2 = this.f14761F;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f14760E;
            if (pVar != null) {
                pVar.a(this.f14762G, this.f14761F);
                return;
            }
            p pVar2 = new p(this.f14762G, this.f14761F, this.f14800v);
            this.f14760E = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.Q, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f14783e0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f14783e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f14783e0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        i0(savedState.f14805i);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14805i = J();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f14782d0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f14800v.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f14790l0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f14776U == z10) {
            return;
        }
        this.f14776U = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f14800v.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f14800v.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f14783e0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f14773R = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f14774S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f14772Q = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f14775T = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f14780b0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f14781c0 = z10;
        K0.a aVar = this.f14778W;
        if (aVar instanceof Z) {
            ((Z) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f14789k0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.f14784f0 = zI;
        if (zI) {
            this.f14800v.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f14779a0 = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(K0.a aVar) {
        this.f14778W = aVar;
        this.f14800v.setAdapter(aVar);
    }

    void z() {
        if (this.f14759D.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f14802x.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = q0.b(this);
            int dimensionPixelSize = this.f14776U ? resources.getDimensionPixelSize(AbstractC2571d.f26766c) + resources.getDimensionPixelSize(AbstractC2571d.f26767d) : 0;
            this.f14800v.getDropDownBackground().getPadding(rect);
            this.f14800v.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f14800v.setDropDownWidth((((this.f14759D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26721H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14761F = new Rect();
        this.f14762G = new Rect();
        this.f14763H = new int[2];
        this.f14764I = new int[2];
        this.f14791m0 = new b();
        this.f14792n0 = new c();
        this.f14793o0 = new WeakHashMap();
        f fVar = new f();
        this.f14794p0 = fVar;
        this.f14795q0 = new g();
        h hVar = new h();
        this.f14796r0 = hVar;
        i iVar = new i();
        this.f14797s0 = iVar;
        j jVar = new j();
        this.f14798t0 = jVar;
        this.f14799u0 = new a();
        f0 f0VarV = f0.v(context, attributeSet, AbstractC2577j.f27061f2, i10, 0);
        AbstractC1658a0.i0(this, context, AbstractC2577j.f27061f2, attributeSet, f0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(f0VarV.n(AbstractC2577j.f27111p2, AbstractC2574g.f26882r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC2573f.f26826E);
        this.f14800v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f14801w = findViewById(AbstractC2573f.f26822A);
        View viewFindViewById = findViewById(AbstractC2573f.f26825D);
        this.f14802x = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC2573f.f26832K);
        this.f14803y = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC2573f.f26863y);
        this.f14804z = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC2573f.f26823B);
        this.f14756A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC2573f.f26864z);
        this.f14757B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC2573f.f26827F);
        this.f14758C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC2573f.f26824C);
        this.f14765J = imageView5;
        AbstractC1658a0.o0(viewFindViewById, f0VarV.g(AbstractC2577j.f27116q2));
        AbstractC1658a0.o0(viewFindViewById2, f0VarV.g(AbstractC2577j.f27136u2));
        imageView.setImageDrawable(f0VarV.g(AbstractC2577j.f27131t2));
        imageView2.setImageDrawable(f0VarV.g(AbstractC2577j.f27101n2));
        imageView3.setImageDrawable(f0VarV.g(AbstractC2577j.f27086k2));
        imageView4.setImageDrawable(f0VarV.g(AbstractC2577j.f27146w2));
        imageView5.setImageDrawable(f0VarV.g(AbstractC2577j.f27131t2));
        this.f14766K = f0VarV.g(AbstractC2577j.f27126s2);
        k0.a(imageView, getResources().getString(AbstractC2575h.f26898n));
        this.f14767L = f0VarV.n(AbstractC2577j.f27141v2, AbstractC2574g.f26881q);
        this.f14768M = f0VarV.n(AbstractC2577j.f27091l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f14799u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f14795q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(f0VarV.a(AbstractC2577j.f27106o2, true));
        int iF = f0VarV.f(AbstractC2577j.f27071h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f14771P = f0VarV.p(AbstractC2577j.f27096m2);
        this.f14780b0 = f0VarV.p(AbstractC2577j.f27121r2);
        int iK = f0VarV.k(AbstractC2577j.f27081j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = f0VarV.k(AbstractC2577j.f27076i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(f0VarV.a(AbstractC2577j.f27066g2, true));
        f0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f14769N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f14770O = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f14759D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f14776U);
        e0();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
