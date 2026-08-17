package y8;

import C8.AbstractC0407d0;
import L7.AbstractC1299y;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.h0;
import L7.t0;
import com.facebook.react.views.text.TextAttributeProps;
import f8.b;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import q8.C3131A;
import q8.C3132B;
import q8.C3133C;
import q8.C3134D;
import q8.C3136a;
import q8.C3137b;
import q8.C3138c;
import q8.C3139d;
import q8.C3140e;

/* JADX INFO: renamed from: y8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3645g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7.H f34090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L7.M f34091b;

    /* JADX INFO: renamed from: y8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34092a;

        static {
            int[] iArr = new int[b.C0273b.c.EnumC0276c.values().length];
            try {
                iArr[b.C0273b.c.EnumC0276c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0273b.c.EnumC0276c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f34092a = iArr;
        }
    }

    public C3645g(L7.H module, L7.M notFoundClasses) {
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        this.f34090a = module;
        this.f34091b = notFoundClasses;
    }

    private final boolean b(q8.g gVar, C8.S s10, b.C0273b.c cVar) {
        b.C0273b.c.EnumC0276c enumC0276cR = cVar.R();
        int i10 = enumC0276cR == null ? -1 : a.f34092a[enumC0276cR.ordinal()];
        if (i10 == 10) {
            InterfaceC1283h interfaceC1283hP = s10.K0().p();
            InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
            return interfaceC1280e == null || I7.i.l0(interfaceC1280e);
        }
        if (i10 != 13) {
            return AbstractC2855l.b(gVar.a(this.f34090a), s10);
        }
        if (!(gVar instanceof C3137b) || ((List) ((C3137b) gVar).b()).size() != cVar.I().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        C8.S sK = c().k(s10);
        AbstractC2855l.f(sK, "getArrayElementType(...)");
        C3137b c3137b = (C3137b) gVar;
        Iterable iterableK = AbstractC2800q.k((Collection) c3137b.b());
        if ((iterableK instanceof Collection) && ((Collection) iterableK).isEmpty()) {
            return true;
        }
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j7.J) it).nextInt();
            q8.g gVar2 = (q8.g) ((List) c3137b.b()).get(iNextInt);
            b.C0273b.c cVarG = cVar.G(iNextInt);
            AbstractC2855l.f(cVarG, "getArrayElement(...)");
            if (!b(gVar2, sK, cVarG)) {
                return false;
            }
        }
        return true;
    }

    private final I7.i c() {
        return this.f34090a.n();
    }

    private final Pair d(b.C0273b c0273b, Map map, InterfaceC2710c interfaceC2710c) {
        t0 t0Var = (t0) map.get(AbstractC3638L.b(interfaceC2710c, c0273b.v()));
        if (t0Var == null) {
            return null;
        }
        k8.f fVarB = AbstractC3638L.b(interfaceC2710c, c0273b.v());
        C8.S type = t0Var.getType();
        AbstractC2855l.f(type, "getType(...)");
        b.C0273b.c cVarW = c0273b.w();
        AbstractC2855l.f(cVarW, "getValue(...)");
        return new Pair(fVarB, g(type, cVarW, interfaceC2710c));
    }

    private final InterfaceC1280e e(k8.b bVar) {
        return AbstractC1299y.d(this.f34090a, bVar, this.f34091b);
    }

    private final q8.g g(C8.S s10, b.C0273b.c cVar, InterfaceC2710c interfaceC2710c) {
        q8.g gVarF = f(s10, cVar, interfaceC2710c);
        if (!b(gVarF, s10, cVar)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return q8.l.f30876b.a("Unexpected argument value: actual type " + cVar.R() + " != expected type " + s10);
    }

    public final M7.c a(f8.b proto, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        InterfaceC1280e interfaceC1280eE = e(AbstractC3638L.a(nameResolver, proto.z()));
        Map mapI = j7.K.i();
        if (proto.w() != 0 && !E8.l.m(interfaceC1280eE) && AbstractC3027i.t(interfaceC1280eE)) {
            Collection collectionF = interfaceC1280eE.f();
            AbstractC2855l.f(collectionF, "getConstructors(...)");
            InterfaceC1279d interfaceC1279d = (InterfaceC1279d) AbstractC2800q.D0(collectionF);
            if (interfaceC1279d != null) {
                List listI = interfaceC1279d.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(listI, 10)), 16));
                for (Object obj : listI) {
                    linkedHashMap.put(((t0) obj).getName(), obj);
                }
                List<b.C0273b> listX = proto.x();
                AbstractC2855l.f(listX, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C0273b c0273b : listX) {
                    AbstractC2855l.d(c0273b);
                    Pair pairD = d(c0273b, linkedHashMap, nameResolver);
                    if (pairD != null) {
                        arrayList.add(pairD);
                    }
                }
                mapI = j7.K.r(arrayList);
            }
        }
        return new M7.d(interfaceC1280eE.r(), mapI, h0.f7335a);
    }

    public final q8.g f(C8.S expectedType, b.C0273b.c value, InterfaceC2710c nameResolver) {
        AbstractC2855l.g(expectedType, "expectedType");
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(nameResolver, "nameResolver");
        Boolean boolD = AbstractC2709b.f28530P.d(value.N());
        AbstractC2855l.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        b.C0273b.c.EnumC0276c enumC0276cR = value.R();
        switch (enumC0276cR == null ? -1 : a.f34092a[enumC0276cR.ordinal()]) {
            case 1:
                byte bP = (byte) value.P();
                return zBooleanValue ? new C3131A(bP) : new C3139d(bP);
            case 2:
                return new C3140e((char) value.P());
            case 3:
                short sP = (short) value.P();
                return zBooleanValue ? new C3134D(sP) : new q8.w(sP);
            case 4:
                int iP = (int) value.P();
                return zBooleanValue ? new C3132B(iP) : new q8.n(iP);
            case 5:
                long jP = value.P();
                return zBooleanValue ? new C3133C(jP) : new q8.t(jP);
            case 6:
                return new q8.m(value.O());
            case 7:
                return new q8.j(value.L());
            case 8:
                return new C3138c(value.P() != 0);
            case 9:
                return new q8.x(nameResolver.getString(value.Q()));
            case 10:
                return new q8.s(AbstractC3638L.a(nameResolver, value.J()), value.F());
            case 11:
                return new q8.k(AbstractC3638L.a(nameResolver, value.J()), AbstractC3638L.b(nameResolver, value.M()));
            case 12:
                f8.b bVarE = value.E();
                AbstractC2855l.f(bVarE, "getAnnotation(...)");
                return new C3136a(a(bVarE, nameResolver));
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                q8.i iVar = q8.i.f30873a;
                List<b.C0273b.c> listI = value.I();
                AbstractC2855l.f(listI, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI, 10));
                for (b.C0273b.c cVar : listI) {
                    AbstractC0407d0 abstractC0407d0I = c().i();
                    AbstractC2855l.f(abstractC0407d0I, "getAnyType(...)");
                    AbstractC2855l.d(cVar);
                    arrayList.add(f(abstractC0407d0I, cVar, nameResolver));
                }
                return iVar.b(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.R() + " (expected " + expectedType + ')').toString());
        }
    }
}
