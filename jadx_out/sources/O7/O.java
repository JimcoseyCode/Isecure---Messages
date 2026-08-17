package O7;

import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.g0;
import L7.h0;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class O extends AbstractC1339s implements g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected O(InterfaceC1288m interfaceC1288m, g0 g0Var, M7.h hVar, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var) {
        super(interfaceC1288m, g0Var, hVar, fVar, aVar, h0Var);
        if (interfaceC1288m == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (fVar == null) {
            G(2);
        }
        if (aVar == null) {
            G(3);
        }
        if (h0Var == null) {
            G(4);
        }
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "visibility";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "initialize";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case 29:
            case 30:
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static O i1(InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(5);
        }
        if (hVar == null) {
            G(6);
        }
        if (fVar == null) {
            G(7);
        }
        if (aVar == null) {
            G(8);
        }
        if (h0Var == null) {
            G(9);
        }
        return new O(interfaceC1288m, null, hVar, fVar, aVar, h0Var);
    }

    @Override // O7.AbstractC1339s
    /* JADX INFO: renamed from: I0 */
    protected AbstractC1339s l1(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a aVar, k8.f fVar, M7.h hVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(25);
        }
        if (aVar == null) {
            G(26);
        }
        if (hVar == null) {
            G(27);
        }
        if (h0Var == null) {
            G(28);
        }
        g0 g0Var = (g0) interfaceC1300z;
        if (fVar == null) {
            fVar = getName();
        }
        return new O(interfaceC1288m, g0Var, hVar, fVar, aVar, h0Var);
    }

    @Override // L7.InterfaceC1277b
    /* JADX INFO: renamed from: h1 */
    public g0 x(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        g0 g0Var = (g0) super.H0(interfaceC1288m, e10, abstractC1295u, aVar, z10);
        if (g0Var == null) {
            G(29);
        }
        return g0Var;
    }

    @Override // O7.AbstractC1335n
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        g0 g0Var = (g0) super.a();
        if (g0Var == null) {
            G(24);
        }
        return g0Var;
    }

    @Override // O7.AbstractC1339s
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public O O0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, C8.S s10, L7.E e10, AbstractC1295u abstractC1295u) {
        if (list == null) {
            G(14);
        }
        if (list2 == null) {
            G(15);
        }
        if (list3 == null) {
            G(16);
        }
        if (abstractC1295u == null) {
            G(17);
        }
        O oL1 = l1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC1295u, null);
        if (oL1 == null) {
            G(18);
        }
        return oL1;
    }

    public O l1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, C8.S s10, L7.E e10, AbstractC1295u abstractC1295u, Map map) {
        if (list == null) {
            G(19);
        }
        if (list2 == null) {
            G(20);
        }
        if (list3 == null) {
            G(21);
        }
        if (abstractC1295u == null) {
            G(22);
        }
        super.O0(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC1295u);
        if (map != null && !map.isEmpty()) {
            this.f8506J = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z, L7.g0
    public InterfaceC1300z.a s() {
        InterfaceC1300z.a aVarS = super.s();
        if (aVarS == null) {
            G(30);
        }
        return aVarS;
    }
}
