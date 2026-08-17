package c8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1914k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final M7.h f19010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1903f f19011b;

    /* JADX INFO: renamed from: c8.k0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19012a;

        static {
            int[] iArr = new int[EnumC1913k.values().length];
            try {
                iArr[EnumC1913k.f19006h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1913k.f19007i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19012a = iArr;
        }
    }

    static {
        k8.c ENHANCED_NULLABILITY_ANNOTATION = U7.I.f11417v;
        AbstractC2855l.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f19010a = new C1903f(ENHANCED_NULLABILITY_ANNOTATION);
        k8.c ENHANCED_MUTABILITY_ANNOTATION = U7.I.f11418w;
        AbstractC2855l.f(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f19011b = new C1903f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M7.h e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new M7.o(AbstractC2800q.P0(list)) : (M7.h) AbstractC2800q.C0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1283h f(InterfaceC1283h interfaceC1283h, C1907h c1907h, EnumC1908h0 enumC1908h0) {
        K7.d dVar = K7.d.f7130a;
        if (!AbstractC1910i0.a(enumC1908h0) || !(interfaceC1283h instanceof InterfaceC1280e)) {
            return null;
        }
        if (c1907h.e() == EnumC1909i.f18999g && enumC1908h0 == EnumC1908h0.f18994g) {
            InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1283h;
            if (dVar.c(interfaceC1280e)) {
                return dVar.a(interfaceC1280e);
            }
        }
        if (c1907h.e() == EnumC1909i.f19000h && enumC1908h0 == EnumC1908h0.f18995h) {
            InterfaceC1280e interfaceC1280e2 = (InterfaceC1280e) interfaceC1283h;
            if (dVar.d(interfaceC1280e2)) {
                return dVar.b(interfaceC1280e2);
            }
        }
        return null;
    }

    public static final M7.h g() {
        return f19010a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(C1907h c1907h, EnumC1908h0 enumC1908h0) {
        if (!AbstractC1910i0.a(enumC1908h0)) {
            return null;
        }
        EnumC1913k enumC1913kF = c1907h.f();
        int i10 = enumC1913kF == null ? -1 : a.f19012a[enumC1913kF.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(C8.S s10) {
        AbstractC2855l.g(s10, "<this>");
        return AbstractC1916l0.c(D8.s.f846a, s10);
    }
}
