package c8;

import d8.C2348F;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.C2783G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;

/* JADX INFO: renamed from: c8.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1904f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18969a = new LinkedHashMap();

    /* JADX INFO: renamed from: c8.f0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1904f0 f18971b;

        /* JADX INFO: renamed from: c8.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public final class C0202a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f18972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f18973b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f18974c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Pair f18975d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f18976e;

            public C0202a(a aVar, String functionName, String str) {
                AbstractC2855l.g(functionName, "functionName");
                this.f18976e = aVar;
                this.f18972a = functionName;
                this.f18973b = str;
                this.f18974c = new ArrayList();
                this.f18975d = i7.t.a("V", null);
            }

            public final Pair a() {
                C2348F c2348f = C2348F.f25682a;
                String strC = this.f18976e.c();
                String str = this.f18972a;
                List list = this.f18974c;
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String strL = c2348f.l(strC, c2348f.j(str, arrayList, (String) this.f18975d.c()));
                C1912j0 c1912j0 = (C1912j0) this.f18975d.d();
                List list2 = this.f18974c;
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C1912j0) ((Pair) it2.next()).d());
                }
                return i7.t.a(strL, new C1891Y(c1912j0, arrayList2, this.f18973b));
            }

            public final void b(String type, C1907h... qualifiers) {
                C1912j0 c1912j0;
                AbstractC2855l.g(type, "type");
                AbstractC2855l.g(qualifiers, "qualifiers");
                List list = this.f18974c;
                if (qualifiers.length == 0) {
                    c1912j0 = null;
                } else {
                    Iterable<C2783G> iterableJ0 = AbstractC2793j.J0(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(iterableJ0, 10)), 16));
                    for (C2783G c2783g : iterableJ0) {
                        linkedHashMap.put(Integer.valueOf(c2783g.c()), (C1907h) c2783g.d());
                    }
                    c1912j0 = new C1912j0(linkedHashMap);
                }
                list.add(i7.t.a(type, c1912j0));
            }

            public final void c(String type, C1907h... qualifiers) {
                AbstractC2855l.g(type, "type");
                AbstractC2855l.g(qualifiers, "qualifiers");
                Iterable<C2783G> iterableJ0 = AbstractC2793j.J0(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(iterableJ0, 10)), 16));
                for (C2783G c2783g : iterableJ0) {
                    linkedHashMap.put(Integer.valueOf(c2783g.c()), (C1907h) c2783g.d());
                }
                this.f18975d = i7.t.a(type, new C1912j0(linkedHashMap));
            }

            public final void d(EnumC3382e type) {
                AbstractC2855l.g(type, "type");
                String strM = type.m();
                AbstractC2855l.f(strM, "getDesc(...)");
                this.f18975d = i7.t.a(strM, null);
            }
        }

        public a(C1904f0 c1904f0, String className) {
            AbstractC2855l.g(className, "className");
            this.f18971b = c1904f0;
            this.f18970a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, function1);
        }

        public final void a(String name, String str, Function1 block) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(block, "block");
            Map map = this.f18971b.f18969a;
            C0202a c0202a = new C0202a(this, name, str);
            block.invoke(c0202a);
            Pair pairA = c0202a.a();
            map.put(pairA.c(), pairA.d());
        }

        public final String c() {
            return this.f18970a;
        }
    }

    public final Map b() {
        return this.f18969a;
    }
}
