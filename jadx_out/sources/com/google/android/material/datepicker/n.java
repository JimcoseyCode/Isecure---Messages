package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import e5.AbstractC2424b;
import g.AbstractC2619a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class n<S> extends DialogInterfaceOnCancelListenerC1743k {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final Object f23263K = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final Object f23264L = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final Object f23265M = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f23266A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f23267B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private TextView f23268C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private TextView f23269D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private CheckableImageButton f23270E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private h5.h f23271F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Button f23272G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f23273H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private CharSequence f23274I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private CharSequence f23275J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashSet f23276g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LinkedHashSet f23277h = new LinkedHashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LinkedHashSet f23278i = new LinkedHashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f23279j = new LinkedHashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private DateSelector f23281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s f23282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CalendarConstraints f23283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DayViewDecorator f23284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f23285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f23287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f23291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f23293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23294y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f23295z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements I {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f23296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ View f23297h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f23298i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f23299j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f23300k;

        a(int i10, View view, int i11, int i12, int i13) {
            this.f23296g = i10;
            this.f23297h = view;
            this.f23298i = i11;
            this.f23299j = i12;
            this.f23300k = i13;
        }

        @Override // androidx.core.view.I
        public L0 a(View view, L0 l02) {
            x0.e eVarF = l02.f(L0.p.g());
            if (this.f23296g >= 0) {
                this.f23297h.getLayoutParams().height = this.f23296g + eVarF.f33238b;
                View view2 = this.f23297h;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f23297h;
            view3.setPadding(this.f23298i + eVarF.f33237a, this.f23299j + eVarF.f33238b, this.f23300k + eVarF.f33239c, view3.getPaddingBottom());
            return l02;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends r {
        b() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            n.this.f23272G.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.r
        public void b(Object obj) {
            n nVar = n.this;
            nVar.S(nVar.G());
            n.this.f23272G.setEnabled(n.this.D().d0());
        }
    }

    private static Drawable B(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC2619a.b(context, Q4.d.f9262b));
        stateListDrawable.addState(new int[0], AbstractC2619a.b(context, Q4.d.f9263c));
        return stateListDrawable;
    }

    private void C(Window window) {
        if (this.f23273H) {
            return;
        }
        View viewFindViewById = requireView().findViewById(Q4.e.f9305g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.o.d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        AbstractC1658a0.w0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f23273H = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector D() {
        if (this.f23281l == null) {
            this.f23281l = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f23281l;
    }

    private static CharSequence E(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String F() {
        return D().I(requireContext());
    }

    private static int H(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(Q4.c.f9213Z);
        int i10 = Month.q().f23162j;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(Q4.c.f9217b0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(Q4.c.f9225f0));
    }

    private int J(Context context) {
        int i10 = this.f23280k;
        return i10 != 0 ? i10 : D().M(context);
    }

    private void K(Context context) {
        this.f23270E.setTag(f23265M);
        this.f23270E.setImageDrawable(B(context));
        this.f23270E.setChecked(this.f23289t != 0);
        AbstractC1658a0.k0(this.f23270E, null);
        U(this.f23270E);
        this.f23270E.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.y(this.f23262g, view);
            }
        });
    }

    static boolean L(Context context) {
        return Q(context, R.attr.windowFullscreen);
    }

    private boolean M() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean N(Context context) {
        return Q(context, Q4.a.f9092A0);
    }

    static boolean Q(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2424b.f(context, Q4.a.f9145h0, j.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void R() {
        int iJ = J(requireContext());
        j jVarQ = j.Q(D(), iJ, this.f23283n, this.f23284o);
        this.f23285p = jVarQ;
        s sVarY = jVarQ;
        if (this.f23289t == 1) {
            sVarY = o.y(D(), iJ, this.f23283n);
        }
        this.f23282m = sVarY;
        T();
        S(G());
        androidx.fragment.app.I iO = getChildFragmentManager().o();
        iO.o(Q4.e.f9322x, this.f23282m);
        iO.j();
        this.f23282m.w(new b());
    }

    private void T() {
        this.f23268C.setText((this.f23289t == 1 && M()) ? this.f23275J : this.f23274I);
    }

    private void U(CheckableImageButton checkableImageButton) {
        this.f23270E.setContentDescription(this.f23289t == 1 ? checkableImageButton.getContext().getString(Q4.i.f9365N) : checkableImageButton.getContext().getString(Q4.i.f9367P));
    }

    public static /* synthetic */ void y(n nVar, View view) {
        nVar.f23272G.setEnabled(nVar.D().d0());
        nVar.f23270E.toggle();
        nVar.f23289t = nVar.f23289t == 1 ? 0 : 1;
        nVar.U(nVar.f23270E);
        nVar.R();
    }

    public String G() {
        return D().k(getContext());
    }

    public final Object I() {
        return D().i0();
    }

    public void O(View view) {
        Iterator it = this.f23277h.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    public void P(View view) {
        Iterator it = this.f23276g.iterator();
        if (!it.hasNext()) {
            dismiss();
        } else {
            android.support.v4.media.session.b.a(it.next());
            I();
            throw null;
        }
    }

    void S(String str) {
        this.f23269D.setContentDescription(F());
        this.f23269D.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f23278i.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f23280k = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f23281l = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f23283n = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f23284o = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f23286q = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f23287r = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f23289t = bundle.getInt("INPUT_MODE_KEY");
        this.f23290u = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f23291v = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f23292w = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f23293x = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f23294y = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f23295z = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f23266A = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f23267B = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f23287r;
        if (text == null) {
            text = requireContext().getResources().getText(this.f23286q);
        }
        this.f23274I = text;
        this.f23275J = E(text);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), J(requireContext()));
        Context context = dialog.getContext();
        this.f23288s = L(context);
        this.f23271F = new h5.h(context, null, Q4.a.f9145h0, Q4.j.f9427z);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, Q4.k.f9503J2, Q4.a.f9145h0, Q4.j.f9427z);
        int color = typedArrayObtainStyledAttributes.getColor(Q4.k.f9511K2, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f23271F.R(context);
        this.f23271F.d0(ColorStateList.valueOf(color));
        this.f23271F.c0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f23288s ? Q4.g.f9348u : Q4.g.f9347t, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f23284o;
        if (dayViewDecorator != null) {
            dayViewDecorator.h(context);
        }
        if (this.f23288s) {
            viewInflate.findViewById(Q4.e.f9322x).setLayoutParams(new LinearLayout.LayoutParams(H(context), -2));
        } else {
            viewInflate.findViewById(Q4.e.f9323y).setLayoutParams(new LinearLayout.LayoutParams(H(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(Q4.e.f9272B);
        this.f23269D = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f23270E = (CheckableImageButton) viewInflate.findViewById(Q4.e.f9273C);
        this.f23268C = (TextView) viewInflate.findViewById(Q4.e.f9277G);
        K(context);
        this.f23272G = (Button) viewInflate.findViewById(Q4.e.f9302d);
        if (D().d0()) {
            this.f23272G.setEnabled(true);
        } else {
            this.f23272G.setEnabled(false);
        }
        this.f23272G.setTag(f23263K);
        CharSequence charSequence = this.f23291v;
        if (charSequence != null) {
            this.f23272G.setText(charSequence);
        } else {
            int i10 = this.f23290u;
            if (i10 != 0) {
                this.f23272G.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f23293x;
        if (charSequence2 != null) {
            this.f23272G.setContentDescription(charSequence2);
        } else if (this.f23292w != 0) {
            this.f23272G.setContentDescription(getContext().getResources().getText(this.f23292w));
        }
        this.f23272G.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23260g.P(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(Q4.e.f9297a);
        button.setTag(f23264L);
        CharSequence charSequence3 = this.f23295z;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f23294y;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f23267B;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f23266A != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f23266A));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23261g.O(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f23279j.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f23280k);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f23281l);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f23283n);
        j jVar = this.f23285p;
        Month monthL = jVar == null ? null : jVar.L();
        if (monthL != null) {
            bVar.b(monthL.f23164l);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f23284o);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f23286q);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f23287r);
        bundle.putInt("INPUT_MODE_KEY", this.f23289t);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f23290u);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f23291v);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f23292w);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f23293x);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f23294y);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f23295z);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f23266A);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f23267B);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f23288s) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f23271F);
            C(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(Q4.c.f9221d0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f23271F, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new Y4.a(requireDialog(), rect));
        }
        R();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1743k, androidx.fragment.app.Fragment
    public void onStop() {
        this.f23282m.x();
        super.onStop();
    }
}
