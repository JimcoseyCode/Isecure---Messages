package W8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: W8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1500c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12172a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1500c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12173b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1500c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1500c(AbstractC1500c abstractC1500c) {
        this._prev$volatile = abstractC1500c;
    }

    private final AbstractC1500c d() {
        AbstractC1500c abstractC1500cH = h();
        while (abstractC1500cH != null && abstractC1500cH.k()) {
            abstractC1500cH = (AbstractC1500c) f12173b.get(abstractC1500cH);
        }
        return abstractC1500cH;
    }

    private final AbstractC1500c e() {
        AbstractC1500c abstractC1500cF;
        AbstractC1500c abstractC1500cF2 = f();
        AbstractC2855l.d(abstractC1500cF2);
        while (abstractC1500cF2.k() && (abstractC1500cF = abstractC1500cF2.f()) != null) {
            abstractC1500cF2 = abstractC1500cF;
        }
        return abstractC1500cF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f12172a.get(this);
    }

    public final void c() {
        f12173b.set(this, null);
    }

    public final AbstractC1500c f() {
        Object objG = g();
        if (objG == AbstractC1499b.f12171a) {
            return null;
        }
        return (AbstractC1500c) objG;
    }

    public final AbstractC1500c h() {
        return (AbstractC1500c) f12173b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f12172a, this, null, AbstractC1499b.f12171a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC1500c abstractC1500cD = d();
            AbstractC1500c abstractC1500cE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12173b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC1500cE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC1500cE, obj, ((AbstractC1500c) obj) == null ? null : abstractC1500cD));
            if (abstractC1500cD != null) {
                f12172a.set(abstractC1500cD, abstractC1500cE);
            }
            if (!abstractC1500cE.k() || abstractC1500cE.l()) {
                if (abstractC1500cD == null || !abstractC1500cD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC1500c abstractC1500c) {
        return androidx.concurrent.futures.b.a(f12172a, this, null, abstractC1500c);
    }
}
