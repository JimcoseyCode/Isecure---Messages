package androidx.fragment.app;

import D0.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1668f0;
import androidx.fragment.app.C1741i;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import m0.C2892a;

/* JADX INFO: renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1741i extends Q {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.a f17466e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q.c operation, D0.d signal, boolean z10) {
            super(operation, signal);
            AbstractC2855l.g(operation, "operation");
            AbstractC2855l.g(signal, "signal");
            this.f17464c = z10;
        }

        public final r.a e(Context context) {
            AbstractC2855l.g(context, "context");
            if (this.f17465d) {
                return this.f17466e;
            }
            r.a aVarB = r.b(context, b().h(), b().g() == Q.c.b.VISIBLE, this.f17464c);
            this.f17466e = aVarB;
            this.f17465d = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q.c f17467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D0.d f17468b;

        public b(Q.c operation, D0.d signal) {
            AbstractC2855l.g(operation, "operation");
            AbstractC2855l.g(signal, "signal");
            this.f17467a = operation;
            this.f17468b = signal;
        }

        public final void a() {
            this.f17467a.f(this.f17468b);
        }

        public final Q.c b() {
            return this.f17467a;
        }

        public final D0.d c() {
            return this.f17468b;
        }

        public final boolean d() {
            Q.c.b.a aVar = Q.c.b.f17431g;
            View view = this.f17467a.h().mView;
            AbstractC2855l.f(view, "operation.fragment.mView");
            Q.c.b bVarA = aVar.a(view);
            Q.c.b bVarG = this.f17467a.g();
            if (bVarA == bVarG) {
                return true;
            }
            Q.c.b bVar = Q.c.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.i$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f17469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f17470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f17471e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q.c operation, D0.d signal, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation, signal);
            AbstractC2855l.g(operation, "operation");
            AbstractC2855l.g(signal, "signal");
            Q.c.b bVarG = operation.g();
            Q.c.b bVar = Q.c.b.VISIBLE;
            if (bVarG == bVar) {
                Fragment fragmentH = operation.h();
                returnTransition = z10 ? fragmentH.getReenterTransition() : fragmentH.getEnterTransition();
            } else {
                Fragment fragmentH2 = operation.h();
                returnTransition = z10 ? fragmentH2.getReturnTransition() : fragmentH2.getExitTransition();
            }
            this.f17469c = returnTransition;
            this.f17470d = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f17471e = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final L f(Object obj) {
            if (obj == null) {
                return null;
            }
            L l10 = J.f17377b;
            if (l10 != null && l10.e(obj)) {
                return l10;
            }
            L l11 = J.f17378c;
            if (l11 != null && l11.e(obj)) {
                return l11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final L e() {
            L lF = f(this.f17469c);
            L lF2 = f(this.f17471e);
            if (lF == null || lF2 == null || lF == lF2) {
                return lF == null ? lF2 : lF;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f17469c + " which uses a different Transition  type than its shared element transition " + this.f17471e).toString());
        }

        public final Object g() {
            return this.f17471e;
        }

        public final Object h() {
            return this.f17469c;
        }

        public final boolean i() {
            return this.f17471e != null;
        }

        public final boolean j() {
            return this.f17470d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d extends kotlin.jvm.internal.n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Collection f17472h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f17472h = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC2855l.g(entry, "entry");
            return Boolean.valueOf(AbstractC2800q.X(this.f17472h, AbstractC1658a0.H((View) entry.getValue())));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f17474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q.c f17476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f17477e;

        e(View view, boolean z10, Q.c cVar, a aVar) {
            this.f17474b = view;
            this.f17475c = z10;
            this.f17476d = cVar;
            this.f17477e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            AbstractC2855l.g(anim, "anim");
            C1741i.this.q().endViewTransition(this.f17474b);
            if (this.f17475c) {
                Q.c.b bVarG = this.f17476d.g();
                View viewToAnimate = this.f17474b;
                AbstractC2855l.f(viewToAnimate, "viewToAnimate");
                bVarG.j(viewToAnimate);
            }
            this.f17477e.a();
            if (FragmentManager.J0(2)) {
                Objects.toString(this.f17476d);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q.c f17478g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C1741i f17479h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f17480i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f17481j;

        f(Q.c cVar, C1741i c1741i, View view, a aVar) {
            this.f17478g = cVar;
            this.f17479h = c1741i;
            this.f17480i = view;
            this.f17481j = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C1741i this$0, View view, a animationInfo) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC2855l.g(animation, "animation");
            ViewGroup viewGroupQ = this.f17479h.q();
            final C1741i c1741i = this.f17479h;
            final View view = this.f17480i;
            final a aVar = this.f17481j;
            viewGroupQ.post(new Runnable() { // from class: androidx.fragment.app.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1741i.f.b(c1741i, view, aVar);
                }
            });
            if (FragmentManager.J0(2)) {
                Objects.toString(this.f17478g);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC2855l.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC2855l.g(animation, "animation");
            if (FragmentManager.J0(2)) {
                Objects.toString(this.f17478g);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741i(ViewGroup container) {
        super(container);
        AbstractC2855l.g(container, "container");
    }

    private final void D(Q.c cVar) {
        View view = cVar.h().mView;
        Q.c.b bVarG = cVar.g();
        AbstractC2855l.f(view, "view");
        bVarG.j(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC1668f0.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                AbstractC2855l.f(child, "child");
                E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List awaitingContainerChanges, Q.c operation, C1741i this$0) {
        AbstractC2855l.g(awaitingContainerChanges, "$awaitingContainerChanges");
        AbstractC2855l.g(operation, "$operation");
        AbstractC2855l.g(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    private final void G(Map map, View view) {
        String strH = AbstractC1658a0.H(view);
        if (strH != null) {
            map.put(strH, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC2855l.f(child, "child");
                    G(map, child);
                }
            }
        }
    }

    private final void H(C2892a c2892a, Collection collection) {
        Set entries = c2892a.entrySet();
        AbstractC2855l.f(entries, "entries");
        AbstractC2800q.I(entries, new d(collection));
    }

    private final void I(List list, List list2, boolean z10, Map map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                AbstractC2855l.f(context, "context");
                r.a aVarE = aVar.e(context);
                if (aVarE == null) {
                    aVar.a();
                } else {
                    final Animator animator = aVarE.f17498b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final Q.c cVarB = aVar.b();
                        Fragment fragmentH = cVarB.h();
                        if (AbstractC2855l.b(map.get(cVarB), Boolean.TRUE)) {
                            if (FragmentManager.J0(2)) {
                                Objects.toString(fragmentH);
                            }
                            aVar.a();
                        } else {
                            boolean z12 = cVarB.g() == Q.c.b.GONE;
                            if (z12) {
                                list2.remove(cVarB);
                            }
                            View view = fragmentH.mView;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z12, cVarB, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.J0(2)) {
                                cVarB.toString();
                            }
                            aVar.c().c(new d.a() { // from class: androidx.fragment.app.c
                                @Override // D0.d.a
                                public final void onCancel() {
                                    C1741i.J(animator, cVarB);
                                }
                            });
                            z11 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final Q.c cVarB2 = aVar2.b();
            Fragment fragmentH2 = cVarB2.h();
            if (z10) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(fragmentH2);
                }
                aVar2.a();
            } else if (z11) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(fragmentH2);
                }
                aVar2.a();
            } else {
                final View view2 = fragmentH2.mView;
                AbstractC2855l.f(context, "context");
                r.a aVarE2 = aVar2.e(context);
                if (aVarE2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = aVarE2.f17497a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (cVarB2.g() != Q.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    r.b bVar = new r.b(animation, q(), view2);
                    bVar.setAnimationListener(new f(cVarB2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (FragmentManager.J0(2)) {
                        cVarB2.toString();
                    }
                }
                aVar2.c().c(new d.a() { // from class: androidx.fragment.app.d
                    @Override // D0.d.a
                    public final void onCancel() {
                        C1741i.K(view2, this, aVar2, cVarB2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, Q.c operation) {
        AbstractC2855l.g(operation, "$operation");
        animator.end();
        if (FragmentManager.J0(2)) {
            Objects.toString(operation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, C1741i this$0, a animationInfo, Q.c operation) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(animationInfo, "$animationInfo");
        AbstractC2855l.g(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (FragmentManager.J0(2)) {
            Objects.toString(operation);
        }
    }

    private final Map L(List list, List list2, final boolean z10, final Q.c cVar, Q.c cVar2) {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        View view;
        Iterator it;
        Object obj3;
        Object obj4;
        View view2;
        LinkedHashMap linkedHashMap;
        boolean z11;
        Object obj5;
        Q.c cVar3;
        C2892a c2892a;
        Pair pairA;
        int i10;
        View view3;
        final View view4;
        C1741i c1741i = this;
        final Q.c cVar4 = cVar2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (!((c) obj6).d()) {
                arrayList2.add(obj6);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj7 : arrayList2) {
            if (((c) obj7).e() != null) {
                arrayList3.add(obj7);
            }
        }
        final L l10 = null;
        for (c cVar5 : arrayList3) {
            L lE = cVar5.e();
            if (l10 != null && lE != l10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar5.b().h() + " returned Transition " + cVar5.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            l10 = lE;
        }
        if (l10 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c cVar6 = (c) it2.next();
                linkedHashMap2.put(cVar6.b(), Boolean.FALSE);
                cVar6.a();
            }
        } else {
            View view5 = new View(c1741i.q().getContext());
            final Rect rect = new Rect();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            C2892a c2892a2 = new C2892a();
            Iterator it3 = list.iterator();
            Object obj8 = null;
            View view6 = null;
            boolean z12 = false;
            while (true) {
                obj = obj8;
                if (!it3.hasNext()) {
                    break;
                }
                c cVar7 = (c) it3.next();
                if (!cVar7.i() || cVar == null || cVar4 == null) {
                    c2892a = c2892a2;
                    view5 = view5;
                    linkedHashMap2 = linkedHashMap2;
                    arrayList5 = arrayList5;
                    obj8 = obj;
                    arrayList4 = arrayList4;
                    view6 = view6;
                    c2892a2 = c2892a;
                } else {
                    Object objU = l10.u(l10.f(cVar7.g()));
                    ArrayList<String> sharedElementSourceNames = cVar4.h().getSharedElementSourceNames();
                    AbstractC2855l.f(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = cVar.h().getSharedElementSourceNames();
                    AbstractC2855l.f(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = cVar.h().getSharedElementTargetNames();
                    View view7 = view6;
                    AbstractC2855l.f(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    int i11 = 0;
                    while (i11 < size) {
                        int i12 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i11));
                        ArrayList<String> arrayList6 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i11));
                        }
                        i11++;
                        size = i12;
                        sharedElementTargetNames = arrayList6;
                    }
                    ArrayList<String> sharedElementTargetNames2 = cVar4.h().getSharedElementTargetNames();
                    AbstractC2855l.f(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    if (z10) {
                        cVar.h().getEnterTransitionCallback();
                        cVar4.h().getExitTransitionCallback();
                        pairA = i7.t.a(null, null);
                    } else {
                        cVar.h().getExitTransitionCallback();
                        cVar4.h().getEnterTransitionCallback();
                        pairA = i7.t.a(null, null);
                    }
                    android.support.v4.media.session.b.a(pairA.getFirst());
                    android.support.v4.media.session.b.a(pairA.getSecond());
                    int i13 = 0;
                    for (int size2 = sharedElementSourceNames.size(); i13 < size2; size2 = size2) {
                        c2892a2.put(sharedElementSourceNames.get(i13), sharedElementTargetNames2.get(i13));
                        i13++;
                    }
                    if (FragmentManager.J0(2)) {
                        for (String str : sharedElementTargetNames2) {
                        }
                        for (String str2 : sharedElementSourceNames) {
                        }
                    }
                    C2892a c2892a3 = new C2892a();
                    View view8 = cVar.h().mView;
                    AbstractC2855l.f(view8, "firstOut.fragment.mView");
                    c1741i.G(c2892a3, view8);
                    c2892a3.n(sharedElementSourceNames);
                    c2892a2.n(c2892a3.keySet());
                    final C2892a c2892a4 = new C2892a();
                    View view9 = cVar4.h().mView;
                    View view10 = view5;
                    AbstractC2855l.f(view9, "lastIn.fragment.mView");
                    c1741i.G(c2892a4, view9);
                    c2892a4.n(sharedElementTargetNames2);
                    c2892a4.n(c2892a2.values());
                    J.c(c2892a2, c2892a4);
                    Set setKeySet = c2892a2.keySet();
                    AbstractC2855l.f(setKeySet, "sharedElementNameMapping.keys");
                    c1741i.H(c2892a3, setKeySet);
                    Collection collectionValues = c2892a2.values();
                    AbstractC2855l.f(collectionValues, "sharedElementNameMapping.values");
                    c1741i.H(c2892a4, collectionValues);
                    if (c2892a2.isEmpty()) {
                        arrayList4.clear();
                        arrayList5.clear();
                        view6 = view7;
                        linkedHashMap2 = linkedHashMap3;
                        view5 = view10;
                        obj8 = null;
                    } else {
                        c2892a = c2892a2;
                        J.a(cVar4.h(), cVar.h(), z10, c2892a3, true);
                        androidx.core.view.L.a(c1741i.q(), new Runnable() { // from class: androidx.fragment.app.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1741i.P(cVar4, cVar, z10, c2892a4);
                            }
                        });
                        arrayList4.addAll(c2892a3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i10 = 0;
                            view3 = view7;
                        } else {
                            i10 = 0;
                            view3 = (View) c2892a3.get(sharedElementSourceNames.get(0));
                            l10.p(objU, view3);
                        }
                        arrayList5.addAll(c2892a4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) c2892a4.get(sharedElementTargetNames2.get(i10))) != null) {
                            androidx.core.view.L.a(c1741i.q(), new Runnable() { // from class: androidx.fragment.app.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1741i.M(l10, view4, rect);
                                }
                            });
                            z12 = true;
                        }
                        l10.s(objU, view10, arrayList4);
                        ArrayList arrayList7 = arrayList5;
                        l10.n(objU, null, null, null, null, objU, arrayList7);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap3.put(cVar, bool);
                        linkedHashMap3.put(cVar4, bool);
                        view5 = view10;
                        view6 = view3;
                        obj8 = objU;
                        linkedHashMap2 = linkedHashMap3;
                        arrayList5 = arrayList7;
                        arrayList4 = arrayList4;
                        c2892a2 = c2892a;
                    }
                }
            }
            ArrayList arrayList8 = arrayList4;
            C2892a c2892a5 = c2892a2;
            ArrayList arrayList9 = arrayList5;
            View view11 = view6;
            boolean z13 = true;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            View view12 = view5;
            boolean z14 = false;
            ArrayList arrayList10 = new ArrayList();
            Iterator it4 = list.iterator();
            Object objK = null;
            Object objK2 = null;
            while (it4.hasNext()) {
                c cVar8 = (c) it4.next();
                if (cVar8.d()) {
                    linkedHashMap4.put(cVar8.b(), Boolean.FALSE);
                    cVar8.a();
                } else {
                    Object objF = l10.f(cVar8.h());
                    Q.c cVarB = cVar8.b();
                    boolean z15 = (obj == null || !(cVarB == cVar || cVarB == cVar4)) ? z14 : z13;
                    if (objF != null) {
                        LinkedHashMap linkedHashMap5 = linkedHashMap4;
                        final ArrayList arrayList11 = new ArrayList();
                        View view13 = cVarB.h().mView;
                        AbstractC2855l.f(view13, "operation.fragment.mView");
                        c1741i.E(arrayList11, view13);
                        if (z15) {
                            if (cVarB == cVar) {
                                arrayList11.removeAll(AbstractC2800q.T0(arrayList8));
                            } else {
                                arrayList11.removeAll(AbstractC2800q.T0(arrayList9));
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            l10.a(objF, view12);
                            view = view12;
                            it = it4;
                            obj5 = objK;
                            obj4 = objK2;
                            obj2 = objF;
                            cVar3 = cVarB;
                            arrayList = arrayList9;
                            obj3 = obj;
                            view2 = view11;
                            linkedHashMap = linkedHashMap5;
                            z11 = true;
                        } else {
                            l10.b(objF, arrayList11);
                            Object obj9 = objK;
                            obj2 = objF;
                            arrayList = arrayList9;
                            view = view12;
                            it = it4;
                            obj3 = obj;
                            obj4 = objK2;
                            view2 = view11;
                            linkedHashMap = linkedHashMap5;
                            z11 = true;
                            obj5 = obj9;
                            l10.n(obj2, obj2, arrayList11, null, null, null, null);
                            if (cVarB.g() == Q.c.b.GONE) {
                                cVar3 = cVarB;
                                list2.remove(cVar3);
                                ArrayList arrayList12 = new ArrayList(arrayList11);
                                arrayList12.remove(cVar3.h().mView);
                                l10.m(obj2, cVar3.h().mView, arrayList12);
                                androidx.core.view.L.a(q(), new Runnable() { // from class: androidx.fragment.app.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1741i.N(arrayList11);
                                    }
                                });
                            } else {
                                cVar3 = cVarB;
                            }
                        }
                        if (cVar3.g() == Q.c.b.VISIBLE) {
                            arrayList10.addAll(arrayList11);
                            if (z12) {
                                l10.o(obj2, rect);
                            }
                        } else {
                            l10.p(obj2, view2);
                        }
                        linkedHashMap.put(cVar3, Boolean.TRUE);
                        if (cVar8.j()) {
                            objK = l10.k(obj5, obj2, null);
                            objK2 = obj4;
                            view11 = view2;
                            linkedHashMap4 = linkedHashMap;
                            obj = obj3;
                            z13 = z11;
                            view12 = view;
                            arrayList9 = arrayList;
                            z14 = false;
                            c1741i = this;
                        } else {
                            objK2 = l10.k(obj4, obj2, null);
                            c1741i = this;
                            view11 = view2;
                            linkedHashMap4 = linkedHashMap;
                            objK = obj5;
                            obj = obj3;
                            z13 = z11;
                            view12 = view;
                            arrayList9 = arrayList;
                            z14 = false;
                        }
                        it4 = it;
                        cVar4 = cVar2;
                    } else if (!z15) {
                        linkedHashMap4.put(cVarB, Boolean.FALSE);
                        cVar8.a();
                    }
                }
            }
            boolean z16 = z13;
            linkedHashMap2 = linkedHashMap4;
            ArrayList arrayList13 = arrayList9;
            Object obj10 = obj;
            Object objJ = l10.j(objK, objK2, obj10);
            if (objJ != null) {
                ArrayList<c> arrayList14 = new ArrayList();
                for (Object obj11 : list) {
                    if (!((c) obj11).d()) {
                        arrayList14.add(obj11);
                    }
                }
                for (final c cVar9 : arrayList14) {
                    Object objH = cVar9.h();
                    final Q.c cVarB2 = cVar9.b();
                    boolean z17 = (obj10 == null || !(cVarB2 == cVar || cVarB2 == cVar2)) ? false : z16;
                    if (objH != null || z17) {
                        if (AbstractC1658a0.Q(q())) {
                            l10.q(cVar9.b().h(), objJ, cVar9.c(), new Runnable() { // from class: androidx.fragment.app.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1741i.O(cVar9, cVarB2);
                                }
                            });
                        } else {
                            if (FragmentManager.J0(2)) {
                                Objects.toString(q());
                                Objects.toString(cVarB2);
                            }
                            cVar9.a();
                        }
                    }
                }
                if (AbstractC1658a0.Q(q())) {
                    J.d(arrayList10, 4);
                    ArrayList arrayListL = l10.l(arrayList13);
                    if (FragmentManager.J0(2)) {
                        for (Object sharedElementFirstOutViews : arrayList8) {
                            AbstractC2855l.f(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view14 = (View) sharedElementFirstOutViews;
                            Objects.toString(view14);
                            AbstractC1658a0.H(view14);
                        }
                        for (Object sharedElementLastInViews : arrayList13) {
                            AbstractC2855l.f(sharedElementLastInViews, "sharedElementLastInViews");
                            View view15 = (View) sharedElementLastInViews;
                            Objects.toString(view15);
                            AbstractC1658a0.H(view15);
                        }
                    }
                    l10.c(q(), objJ);
                    l10.r(q(), arrayList8, arrayList13, arrayListL, c2892a5);
                    J.d(arrayList10, 0);
                    l10.t(obj10, arrayList8, arrayList13);
                    return linkedHashMap2;
                }
            }
        }
        return linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(L impl, View view, Rect lastInEpicenterRect) {
        AbstractC2855l.g(impl, "$impl");
        AbstractC2855l.g(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList transitioningViews) {
        AbstractC2855l.g(transitioningViews, "$transitioningViews");
        J.d(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c transitionInfo, Q.c operation) {
        AbstractC2855l.g(transitionInfo, "$transitionInfo");
        AbstractC2855l.g(operation, "$operation");
        transitionInfo.a();
        if (FragmentManager.J0(2)) {
            Objects.toString(operation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Q.c cVar, Q.c cVar2, boolean z10, C2892a lastInViews) {
        AbstractC2855l.g(lastInViews, "$lastInViews");
        J.a(cVar.h(), cVar2.h(), z10, lastInViews, false);
    }

    private final void Q(List list) {
        Fragment fragmentH = ((Q.c) AbstractC2800q.q0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Q.c cVar = (Q.c) it.next();
            cVar.h().mAnimationInfo.f17229c = fragmentH.mAnimationInfo.f17229c;
            cVar.h().mAnimationInfo.f17230d = fragmentH.mAnimationInfo.f17230d;
            cVar.h().mAnimationInfo.f17231e = fragmentH.mAnimationInfo.f17231e;
            cVar.h().mAnimationInfo.f17232f = fragmentH.mAnimationInfo.f17232f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    @Override // androidx.fragment.app.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(List operations, boolean z10) {
        Object obj;
        Object next;
        AbstractC2855l.g(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Q.c cVar = (Q.c) next;
            Q.c.b.a aVar = Q.c.b.f17431g;
            View view = cVar.h().mView;
            AbstractC2855l.f(view, "operation.fragment.mView");
            Q.c.b bVarA = aVar.a(view);
            Q.c.b bVar = Q.c.b.VISIBLE;
            if (bVarA == bVar && cVar.g() != bVar) {
                break;
            }
        }
        Q.c cVar2 = (Q.c) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            Q.c cVar3 = (Q.c) objPrevious;
            Q.c.b.a aVar2 = Q.c.b.f17431g;
            View view2 = cVar3.h().mView;
            AbstractC2855l.f(view2, "operation.fragment.mView");
            Q.c.b bVarA2 = aVar2.a(view2);
            Q.c.b bVar2 = Q.c.b.VISIBLE;
            if (bVarA2 != bVar2 && cVar3.g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        Q.c cVar4 = (Q.c) obj;
        if (FragmentManager.J0(2)) {
            Objects.toString(cVar2);
            Objects.toString(cVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List listR0 = AbstractC2800q.R0(operations);
        Q(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final Q.c cVar5 = (Q.c) it2.next();
            D0.d dVar = new D0.d();
            cVar5.l(dVar);
            arrayList.add(new a(cVar5, dVar, z10));
            D0.d dVar2 = new D0.d();
            cVar5.l(dVar2);
            boolean z11 = false;
            if (z10) {
                if (cVar5 == cVar2) {
                    z11 = true;
                }
            } else if (cVar5 == cVar4) {
            }
            arrayList2.add(new c(cVar5, dVar2, z10, z11));
            cVar5.c(new Runnable() { // from class: androidx.fragment.app.b
                @Override // java.lang.Runnable
                public final void run() {
                    C1741i.F(listR0, cVar5, this);
                }
            });
        }
        Map mapL = L(arrayList2, listR0, z10, cVar2, cVar4);
        I(arrayList, listR0, mapL.containsValue(Boolean.TRUE), mapL);
        Iterator it3 = listR0.iterator();
        while (it3.hasNext()) {
            D((Q.c) it3.next());
        }
        listR0.clear();
        if (FragmentManager.J0(2)) {
            Objects.toString(cVar2);
            Objects.toString(cVar4);
        }
    }
}
