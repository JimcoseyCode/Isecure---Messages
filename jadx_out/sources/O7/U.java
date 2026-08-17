package O7;

import C8.N0;
import L7.InterfaceC1288m;
import L7.h0;
import L7.k0;
import L7.m0;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3027i;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class U extends AbstractC1329h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Function1 f8417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f8418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8419s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private U(InterfaceC1288m interfaceC1288m, M7.h hVar, boolean z10, N0 n02, k8.f fVar, int i10, h0 h0Var, Function1 function1, k0 k0Var, B8.n nVar) {
        super(nVar, interfaceC1288m, hVar, fVar, n02, z10, i10, h0Var, k0Var);
        if (interfaceC1288m == null) {
            G(19);
        }
        if (hVar == null) {
            G(20);
        }
        if (n02 == null) {
            G(21);
        }
        if (fVar == null) {
            G(22);
        }
        if (h0Var == null) {
            G(23);
        }
        if (k0Var == null) {
            G(24);
        }
        if (nVar == null) {
            G(25);
        }
        this.f8418r = new ArrayList(1);
        this.f8419s = false;
        this.f8417q = function1;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[0] = "bound";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[2] = "<init>";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private void K0() {
        if (this.f8419s) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + R0());
    }

    private void L0() {
        if (this.f8419s) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + R0());
        }
    }

    public static U M0(InterfaceC1288m interfaceC1288m, M7.h hVar, boolean z10, N0 n02, k8.f fVar, int i10, h0 h0Var, B8.n nVar) {
        if (interfaceC1288m == null) {
            G(6);
        }
        if (hVar == null) {
            G(7);
        }
        if (n02 == null) {
            G(8);
        }
        if (fVar == null) {
            G(9);
        }
        if (h0Var == null) {
            G(10);
        }
        if (nVar == null) {
            G(11);
        }
        return N0(interfaceC1288m, hVar, z10, n02, fVar, i10, h0Var, null, k0.a.f7338a, nVar);
    }

    public static U N0(InterfaceC1288m interfaceC1288m, M7.h hVar, boolean z10, N0 n02, k8.f fVar, int i10, h0 h0Var, Function1 function1, k0 k0Var, B8.n nVar) {
        if (interfaceC1288m == null) {
            G(12);
        }
        if (hVar == null) {
            G(13);
        }
        if (n02 == null) {
            G(14);
        }
        if (fVar == null) {
            G(15);
        }
        if (h0Var == null) {
            G(16);
        }
        if (k0Var == null) {
            G(17);
        }
        if (nVar == null) {
            G(18);
        }
        return new U(interfaceC1288m, hVar, z10, n02, fVar, i10, h0Var, function1, k0Var, nVar);
    }

    public static m0 O0(InterfaceC1288m interfaceC1288m, M7.h hVar, boolean z10, N0 n02, k8.f fVar, int i10, B8.n nVar) {
        if (interfaceC1288m == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (n02 == null) {
            G(2);
        }
        if (fVar == null) {
            G(3);
        }
        if (nVar == null) {
            G(4);
        }
        U uM0 = M0(interfaceC1288m, hVar, z10, n02, fVar, i10, h0.f7335a, nVar);
        uM0.J0(AbstractC3340e.m(interfaceC1288m).y());
        uM0.S0();
        return uM0;
    }

    private void P0(C8.S s10) {
        if (C8.W.a(s10)) {
            return;
        }
        this.f8418r.add(s10);
    }

    private String R0() {
        return getName() + " declared in " + AbstractC3027i.m(b());
    }

    @Override // O7.AbstractC1329h
    protected void H0(C8.S s10) {
        if (s10 == null) {
            G(27);
        }
        Function1 function1 = this.f8417q;
        if (function1 == null) {
            return;
        }
        function1.invoke(s10);
    }

    @Override // O7.AbstractC1329h
    protected List I0() {
        K0();
        List list = this.f8418r;
        if (list == null) {
            G(28);
        }
        return list;
    }

    public void J0(C8.S s10) {
        if (s10 == null) {
            G(26);
        }
        L0();
        P0(s10);
    }

    public boolean Q0() {
        return this.f8419s;
    }

    public void S0() {
        L0();
        this.f8419s = true;
    }
}
