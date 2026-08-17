package N0;

import R8.A0;
import R8.AbstractC1417k;
import R8.N;
import R8.O;
import T8.k;
import com.facebook.react.uimanager.ViewDefaults;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T8.g f7694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1302b f7695d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.jvm.internal.n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ B f7697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2 f7698j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, B b10, Function2 function2) {
            super(1);
            this.f7696h = function1;
            this.f7697i = b10;
            this.f7698j = function2;
        }

        public final void a(Throwable th) {
            C2735B c2735b;
            this.f7696h.invoke(th);
            this.f7697i.f7694c.h(th);
            do {
                Object objD = T8.k.d(this.f7697i.f7694c.c());
                if (objD != null) {
                    this.f7698j.invoke(objD, th);
                    c2735b = C2735B.f28704a;
                } else {
                    c2735b = null;
                }
            } while (c2735b != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7700h;

        b(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return B.this.new b(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((b) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7700h;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                if (B.this.f7695d.b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                O.d(B.this.f7692a);
                function2 = B.this.f7693b;
                T8.g gVar = B.this.f7694c;
                this.f7699g = function2;
                this.f7700h = 1;
                obj = gVar.a(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                if (B.this.f7695d.a() == 0) {
                    return C2735B.f28704a;
                }
                O.d(B.this.f7692a);
                function2 = B.this.f7693b;
                T8.g gVar2 = B.this.f7694c;
                this.f7699g = function2;
                this.f7700h = 1;
                obj = gVar2.a(this);
                if (obj != objE) {
                    this.f7699g = null;
                    this.f7700h = 2;
                }
                return objE;
            }
            function2 = (Function2) this.f7699g;
            AbstractC2753p.b(obj);
            this.f7699g = null;
            this.f7700h = 2;
        }
    }

    public B(N scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        AbstractC2855l.g(scope, "scope");
        AbstractC2855l.g(onComplete, "onComplete");
        AbstractC2855l.g(onUndeliveredElement, "onUndeliveredElement");
        AbstractC2855l.g(consumeMessage, "consumeMessage");
        this.f7692a = scope;
        this.f7693b = consumeMessage;
        this.f7694c = T8.j.b(ViewDefaults.NUMBER_OF_LINES, null, null, 6, null);
        this.f7695d = new C1302b(0);
        A0 a02 = (A0) scope.i().e(A0.f10112c);
        if (a02 != null) {
            a02.g0(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objL = this.f7694c.l(obj);
        if (objL instanceof k.a) {
            Throwable thC = T8.k.c(objL);
            if (thC != null) {
                throw thC;
            }
            throw new T8.q("Channel was closed normally");
        }
        if (!T8.k.f(objL)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f7695d.c() == 0) {
            AbstractC1417k.d(this.f7692a, null, null, new b(null), 3, null);
        }
    }
}
