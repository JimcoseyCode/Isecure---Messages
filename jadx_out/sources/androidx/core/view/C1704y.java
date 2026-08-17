package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1704y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f16631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f16632b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f16633c = new HashMap();

    /* JADX INFO: renamed from: androidx.core.view.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC1764k f16634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1768o f16635b;

        a(AbstractC1764k abstractC1764k, InterfaceC1768o interfaceC1768o) {
            this.f16634a = abstractC1764k;
            this.f16635b = interfaceC1768o;
            abstractC1764k.a(interfaceC1768o);
        }

        void a() {
            this.f16634a.d(this.f16635b);
            this.f16635b = null;
        }
    }

    public C1704y(Runnable runnable) {
        this.f16631a = runnable;
    }

    public static /* synthetic */ void a(C1704y c1704y, AbstractC1764k.b bVar, B b10, androidx.lifecycle.r rVar, AbstractC1764k.a aVar) {
        c1704y.getClass();
        if (aVar == AbstractC1764k.a.m(bVar)) {
            c1704y.c(b10);
            return;
        }
        if (aVar == AbstractC1764k.a.ON_DESTROY) {
            c1704y.j(b10);
        } else if (aVar == AbstractC1764k.a.j(bVar)) {
            c1704y.f16632b.remove(b10);
            c1704y.f16631a.run();
        }
    }

    public static /* synthetic */ void b(C1704y c1704y, B b10, androidx.lifecycle.r rVar, AbstractC1764k.a aVar) {
        c1704y.getClass();
        if (aVar == AbstractC1764k.a.ON_DESTROY) {
            c1704y.j(b10);
        }
    }

    public void c(B b10) {
        this.f16632b.add(b10);
        this.f16631a.run();
    }

    public void d(final B b10, androidx.lifecycle.r rVar) {
        c(b10);
        AbstractC1764k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f16633c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16633c.put(b10, new a(lifecycle, new InterfaceC1768o() { // from class: androidx.core.view.x
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(androidx.lifecycle.r rVar2, AbstractC1764k.a aVar2) {
                C1704y.b(this.f16629g, b10, rVar2, aVar2);
            }
        }));
    }

    public void e(final B b10, androidx.lifecycle.r rVar, final AbstractC1764k.b bVar) {
        AbstractC1764k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f16633c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16633c.put(b10, new a(lifecycle, new InterfaceC1768o() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(androidx.lifecycle.r rVar2, AbstractC1764k.a aVar2) {
                C1704y.a(this.f16626g, bVar, b10, rVar2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f16632b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).c(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f16632b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f16632b.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f16632b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).d(menu);
        }
    }

    public void j(B b10) {
        this.f16632b.remove(b10);
        a aVar = (a) this.f16633c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16631a.run();
    }
}
