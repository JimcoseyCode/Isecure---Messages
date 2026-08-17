package Q0;

import R0.f;
import android.content.Context;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f9005a = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends l implements o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f9008i;

        a(n7.f fVar) {
            super(3, fVar);
        }

        @Override // w7.o
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P0.c cVar, R0.f fVar, n7.f fVar2) {
            a aVar = new a(fVar2);
            aVar.f9007h = cVar;
            aVar.f9008i = fVar;
            return aVar.invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f9006g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            P0.c cVar = (P0.c) this.f9007h;
            R0.f fVar = (R0.f) this.f9008i;
            Set setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            Map mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            R0.c cVarC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarC.i(R0.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarC.i(R0.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarC.i(R0.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarC.i(R0.i.f(str), value);
                } else if (value instanceof String) {
                    cVarC.i(R0.i.g(str), value);
                } else if (value instanceof Set) {
                    f.a aVarH = R0.i.h(str);
                    AbstractC2855l.e(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarC.i(aVarH, (Set) value);
                }
            }
            return cVarC.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Set f9011i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, n7.f fVar) {
            super(2, fVar);
            this.f9011i = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R0.f fVar, n7.f fVar2) {
            return ((b) create(fVar, fVar2)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            b bVar = new b(this.f9011i, fVar);
            bVar.f9010h = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.f9009g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Set setKeySet = ((R0.f) this.f9010h).a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f9011i != i.c()) {
                Set set = this.f9011i;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    public static final P0.a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC2855l.g(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f9005a ? new P0.a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new P0.a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ P0.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f9005a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f9005a;
    }

    private static final o d() {
        return new a(null);
    }

    private static final Function2 e(Set set) {
        return new b(set, null);
    }
}
