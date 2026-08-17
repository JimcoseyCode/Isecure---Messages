package C8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0407d0 f581a = E8.l.d(E8.k.f1185K, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0407d0 f582b = E8.l.d(E8.k.f1171D, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0407d0 f583c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0407d0 f584d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends A {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f585h;

        public a(String str) {
            this.f585h = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void W0(int i10) {
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i10 == 2) {
                objArr[0] = "delegate";
            } else if (i10 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i10 != 4) {
                objArr[0] = "newAttributes";
            }
            if (i10 == 1) {
                objArr[1] = "toString";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i10 == 3) {
                    objArr[2] = "refine";
                } else if (i10 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // C8.M0
        /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
        public AbstractC0407d0 O0(boolean z10) {
            throw new IllegalStateException(this.f585h);
        }

        @Override // C8.M0
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public AbstractC0407d0 Q0(r0 r0Var) {
            if (r0Var == null) {
                W0(0);
            }
            throw new IllegalStateException(this.f585h);
        }

        @Override // C8.A
        protected AbstractC0407d0 T0() {
            throw new IllegalStateException(this.f585h);
        }

        @Override // C8.A
        public A V0(AbstractC0407d0 abstractC0407d0) {
            if (abstractC0407d0 == null) {
                W0(2);
            }
            throw new IllegalStateException(this.f585h);
        }

        @Override // C8.A
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a U0(D8.g gVar) {
            if (gVar == null) {
                W0(3);
            }
            return this;
        }

        @Override // C8.AbstractC0407d0
        public String toString() {
            String str = this.f585h;
            if (str == null) {
                W0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "subType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "superType";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "substitutor";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i10 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i10 == 11 || i10 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i10 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i10 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i10 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i10 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i10 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i10 != 53) {
            if (i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i10) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "getImmediateSupertypes";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[2] = "collectAllSupertypes";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[2] = "getAllSupertypes";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "isNullableType";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(S s10) {
        if (s10 == null) {
            a(28);
        }
        if (s10.L0()) {
            return true;
        }
        return L.b(s10) && b(L.a(s10).T0());
    }

    public static boolean c(S s10, Function1 function1) {
        if (function1 == null) {
            a(43);
        }
        return d(s10, function1, null);
    }

    private static boolean d(S s10, Function1 function1, M8.l lVar) {
        if (function1 == null) {
            a(44);
        }
        if (s10 == null) {
            return false;
        }
        M0 m0N0 = s10.N0();
        if (w(s10)) {
            return ((Boolean) function1.invoke(m0N0)).booleanValue();
        }
        if (lVar != null && lVar.contains(s10)) {
            return false;
        }
        if (((Boolean) function1.invoke(m0N0)).booleanValue()) {
            return true;
        }
        if (lVar == null) {
            lVar = M8.l.o();
        }
        lVar.add(s10);
        I i10 = m0N0 instanceof I ? (I) m0N0 : null;
        if (i10 != null && (d(i10.S0(), function1, lVar) || d(i10.T0(), function1, lVar))) {
            return true;
        }
        if ((m0N0 instanceof C0438y) && d(((C0438y) m0N0).W0(), function1, lVar)) {
            return true;
        }
        v0 v0VarK0 = s10.K0();
        if (v0VarK0 instanceof Q) {
            Iterator it = ((Q) v0VarK0).g().iterator();
            while (it.hasNext()) {
                if (d((S) it.next(), function1, lVar)) {
                    return true;
                }
            }
            return false;
        }
        for (B0 b02 : s10.I0()) {
            if (!b02.b() && d(b02.getType(), function1, lVar)) {
                return true;
            }
        }
        return false;
    }

    public static S e(S s10, S s11, G0 g02) {
        if (s10 == null) {
            a(20);
        }
        if (s11 == null) {
            a(21);
        }
        if (g02 == null) {
            a(22);
        }
        S sP = g02.p(s11, N0.f592k);
        if (sP != null) {
            return q(sP, s10.L0());
        }
        return null;
    }

    public static InterfaceC1280e f(S s10) {
        if (s10 == null) {
            a(30);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hP;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D0(((L7.m0) it.next()).r()));
        }
        List listP0 = AbstractC2800q.P0(arrayList);
        if (listP0 == null) {
            a(17);
        }
        return listP0;
    }

    public static List h(S s10) {
        if (s10 == null) {
            a(18);
        }
        G0 g0F = G0.f(s10);
        Collection collectionG = s10.K0().g();
        ArrayList arrayList = new ArrayList(collectionG.size());
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            S sE = e(s10, (S) it.next(), g0F);
            if (sE != null) {
                arrayList.add(sE);
            }
        }
        return arrayList;
    }

    public static L7.m0 i(S s10) {
        if (s10 == null) {
            a(63);
        }
        if (s10.K0().p() instanceof L7.m0) {
            return (L7.m0) s10.K0().p();
        }
        return null;
    }

    public static boolean j(S s10) {
        if (s10 == null) {
            a(29);
        }
        if (s10.K0().p() instanceof InterfaceC1280e) {
            return false;
        }
        Iterator it = h(s10).iterator();
        while (it.hasNext()) {
            if (l((S) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(S s10) {
        return s10 != null && s10.K0() == f581a.K0();
    }

    public static boolean l(S s10) {
        if (s10 == null) {
            a(27);
        }
        if (s10.L0()) {
            return true;
        }
        if (L.b(s10) && l(L.a(s10).T0())) {
            return true;
        }
        if (AbstractC0415h0.c(s10)) {
            return false;
        }
        if (m(s10)) {
            return j(s10);
        }
        v0 v0VarK0 = s10.K0();
        if (v0VarK0 instanceof Q) {
            Iterator it = v0VarK0.g().iterator();
            while (it.hasNext()) {
                if (l((S) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(S s10) {
        if (s10 == null) {
            a(60);
        }
        if (i(s10) != null) {
            return true;
        }
        s10.K0();
        return false;
    }

    public static S n(S s10) {
        if (s10 == null) {
            a(2);
        }
        return p(s10, false);
    }

    public static S o(S s10) {
        if (s10 == null) {
            a(1);
        }
        return p(s10, true);
    }

    public static S p(S s10, boolean z10) {
        if (s10 == null) {
            a(3);
        }
        M0 m0O0 = s10.N0().O0(z10);
        if (m0O0 == null) {
            a(4);
        }
        return m0O0;
    }

    public static S q(S s10, boolean z10) {
        if (s10 == null) {
            a(8);
        }
        if (z10) {
            return o(s10);
        }
        if (s10 == null) {
            a(9);
        }
        return s10;
    }

    public static AbstractC0407d0 r(AbstractC0407d0 abstractC0407d0, boolean z10) {
        if (abstractC0407d0 == null) {
            a(5);
        }
        if (!z10) {
            if (abstractC0407d0 == null) {
                a(7);
            }
            return abstractC0407d0;
        }
        AbstractC0407d0 abstractC0407d0O0 = abstractC0407d0.O0(true);
        if (abstractC0407d0O0 == null) {
            a(6);
        }
        return abstractC0407d0O0;
    }

    public static B0 s(L7.m0 m0Var) {
        if (m0Var == null) {
            a(45);
        }
        return new C0421k0(m0Var);
    }

    public static B0 t(L7.m0 m0Var, G g10) {
        if (m0Var == null) {
            a(46);
        }
        return g10.b() == I0.f574g ? new D0(AbstractC0423l0.b(m0Var)) : new C0421k0(m0Var);
    }

    public static AbstractC0407d0 u(v0 v0Var, InterfaceC3442k interfaceC3442k, Function1 function1) {
        if (v0Var == null) {
            a(12);
        }
        if (interfaceC3442k == null) {
            a(13);
        }
        if (function1 == null) {
            a(14);
        }
        AbstractC0407d0 abstractC0407d0N = V.n(r0.f682h.j(), v0Var, g(v0Var.getParameters()), false, interfaceC3442k, function1);
        if (abstractC0407d0N == null) {
            a(15);
        }
        return abstractC0407d0N;
    }

    public static AbstractC0407d0 v(InterfaceC1283h interfaceC1283h, InterfaceC3442k interfaceC3442k, Function1 function1) {
        if (!E8.l.m(interfaceC1283h)) {
            return u(interfaceC1283h.j(), interfaceC3442k, function1);
        }
        E8.i iVarD = E8.l.d(E8.k.f1183J, interfaceC1283h.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static boolean w(S s10) {
        if (s10 == null) {
            a(0);
        }
        return s10 == f583c || s10 == f584d;
    }
}
