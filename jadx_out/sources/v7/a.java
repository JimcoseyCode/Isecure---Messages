package V7;

import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.t0;
import com.facebook.react.views.text.TextAttributeProps;
import i7.C2735B;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import o8.AbstractC3031m;
import o8.C3033o;
import y8.InterfaceC3660w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: V7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class C0123a extends AbstractC3031m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3660w f11805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f11806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11807c;

        /* JADX INFO: renamed from: V7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0124a implements Function1 {
            C0124a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2735B invoke(InterfaceC1277b interfaceC1277b) {
                if (interfaceC1277b == null) {
                    a(0);
                }
                C0123a.this.f11805a.a(interfaceC1277b);
                return C2735B.f28704a;
            }
        }

        C0123a(InterfaceC3660w interfaceC3660w, Set set, boolean z10) {
            this.f11805a = interfaceC3660w;
            this.f11806b = set;
            this.f11807c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o8.AbstractC3032n
        public void a(InterfaceC1277b interfaceC1277b) {
            if (interfaceC1277b == null) {
                f(0);
            }
            C3033o.K(interfaceC1277b, new C0124a());
            this.f11806b.add(interfaceC1277b);
        }

        @Override // o8.AbstractC3032n
        public void d(InterfaceC1277b interfaceC1277b, Collection collection) {
            if (interfaceC1277b == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f11807c || interfaceC1277b.getKind() == InterfaceC1277b.a.FAKE_OVERRIDE) {
                super.d(interfaceC1277b, collection);
            }
        }

        @Override // o8.AbstractC3031m
        public void e(InterfaceC1277b interfaceC1277b, InterfaceC1277b interfaceC1277b2) {
            if (interfaceC1277b == null) {
                f(1);
            }
            if (interfaceC1277b2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static t0 b(k8.f fVar, InterfaceC1280e interfaceC1280e) {
        if (fVar == null) {
            a(19);
        }
        if (interfaceC1280e == null) {
            a(20);
        }
        Collection collectionF = interfaceC1280e.f();
        if (collectionF.size() != 1) {
            return null;
        }
        for (t0 t0Var : ((InterfaceC1279d) collectionF.iterator().next()).i()) {
            if (t0Var.getName().equals(fVar)) {
                return t0Var;
            }
        }
        return null;
    }

    private static Collection c(k8.f fVar, Collection collection, Collection collection2, InterfaceC1280e interfaceC1280e, InterfaceC3660w interfaceC3660w, C3033o c3033o, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC1280e == null) {
            a(15);
        }
        if (interfaceC3660w == null) {
            a(16);
        }
        if (c3033o == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c3033o.v(fVar, collection, collection2, interfaceC1280e, new C0123a(interfaceC3660w, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static Collection d(k8.f fVar, Collection collection, Collection collection2, InterfaceC1280e interfaceC1280e, InterfaceC3660w interfaceC3660w, C3033o c3033o) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC1280e == null) {
            a(3);
        }
        if (interfaceC3660w == null) {
            a(4);
        }
        if (c3033o == null) {
            a(5);
        }
        return c(fVar, collection, collection2, interfaceC1280e, interfaceC3660w, c3033o, false);
    }

    public static Collection e(k8.f fVar, Collection collection, Collection collection2, InterfaceC1280e interfaceC1280e, InterfaceC3660w interfaceC3660w, C3033o c3033o) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC1280e == null) {
            a(9);
        }
        if (interfaceC3660w == null) {
            a(10);
        }
        if (c3033o == null) {
            a(11);
        }
        return c(fVar, collection, collection2, interfaceC1280e, interfaceC3660w, c3033o, true);
    }
}
