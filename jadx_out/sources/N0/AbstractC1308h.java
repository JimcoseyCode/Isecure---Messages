package N0;

import i7.AbstractC2738a;
import i7.AbstractC2753p;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: N0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1308h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7731a = new a(null);

    /* JADX INFO: renamed from: N0.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: N0.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0073a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f7732g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f7733h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ List f7734i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0073a(List list, n7.f fVar) {
                super(2, fVar);
                this.f7734i = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, n7.f fVar) {
                return ((C0073a) create(sVar, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                C0073a c0073a = new C0073a(this.f7734i, fVar);
                c0073a.f7733h = obj;
                return c0073a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC3016b.e();
                int i10 = this.f7732g;
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    s sVar = (s) this.f7733h;
                    a aVar = AbstractC1308h.f7731a;
                    List list = this.f7734i;
                    this.f7732g = 1;
                    if (aVar.c(list, sVar, this) == objE) {
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

        /* JADX INFO: renamed from: N0.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f7735g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f7736h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f7737i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f7739k;

            b(n7.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7737i = obj;
                this.f7739k |= androidx.customview.widget.a.INVALID_ID;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: N0.h$a$c */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f7740g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f7741h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f7742i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f7743j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            /* synthetic */ Object f7744k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ List f7745l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ List f7746m;

            /* JADX INFO: renamed from: N0.h$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            static final class C0074a extends kotlin.coroutines.jvm.internal.l implements Function1 {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f7747g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC1307g f7748h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0074a(InterfaceC1307g interfaceC1307g, n7.f fVar) {
                    super(1, fVar);
                    this.f7748h = interfaceC1307g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final n7.f create(n7.f fVar) {
                    return new C0074a(this.f7748h, fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = AbstractC3016b.e();
                    int i10 = this.f7747g;
                    if (i10 == 0) {
                        AbstractC2753p.b(obj);
                        InterfaceC1307g interfaceC1307g = this.f7748h;
                        this.f7747g = 1;
                        if (interfaceC1307g.a(this) == objE) {
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

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(n7.f fVar) {
                    return ((C0074a) create(fVar)).invokeSuspend(C2735B.f28704a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, n7.f fVar) {
                super(2, fVar);
                this.f7745l = list;
                this.f7746m = list2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, n7.f fVar) {
                return ((c) create(obj, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                c cVar = new c(this.f7745l, this.f7746m, fVar);
                cVar.f7744k = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                InterfaceC1307g interfaceC1307g;
                Iterator it2;
                Object obj2;
                Object objE = AbstractC3016b.e();
                int i10 = this.f7743j;
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    obj = this.f7744k;
                    List list2 = this.f7745l;
                    list = this.f7746m;
                    it = list2.iterator();
                } else if (i10 == 1) {
                    obj2 = this.f7742i;
                    InterfaceC1307g interfaceC1307g2 = (InterfaceC1307g) this.f7741h;
                    it2 = (Iterator) this.f7740g;
                    List list3 = (List) this.f7744k;
                    AbstractC2753p.b(obj);
                    interfaceC1307g = interfaceC1307g2;
                    list = list3;
                    if (!((Boolean) obj).booleanValue()) {
                        list.add(new C0074a(interfaceC1307g, null));
                        this.f7744k = list;
                        this.f7740g = it2;
                        this.f7741h = null;
                        this.f7742i = null;
                        this.f7743j = 2;
                        obj = interfaceC1307g.b(obj2, this);
                        if (obj != objE) {
                            it = it2;
                        }
                        return objE;
                    }
                    obj = obj2;
                    it = it2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f7740g;
                    list = (List) this.f7744k;
                    AbstractC2753p.b(obj);
                }
                if (!it.hasNext()) {
                    InterfaceC1307g interfaceC1307g3 = (InterfaceC1307g) it.next();
                    this.f7744k = list;
                    this.f7740g = it;
                    this.f7741h = interfaceC1307g3;
                    this.f7742i = obj;
                    this.f7743j = 1;
                    Object objC = interfaceC1307g3.c(obj, this);
                    if (objC != objE) {
                        Iterator it3 = it;
                        obj2 = obj;
                        obj = objC;
                        interfaceC1307g = interfaceC1307g3;
                        it2 = it3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        if (!it.hasNext()) {
                            return obj;
                        }
                    }
                    return objE;
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(List list, s sVar, n7.f fVar) throws Throwable {
            b bVar;
            List list2;
            kotlin.jvm.internal.C c10;
            Iterator it;
            Throwable th;
            if (fVar instanceof b) {
                bVar = (b) fVar;
                int i10 = bVar.f7739k;
                if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                    bVar.f7739k = i10 - androidx.customview.widget.a.INVALID_ID;
                } else {
                    bVar = new b(fVar);
                }
            }
            Object obj = bVar.f7737i;
            Object objE = AbstractC3016b.e();
            int i11 = bVar.f7739k;
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                ArrayList arrayList = new ArrayList();
                Function2 cVar = new c(list, arrayList, null);
                bVar.f7735g = arrayList;
                bVar.f7739k = 1;
                if (sVar.c(cVar, bVar) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f7736h;
                c10 = (kotlin.jvm.internal.C) bVar.f7735g;
                try {
                    AbstractC2753p.b(obj);
                } catch (Throwable th2) {
                    Object obj2 = c10.f29371g;
                    if (obj2 == null) {
                        c10.f29371g = th2;
                    } else {
                        AbstractC2855l.d(obj2);
                        AbstractC2738a.a((Throwable) obj2, th2);
                    }
                }
                while (it.hasNext()) {
                    Function1 function1 = (Function1) it.next();
                    bVar.f7735g = c10;
                    bVar.f7736h = it;
                    bVar.f7739k = 2;
                    if (function1.invoke(bVar) == objE) {
                        return objE;
                    }
                }
                th = (Throwable) c10.f29371g;
                if (th != null) {
                    return C2735B.f28704a;
                }
                throw th;
            }
            list2 = (List) bVar.f7735g;
            AbstractC2753p.b(obj);
            c10 = new kotlin.jvm.internal.C();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) c10.f29371g;
            if (th != null) {
            }
        }

        public final Function2 b(List migrations) {
            AbstractC2855l.g(migrations, "migrations");
            return new C0073a(migrations, null);
        }

        private a() {
        }
    }
}
