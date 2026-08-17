package o8;

import C8.J0;
import C8.S;
import C8.W;
import C8.v0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.E;
import L7.EnumC1281f;
import L7.H;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1291p;
import L7.InterfaceC1292q;
import L7.N;
import L7.V;
import L7.b0;
import L7.c0;
import L7.i0;
import L7.u0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: o8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3027i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k8.c f30520a = new k8.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC1288m interfaceC1288m) {
        return D(interfaceC1288m, EnumC1281f.f7322j);
    }

    public static boolean B(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(36);
        }
        return D(interfaceC1288m, EnumC1281f.f7323k);
    }

    public static boolean C(InterfaceC1288m interfaceC1288m) {
        return D(interfaceC1288m, EnumC1281f.f7321i);
    }

    private static boolean D(InterfaceC1288m interfaceC1288m, EnumC1281f enumC1281f) {
        if (enumC1281f == null) {
            a(37);
        }
        return (interfaceC1288m instanceof InterfaceC1280e) && ((InterfaceC1280e) interfaceC1288m).getKind() == enumC1281f;
    }

    public static boolean E(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(1);
        }
        while (interfaceC1288m != null) {
            if (u(interfaceC1288m) || y(interfaceC1288m)) {
                return true;
            }
            interfaceC1288m = interfaceC1288m.b();
        }
        return false;
    }

    private static boolean F(S s10, InterfaceC1288m interfaceC1288m) {
        if (s10 == null) {
            a(30);
        }
        if (interfaceC1288m == null) {
            a(31);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP == null) {
            return false;
        }
        InterfaceC1288m interfaceC1288mA = interfaceC1283hP.a();
        return (interfaceC1288mA instanceof InterfaceC1283h) && (interfaceC1288m instanceof InterfaceC1283h) && ((InterfaceC1283h) interfaceC1288m).j().equals(((InterfaceC1283h) interfaceC1288mA).j());
    }

    public static boolean G(InterfaceC1288m interfaceC1288m) {
        return (D(interfaceC1288m, EnumC1281f.f7320h) || D(interfaceC1288m, EnumC1281f.f7321i)) && ((InterfaceC1280e) interfaceC1288m).k() == E.f7284i;
    }

    public static boolean H(InterfaceC1280e interfaceC1280e, InterfaceC1280e interfaceC1280e2) {
        if (interfaceC1280e == null) {
            a(28);
        }
        if (interfaceC1280e2 == null) {
            a(29);
        }
        return I(interfaceC1280e.r(), interfaceC1280e2.a());
    }

    public static boolean I(S s10, InterfaceC1288m interfaceC1288m) {
        if (s10 == null) {
            a(32);
        }
        if (interfaceC1288m == null) {
            a(33);
        }
        if (F(s10, interfaceC1288m)) {
            return true;
        }
        Iterator it = s10.K0().g().iterator();
        while (it.hasNext()) {
            if (I((S) it.next(), interfaceC1288m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC1288m interfaceC1288m) {
        return interfaceC1288m != null && (interfaceC1288m.b() instanceof N);
    }

    public static boolean K(u0 u0Var, S s10) {
        if (u0Var == null) {
            a(66);
        }
        if (s10 == null) {
            a(67);
        }
        if (u0Var.d0() || W.a(s10)) {
            return false;
        }
        if (J0.b(s10)) {
            return true;
        }
        I7.i iVarM = AbstractC3340e.m(u0Var);
        if (!I7.i.s0(s10)) {
            D8.e eVar = D8.e.f819a;
            if (!eVar.c(iVarM.W(), s10) && !eVar.c(iVarM.K().r(), s10) && !eVar.c(iVarM.i(), s10) && !I7.s.d(s10)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC1277b L(InterfaceC1277b interfaceC1277b) {
        if (interfaceC1277b == null) {
            a(59);
        }
        while (interfaceC1277b.getKind() == InterfaceC1277b.a.FAKE_OVERRIDE) {
            Collection collectionE = interfaceC1277b.e();
            if (collectionE.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC1277b);
            }
            interfaceC1277b = (InterfaceC1277b) collectionE.iterator().next();
        }
        return interfaceC1277b;
    }

    public static InterfaceC1292q M(InterfaceC1292q interfaceC1292q) {
        if (interfaceC1292q == null) {
            a(64);
        }
        if (interfaceC1292q instanceof InterfaceC1277b) {
            return L((InterfaceC1277b) interfaceC1292q);
        }
        if (interfaceC1292q == null) {
            a(65);
        }
        return interfaceC1292q;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "aClass";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "kotlinType";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[0] = "subClass";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 67:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = PermissionsResponse.SCOPE_KEY;
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[2] = "isExtension";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "isOverride";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case BuildConfig.VERSION_CODE /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        if (interfaceC1288m == null) {
            a(16);
        }
        if (interfaceC1288m2 == null) {
            a(17);
        }
        return g(interfaceC1288m).equals(g(interfaceC1288m2));
    }

    private static void c(InterfaceC1276a interfaceC1276a, Set set) {
        if (interfaceC1276a == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (set.contains(interfaceC1276a)) {
            return;
        }
        Iterator it = interfaceC1276a.a().e().iterator();
        while (it.hasNext()) {
            InterfaceC1276a interfaceC1276aA = ((InterfaceC1276a) it.next()).a();
            c(interfaceC1276aA, set);
            set.add(interfaceC1276aA);
        }
    }

    public static Set d(InterfaceC1276a interfaceC1276a) {
        if (interfaceC1276a == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC1276a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC1280e e(S s10) {
        if (s10 == null) {
            a(45);
        }
        return f(s10.K0());
    }

    public static InterfaceC1280e f(v0 v0Var) {
        if (v0Var == null) {
            a(46);
        }
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) v0Var.p();
        if (interfaceC1280e == null) {
            a(47);
        }
        return interfaceC1280e;
    }

    public static H g(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(21);
        }
        H hI = i(interfaceC1288m);
        if (hI == null) {
            a(22);
        }
        return hI;
    }

    public static H h(S s10) {
        if (s10 == null) {
            a(20);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP == null) {
            return null;
        }
        return i(interfaceC1283hP);
    }

    public static H i(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(23);
        }
        while (interfaceC1288m != null) {
            if (interfaceC1288m instanceof H) {
                return (H) interfaceC1288m;
            }
            if (interfaceC1288m instanceof V) {
                return ((V) interfaceC1288m).r0();
            }
            interfaceC1288m = interfaceC1288m.b();
        }
        return null;
    }

    public static i0 j(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(82);
        }
        if (interfaceC1288m instanceof b0) {
            interfaceC1288m = ((b0) interfaceC1288m).y0();
        }
        if (interfaceC1288m instanceof InterfaceC1291p) {
            i0 i0VarA = ((InterfaceC1291p) interfaceC1288m).g().a();
            if (i0VarA == null) {
                a(83);
            }
            return i0VarA;
        }
        i0 i0Var = i0.f7336a;
        if (i0Var == null) {
            a(84);
        }
        return i0Var;
    }

    public static AbstractC1295u k(InterfaceC1280e interfaceC1280e, boolean z10) {
        if (interfaceC1280e == null) {
            a(48);
        }
        EnumC1281f kind = interfaceC1280e.getKind();
        if (kind == EnumC1281f.f7322j || kind.j()) {
            AbstractC1295u abstractC1295u = AbstractC1294t.f7343a;
            if (abstractC1295u == null) {
                a(49);
            }
            return abstractC1295u;
        }
        if (G(interfaceC1280e)) {
            if (z10) {
                AbstractC1295u abstractC1295u2 = AbstractC1294t.f7345c;
                if (abstractC1295u2 == null) {
                    a(50);
                }
                return abstractC1295u2;
            }
            AbstractC1295u abstractC1295u3 = AbstractC1294t.f7343a;
            if (abstractC1295u3 == null) {
                a(51);
            }
            return abstractC1295u3;
        }
        if (u(interfaceC1280e)) {
            AbstractC1295u abstractC1295u4 = AbstractC1294t.f7354l;
            if (abstractC1295u4 == null) {
                a(52);
            }
            return abstractC1295u4;
        }
        AbstractC1295u abstractC1295u5 = AbstractC1294t.f7347e;
        if (abstractC1295u5 == null) {
            a(53);
        }
        return abstractC1295u5;
    }

    public static c0 l(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(0);
        }
        if (interfaceC1288m instanceof InterfaceC1280e) {
            return ((InterfaceC1280e) interfaceC1288m).G0();
        }
        return null;
    }

    public static k8.d m(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(2);
        }
        k8.c cVarO = o(interfaceC1288m);
        return cVarO != null ? cVarO.j() : p(interfaceC1288m);
    }

    public static k8.c n(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(3);
        }
        k8.c cVarO = o(interfaceC1288m);
        if (cVarO == null) {
            cVarO = p(interfaceC1288m).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static k8.c o(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(5);
        }
        if ((interfaceC1288m instanceof H) || E8.l.m(interfaceC1288m)) {
            return k8.c.f29204c;
        }
        if (interfaceC1288m instanceof V) {
            return ((V) interfaceC1288m).d();
        }
        if (interfaceC1288m instanceof N) {
            return ((N) interfaceC1288m).d();
        }
        return null;
    }

    private static k8.d p(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(6);
        }
        k8.d dVarC = m(interfaceC1288m.b()).c(interfaceC1288m.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    public static InterfaceC1288m q(InterfaceC1288m interfaceC1288m, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC1288m, cls, true);
    }

    public static InterfaceC1288m r(InterfaceC1288m interfaceC1288m, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC1288m == null) {
            return null;
        }
        if (z10) {
            interfaceC1288m = interfaceC1288m.b();
        }
        while (interfaceC1288m != null) {
            if (cls.isInstance(interfaceC1288m)) {
                return interfaceC1288m;
            }
            interfaceC1288m = interfaceC1288m.b();
        }
        return null;
    }

    public static InterfaceC1280e s(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(44);
        }
        Iterator it = interfaceC1280e.j().g().iterator();
        while (it.hasNext()) {
            InterfaceC1280e interfaceC1280eE = e((S) it.next());
            if (interfaceC1280eE.getKind() != EnumC1281f.f7321i) {
                return interfaceC1280eE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC1288m interfaceC1288m) {
        return D(interfaceC1288m, EnumC1281f.f7324l);
    }

    public static boolean u(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(34);
        }
        return v(interfaceC1288m) && interfaceC1288m.getName().equals(k8.h.f29221b);
    }

    public static boolean v(InterfaceC1288m interfaceC1288m) {
        return D(interfaceC1288m, EnumC1281f.f7320h);
    }

    public static boolean w(InterfaceC1288m interfaceC1288m) {
        return v(interfaceC1288m) || A(interfaceC1288m);
    }

    public static boolean x(InterfaceC1288m interfaceC1288m) {
        return D(interfaceC1288m, EnumC1281f.f7325m) && ((InterfaceC1280e) interfaceC1288m).y();
    }

    public static boolean y(InterfaceC1288m interfaceC1288m) {
        return (interfaceC1288m instanceof InterfaceC1292q) && ((InterfaceC1292q) interfaceC1288m).getVisibility() == AbstractC1294t.f7348f;
    }

    public static boolean z(InterfaceC1280e interfaceC1280e, InterfaceC1280e interfaceC1280e2) {
        if (interfaceC1280e == null) {
            a(26);
        }
        if (interfaceC1280e2 == null) {
            a(27);
        }
        Iterator it = interfaceC1280e.j().g().iterator();
        while (it.hasNext()) {
            if (F((S) it.next(), interfaceC1280e2.a())) {
                return true;
            }
        }
        return false;
    }
}
