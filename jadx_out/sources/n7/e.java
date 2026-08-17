package n7;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements j, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f30062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j.b f30063h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements Serializable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0324a f30064h = new C0324a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final j[] f30065g;

        /* JADX INFO: renamed from: n7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0324a {
            public /* synthetic */ C0324a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0324a() {
            }
        }

        public a(j[] elements) {
            AbstractC2855l.g(elements, "elements");
            this.f30065g = elements;
        }

        private final Object readResolve() {
            j[] jVarArr = this.f30065g;
            j jVarX = k.f30068g;
            for (j jVar : jVarArr) {
                jVarX = jVarX.X(jVar);
            }
            return jVarX;
        }
    }

    public e(j left, j.b element) {
        AbstractC2855l.g(left, "left");
        AbstractC2855l.g(element, "element");
        this.f30062g = left;
        this.f30063h = element;
    }

    private final boolean c(j.b bVar) {
        return AbstractC2855l.b(e(bVar.getKey()), bVar);
    }

    private final boolean f(e eVar) {
        while (c(eVar.f30063h)) {
            j jVar = eVar.f30062g;
            if (!(jVar instanceof e)) {
                AbstractC2855l.e(jVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((j.b) jVar);
            }
            eVar = (e) jVar;
        }
        return false;
    }

    private final int g() {
        int i10 = 2;
        e eVar = this;
        while (true) {
            j jVar = eVar.f30062g;
            eVar = jVar instanceof e ? (e) jVar : null;
            if (eVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String acc, j.b element) {
        AbstractC2855l.g(acc, "acc");
        AbstractC2855l.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(j[] jVarArr, A a10, C2735B c2735b, j.b element) {
        AbstractC2855l.g(c2735b, "<unused var>");
        AbstractC2855l.g(element, "element");
        int i10 = a10.f29369g;
        a10.f29369g = i10 + 1;
        jVarArr[i10] = element;
        return C2735B.f28704a;
    }

    private final Object writeReplace() {
        int iG = g();
        final j[] jVarArr = new j[iG];
        final A a10 = new A();
        u0(C2735B.f28704a, new Function2() { // from class: n7.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.i(jVarArr, a10, (C2735B) obj, (j.b) obj2);
            }
        });
        if (a10.f29369g == iG) {
            return new a(jVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // n7.j
    public j X(j jVar) {
        return j.a.b(this, jVar);
    }

    @Override // n7.j
    public j.b e(j.c key) {
        AbstractC2855l.g(key, "key");
        e eVar = this;
        while (true) {
            j.b bVarE = eVar.f30063h.e(key);
            if (bVarE != null) {
                return bVarE;
            }
            j jVar = eVar.f30062g;
            if (!(jVar instanceof e)) {
                return jVar.e(key);
            }
            eVar = (e) jVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.g() == g() && eVar.f(this);
    }

    public int hashCode() {
        return this.f30062g.hashCode() + this.f30063h.hashCode();
    }

    public String toString() {
        return '[' + ((String) u0(PointerEventHelper.POINTER_TYPE_UNKNOWN, new Function2() { // from class: n7.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.h((String) obj, (j.b) obj2);
            }
        })) + ']';
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 operation) {
        AbstractC2855l.g(operation, "operation");
        return operation.invoke(this.f30062g.u0(obj, operation), this.f30063h);
    }

    @Override // n7.j
    public j y0(j.c key) {
        AbstractC2855l.g(key, "key");
        if (this.f30063h.e(key) != null) {
            return this.f30062g;
        }
        j jVarY0 = this.f30062g.y0(key);
        return jVarY0 == this.f30062g ? this : jVarY0 == k.f30068g ? this.f30063h : new e(jVarY0, this.f30063h);
    }
}
