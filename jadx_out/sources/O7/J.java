package O7;

import C8.G0;
import L7.AbstractC1295u;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.Z;
import L7.c0;
import L7.h0;
import L7.j0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J extends AbstractC1335n implements L7.Y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final L7.E f8362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f8363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1277b.a f8365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC1295u f8366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC1300z f8367r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(L7.E e10, AbstractC1295u abstractC1295u, Z z10, M7.h hVar, k8.f fVar, boolean z11, boolean z12, boolean z13, InterfaceC1277b.a aVar, h0 h0Var) {
        super(z10.b(), hVar, fVar, h0Var);
        if (e10 == null) {
            G(0);
        }
        if (abstractC1295u == null) {
            G(1);
        }
        if (z10 == null) {
            G(2);
        }
        if (hVar == null) {
            G(3);
        }
        if (fVar == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        this.f8367r = null;
        this.f8362m = e10;
        this.f8366q = abstractC1295u;
        this.f8363n = z10;
        this.f8360k = z11;
        this.f8361l = z12;
        this.f8364o = z13;
        this.f8365p = aVar;
    }

    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getCorrespondingProperty";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1277b
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public L7.Y x(InterfaceC1288m interfaceC1288m, L7.E e10, AbstractC1295u abstractC1295u, InterfaceC1277b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // L7.InterfaceC1276a
    public boolean F() {
        return false;
    }

    protected Collection H0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (Z z11 : y0().e()) {
            j0 getter = z10 ? z11.getGetter() : z11.h();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void I0(boolean z10) {
        this.f8360k = z10;
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    public void J0(InterfaceC1300z interfaceC1300z) {
        this.f8367r = interfaceC1300z;
    }

    public void K0(AbstractC1295u abstractC1295u) {
        this.f8366q = abstractC1295u;
    }

    @Override // L7.InterfaceC1300z
    public boolean N() {
        return false;
    }

    @Override // L7.Y
    public boolean S() {
        return this.f8360k;
    }

    @Override // L7.InterfaceC1300z
    public InterfaceC1300z Z() {
        return this.f8367r;
    }

    @Override // L7.InterfaceC1276a
    public c0 a0() {
        return y0().a0();
    }

    @Override // L7.j0
    public InterfaceC1300z c(G0 g02) {
        if (g02 == null) {
            G(7);
        }
        return this;
    }

    @Override // L7.InterfaceC1276a
    public Object g0(InterfaceC1276a.InterfaceC0068a interfaceC0068a) {
        return null;
    }

    @Override // L7.InterfaceC1277b
    public InterfaceC1277b.a getKind() {
        InterfaceC1277b.a aVar = this.f8365p;
        if (aVar == null) {
            G(6);
        }
        return aVar;
    }

    @Override // L7.InterfaceC1276a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            G(9);
        }
        return list;
    }

    @Override // L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        AbstractC1295u abstractC1295u = this.f8366q;
        if (abstractC1295u == null) {
            G(11);
        }
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1276a
    public c0 h0() {
        return y0().h0();
    }

    @Override // L7.D
    public boolean isExternal() {
        return this.f8361l;
    }

    @Override // L7.InterfaceC1300z
    public boolean isInfix() {
        return false;
    }

    @Override // L7.InterfaceC1300z
    public boolean isInline() {
        return this.f8364o;
    }

    @Override // L7.InterfaceC1300z
    public boolean isOperator() {
        return false;
    }

    @Override // L7.InterfaceC1300z
    public boolean isSuspend() {
        return false;
    }

    @Override // L7.D
    public L7.E k() {
        L7.E e10 = this.f8362m;
        if (e10 == null) {
            G(10);
        }
        return e10;
    }

    @Override // L7.InterfaceC1276a
    public List m0() {
        List listM0 = y0().m0();
        if (listM0 == null) {
            G(14);
        }
        return listM0;
    }

    @Override // L7.InterfaceC1300z
    public boolean t0() {
        return false;
    }

    @Override // L7.InterfaceC1277b
    public void u0(Collection collection) {
        if (collection == null) {
            G(16);
        }
    }

    @Override // L7.Y
    public Z y0() {
        Z z10 = this.f8363n;
        if (z10 == null) {
            G(13);
        }
        return z10;
    }

    @Override // L7.InterfaceC1300z
    public boolean z0() {
        return false;
    }
}
