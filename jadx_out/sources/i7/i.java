package I7;

import C8.AbstractC0407d0;
import C8.B0;
import C8.D0;
import C8.J0;
import C8.N0;
import C8.S;
import C8.V;
import C8.s0;
import C8.v0;
import I7.o;
import L7.AbstractC1293s;
import L7.AbstractC1299y;
import L7.H;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.N;
import L7.Z;
import L7.a0;
import L7.b0;
import N7.a;
import N7.c;
import O7.F;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import expo.modules.notifications.service.NotificationsService;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3027i;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k8.f f5061g = k8.f.t("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B8.i f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.i f5064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f5065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.g f5066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.n f5067f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3487a {
        a() {
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(i.this.r().e0(o.f5108A), i.this.r().e0(o.f5110C), i.this.r().e0(o.f5111D), i.this.r().e0(o.f5109B));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements InterfaceC3487a {
        b() {
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(l.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (l lVar : l.values()) {
                AbstractC0407d0 abstractC0407d0Q = i.this.q(lVar.s().j());
                AbstractC0407d0 abstractC0407d0Q2 = i.this.q(lVar.q().j());
                enumMap.put(lVar, abstractC0407d0Q2);
                map.put(abstractC0407d0Q, abstractC0407d0Q2);
                map2.put(abstractC0407d0Q2, abstractC0407d0Q);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Function1 {
        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1280e invoke(k8.f fVar) {
            InterfaceC1283h interfaceC1283hF = i.this.s().f(fVar, T7.d.f10629j);
            if (interfaceC1283hF == null) {
                throw new AssertionError("Built-in class " + o.f5108A.c(fVar) + " is not found");
            }
            if (interfaceC1283hF instanceof InterfaceC1280e) {
                return (InterfaceC1280e) interfaceC1283hF;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC1283hF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ F f5071g;

        d(F f10) {
            this.f5071g = f10;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (i.this.f5062a == null) {
                i.this.f5062a = this.f5071g;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + i.this.f5062a + " (attempting to reset to " + this.f5071g + ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f5073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f5074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f5075c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f5073a = map;
            this.f5074b = map2;
            this.f5075c = map3;
        }
    }

    protected i(B8.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f5067f = nVar;
        this.f5065d = nVar.e(new a());
        this.f5064c = nVar.e(new b());
        this.f5066e = nVar.h(new c());
    }

    private static S A(S s10, H h10) {
        k8.b bVarN;
        k8.b bVarA;
        InterfaceC1280e interfaceC1280eB;
        if (s10 == null) {
            a(72);
        }
        if (h10 == null) {
            a(73);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP == null) {
            return null;
        }
        s sVar = s.f5253a;
        if (!sVar.b(interfaceC1283hP.getName()) || (bVarN = AbstractC3340e.n(interfaceC1283hP)) == null || (bVarA = sVar.a(bVarN)) == null || (interfaceC1280eB = AbstractC1299y.b(h10, bVarA)) == null) {
            return null;
        }
        return interfaceC1280eB.r();
    }

    public static boolean A0(S s10) {
        if (s10 == null) {
            a(130);
        }
        return i0(s10, o.a.f5159I0.j());
    }

    public static boolean B0(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(10);
        }
        while (interfaceC1288m != null) {
            if (interfaceC1288m instanceof N) {
                return ((N) interfaceC1288m).d().i(o.f5141z);
            }
            interfaceC1288m = interfaceC1288m.b();
        }
        return false;
    }

    public static boolean C0(S s10) {
        if (s10 == null) {
            a(143);
        }
        return m0(s10, o.a.f5193f);
    }

    public static boolean D0(S s10) {
        if (s10 == null) {
            a(133);
        }
        return x0(s10) || A0(s10) || y0(s10) || z0(s10);
    }

    public static l N(S s10) {
        if (s10 == null) {
            a(93);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP == null) {
            return null;
        }
        return P(interfaceC1283hP);
    }

    public static l P(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(78);
        }
        if (o.a.f5167M0.contains(interfaceC1288m.getName())) {
            return (l) o.a.f5171O0.get(AbstractC3027i.m(interfaceC1288m));
        }
        return null;
    }

    private InterfaceC1280e Q(l lVar) {
        if (lVar == null) {
            a(16);
        }
        return p(lVar.s().j());
    }

    public static l S(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(77);
        }
        if (o.a.f5165L0.contains(interfaceC1288m.getName())) {
            return (l) o.a.f5169N0.get(AbstractC3027i.m(interfaceC1288m));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getBuiltInClassByName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getSuspendFunction";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getKFunction";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[1] = "getKSuspendFunction";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[1] = "getKClass";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[1] = "getKType";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[1] = "getKCallable";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[1] = "getKProperty";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[1] = "getKProperty0";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[1] = "getKProperty1";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[1] = "getKProperty2";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case BuildConfig.VERSION_CODE /* 45 */:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case BuildConfig.VERSION_CODE /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(109);
        }
        return e(interfaceC1280e, o.a.f5185b);
    }

    public static boolean b0(S s10) {
        if (s10 == null) {
            a(140);
        }
        return h0(s10, o.a.f5185b);
    }

    public static boolean c0(S s10) {
        if (s10 == null) {
            a(89);
        }
        return h0(s10, o.a.f5199i);
    }

    public static boolean d0(S s10) {
        if (s10 == null) {
            a(91);
        }
        return c0(s10) || q0(s10);
    }

    private static boolean e(InterfaceC1283h interfaceC1283h, k8.d dVar) {
        if (interfaceC1283h == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        return interfaceC1283h.getName().equals(dVar.i()) && dVar.equals(AbstractC3027i.m(interfaceC1283h));
    }

    public static boolean e0(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(90);
        }
        return e(interfaceC1280e, o.a.f5199i) || P(interfaceC1280e) != null;
    }

    public static boolean f0(S s10) {
        if (s10 == null) {
            a(111);
        }
        return i0(s10, o.a.f5201j);
    }

    public static boolean g0(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(9);
        }
        return AbstractC3027i.r(interfaceC1288m, I7.c.class, false) != null;
    }

    private static boolean h0(S s10, k8.d dVar) {
        if (s10 == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(s10.K0(), dVar);
    }

    private static boolean i0(S s10, k8.d dVar) {
        if (s10 == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        return h0(s10, dVar) && !s10.L0();
    }

    public static boolean j0(S s10) {
        if (s10 == null) {
            a(142);
        }
        return p0(s10);
    }

    public static boolean k0(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(162);
        }
        if (interfaceC1288m.a().getAnnotations().h(o.a.f5231y)) {
            return true;
        }
        if (interfaceC1288m instanceof Z) {
            Z z10 = (Z) interfaceC1288m;
            boolean zD0 = z10.d0();
            a0 getter = z10.getGetter();
            b0 b0VarH = z10.h();
            if (getter != null && k0(getter) && (!zD0 || (b0VarH != null && k0(b0VarH)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(159);
        }
        return e(interfaceC1280e, o.a.f5206l0);
    }

    private static boolean m0(S s10, k8.d dVar) {
        if (s10 == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !s10.L0() && h0(s10, dVar);
    }

    public static boolean n0(S s10) {
        if (s10 == null) {
            a(137);
        }
        return o0(s10) && !J0.l(s10);
    }

    public static boolean o0(S s10) {
        if (s10 == null) {
            a(139);
        }
        return h0(s10, o.a.f5187c);
    }

    private InterfaceC1280e p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) this.f5066e.invoke(k8.f.q(str));
        if (interfaceC1280e == null) {
            a(15);
        }
        return interfaceC1280e;
    }

    public static boolean p0(S s10) {
        if (s10 == null) {
            a(141);
        }
        return b0(s10) && s10.L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0407d0 q(String str) {
        if (str == null) {
            a(47);
        }
        AbstractC0407d0 abstractC0407d0R = p(str).r();
        if (abstractC0407d0R == null) {
            a(48);
        }
        return abstractC0407d0R;
    }

    public static boolean q0(S s10) {
        if (s10 == null) {
            a(92);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return (interfaceC1283hP == null || P(interfaceC1283hP) == null) ? false : true;
    }

    public static boolean r0(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(97);
        }
        return S(interfaceC1280e) != null;
    }

    public static boolean s0(S s10) {
        if (s10 == null) {
            a(95);
        }
        return !s10.L0() && t0(s10);
    }

    public static boolean t0(S s10) {
        if (s10 == null) {
            a(96);
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return (interfaceC1283hP instanceof InterfaceC1280e) && r0((InterfaceC1280e) interfaceC1283hP);
    }

    public static boolean u0(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(108);
        }
        return e(interfaceC1280e, o.a.f5185b) || e(interfaceC1280e, o.a.f5187c);
    }

    public static boolean v0(S s10) {
        return s10 != null && m0(s10, o.a.f5197h);
    }

    public static boolean w0(v0 v0Var, k8.d dVar) {
        if (v0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        InterfaceC1283h interfaceC1283hP = v0Var.p();
        return (interfaceC1283hP instanceof InterfaceC1280e) && e(interfaceC1283hP, dVar);
    }

    public static boolean x0(S s10) {
        if (s10 == null) {
            a(129);
        }
        return i0(s10, o.a.f5157H0.j());
    }

    public static boolean y0(S s10) {
        if (s10 == null) {
            a(131);
        }
        return i0(s10, o.a.f5161J0.j());
    }

    public static boolean z0(S s10) {
        if (s10 == null) {
            a(132);
        }
        return i0(s10, o.a.f5163K0.j());
    }

    public AbstractC0407d0 B() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5085r);
        if (abstractC0407d0R == null) {
            a(61);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e C(int i10) {
        return p(o.b(i10));
    }

    public AbstractC0407d0 D() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5084q);
        if (abstractC0407d0R == null) {
            a(59);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e E() {
        InterfaceC1280e interfaceC1280eO = o(o.a.f5206l0.l());
        if (interfaceC1280eO == null) {
            a(21);
        }
        return interfaceC1280eO;
    }

    public void E0(F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f5067f.f(new d(f10));
    }

    public AbstractC0407d0 F() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5086s);
        if (abstractC0407d0R == null) {
            a(60);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e G() {
        return p("Nothing");
    }

    public AbstractC0407d0 H() {
        AbstractC0407d0 abstractC0407d0R = G().r();
        if (abstractC0407d0R == null) {
            a(49);
        }
        return abstractC0407d0R;
    }

    public AbstractC0407d0 I() {
        AbstractC0407d0 abstractC0407d0R0 = i().O0(true);
        if (abstractC0407d0R0 == null) {
            a(52);
        }
        return abstractC0407d0R0;
    }

    public AbstractC0407d0 J() {
        AbstractC0407d0 abstractC0407d0R0 = H().O0(true);
        if (abstractC0407d0R0 == null) {
            a(50);
        }
        return abstractC0407d0R0;
    }

    public InterfaceC1280e K() {
        return p("Number");
    }

    public AbstractC0407d0 L() {
        AbstractC0407d0 abstractC0407d0R = K().r();
        if (abstractC0407d0R == null) {
            a(56);
        }
        return abstractC0407d0R;
    }

    protected N7.c M() {
        c.b bVar = c.b.f8154a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public AbstractC0407d0 O(l lVar) {
        if (lVar == null) {
            a(74);
        }
        AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) ((e) this.f5064c.invoke()).f5073a.get(lVar);
        if (abstractC0407d0 == null) {
            a(75);
        }
        return abstractC0407d0;
    }

    public AbstractC0407d0 R(l lVar) {
        if (lVar == null) {
            a(54);
        }
        AbstractC0407d0 abstractC0407d0R = Q(lVar).r();
        if (abstractC0407d0R == null) {
            a(55);
        }
        return abstractC0407d0R;
    }

    public AbstractC0407d0 T() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5083p);
        if (abstractC0407d0R == null) {
            a(58);
        }
        return abstractC0407d0R;
    }

    protected B8.n U() {
        B8.n nVar = this.f5067f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC1280e V() {
        return p("String");
    }

    public AbstractC0407d0 W() {
        AbstractC0407d0 abstractC0407d0R = V().r();
        if (abstractC0407d0R == null) {
            a(66);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e X(int i10) {
        InterfaceC1280e interfaceC1280eO = o(o.f5134s.c(k8.f.q(o.d(i10))));
        if (interfaceC1280eO == null) {
            a(18);
        }
        return interfaceC1280eO;
    }

    public InterfaceC1280e Y() {
        return p("Unit");
    }

    public AbstractC0407d0 Z() {
        AbstractC0407d0 abstractC0407d0R = Y().r();
        if (abstractC0407d0R == null) {
            a(65);
        }
        return abstractC0407d0R;
    }

    protected void f(boolean z10) {
        F f10 = new F(f5061g, this.f5067f, this, null);
        this.f5062a = f10;
        f10.L0(I7.b.f5053a.c().a(this.f5067f, this.f5062a, v(), M(), g(), z10));
        F f11 = this.f5062a;
        f11.T0(f11);
    }

    protected N7.a g() {
        a.C0085a c0085a = a.C0085a.f8152a;
        if (c0085a == null) {
            a(3);
        }
        return c0085a;
    }

    public InterfaceC1280e h() {
        return p("Any");
    }

    public AbstractC0407d0 i() {
        AbstractC0407d0 abstractC0407d0R = h().r();
        if (abstractC0407d0R == null) {
            a(51);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e j() {
        return p("Array");
    }

    public S k(S s10) {
        S sA;
        if (s10 == null) {
            a(68);
        }
        if (c0(s10)) {
            if (s10.I0().size() != 1) {
                throw new IllegalStateException();
            }
            S type = ((B0) s10.I0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        S sN = J0.n(s10);
        S s11 = (S) ((e) this.f5064c.invoke()).f5075c.get(sN);
        if (s11 != null) {
            return s11;
        }
        H h10 = AbstractC3027i.h(sN);
        if (h10 != null && (sA = A(sN, h10)) != null) {
            return sA;
        }
        throw new IllegalStateException("not array: " + s10);
    }

    public AbstractC0407d0 l(N0 n02, S s10) {
        if (n02 == null) {
            a(83);
        }
        if (s10 == null) {
            a(84);
        }
        AbstractC0407d0 abstractC0407d0M = m(n02, s10, M7.h.f7570a.b());
        if (abstractC0407d0M == null) {
            a(85);
        }
        return abstractC0407d0M;
    }

    public AbstractC0407d0 m(N0 n02, S s10, M7.h hVar) {
        if (n02 == null) {
            a(79);
        }
        if (s10 == null) {
            a(80);
        }
        if (hVar == null) {
            a(81);
        }
        AbstractC0407d0 abstractC0407d0H = V.h(s0.b(hVar), j(), Collections.singletonList(new D0(n02, s10)));
        if (abstractC0407d0H == null) {
            a(82);
        }
        return abstractC0407d0H;
    }

    public AbstractC0407d0 n() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5080m);
        if (abstractC0407d0R == null) {
            a(64);
        }
        return abstractC0407d0R;
    }

    public InterfaceC1280e o(k8.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC1280e interfaceC1280eD = AbstractC1293s.d(r(), cVar, T7.d.f10629j);
        if (interfaceC1280eD == null) {
            a(13);
        }
        return interfaceC1280eD;
    }

    public F r() {
        if (this.f5062a == null) {
            this.f5062a = (F) this.f5063b.invoke();
        }
        F f10 = this.f5062a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public InterfaceC3442k s() {
        InterfaceC3442k interfaceC3442kO = r().e0(o.f5108A).o();
        if (interfaceC3442kO == null) {
            a(11);
        }
        return interfaceC3442kO;
    }

    public AbstractC0407d0 t() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5082o);
        if (abstractC0407d0R == null) {
            a(57);
        }
        return abstractC0407d0R;
    }

    public AbstractC0407d0 u() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5081n);
        if (abstractC0407d0R == null) {
            a(63);
        }
        return abstractC0407d0R;
    }

    protected Iterable v() {
        List listSingletonList = Collections.singletonList(new J7.a(this.f5067f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC1280e w() {
        InterfaceC1280e interfaceC1280eO = o(o.a.f5180X);
        if (interfaceC1280eO == null) {
            a(35);
        }
        return interfaceC1280eO;
    }

    public InterfaceC1280e x() {
        return p("Comparable");
    }

    public AbstractC0407d0 y() {
        AbstractC0407d0 abstractC0407d0I = I();
        if (abstractC0407d0I == null) {
            a(53);
        }
        return abstractC0407d0I;
    }

    public AbstractC0407d0 z() {
        AbstractC0407d0 abstractC0407d0R = R(l.f5087t);
        if (abstractC0407d0R == null) {
            a(62);
        }
        return abstractC0407d0R;
    }
}
