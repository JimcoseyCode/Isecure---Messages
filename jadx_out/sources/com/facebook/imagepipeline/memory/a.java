package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import c2.k;
import c2.m;
import c2.p;
import com.facebook.react.uimanager.ViewDefaults;
import d2.AbstractC2325a;
import f2.InterfaceC2603d;
import f2.InterfaceC2605f;
import g3.E;
import g3.F;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceC2605f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC2603d f19868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final E f19869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f19870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f19871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0212a f19873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0212a f19874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f19875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19876j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C0212a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19878b;

        C0212a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f19878b;
            if (i12 < i10 || (i11 = this.f19877a) <= 0) {
                AbstractC2325a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f19878b), Integer.valueOf(this.f19877a));
            } else {
                this.f19877a = i11 - 1;
                this.f19878b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f19877a++;
            this.f19878b += i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(InterfaceC2603d interfaceC2603d, E e10, F f10) {
        this.f19867a = getClass();
        this.f19868b = (InterfaceC2603d) k.g(interfaceC2603d);
        E e11 = (E) k.g(e10);
        this.f19869c = e11;
        this.f19875i = (F) k.g(f10);
        this.f19870d = new SparseArray();
        if (e11.f28170f) {
            r();
        } else {
            v(new SparseIntArray(0));
        }
        this.f19871e = m.b();
        this.f19874h = new C0212a();
        this.f19873g = new C0212a();
    }

    private synchronized void i() {
        try {
            k.i(!t() || this.f19874h.f19878b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void j(SparseIntArray sparseIntArray) {
        this.f19870d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            this.f19870d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(p(iKeyAt), sparseIntArray.valueAt(i10), 0, this.f19869c.f28170f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b m(int i10) {
        return (com.facebook.imagepipeline.memory.b) this.f19870d.get(i10);
    }

    private synchronized void r() {
        try {
            SparseIntArray sparseIntArray = this.f19869c.f28167c;
            if (sparseIntArray != null) {
                j(sparseIntArray);
                this.f19872f = false;
            } else {
                this.f19872f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void v(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f19870d.clear();
            SparseIntArray sparseIntArray2 = this.f19869c.f28167c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int iKeyAt = sparseIntArray2.keyAt(i10);
                    this.f19870d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(p(iKeyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(iKeyAt, 0), this.f19869c.f28170f));
                }
                this.f19872f = false;
            } else {
                this.f19872f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void w() {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.B(this.f19867a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f19873g.f19877a), Integer.valueOf(this.f19873g.f19878b), Integer.valueOf(this.f19874h.f19877a), Integer.valueOf(this.f19874h.f19878b));
        }
    }

    protected abstract Object g(int i10);

    @Override // f2.InterfaceC2605f
    public Object get(int i10) throws Throwable {
        Object objG;
        Object objQ;
        i();
        int iN = n(i10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarL = l(iN);
                if (bVarL != null && (objQ = q(bVarL)) != null) {
                    k.i(this.f19871e.add(objQ));
                    int iO = o(objQ);
                    int iP = p(iO);
                    this.f19873g.b(iP);
                    this.f19874h.a(iP);
                    this.f19875i.b(iP);
                    w();
                    if (AbstractC2325a.w(2)) {
                        AbstractC2325a.z(this.f19867a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objQ)), Integer.valueOf(iO));
                    }
                    return objQ;
                }
                int iP2 = p(iN);
                if (!h(iP2)) {
                    throw new c(this.f19869c.f28165a, this.f19873g.f19878b, this.f19874h.f19878b, iP2);
                }
                this.f19873g.b(iP2);
                if (bVarL != null) {
                    bVarL.e();
                }
                try {
                    objG = g(iN);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f19873g.a(iP2);
                            com.facebook.imagepipeline.memory.b bVarL2 = l(iN);
                            if (bVarL2 != null) {
                                bVarL2.b();
                            }
                            p.c(th);
                            objG = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f19871e.add(objG));
                        z();
                        this.f19875i.a(iP2);
                        w();
                        if (AbstractC2325a.w(2)) {
                            AbstractC2325a.z(this.f19867a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objG)), Integer.valueOf(iN));
                        }
                    } finally {
                    }
                }
                return objG;
            } finally {
            }
        }
    }

    synchronized boolean h(int i10) {
        if (this.f19876j) {
            return true;
        }
        E e10 = this.f19869c;
        int i11 = e10.f28165a;
        int i12 = this.f19873g.f19878b;
        if (i10 > i11 - i12) {
            this.f19875i.f();
            return false;
        }
        int i13 = e10.f28166b;
        if (i10 > i13 - (i12 + this.f19874h.f19878b)) {
            y(i13 - i10);
        }
        if (i10 <= i11 - (this.f19873g.f19878b + this.f19874h.f19878b)) {
            return true;
        }
        this.f19875i.f();
        return false;
    }

    protected abstract void k(Object obj);

    synchronized com.facebook.imagepipeline.memory.b l(int i10) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f19870d.get(i10);
            if (bVar == null && this.f19872f) {
                if (AbstractC2325a.w(2)) {
                    AbstractC2325a.y(this.f19867a, "creating new bucket %s", Integer.valueOf(i10));
                }
                com.facebook.imagepipeline.memory.b bVarX = x(i10);
                this.f19870d.put(i10, bVarX);
                return bVarX;
            }
            return bVar;
        } finally {
        }
    }

    protected abstract int n(int i10);

    protected abstract int o(Object obj);

    protected abstract int p(int i10);

    protected synchronized Object q(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    @Override // f2.InterfaceC2605f, g2.h
    public void release(Object obj) {
        k.g(obj);
        int iO = o(obj);
        int iP = p(iO);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarM = m(iO);
                if (!this.f19871e.remove(obj)) {
                    AbstractC2325a.k(this.f19867a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iO));
                    k(obj);
                    this.f19875i.e(iP);
                } else if (bVarM == null || bVarM.f() || t() || !u(obj)) {
                    if (bVarM != null) {
                        bVarM.b();
                    }
                    if (AbstractC2325a.w(2)) {
                        AbstractC2325a.z(this.f19867a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iO));
                    }
                    k(obj);
                    this.f19873g.a(iP);
                    this.f19875i.e(iP);
                } else {
                    bVarM.h(obj);
                    this.f19874h.b(iP);
                    this.f19873g.a(iP);
                    this.f19875i.g(iP);
                    if (AbstractC2325a.w(2)) {
                        AbstractC2325a.z(this.f19867a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iO));
                    }
                }
                w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void s() {
        this.f19868b.a(this);
        this.f19875i.c(this);
    }

    synchronized boolean t() {
        boolean z10;
        z10 = this.f19873g.f19878b + this.f19874h.f19878b > this.f19869c.f28166b;
        if (z10) {
            this.f19875i.d();
        }
        return z10;
    }

    protected boolean u(Object obj) {
        k.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b x(int i10) {
        return new com.facebook.imagepipeline.memory.b(p(i10), ViewDefaults.NUMBER_OF_LINES, 0, this.f19869c.f28170f);
    }

    synchronized void y(int i10) {
        try {
            int i11 = this.f19873g.f19878b;
            int i12 = this.f19874h.f19878b;
            int iMin = Math.min((i11 + i12) - i10, i12);
            if (iMin <= 0) {
                return;
            }
            if (AbstractC2325a.w(2)) {
                AbstractC2325a.A(this.f19867a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f19873g.f19878b + this.f19874h.f19878b), Integer.valueOf(iMin));
            }
            w();
            for (int i13 = 0; i13 < this.f19870d.size() && iMin > 0; i13++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) k.g((com.facebook.imagepipeline.memory.b) this.f19870d.valueAt(i13));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    k(objG);
                    int i14 = bVar.f19879a;
                    iMin -= i14;
                    this.f19874h.a(i14);
                }
            }
            w();
            if (AbstractC2325a.w(2)) {
                AbstractC2325a.z(this.f19867a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f19873g.f19878b + this.f19874h.f19878b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void z() {
        if (t()) {
            y(this.f19869c.f28166b);
        }
    }

    public a(InterfaceC2603d interfaceC2603d, E e10, F f10, boolean z10) {
        this(interfaceC2603d, e10, f10);
        this.f19876j = z10;
    }
}
