package O7;

import C8.AbstractC0407d0;
import C8.C0434u;
import C8.C0437x;
import C8.E0;
import C8.G0;
import C8.J0;
import C8.N0;
import C8.v0;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.c0;
import L7.h0;
import L7.m0;
import L7.r0;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3027i;
import s8.AbstractC3340e;
import v8.C3451t;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: O7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1345y extends z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f8561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G0 f8562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private G0 f8563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f8564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f8565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0 f8566m;

    /* JADX INFO: renamed from: O7.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Function1 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(m0 m0Var) {
            return Boolean.valueOf(!m0Var.j0());
        }
    }

    /* JADX INFO: renamed from: O7.y$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Function1 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0407d0 invoke(AbstractC0407d0 abstractC0407d0) {
            return C1345y.this.J0(abstractC0407d0);
        }
    }

    public C1345y(z zVar, G0 g02) {
        this.f8561h = zVar;
        this.f8562i = g02;
    }

    private G0 H0() {
        if (this.f8563j == null) {
            if (this.f8562i.k()) {
                this.f8563j = this.f8562i;
            } else {
                List parameters = this.f8561h.j().getParameters();
                this.f8564k = new ArrayList(parameters.size());
                this.f8563j = C8.C.b(parameters, this.f8562i.j(), this, this.f8564k);
                this.f8565l = AbstractC2800q.b0(this.f8564k, new a());
            }
        }
        return this.f8563j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0407d0 J0(AbstractC0407d0 abstractC0407d0) {
        return (abstractC0407d0 == null || this.f8562i.k()) ? abstractC0407d0 : (AbstractC0407d0) H0().p(abstractC0407d0, N0.f592k);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void x0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 != 6) {
            if (i10 != 8) {
                if (i10 != 10) {
                    if (i10 != 13) {
                        if (i10 != 23) {
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                        } else {
                            objArr[0] = "substitutor";
                        }
                    }
                }
            }
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getConstructors";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getAnnotations";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[1] = "getName";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[1] = "getOriginal";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[1] = "getContainingDeclaration";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[1] = "substitute";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[1] = "getKind";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[1] = "getModality";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[1] = "getVisibility";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k A0() {
        InterfaceC3442k interfaceC3442kL = L(AbstractC3340e.r(AbstractC3027i.g(this.f8561h)));
        if (interfaceC3442kL == null) {
            x0(12);
        }
        return interfaceC3442kL;
    }

    @Override // L7.D
    public boolean B0() {
        return this.f8561h.B0();
    }

    @Override // L7.InterfaceC1280e
    public boolean C() {
        return this.f8561h.C();
    }

    @Override // L7.InterfaceC1280e
    public List D0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(17);
        }
        return list;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.h(this, obj);
    }

    @Override // L7.InterfaceC1280e
    public boolean F0() {
        return this.f8561h.F0();
    }

    @Override // O7.z
    public InterfaceC3442k G(E0 e02, D8.g gVar) {
        if (e02 == null) {
            x0(5);
        }
        if (gVar == null) {
            x0(6);
        }
        InterfaceC3442k interfaceC3442kG = this.f8561h.G(e02, gVar);
        if (!this.f8562i.k()) {
            return new C3451t(interfaceC3442kG, H0());
        }
        if (interfaceC3442kG == null) {
            x0(7);
        }
        return interfaceC3442kG;
    }

    @Override // L7.InterfaceC1280e
    public c0 G0() {
        throw new UnsupportedOperationException();
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        Collection collectionI = this.f8561h.I();
        if (collectionI == null) {
            x0(31);
        }
        return collectionI;
    }

    @Override // L7.j0
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1280e c(G0 g02) {
        if (g02 == null) {
            x0(23);
        }
        return g02.k() ? this : new C1345y(this, G0.h(g02.j(), H0().j()));
    }

    @Override // L7.D
    public boolean J() {
        return this.f8561h.J();
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return this.f8561h.K();
    }

    @Override // O7.z
    public InterfaceC3442k L(D8.g gVar) {
        if (gVar == null) {
            x0(13);
        }
        InterfaceC3442k interfaceC3442kL = this.f8561h.L(gVar);
        if (!this.f8562i.k()) {
            return new C3451t(interfaceC3442kL, H0());
        }
        if (interfaceC3442kL == null) {
            x0(14);
        }
        return interfaceC3442kL;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return this.f8561h.O();
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k P() {
        InterfaceC3442k interfaceC3442kP = this.f8561h.P();
        if (interfaceC3442kP == null) {
            x0(15);
        }
        return interfaceC3442kP;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return this.f8561h.R();
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1289n, L7.InterfaceC1288m
    public InterfaceC1288m b() {
        InterfaceC1288m interfaceC1288mB = this.f8561h.b();
        if (interfaceC1288mB == null) {
            x0(22);
        }
        return interfaceC1288mB;
    }

    @Override // L7.InterfaceC1280e
    public Collection f() {
        Collection<InterfaceC1279d> collectionF = this.f8561h.f();
        ArrayList arrayList = new ArrayList(collectionF.size());
        for (InterfaceC1279d interfaceC1279d : collectionF) {
            arrayList.add(((InterfaceC1279d) interfaceC1279d.s().r(interfaceC1279d.a()).s(interfaceC1279d.k()).b(interfaceC1279d.getVisibility()).i(interfaceC1279d.getKind()).k(false).build()).c(H0()));
        }
        return arrayList;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        h0 h0Var = h0.f7335a;
        if (h0Var == null) {
            x0(29);
        }
        return h0Var;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        M7.h annotations = this.f8561h.getAnnotations();
        if (annotations == null) {
            x0(19);
        }
        return annotations;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        EnumC1281f kind = this.f8561h.getKind();
        if (kind == null) {
            x0(25);
        }
        return kind;
    }

    @Override // L7.J
    public k8.f getName() {
        k8.f name = this.f8561h.getName();
        if (name == null) {
            x0(20);
        }
        return name;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u visibility = this.f8561h.getVisibility();
        if (visibility == null) {
            x0(27);
        }
        return visibility;
    }

    @Override // L7.D
    public boolean isExternal() {
        return this.f8561h.isExternal();
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return this.f8561h.isInline();
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        v0 v0VarJ = this.f8561h.j();
        if (this.f8562i.k()) {
            if (v0VarJ == null) {
                x0(0);
            }
            return v0VarJ;
        }
        if (this.f8566m == null) {
            G0 g0H0 = H0();
            Collection collectionG = v0VarJ.g();
            ArrayList arrayList = new ArrayList(collectionG.size());
            Iterator it = collectionG.iterator();
            while (it.hasNext()) {
                arrayList.add(g0H0.p((C8.S) it.next(), N0.f592k));
            }
            this.f8566m = new C0434u(this, this.f8564k, arrayList, B8.f.f411e);
        }
        v0 v0Var = this.f8566m;
        if (v0Var == null) {
            x0(1);
        }
        return v0Var;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        L7.E eK = this.f8561h.k();
        if (eK == null) {
            x0(26);
        }
        return eK;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return this.f8561h.l();
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k n0(E0 e02) {
        if (e02 == null) {
            x0(10);
        }
        InterfaceC3442k interfaceC3442kG = G(e02, AbstractC3340e.r(AbstractC3027i.g(this)));
        if (interfaceC3442kG == null) {
            x0(11);
        }
        return interfaceC3442kG;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1283h
    public AbstractC0407d0 r() {
        AbstractC0407d0 abstractC0407d0M = C8.V.m(C0437x.f713a.a(getAnnotations(), null, null), j(), J0.g(j().getParameters()), false, A0());
        if (abstractC0407d0M == null) {
            x0(16);
        }
        return abstractC0407d0M;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        H0();
        List list = this.f8565l;
        if (list == null) {
            x0(30);
        }
        return list;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k v0() {
        InterfaceC3442k interfaceC3442kV0 = this.f8561h.v0();
        if (interfaceC3442kV0 == null) {
            x0(28);
        }
        return interfaceC3442kV0;
    }

    @Override // L7.InterfaceC1280e
    public r0 w0() {
        r0 r0VarW0 = this.f8561h.w0();
        if (r0VarW0 == null) {
            return null;
        }
        return r0VarW0.b(new b());
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return this.f8561h.y();
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1280e a() {
        InterfaceC1280e interfaceC1280eA = this.f8561h.a();
        if (interfaceC1280eA == null) {
            x0(21);
        }
        return interfaceC1280eA;
    }
}
