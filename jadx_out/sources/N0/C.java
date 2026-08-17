package N0;

import a9.InterfaceC1601a;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1601a f7703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1302b f7704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U8.b f7705d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7707h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7708i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7710k;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7708i = obj;
            this.f7710k |= androidx.customview.widget.a.INVALID_ID;
            return C.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f7712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7713i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7715k;

        b(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7713i = obj;
            this.f7715k |= androidx.customview.widget.a.INVALID_ID;
            return C.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7716g;

        c(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(U8.c cVar, n7.f fVar) {
            return ((c) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f7716g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return C2735B.f28704a;
        }
    }

    public C(String filePath) {
        AbstractC2855l.g(filePath, "filePath");
        this.f7702a = filePath;
        this.f7703b = a9.g.b(false, 1, null);
        this.f7704c = new C1302b(0);
        this.f7705d = U8.d.i(new c(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // N0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Function1 function1, n7.f fVar) throws Throwable {
        a aVar;
        InterfaceC1601a interfaceC1601a;
        Throwable th;
        InterfaceC1601a interfaceC1601a2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f7710k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f7710k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f7708i;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f7710k;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                interfaceC1601a = this.f7703b;
                aVar.f7706g = function1;
                aVar.f7707h = interfaceC1601a;
                aVar.f7710k = 1;
                if (interfaceC1601a.a(null, aVar) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1601a2 = (InterfaceC1601a) aVar.f7706g;
                try {
                    AbstractC2753p.b(obj);
                    interfaceC1601a2.c(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601a2.c(null);
                    throw th;
                }
            }
            InterfaceC1601a interfaceC1601a3 = (InterfaceC1601a) aVar.f7707h;
            Function1 function12 = (Function1) aVar.f7706g;
            AbstractC2753p.b(obj);
            interfaceC1601a = interfaceC1601a3;
            function1 = function12;
            aVar.f7706g = interfaceC1601a;
            aVar.f7707h = null;
            aVar.f7710k = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objE) {
                InterfaceC1601a interfaceC1601a4 = interfaceC1601a;
                obj = objInvoke;
                interfaceC1601a2 = interfaceC1601a4;
                interfaceC1601a2.c(null);
                return obj;
            }
            return objE;
        } catch (Throwable th3) {
            InterfaceC1601a interfaceC1601a5 = interfaceC1601a;
            th = th3;
            interfaceC1601a2 = interfaceC1601a5;
            interfaceC1601a2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // N0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Function2 function2, n7.f fVar) throws Throwable {
        b bVar;
        InterfaceC1601a interfaceC1601a;
        Throwable th;
        boolean z10;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f7715k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                bVar.f7715k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                bVar = new b(fVar);
            }
        }
        Object obj = bVar.f7713i;
        Object objE = AbstractC3016b.e();
        int i11 = bVar.f7715k;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f7712h;
            interfaceC1601a = (InterfaceC1601a) bVar.f7711g;
            try {
                AbstractC2753p.b(obj);
                if (z10) {
                    interfaceC1601a.c(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z10) {
                    interfaceC1601a.c(null);
                }
                throw th;
            }
        }
        AbstractC2753p.b(obj);
        InterfaceC1601a interfaceC1601a2 = this.f7703b;
        boolean zB = interfaceC1601a2.b(null);
        try {
            Object objA = kotlin.coroutines.jvm.internal.b.a(zB);
            bVar.f7711g = interfaceC1601a2;
            bVar.f7712h = zB;
            bVar.f7715k = 1;
            Object objInvoke = function2.invoke(objA, bVar);
            if (objInvoke == objE) {
                return objE;
            }
            interfaceC1601a = interfaceC1601a2;
            obj = objInvoke;
            z10 = zB;
            if (z10) {
            }
            return obj;
        } catch (Throwable th3) {
            interfaceC1601a = interfaceC1601a2;
            th = th3;
            z10 = zB;
            if (z10) {
            }
            throw th;
        }
    }

    @Override // N0.t
    public Object c(n7.f fVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f7704c.d());
    }

    @Override // N0.t
    public Object d(n7.f fVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f7704c.b());
    }

    @Override // N0.t
    public U8.b e() {
        return this.f7705d;
    }
}
