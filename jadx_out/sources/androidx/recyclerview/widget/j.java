package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f18180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f18181e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.A a10, RecyclerView.z.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.f18188a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f18169j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, i iVar) {
        int iO = pVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i10 = ViewDefaults.NUMBER_OF_LINES;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = pVar.N(i11);
            int iAbs = Math.abs((iVar.g(viewN) + (iVar.e(viewN) / 2)) - iM);
            if (iAbs < i10) {
                view = viewN;
                i10 = iAbs;
            }
        }
        return view;
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.f18181e;
        if (iVar == null || iVar.f18177a != pVar) {
            this.f18181e = i.a(pVar);
        }
        return this.f18181e;
    }

    private i n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.f18180d;
        if (iVar == null || iVar.f18177a != pVar) {
            this.f18180d = i.c(pVar);
        }
        return this.f18180d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        return pVar.p() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF pointFC;
        int iE = pVar.e();
        if (!(pVar instanceof RecyclerView.z.b) || (pointFC = ((RecyclerView.z.b) pVar).c(iE - 1)) == null) {
            return false;
        }
        return pointFC.x < 0.0f || pointFC.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.z d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.f18188a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.p pVar) {
        if (pVar.q()) {
            return l(pVar, o(pVar));
        }
        if (pVar.p()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.p pVar, int i10, int i11) {
        i iVarN;
        int iE = pVar.e();
        if (iE == 0 || (iVarN = n(pVar)) == null) {
            return -1;
        }
        int iO = pVar.O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iO; i14++) {
            View viewN = pVar.N(i14);
            if (viewN != null) {
                int iK = k(viewN, iVarN);
                if (iK <= 0 && iK > i13) {
                    view2 = viewN;
                    i13 = iK;
                }
                if (iK >= 0 && iK < i12) {
                    view = viewN;
                    i12 = iK;
                }
            }
        }
        boolean zP = p(pVar, i10, i11);
        if (zP && view != null) {
            return pVar.l0(view);
        }
        if (!zP && view2 != null) {
            return pVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = pVar.l0(view) + (q(pVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iE) {
            return -1;
        }
        return iL0;
    }
}
