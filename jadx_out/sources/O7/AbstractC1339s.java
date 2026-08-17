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
import L7.InterfaceC1300z;
import L7.c0;
import L7.h0;
import L7.m0;
import L7.t0;
import O7.V;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o8.AbstractC3026h;
import w7.InterfaceC3487a;
import w8.C3498d;
import w8.InterfaceC3500f;

/* JADX INFO: renamed from: O7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1339s extends AbstractC1335n implements InterfaceC1300z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f8497A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f8498B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f8499C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f8500D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Collection f8501E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile InterfaceC3487a f8502F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final InterfaceC1300z f8503G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final InterfaceC1277b.a f8504H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private InterfaceC1300z f8505I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected Map f8506J;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f8507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f8508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C8.S f8509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f8510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c0 f8511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c0 f8512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private L7.E f8513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbstractC1295u f8514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8522z;

    /* JADX INFO: renamed from: O7.s$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ G0 f8523g;

        a(G0 g02) {
            this.f8523g = g02;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            M8.k kVar = new M8.k();
            Iterator it = AbstractC1339s.this.e().iterator();
            while (it.hasNext()) {
                kVar.add(((InterfaceC1300z) it.next()).c(this.f8523g));
            }
            return kVar;
        }
    }

    /* JADX INFO: renamed from: O7.s$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f8525g;

        b(List list) {
            this.f8525g = list;
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.f8525g;
        }
    }

    /* JADX INFO: renamed from: O7.s$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class c implements InterfaceC1300z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected E0 f8526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected InterfaceC1288m f8527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected L7.E f8528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected AbstractC1295u f8529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected InterfaceC1300z f8530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected InterfaceC1277b.a f8531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected List f8532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected List f8533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected c0 f8534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected c0 f8535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected C8.S f8536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected k8.f f8537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected boolean f8538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected boolean f8539n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected boolean f8540o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        protected boolean f8541p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f8542q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f8543r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private M7.h f8544s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Map f8546u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Boolean f8547v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        protected boolean f8548w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ AbstractC1339s f8549x;

        public c(AbstractC1339s abstractC1339s, E0 e02, InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, List list, List list2, c0 c0Var, C8.S s10, k8.f fVar) {
            if (e02 == null) {
                u(0);
            }
            if (interfaceC1288m == null) {
                u(1);
            }
            if (e10 == null) {
                u(2);
            }
            if (abstractC1295u == null) {
                u(3);
            }
            if (aVar == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (s10 == null) {
                u(7);
            }
            this.f8549x = abstractC1339s;
            this.f8530e = null;
            this.f8535j = abstractC1339s.f8512p;
            this.f8538m = true;
            this.f8539n = false;
            this.f8540o = false;
            this.f8541p = false;
            this.f8542q = abstractC1339s.t0();
            this.f8543r = null;
            this.f8544s = null;
            this.f8545t = abstractC1339s.z0();
            this.f8546u = new LinkedHashMap();
            this.f8547v = null;
            this.f8548w = false;
            this.f8526a = e02;
            this.f8527b = interfaceC1288m;
            this.f8528c = e10;
            this.f8529d = abstractC1295u;
            this.f8531f = aVar;
            this.f8532g = list;
            this.f8533h = list2;
            this.f8534i = c0Var;
            this.f8536k = s10;
            this.f8537l = fVar;
        }

        private static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    objArr[0] = "parameters";
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    objArr[1] = "setVisibility";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    objArr[1] = "setName";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                    objArr[1] = "setValueParameters";
                    break;
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    objArr[1] = "setTypeParameters";
                    break;
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    objArr[1] = "setReturnType";
                    break;
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                    objArr[2] = "setValueParameters";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                    objArr[2] = "setReturnType";
                    break;
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 29:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c c(M7.h hVar) {
            if (hVar == null) {
                u(35);
            }
            this.f8544s = hVar;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c k(boolean z10) {
            this.f8538m = z10;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c o(c0 c0Var) {
            this.f8535j = c0Var;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c a() {
            this.f8541p = true;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c g(c0 c0Var) {
            this.f8534i = c0Var;
            return this;
        }

        public c G(boolean z10) {
            this.f8547v = Boolean.valueOf(z10);
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public c j() {
            this.f8545t = true;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c q() {
            this.f8542q = true;
            return this;
        }

        public c J(boolean z10) {
            this.f8548w = z10;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c i(InterfaceC1277b.a aVar) {
            if (aVar == null) {
                u(14);
            }
            this.f8531f = aVar;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c s(L7.E e10) {
            if (e10 == null) {
                u(10);
            }
            this.f8528c = e10;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c l(k8.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f8537l = fVar;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c r(InterfaceC1277b interfaceC1277b) {
            this.f8530e = (InterfaceC1300z) interfaceC1277b;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c m(InterfaceC1288m interfaceC1288m) {
            if (interfaceC1288m == null) {
                u(8);
            }
            this.f8527b = interfaceC1288m;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c h() {
            this.f8540o = true;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c f(C8.S s10) {
            if (s10 == null) {
                u(23);
            }
            this.f8536k = s10;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f8539n = true;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c p(E0 e02) {
            if (e02 == null) {
                u(37);
            }
            this.f8526a = e02;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c n(List list) {
            if (list == null) {
                u(21);
            }
            this.f8543r = list;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c d(List list) {
            if (list == null) {
                u(19);
            }
            this.f8532g = list;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c b(AbstractC1295u abstractC1295u) {
            if (abstractC1295u == null) {
                u(12);
            }
            this.f8529d = abstractC1295u;
            return this;
        }

        @Override // L7.InterfaceC1300z.a
        public InterfaceC1300z build() {
            return this.f8549x.J0(this);
        }

        @Override // L7.InterfaceC1300z.a
        public InterfaceC1300z.a e(InterfaceC1276a.InterfaceC0068a interfaceC0068a, Object obj) {
            if (interfaceC0068a == null) {
                u(39);
            }
            this.f8546u.put(interfaceC0068a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1339s(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, M7.h hVar, k8.f fVar, InterfaceC1277b.a aVar, h0 h0Var) {
        super(interfaceC1288m, hVar, fVar, h0Var);
        if (interfaceC1288m == null) {
            G(0);
        }
        if (hVar == null) {
            G(1);
        }
        if (fVar == null) {
            G(2);
        }
        if (aVar == null) {
            G(3);
        }
        if (h0Var == null) {
            G(4);
        }
        this.f8514r = AbstractC1294t.f7351i;
        this.f8515s = false;
        this.f8516t = false;
        this.f8517u = false;
        this.f8518v = false;
        this.f8519w = false;
        this.f8520x = false;
        this.f8521y = false;
        this.f8522z = false;
        this.f8497A = false;
        this.f8498B = false;
        this.f8499C = true;
        this.f8500D = false;
        this.f8501E = null;
        this.f8502F = null;
        this.f8505I = null;
        this.f8506J = null;
        this.f8503G = interfaceC1300z == null ? this : interfaceC1300z;
        this.f8504H = aVar;
    }

    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[1] = "getOriginal";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                objArr[1] = "getKind";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                objArr[1] = "copy";
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "substitute";
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private h0 K0(boolean z10, InterfaceC1300z interfaceC1300z) {
        h0 h0VarG;
        if (z10) {
            if (interfaceC1300z == null) {
                interfaceC1300z = a();
            }
            h0VarG = interfaceC1300z.g();
        } else {
            h0VarG = h0.f7335a;
        }
        if (h0VarG == null) {
            G(27);
        }
        return h0VarG;
    }

    public static List L0(InterfaceC1300z interfaceC1300z, List list, G0 g02) {
        if (list == null) {
            G(28);
        }
        if (g02 == null) {
            G(29);
        }
        return M0(interfaceC1300z, list, g02, false, false, null);
    }

    public static List M0(InterfaceC1300z interfaceC1300z, List list, G0 g02, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            G(30);
        }
        if (g02 == null) {
            G(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            C8.S type = t0Var.getType();
            N0 n02 = N0.f593l;
            C8.S sP = g02.p(type, n02);
            C8.S sF0 = t0Var.f0();
            C8.S sP2 = sF0 == null ? null : g02.p(sF0, n02);
            if (sP == null) {
                return null;
            }
            if ((sP != t0Var.getType() || sF0 != sP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(V.H0(interfaceC1300z, z10 ? null : t0Var, t0Var.getIndex(), t0Var.getAnnotations(), t0Var.getName(), sP, t0Var.q0(), t0Var.X(), t0Var.V(), sP2, z11 ? t0Var.g() : h0.f7335a, t0Var instanceof V.b ? new b(((V.b) t0Var).M0()) : null));
        }
        return arrayList;
    }

    private void Q0() {
        InterfaceC3487a interfaceC3487a = this.f8502F;
        if (interfaceC3487a != null) {
            this.f8501E = (Collection) interfaceC3487a.invoke();
            this.f8502F = null;
        }
    }

    private void X0(boolean z10) {
        this.f8497A = z10;
    }

    private void Y0(boolean z10) {
        this.f8522z = z10;
    }

    private void a1(InterfaceC1300z interfaceC1300z) {
        this.f8505I = interfaceC1300z;
    }

    @Override // L7.D
    public boolean B0() {
        return this.f8521y;
    }

    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.d(this, obj);
    }

    @Override // L7.InterfaceC1276a
    public boolean F() {
        return this.f8500D;
    }

    public InterfaceC1300z H0(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        InterfaceC1300z interfaceC1300zBuild = s().m(interfaceC1288m).s(e10).b(abstractC1295u).i(aVar).k(z10).build();
        if (interfaceC1300zBuild == null) {
            G(26);
        }
        return interfaceC1300zBuild;
    }

    /* JADX INFO: renamed from: I0 */
    protected abstract AbstractC1339s l1(InterfaceC1288m interfaceC1288m, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a aVar, k8.f fVar, M7.h hVar, h0 h0Var);

    @Override // L7.D
    public boolean J() {
        return this.f8520x;
    }

    protected InterfaceC1300z J0(c cVar) {
        char c10;
        N n10;
        InterfaceC1300z interfaceC1300z;
        C8.S sP;
        if (cVar == null) {
            G(25);
        }
        boolean[] zArr = new boolean[1];
        M7.h hVarA = cVar.f8544s != null ? M7.j.a(getAnnotations(), cVar.f8544s) : getAnnotations();
        InterfaceC1288m interfaceC1288m = cVar.f8527b;
        InterfaceC1300z interfaceC1300z2 = cVar.f8530e;
        AbstractC1339s abstractC1339sI0 = l1(interfaceC1288m, interfaceC1300z2, cVar.f8531f, cVar.f8537l, hVarA, K0(cVar.f8540o, interfaceC1300z2));
        List typeParameters = cVar.f8543r == null ? getTypeParameters() : cVar.f8543r;
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0C = C8.C.c(typeParameters, cVar.f8526a, abstractC1339sI0, arrayList, zArr);
        c0 c0Var = null;
        if (g0C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f8533h.isEmpty()) {
            int i10 = 0;
            for (c0 c0Var2 : cVar.f8533h) {
                C8.S sP2 = g0C.p(c0Var2.getType(), N0.f593l);
                if (sP2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(AbstractC3026h.b(abstractC1339sI0, sP2, ((InterfaceC3500f) c0Var2.getValue()).a(), c0Var2.getAnnotations(), i10));
                zArr[0] = (zArr[0] ? 1 : 0) | (sP2 != c0Var2.getType() ? (char) 1 : (char) 0);
                i10 = i11;
            }
        }
        c0 c0Var3 = cVar.f8534i;
        if (c0Var3 != null) {
            C8.S sP3 = g0C.p(c0Var3.getType(), N0.f593l);
            if (sP3 == null) {
                return null;
            }
            N n11 = new N(abstractC1339sI0, new C3498d(abstractC1339sI0, sP3, cVar.f8534i.getValue()), cVar.f8534i.getAnnotations());
            zArr[0] = (sP3 != cVar.f8534i.getType() ? (char) 1 : (char) 0) | (zArr[0] ? 1 : 0);
            c10 = 0;
            n10 = n11;
        } else {
            c10 = 0;
            n10 = null;
        }
        c0 c0Var4 = cVar.f8535j;
        if (c0Var4 != null) {
            c0 c0VarC = c0Var4.c(g0C);
            if (c0VarC == null) {
                return null;
            }
            zArr[c10] = (zArr[c10] ? 1 : 0) | (c0VarC != cVar.f8535j ? (char) 1 : c10);
            interfaceC1300z = null;
            c0Var = c0VarC;
        } else {
            interfaceC1300z = null;
        }
        List listM0 = M0(abstractC1339sI0, cVar.f8532g, g0C, cVar.f8541p, cVar.f8540o, zArr);
        if (listM0 == null || (sP = g0C.p(cVar.f8536k, N0.f594m)) == null) {
            return interfaceC1300z;
        }
        boolean z10 = (zArr[c10] ? 1 : 0) | (sP != cVar.f8536k ? (char) 1 : c10);
        zArr[c10] = z10;
        if (z10 == 0 && cVar.f8548w) {
            return this;
        }
        abstractC1339sI0.O0(n10, c0Var, arrayList2, arrayList, listM0, sP, cVar.f8528c, cVar.f8529d);
        abstractC1339sI0.c1(this.f8515s);
        abstractC1339sI0.Z0(this.f8516t);
        abstractC1339sI0.U0(this.f8517u);
        abstractC1339sI0.b1(this.f8518v);
        abstractC1339sI0.f1(this.f8519w);
        abstractC1339sI0.e1(this.f8498B);
        abstractC1339sI0.T0(this.f8520x);
        abstractC1339sI0.S0(this.f8521y);
        abstractC1339sI0.V0(this.f8499C);
        abstractC1339sI0.Y0(cVar.f8542q);
        abstractC1339sI0.X0(cVar.f8545t);
        abstractC1339sI0.W0(cVar.f8547v != null ? cVar.f8547v.booleanValue() : this.f8500D);
        if (!cVar.f8546u.isEmpty() || this.f8506J != null) {
            Map map = cVar.f8546u;
            Map map2 = this.f8506J;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC1339sI0.f8506J = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC1339sI0.f8506J = map;
            }
        }
        if (cVar.f8539n || Z() != null) {
            abstractC1339sI0.a1((Z() != null ? Z() : this).c(g0C));
        }
        if (cVar.f8538m && !a().e().isEmpty()) {
            if (cVar.f8526a.f()) {
                InterfaceC3487a interfaceC3487a = this.f8502F;
                if (interfaceC3487a != null) {
                    abstractC1339sI0.f8502F = interfaceC3487a;
                    return abstractC1339sI0;
                }
                abstractC1339sI0.u0(e());
                return abstractC1339sI0;
            }
            abstractC1339sI0.f8502F = new a(g0C);
        }
        return abstractC1339sI0;
    }

    public boolean N() {
        return this.f8519w;
    }

    public boolean N0() {
        return this.f8499C;
    }

    public AbstractC1339s O0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, C8.S s10, L7.E e10, AbstractC1295u abstractC1295u) {
        if (list == null) {
            G(5);
        }
        if (list2 == null) {
            G(6);
        }
        if (list3 == null) {
            G(7);
        }
        if (abstractC1295u == null) {
            G(8);
        }
        this.f8507k = AbstractC2800q.P0(list2);
        this.f8508l = AbstractC2800q.P0(list3);
        this.f8509m = s10;
        this.f8513q = e10;
        this.f8514r = abstractC1295u;
        this.f8511o = c0Var;
        this.f8512p = c0Var2;
        this.f8510n = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            m0 m0Var = (m0) list2.get(i10);
            if (m0Var.getIndex() != i10) {
                throw new IllegalStateException(m0Var + " index is " + m0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            t0 t0Var = (t0) list3.get(i11);
            if (t0Var.getIndex() != i11) {
                throw new IllegalStateException(t0Var + "index is " + t0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected c P0(G0 g02) {
        if (g02 == null) {
            G(24);
        }
        return new c(this, g02.j(), b(), k(), getVisibility(), getKind(), i(), m0(), h0(), getReturnType(), null);
    }

    public void R0(InterfaceC1276a.InterfaceC0068a interfaceC0068a, Object obj) {
        if (this.f8506J == null) {
            this.f8506J = new LinkedHashMap();
        }
        this.f8506J.put(interfaceC0068a, obj);
    }

    public void S0(boolean z10) {
        this.f8521y = z10;
    }

    public void T0(boolean z10) {
        this.f8520x = z10;
    }

    public void U0(boolean z10) {
        this.f8517u = z10;
    }

    public void V0(boolean z10) {
        this.f8499C = z10;
    }

    public void W0(boolean z10) {
        this.f8500D = z10;
    }

    @Override // L7.InterfaceC1300z
    public InterfaceC1300z Z() {
        return this.f8505I;
    }

    public void Z0(boolean z10) {
        this.f8516t = z10;
    }

    @Override // O7.AbstractC1335n, O7.AbstractC1334m, L7.InterfaceC1288m
    public InterfaceC1300z a() {
        InterfaceC1300z interfaceC1300z = this.f8503G;
        InterfaceC1300z interfaceC1300zA = interfaceC1300z == this ? this : interfaceC1300z.a();
        if (interfaceC1300zA == null) {
            G(20);
        }
        return interfaceC1300zA;
    }

    @Override // L7.InterfaceC1276a
    public c0 a0() {
        return this.f8512p;
    }

    public void b1(boolean z10) {
        this.f8518v = z10;
    }

    public void c1(boolean z10) {
        this.f8515s = z10;
    }

    public void d1(C8.S s10) {
        if (s10 == null) {
            G(11);
        }
        this.f8509m = s10;
    }

    public Collection e() {
        Q0();
        Collection collection = this.f8501E;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            G(14);
        }
        return collection;
    }

    public void e1(boolean z10) {
        this.f8498B = z10;
    }

    public void f1(boolean z10) {
        this.f8519w = z10;
    }

    public Object g0(InterfaceC1276a.InterfaceC0068a interfaceC0068a) {
        Map map = this.f8506J;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0068a);
    }

    public void g1(AbstractC1295u abstractC1295u) {
        if (abstractC1295u == null) {
            G(10);
        }
        this.f8514r = abstractC1295u;
    }

    @Override // L7.InterfaceC1277b
    public InterfaceC1277b.a getKind() {
        InterfaceC1277b.a aVar = this.f8504H;
        if (aVar == null) {
            G(21);
        }
        return aVar;
    }

    public C8.S getReturnType() {
        return this.f8509m;
    }

    @Override // L7.InterfaceC1276a
    public List getTypeParameters() {
        List list = this.f8507k;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = this.f8514r;
        if (abstractC1295u == null) {
            G(16);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1276a
    public c0 h0() {
        return this.f8511o;
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        List list = this.f8508l;
        if (list == null) {
            G(19);
        }
        return list;
    }

    public boolean isExternal() {
        return this.f8517u;
    }

    @Override // L7.InterfaceC1300z
    public boolean isInfix() {
        if (this.f8516t) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC1300z) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f8518v;
    }

    @Override // L7.InterfaceC1300z
    public boolean isOperator() {
        if (this.f8515s) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC1300z) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f8498B;
    }

    @Override // L7.D
    public L7.E k() {
        L7.E e10 = this.f8513q;
        if (e10 == null) {
            G(15);
        }
        return e10;
    }

    @Override // L7.InterfaceC1276a
    public List m0() {
        List list = this.f8510n;
        if (list == null) {
            G(13);
        }
        return list;
    }

    public InterfaceC1300z.a s() {
        c cVarP0 = P0(G0.f565b);
        if (cVarP0 == null) {
            G(23);
        }
        return cVarP0;
    }

    @Override // L7.InterfaceC1300z
    public boolean t0() {
        return this.f8522z;
    }

    public void u0(Collection collection) {
        if (collection == null) {
            G(17);
        }
        this.f8501E = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1300z) it.next()).z0()) {
                this.f8497A = true;
                return;
            }
        }
    }

    @Override // L7.InterfaceC1300z
    public boolean z0() {
        return this.f8497A;
    }

    @Override // L7.InterfaceC1300z, L7.j0
    public InterfaceC1300z c(G0 g02) {
        if (g02 == null) {
            G(22);
        }
        return g02.k() ? this : P0(g02).r(a()).h().J(true).build();
    }
}
