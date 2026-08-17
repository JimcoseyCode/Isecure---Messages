package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import f.AbstractC2568a;
import f.AbstractC2574g;
import f.AbstractC2577j;
import g.AbstractC2619a;
import k.InterfaceC2820e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f14598o = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1631d f14599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f14600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P f14601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SpinnerAdapter f14602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f14603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f14604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f14605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Rect f14606n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f14607g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f14607g ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f14607g = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends P {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f f14608p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f14608p = fVar;
        }

        @Override // androidx.appcompat.widget.P
        public InterfaceC2820e b() {
            return this.f14608p;
        }

        @Override // androidx.appcompat.widget.P
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (H0.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private SpinnerAdapter f14615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ListAdapter f14616h;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f14615g = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f14616h = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f14616h;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f14616h;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f14615g;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends S implements g {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private CharSequence f14617O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        ListAdapter f14618P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private final Rect f14619Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private int f14620R;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f14622g;

            a(AppCompatSpinner appCompatSpinner) {
                this.f14622g = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f14618P.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.T(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.R();
                    f.super.show();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f14625g;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f14625g = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f14625g);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f14619Q = new Rect();
            B(AppCompatSpinner.this);
            H(true);
            N(0);
            J(new a(AppCompatSpinner.this));
        }

        void R() {
            int i10;
            Drawable drawableI = i();
            if (drawableI != null) {
                drawableI.getPadding(AppCompatSpinner.this.f14606n);
                i10 = q0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f14606n.right : -AppCompatSpinner.this.f14606n.left;
            } else {
                Rect rect = AppCompatSpinner.this.f14606n;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f14605m;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.f14618P, i());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f14606n;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                D(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                D((width - paddingLeft) - paddingRight);
            } else {
                D(i11);
            }
            g(q0.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - x()) - S()) : i10 + paddingLeft + S());
        }

        public int S() {
            return this.f14620R;
        }

        boolean T(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f14619Q);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence h() {
            return this.f14617O;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void k(CharSequence charSequence) {
            this.f14617O = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void m(int i10) {
            this.f14620R = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            R();
            G(2);
            super.show();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            listViewJ.setTextDirection(i10);
            listViewJ.setTextAlignment(i11);
            O(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            I(new c(bVar));
        }

        @Override // androidx.appcompat.widget.S, androidx.appcompat.widget.AppCompatSpinner.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f14618P = listAdapter;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface g {
        void dismiss();

        void e(Drawable drawable);

        int f();

        void g(int i10);

        CharSequence h();

        Drawable i();

        boolean isShowing();

        void k(CharSequence charSequence);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26723J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f14606n);
        Rect rect = this.f14606n;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f14604l.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            c1631d.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f14604l;
        return gVar != null ? gVar.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f14604l;
        return gVar != null ? gVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f14604l != null ? this.f14605m : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f14604l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f14604l;
        return gVar != null ? gVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f14600h;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f14604l;
        return gVar != null ? gVar.h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f14604l;
        if (gVar == null || !gVar.isShowing()) {
            return;
        }
        this.f14604l.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f14604l == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f14607g || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g gVar = this.f14604l;
        savedState.f14607g = gVar != null && gVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p10 = this.f14601i;
        if (p10 == null || !p10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f14604l;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f14604l;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.m(i10);
            this.f14604l.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f14604l;
        if (gVar != null) {
            gVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f14604l != null) {
            this.f14605m = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f14604l;
        if (gVar != null) {
            gVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC2619a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f14604l;
        if (gVar != null) {
            gVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.f14599g;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f14603k) {
            this.f14602j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f14604l != null) {
            Context context = this.f14600h;
            if (context == null) {
                context = getContext();
            }
            this.f14604l.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f14606n = new Rect();
        b0.a(this, getContext());
        f0 f0VarV = f0.v(context, attributeSet, AbstractC2577j.f27151x2, i10, 0);
        this.f14599g = new C1631d(this);
        if (theme != null) {
            this.f14600h = new androidx.appcompat.view.d(context, theme);
        } else {
            int iN = f0VarV.n(AbstractC2577j.f26918C2, 0);
            if (iN != 0) {
                this.f14600h = new androidx.appcompat.view.d(context, iN);
            } else {
                this.f14600h = context;
            }
        }
        TypedArray typedArray = null;
        if (i11 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14598o, i10, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i11 != 0) {
                    }
                    charSequenceArrQ = f0VarV.q(AbstractC2577j.f27156y2);
                    if (charSequenceArrQ != null) {
                    }
                    f0VarV.x();
                    this.f14603k = true;
                    spinnerAdapter = this.f14602j;
                    if (spinnerAdapter != null) {
                    }
                    this.f14599g.e(attributeSet, i10);
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i11 != 0) {
            d dVar = new d();
            this.f14604l = dVar;
            dVar.k(f0VarV.o(AbstractC2577j.f26908A2));
        } else if (i11 == 1) {
            f fVar = new f(this.f14600h, attributeSet, i10);
            f0 f0VarV2 = f0.v(this.f14600h, attributeSet, AbstractC2577j.f27151x2, i10, 0);
            this.f14605m = f0VarV2.m(AbstractC2577j.f26913B2, -2);
            fVar.e(f0VarV2.g(AbstractC2577j.f27161z2));
            fVar.k(f0VarV.o(AbstractC2577j.f26908A2));
            f0VarV2.x();
            this.f14604l = fVar;
            this.f14601i = new a(this, fVar);
        }
        charSequenceArrQ = f0VarV.q(AbstractC2577j.f27156y2);
        if (charSequenceArrQ != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
            arrayAdapter.setDropDownViewResource(AbstractC2574g.f26884t);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        f0VarV.x();
        this.f14603k = true;
        spinnerAdapter = this.f14602j;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f14602j = null;
        }
        this.f14599g.e(attributeSet, i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.appcompat.app.c f14611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ListAdapter f14612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CharSequence f14613i;

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f14611g;
            if (cVar != null) {
                cVar.dismiss();
                this.f14611g = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence h() {
            return this.f14613i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public boolean isShowing() {
            androidx.appcompat.app.c cVar = this.f14611g;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void k(CharSequence charSequence) {
            this.f14613i = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void n(int i10, int i11) {
            if (this.f14612h == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f14613i;
            if (charSequence != null) {
                aVar.o(charSequence);
            }
            androidx.appcompat.app.c cVarA = aVar.m(this.f14612h, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f14611g = cVarA;
            ListView listViewI = cVarA.i();
            listViewI.setTextDirection(i10);
            listViewI.setTextAlignment(i11);
            this.f14611g.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f14612h.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void p(ListAdapter listAdapter) {
            this.f14612h = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void e(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void g(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void l(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void m(int i10) {
        }
    }
}
