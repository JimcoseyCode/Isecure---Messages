package V8;

import R8.N;
import R8.O;
import R8.P;
import R8.S;
import T8.v;
import com.facebook.react.uimanager.ViewDefaults;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7.j f11849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T8.a f11851i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f11853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ U8.c f11854i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f11855j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U8.c cVar, e eVar, n7.f fVar) {
            super(2, fVar);
            this.f11854i = cVar;
            this.f11855j = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f11854i, this.f11855j, fVar);
            aVar.f11853h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f11852g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n10 = (N) this.f11853h;
                U8.c cVar = this.f11854i;
                v vVarJ = this.f11855j.j(n10);
                this.f11852g = 1;
                if (U8.d.e(cVar, vVarJ, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11857h;

        b(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T8.u uVar, n7.f fVar) {
            return ((b) create(uVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            b bVar = e.this.new b(fVar);
            bVar.f11857h = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f11856g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                T8.u uVar = (T8.u) this.f11857h;
                e eVar = e.this;
                this.f11856g = 1;
                if (eVar.f(uVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public e(n7.j jVar, int i10, T8.a aVar) {
        this.f11849g = jVar;
        this.f11850h = i10;
        this.f11851i = aVar;
    }

    static /* synthetic */ Object e(e eVar, U8.c cVar, n7.f fVar) {
        Object objC = O.c(new a(cVar, eVar, null), fVar);
        return objC == AbstractC3016b.e() ? objC : C2735B.f28704a;
    }

    @Override // U8.b
    public Object b(U8.c cVar, n7.f fVar) {
        return e(this, cVar, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // V8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public U8.b c(n7.j jVar, int i10, T8.a aVar) {
        n7.j jVarX = jVar.X(this.f11849g);
        if (aVar == T8.a.f10646g) {
            int i11 = this.f11850h;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 == -2) {
                            i10 = i11;
                        } else {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = ViewDefaults.NUMBER_OF_LINES;
                            }
                        }
                    }
                }
            }
            aVar = this.f11851i;
        }
        return (AbstractC2855l.b(jVarX, this.f11849g) && i10 == this.f11850h && aVar == this.f11851i) ? this : g(jVarX, i10, aVar);
    }

    protected String d() {
        return null;
    }

    protected abstract Object f(T8.u uVar, n7.f fVar);

    protected abstract e g(n7.j jVar, int i10, T8.a aVar);

    public final Function2 h() {
        return new b(null);
    }

    public final int i() {
        int i10 = this.f11850h;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public v j(N n10) {
        return T8.s.b(n10, this.f11849g, i(), this.f11851i, P.f10150i, null, h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        if (this.f11849g != n7.k.f30068g) {
            arrayList.add("context=" + this.f11849g);
        }
        if (this.f11850h != -3) {
            arrayList.add("capacity=" + this.f11850h);
        }
        if (this.f11851i != T8.a.f10646g) {
            arrayList.add("onBufferOverflow=" + this.f11851i);
        }
        return S.a(this) + '[' + AbstractC2800q.o0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
