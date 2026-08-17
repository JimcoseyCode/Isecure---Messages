package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC1658a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f18057s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f18058h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f18059i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f18060j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f18061k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f18062l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f18063m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f18064n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f18065o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f18066p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f18067q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f18068r = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f18069g;

        a(ArrayList arrayList) {
            this.f18069g = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f18069g) {
                c.this.S(jVar.f18103a, jVar.f18104b, jVar.f18105c, jVar.f18106d, jVar.f18107e);
            }
            this.f18069g.clear();
            c.this.f18063m.remove(this.f18069g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f18071g;

        b(ArrayList arrayList) {
            this.f18071g = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18071g.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f18071g.clear();
            c.this.f18064n.remove(this.f18071g);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC0186c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f18073g;

        RunnableC0186c(ArrayList arrayList) {
            this.f18073g = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18073g.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.E) it.next());
            }
            this.f18073g.clear();
            c.this.f18062l.remove(this.f18073g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f18075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18077c;

        d(RecyclerView.E e10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18075a = e10;
            this.f18076b = viewPropertyAnimator;
            this.f18077c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18076b.setListener(null);
            this.f18077c.setAlpha(1.0f);
            c.this.G(this.f18075a);
            c.this.f18067q.remove(this.f18075a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f18075a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f18079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f18080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18081c;

        e(RecyclerView.E e10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18079a = e10;
            this.f18080b = view;
            this.f18081c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18080b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18081c.setListener(null);
            c.this.A(this.f18079a);
            c.this.f18065o.remove(this.f18079a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f18079a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f18083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18087e;

        f(RecyclerView.E e10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18083a = e10;
            this.f18084b = i10;
            this.f18085c = view;
            this.f18086d = i11;
            this.f18087e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f18084b != 0) {
                this.f18085c.setTranslationX(0.0f);
            }
            if (this.f18086d != 0) {
                this.f18085c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18087e.setListener(null);
            c.this.E(this.f18083a);
            c.this.f18066p.remove(this.f18083a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f18083a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f18089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18091c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18089a = iVar;
            this.f18090b = viewPropertyAnimator;
            this.f18091c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18090b.setListener(null);
            this.f18091c.setAlpha(1.0f);
            this.f18091c.setTranslationX(0.0f);
            this.f18091c.setTranslationY(0.0f);
            c.this.C(this.f18089a.f18097a, true);
            c.this.f18068r.remove(this.f18089a.f18097a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f18089a.f18097a, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f18093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18095c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18093a = iVar;
            this.f18094b = viewPropertyAnimator;
            this.f18095c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18094b.setListener(null);
            this.f18095c.setAlpha(1.0f);
            this.f18095c.setTranslationX(0.0f);
            this.f18095c.setTranslationY(0.0f);
            c.this.C(this.f18093a.f18098b, false);
            c.this.f18068r.remove(this.f18093a.f18098b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f18093a.f18098b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f18103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18107e;

        j(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
            this.f18103a = e10;
            this.f18104b = i10;
            this.f18105c = i11;
            this.f18106d = i12;
            this.f18107e = i13;
        }
    }

    private void T(RecyclerView.E e10) {
        View view = e10.f17881a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f18067q.add(e10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(e10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.E e10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, e10) && iVar.f18097a == null && iVar.f18098b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.E e10 = iVar.f18097a;
        if (e10 != null) {
            Y(iVar, e10);
        }
        RecyclerView.E e11 = iVar.f18098b;
        if (e11 != null) {
            Y(iVar, e11);
        }
    }

    private boolean Y(i iVar, RecyclerView.E e10) {
        boolean z10 = false;
        if (iVar.f18098b == e10) {
            iVar.f18098b = null;
        } else {
            if (iVar.f18097a != e10) {
                return false;
            }
            iVar.f18097a = null;
            z10 = true;
        }
        e10.f17881a.setAlpha(1.0f);
        e10.f17881a.setTranslationX(0.0f);
        e10.f17881a.setTranslationY(0.0f);
        C(e10, z10);
        return true;
    }

    private void Z(RecyclerView.E e10) {
        if (f18057s == null) {
            f18057s = new ValueAnimator().getInterpolator();
        }
        e10.f17881a.animate().setInterpolator(f18057s);
        j(e10);
    }

    void Q(RecyclerView.E e10) {
        View view = e10.f17881a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f18065o.add(e10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(e10, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.E e10 = iVar.f18097a;
        View view = e10 == null ? null : e10.f17881a;
        RecyclerView.E e11 = iVar.f18098b;
        View view2 = e11 != null ? e11.f17881a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f18068r.add(iVar.f18097a);
            duration.translationX(iVar.f18101e - iVar.f18099c);
            duration.translationY(iVar.f18102f - iVar.f18100d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f18068r.add(iVar.f18098b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.f17881a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f18066p.add(e10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(e10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.E) list.get(size)).f17881a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.E e10, List list) {
        return !list.isEmpty() || super.g(e10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.E e10) {
        View view = e10.f17881a;
        view.animate().cancel();
        int size = this.f18060j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f18060j.get(size)).f18103a == e10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(e10);
                this.f18060j.remove(size);
            }
        }
        W(this.f18061k, e10);
        if (this.f18058h.remove(e10)) {
            view.setAlpha(1.0f);
            G(e10);
        }
        if (this.f18059i.remove(e10)) {
            view.setAlpha(1.0f);
            A(e10);
        }
        for (int size2 = this.f18064n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f18064n.get(size2);
            W(arrayList, e10);
            if (arrayList.isEmpty()) {
                this.f18064n.remove(size2);
            }
        }
        for (int size3 = this.f18063m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f18063m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f18103a == e10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(e10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f18063m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f18062l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f18062l.get(size5);
            if (arrayList3.remove(e10)) {
                view.setAlpha(1.0f);
                A(e10);
                if (arrayList3.isEmpty()) {
                    this.f18062l.remove(size5);
                }
            }
        }
        this.f18067q.remove(e10);
        this.f18065o.remove(e10);
        this.f18068r.remove(e10);
        this.f18066p.remove(e10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f18060j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f18060j.get(size);
            View view = jVar.f18103a.f17881a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f18103a);
            this.f18060j.remove(size);
        }
        for (int size2 = this.f18058h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.E) this.f18058h.get(size2));
            this.f18058h.remove(size2);
        }
        int size3 = this.f18059i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.E e10 = (RecyclerView.E) this.f18059i.get(size3);
            e10.f17881a.setAlpha(1.0f);
            A(e10);
            this.f18059i.remove(size3);
        }
        for (int size4 = this.f18061k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f18061k.get(size4));
        }
        this.f18061k.clear();
        if (p()) {
            for (int size5 = this.f18063m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f18063m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f18103a.f17881a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f18103a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f18063m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f18062l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f18062l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.E e11 = (RecyclerView.E) arrayList2.get(size8);
                    e11.f17881a.setAlpha(1.0f);
                    A(e11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f18062l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f18064n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f18064n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f18064n.remove(arrayList3);
                    }
                }
            }
            U(this.f18067q);
            U(this.f18066p);
            U(this.f18065o);
            U(this.f18068r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f18059i.isEmpty() && this.f18061k.isEmpty() && this.f18060j.isEmpty() && this.f18058h.isEmpty() && this.f18066p.isEmpty() && this.f18067q.isEmpty() && this.f18065o.isEmpty() && this.f18068r.isEmpty() && this.f18063m.isEmpty() && this.f18062l.isEmpty() && this.f18064n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean zIsEmpty = this.f18058h.isEmpty();
        boolean zIsEmpty2 = this.f18060j.isEmpty();
        boolean zIsEmpty3 = this.f18061k.isEmpty();
        boolean zIsEmpty4 = this.f18059i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f18058h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.E) it.next());
        }
        this.f18058h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f18060j);
            this.f18063m.add(arrayList);
            this.f18060j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC1658a0.d0(((j) arrayList.get(0)).f18103a.f17881a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f18061k);
            this.f18064n.add(arrayList2);
            this.f18061k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC1658a0.d0(((i) arrayList2.get(0)).f18097a.f17881a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f18059i);
        this.f18062l.add(arrayList3);
        this.f18059i.clear();
        RunnableC0186c runnableC0186c = new RunnableC0186c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0186c.run();
        } else {
            AbstractC1658a0.d0(((RecyclerView.E) arrayList3.get(0)).f17881a, runnableC0186c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.E e10) {
        Z(e10);
        e10.f17881a.setAlpha(0.0f);
        this.f18059i.add(e10);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
        if (e10 == e11) {
            return y(e10, i10, i11, i12, i13);
        }
        float translationX = e10.f17881a.getTranslationX();
        float translationY = e10.f17881a.getTranslationY();
        float alpha = e10.f17881a.getAlpha();
        Z(e10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        e10.f17881a.setTranslationX(translationX);
        e10.f17881a.setTranslationY(translationY);
        e10.f17881a.setAlpha(alpha);
        if (e11 != null) {
            Z(e11);
            e11.f17881a.setTranslationX(-i14);
            e11.f17881a.setTranslationY(-i15);
            e11.f17881a.setAlpha(0.0f);
        }
        this.f18061k.add(new i(e10, e11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.f17881a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e10.f17881a.getTranslationY());
        Z(e10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(e10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f18060j.add(new j(e10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.E e10) {
        Z(e10);
        this.f18058h.add(e10);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f18097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.E f18098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18102f;

        private i(RecyclerView.E e10, RecyclerView.E e11) {
            this.f18097a = e10;
            this.f18098b = e11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f18097a + ", newHolder=" + this.f18098b + ", fromX=" + this.f18099c + ", fromY=" + this.f18100d + ", toX=" + this.f18101e + ", toY=" + this.f18102f + '}';
        }

        i(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
            this(e10, e11);
            this.f18099c = i10;
            this.f18100d = i11;
            this.f18101e = i12;
            this.f18102f = i13;
        }
    }
}
