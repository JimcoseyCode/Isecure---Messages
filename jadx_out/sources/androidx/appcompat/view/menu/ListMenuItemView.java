package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.f0;
import f.AbstractC2568a;
import f.AbstractC2573f;
import f.AbstractC2574g;
import f.AbstractC2577j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f14281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f14282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RadioButton f14283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f14284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckBox f14285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f14286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImageView f14287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f14288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayout f14289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f14290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Context f14292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f14294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LayoutInflater f14296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14297w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26716C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f14289o;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC2574g.f26872h, (ViewGroup) this, false);
        this.f14285k = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC2574g.f26873i, (ViewGroup) this, false);
        this.f14282h = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC2574g.f26875k, (ViewGroup) this, false);
        this.f14283i = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f14296v == null) {
            this.f14296v = LayoutInflater.from(getContext());
        }
        return this.f14296v;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f14287m;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f14288n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14288n.getLayoutParams();
        rect.top += this.f14288n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f14281g = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f14281g;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f14281g.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f14286l.setText(this.f14281g.h());
        }
        if (this.f14286l.getVisibility() != i10) {
            this.f14286l.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f14290p);
        TextView textView = (TextView) findViewById(AbstractC2573f.f26835N);
        this.f14284j = textView;
        int i10 = this.f14291q;
        if (i10 != -1) {
            textView.setTextAppearance(this.f14292r, i10);
        }
        this.f14286l = (TextView) findViewById(AbstractC2573f.f26828G);
        ImageView imageView = (ImageView) findViewById(AbstractC2573f.f26831J);
        this.f14287m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f14294t);
        }
        this.f14288n = (ImageView) findViewById(AbstractC2573f.f26857s);
        this.f14289o = (LinearLayout) findViewById(AbstractC2573f.f26851m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f14282h != null && this.f14293s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f14282h.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f14283i == null && this.f14285k == null) {
            return;
        }
        if (this.f14281g.m()) {
            if (this.f14283i == null) {
                g();
            }
            compoundButton = this.f14283i;
            view = this.f14285k;
        } else {
            if (this.f14285k == null) {
                e();
            }
            compoundButton = this.f14285k;
            view = this.f14283i;
        }
        if (z10) {
            compoundButton.setChecked(this.f14281g.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f14285k;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f14283i;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f14281g.m()) {
            if (this.f14283i == null) {
                g();
            }
            compoundButton = this.f14283i;
        } else {
            if (this.f14285k == null) {
                e();
            }
            compoundButton = this.f14285k;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f14297w = z10;
        this.f14293s = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f14288n;
        if (imageView != null) {
            imageView.setVisibility((this.f14295u || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f14281g.z() || this.f14297w;
        if (z10 || this.f14293s) {
            ImageView imageView = this.f14282h;
            if (imageView == null && drawable == null && !this.f14293s) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f14293s) {
                this.f14282h.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f14282h;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f14282h.getVisibility() != 0) {
                this.f14282h.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f14284j.getVisibility() != 8) {
                this.f14284j.setVisibility(8);
            }
        } else {
            this.f14284j.setText(charSequence);
            if (this.f14284j.getVisibility() != 0) {
                this.f14284j.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        f0 f0VarV = f0.v(getContext(), attributeSet, AbstractC2577j.f27002T1, i10, 0);
        this.f14290p = f0VarV.g(AbstractC2577j.f27012V1);
        this.f14291q = f0VarV.n(AbstractC2577j.f27007U1, -1);
        this.f14293s = f0VarV.a(AbstractC2577j.f27017W1, false);
        this.f14292r = context;
        this.f14294t = f0VarV.g(AbstractC2577j.f27022X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC2568a.f26754z, 0);
        this.f14295u = typedArrayObtainStyledAttributes.hasValue(0);
        f0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
