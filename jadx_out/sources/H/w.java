package H;

import F.m1;
import java.util.ArrayList;
import y.C3565J;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static C3565J a(m1 m1Var, C3565J c3565j) {
        boolean z10;
        if (m1Var == null) {
            return c3565j;
        }
        C3565J.a aVar = new C3565J.a(c3565j);
        boolean z11 = true;
        if (c3565j.c().isEmpty() || b(m1Var, 1, 2)) {
            z10 = false;
        } else {
            aVar.c(1);
            z10 = true;
        }
        if (!c3565j.b().isEmpty() && !b(m1Var, 3)) {
            aVar.c(2);
            z10 = true;
        }
        if (c3565j.d().isEmpty() || b(m1Var, 4)) {
            z11 = z10;
        } else {
            aVar.c(4);
        }
        if (!z11) {
            return c3565j;
        }
        C3565J c3565jB = aVar.b();
        if (c3565jB.c().isEmpty() && c3565jB.b().isEmpty() && c3565jB.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(m1 m1Var, int... iArr) {
        if (m1Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return m1Var.a().containsAll(arrayList);
    }
}
