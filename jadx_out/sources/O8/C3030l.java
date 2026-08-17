package o8;

import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.Z;
import L7.l0;
import java.util.Comparator;

/* JADX INFO: renamed from: o8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3030l implements Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3030l f30531g = new C3030l();

    private C3030l() {
    }

    private static Integer b(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        int iC = c(interfaceC1288m2) - c(interfaceC1288m);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (AbstractC3027i.B(interfaceC1288m) && AbstractC3027i.B(interfaceC1288m2)) {
            return 0;
        }
        int iCompareTo = interfaceC1288m.getName().compareTo(interfaceC1288m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(InterfaceC1288m interfaceC1288m) {
        if (AbstractC3027i.B(interfaceC1288m)) {
            return 8;
        }
        if (interfaceC1288m instanceof InterfaceC1287l) {
            return 7;
        }
        if (interfaceC1288m instanceof Z) {
            return ((Z) interfaceC1288m).h0() == null ? 6 : 5;
        }
        if (interfaceC1288m instanceof InterfaceC1300z) {
            return ((InterfaceC1300z) interfaceC1288m).h0() == null ? 4 : 3;
        }
        if (interfaceC1288m instanceof InterfaceC1280e) {
            return 2;
        }
        return interfaceC1288m instanceof l0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        Integer numB = b(interfaceC1288m, interfaceC1288m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
