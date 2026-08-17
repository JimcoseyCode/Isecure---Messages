package com.facebook.imagepipeline.producers;

import android.util.Pair;
import j3.C2768b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f20009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f20010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20013e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f20014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet f20015b = c2.m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Closeable f20016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f20017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C1969e f20019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f20020g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0213a extends AbstractC1970f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f20022a;

            C0213a(Pair pair) {
                this.f20022a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                boolean zRemove;
                List list;
                C1969e c1969e;
                List listT;
                List listR;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f20015b.remove(this.f20022a);
                        list = null;
                        if (!zRemove) {
                            c1969e = null;
                            listT = null;
                        } else if (a.this.f20015b.isEmpty()) {
                            c1969e = a.this.f20019f;
                            listT = null;
                        } else {
                            List listS = a.this.s();
                            listT = a.this.t();
                            listR = a.this.r();
                            c1969e = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1969e.c(list);
                C1969e.f(listT);
                C1969e.b(listR);
                if (c1969e != null) {
                    if (!U.this.f20011c || c1969e.A()) {
                        c1969e.g();
                    } else {
                        C1969e.f(c1969e.o(X2.f.f12439h));
                    }
                }
                if (zRemove) {
                    ((InterfaceC1978n) this.f20022a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1970f, com.facebook.imagepipeline.producers.f0
            public void b() {
                C1969e.b(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1970f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C1969e.f(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1970f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C1969e.c(a.this.s());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private class b extends AbstractC1967c {
            @Override // com.facebook.imagepipeline.producers.AbstractC1967c
            protected void f() {
                try {
                    if (C2768b.d()) {
                        C2768b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                } catch (Throwable th) {
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1967c
            protected void g(Throwable th) {
                try {
                    if (C2768b.d()) {
                        C2768b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th);
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                } catch (Throwable th2) {
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1967c
            protected void i(float f10) {
                try {
                    if (C2768b.d()) {
                        C2768b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                } catch (Throwable th) {
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                    throw th;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.AbstractC1967c
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(Closeable closeable, int i10) {
                try {
                    if (C2768b.d()) {
                        C2768b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                } catch (Throwable th) {
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                    throw th;
                }
            }

            private b() {
            }
        }

        public a(Object obj) {
            this.f20014a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.k(new C0213a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f20015b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).X()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f20015b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).A()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized X2.f l() {
            X2.f fVarJ;
            fVarJ = X2.f.f12439h;
            Iterator it = this.f20015b.iterator();
            while (it.hasNext()) {
                fVarJ = X2.f.j(fVarJ, ((e0) ((Pair) it.next()).second).getPriority());
            }
            return fVarJ;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(k2.e eVar) {
            synchronized (this) {
                try {
                    c2.k.b(Boolean.valueOf(this.f20019f == null));
                    c2.k.b(Boolean.valueOf(this.f20020g == null));
                    if (this.f20015b.isEmpty()) {
                        U.this.k(this.f20014a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f20015b.iterator().next()).second;
                    C1969e c1969e = new C1969e(e0Var.e(), e0Var.getId(), e0Var.W(), e0Var.d(), e0Var.d0(), k(), j(), l(), e0Var.m());
                    this.f20019f = c1969e;
                    c1969e.s(e0Var.getExtras());
                    if (eVar.j()) {
                        this.f20019f.J("started_as_prefetch", Boolean.valueOf(eVar.h()));
                    }
                    b bVar = new b();
                    this.f20020g = bVar;
                    U.this.f20010b.b(bVar, this.f20019f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            C1969e c1969e = this.f20019f;
            if (c1969e == null) {
                return null;
            }
            return c1969e.j(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List s() {
            C1969e c1969e = this.f20019f;
            if (c1969e == null) {
                return null;
            }
            return c1969e.n(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List t() {
            C1969e c1969e = this.f20019f;
            if (c1969e == null) {
                return null;
            }
            return c1969e.o(l());
        }

        public boolean h(InterfaceC1978n interfaceC1978n, e0 e0Var) {
            Pair pairCreate = Pair.create(interfaceC1978n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f20014a) != this) {
                        return false;
                    }
                    this.f20015b.add(pairCreate);
                    List listS = s();
                    List listT = t();
                    List listR = r();
                    Closeable closeableG = this.f20016c;
                    float f10 = this.f20017d;
                    int i10 = this.f20018e;
                    C1969e.c(listS);
                    C1969e.f(listT);
                    C1969e.b(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableG != this.f20016c) {
                                    closeableG = null;
                                } else if (closeableG != null) {
                                    closeableG = U.this.g(closeableG);
                                }
                            }
                            if (closeableG != null) {
                                if (f10 > 0.0f) {
                                    interfaceC1978n.b(f10);
                                }
                                interfaceC1978n.c(closeableG, i10);
                                i(closeableG);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    g(pairCreate, e0Var);
                    return true;
                } finally {
                }
            }
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f20020g != bVar) {
                        return;
                    }
                    this.f20020g = null;
                    this.f20019f = null;
                    i(this.f20016c);
                    this.f20016c = null;
                    q(k2.e.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void n(b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f20020g != bVar) {
                        return;
                    }
                    this.f20015b.clear();
                    U.this.k(this.f20014a, this);
                    i(this.f20016c);
                    this.f20016c = null;
                    for (Pair pair : this.f20015b) {
                        synchronized (pair) {
                            try {
                                ((e0) pair.second).W().k((e0) pair.second, U.this.f20012d, th, null);
                                C1969e c1969e = this.f20019f;
                                if (c1969e != null) {
                                    ((e0) pair.second).s(c1969e.getExtras());
                                }
                                ((InterfaceC1978n) pair.first).onFailure(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i10) {
            synchronized (this) {
                try {
                    if (this.f20020g != bVar) {
                        return;
                    }
                    i(this.f20016c);
                    this.f20016c = null;
                    int size = this.f20015b.size();
                    if (AbstractC1967c.e(i10)) {
                        this.f20016c = U.this.g(closeable);
                        this.f20018e = i10;
                    } else {
                        this.f20015b.clear();
                        U.this.k(this.f20014a, this);
                    }
                    for (Pair pair : this.f20015b) {
                        synchronized (pair) {
                            try {
                                if (AbstractC1967c.d(i10)) {
                                    ((e0) pair.second).W().j((e0) pair.second, U.this.f20012d, null);
                                    C1969e c1969e = this.f20019f;
                                    if (c1969e != null) {
                                        ((e0) pair.second).s(c1969e.getExtras());
                                    }
                                    ((e0) pair.second).J(U.this.f20013e, Integer.valueOf(size));
                                }
                                ((InterfaceC1978n) pair.first).c(closeable, i10);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void p(b bVar, float f10) {
            synchronized (this) {
                try {
                    if (this.f20020g != bVar) {
                        return;
                    }
                    this.f20017d = f10;
                    for (Pair pair : this.f20015b) {
                        synchronized (pair) {
                            ((InterfaceC1978n) pair.first).b(f10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f20009a.put(obj, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        a aVarI;
        boolean z10;
        try {
            if (C2768b.d()) {
                C2768b.a("MultiplexProducer#produceResults");
            }
            e0Var.W().e(e0Var, this.f20012d);
            Object objJ = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        aVarI = i(objJ);
                        if (aVarI == null) {
                            aVarI = h(objJ);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                    }
                }
            } while (!aVarI.h(interfaceC1978n, e0Var));
            if (z10) {
                aVarI.q(k2.e.k(e0Var.A()));
            }
            if (C2768b.d()) {
                C2768b.b();
            }
        } catch (Throwable th) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th;
        }
    }

    protected abstract Closeable g(Closeable closeable);

    protected synchronized a i(Object obj) {
        return (a) this.f20009a.get(obj);
    }

    protected abstract Object j(e0 e0Var);

    protected synchronized void k(Object obj, a aVar) {
        if (this.f20009a.get(obj) == aVar) {
            this.f20009a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z10) {
        this.f20010b = d0Var;
        this.f20009a = new HashMap();
        this.f20011c = z10;
        this.f20012d = str;
        this.f20013e = str2;
    }
}
