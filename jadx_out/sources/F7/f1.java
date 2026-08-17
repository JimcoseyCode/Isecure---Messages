package F7;

import A8.InterfaceC0382b;
import A8.InterfaceC0399t;
import F7.AbstractC0548n;
import F7.AbstractC0552p;
import I7.o;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import R7.AbstractC1394f;
import a8.InterfaceC1599a;
import b8.InterfaceC1828l;
import d8.AbstractC2345C;
import i8.AbstractC2757a;
import j8.AbstractC2809d;
import j8.C2814i;
import java.lang.reflect.Method;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;
import o8.AbstractC3026h;
import o8.AbstractC3027i;
import o8.AbstractC3029k;
import s8.AbstractC3340e;
import t8.EnumC3382e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f2051a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.b f2052b = k8.b.f29200d.c(new k8.c("java.lang.Void"));

    private f1() {
    }

    private final I7.l a(Class cls) {
        if (cls.isPrimitive()) {
            return EnumC3382e.k(cls.getSimpleName()).q();
        }
        return null;
    }

    private final boolean b(InterfaceC1300z interfaceC1300z) {
        if (AbstractC3026h.p(interfaceC1300z) || AbstractC3026h.q(interfaceC1300z)) {
            return true;
        }
        return AbstractC2855l.b(interfaceC1300z.getName(), K7.a.f7106e.a()) && interfaceC1300z.i().isEmpty();
    }

    private final AbstractC0548n.e d(InterfaceC1300z interfaceC1300z) {
        return new AbstractC0548n.e(new AbstractC2809d.b(e(interfaceC1300z), AbstractC2345C.c(interfaceC1300z, false, false, 1, null)));
    }

    private final String e(InterfaceC1277b interfaceC1277b) {
        String strE = U7.T.e(interfaceC1277b);
        if (strE != null) {
            return strE;
        }
        if (interfaceC1277b instanceof L7.a0) {
            String strJ = AbstractC3340e.w(interfaceC1277b).getName().j();
            AbstractC2855l.f(strJ, "asString(...)");
            return U7.H.b(strJ);
        }
        if (interfaceC1277b instanceof L7.b0) {
            String strJ2 = AbstractC3340e.w(interfaceC1277b).getName().j();
            AbstractC2855l.f(strJ2, "asString(...)");
            return U7.H.e(strJ2);
        }
        String strJ3 = interfaceC1277b.getName().j();
        AbstractC2855l.f(strJ3, "asString(...)");
        return strJ3;
    }

    public final k8.b c(Class klass) {
        k8.b bVarM;
        AbstractC2855l.g(klass, "klass");
        if (!klass.isArray()) {
            if (AbstractC2855l.b(klass, Void.TYPE)) {
                return f2052b;
            }
            I7.l lVarA = a(klass);
            if (lVarA != null) {
                return new k8.b(I7.o.f5108A, lVarA.s());
            }
            k8.b bVarE = AbstractC1394f.e(klass);
            return (bVarE.i() || (bVarM = K7.c.f7110a.m(bVarE.a())) == null) ? bVarE : bVarM;
        }
        Class<?> componentType = klass.getComponentType();
        AbstractC2855l.f(componentType, "getComponentType(...)");
        I7.l lVarA2 = a(componentType);
        if (lVarA2 != null) {
            return new k8.b(I7.o.f5108A, lVarA2.q());
        }
        b.a aVar = k8.b.f29200d;
        k8.c cVarL = o.a.f5199i.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        return aVar.c(cVarL);
    }

    public final AbstractC0552p f(L7.Z possiblyOverriddenProperty) {
        AbstractC2855l.g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        L7.Z zA = ((L7.Z) AbstractC3027i.L(possiblyOverriddenProperty)).a();
        AbstractC2855l.f(zA, "getOriginal(...)");
        if (zA instanceof A8.N) {
            A8.N n10 = (A8.N) zA;
            f8.n nVarC1 = n10.D();
            AbstractC2950i.f propertySignature = AbstractC2757a.f28747d;
            AbstractC2855l.f(propertySignature, "propertySignature");
            AbstractC2757a.d dVar = (AbstractC2757a.d) h8.e.a(nVarC1, propertySignature);
            if (dVar != null) {
                return new AbstractC0552p.c(zA, nVarC1, dVar, n10.W(), n10.Q());
            }
        } else if (zA instanceof W7.f) {
            W7.f fVar = (W7.f) zA;
            L7.h0 h0VarG = fVar.g();
            InterfaceC1599a interfaceC1599a = h0VarG instanceof InterfaceC1599a ? (InterfaceC1599a) h0VarG : null;
            InterfaceC1828l interfaceC1828lB = interfaceC1599a != null ? interfaceC1599a.b() : null;
            if (interfaceC1828lB instanceof R7.w) {
                return new AbstractC0552p.a(((R7.w) interfaceC1828lB).O());
            }
            if (interfaceC1828lB instanceof R7.z) {
                Method methodO = ((R7.z) interfaceC1828lB).O();
                L7.b0 b0VarH = fVar.h();
                L7.h0 h0VarG2 = b0VarH != null ? b0VarH.g() : null;
                InterfaceC1599a interfaceC1599a2 = h0VarG2 instanceof InterfaceC1599a ? (InterfaceC1599a) h0VarG2 : null;
                InterfaceC1828l interfaceC1828lB2 = interfaceC1599a2 != null ? interfaceC1599a2.b() : null;
                R7.z zVar = interfaceC1828lB2 instanceof R7.z ? (R7.z) interfaceC1828lB2 : null;
                return new AbstractC0552p.b(methodO, zVar != null ? zVar.O() : null);
            }
            throw new Y0("Incorrect resolution sequence for Java field " + zA + " (source = " + interfaceC1828lB + ')');
        }
        L7.a0 getter = zA.getGetter();
        AbstractC2855l.d(getter);
        AbstractC0548n.e eVarD = d(getter);
        L7.b0 b0VarH2 = zA.h();
        return new AbstractC0552p.d(eVarD, b0VarH2 != null ? d(b0VarH2) : null);
    }

    public final AbstractC0548n g(InterfaceC1300z possiblySubstitutedFunction) {
        Method methodO;
        AbstractC2809d.b bVarB;
        AbstractC2809d.b bVarE;
        AbstractC2855l.g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC1300z interfaceC1300zA = ((InterfaceC1300z) AbstractC3027i.L(possiblySubstitutedFunction)).a();
        AbstractC2855l.f(interfaceC1300zA, "getOriginal(...)");
        if (!(interfaceC1300zA instanceof InterfaceC0382b)) {
            if (interfaceC1300zA instanceof W7.e) {
                L7.h0 h0VarG = ((W7.e) interfaceC1300zA).g();
                InterfaceC1599a interfaceC1599a = h0VarG instanceof InterfaceC1599a ? (InterfaceC1599a) h0VarG : null;
                InterfaceC1828l interfaceC1828lB = interfaceC1599a != null ? interfaceC1599a.b() : null;
                R7.z zVar = interfaceC1828lB instanceof R7.z ? (R7.z) interfaceC1828lB : null;
                if (zVar != null && (methodO = zVar.O()) != null) {
                    return new AbstractC0548n.c(methodO);
                }
                throw new Y0("Incorrect resolution sequence for Java method " + interfaceC1300zA);
            }
            if (!(interfaceC1300zA instanceof W7.b)) {
                if (b(interfaceC1300zA)) {
                    return d(interfaceC1300zA);
                }
                throw new Y0("Unknown origin of " + interfaceC1300zA + " (" + interfaceC1300zA.getClass() + ')');
            }
            L7.h0 h0VarG2 = ((W7.b) interfaceC1300zA).g();
            InterfaceC1599a interfaceC1599a2 = h0VarG2 instanceof InterfaceC1599a ? (InterfaceC1599a) h0VarG2 : null;
            InterfaceC1828l interfaceC1828lB2 = interfaceC1599a2 != null ? interfaceC1599a2.b() : null;
            if (interfaceC1828lB2 instanceof R7.t) {
                return new AbstractC0548n.b(((R7.t) interfaceC1828lB2).O());
            }
            if (interfaceC1828lB2 instanceof R7.q) {
                R7.q qVar = (R7.q) interfaceC1828lB2;
                if (qVar.o()) {
                    return new AbstractC0548n.a(qVar.t());
                }
            }
            throw new Y0("Incorrect resolution sequence for Java constructor " + interfaceC1300zA + " (" + interfaceC1828lB2 + ')');
        }
        InterfaceC0399t interfaceC0399t = (InterfaceC0399t) interfaceC1300zA;
        m8.p pVarD = interfaceC0399t.D();
        if ((pVarD instanceof f8.i) && (bVarE = C2814i.f28956a.e((f8.i) pVarD, interfaceC0399t.W(), interfaceC0399t.Q())) != null) {
            return new AbstractC0548n.e(bVarE);
        }
        if (!(pVarD instanceof f8.d) || (bVarB = C2814i.f28956a.b((f8.d) pVarD, interfaceC0399t.W(), interfaceC0399t.Q())) == null) {
            return d(interfaceC1300zA);
        }
        InterfaceC1288m interfaceC1288mB = possiblySubstitutedFunction.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        if (AbstractC3029k.b(interfaceC1288mB)) {
            return new AbstractC0548n.e(bVarB);
        }
        InterfaceC1288m interfaceC1288mB2 = possiblySubstitutedFunction.b();
        AbstractC2855l.f(interfaceC1288mB2, "getContainingDeclaration(...)");
        if (!AbstractC3029k.d(interfaceC1288mB2)) {
            return new AbstractC0548n.d(bVarB);
        }
        InterfaceC1287l interfaceC1287l = (InterfaceC1287l) possiblySubstitutedFunction;
        if (interfaceC1287l.A()) {
            if (!AbstractC2855l.b(bVarB.e(), "constructor-impl") || !P8.q.w(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!AbstractC2855l.b(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            InterfaceC1280e interfaceC1280eB = interfaceC1287l.B();
            AbstractC2855l.f(interfaceC1280eB, "getConstructedClass(...)");
            String strU = G7.o.u(interfaceC1280eB);
            if (P8.q.w(bVarB.d(), ")V", false, 2, null)) {
                bVarB = AbstractC2809d.b.c(bVarB, null, P8.q.x0(bVarB.d(), "V") + strU, 1, null);
            } else if (!P8.q.w(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new AbstractC0548n.e(bVarB);
    }
}
