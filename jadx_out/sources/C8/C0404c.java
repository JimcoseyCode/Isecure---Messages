package C8;

import C8.u0;
import j7.AbstractC2800q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0404c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0404c f629a = new C0404c();

    private C0404c() {
    }

    private final boolean c(u0 u0Var, G8.j jVar, G8.m mVar) {
        G8.o oVarJ = u0Var.j();
        if (oVarJ.U(jVar)) {
            return true;
        }
        if (oVarJ.W(jVar)) {
            return false;
        }
        if (u0Var.n() && oVarJ.E(jVar)) {
            return true;
        }
        return oVarJ.V(oVarJ.c(jVar), mVar);
    }

    private final boolean e(u0 u0Var, G8.j jVar, G8.j jVar2) {
        G8.o oVarJ = u0Var.j();
        if (C0412g.f646b) {
            if (!oVarJ.b(jVar) && !oVarJ.r(oVarJ.c(jVar))) {
                u0Var.l(jVar);
            }
            if (!oVarJ.b(jVar2)) {
                u0Var.l(jVar2);
            }
        }
        if (oVarJ.W(jVar2) || oVarJ.f0(jVar) || oVarJ.v(jVar)) {
            return true;
        }
        if ((jVar instanceof G8.d) && oVarJ.s((G8.d) jVar)) {
            return true;
        }
        C0404c c0404c = f629a;
        if (c0404c.a(u0Var, jVar, u0.c.b.f706a)) {
            return true;
        }
        if (oVarJ.f0(jVar2) || c0404c.a(u0Var, jVar2, u0.c.d.f708a) || oVarJ.B(jVar)) {
            return false;
        }
        return c0404c.b(u0Var, jVar, oVarJ.c(jVar2));
    }

    public final boolean a(u0 u0Var, G8.j type, u0.c supertypesPolicy) {
        AbstractC2855l.g(u0Var, "<this>");
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(supertypesPolicy, "supertypesPolicy");
        G8.o oVarJ = u0Var.j();
        if ((oVarJ.B(type) && !oVarJ.W(type)) || oVarJ.f0(type)) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC2855l.d(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC2855l.d(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + AbstractC2800q.o0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            G8.j jVar = (G8.j) arrayDequeH.pop();
            AbstractC2855l.d(jVar);
            if (setI.add(jVar)) {
                u0.c cVar = oVarJ.W(jVar) ? u0.c.C0025c.f707a : supertypesPolicy;
                if (AbstractC2855l.b(cVar, u0.c.C0025c.f707a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    G8.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.m(oVarJ2.c(jVar)).iterator();
                    while (it.hasNext()) {
                        G8.j jVarA = cVar.a(u0Var, (G8.i) it.next());
                        if ((oVarJ.B(jVarA) && !oVarJ.W(jVarA)) || oVarJ.f0(jVarA)) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    public final boolean b(u0 state, G8.j start, G8.m end) {
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(start, "start");
        AbstractC2855l.g(end, "end");
        G8.o oVarJ = state.j();
        if (f629a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC2855l.d(arrayDequeH);
        Set setI = state.i();
        AbstractC2855l.d(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + AbstractC2800q.o0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            G8.j jVar = (G8.j) arrayDequeH.pop();
            AbstractC2855l.d(jVar);
            if (setI.add(jVar)) {
                u0.c cVar = oVarJ.W(jVar) ? u0.c.C0025c.f707a : u0.c.b.f706a;
                if (AbstractC2855l.b(cVar, u0.c.C0025c.f707a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    G8.o oVarJ2 = state.j();
                    Iterator it = oVarJ2.m(oVarJ2.c(jVar)).iterator();
                    while (it.hasNext()) {
                        G8.j jVarA = cVar.a(state, (G8.i) it.next());
                        if (f629a.c(state, jVarA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(u0 state, G8.j subType, G8.j superType) {
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return e(state, subType, superType);
    }
}
