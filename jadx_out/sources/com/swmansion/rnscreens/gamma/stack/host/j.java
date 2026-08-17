package com.swmansion.rnscreens.gamma.stack.host;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25153a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25154b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2884a.a((Integer) ((Pair) obj).c(), (Integer) ((Pair) obj2).c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2884a.a((Integer) ((Pair) obj).c(), (Integer) ((Pair) obj2).c());
        }
    }

    private final boolean d() {
        return (this.f25153a.isEmpty() && this.f25154b.isEmpty()) ? false : true;
    }

    public final void a(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25154b.add(new e(stackScreen));
    }

    public final void b(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25153a.add(new f(stackScreen));
    }

    public final void c(h container, List renderedScreens) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(renderedScreens, "renderedScreens");
        if (d()) {
            List<e> list = this.f25154b;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            for (e eVar : list) {
                arrayList.add(new Pair(Integer.valueOf(renderedScreens.indexOf(eVar.a())), eVar));
            }
            Iterator it = AbstractC2800q.N(AbstractC2800q.H0(arrayList, new a())).iterator();
            while (it.hasNext()) {
                container.a0(((e) ((Pair) it.next()).getSecond()).a());
            }
            List<f> list2 = this.f25153a;
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list2, 10));
            for (f fVar : list2) {
                arrayList2.add(new Pair(Integer.valueOf(renderedScreens.indexOf(fVar.a())), fVar));
            }
            Iterator it2 = AbstractC2800q.H0(arrayList2, new b()).iterator();
            while (it2.hasNext()) {
                container.b0(((f) ((Pair) it2.next()).getSecond()).a());
            }
            container.d0();
            this.f25154b.clear();
            this.f25153a.clear();
        }
    }
}
