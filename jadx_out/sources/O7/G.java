package O7;

import C8.C0434u;
import C8.v0;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.h0;
import L7.r0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class G extends AbstractC1331j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final EnumC1281f f8346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f8347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private L7.E f8348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbstractC1295u f8349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v0 f8350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f8351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection f8352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final B8.n f8353v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC1288m interfaceC1288m, EnumC1281f enumC1281f, boolean z10, boolean z11, k8.f fVar, h0 h0Var, B8.n nVar) {
        super(nVar, interfaceC1288m, fVar, h0Var, z11);
        if (interfaceC1288m == null) {
            x0(0);
        }
        if (enumC1281f == null) {
            x0(1);
        }
        if (fVar == null) {
            x0(2);
        }
        if (h0Var == null) {
            x0(3);
        }
        if (nVar == null) {
            x0(4);
        }
        this.f8352u = new ArrayList();
        this.f8353v = nVar;
        this.f8346o = enumC1281f;
        this.f8347p = z10;
    }

    private static /* synthetic */ void x0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getConstructors";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
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

    public void H0() {
        this.f8350s = new C0434u(this, this.f8351t, this.f8352u, this.f8353v);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((C1330i) ((InterfaceC1300z) it.next())).d1(r());
        }
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(19);
        }
        return list;
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public Set f() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            x0(13);
        }
        return set;
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    public void J0(L7.E e10) {
        if (e10 == null) {
            x0(6);
        }
        this.f8348q = e10;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return this.f8347p;
    }

    public void K0(List list) {
        if (list == null) {
            x0(14);
        }
        if (this.f8351t == null) {
            this.f8351t = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // O7.z
    public InterfaceC3442k L(D8.g gVar) {
        if (gVar == null) {
            x0(16);
        }
        InterfaceC3442k.b bVar = InterfaceC3442k.b.f32996b;
        if (bVar == null) {
            x0(17);
        }
        return bVar;
    }

    public void L0(AbstractC1295u abstractC1295u) {
        if (abstractC1295u == null) {
            x0(9);
        }
        this.f8349r = abstractC1295u;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k P() {
        InterfaceC3442k.b bVar = InterfaceC3442k.b.f32996b;
        if (bVar == null) {
            x0(18);
        }
        return bVar;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return null;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        M7.h hVarB = M7.h.f7570a.b();
        if (hVarB == null) {
            x0(5);
        }
        return hVarB;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        EnumC1281f enumC1281f = this.f8346o;
        if (enumC1281f == null) {
            x0(8);
        }
        return enumC1281f;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = this.f8349r;
        if (abstractC1295u == null) {
            x0(10);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        v0 v0Var = this.f8350s;
        if (v0Var == null) {
            x0(11);
        }
        return v0Var;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        L7.E e10 = this.f8348q;
        if (e10 == null) {
            x0(7);
        }
        return e10;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return false;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        List list = this.f8351t;
        if (list == null) {
            x0(15);
        }
        return list;
    }

    public String toString() {
        return AbstractC1334m.L(this);
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
