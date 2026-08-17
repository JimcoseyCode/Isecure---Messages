package O7;

import C8.G0;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.InterfaceC1300z;
import L7.c0;
import L7.h0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: O7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1330i extends AbstractC1339s implements InterfaceC1279d {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected final boolean f8465K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C1330i(InterfaceC1280e interfaceC1280e, InterfaceC1287l interfaceC1287l, M7.h hVar, boolean z10, InterfaceC1277b.a aVar, h0 h0Var) {
        super(interfaceC1280e, interfaceC1287l, hVar, k8.h.f29229j, aVar, h0Var);
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
        this.f8465K = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
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
            case 1:
            case 5:
            case 8:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "originalSubstitutor";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    objArr[1] = "getConstructedClass";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "initialize";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[2] = "substitute";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    private List h1() {
        InterfaceC1280e interfaceC1280eB = b();
        if (interfaceC1280eB.D0().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                G(16);
            }
            return list;
        }
        List listD0 = interfaceC1280eB.D0();
        if (listD0 == null) {
            G(15);
        }
        return listD0;
    }

    public static C1330i k1(InterfaceC1280e interfaceC1280e, M7.h hVar, boolean z10, h0 h0Var) {
        if (interfaceC1280e == null) {
            G(4);
        }
        if (hVar == null) {
            G(5);
        }
        if (h0Var == null) {
            G(6);
        }
        return new C1330i(interfaceC1280e, null, hVar, z10, InterfaceC1277b.a.DECLARATION, h0Var);
    }

    @Override // L7.InterfaceC1287l
    public boolean A() {
        return this.f8465K;
    }

    @Override // L7.InterfaceC1287l
    public InterfaceC1280e B() {
        InterfaceC1280e interfaceC1280eB = b();
        if (interfaceC1280eB == null) {
            G(18);
        }
        return interfaceC1280eB;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.e(this, obj);
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z, L7.InterfaceC1277b, L7.InterfaceC1276a
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            G(21);
        }
        return set;
    }

    public c0 i1() {
        InterfaceC1280e interfaceC1280eB = b();
        if (!interfaceC1280eB.K()) {
            return null;
        }
        InterfaceC1288m interfaceC1288mB = interfaceC1280eB.b();
        if (interfaceC1288mB instanceof InterfaceC1280e) {
            return ((InterfaceC1280e) interfaceC1288mB).G0();
        }
        return null;
    }

    @Override // L7.InterfaceC1277b
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1279d x(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        InterfaceC1279d interfaceC1279d = (InterfaceC1279d) super.H0(interfaceC1288m, e10, abstractC1295u, aVar, z10);
        if (interfaceC1279d == null) {
            G(27);
        }
        return interfaceC1279d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.AbstractC1339s
    public C1330i l1(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a aVar, k8.f fVar, M7.h hVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(23);
        }
        if (aVar == null) {
            G(24);
        }
        if (hVar == null) {
            G(25);
        }
        if (h0Var == null) {
            G(26);
        }
        InterfaceC1277b.a aVar2 = InterfaceC1277b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC1277b.a.SYNTHESIZED) {
            return new C1330i((InterfaceC1280e) interfaceC1288m, this, hVar, this.f8465K, aVar2, h0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1288m + "\nkind: " + aVar);
    }

    @Override // O7.AbstractC1335n, L7.InterfaceC1288m
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1280e b() {
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) super.b();
        if (interfaceC1280e == null) {
            G(17);
        }
        return interfaceC1280e;
    }

    public C1330i n1(List list, AbstractC1295u abstractC1295u) {
        if (list == null) {
            G(13);
        }
        if (abstractC1295u == null) {
            G(14);
        }
        o1(list, abstractC1295u, b().t());
        return this;
    }

    public C1330i o1(List list, AbstractC1295u abstractC1295u, List list2) {
        if (list == null) {
            G(10);
        }
        if (abstractC1295u == null) {
            G(11);
        }
        if (list2 == null) {
            G(12);
        }
        super.O0(null, i1(), h1(), list2, list, null, L7.E.f7283h, abstractC1295u);
        return this;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1277b
    public void u0(Collection collection) {
        if (collection == null) {
            G(22);
        }
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z, L7.j0
    public InterfaceC1279d c(G0 g02) {
        if (g02 == null) {
            G(20);
        }
        return (InterfaceC1279d) super.c(g02);
    }

    @Override // O7.AbstractC1335n
    public InterfaceC1279d a() {
        InterfaceC1279d interfaceC1279d = (InterfaceC1279d) super.a();
        if (interfaceC1279d == null) {
            G(19);
        }
        return interfaceC1279d;
    }
}
