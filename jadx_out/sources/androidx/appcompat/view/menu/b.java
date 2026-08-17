package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.U;
import androidx.core.view.AbstractC1692s;
import f.AbstractC2571d;
import f.AbstractC2574g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f14308H = AbstractC2574g.f26869e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14309A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f14311C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private j.a f14312D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ViewTreeObserver f14313E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private PopupWindow.OnDismissListener f14314F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f14315G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f14316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f14317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f14318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f14319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f14320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Handler f14321m;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f14329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    View f14330v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f14332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14333y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14334z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f14322n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final List f14323o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f14324p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f14325q = new ViewOnAttachStateChangeListenerC0146b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final T f14326r = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14327s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14328t = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f14310B = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14331w = D();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.f14323o.size() <= 0 || ((d) b.this.f14323o.get(0)).f14342a.z()) {
                return;
            }
            View view = b.this.f14330v;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f14323o.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f14342a.show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements T {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d f14338g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ MenuItem f14339h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ e f14340i;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f14338g = dVar;
                this.f14339h = menuItem;
                this.f14340i = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f14338g;
                if (dVar != null) {
                    b.this.f14315G = true;
                    dVar.f14343b.e(false);
                    b.this.f14315G = false;
                }
                if (this.f14339h.isEnabled() && this.f14339h.hasSubMenu()) {
                    this.f14340i.O(this.f14339h, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.T
        public void a(e eVar, MenuItem menuItem) {
            b.this.f14321m.removeCallbacksAndMessages(null);
            int size = b.this.f14323o.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f14323o.get(i10)).f14343b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f14321m.postAtTime(new a(i11 < b.this.f14323o.size() ? (d) b.this.f14323o.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.T
        public void b(e eVar, MenuItem menuItem) {
            b.this.f14321m.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f14342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f14343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14344c;

        public d(U u10, e eVar, int i10) {
            this.f14342a = u10;
            this.f14343b = eVar;
            this.f14344c = i10;
        }

        public ListView a() {
            return this.f14342a.j();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f14316h = context;
        this.f14329u = view;
        this.f14318j = i10;
        this.f14319k = i11;
        this.f14320l = z10;
        Resources resources = context.getResources();
        this.f14317i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC2571d.f26765b));
        this.f14321m = new Handler();
    }

    private int A(e eVar) {
        int size = this.f14323o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f14323o.get(i10)).f14343b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f14343b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f14329u.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List list = this.f14323o;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f14330v.getWindowVisibleDisplayFrame(rect);
        return this.f14331w == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f14316h);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f14320l, f14308H);
        if (!isShowing() && this.f14310B) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f14316h, this.f14317i);
        U uZ = z();
        uZ.p(dVar2);
        uZ.D(iO);
        uZ.E(this.f14328t);
        if (this.f14323o.size() > 0) {
            List list = this.f14323o;
            dVar = (d) list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            uZ.T(false);
            uZ.Q(null);
            int iE = E(iO);
            boolean z10 = iE == 1;
            this.f14331w = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                uZ.B(viewC);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f14329u.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f14328t & 7) == 5) {
                    iArr[0] = iArr[0] + this.f14329u.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f14328t & 5) == 5) {
                if (!z10) {
                    iO = viewC.getWidth();
                    i12 = i10 - iO;
                }
                i12 = i10 + iO;
            } else {
                if (z10) {
                    iO = viewC.getWidth();
                    i12 = i10 + iO;
                }
                i12 = i10 - iO;
            }
            uZ.g(i12);
            uZ.L(true);
            uZ.l(i11);
        } else {
            if (this.f14332x) {
                uZ.g(this.f14334z);
            }
            if (this.f14333y) {
                uZ.l(this.f14309A);
            }
            uZ.F(n());
        }
        this.f14323o.add(new d(uZ, eVar, this.f14331w));
        uZ.show();
        ListView listViewJ = uZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f14311C && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC2574g.f26876l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewJ.addHeaderView(frameLayout, null, false);
            uZ.show();
        }
    }

    private U z() {
        U u10 = new U(this.f14316h, null, this.f14318j, this.f14319k);
        u10.S(this.f14326r);
        u10.J(this);
        u10.I(this);
        u10.B(this.f14329u);
        u10.E(this.f14328t);
        u10.H(true);
        u10.G(2);
        return u10;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i10 = iA + 1;
        if (i10 < this.f14323o.size()) {
            ((d) this.f14323o.get(i10)).f14343b.e(false);
        }
        d dVar = (d) this.f14323o.remove(iA);
        dVar.f14343b.R(this);
        if (this.f14315G) {
            dVar.f14342a.R(null);
            dVar.f14342a.C(0);
        }
        dVar.f14342a.dismiss();
        int size = this.f14323o.size();
        if (size > 0) {
            this.f14331w = ((d) this.f14323o.get(size - 1)).f14344c;
        } else {
            this.f14331w = D();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f14323o.get(0)).f14343b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f14312D;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14313E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14313E.removeGlobalOnLayoutListener(this.f14324p);
            }
            this.f14313E = null;
        }
        this.f14330v.removeOnAttachStateChangeListener(this.f14325q);
        this.f14314F.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        Iterator it = this.f14323o.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // k.InterfaceC2820e
    public void dismiss() {
        int size = this.f14323o.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f14323o.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f14342a.isShowing()) {
                    dVar.f14342a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f14312D = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(m mVar) {
        for (d dVar : this.f14323o) {
            if (mVar == dVar.f14343b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f14312D;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // k.InterfaceC2820e
    public boolean isShowing() {
        return this.f14323o.size() > 0 && ((d) this.f14323o.get(0)).f14342a.isShowing();
    }

    @Override // k.InterfaceC2820e
    public ListView j() {
        if (this.f14323o.isEmpty()) {
            return null;
        }
        return ((d) this.f14323o.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f14316h);
        if (isShowing()) {
            F(eVar);
        } else {
            this.f14322n.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f14323o.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f14323o.get(i10);
            if (!dVar.f14342a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f14343b.e(false);
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
        if (this.f14329u != view) {
            this.f14329u = view;
            this.f14328t = AbstractC1692s.b(this.f14327s, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f14310B = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f14327s != i10) {
            this.f14327s = i10;
            this.f14328t = AbstractC1692s.b(i10, this.f14329u.getLayoutDirection());
        }
    }

    @Override // k.InterfaceC2820e
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator it = this.f14322n.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f14322n.clear();
        View view = this.f14329u;
        this.f14330v = view;
        if (view != null) {
            boolean z10 = this.f14313E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14313E = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14324p);
            }
            this.f14330v.addOnAttachStateChangeListener(this.f14325q);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f14332x = true;
        this.f14334z = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f14314F = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f14311C = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f14333y = true;
        this.f14309A = i10;
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class ViewOnAttachStateChangeListenerC0146b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0146b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f14313E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f14313E = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f14313E.removeGlobalOnLayoutListener(bVar.f14324p);
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
}
