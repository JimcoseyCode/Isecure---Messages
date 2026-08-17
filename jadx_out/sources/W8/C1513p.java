package W8;

import R8.S;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: W8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1513p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12194g = AtomicReferenceFieldUpdater.newUpdater(C1513p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12195h = AtomicReferenceFieldUpdater.newUpdater(C1513p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12196i = AtomicReferenceFieldUpdater.newUpdater(C1513p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(W8.C1513p.f12194g, r3, r2, ((W8.y) r4).f12212a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C1513p g() {
        while (true) {
            C1513p c1513p = (C1513p) f12195h.get(this);
            C1513p c1513p2 = c1513p;
            while (true) {
                C1513p c1513p3 = null;
                while (true) {
                    Object obj = f12194g.get(c1513p2);
                    if (obj == this) {
                        if (c1513p == c1513p2 || androidx.concurrent.futures.b.a(f12195h, this, c1513p, c1513p2)) {
                            break;
                        }
                    } else {
                        if (q()) {
                            return null;
                        }
                        if (!(obj instanceof y)) {
                            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            c1513p3 = c1513p2;
                            c1513p2 = (C1513p) obj;
                        } else {
                            if (c1513p3 != null) {
                                break;
                            }
                            c1513p2 = (C1513p) f12195h.get(c1513p2);
                        }
                    }
                }
                c1513p2 = c1513p3;
            }
        }
    }

    private final C1513p h(C1513p c1513p) {
        while (c1513p.q()) {
            c1513p = (C1513p) f12195h.get(c1513p);
        }
        return c1513p;
    }

    private final void i(C1513p c1513p) {
        C1513p c1513p2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12195h;
        do {
            c1513p2 = (C1513p) atomicReferenceFieldUpdater.get(c1513p);
            if (k() != c1513p) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f12195h, c1513p, c1513p2, this));
        if (q()) {
            c1513p.g();
        }
    }

    private final y t() {
        y yVar = (y) f12196i.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f12196i.set(this, yVar2);
        return yVar2;
    }

    public final boolean b(C1513p c1513p, int i10) {
        C1513p c1513pM;
        do {
            c1513pM = m();
            if (c1513pM instanceof C1511n) {
                return (((C1511n) c1513pM).f12193j & i10) == 0 && c1513pM.b(c1513p, i10);
            }
        } while (!c1513pM.c(c1513p, this));
        return true;
    }

    public final boolean c(C1513p c1513p, C1513p c1513p2) {
        f12195h.set(c1513p, this);
        f12194g.set(c1513p, c1513p2);
        if (!androidx.concurrent.futures.b.a(f12194g, this, c1513p2, c1513p)) {
            return false;
        }
        c1513p.i(c1513p2);
        return true;
    }

    public final boolean e(C1513p c1513p) {
        f12195h.set(c1513p, this);
        f12194g.set(c1513p, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f12194g, this, this, c1513p)) {
                c1513p.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        b(new C1511n(i10), i10);
    }

    public final Object k() {
        return f12194g.get(this);
    }

    public final C1513p l() {
        C1513p c1513p;
        Object objK = k();
        y yVar = objK instanceof y ? (y) objK : null;
        if (yVar != null && (c1513p = yVar.f12212a) != null) {
            return c1513p;
        }
        AbstractC2855l.e(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C1513p) objK;
    }

    public final C1513p m() {
        C1513p c1513pG = g();
        return c1513pG == null ? h((C1513p) f12195h.get(this)) : c1513pG;
    }

    public boolean q() {
        return k() instanceof y;
    }

    public boolean r() {
        return s() == null;
    }

    public final C1513p s() {
        Object objK;
        C1513p c1513p;
        do {
            objK = k();
            if (objK instanceof y) {
                return ((y) objK).f12212a;
            }
            if (objK == this) {
                return (C1513p) objK;
            }
            AbstractC2855l.e(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c1513p = (C1513p) objK;
        } while (!androidx.concurrent.futures.b.a(f12194g, this, objK, c1513p.t()));
        c1513p.g();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.t(this) { // from class: W8.p.a
            @Override // C7.l
            public Object get() {
                return S.a(this.receiver);
            }
        } + '@' + S.b(this);
    }
}
