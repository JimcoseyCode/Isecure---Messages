package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager2.i f18592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f18593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView f18594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f18595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f18598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18604m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f18606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18607c;

        a() {
        }

        void a() {
            this.f18605a = -1;
            this.f18606b = 0.0f;
            this.f18607c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f18593b = viewPager2;
        RecyclerView recyclerView = viewPager2.f18551p;
        this.f18594c = recyclerView;
        this.f18595d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f18598g = new a();
        n();
    }

    private void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f18592a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        ViewPager2.i iVar = this.f18592a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f18596e == 3 && this.f18597f == 0) || this.f18597f == i10) {
            return;
        }
        this.f18597f = i10;
        ViewPager2.i iVar = this.f18592a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int f() {
        return this.f18595d.c2();
    }

    private boolean k() {
        int i10 = this.f18596e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f18596e = 0;
        this.f18597f = 0;
        this.f18598g.a();
        this.f18599h = -1;
        this.f18600i = -1;
        this.f18601j = false;
        this.f18602k = false;
        this.f18604m = false;
        this.f18603l = false;
    }

    private void p(boolean z10) {
        this.f18604m = z10;
        this.f18596e = z10 ? 4 : 1;
        int i10 = this.f18600i;
        if (i10 != -1) {
            this.f18599h = i10;
            this.f18600i = -1;
        } else if (this.f18599h == -1) {
            this.f18599h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f18598g;
        int iC2 = this.f18595d.c2();
        aVar.f18605a = iC2;
        if (iC2 == -1) {
            aVar.a();
            return;
        }
        View viewH = this.f18595d.H(iC2);
        if (viewH == null) {
            aVar.a();
            return;
        }
        int iE0 = this.f18595d.e0(viewH);
        int iN0 = this.f18595d.n0(viewH);
        int iQ0 = this.f18595d.q0(viewH);
        int iM = this.f18595d.M(viewH);
        ViewGroup.LayoutParams layoutParams = viewH.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iE0 += marginLayoutParams.leftMargin;
            iN0 += marginLayoutParams.rightMargin;
            iQ0 += marginLayoutParams.topMargin;
            iM += marginLayoutParams.bottomMargin;
        }
        int height = viewH.getHeight() + iQ0 + iM;
        int width = viewH.getWidth() + iE0 + iN0;
        if (this.f18595d.p2() == 0) {
            top = (viewH.getLeft() - iE0) - this.f18594c.getPaddingLeft();
            if (this.f18593b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewH.getTop() - iQ0) - this.f18594c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f18607c = i10;
        if (i10 >= 0) {
            aVar.f18606b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f18595d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f18607c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i10) {
        if (!(this.f18596e == 1 && this.f18597f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f18602k) {
                e(2);
                this.f18601j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f18602k) {
                a aVar = this.f18598g;
                if (aVar.f18607c == 0) {
                    int i11 = this.f18599h;
                    int i12 = aVar.f18605a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f18598g.f18605a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f18596e == 2 && i10 == 0 && this.f18603l) {
            q();
            a aVar2 = this.f18598g;
            if (aVar2.f18607c == 0) {
                int i14 = this.f18600i;
                int i15 = aVar2.f18605a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        this.f18602k = true;
        q();
        if (this.f18601j) {
            this.f18601j = false;
            if (i11 > 0) {
                a aVar = this.f18598g;
                i12 = aVar.f18607c != 0 ? aVar.f18605a + 1 : this.f18598g.f18605a;
                this.f18600i = i12;
                if (this.f18599h != i12) {
                    d(i12);
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f18593b.d()) {
                    }
                }
                this.f18600i = i12;
                if (this.f18599h != i12) {
                }
            }
        } else if (this.f18596e == 0) {
            int i13 = this.f18598g.f18605a;
            if (i13 == -1) {
                i13 = 0;
            }
            d(i13);
        }
        a aVar2 = this.f18598g;
        int i14 = aVar2.f18605a;
        if (i14 == -1) {
            i14 = 0;
        }
        c(i14, aVar2.f18606b, aVar2.f18607c);
        a aVar3 = this.f18598g;
        int i15 = aVar3.f18605a;
        int i16 = this.f18600i;
        if ((i15 == i16 || i16 == -1) && aVar3.f18607c == 0 && this.f18597f != 1) {
            e(0);
            n();
        }
    }

    double g() {
        q();
        a aVar = this.f18598g;
        return ((double) aVar.f18605a) + ((double) aVar.f18606b);
    }

    int h() {
        return this.f18597f;
    }

    boolean i() {
        return this.f18604m;
    }

    boolean j() {
        return this.f18597f == 0;
    }

    void l() {
        this.f18603l = true;
    }

    void m(int i10, boolean z10) {
        this.f18596e = z10 ? 2 : 3;
        this.f18604m = false;
        boolean z11 = this.f18600i != i10;
        this.f18600i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    void o(ViewPager2.i iVar) {
        this.f18592a = iVar;
    }
}
