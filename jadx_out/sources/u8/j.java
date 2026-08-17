package U8;

import R8.D0;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2854k;
import kotlin.jvm.internal.z;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class j {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements U8.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ U8.b f11572g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f11573h;

        public a(U8.b bVar, Function2 function2) {
            this.f11572g = bVar;
            this.f11573h = function2;
        }

        @Override // U8.b
        public Object b(U8.c cVar, n7.f fVar) {
            Object objB = this.f11572g.b(new b(new z(), cVar, this.f11573h), fVar);
            return objB == AbstractC3016b.e() ? objB : C2735B.f28704a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b implements U8.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f11574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ U8.c f11575h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f11576i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f11577g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f11578h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f11579i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f11581k;

            a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11579i = obj;
                this.f11581k |= androidx.customview.widget.a.INVALID_ID;
                return b.this.l(null, this);
            }
        }

        b(z zVar, U8.c cVar, Function2 function2) {
            this.f11574g = zVar;
            this.f11575h = cVar;
            this.f11576i = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.l(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.l(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // U8.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object l(Object obj, n7.f fVar) {
            a aVar;
            b bVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f11581k;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f11581k = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object objInvoke = aVar.f11579i;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f11581k;
            if (i11 == 0) {
                AbstractC2753p.b(objInvoke);
                if (this.f11574g.f29399g) {
                    U8.c cVar = this.f11575h;
                    aVar.f11581k = 1;
                } else {
                    Function2 function2 = this.f11576i;
                    aVar.f11577g = this;
                    aVar.f11578h = obj;
                    aVar.f11581k = 2;
                    objInvoke = function2.invoke(obj, aVar);
                    if (objInvoke != objE) {
                        bVar = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                        }
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                AbstractC2753p.b(objInvoke);
                return C2735B.f28704a;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objInvoke);
                return C2735B.f28704a;
            }
            obj = aVar.f11578h;
            bVar = (b) aVar.f11577g;
            AbstractC2753p.b(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                return C2735B.f28704a;
            }
            bVar.f11574g.f29399g = true;
            U8.c cVar2 = bVar.f11575h;
            aVar.f11577g = null;
            aVar.f11578h = null;
            aVar.f11581k = 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements U8.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ U8.b f11582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f11583h;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f11584g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f11585h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f11587j;

            public a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11584g = obj;
                this.f11585h |= androidx.customview.widget.a.INVALID_ID;
                return c.this.b(null, this);
            }
        }

        public c(U8.b bVar, Function2 function2) {
            this.f11582g = bVar;
            this.f11583h = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // U8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(U8.c cVar, n7.f fVar) {
            a aVar;
            d dVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f11585h;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f11585h = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object obj = aVar.f11584g;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f11585h;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                U8.b bVar = this.f11582g;
                d dVar2 = new d(this.f11583h, cVar);
                try {
                    aVar.f11587j = dVar2;
                    aVar.f11585h = 1;
                    if (bVar.b(dVar2, aVar) == objE) {
                        return objE;
                    }
                } catch (V8.a e10) {
                    e = e10;
                    dVar = dVar2;
                    V8.j.a(e, dVar);
                    D0.g(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) aVar.f11587j;
                try {
                    AbstractC2753p.b(obj);
                } catch (V8.a e11) {
                    e = e11;
                    V8.j.a(e, dVar);
                    D0.g(aVar.getContext());
                }
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements U8.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f11588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ U8.c f11589h;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f11590g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f11591h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f11592i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f11594k;

            public a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11591h = obj;
                this.f11592i |= androidx.customview.widget.a.INVALID_ID;
                return d.this.l(null, this);
            }
        }

        public d(Function2 function2, U8.c cVar) {
            this.f11588g = function2;
            this.f11589h = cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.l(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // U8.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object l(Object obj, n7.f fVar) {
            a aVar;
            Object obj2;
            Object obj3;
            d dVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f11592i;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f11592i = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object obj4 = aVar.f11591h;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f11592i;
            boolean z10 = true;
            if (i11 == 0) {
                AbstractC2753p.b(obj4);
                Function2 function2 = this.f11588g;
                aVar.f11590g = this;
                aVar.f11594k = obj;
                aVar.f11592i = 1;
                AbstractC2854k.c(6);
                Object objInvoke = function2.invoke(obj, aVar);
                AbstractC2854k.c(7);
                if (objInvoke != objE) {
                    obj2 = objInvoke;
                    obj3 = obj;
                    dVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) aVar.f11590g;
                AbstractC2753p.b(obj4);
                if (z10) {
                    throw new V8.a(dVar);
                }
                return C2735B.f28704a;
            }
            Object obj5 = aVar.f11594k;
            d dVar2 = (d) aVar.f11590g;
            AbstractC2753p.b(obj4);
            obj3 = obj5;
            dVar = dVar2;
            obj2 = obj4;
            if (((Boolean) obj2).booleanValue()) {
                U8.c cVar = dVar.f11589h;
                aVar.f11590g = dVar;
                aVar.f11594k = null;
                aVar.f11592i = 2;
            } else {
                z10 = false;
            }
            if (z10) {
            }
        }
    }

    public static final U8.b a(U8.b bVar, Function2 function2) {
        return new a(bVar, function2);
    }

    public static final U8.b b(U8.b bVar, Function2 function2) {
        return new c(bVar, function2);
    }
}
