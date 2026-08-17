package androidx.lifecycle;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.E0;
import androidx.lifecycle.AbstractC1764k;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1766m extends AbstractC1765l implements InterfaceC1768o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1764k f17597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n7.j f17598h;

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f17600h;

        a(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = C1766m.this.new a(fVar);
            aVar.f17600h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(R8.N n10, n7.f fVar) {
            return ((a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f17599g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            R8.N n10 = (R8.N) this.f17600h;
            if (C1766m.this.a().b().compareTo(AbstractC1764k.b.f17591h) >= 0) {
                C1766m.this.a().a(C1766m.this);
            } else {
                E0.d(n10.i(), null, 1, null);
            }
            return C2735B.f28704a;
        }
    }

    public C1766m(AbstractC1764k lifecycle, n7.j coroutineContext) {
        AbstractC2855l.g(lifecycle, "lifecycle");
        AbstractC2855l.g(coroutineContext, "coroutineContext");
        this.f17597g = lifecycle;
        this.f17598h = coroutineContext;
        if (a().b() == AbstractC1764k.b.f17590g) {
            E0.d(i(), null, 1, null);
        }
    }

    public AbstractC1764k a() {
        return this.f17597g;
    }

    public final void b() {
        AbstractC1417k.d(this, C1404d0.c().O0(), null, new a(null), 2, null);
    }

    @Override // R8.N
    public n7.j i() {
        return this.f17598h;
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        if (a().b().compareTo(AbstractC1764k.b.f17590g) <= 0) {
            a().d(this);
            E0.d(i(), null, 1, null);
        }
    }
}
