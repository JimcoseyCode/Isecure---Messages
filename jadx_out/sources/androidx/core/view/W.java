package androidx.core.view;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f16501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f16502h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Iterator f16503i;

    public W(Iterator it, Function1 function1) {
        this.f16501g = function1;
        this.f16503i = it;
    }

    private final void c(Object obj) {
        Iterator it = (Iterator) this.f16501g.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f16502h.add(this.f16503i);
            this.f16503i = it;
        } else {
            while (!this.f16503i.hasNext() && !this.f16502h.isEmpty()) {
                this.f16503i = (Iterator) AbstractC2800q.q0(this.f16502h);
                AbstractC2800q.H(this.f16502h);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16503i.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f16503i.next();
        c(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
