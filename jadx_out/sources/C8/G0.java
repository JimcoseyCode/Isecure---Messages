package C8;

import I7.o;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p8.AbstractC3090e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G0 f565b = g(E0.f560b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f566a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Function1 {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(k8.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(o.a.f5173Q));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f567a;

        static {
            int[] iArr = new int[d.values().length];
            f567a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f567a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f567a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected G0(E0 e02) {
        if (e02 == null) {
            a(7);
        }
        this.f566a = e02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    break;
                            }
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            break;
                    }
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 10:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[0] = "originalType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "unsafeSubstitute";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    break;
                default:
                    switch (i10) {
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static void b(int i10, B0 b02, E0 e02) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(b02) + "; substitution: " + o(e02));
    }

    public static N0 c(N0 n02, B0 b02) {
        if (n02 == null) {
            a(35);
        }
        if (b02 == null) {
            a(36);
        }
        if (!b02.b()) {
            return d(n02, b02.a());
        }
        N0 n03 = N0.f594m;
        if (n03 == null) {
            a(37);
        }
        return n03;
    }

    public static N0 d(N0 n02, N0 n03) {
        if (n02 == null) {
            a(38);
        }
        if (n03 == null) {
            a(39);
        }
        N0 n04 = N0.f592k;
        if (n02 == n04) {
            if (n03 == null) {
                a(40);
            }
            return n03;
        }
        if (n03 == n04) {
            if (n02 == null) {
                a(41);
            }
            return n02;
        }
        if (n02 == n03) {
            if (n03 == null) {
                a(42);
            }
            return n03;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + n02 + "' and projection kind '" + n03 + "' cannot be combined");
    }

    private static d e(N0 n02, N0 n03) {
        N0 n04 = N0.f593l;
        return (n02 == n04 && n03 == N0.f594m) ? d.OUT_IN_IN_POSITION : (n02 == N0.f594m && n03 == n04) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static G0 f(S s10) {
        if (s10 == null) {
            a(6);
        }
        return g(w0.i(s10.K0(), s10.I0()));
    }

    public static G0 g(E0 e02) {
        if (e02 == null) {
            a(0);
        }
        return new G0(e02);
    }

    public static G0 h(E0 e02, E0 e03) {
        if (e02 == null) {
            a(3);
        }
        if (e03 == null) {
            a(4);
        }
        return g(D.i(e02, e03));
    }

    private static M7.h i(M7.h hVar) {
        if (hVar == null) {
            a(33);
        }
        return !hVar.h(o.a.f5173Q) ? hVar : new M7.p(hVar, new a());
    }

    private static B0 l(S s10, B0 b02, L7.m0 m0Var, B0 b03) {
        if (s10 == null) {
            a(26);
        }
        if (b02 == null) {
            a(27);
        }
        if (b03 == null) {
            a(28);
        }
        if (!s10.getAnnotations().h(o.a.f5173Q)) {
            if (b02 == null) {
                a(29);
            }
            return b02;
        }
        v0 v0VarK0 = b02.getType().K0();
        if (!(v0VarK0 instanceof D8.n)) {
            return b02;
        }
        B0 projection = ((D8.n) v0VarK0).getProjection();
        N0 n0A = projection.a();
        d dVarE = e(b03.a(), n0A);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new D0(projection.getType()) : (m0Var != null && e(m0Var.m(), n0A) == dVar) ? new D0(projection.getType()) : b02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (M8.d.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    private B0 r(B0 b02, int i10) {
        S type = b02.getType();
        N0 n0A = b02.a();
        if (type.K0().p() instanceof L7.m0) {
            return b02;
        }
        AbstractC0407d0 abstractC0407d0B = AbstractC0415h0.b(type);
        S sP = abstractC0407d0B != null ? m().p(abstractC0407d0B, N0.f592k) : null;
        S sB = F0.b(type, s(type.K0().getParameters(), type.I0(), i10), this.f566a.d(type.getAnnotations()));
        if ((sB instanceof AbstractC0407d0) && (sP instanceof AbstractC0407d0)) {
            sB = AbstractC0415h0.j((AbstractC0407d0) sB, (AbstractC0407d0) sP);
        }
        return new D0(n0A, sB);
    }

    private List s(List list, List list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            L7.m0 m0Var = (L7.m0) list.get(i11);
            B0 b02 = (B0) list2.get(i11);
            B0 b0U = u(b02, m0Var, i10 + 1);
            int i12 = b.f567a[e(m0Var.m(), b0U.a()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                b0U = J0.s(m0Var);
            } else if (i12 == 3) {
                N0 n0M = m0Var.m();
                N0 n02 = N0.f592k;
                if (n0M != n02 && !b0U.b()) {
                    b0U = new D0(n02, b0U.getType());
                }
            }
            if (b0U != b02) {
                z10 = true;
            }
            arrayList.add(b0U);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private B0 u(B0 b02, L7.m0 m0Var, int i10) throws c {
        if (b02 == null) {
            a(18);
        }
        b(i10, b02, this.f566a);
        if (!b02.b()) {
            S type = b02.getType();
            if (type instanceof K0) {
                K0 k02 = (K0) type;
                M0 m0C0 = k02.C0();
                S sG = k02.G();
                B0 b0U = u(new D0(b02.a(), m0C0), m0Var, i10 + 1);
                return b0U.b() ? b0U : new D0(b0U.a(), L0.d(b0U.getType().N0(), p(sG, b02.a())));
            }
            if (!E.a(type) && !(type.N0() instanceof InterfaceC0405c0)) {
                B0 b0E = this.f566a.e(type);
                B0 b0L = b0E != null ? l(type, b0E, m0Var, b02) : null;
                N0 n0A = b02.a();
                if (b0L == null && L.b(type) && !t0.b(type)) {
                    I iA = L.a(type);
                    int i11 = i10 + 1;
                    B0 b0U2 = u(new D0(n0A, iA.S0()), m0Var, i11);
                    B0 b0U3 = u(new D0(n0A, iA.T0()), m0Var, i11);
                    N0 n0A2 = b0U2.a();
                    if (b0U2.getType() != iA.S0() || b0U3.getType() != iA.T0()) {
                        return new D0(n0A2, V.e(F0.a(b0U2.getType()), F0.a(b0U3.getType())));
                    }
                } else if (!I7.i.n0(type) && !W.a(type)) {
                    if (b0L != null) {
                        d dVarE = e(n0A, b0L.a());
                        if (!AbstractC3090e.f(type)) {
                            int i12 = b.f567a[dVarE.ordinal()];
                            if (i12 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i12 == 2) {
                                return new D0(N0.f594m, type.K0().n().I());
                            }
                        }
                        InterfaceC0436w interfaceC0436wA = t0.a(type);
                        if (b0L.b()) {
                            return b0L;
                        }
                        S sL = interfaceC0436wA != null ? interfaceC0436wA.L(b0L.getType()) : J0.q(b0L.getType(), type.L0());
                        if (!type.getAnnotations().isEmpty()) {
                            sL = H8.d.C(sL, new M7.o(sL.getAnnotations(), i(this.f566a.d(type.getAnnotations()))));
                        }
                        if (dVarE == d.NO_CONFLICT) {
                            n0A = d(n0A, b0L.a());
                        }
                        return new D0(n0A, sL);
                    }
                    b02 = r(b02, i10);
                    if (b02 == null) {
                        a(25);
                    }
                }
            }
        }
        return b02;
    }

    public E0 j() {
        E0 e02 = this.f566a;
        if (e02 == null) {
            a(8);
        }
        return e02;
    }

    public boolean k() {
        return this.f566a.f();
    }

    public G0 m() {
        E0 e02 = this.f566a;
        return ((e02 instanceof M) && e02.b()) ? new G0(new M(((M) this.f566a).j(), ((M) this.f566a).i(), false)) : this;
    }

    public S n(S s10, N0 n02) {
        if (s10 == null) {
            a(9);
        }
        if (n02 == null) {
            a(10);
        }
        if (k()) {
            if (s10 == null) {
                a(11);
            }
            return s10;
        }
        try {
            S type = u(new D0(n02, s10), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            E8.i iVarD = E8.l.d(E8.k.f1183J, e10.getMessage());
            if (iVarD == null) {
                a(13);
            }
            return iVarD;
        }
    }

    public S p(S s10, N0 n02) {
        if (s10 == null) {
            a(14);
        }
        if (n02 == null) {
            a(15);
        }
        B0 b0Q = q(new D0(n02, j().g(s10, n02)));
        if (b0Q == null) {
            return null;
        }
        return b0Q.getType();
    }

    public B0 q(B0 b02) {
        if (b02 == null) {
            a(16);
        }
        B0 b0T = t(b02);
        return (this.f566a.a() || this.f566a.b()) ? I8.c.d(b0T, this.f566a.b()) : b0T;
    }

    public B0 t(B0 b02) {
        if (b02 == null) {
            a(17);
        }
        if (k()) {
            return b02;
        }
        try {
            return u(b02, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
