package N0;

import N0.J;
import N0.w;
import R8.A0;
import R8.AbstractC1413i;
import R8.AbstractC1417k;
import R8.AbstractC1444y;
import R8.InterfaceC1440w;
import R8.N;
import a9.InterfaceC1601a;
import i7.AbstractC2738a;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import i7.C2752o;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: N0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1311k implements InterfaceC1309i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f7750m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f7751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1305e f7752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f7753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U8.b f7754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1601a f7755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A0 f7757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final N0.l f7758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f7759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f7760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f7761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B f7762l;

    /* JADX INFO: renamed from: N0.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: N0.k$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f7763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1311k f7764d;

        /* JADX INFO: renamed from: N0.k$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f7765g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f7766h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f7768j;

            a(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7766h = obj;
                this.f7768j |= androidx.customview.widget.a.INVALID_ID;
                return b.this.b(this);
            }
        }

        /* JADX INFO: renamed from: N0.k$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0075b extends kotlin.coroutines.jvm.internal.l implements Function1 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f7769g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f7770h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f7771i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f7772j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f7773k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f7774l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f7775m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C1311k f7776n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f7777o;

            /* JADX INFO: renamed from: N0.k$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class a implements N0.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC1601a f7778a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.z f7779b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.C f7780c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C1311k f7781d;

                /* JADX INFO: renamed from: N0.k$b$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
                static final class C0076a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f7782g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f7783h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    Object f7784i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f7785j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f7786k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    /* synthetic */ Object f7787l;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f7789n;

                    C0076a(n7.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f7787l = obj;
                        this.f7789n |= androidx.customview.widget.a.INVALID_ID;
                        return a.this.c(null, this);
                    }
                }

                a(InterfaceC1601a interfaceC1601a, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.C c10, C1311k c1311k) {
                    this.f7778a = interfaceC1601a;
                    this.f7779b = zVar;
                    this.f7780c = c10;
                    this.f7781d = c1311k;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // N0.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object c(Function2 function2, n7.f fVar) throws Throwable {
                    C0076a c0076a;
                    InterfaceC1601a interfaceC1601a;
                    C1311k c1311k;
                    kotlin.jvm.internal.z zVar;
                    kotlin.jvm.internal.C c10;
                    InterfaceC1601a interfaceC1601a2;
                    InterfaceC1601a interfaceC1601a3;
                    C1311k c1311k2;
                    Object obj;
                    kotlin.jvm.internal.C c11;
                    if (fVar instanceof C0076a) {
                        c0076a = (C0076a) fVar;
                        int i10 = c0076a.f7789n;
                        if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                            c0076a.f7789n = i10 - androidx.customview.widget.a.INVALID_ID;
                        } else {
                            c0076a = new C0076a(fVar);
                        }
                    }
                    Object obj2 = c0076a.f7787l;
                    Object objE = AbstractC3016b.e();
                    int i11 = c0076a.f7789n;
                    try {
                        if (i11 == 0) {
                            AbstractC2753p.b(obj2);
                            interfaceC1601a = this.f7778a;
                            kotlin.jvm.internal.z zVar2 = this.f7779b;
                            kotlin.jvm.internal.C c12 = this.f7780c;
                            c1311k = this.f7781d;
                            c0076a.f7782g = function2;
                            c0076a.f7783h = interfaceC1601a;
                            c0076a.f7784i = zVar2;
                            c0076a.f7785j = c12;
                            c0076a.f7786k = c1311k;
                            c0076a.f7789n = 1;
                            if (interfaceC1601a.a(null, c0076a) != objE) {
                                zVar = zVar2;
                                c10 = c12;
                            }
                            return objE;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0076a.f7784i;
                                c11 = (kotlin.jvm.internal.C) c0076a.f7783h;
                                interfaceC1601a2 = (InterfaceC1601a) c0076a.f7782g;
                                try {
                                    AbstractC2753p.b(obj2);
                                    c11.f29371g = obj;
                                    c10 = c11;
                                    Object obj3 = c10.f29371g;
                                    interfaceC1601a2.c(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC1601a2.c(null);
                                    throw th;
                                }
                            }
                            c1311k2 = (C1311k) c0076a.f7784i;
                            c10 = (kotlin.jvm.internal.C) c0076a.f7783h;
                            interfaceC1601a3 = (InterfaceC1601a) c0076a.f7782g;
                            try {
                                AbstractC2753p.b(obj2);
                                if (!AbstractC2855l.b(obj2, c10.f29371g)) {
                                    interfaceC1601a2 = interfaceC1601a3;
                                    Object obj32 = c10.f29371g;
                                    interfaceC1601a2.c(null);
                                    return obj32;
                                }
                                c0076a.f7782g = interfaceC1601a3;
                                c0076a.f7783h = c10;
                                c0076a.f7784i = obj2;
                                c0076a.f7789n = 3;
                                if (c1311k2.C(obj2, false, c0076a) != objE) {
                                    obj = obj2;
                                    c11 = c10;
                                    interfaceC1601a2 = interfaceC1601a3;
                                    c11.f29371g = obj;
                                    c10 = c11;
                                    Object obj322 = c10.f29371g;
                                    interfaceC1601a2.c(null);
                                    return obj322;
                                }
                                return objE;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC1601a2 = interfaceC1601a3;
                                interfaceC1601a2.c(null);
                                throw th;
                            }
                        }
                        C1311k c1311k3 = (C1311k) c0076a.f7786k;
                        c10 = (kotlin.jvm.internal.C) c0076a.f7785j;
                        zVar = (kotlin.jvm.internal.z) c0076a.f7784i;
                        InterfaceC1601a interfaceC1601a4 = (InterfaceC1601a) c0076a.f7783h;
                        Function2 function22 = (Function2) c0076a.f7782g;
                        AbstractC2753p.b(obj2);
                        c1311k = c1311k3;
                        function2 = function22;
                        interfaceC1601a = interfaceC1601a4;
                        if (zVar.f29399g) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj4 = c10.f29371g;
                        c0076a.f7782g = interfaceC1601a;
                        c0076a.f7783h = c10;
                        c0076a.f7784i = c1311k;
                        c0076a.f7785j = null;
                        c0076a.f7786k = null;
                        c0076a.f7789n = 2;
                        Object objInvoke = function2.invoke(obj4, c0076a);
                        if (objInvoke != objE) {
                            interfaceC1601a3 = interfaceC1601a;
                            obj2 = objInvoke;
                            c1311k2 = c1311k;
                            if (!AbstractC2855l.b(obj2, c10.f29371g)) {
                            }
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC1601a2 = interfaceC1601a;
                        interfaceC1601a2.c(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0075b(C1311k c1311k, b bVar, n7.f fVar) {
                super(1, fVar);
                this.f7776n = c1311k;
                this.f7777o = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(n7.f fVar) {
                return new C0075b(this.f7776n, this.f7777o, fVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws C1304d {
                InterfaceC1601a interfaceC1601aB;
                kotlin.jvm.internal.z zVar;
                kotlin.jvm.internal.C c10;
                kotlin.jvm.internal.C c11;
                kotlin.jvm.internal.z zVar2;
                InterfaceC1601a interfaceC1601a;
                Iterator it;
                InterfaceC1601a interfaceC1601a2;
                kotlin.jvm.internal.z zVar3;
                kotlin.jvm.internal.C c12;
                a aVar;
                kotlin.jvm.internal.C c13;
                Object obj2;
                int i10;
                Object objE = AbstractC3016b.e();
                int i11 = this.f7775m;
                if (i11 == 0) {
                    AbstractC2753p.b(obj);
                    interfaceC1601aB = a9.g.b(false, 1, null);
                    zVar = new kotlin.jvm.internal.z();
                    c10 = new kotlin.jvm.internal.C();
                    C1311k c1311k = this.f7776n;
                    this.f7769g = interfaceC1601aB;
                    this.f7770h = zVar;
                    this.f7771i = c10;
                    this.f7772j = c10;
                    this.f7775m = 1;
                    obj = c1311k.z(true, this);
                    if (obj != objE) {
                        c11 = c10;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = this.f7774l;
                            obj2 = this.f7769g;
                            AbstractC2753p.b(obj);
                            return new C1306f(obj2, i10, ((Number) obj).intValue());
                        }
                        interfaceC1601a = (InterfaceC1601a) this.f7771i;
                        c13 = (kotlin.jvm.internal.C) this.f7770h;
                        zVar2 = (kotlin.jvm.internal.z) this.f7769g;
                        AbstractC2753p.b(obj);
                        try {
                            zVar2.f29399g = true;
                            C2735B c2735b = C2735B.f28704a;
                            interfaceC1601a.c(null);
                            obj2 = c13.f29371g;
                            int iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            N0.t tVarS = this.f7776n.s();
                            this.f7769g = obj2;
                            this.f7770h = null;
                            this.f7771i = null;
                            this.f7774l = iHashCode;
                            this.f7775m = 4;
                            obj = tVarS.d(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                                return new C1306f(obj2, i10, ((Number) obj).intValue());
                            }
                            return objE;
                        } catch (Throwable th) {
                            interfaceC1601a.c(null);
                            throw th;
                        }
                    }
                    it = (Iterator) this.f7773k;
                    aVar = (a) this.f7772j;
                    c12 = (kotlin.jvm.internal.C) this.f7771i;
                    zVar3 = (kotlin.jvm.internal.z) this.f7770h;
                    interfaceC1601a2 = (InterfaceC1601a) this.f7769g;
                    AbstractC2753p.b(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        this.f7769g = interfaceC1601a2;
                        this.f7770h = zVar3;
                        this.f7771i = c12;
                        this.f7772j = aVar;
                        this.f7773k = it;
                        this.f7775m = 2;
                        if (function2.invoke(aVar, this) == objE) {
                            break;
                        }
                    }
                    c11 = c12;
                    zVar2 = zVar3;
                    interfaceC1601a = interfaceC1601a2;
                    this.f7777o.f7763c = null;
                    this.f7769g = zVar2;
                    this.f7770h = c11;
                    this.f7771i = interfaceC1601a;
                    this.f7772j = null;
                    this.f7773k = null;
                    this.f7775m = 3;
                    if (interfaceC1601a.a(null, this) != objE) {
                        c13 = c11;
                        zVar2.f29399g = true;
                        C2735B c2735b2 = C2735B.f28704a;
                        interfaceC1601a.c(null);
                        obj2 = c13.f29371g;
                        if (obj2 != null) {
                        }
                        N0.t tVarS2 = this.f7776n.s();
                        this.f7769g = obj2;
                        this.f7770h = null;
                        this.f7771i = null;
                        this.f7774l = iHashCode;
                        this.f7775m = 4;
                        obj = tVarS2.d(this);
                        if (obj != objE) {
                        }
                    }
                    return objE;
                }
                c10 = (kotlin.jvm.internal.C) this.f7772j;
                c11 = (kotlin.jvm.internal.C) this.f7771i;
                zVar = (kotlin.jvm.internal.z) this.f7770h;
                interfaceC1601aB = (InterfaceC1601a) this.f7769g;
                AbstractC2753p.b(obj);
                c10.f29371g = ((C1306f) obj).c();
                a aVar2 = new a(interfaceC1601aB, zVar, c11, this.f7776n);
                List list = this.f7777o.f7763c;
                if (list == null) {
                    zVar2 = zVar;
                    interfaceC1601a = interfaceC1601aB;
                    this.f7777o.f7763c = null;
                    this.f7769g = zVar2;
                    this.f7770h = c11;
                    this.f7771i = interfaceC1601a;
                    this.f7772j = null;
                    this.f7773k = null;
                    this.f7775m = 3;
                    if (interfaceC1601a.a(null, this) != objE) {
                    }
                    return objE;
                }
                it = list.iterator();
                interfaceC1601a2 = interfaceC1601aB;
                zVar3 = zVar;
                c12 = c11;
                aVar = aVar2;
                while (it.hasNext()) {
                }
                c11 = c12;
                zVar2 = zVar3;
                interfaceC1601a = interfaceC1601a2;
                this.f7777o.f7763c = null;
                this.f7769g = zVar2;
                this.f7770h = c11;
                this.f7771i = interfaceC1601a;
                this.f7772j = null;
                this.f7773k = null;
                this.f7775m = 3;
                if (interfaceC1601a.a(null, this) != objE) {
                }
                return objE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(n7.f fVar) {
                return ((C0075b) create(fVar)).invokeSuspend(C2735B.f28704a);
            }
        }

        public b(C1311k c1311k, List initTasksList) {
            AbstractC2855l.g(initTasksList, "initTasksList");
            this.f7764d = c1311k;
            this.f7763c = AbstractC2800q.P0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // N0.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Object b(n7.f fVar) throws C1304d {
            a aVar;
            b bVar;
            C1306f c1306f;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f7768j;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    aVar.f7768j = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    aVar = new a(fVar);
                }
            }
            Object objZ = aVar.f7766h;
            Object objE = AbstractC3016b.e();
            int i11 = aVar.f7768j;
            if (i11 == 0) {
                AbstractC2753p.b(objZ);
                List list = this.f7763c;
                if (list != null) {
                    AbstractC2855l.d(list);
                    if (list.isEmpty()) {
                        C1311k c1311k = this.f7764d;
                        aVar.f7765g = this;
                        aVar.f7768j = 1;
                        objZ = c1311k.z(false, aVar);
                        if (objZ != objE) {
                            bVar = this;
                            c1306f = (C1306f) objZ;
                        }
                    } else {
                        N0.t tVarS = this.f7764d.s();
                        C0075b c0075b = new C0075b(this.f7764d, this, null);
                        aVar.f7765g = this;
                        aVar.f7768j = 2;
                        objZ = tVarS.a(c0075b, aVar);
                        if (objZ != objE) {
                            bVar = this;
                            c1306f = (C1306f) objZ;
                        }
                    }
                    return objE;
                }
            } else if (i11 == 1) {
                bVar = (b) aVar.f7765g;
                AbstractC2753p.b(objZ);
                c1306f = (C1306f) objZ;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f7765g;
                AbstractC2753p.b(objZ);
                c1306f = (C1306f) objZ;
            }
            bVar.f7764d.f7758h.c(c1306f);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: N0.k$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.jvm.internal.n implements InterfaceC3487a {
        c() {
            super(0);
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N0.t invoke() {
            return C1311k.this.t().d();
        }
    }

    /* JADX INFO: renamed from: N0.k$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f7793i;

        /* JADX INFO: renamed from: N0.k$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7795g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ C1311k f7796h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1311k c1311k, n7.f fVar) {
                super(2, fVar);
                this.f7796h = c1311k;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(U8.c cVar, n7.f fVar) {
                return ((a) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                return new a(this.f7796h, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC3016b.e();
                int i10 = this.f7795g;
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    C1311k c1311k = this.f7796h;
                    this.f7795g = 1;
                    if (c1311k.v(this) == objE) {
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

        /* JADX INFO: renamed from: N0.k$d$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7797g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f7798h;

            b(n7.f fVar) {
                super(2, fVar);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, n7.f fVar) {
                return ((b) create(d10, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                b bVar = new b(fVar);
                bVar.f7798h = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3016b.e();
                if (this.f7797g != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((D) this.f7798h) instanceof N0.r));
            }
        }

        /* JADX INFO: renamed from: N0.k$d$c */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7799g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f7800h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ D f7801i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(D d10, n7.f fVar) {
                super(2, fVar);
                this.f7801i = d10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, n7.f fVar) {
                return ((c) create(d10, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                c cVar = new c(this.f7801i, fVar);
                cVar.f7800h = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3016b.e();
                if (this.f7799g != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                D d10 = (D) this.f7800h;
                return kotlin.coroutines.jvm.internal.b.a((d10 instanceof C1306f) && d10.a() <= this.f7801i.a());
            }
        }

        /* JADX INFO: renamed from: N0.k$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0077d extends kotlin.coroutines.jvm.internal.l implements w7.o {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7802g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ C1311k f7803h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0077d(C1311k c1311k, n7.f fVar) {
                super(3, fVar);
                this.f7803h = c1311k;
            }

            @Override // w7.o
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(U8.c cVar, Throwable th, n7.f fVar) {
                return new C0077d(this.f7803h, fVar).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC3016b.e();
                int i10 = this.f7802g;
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    C1311k c1311k = this.f7803h;
                    this.f7802g = 1;
                    if (c1311k.q(this) == objE) {
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

        /* JADX INFO: renamed from: N0.k$d$e */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class e implements U8.b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ U8.b f7804g;

            /* JADX INFO: renamed from: N0.k$d$e$a */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class a implements U8.c {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ U8.c f7805g;

                /* JADX INFO: renamed from: N0.k$d$e$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
                public static final class C0078a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    /* synthetic */ Object f7806g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    int f7807h;

                    public C0078a(n7.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f7806g = obj;
                        this.f7807h |= androidx.customview.widget.a.INVALID_ID;
                        return a.this.l(null, this);
                    }
                }

                public a(U8.c cVar) {
                    this.f7805g = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // U8.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object l(Object obj, n7.f fVar) throws Throwable {
                    C0078a c0078a;
                    if (fVar instanceof C0078a) {
                        c0078a = (C0078a) fVar;
                        int i10 = c0078a.f7807h;
                        if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                            c0078a.f7807h = i10 - androidx.customview.widget.a.INVALID_ID;
                        } else {
                            c0078a = new C0078a(fVar);
                        }
                    }
                    Object obj2 = c0078a.f7806g;
                    Object objE = AbstractC3016b.e();
                    int i11 = c0078a.f7807h;
                    if (i11 == 0) {
                        AbstractC2753p.b(obj2);
                        U8.c cVar = this.f7805g;
                        D d10 = (D) obj;
                        if (d10 instanceof N0.x) {
                            throw ((N0.x) d10).b();
                        }
                        if (!(d10 instanceof C1306f)) {
                            if (d10 instanceof N0.r ? true : d10 instanceof H) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new C2750m();
                        }
                        Object objC = ((C1306f) d10).c();
                        c0078a.f7807h = 1;
                        if (cVar.l(objC, c0078a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2753p.b(obj2);
                    }
                    return C2735B.f28704a;
                }
            }

            public e(U8.b bVar) {
                this.f7804g = bVar;
            }

            @Override // U8.b
            public Object b(U8.c cVar, n7.f fVar) {
                Object objB = this.f7804g.b(new a(cVar), fVar);
                return objB == AbstractC3016b.e() ? objB : C2735B.f28704a;
            }
        }

        d(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(U8.c cVar, n7.f fVar) {
            return ((d) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            d dVar = C1311k.this.new d(fVar);
            dVar.f7793i = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (U8.d.f(r1, r9, r8) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            U8.c cVar;
            D d10;
            U8.c cVar2;
            D d11;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7792h;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                U8.c cVar3 = (U8.c) this.f7793i;
                C1311k c1311k = C1311k.this;
                this.f7793i = cVar3;
                this.f7792h = 1;
                Object objA = c1311k.A(false, this);
                if (objA != objE) {
                    cVar = cVar3;
                    obj = objA;
                }
                return objE;
            }
            if (i10 == 1) {
                cVar = (U8.c) this.f7793i;
                AbstractC2753p.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                    return C2735B.f28704a;
                }
                d11 = (D) this.f7791g;
                cVar2 = (U8.c) this.f7793i;
                AbstractC2753p.b(obj);
                d10 = d11;
                cVar = cVar2;
                U8.b bVarJ = U8.d.j(new e(U8.d.d(U8.d.l(U8.d.k(C1311k.this.f7758h.b(), new a(C1311k.this, null)), new b(null)), new c(d10, null))), new C0077d(C1311k.this, null));
                this.f7793i = null;
                this.f7791g = null;
                this.f7792h = 3;
            }
            d10 = (D) obj;
            if (d10 instanceof C1306f) {
                Object objC = ((C1306f) d10).c();
                this.f7793i = cVar;
                this.f7791g = d10;
                this.f7792h = 2;
                if (cVar.l(objC, this) != objE) {
                    cVar2 = cVar;
                    d11 = d10;
                    d10 = d11;
                    cVar = cVar2;
                    U8.b bVarJ2 = U8.d.j(new e(U8.d.d(U8.d.l(U8.d.k(C1311k.this.f7758h.b(), new a(C1311k.this, null)), new b(null)), new c(d10, null))), new C0077d(C1311k.this, null));
                    this.f7793i = null;
                    this.f7791g = null;
                    this.f7792h = 3;
                }
                return objE;
            }
            if (d10 instanceof H) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (d10 instanceof N0.x) {
                throw ((N0.x) d10).b();
            }
            if (d10 instanceof N0.r) {
                return C2735B.f28704a;
            }
            U8.b bVarJ22 = U8.d.j(new e(U8.d.d(U8.d.l(U8.d.k(C1311k.this.f7758h.b(), new a(C1311k.this, null)), new b(null)), new c(d10, null))), new C0077d(C1311k.this, null));
            this.f7793i = null;
            this.f7791g = null;
            this.f7792h = 3;
        }
    }

    /* JADX INFO: renamed from: N0.k$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7811i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7813k;

        e(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7811i = obj;
            this.f7813k |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.q(this);
        }
    }

    /* JADX INFO: renamed from: N0.k$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7815h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, n7.f fVar) {
            super(1, fVar);
            this.f7815h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return new f(this.f7815h, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7814g;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            Function1 function1 = this.f7815h;
            this.f7814g = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((f) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: N0.k$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7816g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7817h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f7818i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f7819j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7821l;

        g(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7819j = obj;
            this.f7821l |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.u(null, this);
        }
    }

    /* JADX INFO: renamed from: N0.k$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7823h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7824i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7826k;

        h(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7824i = obj;
            this.f7826k |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.v(this);
        }
    }

    /* JADX INFO: renamed from: N0.k$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7827g;

        /* JADX INFO: renamed from: N0.k$i$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a implements U8.c {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1311k f7829g;

            a(C1311k c1311k) {
                this.f7829g = c1311k;
            }

            @Override // U8.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object l(C2735B c2735b, n7.f fVar) {
                if (this.f7829g.f7758h.a() instanceof N0.r) {
                    return C2735B.f28704a;
                }
                Object objX = this.f7829g.x(true, fVar);
                return objX == AbstractC3016b.e() ? objX : C2735B.f28704a;
            }
        }

        i(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return C1311k.this.new i(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((i) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.b(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7827g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                b bVar = C1311k.this.f7759i;
                this.f7827g = 1;
                if (bVar.a(this) != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            AbstractC2753p.b(obj);
            U8.b bVarC = U8.d.c(C1311k.this.s().e());
            a aVar = new a(C1311k.this);
            this.f7827g = 2;
        }
    }

    /* JADX INFO: renamed from: N0.k$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7832i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7834k;

        j(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7832i = obj;
            this.f7834k |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.w(this);
        }
    }

    /* JADX INFO: renamed from: N0.k$k, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0079k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f7837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f7838j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7840l;

        C0079k(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7838j = obj;
            this.f7840l |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.x(false, this);
        }
    }

    /* JADX INFO: renamed from: N0.k$l */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7842h;

        l(n7.f fVar) {
            super(1, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return C1311k.this.new l(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            D xVar;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7842h;
            try {
            } catch (Throwable th2) {
                N0.t tVarS = C1311k.this.s();
                this.f7841g = th2;
                this.f7842h = 2;
                Object objD = tVarS.d(this);
                if (objD != objE) {
                    th = th2;
                    obj = objD;
                }
                return objE;
            }
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                C1311k c1311k = C1311k.this;
                this.f7842h = 1;
                obj = c1311k.z(true, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f7841g;
                    AbstractC2753p.b(obj);
                    xVar = new N0.x(th, ((Number) obj).intValue());
                    return i7.t.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
                }
                AbstractC2753p.b(obj);
            }
            xVar = (D) obj;
            return i7.t.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((l) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: N0.k$m */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7844g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7845h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ boolean f7846i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7848k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, n7.f fVar) {
            super(2, fVar);
            this.f7848k = i10;
        }

        public final Object c(boolean z10, n7.f fVar) {
            return ((m) create(Boolean.valueOf(z10), fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            m mVar = C1311k.this.new m(this.f7848k, fVar);
            mVar.f7846i = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (n7.f) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int iIntValue;
            ?? r02;
            ?? r03;
            D d10;
            ?? r12;
            Object objE = AbstractC3016b.e();
            ?? r13 = this.f7845h;
            try {
            } catch (Throwable th2) {
                if (r13 != 0) {
                    N0.t tVarS = C1311k.this.s();
                    this.f7844g = th2;
                    this.f7846i = r13;
                    this.f7845h = 2;
                    Object objD = tVarS.d(this);
                    if (objD != objE) {
                        r03 = r13;
                        th = th2;
                        obj = objD;
                    }
                    return objE;
                }
                ?? r42 = r13;
                th = th2;
                iIntValue = this.f7848k;
                r02 = r42 == true ? 1 : 0;
            }
            if (r13 == 0) {
                AbstractC2753p.b(obj);
                boolean z10 = this.f7846i;
                C1311k c1311k = C1311k.this;
                this.f7846i = z10;
                this.f7845h = 1;
                obj = c1311k.z(z10, this);
                r13 = z10;
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (r13 != 1) {
                    if (r13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z11 = this.f7846i;
                    th = (Throwable) this.f7844g;
                    AbstractC2753p.b(obj);
                    r03 = z11;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    N0.x xVar = new N0.x(th, iIntValue);
                    r12 = r02;
                    d10 = xVar;
                    return i7.t.a(d10, kotlin.coroutines.jvm.internal.b.a(r12));
                }
                boolean z12 = this.f7846i;
                AbstractC2753p.b(obj);
                r13 = z12;
            }
            d10 = (D) obj;
            r12 = r13;
            return i7.t.a(d10, kotlin.coroutines.jvm.internal.b.a(r12));
        }
    }

    /* JADX INFO: renamed from: N0.k$n */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f7851i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f7852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f7853k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7854l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f7855m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f7857o;

        n(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7855m = obj;
            this.f7857o |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.z(false, this);
        }
    }

    /* JADX INFO: renamed from: N0.k$o */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class o extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7858g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7859h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ boolean f7860i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7862k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, n7.f fVar) {
            super(2, fVar);
            this.f7862k = i10;
        }

        public final Object c(boolean z10, n7.f fVar) {
            return ((o) create(Boolean.valueOf(z10), fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            o oVar = C1311k.this.new o(this.f7862k, fVar);
            oVar.f7860i = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (n7.f) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7859h;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                z10 = this.f7860i;
                C1311k c1311k = C1311k.this;
                this.f7860i = z10;
                this.f7859h = 1;
                obj = c1311k.y(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f7858g;
                AbstractC2753p.b(obj);
                iIntValue = ((Number) obj).intValue();
                return new C1306f(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
            }
            z10 = this.f7860i;
            AbstractC2753p.b(obj);
            if (!z10) {
                obj2 = obj;
                iIntValue = this.f7862k;
                return new C1306f(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
            }
            N0.t tVarS = C1311k.this.s();
            this.f7858g = obj;
            this.f7859h = 2;
            Object objD = tVarS.d(this);
            if (objD != objE) {
                obj2 = obj;
                obj = objD;
                iIntValue = ((Number) obj).intValue();
                return new C1306f(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
            }
            return objE;
        }
    }

    /* JADX INFO: renamed from: N0.k$p */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class p extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.C f7865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C1311k f7866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.A f7867k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.jvm.internal.C c10, C1311k c1311k, kotlin.jvm.internal.A a10, n7.f fVar) {
            super(1, fVar);
            this.f7865i = c10;
            this.f7866j = c1311k;
            this.f7867k = a10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return new p(this.f7865i, this.f7866j, this.f7867k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.A a10;
            kotlin.jvm.internal.C c10;
            kotlin.jvm.internal.A a11;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7864h;
            try {
            } catch (C1304d unused) {
                kotlin.jvm.internal.A a12 = this.f7867k;
                C1311k c1311k = this.f7866j;
                Object obj2 = this.f7865i.f29371g;
                this.f7863g = a12;
                this.f7864h = 3;
                Object objC = c1311k.C(obj2, true, this);
                if (objC != objE) {
                    a10 = a12;
                    obj = objC;
                }
                return objE;
            }
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                c10 = this.f7865i;
                C1311k c1311k2 = this.f7866j;
                this.f7863g = c10;
                this.f7864h = 1;
                obj = c1311k2.y(this);
                if (obj == objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    a11 = (kotlin.jvm.internal.A) this.f7863g;
                    AbstractC2753p.b(obj);
                    a11.f29369g = ((Number) obj).intValue();
                    return C2735B.f28704a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a10 = (kotlin.jvm.internal.A) this.f7863g;
                AbstractC2753p.b(obj);
                a10.f29369g = ((Number) obj).intValue();
                return C2735B.f28704a;
            }
            c10 = (kotlin.jvm.internal.C) this.f7863g;
            AbstractC2753p.b(obj);
            c10.f29371g = obj;
            a11 = this.f7867k;
            N0.t tVarS = this.f7866j.s();
            this.f7863g = a11;
            this.f7864h = 2;
            obj = tVarS.d(this);
            if (obj == objE) {
                return objE;
            }
            a11.f29369g = ((Number) obj).intValue();
            return C2735B.f28704a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((p) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: N0.k$q */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class q extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7868g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f7870i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, n7.f fVar) {
            super(2, fVar);
            this.f7870i = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return C1311k.this.new q(this.f7870i, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((q) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7868g;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    if (C1311k.this.f7758h.a() instanceof N0.r) {
                        return C1311k.this.f7758h.a();
                    }
                    C1311k c1311k = C1311k.this;
                    this.f7868g = 1;
                    if (c1311k.w(this) != objE) {
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                    return (D) obj;
                }
                AbstractC2753p.b(obj);
                C1311k c1311k2 = C1311k.this;
                boolean z10 = this.f7870i;
                this.f7868g = 2;
                obj = c1311k2.x(z10, this);
            } catch (Throwable th) {
                return new N0.x(th, -1);
            }
        }
    }

    /* JADX INFO: renamed from: N0.k$r */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class r extends kotlin.jvm.internal.n implements InterfaceC3487a {
        r() {
            super(0);
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return C1311k.this.f7751a.a();
        }
    }

    /* JADX INFO: renamed from: N0.k$s */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class s extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7873h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ n7.j f7875j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2 f7876k;

        /* JADX INFO: renamed from: N0.k$s$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7877g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2 f7878h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ C1306f f7879i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function2 function2, C1306f c1306f, n7.f fVar) {
                super(2, fVar);
                this.f7878h = function2;
                this.f7879i = c1306f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                return new a(this.f7878h, this.f7879i, fVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, n7.f fVar) {
                return ((a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC3016b.e();
                int i10 = this.f7877g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                    return obj;
                }
                AbstractC2753p.b(obj);
                Function2 function2 = this.f7878h;
                Object objC = this.f7879i.c();
                this.f7877g = 1;
                Object objInvoke = function2.invoke(objC, this);
                return objInvoke == objE ? objE : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(n7.j jVar, Function2 function2, n7.f fVar) {
            super(1, fVar);
            this.f7875j = jVar;
            this.f7876k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return C1311k.this.new s(this.f7875j, this.f7876k, fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws C1304d {
            C1306f c1306f;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7873h;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                C1311k c1311k = C1311k.this;
                this.f7873h = 1;
                obj = c1311k.z(true, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f7872g;
                    AbstractC2753p.b(obj);
                    return obj2;
                }
                c1306f = (C1306f) this.f7872g;
                AbstractC2753p.b(obj);
                c1306f.b();
                if (!AbstractC2855l.b(c1306f.c(), obj)) {
                    C1311k c1311k2 = C1311k.this;
                    this.f7872g = obj;
                    this.f7873h = 3;
                    if (c1311k2.C(obj, true, this) == objE) {
                        return objE;
                    }
                }
                return obj;
            }
            AbstractC2753p.b(obj);
            c1306f = (C1306f) obj;
            n7.j jVar = this.f7875j;
            a aVar = new a(this.f7876k, c1306f, null);
            this.f7872g = c1306f;
            this.f7873h = 2;
            obj = AbstractC1413i.g(jVar, aVar, this);
            if (obj != objE) {
                c1306f.b();
                if (!AbstractC2855l.b(c1306f.c(), obj)) {
                }
                return obj;
            }
            return objE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((s) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: N0.k$t */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class t extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f7881h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2 f7883j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.f7883j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            t tVar = C1311k.this.new t(this.f7883j, fVar);
            tVar.f7881h = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((t) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7880g;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.f7881h;
            InterfaceC1440w interfaceC1440wB = AbstractC1444y.b(null, 1, null);
            C1311k.this.f7762l.e(new w.a(this.f7883j, interfaceC1440wB, C1311k.this.f7758h.a(), n10.i()));
            this.f7880g = 1;
            Object objI = interfaceC1440wB.I(this);
            return objI == objE ? objE : objI;
        }
    }

    /* JADX INFO: renamed from: N0.k$u */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class u extends kotlin.jvm.internal.n implements Function1 {
        u() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                C1311k.this.f7758h.c(new N0.r(th));
            }
            if (C1311k.this.f7760j.e()) {
                C1311k.this.t().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: N0.k$v */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class v extends kotlin.jvm.internal.n implements Function2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final v f7885h = new v();

        v() {
            super(2);
        }

        public final void a(w.a msg, Throwable th) {
            AbstractC2855l.g(msg, "msg");
            InterfaceC1440w interfaceC1440wA = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC1440wA.k0(th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w.a) obj, (Throwable) obj2);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: N0.k$w */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class w extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f7887h;

        w(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.a aVar, n7.f fVar) {
            return ((w) create(aVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            w wVar = C1311k.this.new w(fVar);
            wVar.f7887h = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f7886g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                w.a aVar = (w.a) this.f7887h;
                C1311k c1311k = C1311k.this;
                this.f7886g = 1;
                if (c1311k.u(aVar, this) == objE) {
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

    /* JADX INFO: renamed from: N0.k$x */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f7890h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f7892j;

        x(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7890h = obj;
            this.f7892j |= androidx.customview.widget.a.INVALID_ID;
            return C1311k.this.C(null, false, this);
        }
    }

    /* JADX INFO: renamed from: N0.k$y */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class y extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f7895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.A f7896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C1311k f7897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f7898l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f7899m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(kotlin.jvm.internal.A a10, C1311k c1311k, Object obj, boolean z10, n7.f fVar) {
            super(2, fVar);
            this.f7896j = a10;
            this.f7897k = c1311k;
            this.f7898l = obj;
            this.f7899m = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K k10, n7.f fVar) {
            return ((y) create(k10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            y yVar = new y(this.f7896j, this.f7897k, this.f7898l, this.f7899m, fVar);
            yVar.f7895i = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.b(r7, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.A a10;
            K k10;
            Object objE = AbstractC3016b.e();
            int i10 = this.f7894h;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                K k11 = (K) this.f7895i;
                a10 = this.f7896j;
                N0.t tVarS = this.f7897k.s();
                this.f7895i = k11;
                this.f7893g = a10;
                this.f7894h = 1;
                Object objC = tVarS.c(this);
                if (objC != objE) {
                    k10 = k11;
                    obj = objC;
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                if (this.f7899m) {
                    N0.l lVar = this.f7897k.f7758h;
                    Object obj2 = this.f7898l;
                    lVar.c(new C1306f(obj2, obj2 != null ? obj2.hashCode() : 0, this.f7896j.f29369g));
                }
                return C2735B.f28704a;
            }
            a10 = (kotlin.jvm.internal.A) this.f7893g;
            k10 = (K) this.f7895i;
            AbstractC2753p.b(obj);
            a10.f29369g = ((Number) obj).intValue();
            Object obj3 = this.f7898l;
            this.f7895i = null;
            this.f7893g = null;
            this.f7894h = 2;
        }
    }

    public C1311k(E storage, List initTasksList, InterfaceC1305e corruptionHandler, N scope) {
        AbstractC2855l.g(storage, "storage");
        AbstractC2855l.g(initTasksList, "initTasksList");
        AbstractC2855l.g(corruptionHandler, "corruptionHandler");
        AbstractC2855l.g(scope, "scope");
        this.f7751a = storage;
        this.f7752b = corruptionHandler;
        this.f7753c = scope;
        this.f7754d = U8.d.i(new d(null));
        this.f7755e = a9.g.b(false, 1, null);
        this.f7758h = new N0.l();
        this.f7759i = new b(this, initTasksList);
        this.f7760j = AbstractC2746i.b(new r());
        this.f7761k = AbstractC2746i.b(new c());
        this.f7762l = new B(scope, new u(), v.f7885h, new w(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(boolean z10, n7.f fVar) {
        return AbstractC1413i.g(this.f7753c.i(), new q(z10, null), fVar);
    }

    private final Object B(Function2 function2, n7.j jVar, n7.f fVar) {
        return s().a(new s(jVar, function2, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(n7.f fVar) {
        e eVar;
        C1311k c1311k;
        InterfaceC1601a interfaceC1601a;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f7813k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                eVar.f7813k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                eVar = new e(fVar);
            }
        }
        Object obj = eVar.f7811i;
        Object objE = AbstractC3016b.e();
        int i11 = eVar.f7813k;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            InterfaceC1601a interfaceC1601a2 = this.f7755e;
            eVar.f7809g = this;
            eVar.f7810h = interfaceC1601a2;
            eVar.f7813k = 1;
            if (interfaceC1601a2.a(null, eVar) == objE) {
                return objE;
            }
            c1311k = this;
            interfaceC1601a = interfaceC1601a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1601a = (InterfaceC1601a) eVar.f7810h;
            c1311k = (C1311k) eVar.f7809g;
            AbstractC2753p.b(obj);
        }
        try {
            int i12 = c1311k.f7756f - 1;
            c1311k.f7756f = i12;
            if (i12 == 0) {
                A0 a02 = c1311k.f7757g;
                if (a02 != null) {
                    A0.a.a(a02, null, 1, null);
                }
                c1311k.f7757g = null;
            }
            C2735B c2735b = C2735B.f28704a;
            interfaceC1601a.c(null);
            return C2735B.f28704a;
        } catch (Throwable th) {
            interfaceC1601a.c(null);
            throw th;
        }
    }

    private final Object r(boolean z10, Function1 function1, n7.f fVar) {
        return z10 ? function1.invoke(fVar) : s().a(new f(function1, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N0.t s() {
        return (N0.t) this.f7761k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [N0.w$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [N0.w$a] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [R8.w] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(w.a aVar, n7.f fVar) {
        g gVar;
        Object objB;
        ?? r92;
        InterfaceC1440w interfaceC1440wA;
        D dA;
        C1311k c1311k;
        Object objB2;
        ?? r93;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i10 = gVar.f7821l;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                gVar.f7821l = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                gVar = new g(fVar);
            }
        }
        Object obj = gVar.f7819j;
        Object objE = AbstractC3016b.e();
        int i11 = gVar.f7821l;
        boolean z10 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    InterfaceC1440w interfaceC1440w = (InterfaceC1440w) gVar.f7818i;
                    c1311k = (C1311k) gVar.f7817h;
                    w.a aVar2 = (w.a) gVar.f7816g;
                    AbstractC2753p.b(obj);
                    interfaceC1440wA = interfaceC1440w;
                    r93 = aVar2;
                } else if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            InterfaceC1440w interfaceC1440w2 = (InterfaceC1440w) gVar.f7816g;
            AbstractC2753p.b(obj);
            aVar = interfaceC1440w2;
            objB = C2752o.b(obj);
            r92 = aVar;
            AbstractC1444y.c(r92, objB);
            return C2735B.f28704a;
        }
        AbstractC2753p.b(obj);
        interfaceC1440wA = aVar.a();
        try {
            C2752o.a aVar3 = C2752o.f28721h;
            dA = this.f7758h.a();
        } catch (Throwable th2) {
            th = th2;
            aVar = interfaceC1440wA;
            C2752o.a aVar4 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
            r92 = aVar;
        }
        if (dA instanceof C1306f) {
            Function2 function2D = aVar.d();
            n7.j jVarB = aVar.b();
            gVar.f7816g = interfaceC1440wA;
            gVar.f7821l = 1;
            objB2 = B(function2D, jVarB, gVar);
            if (objB2 == objE) {
            }
            InterfaceC1440w interfaceC1440w3 = interfaceC1440wA;
            obj = objB2;
            aVar = interfaceC1440w3;
            objB = C2752o.b(obj);
            r92 = aVar;
            AbstractC1444y.c(r92, objB);
            return C2735B.f28704a;
        }
        if (!(dA instanceof N0.x)) {
            z10 = dA instanceof H;
        }
        if (!z10) {
            if (dA instanceof N0.r) {
                throw ((N0.r) dA).b();
            }
            throw new C2750m();
        }
        if (dA != aVar.c()) {
            AbstractC2855l.e(dA, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
            throw ((N0.x) dA).b();
        }
        gVar.f7816g = aVar;
        gVar.f7817h = this;
        gVar.f7818i = interfaceC1440wA;
        gVar.f7821l = 2;
        if (w(gVar) != objE) {
            c1311k = this;
            r93 = aVar;
        }
        return objE;
        Function2 function2D2 = r93.d();
        n7.j jVarB2 = r93.b();
        gVar.f7816g = interfaceC1440wA;
        gVar.f7817h = null;
        gVar.f7818i = null;
        gVar.f7821l = 3;
        objB2 = c1311k.B(function2D2, jVarB2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(n7.f fVar) {
        h hVar;
        C1311k c1311k;
        InterfaceC1601a interfaceC1601a;
        if (fVar instanceof h) {
            hVar = (h) fVar;
            int i10 = hVar.f7826k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                hVar.f7826k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                hVar = new h(fVar);
            }
        }
        Object obj = hVar.f7824i;
        Object objE = AbstractC3016b.e();
        int i11 = hVar.f7826k;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            InterfaceC1601a interfaceC1601a2 = this.f7755e;
            hVar.f7822g = this;
            hVar.f7823h = interfaceC1601a2;
            hVar.f7826k = 1;
            if (interfaceC1601a2.a(null, hVar) == objE) {
                return objE;
            }
            c1311k = this;
            interfaceC1601a = interfaceC1601a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1601a = (InterfaceC1601a) hVar.f7823h;
            c1311k = (C1311k) hVar.f7822g;
            AbstractC2753p.b(obj);
        }
        try {
            int i12 = c1311k.f7756f + 1;
            c1311k.f7756f = i12;
            if (i12 == 1) {
                c1311k.f7757g = AbstractC1417k.d(c1311k.f7753c, null, null, c1311k.new i(null), 3, null);
            }
            C2735B c2735b = C2735B.f28704a;
            interfaceC1601a.c(null);
            return C2735B.f28704a;
        } catch (Throwable th) {
            interfaceC1601a.c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(n7.f fVar) throws Throwable {
        j jVar;
        C1311k c1311k;
        int iIntValue;
        int i10;
        Throwable th;
        C1311k c1311k2;
        if (fVar instanceof j) {
            jVar = (j) fVar;
            int i11 = jVar.f7834k;
            if ((i11 & androidx.customview.widget.a.INVALID_ID) != 0) {
                jVar.f7834k = i11 - androidx.customview.widget.a.INVALID_ID;
            } else {
                jVar = new j(fVar);
            }
        }
        Object objD = jVar.f7832i;
        Object objE = AbstractC3016b.e();
        int i12 = jVar.f7834k;
        try {
            if (i12 == 0) {
                AbstractC2753p.b(objD);
                N0.t tVarS = s();
                jVar.f7830g = this;
                jVar.f7834k = 1;
                objD = tVarS.d(jVar);
                if (objD != objE) {
                    c1311k = this;
                }
                return objE;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = jVar.f7831h;
                c1311k2 = (C1311k) jVar.f7830g;
                try {
                    AbstractC2753p.b(objD);
                    return C2735B.f28704a;
                } catch (Throwable th2) {
                    th = th2;
                    c1311k2.f7758h.c(new N0.x(th, i10));
                    throw th;
                }
            }
            c1311k = (C1311k) jVar.f7830g;
            AbstractC2753p.b(objD);
            b bVar = c1311k.f7759i;
            jVar.f7830g = c1311k;
            jVar.f7831h = iIntValue;
            jVar.f7834k = 2;
        } catch (Throwable th3) {
            i10 = iIntValue;
            th = th3;
            c1311k2 = c1311k;
            c1311k2.f7758h.c(new N0.x(th, i10));
            throw th;
        }
        iIntValue = ((Number) objD).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(boolean z10, n7.f fVar) {
        C0079k c0079k;
        D d10;
        Object obj;
        boolean z11;
        C1311k c1311k;
        Pair pair;
        if (fVar instanceof C0079k) {
            c0079k = (C0079k) fVar;
            int i10 = c0079k.f7840l;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c0079k.f7840l = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c0079k = new C0079k(fVar);
            }
        }
        Object objB = c0079k.f7838j;
        Object objE = AbstractC3016b.e();
        int i11 = c0079k.f7840l;
        if (i11 == 0) {
            AbstractC2753p.b(objB);
            D dA = this.f7758h.a();
            if (dA instanceof H) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            N0.t tVarS = s();
            c0079k.f7835g = this;
            c0079k.f7836h = dA;
            c0079k.f7837i = z10;
            c0079k.f7840l = 1;
            Object objD = tVarS.d(c0079k);
            if (objD != objE) {
                d10 = dA;
                obj = objD;
                z11 = z10;
                c1311k = this;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c1311k = (C1311k) c0079k.f7835g;
                AbstractC2753p.b(objB);
                pair = (Pair) objB;
                D d11 = (D) pair.getFirst();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                }
                return d11;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1311k = (C1311k) c0079k.f7835g;
            AbstractC2753p.b(objB);
            pair = (Pair) objB;
            D d112 = (D) pair.getFirst();
            if (((Boolean) pair.getSecond()).booleanValue()) {
                c1311k.f7758h.c(d112);
            }
            return d112;
        }
        boolean z12 = c0079k.f7837i;
        D d12 = (D) c0079k.f7836h;
        C1311k c1311k2 = (C1311k) c0079k.f7835g;
        AbstractC2753p.b(objB);
        z11 = z12;
        c1311k = c1311k2;
        d10 = d12;
        obj = objB;
        int iIntValue = ((Number) obj).intValue();
        boolean z13 = d10 instanceof C1306f;
        int iA = z13 ? d10.a() : -1;
        if (z13 && iIntValue == iA) {
            return d10;
        }
        if (z11) {
            N0.t tVarS2 = c1311k.s();
            l lVar = c1311k.new l(null);
            c0079k.f7835g = c1311k;
            c0079k.f7836h = null;
            c0079k.f7840l = 2;
            objB = tVarS2.a(lVar, c0079k);
        } else {
            N0.t tVarS3 = c1311k.s();
            m mVar = c1311k.new m(iA, null);
            c0079k.f7835g = c1311k;
            c0079k.f7836h = null;
            c0079k.f7840l = 3;
            objB = tVarS3.b(mVar, c0079k);
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(n7.f fVar) {
        return G.a(t(), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(boolean z10, n7.f fVar) throws C1304d {
        n nVar;
        C1311k c1311k;
        kotlin.jvm.internal.C c10;
        Object objA;
        C1304d c1304d;
        kotlin.jvm.internal.C c11;
        C1311k c1311k2;
        C1304d c1304d2;
        Function1 pVar;
        kotlin.jvm.internal.A a10;
        kotlin.jvm.internal.C c12;
        C1311k c1311k3;
        C1311k c1311k4;
        int iHashCode;
        Object objD;
        boolean z11;
        int i10;
        Object obj;
        if (fVar instanceof n) {
            nVar = (n) fVar;
            int i11 = nVar.f7857o;
            if ((i11 & androidx.customview.widget.a.INVALID_ID) != 0) {
                nVar.f7857o = i11 - androidx.customview.widget.a.INVALID_ID;
            } else {
                nVar = new n(fVar);
            }
        }
        Object objD2 = nVar.f7855m;
        Object objE = AbstractC3016b.e();
        ?? r22 = nVar.f7857o;
        try {
        } catch (C1304d e10) {
            e = e10;
            c1311k = r22;
        }
        switch (r22) {
            case 0:
                AbstractC2753p.b(objD2);
                try {
                    if (z10) {
                        nVar.f7849g = this;
                        nVar.f7853k = z10;
                        nVar.f7857o = 1;
                        objD2 = y(nVar);
                        if (objD2 != objE) {
                            c1311k4 = this;
                            if (objD2 == null) {
                                try {
                                    iHashCode = objD2.hashCode();
                                } catch (C1304d e11) {
                                    e = e11;
                                    c1311k = c1311k4;
                                    c10 = new kotlin.jvm.internal.C();
                                    InterfaceC1305e interfaceC1305e = c1311k.f7752b;
                                    nVar.f7849g = c1311k;
                                    nVar.f7850h = e;
                                    nVar.f7851i = c10;
                                    nVar.f7852j = c10;
                                    nVar.f7853k = z10;
                                    nVar.f7857o = 5;
                                    objA = interfaceC1305e.a(e, nVar);
                                    if (objA != objE) {
                                    }
                                }
                            } else {
                                iHashCode = 0;
                            }
                            N0.t tVarS = c1311k4.s();
                            nVar.f7849g = c1311k4;
                            nVar.f7850h = objD2;
                            nVar.f7853k = z10;
                            nVar.f7854l = iHashCode;
                            nVar.f7857o = 2;
                            objD = tVarS.d(nVar);
                            if (objD != objE) {
                                int i12 = iHashCode;
                                z11 = z10;
                                i10 = i12;
                                obj = objD2;
                                objD2 = objD;
                                return new C1306f(obj, i10, ((Number) objD2).intValue());
                            }
                        }
                    } else {
                        N0.t tVarS2 = s();
                        nVar.f7849g = this;
                        nVar.f7853k = z10;
                        nVar.f7857o = 3;
                        objD2 = tVarS2.d(nVar);
                        if (objD2 != objE) {
                            c1311k3 = this;
                            int iIntValue = ((Number) objD2).intValue();
                            N0.t tVarS3 = c1311k3.s();
                            o oVar = c1311k3.new o(iIntValue, null);
                            nVar.f7849g = c1311k3;
                            nVar.f7853k = z10;
                            nVar.f7857o = 4;
                            objD2 = tVarS3.b(oVar, nVar);
                            if (objD2 == objE) {
                            }
                            return (C1306f) objD2;
                        }
                    }
                } catch (C1304d e12) {
                    e = e12;
                    c1311k = this;
                    c10 = new kotlin.jvm.internal.C();
                    InterfaceC1305e interfaceC1305e2 = c1311k.f7752b;
                    nVar.f7849g = c1311k;
                    nVar.f7850h = e;
                    nVar.f7851i = c10;
                    nVar.f7852j = c10;
                    nVar.f7853k = z10;
                    nVar.f7857o = 5;
                    objA = interfaceC1305e2.a(e, nVar);
                    if (objA != objE) {
                        c1304d = e;
                        objD2 = objA;
                        c11 = c10;
                        c1311k2 = c1311k;
                        c11.f29371g = objD2;
                        kotlin.jvm.internal.A a11 = new kotlin.jvm.internal.A();
                        try {
                            pVar = new p(c10, c1311k2, a11, null);
                            nVar.f7849g = c1304d;
                            nVar.f7850h = c10;
                            nVar.f7851i = a11;
                            nVar.f7852j = null;
                            nVar.f7857o = 6;
                            if (c1311k2.r(z10, pVar, nVar) != objE) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1304d2 = c1304d;
                            AbstractC2738a.a(c1304d2, th);
                            throw c1304d2;
                        }
                    }
                }
                return objE;
            case 1:
                z10 = nVar.f7853k;
                C1311k c1311k5 = (C1311k) nVar.f7849g;
                AbstractC2753p.b(objD2);
                c1311k4 = c1311k5;
                if (objD2 == null) {
                }
                N0.t tVarS4 = c1311k4.s();
                nVar.f7849g = c1311k4;
                nVar.f7850h = objD2;
                nVar.f7853k = z10;
                nVar.f7854l = iHashCode;
                nVar.f7857o = 2;
                objD = tVarS4.d(nVar);
                if (objD != objE) {
                }
                return objE;
            case 2:
                i10 = nVar.f7854l;
                z11 = nVar.f7853k;
                obj = nVar.f7850h;
                c1311k4 = (C1311k) nVar.f7849g;
                try {
                    AbstractC2753p.b(objD2);
                    return new C1306f(obj, i10, ((Number) objD2).intValue());
                } catch (C1304d e13) {
                    e = e13;
                    z10 = z11;
                    c1311k = c1311k4;
                    c10 = new kotlin.jvm.internal.C();
                    InterfaceC1305e interfaceC1305e22 = c1311k.f7752b;
                    nVar.f7849g = c1311k;
                    nVar.f7850h = e;
                    nVar.f7851i = c10;
                    nVar.f7852j = c10;
                    nVar.f7853k = z10;
                    nVar.f7857o = 5;
                    objA = interfaceC1305e22.a(e, nVar);
                    if (objA != objE) {
                    }
                    return objE;
                }
            case 3:
                z10 = nVar.f7853k;
                c1311k3 = (C1311k) nVar.f7849g;
                AbstractC2753p.b(objD2);
                int iIntValue2 = ((Number) objD2).intValue();
                N0.t tVarS32 = c1311k3.s();
                o oVar2 = c1311k3.new o(iIntValue2, null);
                nVar.f7849g = c1311k3;
                nVar.f7853k = z10;
                nVar.f7857o = 4;
                objD2 = tVarS32.b(oVar2, nVar);
                if (objD2 == objE) {
                }
                return (C1306f) objD2;
            case 4:
                boolean z12 = nVar.f7853k;
                AbstractC2753p.b(objD2);
                return (C1306f) objD2;
            case 5:
                z10 = nVar.f7853k;
                kotlin.jvm.internal.C c13 = (kotlin.jvm.internal.C) nVar.f7852j;
                kotlin.jvm.internal.C c14 = (kotlin.jvm.internal.C) nVar.f7851i;
                c1304d = (C1304d) nVar.f7850h;
                C1311k c1311k6 = (C1311k) nVar.f7849g;
                AbstractC2753p.b(objD2);
                c11 = c13;
                c10 = c14;
                c1311k2 = c1311k6;
                c11.f29371g = objD2;
                kotlin.jvm.internal.A a112 = new kotlin.jvm.internal.A();
                pVar = new p(c10, c1311k2, a112, null);
                nVar.f7849g = c1304d;
                nVar.f7850h = c10;
                nVar.f7851i = a112;
                nVar.f7852j = null;
                nVar.f7857o = 6;
                if (c1311k2.r(z10, pVar, nVar) != objE) {
                    a10 = a112;
                    c12 = c10;
                    Object obj2 = c12.f29371g;
                    return new C1306f(obj2, obj2 != null ? obj2.hashCode() : 0, a10.f29369g);
                }
                return objE;
            case 6:
                a10 = (kotlin.jvm.internal.A) nVar.f7851i;
                c12 = (kotlin.jvm.internal.C) nVar.f7850h;
                c1304d2 = (C1304d) nVar.f7849g;
                try {
                    AbstractC2753p.b(objD2);
                    Object obj22 = c12.f29371g;
                    return new C1306f(obj22, obj22 != null ? obj22.hashCode() : 0, a10.f29369g);
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC2738a.a(c1304d2, th);
                    throw c1304d2;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Object obj, boolean z10, n7.f fVar) {
        x xVar;
        kotlin.jvm.internal.A a10;
        if (fVar instanceof x) {
            xVar = (x) fVar;
            int i10 = xVar.f7892j;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                xVar.f7892j = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                xVar = new x(fVar);
            }
        }
        Object obj2 = xVar.f7890h;
        Object objE = AbstractC3016b.e();
        int i11 = xVar.f7892j;
        if (i11 == 0) {
            AbstractC2753p.b(obj2);
            kotlin.jvm.internal.A a11 = new kotlin.jvm.internal.A();
            F fT = t();
            y yVar = new y(a11, this, obj, z10, null);
            xVar.f7889g = a11;
            xVar.f7892j = 1;
            if (fT.c(yVar, xVar) == objE) {
                return objE;
            }
            a10 = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a10 = (kotlin.jvm.internal.A) xVar.f7889g;
            AbstractC2753p.b(obj2);
        }
        return kotlin.coroutines.jvm.internal.b.c(a10.f29369g);
    }

    @Override // N0.InterfaceC1309i
    public U8.b b() {
        return this.f7754d;
    }

    @Override // N0.InterfaceC1309i
    public Object c(Function2 function2, n7.f fVar) {
        J j10 = (J) fVar.getContext().e(J.a.C0072a.f7726g);
        if (j10 != null) {
            j10.a(this);
        }
        return AbstractC1413i.g(new J(j10, this), new t(function2, null), fVar);
    }

    public final F t() {
        return (F) this.f7760j.getValue();
    }
}
