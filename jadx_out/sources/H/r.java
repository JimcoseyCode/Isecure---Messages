package H;

import androidx.lifecycle.AbstractC1776x;
import androidx.lifecycle.AbstractC1777y;
import androidx.lifecycle.B;
import i7.C2735B;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import n.InterfaceC2955a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC1777y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f3626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2955a f3627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AbstractC1776x f3628o;

    public r(Object obj, InterfaceC2955a mapFunction) {
        AbstractC2855l.g(mapFunction, "mapFunction");
        this.f3626m = obj;
        this.f3627n = mapFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final r rVar, AbstractC1776x abstractC1776x) {
        final Function1 function1 = new Function1() { // from class: H.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.v(this.f3624g, obj);
            }
        };
        super.o(abstractC1776x, new B() { // from class: H.q
            @Override // androidx.lifecycle.B
            public final void onChanged(Object obj) {
                r.w(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B v(r rVar, Object obj) {
        rVar.n(rVar.f3627n.apply(obj));
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.lifecycle.AbstractC1776x
    public Object e() {
        AbstractC1776x abstractC1776x = this.f3628o;
        return abstractC1776x == null ? this.f3626m : this.f3627n.apply(abstractC1776x.e());
    }

    public final void t(final AbstractC1776x liveDataSource) {
        AbstractC2855l.g(liveDataSource, "liveDataSource");
        AbstractC1776x abstractC1776x = this.f3628o;
        if (abstractC1776x != null) {
            AbstractC2855l.d(abstractC1776x);
            super.p(abstractC1776x);
        }
        this.f3628o = liveDataSource;
        y.e(new Runnable() { // from class: H.o
            @Override // java.lang.Runnable
            public final void run() {
                r.u(this.f3622g, liveDataSource);
            }
        });
    }
}
