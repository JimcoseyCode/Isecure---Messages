package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import F.q1;
import F.r1;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q1 f15105a = g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q1 f15106b = h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f15107c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f15108d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));

    private static q1 g() {
        q1 q1Var = new q1();
        r1.d dVar = r1.d.f1677h;
        q1Var.a(r1.c(dVar, r1.b.f1653i));
        q1Var.a(r1.c(r1.d.f1676g, r1.b.f1656l));
        q1Var.a(r1.c(dVar, r1.b.f1663s));
        return q1Var;
    }

    private static q1 h() {
        q1 q1Var = new q1();
        r1.d dVar = r1.d.f1676g;
        q1Var.a(r1.c(dVar, r1.b.f1656l));
        q1Var.a(r1.c(dVar, r1.b.f1653i));
        q1Var.a(r1.c(r1.d.f1677h, r1.b.f1663s));
        return q1Var;
    }

    private List j(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f15105a);
        }
        return arrayList;
    }

    private static boolean k() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean l() {
        return k() || m() || n();
    }

    private static boolean m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f15107c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean n() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f15108d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public List i(String str) {
        return k() ? j(str) : (m() || n()) ? Collections.singletonList(f15106b) : Collections.EMPTY_LIST;
    }
}
