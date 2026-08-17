package n7;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.g;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static j b(j jVar, j context) {
            AbstractC2855l.g(context, "context");
            return context == k.f30068g ? jVar : (j) context.u0(jVar, new Function2() { // from class: n7.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j.a.c((j) obj, (j.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static j c(j acc, b element) {
            AbstractC2855l.g(acc, "acc");
            AbstractC2855l.g(element, "element");
            j jVarY0 = acc.y0(element.getKey());
            k kVar = k.f30068g;
            if (jVarY0 == kVar) {
                return element;
            }
            g.b bVar = g.f30066e;
            g gVar = (g) jVarY0.e(bVar);
            if (gVar == null) {
                return new e(jVarY0, element);
            }
            j jVarY02 = jVarY0.y0(bVar);
            return jVarY02 == kVar ? new e(element, gVar) : new e(new e(jVarY02, element), gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b extends j {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public static Object a(b bVar, Object obj, Function2 operation) {
                AbstractC2855l.g(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC2855l.g(key, "key");
                if (!AbstractC2855l.b(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC2855l.e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static j c(b bVar, c key) {
                AbstractC2855l.g(key, "key");
                return AbstractC2855l.b(bVar.getKey(), key) ? k.f30068g : bVar;
            }

            public static j d(b bVar, j context) {
                AbstractC2855l.g(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // n7.j
        b e(c cVar);

        c getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
    }

    j X(j jVar);

    b e(c cVar);

    Object u0(Object obj, Function2 function2);

    j y0(c cVar);
}
