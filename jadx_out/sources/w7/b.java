package W7;

import C8.S;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.h0;
import O7.C1330i;
import com.facebook.react.views.text.TextAttributeProps;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Pair;
import o8.AbstractC3026h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends C1330i implements a {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Boolean f12133L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Boolean f12134M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(InterfaceC1280e interfaceC1280e, b bVar, M7.h hVar, boolean z10, InterfaceC1277b.a aVar, h0 h0Var) {
        super(interfaceC1280e, bVar, hVar, z10, aVar, h0Var);
        if (interfaceC1280e == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (aVar == null) {
            G(2);
        }
        if (h0Var == null) {
            G(3);
        }
        this.f12133L = null;
        this.f12134M = null;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                break;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b q1(InterfaceC1280e interfaceC1280e, M7.h hVar, boolean z10, h0 h0Var) {
        if (interfaceC1280e == null) {
            G(4);
        }
        if (hVar == null) {
            G(5);
        }
        if (h0Var == null) {
            G(6);
        }
        return new b(interfaceC1280e, null, hVar, z10, InterfaceC1277b.a.DECLARATION, h0Var);
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1276a
    public boolean F() {
        return this.f12134M.booleanValue();
    }

    @Override // O7.AbstractC1339s
    public boolean N0() {
        return this.f12133L.booleanValue();
    }

    @Override // O7.AbstractC1339s
    public void V0(boolean z10) {
        this.f12133L = Boolean.valueOf(z10);
    }

    @Override // O7.AbstractC1339s
    public void W0(boolean z10) {
        this.f12134M = Boolean.valueOf(z10);
    }

    protected b p1(InterfaceC1280e interfaceC1280e, b bVar, InterfaceC1277b.a aVar, h0 h0Var, M7.h hVar) {
        if (interfaceC1280e == null) {
            G(12);
        }
        if (aVar == null) {
            G(13);
        }
        if (h0Var == null) {
            G(14);
        }
        if (hVar == null) {
            G(15);
        }
        return new b(interfaceC1280e, bVar, hVar, this.f8465K, aVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.C1330i
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public b l1(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a aVar, k8.f fVar, M7.h hVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(7);
        }
        if (aVar == null) {
            G(8);
        }
        if (hVar == null) {
            G(9);
        }
        if (h0Var == null) {
            G(10);
        }
        if (aVar == InterfaceC1277b.a.DECLARATION || aVar == InterfaceC1277b.a.SYNTHESIZED) {
            b bVarP1 = p1((InterfaceC1280e) interfaceC1288m, (b) interfaceC1300z, aVar, h0Var, hVar);
            bVarP1.V0(N0());
            bVarP1.W0(F());
            return bVarP1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1288m + "\nkind: " + aVar);
    }

    @Override // W7.a
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public b v(S s10, List list, S s11, Pair pair) {
        if (list == null) {
            G(16);
        }
        if (s11 == null) {
            G(17);
        }
        b bVarL1 = l1(b(), null, getKind(), null, getAnnotations(), g());
        bVarL1.O0(s10 == null ? null : AbstractC3026h.i(bVarL1, s10, M7.h.f7570a.b()), a0(), AbstractC2800q.j(), getTypeParameters(), h.a(list, i(), bVarL1), s11, k(), getVisibility());
        if (pair != null) {
            bVarL1.R0((InterfaceC1276a.InterfaceC0068a) pair.c(), pair.d());
        }
        return bVarL1;
    }
}
