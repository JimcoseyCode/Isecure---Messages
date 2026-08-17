package O7;

import C8.C0434u;
import C8.v0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.h0;
import L7.r0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: O7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1332k extends AbstractC1331j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final L7.E f8469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final EnumC1281f f8470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v0 f8471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC3442k f8472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Set f8473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC1279d f8474t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332k(InterfaceC1288m interfaceC1288m, k8.f fVar, L7.E e10, EnumC1281f enumC1281f, Collection collection, h0 h0Var, boolean z10, B8.n nVar) {
        super(nVar, interfaceC1288m, fVar, h0Var, z10);
        if (interfaceC1288m == null) {
            x0(0);
        }
        if (fVar == null) {
            x0(1);
        }
        if (e10 == null) {
            x0(2);
        }
        if (enumC1281f == null) {
            x0(3);
        }
        if (collection == null) {
            x0(4);
        }
        if (h0Var == null) {
            x0(5);
        }
        if (nVar == null) {
            x0(6);
        }
        this.f8469o = e10;
        this.f8470p = enumC1281f;
        this.f8471q = new C0434u(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void x0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getStaticScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean C() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean F0() {
        return false;
    }

    public final void H0(InterfaceC3442k interfaceC3442k, Set set, InterfaceC1279d interfaceC1279d) {
        if (interfaceC3442k == null) {
            x0(7);
        }
        if (set == null) {
            x0(8);
        }
        this.f8472r = interfaceC3442k;
        this.f8473s = set;
        this.f8474t = interfaceC1279d;
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(19);
        }
        return list;
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return false;
    }

    @Override // O7.z
    public InterfaceC3442k L(D8.g gVar) {
        if (gVar == null) {
            x0(12);
        }
        InterfaceC3442k interfaceC3442k = this.f8472r;
        if (interfaceC3442k == null) {
            x0(13);
        }
        return interfaceC3442k;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return this.f8474t;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k P() {
        InterfaceC3442k.b bVar = InterfaceC3442k.b.f32996b;
        if (bVar == null) {
            x0(14);
        }
        return bVar;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public Collection f() {
        Set set = this.f8473s;
        if (set == null) {
            x0(11);
        }
        return set;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        M7.h hVarB = M7.h.f7570a.b();
        if (hVarB == null) {
            x0(9);
        }
        return hVarB;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        EnumC1281f enumC1281f = this.f8470p;
        if (enumC1281f == null) {
            x0(15);
        }
        return enumC1281f;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = AbstractC1294t.f7347e;
        if (abstractC1295u == null) {
            x0(17);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        v0 v0Var = this.f8471q;
        if (v0Var == null) {
            x0(10);
        }
        return v0Var;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        L7.E e10 = this.f8469o;
        if (e10 == null) {
            x0(16);
        }
        return e10;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return false;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(18);
        }
        return list;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // L7.InterfaceC1280e
    public r0 w0() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return false;
    }
}
