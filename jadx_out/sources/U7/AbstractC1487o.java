package U7;

import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1297w;
import L7.Z;
import o8.AbstractC3027i;

/* JADX INFO: renamed from: U7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1487o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC1277b interfaceC1277b) {
        InterfaceC1297w interfaceC1297wL0;
        if (interfaceC1277b == null) {
            a(3);
        }
        if ((interfaceC1277b instanceof Z) && (interfaceC1297wL0 = ((Z) interfaceC1277b).l0()) != null && interfaceC1297wL0.getAnnotations().h(H.f11392b)) {
            return true;
        }
        return interfaceC1277b.getAnnotations().h(H.f11392b);
    }

    public static boolean c(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m == null) {
            a(1);
        }
        return AbstractC3027i.x(interfaceC1288m) && AbstractC3027i.w(interfaceC1288m.b()) && !d((InterfaceC1280e) interfaceC1288m);
    }

    public static boolean d(InterfaceC1280e interfaceC1280e) {
        if (interfaceC1280e == null) {
            a(2);
        }
        return I7.e.a(I7.d.f5056a, interfaceC1280e);
    }

    public static boolean e(Z z10) {
        if (z10 == null) {
            a(0);
        }
        if (z10.getKind() == InterfaceC1277b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(z10.b())) {
            return true;
        }
        return AbstractC3027i.x(z10.b()) && b(z10);
    }
}
