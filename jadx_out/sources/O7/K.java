package O7;

import C8.E0;
import C8.G0;
import C8.N0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.InterfaceC1297w;
import L7.InterfaceC1300z;
import L7.Z;
import L7.a0;
import L7.b0;
import L7.c0;
import L7.h0;
import L7.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s8.AbstractC3340e;
import w7.InterfaceC3487a;
import w8.C3497c;
import w8.C3498d;
import w8.InterfaceC3500f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class K extends Y implements Z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private c0 f8368A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private c0 f8369B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List f8370C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private L f8371D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private b0 f8372E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f8373F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private InterfaceC1297w f8374G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private InterfaceC1297w f8375H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final L7.E f8376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC1295u f8377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Collection f8378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Z f8379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1277b.a f8380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f8381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f8382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f8383v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f8384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f8385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f8386y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f8387z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC1288m f8388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private L7.E f8389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC1295u f8390c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC1277b.a f8393f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c0 f8396i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private k8.f f8398k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private C8.S f8399l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Z f8391d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8392e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E0 f8394g = E0.f560b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8395h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f8397j = null;

        public a() {
            this.f8388a = K.this.b();
            this.f8389b = K.this.k();
            this.f8390c = K.this.getVisibility();
            this.f8393f = K.this.getKind();
            this.f8396i = K.this.f8368A;
            this.f8398k = K.this.getName();
            this.f8399l = K.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[0] = "substitution";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[2] = "setSubstitution";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public Z n() {
            return K.this.N0(this);
        }

        a0 o() {
            Z z10 = this.f8391d;
            if (z10 == null) {
                return null;
            }
            return z10.getGetter();
        }

        b0 p() {
            Z z10 = this.f8391d;
            if (z10 == null) {
                return null;
            }
            return z10.h();
        }

        public a q(boolean z10) {
            this.f8395h = z10;
            return this;
        }

        public a r(InterfaceC1277b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f8393f = aVar;
            return this;
        }

        public a s(L7.E e10) {
            if (e10 == null) {
                a(6);
            }
            this.f8389b = e10;
            return this;
        }

        public a t(InterfaceC1277b interfaceC1277b) {
            this.f8391d = (Z) interfaceC1277b;
            return this;
        }

        public a u(InterfaceC1288m interfaceC1288m) {
            if (interfaceC1288m == null) {
                a(0);
            }
            this.f8388a = interfaceC1288m;
            return this;
        }

        public a v(E0 e02) {
            if (e02 == null) {
                a(15);
            }
            this.f8394g = e02;
            return this;
        }

        public a w(AbstractC1295u abstractC1295u) {
            if (abstractC1295u == null) {
                a(8);
            }
            this.f8390c = abstractC1295u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected K(InterfaceC1288m interfaceC1288m, Z z10, M7.h hVar, L7.E e10, AbstractC1295u abstractC1295u, boolean z11, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(interfaceC1288m, hVar, fVar, null, z11, h0Var);
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
        if (aVar == null) {
            G(5);
        }
        if (h0Var == null) {
            G(6);
        }
        this.f8378q = null;
        this.f8387z = Collections.EMPTY_LIST;
        this.f8376o = e10;
        this.f8377p = abstractC1295u;
        this.f8379r = z10 == null ? this : z10;
        this.f8380s = aVar;
        this.f8381t = z12;
        this.f8382u = z13;
        this.f8383v = z14;
        this.f8384w = z15;
        this.f8385x = z16;
        this.f8386y = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
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
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "inType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "typeParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    objArr[1] = "getTypeParameters";
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    objArr[1] = "getReturnType";
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    objArr[1] = "getModality";
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    objArr[1] = "getVisibility";
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[2] = "create";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "setInType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[2] = "setType";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[2] = "setVisibility";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static K L0(InterfaceC1288m interfaceC1288m, M7.h hVar, L7.E e10, AbstractC1295u abstractC1295u, boolean z10, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
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
        if (aVar == null) {
            G(12);
        }
        if (h0Var == null) {
            G(13);
        }
        return new K(interfaceC1288m, null, hVar, e10, abstractC1295u, z10, fVar, aVar, h0Var, z11, z12, z13, z14, z15, z16);
    }

    private h0 P0(boolean z10, Z z11) {
        h0 h0VarG;
        if (z10) {
            if (z11 == null) {
                z11 = a();
            }
            h0VarG = z11.g();
        } else {
            h0VarG = h0.f7335a;
        }
        if (h0VarG == null) {
            G(28);
        }
        return h0VarG;
    }

    private static InterfaceC1300z Q0(G0 g02, L7.Y y10) {
        if (g02 == null) {
            G(30);
        }
        if (y10 == null) {
            G(31);
        }
        if (y10.Z() != null) {
            return y10.Z().c(g02);
        }
        return null;
    }

    private static AbstractC1295u V0(AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar) {
        return (aVar == InterfaceC1277b.a.FAKE_OVERRIDE && AbstractC1294t.g(abstractC1295u.f())) ? AbstractC1294t.f7350h : abstractC1295u;
    }

    private static c0 a1(G0 g02, Z z10, c0 c0Var) {
        C8.S sP = g02.p(c0Var.getType(), N0.f593l);
        if (sP == null) {
            return null;
        }
        return new N(z10, new C3497c(z10, sP, ((InterfaceC3500f) c0Var.getValue()).a(), c0Var.getValue()), c0Var.getAnnotations());
    }

    private static c0 b1(G0 g02, Z z10, c0 c0Var) {
        C8.S sP = g02.p(c0Var.getType(), N0.f593l);
        if (sP == null) {
            return null;
        }
        return new N(z10, new C3498d(z10, sP, c0Var.getValue()), c0Var.getAnnotations());
    }

    @Override // L7.D
    public boolean B0() {
        return this.f8384w;
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.c(this, obj);
    }

    @Override // L7.D
    public boolean J() {
        return this.f8383v;
    }

    @Override // L7.InterfaceC1277b
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public Z x(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        Z zN = U0().u(interfaceC1288m).t(null).s(e10).w(abstractC1295u).r(aVar).q(z10).n();
        if (zN == null) {
            G(42);
        }
        return zN;
    }

    @Override // L7.v0
    public boolean M() {
        return this.f8386y;
    }

    protected K M0(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, Z z10, InterfaceC1277b.a aVar, k8.f fVar, h0 h0Var) {
        if (interfaceC1288m == null) {
            G(32);
        }
        if (e10 == null) {
            G(33);
        }
        if (abstractC1295u == null) {
            G(34);
        }
        if (aVar == null) {
            G(35);
        }
        if (fVar == null) {
            G(36);
        }
        if (h0Var == null) {
            G(37);
        }
        return new K(interfaceC1288m, z10, getAnnotations(), e10, abstractC1295u, d0(), fVar, aVar, h0Var, o0(), isConst(), J(), B0(), isExternal(), M());
    }

    protected Z N0(a aVar) {
        c0 c0Var;
        InterfaceC3487a interfaceC3487a;
        if (aVar == null) {
            G(29);
        }
        K kM0 = M0(aVar.f8388a, aVar.f8389b, aVar.f8390c, aVar.f8391d, aVar.f8393f, aVar.f8398k, P0(aVar.f8392e, aVar.f8391d));
        List typeParameters = aVar.f8397j == null ? getTypeParameters() : aVar.f8397j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0B = C8.C.b(typeParameters, aVar.f8394g, kM0, arrayList);
        C8.S s10 = aVar.f8399l;
        C8.S sP = g0B.p(s10, N0.f594m);
        if (sP == null) {
            return null;
        }
        C8.S sP2 = g0B.p(s10, N0.f593l);
        if (sP2 != null) {
            kM0.W0(sP2);
        }
        c0 c0Var2 = aVar.f8396i;
        if (c0Var2 != null) {
            c0 c0VarC = c0Var2.c(g0B);
            if (c0VarC == null) {
                return null;
            }
            c0Var = c0VarC;
        } else {
            c0Var = null;
        }
        c0 c0Var3 = this.f8369B;
        c0 c0VarB1 = c0Var3 != null ? b1(g0B, kM0, c0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f8387z.iterator();
        while (it.hasNext()) {
            c0 c0VarA1 = a1(g0B, kM0, (c0) it.next());
            if (c0VarA1 != null) {
                arrayList2.add(c0VarA1);
            }
        }
        kM0.Y0(sP, arrayList, c0Var, c0VarB1, arrayList2);
        L l10 = this.f8371D == null ? null : new L(kM0, this.f8371D.getAnnotations(), aVar.f8389b, V0(this.f8371D.getVisibility(), aVar.f8393f), this.f8371D.S(), this.f8371D.isExternal(), this.f8371D.isInline(), aVar.f8393f, aVar.o(), h0.f7335a);
        if (l10 != null) {
            C8.S returnType = this.f8371D.getReturnType();
            l10.J0(Q0(g0B, this.f8371D));
            l10.M0(returnType != null ? g0B.p(returnType, N0.f594m) : null);
        }
        M m10 = this.f8372E == null ? null : new M(kM0, this.f8372E.getAnnotations(), aVar.f8389b, V0(this.f8372E.getVisibility(), aVar.f8393f), this.f8372E.S(), this.f8372E.isExternal(), this.f8372E.isInline(), aVar.f8393f, aVar.p(), h0.f7335a);
        if (m10 != null) {
            List listM0 = AbstractC1339s.M0(m10, this.f8372E.i(), g0B, false, false, null);
            if (listM0 == null) {
                kM0.X0(true);
                listM0 = Collections.singletonList(M.L0(m10, AbstractC3340e.m(aVar.f8388a).H(), ((t0) this.f8372E.i().get(0)).getAnnotations()));
            }
            if (listM0.size() != 1) {
                throw new IllegalStateException();
            }
            m10.J0(Q0(g0B, this.f8372E));
            m10.N0((t0) listM0.get(0));
        }
        InterfaceC1297w interfaceC1297w = this.f8374G;
        r rVar = interfaceC1297w == null ? null : new r(interfaceC1297w.getAnnotations(), kM0);
        InterfaceC1297w interfaceC1297w2 = this.f8375H;
        kM0.S0(l10, m10, rVar, interfaceC1297w2 == null ? null : new r(interfaceC1297w2.getAnnotations(), kM0));
        if (aVar.f8395h) {
            M8.l lVarO = M8.l.o();
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                lVarO.add(((Z) it2.next()).c(g0B));
            }
            kM0.u0(lVarO);
        }
        if (isConst() && (interfaceC3487a = this.f8432n) != null) {
            kM0.H0(this.f8431m, interfaceC3487a);
        }
        return kM0;
    }

    @Override // L7.Z
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public L getGetter() {
        return this.f8371D;
    }

    public void R0(L l10, b0 b0Var) {
        S0(l10, b0Var, null, null);
    }

    public void S0(L l10, b0 b0Var, InterfaceC1297w interfaceC1297w, InterfaceC1297w interfaceC1297w2) {
        this.f8371D = l10;
        this.f8372E = b0Var;
        this.f8374G = interfaceC1297w;
        this.f8375H = interfaceC1297w2;
    }

    public boolean T0() {
        return this.f8373F;
    }

    public a U0() {
        return new a();
    }

    public void W0(C8.S s10) {
        if (s10 == null) {
            G(14);
        }
    }

    public void X0(boolean z10) {
        this.f8373F = z10;
    }

    public void Y0(C8.S s10, List list, c0 c0Var, c0 c0Var2, List list2) {
        if (s10 == null) {
            G(17);
        }
        if (list == null) {
            G(18);
        }
        if (list2 == null) {
            G(19);
        }
        C0(s10);
        this.f8370C = new ArrayList(list);
        this.f8369B = c0Var2;
        this.f8368A = c0Var;
        this.f8387z = list2;
    }

    public void Z0(AbstractC1295u abstractC1295u) {
        if (abstractC1295u == null) {
            G(20);
        }
        this.f8377p = abstractC1295u;
    }

    @Override // O7.X, L7.InterfaceC1276a
    public c0 a0() {
        return this.f8368A;
    }

    @Override // L7.InterfaceC1276a
    public Collection e() {
        Collection collection = this.f8378q;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            G(41);
        }
        return collection;
    }

    @Override // L7.InterfaceC1276a
    public Object g0(InterfaceC1276a.InterfaceC0068a interfaceC0068a) {
        return null;
    }

    @Override // L7.InterfaceC1277b
    public InterfaceC1277b.a getKind() {
        InterfaceC1277b.a aVar = this.f8380s;
        if (aVar == null) {
            G(39);
        }
        return aVar;
    }

    @Override // O7.X, L7.InterfaceC1276a
    public C8.S getReturnType() {
        C8.S type = getType();
        if (type == null) {
            G(23);
        }
        return type;
    }

    @Override // O7.X, L7.InterfaceC1276a
    public List getTypeParameters() {
        List list = this.f8370C;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = this.f8377p;
        if (abstractC1295u == null) {
            G(25);
        }
        return abstractC1295u;
    }

    @Override // L7.Z
    public b0 h() {
        return this.f8372E;
    }

    @Override // O7.X, L7.InterfaceC1276a
    public c0 h0() {
        return this.f8369B;
    }

    @Override // L7.Z
    public InterfaceC1297w i0() {
        return this.f8375H;
    }

    @Override // L7.u0
    public boolean isConst() {
        return this.f8382u;
    }

    public boolean isExternal() {
        return this.f8385x;
    }

    @Override // L7.D
    public L7.E k() {
        L7.E e10 = this.f8376o;
        if (e10 == null) {
            G(24);
        }
        return e10;
    }

    @Override // L7.Z
    public InterfaceC1297w l0() {
        return this.f8374G;
    }

    @Override // L7.InterfaceC1276a
    public List m0() {
        List list = this.f8387z;
        if (list == null) {
            G(22);
        }
        return list;
    }

    @Override // L7.u0
    public boolean o0() {
        return this.f8381t;
    }

    @Override // L7.Z
    public List u() {
        ArrayList arrayList = new ArrayList(2);
        L l10 = this.f8371D;
        if (l10 != null) {
            arrayList.add(l10);
        }
        b0 b0Var = this.f8372E;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    @Override // L7.InterfaceC1277b
    public void u0(Collection collection) {
        if (collection == null) {
            G(40);
        }
        this.f8378q = collection;
    }

    @Override // L7.j0
    public Z c(G0 g02) {
        if (g02 == null) {
            G(27);
        }
        return g02.k() ? this : U0().v(g02.j()).t(a()).n();
    }

    @Override // O7.AbstractC1335n
    public Z a() {
        Z z10 = this.f8379r;
        Z zA = z10 == this ? this : z10.a();
        if (zA == null) {
            G(38);
        }
        return zA;
    }
}
