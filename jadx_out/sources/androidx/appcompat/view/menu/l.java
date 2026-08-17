package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.U;
import f.AbstractC2571d;
import f.AbstractC2574g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f14440B = AbstractC2574g.f26877m;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f14441A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f14442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f14443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f14444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f14445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f14446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f14447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f14448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final U f14449o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PopupWindow.OnDismissListener f14452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f14453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View f14454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j.a f14455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ViewTreeObserver f14456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f14458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14459y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f14450p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f14451q = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14460z = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.isShowing() || l.this.f14449o.z()) {
                return;
            }
            View view = l.this.f14454t;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f14449o.show();
            }
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f14442h = context;
        this.f14443i = eVar;
        this.f14445k = z10;
        this.f14444j = new d(eVar, LayoutInflater.from(context), z10, f14440B);
        this.f14447m = i10;
        this.f14448n = i11;
        Resources resources = context.getResources();
        this.f14446l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC2571d.f26765b));
        this.f14453s = view;
        this.f14449o = new U(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f14457w || (view = this.f14453s) == null) {
            return false;
        }
        this.f14454t = view;
        this.f14449o.I(this);
        this.f14449o.J(this);
        this.f14449o.H(true);
        View view2 = this.f14454t;
        boolean z10 = this.f14456v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f14456v = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14450p);
        }
        view2.addOnAttachStateChangeListener(this.f14451q);
        this.f14449o.B(view2);
        this.f14449o.E(this.f14460z);
        if (!this.f14458x) {
            this.f14459y = h.o(this.f14444j, null, this.f14442h, this.f14446l);
            this.f14458x = true;
        }
        this.f14449o.D(this.f14459y);
        this.f14449o.G(2);
        this.f14449o.F(n());
        this.f14449o.show();
        ListView listViewJ = this.f14449o.j();
        listViewJ.setOnKeyListener(this);
        if (this.f14441A && this.f14443i.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f14442h).inflate(AbstractC2574g.f26876l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f14443i.z());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f14449o.p(this.f14444j);
        this.f14449o.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        if (eVar != this.f14443i) {
            return;
        }
        dismiss();
        j.a aVar = this.f14455u;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        this.f14458x = false;
        d dVar = this.f14444j;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // k.InterfaceC2820e
    public void dismiss() {
        if (isShowing()) {
            this.f14449o.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f14455u = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f14442h, mVar, this.f14454t, this.f14445k, this.f14447m, this.f14448n);
            iVar.j(this.f14455u);
            iVar.g(h.x(mVar));
            iVar.i(this.f14452r);
            this.f14452r = null;
            this.f14443i.e(false);
            int iF = this.f14449o.f();
            int iO = this.f14449o.o();
            if ((Gravity.getAbsoluteGravity(this.f14460z, this.f14453s.getLayoutDirection()) & 7) == 5) {
                iF += this.f14453s.getWidth();
            }
            if (iVar.n(iF, iO)) {
                j.a aVar = this.f14455u;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // k.InterfaceC2820e
    public boolean isShowing() {
        return !this.f14457w && this.f14449o.isShowing();
    }

    @Override // k.InterfaceC2820e
    public ListView j() {
        return this.f14449o.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable k() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f14457w = true;
        this.f14443i.close();
        ViewTreeObserver viewTreeObserver = this.f14456v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14456v = this.f14454t.getViewTreeObserver();
            }
            this.f14456v.removeGlobalOnLayoutListener(this.f14450p);
            this.f14456v = null;
        }
        this.f14454t.removeOnAttachStateChangeListener(this.f14451q);
        PopupWindow.OnDismissListener onDismissListener = this.f14452r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f14453s = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f14444j.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f14460z = i10;
    }

    @Override // k.InterfaceC2820e
    public void show() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f14449o.g(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f14452r = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f14441A = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f14449o.l(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f14456v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f14456v = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f14456v.removeGlobalOnLayoutListener(lVar.f14450p);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }
}
