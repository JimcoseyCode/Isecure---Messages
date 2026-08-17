package o8;

import C8.AbstractC0407d0;
import C8.D0;
import C8.N0;
import C8.S;
import C8.V;
import C8.r0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.E;
import L7.H;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1300z;
import L7.Z;
import L7.c0;
import L7.g0;
import L7.h0;
import M7.h;
import O7.C1330i;
import O7.K;
import O7.L;
import O7.M;
import O7.N;
import O7.O;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collections;
import java.util.List;
import s8.AbstractC3340e;
import w8.C3496b;
import w8.C3497c;
import w8.C3498d;

/* JADX INFO: renamed from: o8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3026h {

    /* JADX INFO: renamed from: o8.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends C1330i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1280e interfaceC1280e, h0 h0Var, boolean z10) {
            super(interfaceC1280e, null, M7.h.f7570a.b(), true, InterfaceC1277b.a.DECLARATION, h0Var);
            if (interfaceC1280e == null) {
                G(0);
            }
            if (h0Var == null) {
                G(1);
            }
            n1(Collections.EMPTY_LIST, AbstractC3027i.k(interfaceC1280e, z10));
        }

        private static /* synthetic */ void G(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "containingClass";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "source";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[0] = "enumClass";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "createDefaultGetter";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[2] = "createGetter";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static c0 b(InterfaceC1276a interfaceC1276a, S s10, k8.f fVar, M7.h hVar, int i10) {
        if (interfaceC1276a == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC1276a, new C3497c(interfaceC1276a, s10, fVar, null), hVar, k8.g.a(i10));
    }

    public static c0 c(InterfaceC1280e interfaceC1280e, S s10, k8.f fVar, M7.h hVar, int i10) {
        if (interfaceC1280e == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC1280e, new C3496b(interfaceC1280e, s10, fVar, null), hVar, k8.g.a(i10));
    }

    public static L d(Z z10, M7.h hVar) {
        if (z10 == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(z10, hVar, true, false, false);
    }

    public static M e(Z z10, M7.h hVar, M7.h hVar2) {
        if (z10 == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(z10, hVar, hVar2, true, false, false, z10.g());
    }

    public static Z f(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(26);
        }
        H hG = AbstractC3027i.g(interfaceC1280e);
        InterfaceC1280e interfaceC1280eA = AbstractC3040v.a(hG).a(hG);
        if (interfaceC1280eA == null) {
            return null;
        }
        h.a aVar = M7.h.f7570a;
        M7.h hVarB = aVar.b();
        E e10 = E.f7283h;
        AbstractC1295u abstractC1295u = AbstractC1294t.f7347e;
        k8.f fVar = I7.o.f5120e;
        InterfaceC1277b.a aVar2 = InterfaceC1277b.a.SYNTHESIZED;
        K kL0 = K.L0(interfaceC1280e, hVarB, e10, abstractC1295u, false, fVar, aVar2, interfaceC1280e.g(), false, false, false, false, false, false);
        L l10 = new L(kL0, aVar.b(), e10, abstractC1295u, false, false, false, aVar2, null, interfaceC1280e.g());
        kL0.R0(l10, null);
        AbstractC0407d0 abstractC0407d0I = V.i(r0.f682h.j(), interfaceC1280eA.j(), Collections.singletonList(new D0(interfaceC1280e.r())), false);
        List list = Collections.EMPTY_LIST;
        kL0.Y0(abstractC0407d0I, list, null, null, list);
        l10.M0(kL0.getReturnType());
        return kL0;
    }

    public static g0 g(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(24);
        }
        h.a aVar = M7.h.f7570a;
        O oI1 = O.i1(interfaceC1280e, aVar.b(), I7.o.f5121f, InterfaceC1277b.a.SYNTHESIZED, interfaceC1280e.g());
        O7.V v10 = new O7.V(oI1, null, 0, aVar.b(), k8.f.q("value"), AbstractC3340e.m(interfaceC1280e).W(), false, false, false, null, interfaceC1280e.g());
        List list = Collections.EMPTY_LIST;
        O oK1 = oI1.O0(null, null, list, list, Collections.singletonList(v10), interfaceC1280e.r(), E.f7283h, AbstractC1294t.f7347e);
        if (oK1 == null) {
            a(25);
        }
        return oK1;
    }

    public static g0 h(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(22);
        }
        O oI1 = O.i1(interfaceC1280e, M7.h.f7570a.b(), I7.o.f5119d, InterfaceC1277b.a.SYNTHESIZED, interfaceC1280e.g());
        List list = Collections.EMPTY_LIST;
        O oK1 = oI1.O0(null, null, list, list, list, AbstractC3340e.m(interfaceC1280e).l(N0.f592k, interfaceC1280e.r()), E.f7283h, AbstractC1294t.f7347e);
        if (oK1 == null) {
            a(23);
        }
        return oK1;
    }

    public static c0 i(InterfaceC1276a interfaceC1276a, S s10, M7.h hVar) {
        if (interfaceC1276a == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC1276a, new C3498d(interfaceC1276a, s10, null), hVar);
    }

    public static L j(Z z10, M7.h hVar, boolean z11, boolean z12, boolean z13) {
        if (z10 == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(z10, hVar, z11, z12, z13, z10.g());
    }

    public static L k(Z z10, M7.h hVar, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (h0Var == null) {
            a(19);
        }
        return new L(z10, hVar, z10.k(), z10.getVisibility(), z11, z12, z13, InterfaceC1277b.a.DECLARATION, null, h0Var);
    }

    public static C1330i l(InterfaceC1280e interfaceC1280e, h0 h0Var) {
        if (interfaceC1280e == null) {
            a(20);
        }
        if (h0Var == null) {
            a(21);
        }
        return new a(interfaceC1280e, h0Var, false);
    }

    public static M m(Z z10, M7.h hVar, M7.h hVar2, boolean z11, boolean z12, boolean z13, AbstractC1295u abstractC1295u, h0 h0Var) {
        if (z10 == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        if (abstractC1295u == null) {
            a(10);
        }
        if (h0Var == null) {
            a(11);
        }
        M m10 = new M(z10, hVar, z10.k(), abstractC1295u, z11, z12, z13, InterfaceC1277b.a.DECLARATION, null, h0Var);
        m10.N0(M.L0(m10, z10.getType(), hVar2));
        return m10;
    }

    public static M n(Z z10, M7.h hVar, M7.h hVar2, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (h0Var == null) {
            a(6);
        }
        return m(z10, hVar, hVar2, z11, z12, z13, z10.getVisibility(), h0Var);
    }

    private static boolean o(InterfaceC1300z interfaceC1300z) {
        if (interfaceC1300z == null) {
            a(29);
        }
        return interfaceC1300z.getKind() == InterfaceC1277b.a.SYNTHESIZED && AbstractC3027i.A(interfaceC1300z.b());
    }

    public static boolean p(InterfaceC1300z interfaceC1300z) {
        if (interfaceC1300z == null) {
            a(28);
        }
        return interfaceC1300z.getName().equals(I7.o.f5121f) && o(interfaceC1300z);
    }

    public static boolean q(InterfaceC1300z interfaceC1300z) {
        if (interfaceC1300z == null) {
            a(27);
        }
        return interfaceC1300z.getName().equals(I7.o.f5119d) && o(interfaceC1300z);
    }
}
