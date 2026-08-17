package W7;

import C8.S;
import J8.s;
import L7.AbstractC1295u;
import L7.E;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.g0;
import L7.h0;
import O7.O;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o8.AbstractC3026h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends O implements W7.a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final InterfaceC1276a.InterfaceC0068a f12138M = new a();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final InterfaceC1276a.InterfaceC0068a f12139N = new b();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private c f12140K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final boolean f12141L;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements InterfaceC1276a.InterfaceC0068a {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements InterfaceC1276a.InterfaceC0068a {
        b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f12147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f12148h;

        c(boolean z10, boolean z11) {
            this.f12147g = z10;
            this.f12148h = z11;
        }

        private static /* synthetic */ void h(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c j(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                h(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(InterfaceC1288m interfaceC1288m, g0 g0Var, M7.h hVar, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var, boolean z10) {
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
        this.f12140K = null;
        this.f12141L = z10;
    }

    private static /* synthetic */ void G(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "newOwner";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e m1(InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, h0 h0Var, boolean z10) {
        if (interfaceC1288m == null) {
            G(5);
        }
        if (hVar == null) {
            G(6);
        }
        if (fVar == null) {
            G(7);
        }
        if (h0Var == null) {
            G(8);
        }
        return new e(interfaceC1288m, null, hVar, fVar, InterfaceC1277b.a.DECLARATION, h0Var, z10);
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1276a
    public boolean F() {
        return this.f12140K.f12148h;
    }

    @Override // O7.AbstractC1339s
    public boolean N0() {
        return this.f12140K.f12147g;
    }

    @Override // O7.O
    public O l1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, AbstractC1295u abstractC1295u, Map map) {
        if (list == null) {
            G(9);
        }
        if (list2 == null) {
            G(10);
        }
        if (list3 == null) {
            G(11);
        }
        if (abstractC1295u == null) {
            G(12);
        }
        O oL1 = super.l1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC1295u, map);
        c1(s.f6878a.a(oL1).a());
        if (oL1 == null) {
            G(13);
        }
        return oL1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.O, O7.AbstractC1339s
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public e l1(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a aVar, k8.f fVar, M7.h hVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(14);
        }
        if (aVar == null) {
            G(15);
        }
        if (hVar == null) {
            G(16);
        }
        if (h0Var == null) {
            G(17);
        }
        g0 g0Var = (g0) interfaceC1300z;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC1288m, g0Var, hVar, fVar, aVar, h0Var, this.f12141L);
        eVar.p1(N0(), F());
        return eVar;
    }

    @Override // W7.a
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public e v(S s10, List list, S s11, Pair pair) {
        if (list == null) {
            G(19);
        }
        if (s11 == null) {
            G(20);
        }
        e eVar = (e) s().d(h.a(list, i(), this)).f(s11).g(s10 == null ? null : AbstractC3026h.i(this, s10, M7.h.f7570a.b())).a().h().build();
        if (pair != null) {
            eVar.R0((InterfaceC1276a.InterfaceC0068a) pair.c(), pair.d());
        }
        if (eVar == null) {
            G(21);
        }
        return eVar;
    }

    public void p1(boolean z10, boolean z11) {
        this.f12140K = c.j(z10, z11);
    }
}
