package O7;

import C8.AbstractC0407d0;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1290o;
import L7.Z;
import L7.b0;
import L7.h0;
import L7.t0;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class M extends J implements b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t0 f8403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b0 f8404t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Z z10, M7.h hVar, L7.E e10, AbstractC1295u abstractC1295u, boolean z11, boolean z12, boolean z13, InterfaceC1277b.a aVar, b0 b0Var, h0 h0Var) {
        super(e10, abstractC1295u, z10, hVar, k8.f.t("<set-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
        if (z10 == null) {
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
        if (aVar == null) {
            G(4);
        }
        if (h0Var == null) {
            G(5);
        }
        this.f8404t = b0Var != null ? b0Var : this;
    }

    private static /* synthetic */ void G(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static V L0(b0 b0Var, C8.S s10, M7.h hVar) {
        if (b0Var == null) {
            G(7);
        }
        if (s10 == null) {
            G(8);
        }
        if (hVar == null) {
            G(9);
        }
        return new V(b0Var, null, 0, hVar, k8.h.f29234o, s10, false, false, false, null, h0.f7335a);
    }

    @Override // L7.InterfaceC1288m
    public Object E0(InterfaceC1290o interfaceC1290o, Object obj) {
        return interfaceC1290o.m(this, obj);
    }

    @Override // O7.AbstractC1335n
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public b0 a() {
        b0 b0Var = this.f8404t;
        if (b0Var == null) {
            G(13);
        }
        return b0Var;
    }

    public void N0(t0 t0Var) {
        if (t0Var == null) {
            G(6);
        }
        this.f8403s = t0Var;
    }

    @Override // L7.InterfaceC1300z, L7.InterfaceC1277b, L7.InterfaceC1276a
    public Collection e() {
        Collection collectionH0 = super.H0(false);
        if (collectionH0 == null) {
            G(10);
        }
        return collectionH0;
    }

    @Override // L7.InterfaceC1276a
    public C8.S getReturnType() {
        AbstractC0407d0 abstractC0407d0Z = AbstractC3340e.m(this).Z();
        if (abstractC0407d0Z == null) {
            G(12);
        }
        return abstractC0407d0Z;
    }

    @Override // L7.InterfaceC1276a
    public List i() {
        t0 t0Var = this.f8403s;
        if (t0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(t0Var);
        if (listSingletonList == null) {
            G(11);
        }
        return listSingletonList;
    }
}
