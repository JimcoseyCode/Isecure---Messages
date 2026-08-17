package C8;

import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: C8.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0423l0 {

    /* JADX INFO: renamed from: C8.l0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends w0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f660d;

        a(List list) {
            this.f660d = list;
        }

        @Override // C8.w0
        public B0 k(v0 key) {
            AbstractC2855l.g(key, "key");
            if (!this.f660d.contains(key)) {
                return null;
            }
            InterfaceC1283h interfaceC1283hP = key.p();
            AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return J0.s((L7.m0) interfaceC1283hP);
        }
    }

    private static final S a(List list, List list2, I7.i iVar) {
        S sP = G0.g(new a(list)).p((S) AbstractC2800q.e0(list2), N0.f594m);
        if (sP != null) {
            return sP;
        }
        AbstractC0407d0 abstractC0407d0Y = iVar.y();
        AbstractC2855l.f(abstractC0407d0Y, "getDefaultBound(...)");
        return abstractC0407d0Y;
    }

    public static final S b(L7.m0 m0Var) {
        AbstractC2855l.g(m0Var, "<this>");
        InterfaceC1288m interfaceC1288mB = m0Var.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        if (interfaceC1288mB instanceof InterfaceC1284i) {
            List parameters = ((InterfaceC1284i) interfaceC1288mB).j().getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                v0 v0VarJ = ((L7.m0) it.next()).j();
                AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
                arrayList.add(v0VarJ);
            }
            List upperBounds = m0Var.getUpperBounds();
            AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, AbstractC3340e.m(m0Var));
        }
        if (!(interfaceC1288mB instanceof InterfaceC1300z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC1300z) interfaceC1288mB).getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            v0 v0VarJ2 = ((L7.m0) it2.next()).j();
            AbstractC2855l.f(v0VarJ2, "getTypeConstructor(...)");
            arrayList2.add(v0VarJ2);
        }
        List upperBounds2 = m0Var.getUpperBounds();
        AbstractC2855l.f(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, AbstractC3340e.m(m0Var));
    }
}
