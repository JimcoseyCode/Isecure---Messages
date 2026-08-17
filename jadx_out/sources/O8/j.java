package O8;

import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class j extends k implements Iterator, n7.f, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f8602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Iterator f8603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n7.f f8604j;

    private final Throwable k() {
        int i10 = this.f8601g;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8601g);
    }

    private final Object l() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // O8.k
    public Object c(Object obj, n7.f fVar) {
        this.f8602h = obj;
        this.f8601g = 3;
        this.f8604j = fVar;
        Object objE = AbstractC3016b.e();
        if (objE == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objE == AbstractC3016b.e() ? objE : C2735B.f28704a;
    }

    @Override // n7.f
    public n7.j getContext() {
        return n7.k.f30068g;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f8601g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw k();
                }
                Iterator it = this.f8603i;
                AbstractC2855l.d(it);
                if (it.hasNext()) {
                    this.f8601g = 2;
                    return true;
                }
                this.f8603i = null;
            }
            this.f8601g = 5;
            n7.f fVar = this.f8604j;
            AbstractC2855l.d(fVar);
            this.f8604j = null;
            C2752o.a aVar = C2752o.f28721h;
            fVar.resumeWith(C2752o.b(C2735B.f28704a));
        }
    }

    @Override // O8.k
    public Object i(Iterator it, n7.f fVar) {
        if (!it.hasNext()) {
            return C2735B.f28704a;
        }
        this.f8603i = it;
        this.f8601g = 2;
        this.f8604j = fVar;
        Object objE = AbstractC3016b.e();
        if (objE == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objE == AbstractC3016b.e() ? objE : C2735B.f28704a;
    }

    public final void m(n7.f fVar) {
        this.f8604j = fVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f8601g;
        if (i10 == 0 || i10 == 1) {
            return l();
        }
        if (i10 == 2) {
            this.f8601g = 1;
            Iterator it = this.f8603i;
            AbstractC2855l.d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw k();
        }
        this.f8601g = 0;
        Object obj = this.f8602h;
        this.f8602h = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        AbstractC2753p.b(obj);
        this.f8601g = 4;
    }
}
