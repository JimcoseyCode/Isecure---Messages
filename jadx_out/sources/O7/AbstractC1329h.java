package O7;

import C8.AbstractC0407d0;
import C8.AbstractC0430p;
import C8.N0;
import C8.r0;
import C8.v0;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.h0;
import L7.k0;
import L7.m0;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o8.C3025g;
import s8.AbstractC3340e;
import v8.C3440i;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: O7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1329h extends AbstractC1335n implements m0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final N0 f8451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f8453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final B8.i f8454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final B8.i f8455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final B8.n f8456p;

    /* JADX INFO: renamed from: O7.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ B8.n f8457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k0 f8458h;

        a(B8.n nVar, k0 k0Var) {
            this.f8457g = nVar;
            this.f8458h = k0Var;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 invoke() {
            return new c(AbstractC1329h.this, this.f8457g, this.f8458h);
        }
    }

    /* JADX INFO: renamed from: O7.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k8.f f8460g;

        /* JADX INFO: renamed from: O7.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements InterfaceC3487a {
            a() {
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC3442k invoke() {
                return v8.x.m("Scope for type parameter " + b.this.f8460g.j(), AbstractC1329h.this.getUpperBounds());
            }
        }

        b(k8.f fVar) {
            this.f8460g = fVar;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0407d0 invoke() {
            return C8.V.m(r0.f682h.j(), AbstractC1329h.this.j(), Collections.EMPTY_LIST, false, new C3440i(new a()));
        }
    }

    /* JADX INFO: renamed from: O7.h$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends AbstractC0430p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k0 f8463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1329h f8464e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC1329h abstractC1329h, B8.n nVar, k0 k0Var) {
            super(nVar);
            if (nVar == null) {
                G(0);
            }
            this.f8464e = abstractC1329h;
            this.f8463d = k0Var;
        }

        private static /* synthetic */ void G(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // C8.AbstractC0435v
        protected boolean c(InterfaceC1283h interfaceC1283h) {
            if (interfaceC1283h == null) {
                G(9);
            }
            return (interfaceC1283h instanceof m0) && C3025g.f30519a.m(this.f8464e, (m0) interfaceC1283h, true);
        }

        @Override // C8.v0
        public List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                G(2);
            }
            return list;
        }

        @Override // C8.AbstractC0430p
        protected Collection m() {
            List listI0 = this.f8464e.I0();
            if (listI0 == null) {
                G(1);
            }
            return listI0;
        }

        @Override // C8.v0
        public I7.i n() {
            I7.i iVarM = AbstractC3340e.m(this.f8464e);
            if (iVarM == null) {
                G(4);
            }
            return iVarM;
        }

        @Override // C8.AbstractC0435v, C8.v0
        public InterfaceC1283h p() {
            AbstractC1329h abstractC1329h = this.f8464e;
            if (abstractC1329h == null) {
                G(3);
            }
            return abstractC1329h;
        }

        @Override // C8.v0
        public boolean q() {
            return true;
        }

        @Override // C8.AbstractC0430p
        protected C8.S r() {
            return E8.l.d(E8.k.f1165A, new String[0]);
        }

        public String toString() {
            return this.f8464e.getName().toString();
        }

        @Override // C8.AbstractC0430p
        protected k0 u() {
            k0 k0Var = this.f8463d;
            if (k0Var == null) {
                G(5);
            }
            return k0Var;
        }

        @Override // C8.AbstractC0430p
        protected List w(List list) {
            if (list == null) {
                G(7);
            }
            List listC0 = this.f8464e.C0(list);
            if (listC0 == null) {
                G(8);
            }
            return listC0;
        }

        @Override // C8.AbstractC0430p
        protected void y(C8.S s10) {
            if (s10 == null) {
                G(6);
            }
            this.f8464e.H0(s10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1329h(B8.n nVar, InterfaceC1288m interfaceC1288m, M7.h hVar, k8.f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(interfaceC1288m, hVar, fVar, h0Var);
        if (nVar == null) {
            G(0);
        }
        if (interfaceC1288m == null) {
            G(1);
        }
        if (hVar == null) {
            G(2);
        }
        if (fVar == null) {
            G(3);
        }
        if (n02 == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        if (k0Var == null) {
            G(6);
        }
        this.f8451k = n02;
        this.f8452l = z10;
        this.f8453m = i10;
        this.f8454n = nVar.e(new a(nVar, k0Var));
        this.f8455o = nVar.e(new b(fVar));
        this.f8456p = nVar;
    }

    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected List C0(List list) {
        if (list == null) {
            G(12);
        }
        if (list == null) {
            G(13);
        }
        return list;
    }

    @Override // L7.m0
    public boolean E() {
        return this.f8452l;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.f(this, obj);
    }

    protected abstract void H0(C8.S s10);

    protected abstract List I0();

    @Override // L7.m0
    public B8.n c0() {
        B8.n nVar = this.f8456p;
        if (nVar == null) {
            G(14);
        }
        return nVar;
    }

    @Override // L7.m0
    public int getIndex() {
        return this.f8453m;
    }

    @Override // L7.m0
    public List getUpperBounds() {
        List listG = ((c) j()).g();
        if (listG == null) {
            G(8);
        }
        return listG;
    }

    @Override // L7.m0, L7.InterfaceC1283h
    public final v0 j() {
        v0 v0Var = (v0) this.f8454n.invoke();
        if (v0Var == null) {
            G(9);
        }
        return v0Var;
    }

    @Override // L7.m0
    public boolean j0() {
        return false;
    }

    @Override // L7.m0
    public N0 m() {
        N0 n02 = this.f8451k;
        if (n02 == null) {
            G(7);
        }
        return n02;
    }

    @Override // L7.InterfaceC1283h
    public AbstractC0407d0 r() {
        AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) this.f8455o.invoke();
        if (abstractC0407d0 == null) {
            G(10);
        }
        return abstractC0407d0;
    }

    @Override // O7.AbstractC1335n
    public m0 a() {
        m0 m0Var = (m0) super.a();
        if (m0Var == null) {
            G(11);
        }
        return m0Var;
    }
}
