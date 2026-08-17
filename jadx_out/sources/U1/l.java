package U1;

import U1.b;
import U1.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g.N element, int i10, boolean z10) {
        AbstractC2855l.g(element, "element");
        if (element instanceof g.C1465s) {
            return;
        }
        if (element instanceof g.L) {
            z10 = z10 || d((g.L) element);
            g.L l10 = (g.L) element;
            f(l10.f11018e, i10);
            f(l10.f11019f, i10);
            c(l10, i10, z10);
        }
        if (element instanceof g.J) {
            for (g.N n10 : ((g.J) element).b()) {
                AbstractC2855l.d(n10);
                a(n10, i10, z10);
            }
        }
    }

    public static final void b(g svg, int i10) {
        AbstractC2855l.g(svg, "svg");
        g.F fM = svg.m();
        List listD = svg.d();
        if (listD != null) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                f(((b.p) it.next()).f10862b, i10);
            }
        }
        f(fM.f11018e, i10);
        f(fM.f11019f, i10);
        AbstractC2855l.d(fM);
        boolean zD = d(fM);
        for (g.N n10 : fM.f11004i) {
            AbstractC2855l.d(n10);
            a(n10, i10, zD);
        }
    }

    public static final void c(g.L element, int i10, boolean z10) {
        AbstractC2855l.g(element, "element");
        if (z10) {
            return;
        }
        g.E e10 = element.f11019f;
        if (e10 == null) {
            e10 = new g.E();
            element.f11019f = e10;
        }
        g.C1453f c1453f = new g.C1453f(i10);
        if ((element instanceof g.C1468v) || (element instanceof g.C1451d) || (element instanceof g.C1455i) || (element instanceof g.B) || (element instanceof g.C) || (element instanceof g.C1463q) || (element instanceof g.A) || (element instanceof g.C1472z)) {
            e10.f10945h = c1453f;
            e10.f10944g = 1L;
        } else if (element instanceof g.Z) {
            e10.f10957t = c1453f;
            e10.f10944g = 4096L;
        }
    }

    public static final boolean d(g.L element) {
        g.O o10;
        AbstractC2855l.g(element, "element");
        g.E e10 = element.f11019f;
        if (e10 == null && element.f11018e == null) {
            return false;
        }
        if (e10 != null && (e10.f10957t != null || e10.f10945h != null || (o10 = e10.f10948k) != null || o10 != null || e10.f10933I != null || e10.f10938N != null)) {
            return true;
        }
        g.E e11 = element.f11018e;
        if (e11 == null) {
            return false;
        }
        return (e11.f10957t == null && e11.f10945h == null && e11.f10948k == null && e11.f10940P == null && e11.f10933I == null && e11.f10938N == null) ? false : true;
    }

    public static final void e(g.O o10, int i10) {
        if (!(o10 instanceof g.C1453f) || o10 == g.C1453f.f11076i) {
            return;
        }
        ((g.C1453f) o10).f11077g = i10;
    }

    public static final void f(g.E e10, int i10) {
        if (e10 == null) {
            return;
        }
        e(e10.f10957t, i10);
        e(e10.f10945h, i10);
        e(e10.f10948k, i10);
        e(e10.f10933I, i10);
        e(e10.f10938N, i10);
        e(e10.f10940P, i10);
    }
}
