package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1692s;
import f.AbstractC2571d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f14428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f14432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f14435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f14436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f14437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f14438l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f14427a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f14427a.getResources().getDimensionPixelSize(AbstractC2571d.f26764a) ? new b(this.f14427a, this.f14432f, this.f14430d, this.f14431e, this.f14429c) : new l(this.f14427a, this.f14428b, this.f14432f, this.f14430d, this.f14431e, this.f14429c);
        bVar.l(this.f14428b);
        bVar.u(this.f14438l);
        bVar.p(this.f14432f);
        bVar.f(this.f14435i);
        bVar.r(this.f14434h);
        bVar.s(this.f14433g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.v(z11);
        if (z10) {
            if ((AbstractC1692s.b(this.f14433g, this.f14432f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f14432f.getWidth();
            }
            hVarC.t(i10);
            hVarC.w(i11);
            int i12 = (int) ((this.f14427a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.show();
    }

    public void b() {
        if (d()) {
            this.f14436j.dismiss();
        }
    }

    public h c() {
        if (this.f14436j == null) {
            this.f14436j = a();
        }
        return this.f14436j;
    }

    public boolean d() {
        h hVar = this.f14436j;
        return hVar != null && hVar.isShowing();
    }

    protected void e() {
        this.f14436j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14437k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f14432f = view;
    }

    public void g(boolean z10) {
        this.f14434h = z10;
        h hVar = this.f14436j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f14433g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f14437k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f14435i = aVar;
        h hVar = this.f14436j;
        if (hVar != null) {
            hVar.f(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f14432f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f14432f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f14433g = 8388611;
        this.f14438l = new a();
        this.f14427a = context;
        this.f14428b = eVar;
        this.f14432f = view;
        this.f14429c = z10;
        this.f14430d = i10;
        this.f14431e = i11;
    }
}
