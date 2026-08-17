package s5;

import C7.k;
import N0.C1304d;
import N0.InterfaceC1309i;
import Q0.i;
import R0.f;
import R0.g;
import R0.j;
import R8.AbstractC1415j;
import R8.N;
import android.content.Context;
import android.os.Process;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.K;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.x;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: s5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3328c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f32284f = {D.l(new x(C3328c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f32287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.properties.c f32288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1309i f32289e;

    /* JADX INFO: renamed from: s5.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32290g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f32292i;

        /* JADX INFO: renamed from: s5.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0357a extends l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f32293g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f32294h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1 f32295i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0357a(Function1 function1, f fVar) {
                super(2, fVar);
                this.f32295i = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(R0.c cVar, f fVar) {
                return ((C0357a) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final f create(Object obj, f fVar) {
                C0357a c0357a = new C0357a(this.f32295i, fVar);
                c0357a.f32294h = obj;
                return c0357a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3016b.e();
                if (this.f32293g != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                this.f32295i.invoke((R0.c) this.f32294h);
                return C2735B.f28704a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f fVar) {
            super(2, fVar);
            this.f32292i = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return C3328c.this.new a(this.f32292i, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, f fVar) {
            return ((a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f32290g;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    if (AbstractC2855l.b(C3328c.this.f32287c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    C3328c.this.f32287c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC1309i interfaceC1309i = C3328c.this.f32289e;
                    C0357a c0357a = new C0357a(this.f32292i, null);
                    this.f32290g = 1;
                    obj = j.a(interfaceC1309i, c0357a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                }
                return (R0.f) obj;
            } finally {
                C3328c.this.f32287c.set(kotlin.coroutines.jvm.internal.b.a(false));
            }
        }
    }

    /* JADX INFO: renamed from: s5.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32296g;

        b(f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return C3328c.this.new b(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, f fVar) {
            return ((b) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map mapA;
            Object objE = AbstractC3016b.e();
            int i10 = this.f32296g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                U8.b bVarB = C3328c.this.f32289e.b();
                this.f32296g = 1;
                obj = U8.d.h(bVarB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            R0.f fVar = (R0.f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? K.i() : mapA;
        }
    }

    /* JADX INFO: renamed from: s5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0358c extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32298g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f.a f32300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f32301j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0358c(f.a aVar, Object obj, n7.f fVar) {
            super(2, fVar);
            this.f32300i = aVar;
            this.f32301j = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return C3328c.this.new C0358c(this.f32300i, this.f32301j, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C0358c) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = AbstractC3016b.e();
            int i10 = this.f32298g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                U8.b bVarB = C3328c.this.f32289e.b();
                this.f32298g = 1;
                obj = U8.d.h(bVarB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            R0.f fVar = (R0.f) obj;
            return (fVar == null || (objB = fVar.b(this.f32300i)) == null) ? this.f32301j : objB;
        }
    }

    /* JADX INFO: renamed from: s5.c$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32302g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f.a f32304i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f32305j;

        /* JADX INFO: renamed from: s5.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f32306g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f32307h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ f.a f32308i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Object f32309j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, Object obj, n7.f fVar) {
                super(2, fVar);
                this.f32308i = aVar;
                this.f32309j = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(R0.c cVar, n7.f fVar) {
                return ((a) create(cVar, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                a aVar = new a(this.f32308i, this.f32309j, fVar);
                aVar.f32307h = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3016b.e();
                if (this.f32306g != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                ((R0.c) this.f32307h).i(this.f32308i, this.f32309j);
                return C2735B.f28704a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a aVar, Object obj, n7.f fVar) {
            super(2, fVar);
            this.f32304i = aVar;
            this.f32305j = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return C3328c.this.new d(this.f32304i, this.f32305j, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((d) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f32302g;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            InterfaceC1309i interfaceC1309i = C3328c.this.f32289e;
            a aVar = new a(this.f32304i, this.f32305j, null);
            this.f32302g = 1;
            Object objA = j.a(interfaceC1309i, aVar, this);
            return objA == objE ? objE : objA;
        }
    }

    public C3328c(Context context, String name) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(name, "name");
        this.f32285a = context;
        this.f32286b = name;
        this.f32287c = new ThreadLocal();
        this.f32288d = Q0.a.b(name, new O0.b(new Function1() { // from class: s5.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3328c.e(this.f32282g, (C1304d) obj);
            }
        }), new Function1() { // from class: s5.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3328c.f(this.f32283g, (Context) obj);
            }
        }, null, 8, null);
        this.f32289e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final R0.f e(C3328c c3328c, C1304d ex) {
        AbstractC2855l.g(ex, "ex");
        D.b(C3328c.class).o();
        String str = c3328c.f32286b;
        Process.myPid();
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(C3328c c3328c, Context it) {
        AbstractC2855l.g(it, "it");
        return AbstractC2800q.e(i.b(it, c3328c.f32286b, null, 4, null));
    }

    private final InterfaceC1309i i(Context context) {
        return (InterfaceC1309i) this.f32288d.getValue(context, f32284f[0]);
    }

    public final R0.f g(Function1 transform) {
        AbstractC2855l.g(transform, "transform");
        return (R0.f) AbstractC1415j.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) AbstractC1415j.b(null, new b(null), 1, null);
    }

    public final Object j(f.a key, Object obj) {
        AbstractC2855l.g(key, "key");
        return AbstractC1415j.b(null, new C0358c(key, obj, null), 1, null);
    }

    public final R0.f k(f.a key, Object obj) {
        AbstractC2855l.g(key, "key");
        return (R0.f) AbstractC1415j.b(null, new d(key, obj, null), 1, null);
    }
}
