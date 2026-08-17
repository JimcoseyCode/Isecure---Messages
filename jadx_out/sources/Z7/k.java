package Z7;

import C8.A0;
import C8.AbstractC0407d0;
import C8.B0;
import C8.I;
import C8.InterfaceC0405c0;
import C8.S;
import C8.r0;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import P8.q;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import n8.n;
import n8.w;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends I implements InterfaceC0405c0 {
    private k(AbstractC0407d0 abstractC0407d0, AbstractC0407d0 abstractC0407d02, boolean z10) {
        super(abstractC0407d0, abstractC0407d02);
        if (z10) {
            return;
        }
        D8.e.f819a.b(abstractC0407d0, abstractC0407d02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Y0(String it) {
        AbstractC2855l.g(it, "it");
        return "(raw) " + it;
    }

    private static final boolean Z0(String str, String str2) {
        return AbstractC2855l.b(str, q.w0(str2, "out ")) || AbstractC2855l.b(str2, "*");
    }

    private static final List a1(n nVar, S s10) {
        List listI0 = s10.I0();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.V((B0) it.next()));
        }
        return arrayList;
    }

    private static final String b1(String str, String str2) {
        if (!q.P(str, '<', false, 2, null)) {
            return str;
        }
        return q.W0(str, '<', null, 2, null) + '<' + str2 + '>' + q.S0(str, '>', null, 2, null);
    }

    @Override // C8.I
    public AbstractC0407d0 R0() {
        return S0();
    }

    @Override // C8.I
    public String U0(n renderer, w options) {
        AbstractC2855l.g(renderer, "renderer");
        AbstractC2855l.g(options, "options");
        String strU = renderer.U(S0());
        String strU2 = renderer.U(T0());
        if (options.o()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (T0().I0().isEmpty()) {
            return renderer.R(strU, strU2, H8.d.n(this));
        }
        List listA1 = a1(renderer, S0());
        List listA12 = a1(renderer, T0());
        String strO0 = AbstractC2800q.o0(listA1, ", ", null, null, 0, null, j.f13656g, 30, null);
        List<Pair> listX0 = AbstractC2800q.X0(listA1, listA12);
        if (listX0 == null || !listX0.isEmpty()) {
            for (Pair pair : listX0) {
                if (!Z0((String) pair.c(), (String) pair.d())) {
                    break;
                }
            }
            strU2 = b1(strU2, strO0);
        } else {
            strU2 = b1(strU2, strO0);
        }
        String strB1 = b1(strU, strO0);
        return AbstractC2855l.b(strB1, strU2) ? strB1 : renderer.R(strB1, strU2, H8.d.n(this));
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public k O0(boolean z10) {
        return new k(S0().O0(z10), T0().O0(z10));
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public I U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(S0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(T0());
        AbstractC2855l.e(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((AbstractC0407d0) sA, (AbstractC0407d0) sA2, true);
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public k Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new k(S0().Q0(newAttributes), T0().Q0(newAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C8.I, C8.S
    public InterfaceC3442k o() {
        InterfaceC1283h interfaceC1283hP = K0().p();
        A0 a02 = null;
        Object[] objArr = 0;
        InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
        if (interfaceC1280e != null) {
            InterfaceC3442k interfaceC3442kN0 = interfaceC1280e.n0(new i(a02, 1, objArr == true ? 1 : 0));
            AbstractC2855l.f(interfaceC3442kN0, "getMemberScope(...)");
            return interfaceC3442kN0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + K0().p()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
        this(lowerBound, upperBound, false);
        AbstractC2855l.g(lowerBound, "lowerBound");
        AbstractC2855l.g(upperBound, "upperBound");
    }
}
