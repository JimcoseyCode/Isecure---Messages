package a9;

import R8.AbstractC1429q;
import R8.C1425o;
import R8.InterfaceC1421m;
import R8.S;
import R8.d1;
import W8.B;
import a9.f;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class f extends i implements InterfaceC1601a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13691i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f13692h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class a implements InterfaceC1421m, d1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C1425o f13693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f13694h;

        public a(C1425o c1425o, Object obj) {
            this.f13693g = c1425o;
            this.f13694h = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2735B h(f fVar, a aVar, Throwable th) {
            fVar.c(aVar.f13694h);
            return C2735B.f28704a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2735B k(f fVar, a aVar, Throwable th, C2735B c2735b, n7.j jVar) {
            f.w().set(fVar, aVar.f13694h);
            fVar.c(aVar.f13694h);
            return C2735B.f28704a;
        }

        @Override // R8.d1
        public void b(B b10, int i10) {
            this.f13693g.b(b10, i10);
        }

        @Override // R8.InterfaceC1421m
        public boolean d() {
            return this.f13693g.d();
        }

        @Override // R8.InterfaceC1421m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void f(C2735B c2735b, o oVar) {
            f.w().set(f.this, this.f13694h);
            C1425o c1425o = this.f13693g;
            final f fVar = f.this;
            c1425o.P(c2735b, new Function1() { // from class: a9.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.h(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // R8.InterfaceC1421m
        public void g(Function1 function1) {
            this.f13693g.g(function1);
        }

        @Override // n7.f
        public n7.j getContext() {
            return this.f13693g.getContext();
        }

        @Override // R8.InterfaceC1421m
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object o(C2735B c2735b, Object obj, o oVar) {
            final f fVar = f.this;
            Object objO = this.f13693g.o(c2735b, obj, new o() { // from class: a9.d
                @Override // w7.o
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.k(fVar, this, (Throwable) obj2, (C2735B) obj3, (n7.j) obj4);
                }
            });
            if (objO != null) {
                f.w().set(f.this, this.f13694h);
            }
            return objO;
        }

        @Override // R8.InterfaceC1421m
        public boolean isCancelled() {
            return this.f13693g.isCancelled();
        }

        @Override // R8.InterfaceC1421m
        public boolean isCompleted() {
            return this.f13693g.isCompleted();
        }

        @Override // R8.InterfaceC1421m
        public Object j(Throwable th) {
            return this.f13693g.j(th);
        }

        @Override // R8.InterfaceC1421m
        public boolean n(Throwable th) {
            return this.f13693g.n(th);
        }

        @Override // R8.InterfaceC1421m
        public void q(Object obj) {
            this.f13693g.q(obj);
        }

        @Override // n7.f
        public void resumeWith(Object obj) {
            this.f13693g.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f13696a;
        this.f13692h = new o() { // from class: a9.b
            @Override // w7.o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                f fVar = this.f13684g;
                android.support.v4.media.session.b.a(obj);
                return f.B(fVar, null, obj2, obj3);
            }
        };
    }

    private final Object A(Object obj, n7.f fVar) {
        C1425o c1425oB = AbstractC1429q.b(AbstractC3016b.c(fVar));
        try {
            e(new a(c1425oB, obj));
            Object objZ = c1425oB.z();
            if (objZ == AbstractC3016b.e()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objZ == AbstractC3016b.e() ? objZ : C2735B.f28704a;
        } catch (Throwable th) {
            c1425oB.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o B(final f fVar, Z8.a aVar, final Object obj, Object obj2) {
        return new o() { // from class: a9.c
            @Override // w7.o
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.C(this.f13685g, obj, (Throwable) obj3, obj4, (n7.j) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B C(f fVar, Object obj, Throwable th, Object obj2, n7.j jVar) {
        fVar.c(obj);
        return C2735B.f28704a;
    }

    private final int D(Object obj) {
        while (!q()) {
            if (obj == null) {
                return 1;
            }
            int iX = x(obj);
            if (iX == 1) {
                return 2;
            }
            if (iX == 2) {
                return 1;
            }
        }
        f13691i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f13691i;
    }

    private final int x(Object obj) {
        while (y()) {
            Object obj2 = f13691i.get(this);
            if (obj2 != g.f13696a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, n7.f fVar2) {
        if (fVar.b(obj)) {
            return C2735B.f28704a;
        }
        Object objA = fVar.A(obj, fVar2);
        return objA == AbstractC3016b.e() ? objA : C2735B.f28704a;
    }

    @Override // a9.InterfaceC1601a
    public Object a(Object obj, n7.f fVar) {
        return z(this, obj, fVar);
    }

    @Override // a9.InterfaceC1601a
    public boolean b(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // a9.InterfaceC1601a
    public void c(Object obj) {
        while (y()) {
            Object obj2 = f13691i.get(this);
            if (obj2 != g.f13696a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f13691i, this, obj2, g.f13696a)) {
                    p();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + S.b(this) + "[isLocked=" + y() + ",owner=" + f13691i.get(this) + ']';
    }

    public boolean y() {
        return i() == 0;
    }
}
