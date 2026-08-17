package W7;

import C8.S;
import I7.i;
import L7.AbstractC1295u;
import L7.C1285j;
import L7.E;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.Z;
import L7.b0;
import L7.h0;
import L7.t0;
import O7.K;
import O7.L;
import O7.M;
import c8.AbstractC1914k0;
import com.facebook.react.views.text.TextAttributeProps;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Pair;
import o8.AbstractC3026h;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class f extends K implements a {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f12149I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Pair f12150J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private S f12151K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(InterfaceC1288m interfaceC1288m, M7.h hVar, E e10, AbstractC1295u abstractC1295u, boolean z10, k8.f fVar, h0 h0Var, Z z11, InterfaceC1277b.a aVar, boolean z12, Pair pair) {
        super(interfaceC1288m, z11, hVar, e10, abstractC1295u, z10, fVar, aVar, h0Var, false, false, false, false, false, false);
        if (interfaceC1288m == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (e10 == null) {
            G(2);
        }
        if (abstractC1295u == null) {
            G(3);
        }
        if (fVar == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        if (aVar == null) {
            G(6);
        }
        this.f12151K = null;
        this.f12149I = z12;
        this.f12150J = pair;
    }

    private static /* synthetic */ void G(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "newOwner";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "newModality";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[2] = "enhance";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f c1(InterfaceC1288m interfaceC1288m, M7.h hVar, E e10, AbstractC1295u abstractC1295u, boolean z10, k8.f fVar, h0 h0Var, boolean z11) {
        if (interfaceC1288m == null) {
            G(7);
        }
        if (hVar == null) {
            G(8);
        }
        if (e10 == null) {
            G(9);
        }
        if (abstractC1295u == null) {
            G(10);
        }
        if (fVar == null) {
            G(11);
        }
        if (h0Var == null) {
            G(12);
        }
        return new f(interfaceC1288m, hVar, e10, abstractC1295u, z10, fVar, h0Var, null, InterfaceC1277b.a.DECLARATION, z11, null);
    }

    @Override // O7.X, L7.InterfaceC1276a
    public boolean F() {
        return false;
    }

    @Override // O7.K
    protected K M0(InterfaceC1288m interfaceC1288m, E e10, AbstractC1295u abstractC1295u, Z z10, InterfaceC1277b.a aVar, k8.f fVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(13);
        }
        if (e10 == null) {
            G(14);
        }
        if (abstractC1295u == null) {
            G(15);
        }
        if (aVar == null) {
            G(16);
        }
        if (fVar == null) {
            G(17);
        }
        if (h0Var == null) {
            G(18);
        }
        return new f(interfaceC1288m, getAnnotations(), e10, abstractC1295u, d0(), fVar, h0Var, z10, aVar, this.f12149I, this.f12150J);
    }

    @Override // O7.K
    public void W0(S s10) {
        if (s10 == null) {
            G(22);
        }
        this.f12151K = s10;
    }

    @Override // O7.K, L7.InterfaceC1276a
    public Object g0(InterfaceC1276a.InterfaceC0068a interfaceC0068a) {
        Pair pair = this.f12150J;
        if (pair == null || !((InterfaceC1276a.InterfaceC0068a) pair.c()).equals(interfaceC0068a)) {
            return null;
        }
        return this.f12150J.d();
    }

    @Override // O7.K, L7.u0
    public boolean isConst() {
        S type = getType();
        if (this.f12149I && C1285j.a(type)) {
            return !AbstractC1914k0.i(type) || i.v0(type);
        }
        return false;
    }

    @Override // W7.a
    public a v(S s10, List list, S s11, Pair pair) {
        L l10;
        M m10;
        if (list == null) {
            G(19);
        }
        if (s11 == null) {
            G(20);
        }
        Z zA = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), k(), getVisibility(), d0(), getName(), g(), zA, getKind(), this.f12149I, pair);
        L getter = getGetter();
        if (getter != null) {
            L l11 = new L(fVar, getter.getAnnotations(), getter.k(), getter.getVisibility(), getter.S(), getter.isExternal(), getter.isInline(), getKind(), zA == null ? null : zA.getGetter(), getter.g());
            l11.J0(getter.Z());
            l11.M0(s11);
            l10 = l11;
        } else {
            l10 = null;
        }
        b0 b0VarH = h();
        if (b0VarH != null) {
            m10 = new M(fVar, b0VarH.getAnnotations(), b0VarH.k(), b0VarH.getVisibility(), b0VarH.S(), b0VarH.isExternal(), b0VarH.isInline(), getKind(), zA == null ? null : zA.h(), b0VarH.g());
            m10.J0(m10.Z());
            m10.N0((t0) b0VarH.i().get(0));
        } else {
            m10 = null;
        }
        fVar.S0(l10, m10, l0(), i0());
        fVar.X0(T0());
        InterfaceC3487a interfaceC3487a = this.f8432n;
        if (interfaceC3487a != null) {
            fVar.H0(this.f8431m, interfaceC3487a);
        }
        fVar.u0(e());
        fVar.Y0(s11, getTypeParameters(), a0(), s10 != null ? AbstractC3026h.i(this, s10, M7.h.f7570a.b()) : null, AbstractC2800q.j());
        return fVar;
    }
}
