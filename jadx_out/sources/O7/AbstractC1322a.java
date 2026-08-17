package O7;

import C8.AbstractC0407d0;
import C8.E0;
import C8.G0;
import C8.J0;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1290o;
import L7.c0;
import L7.l0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3027i;
import s8.AbstractC3340e;
import v8.C3438g;
import v8.C3451t;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: O7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1322a extends z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.f f8433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final B8.i f8434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.i f8435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final B8.i f8436k;

    /* JADX INFO: renamed from: O7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0091a implements InterfaceC3487a {

        /* JADX INFO: renamed from: O7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0092a implements Function1 {
            C0092a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC0407d0 invoke(D8.g gVar) {
                InterfaceC1283h interfaceC1283hF = gVar.f(AbstractC1322a.this);
                return interfaceC1283hF == null ? (AbstractC0407d0) AbstractC1322a.this.f8434i.invoke() : interfaceC1283hF instanceof l0 ? C8.V.c((l0) interfaceC1283hF, J0.g(interfaceC1283hF.j().getParameters())) : interfaceC1283hF instanceof z ? J0.u(interfaceC1283hF.j().o(gVar), ((z) interfaceC1283hF).L(gVar), this) : interfaceC1283hF.r();
            }
        }

        C0091a() {
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0407d0 invoke() {
            AbstractC1322a abstractC1322a = AbstractC1322a.this;
            return J0.v(abstractC1322a, abstractC1322a.A0(), new C0092a());
        }
    }

    /* JADX INFO: renamed from: O7.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements InterfaceC3487a {
        b() {
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3442k invoke() {
            return new C3438g(AbstractC1322a.this.A0());
        }
    }

    /* JADX INFO: renamed from: O7.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements InterfaceC3487a {
        c() {
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 invoke() {
            return new C1340t(AbstractC1322a.this);
        }
    }

    public AbstractC1322a(B8.n nVar, k8.f fVar) {
        if (nVar == null) {
            x0(0);
        }
        if (fVar == null) {
            x0(1);
        }
        this.f8433h = fVar;
        this.f8434i = nVar.e(new C0091a());
        this.f8435j = nVar.e(new b());
        this.f8436k = nVar.e(new c());
    }

    private static /* synthetic */ void x0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "typeSubstitution";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[2] = "getMemberScope";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k A0() {
        InterfaceC3442k interfaceC3442kL = L(AbstractC3340e.r(AbstractC3027i.g(this)));
        if (interfaceC3442kL == null) {
            x0(17);
        }
        return interfaceC3442kL;
    }

    @Override // L7.j0
    /* JADX INFO: renamed from: C0 */
    public InterfaceC1280e c(G0 g02) {
        if (g02 == null) {
            x0(18);
        }
        return g02.k() ? this : new C1345y(this, g02);
    }

    @Override // L7.InterfaceC1280e
    public List D0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            x0(6);
        }
        return list;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.h(this, obj);
    }

    @Override // O7.z
    public InterfaceC3442k G(E0 e02, D8.g gVar) {
        if (e02 == null) {
            x0(10);
        }
        if (gVar == null) {
            x0(11);
        }
        if (!e02.f()) {
            return new C3451t(L(gVar), G0.g(e02));
        }
        InterfaceC3442k interfaceC3442kL = L(gVar);
        if (interfaceC3442kL == null) {
            x0(12);
        }
        return interfaceC3442kL;
    }

    @Override // L7.InterfaceC1280e
    public c0 G0() {
        c0 c0Var = (c0) this.f8436k.invoke();
        if (c0Var == null) {
            x0(5);
        }
        return c0Var;
    }

    @Override // L7.J
    public k8.f getName() {
        k8.f fVar = this.f8433h;
        if (fVar == null) {
            x0(2);
        }
        return fVar;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k n0(E0 e02) {
        if (e02 == null) {
            x0(15);
        }
        InterfaceC3442k interfaceC3442kG = G(e02, AbstractC3340e.r(AbstractC3027i.g(this)));
        if (interfaceC3442kG == null) {
            x0(16);
        }
        return interfaceC3442kG;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1283h
    public AbstractC0407d0 r() {
        AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) this.f8434i.invoke();
        if (abstractC0407d0 == null) {
            x0(20);
        }
        return abstractC0407d0;
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k v0() {
        InterfaceC3442k interfaceC3442k = (InterfaceC3442k) this.f8435j.invoke();
        if (interfaceC3442k == null) {
            x0(4);
        }
        return interfaceC3442k;
    }

    @Override // L7.InterfaceC1288m
    public InterfaceC1280e a() {
        return this;
    }
}
