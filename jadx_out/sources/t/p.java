package T;

import E.InterfaceC0450j;
import F.AbstractC0519y0;
import F.C0486h0;
import F.I;
import T.g;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class p extends AbstractC0519y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f10385c;

    p(I i10, g.a aVar) {
        super(i10);
        this.f10385c = aVar;
    }

    private int s(C0486h0 c0486h0) {
        Integer num = (Integer) c0486h0.g().f(C0486h0.f1473j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int t(C0486h0 c0486h0) {
        Integer num = (Integer) c0486h0.g().f(C0486h0.f1472i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // F.AbstractC0519y0, F.I
    public InterfaceFutureC2904a e(final List list, int i10, int i11) {
        H0.g.b(list.size() == 1, "Only support one capture config.");
        final InterfaceFutureC2904a interfaceFutureC2904aL = l(i10, 1);
        return J.n.k(Collections.singletonList(J.d.a(interfaceFutureC2904aL).e(new J.a() { // from class: T.m
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                return ((InterfaceC0450j) interfaceFutureC2904aL.get()).a();
            }
        }, I.c.b()).e(new J.a() { // from class: T.n
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                p pVar = this.f10382a;
                List list2 = list;
                return pVar.f10385c.a(pVar.s((C0486h0) list2.get(0)), pVar.t((C0486h0) list2.get(0)));
            }
        }, I.c.b()).e(new J.a() { // from class: T.o
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                return ((InterfaceC0450j) interfaceFutureC2904aL.get()).b();
            }
        }, I.c.b())));
    }
}
