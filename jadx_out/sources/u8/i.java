package U8;

import i7.AbstractC2738a;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2854k;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class i {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f11554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11556i;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11555h = obj;
            this.f11556i |= androidx.customview.widget.a.INVALID_ID;
            return i.c(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements U8.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ U8.b f11557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w7.o f11558h;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f11559g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f11560h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f11562j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f11563k;

            public a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11559g = obj;
                this.f11560h |= androidx.customview.widget.a.INVALID_ID;
                return b.this.b(null, this);
            }
        }

        public b(U8.b bVar, w7.o oVar) {
            this.f11557g = bVar;
            this.f11558h = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // U8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(U8.c cVar, n7.f fVar) throws Throwable {
            a aVar;
            b bVar;
            t tVar;
            w7.o oVar;
            V8.o oVar2;
            Throwable th;
            V8.o oVar3;
            Object objInvoke;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f11560h;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f11560h = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object obj = aVar.f11559g;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f11560h;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                try {
                    U8.b bVar2 = this.f11557g;
                    aVar.f11562j = this;
                    aVar.f11563k = cVar;
                    aVar.f11560h = 1;
                    if (bVar2.b(cVar, aVar) != objE) {
                        bVar = this;
                        oVar2 = new V8.o(cVar, aVar.getContext());
                        w7.o oVar4 = bVar.f11558h;
                        aVar.f11562j = oVar2;
                        aVar.f11563k = null;
                        aVar.f11560h = 3;
                        AbstractC2854k.c(6);
                        objInvoke = oVar4.invoke(oVar2, null, aVar);
                        AbstractC2854k.c(7);
                        if (objInvoke != objE) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = this;
                    tVar = new t(th);
                    oVar = bVar.f11558h;
                    aVar.f11562j = th;
                    aVar.f11563k = null;
                    aVar.f11560h = 2;
                    if (i.c(tVar, oVar, th, aVar) == objE) {
                    }
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th3 = (Throwable) aVar.f11562j;
                    AbstractC2753p.b(obj);
                    throw th3;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar3 = (V8.o) aVar.f11562j;
                try {
                    AbstractC2753p.b(obj);
                    oVar3.releaseIntercepted();
                    return C2735B.f28704a;
                } catch (Throwable th4) {
                    th = th4;
                    oVar3.releaseIntercepted();
                    throw th;
                }
            }
            cVar = (U8.c) aVar.f11563k;
            bVar = (b) aVar.f11562j;
            try {
                AbstractC2753p.b(obj);
                oVar2 = new V8.o(cVar, aVar.getContext());
            } catch (Throwable th5) {
                th = th5;
                tVar = new t(th);
                oVar = bVar.f11558h;
                aVar.f11562j = th;
                aVar.f11563k = null;
                aVar.f11560h = 2;
                if (i.c(tVar, oVar, th, aVar) == objE) {
                    throw th;
                }
            }
            try {
                w7.o oVar42 = bVar.f11558h;
                aVar.f11562j = oVar2;
                aVar.f11563k = null;
                aVar.f11560h = 3;
                AbstractC2854k.c(6);
                objInvoke = oVar42.invoke(oVar2, null, aVar);
                AbstractC2854k.c(7);
                if (objInvoke != objE) {
                    oVar3 = oVar2;
                    oVar3.releaseIntercepted();
                    return C2735B.f28704a;
                }
                return objE;
            } catch (Throwable th6) {
                th = th6;
                oVar3 = oVar2;
                oVar3.releaseIntercepted();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements U8.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f11564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ U8.b f11565h;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f11566g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f11567h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f11569j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f11570k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f11571l;

            public a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11566g = obj;
                this.f11567h |= androidx.customview.widget.a.INVALID_ID;
                return c.this.b(null, this);
            }
        }

        public c(Function2 function2, U8.b bVar) {
            this.f11564g = function2;
            this.f11565h = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.b(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // U8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(U8.c cVar, n7.f fVar) throws Throwable {
            a aVar;
            Throwable th;
            V8.o oVar;
            c cVar2;
            U8.c cVar3;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f11567h;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f11567h = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object obj = aVar.f11566g;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f11567h;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                V8.o oVar2 = new V8.o(cVar, aVar.getContext());
                try {
                    Function2 function2 = this.f11564g;
                    aVar.f11569j = this;
                    aVar.f11570k = cVar;
                    aVar.f11571l = oVar2;
                    aVar.f11567h = 1;
                    AbstractC2854k.c(6);
                    Object objInvoke = function2.invoke(oVar2, aVar);
                    AbstractC2854k.c(7);
                    if (objInvoke != objE) {
                        cVar2 = this;
                        cVar3 = cVar;
                        oVar = oVar2;
                        oVar.releaseIntercepted();
                        U8.b bVar = cVar2.f11565h;
                        aVar.f11569j = null;
                        aVar.f11570k = null;
                        aVar.f11571l = null;
                        aVar.f11567h = 2;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    oVar = oVar2;
                    oVar.releaseIntercepted();
                    throw th;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            oVar = (V8.o) aVar.f11571l;
            cVar3 = (U8.c) aVar.f11570k;
            cVar2 = (c) aVar.f11569j;
            try {
                AbstractC2753p.b(obj);
                oVar.releaseIntercepted();
                U8.b bVar2 = cVar2.f11565h;
                aVar.f11569j = null;
                aVar.f11570k = null;
                aVar.f11571l = null;
                aVar.f11567h = 2;
            } catch (Throwable th3) {
                th = th3;
                oVar.releaseIntercepted();
                throw th;
            }
        }
    }

    public static final void b(U8.c cVar) throws Throwable {
        if (cVar instanceof t) {
            throw ((t) cVar).f11615g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(U8.c cVar, w7.o oVar, Throwable th, n7.f fVar) {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f11556i;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f11556i = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f11555h;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f11556i;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                aVar.f11554g = th;
                aVar.f11556i = 1;
                if (oVar.invoke(cVar, th, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f11554g;
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC2738a.a(th2, th);
            }
            throw th2;
        }
    }

    public static final U8.b d(U8.b bVar, w7.o oVar) {
        return new b(bVar, oVar);
    }

    public static final U8.b e(U8.b bVar, Function2 function2) {
        return new c(function2, bVar);
    }
}
