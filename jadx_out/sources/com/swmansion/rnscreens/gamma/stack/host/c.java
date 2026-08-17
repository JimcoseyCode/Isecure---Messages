package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.I;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private final void a(I i10, boolean z10) {
        if (z10) {
            i10.i();
        } else {
            i10.h();
        }
    }

    private final void b(I i10, boolean z10) {
        if (z10) {
            i10.k();
        } else {
            i10.j();
        }
    }

    private final void c(I i10, boolean z10, boolean z11) {
        if (z11) {
            b(i10, z10);
        } else {
            a(i10, z10);
        }
    }

    static /* synthetic */ void d(c cVar, I i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        cVar.c(i10, z10, z11);
    }

    public static /* synthetic */ void g(c cVar, FragmentManager fragmentManager, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        cVar.f(fragmentManager, list, z10);
    }

    public final void e(FragmentManager fragmentManager, a op) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(op, "op");
        I iA = Q6.c.a(fragmentManager);
        iA.b(op.d(), op.e());
        if (op.b()) {
            iA.g(op.e().w().getScreenKey());
        }
        d(this, iA, op.c(), false, 4, null);
    }

    public final void f(FragmentManager fragmentManager, List ops, boolean z10) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(ops, "ops");
        Iterator it = ops.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(fragmentManager, this);
        }
        if (z10) {
            fragmentManager.e0();
        }
    }

    public final void h(FragmentManager fragmentManager, d op) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(op, "op");
        fragmentManager.Z0(op.b().w().getScreenKey(), 1);
    }

    public final void i(FragmentManager fragmentManager, g op) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(op, "op");
        I iA = Q6.c.a(fragmentManager);
        iA.t(op.b());
        c(iA, true, false);
    }
}
