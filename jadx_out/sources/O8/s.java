package O8;

import j7.AbstractC2793j;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends n {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f8608a;

        public a(Iterator it) {
            this.f8608a = it;
        }

        @Override // O8.i
        public Iterator iterator() {
            return this.f8608a;
        }
    }

    public static i g(Iterator it) {
        AbstractC2855l.g(it, "<this>");
        return h(new a(it));
    }

    public static i h(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return iVar instanceof O8.a ? iVar : new O8.a(iVar);
    }

    public static i i() {
        return e.f8581a;
    }

    public static final i j(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return k(iVar, new Function1() { // from class: O8.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.l((i) obj);
            }
        });
    }

    private static final i k(i iVar, Function1 function1) {
        return iVar instanceof z ? ((z) iVar).e(function1) : new g(iVar, new Function1() { // from class: O8.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.m(obj);
            }
        }, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator l(i it) {
        AbstractC2855l.g(it, "it");
        return it.iterator();
    }

    public static i n(final Object obj, Function1 nextFunction) {
        AbstractC2855l.g(nextFunction, "nextFunction");
        return obj == null ? e.f8581a : new h(new InterfaceC3487a() { // from class: O8.o
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return s.q(obj);
            }
        }, nextFunction);
    }

    public static i o(final InterfaceC3487a nextFunction) {
        AbstractC2855l.g(nextFunction, "nextFunction");
        return h(new h(nextFunction, new Function1() { // from class: O8.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.p(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(InterfaceC3487a interfaceC3487a, Object it) {
        AbstractC2855l.g(it, "it");
        return interfaceC3487a.invoke();
    }

    public static i r(Object... elements) {
        AbstractC2855l.g(elements, "elements");
        return AbstractC2793j.y(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj) {
        return obj;
    }
}
