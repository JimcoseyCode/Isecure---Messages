package A6;

import B6.i;
import B7.d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3276e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f89a = new c();

    private c() {
    }

    private final EditText b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        int i11 = i10 > 0 ? iIndexOfChild + 1 : iIndexOfChild - 1;
        int childCount = i10 > 0 ? viewGroup.getChildCount() : -1;
        while (i11 != childCount) {
            View childAt = viewGroup.getChildAt(i11);
            AbstractC2855l.d(childAt);
            EditText editTextD = d(childAt, i10);
            if (editTextD != null) {
                return editTextD;
            }
            i11 += i10;
        }
        if (viewGroup instanceof i) {
            return null;
        }
        return b(viewGroup, i10);
    }

    private final EditText c(ViewGroup viewGroup, int i10) {
        int childCount = viewGroup.getChildCount();
        B7.a aVarP = i10 > 0 ? d.p(0, childCount) : d.n(childCount - 1, 0);
        int iD = aVarP.d();
        int iO = aVarP.o();
        int iP = aVarP.p();
        if ((iP <= 0 || iD > iO) && (iP >= 0 || iO > iD)) {
            return null;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(iD);
            AbstractC2855l.d(childAt);
            EditText editTextD = d(childAt, i10);
            if (editTextD != null) {
                return editTextD;
            }
            if (iD == iO) {
                return null;
            }
            iD += iP;
        }
    }

    private final EditText d(View view, int i10) {
        if (j(view)) {
            AbstractC2855l.e(view, "null cannot be cast to non-null type android.widget.EditText");
            return (EditText) view;
        }
        if (!(view instanceof ViewGroup) || (view instanceof i)) {
            return null;
        }
        return c((ViewGroup) view, i10);
    }

    private final EditText f(View view) {
        return b(view, 1);
    }

    private final EditText g(View view) {
        return b(view, -1);
    }

    private static final void i(List list, View view) {
        if (f89a.j(view)) {
            AbstractC2855l.e(view, "null cannot be cast to non-null type android.widget.EditText");
            list.add((EditText) view);
        } else {
            if (!(view instanceof ViewGroup) || (view instanceof i)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i(list, viewGroup.getChildAt(i10));
            }
        }
    }

    private final boolean j(View view) {
        return (view instanceof EditText) && ((EditText) view).isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EditText editText) {
        AbstractC3276e.e(editText);
    }

    public final i e(View view) {
        for (ViewParent parent = view != null ? view.getParent() : null; parent != null; parent = parent.getParent()) {
            if (parent instanceof i) {
                return (i) parent;
            }
        }
        return null;
    }

    public final List h(View view) {
        ArrayList arrayList = new ArrayList();
        if (!(view instanceof i)) {
            i(arrayList, view);
            return arrayList;
        }
        i iVar = (i) view;
        int childCount = iVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            i(arrayList, iVar.getChildAt(i10));
        }
        return arrayList;
    }

    public final void k(String direction, View view) {
        AbstractC2855l.g(direction, "direction");
        AbstractC2855l.g(view, "view");
        final EditText editTextF = AbstractC2855l.b(direction, "next") ? f(view) : g(view);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: A6.b
            @Override // java.lang.Runnable
            public final void run() {
                c.l(editTextF);
            }
        });
    }
}
