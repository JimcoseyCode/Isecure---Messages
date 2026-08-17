package r;

import F.r1;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L1 {
    private static List a(r1.b bVar, r1.b bVar2) {
        ArrayList arrayList = new ArrayList();
        r1.d dVar = r1.d.f1676g;
        arrayList.add(new F.q1(F.r1.c(dVar, bVar), F.r1.c(r1.d.f1678i, bVar2)));
        arrayList.add(new F.q1(F.r1.c(dVar, bVar), F.r1.c(r1.d.f1679j, bVar2)));
        return arrayList;
    }

    public static List b(Size size, F.s1 s1Var) {
        ArrayList arrayList = new ArrayList();
        F.r1 r1VarK = F.r1.k(34, size, s1Var);
        F.q1 q1Var = new F.q1();
        q1Var.a(r1VarK);
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(r1VarK);
        q1Var2.a(r1VarK);
        arrayList.add(q1Var2);
        return arrayList;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1658n;
        arrayList.add(new F.q1(F.r1.c(dVar, bVar)));
        r1.b bVar2 = r1.b.f1655k;
        arrayList.add(new F.q1(F.r1.c(dVar, bVar2)));
        r1.b bVar3 = r1.b.f1665u;
        arrayList.addAll(a(bVar, bVar3));
        r1.b bVar4 = r1.b.f1661q;
        arrayList.addAll(a(bVar, bVar4));
        arrayList.addAll(a(bVar, r1.b.f1660p));
        arrayList.addAll(a(bVar, bVar));
        arrayList.addAll(a(bVar2, bVar3));
        arrayList.addAll(a(bVar2, bVar4));
        arrayList.addAll(a(bVar2, bVar));
        r1.b bVar5 = r1.b.f1654j;
        r1.b bVar6 = r1.b.f1664t;
        arrayList.addAll(a(bVar5, bVar6));
        arrayList.addAll(a(r1.b.f1657m, bVar6));
        return arrayList;
    }

    public static List d(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(i());
        if (i10 == 0 || i10 == 4 || i10 == 1 || i10 == 3) {
            arrayList.addAll(k());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (z10) {
            arrayList.addAll(m());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(f());
        }
        if (i10 == 3) {
            arrayList.addAll(j());
        }
        return arrayList;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.b bVar2 = r1.b.f1656l;
        q1Var3.a(F.r1.c(dVar, bVar2));
        r1.d dVar3 = r1.d.f1678i;
        q1Var3.a(F.r1.c(dVar3, bVar));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar, bVar2));
        q1Var4.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar2, bVar2));
        q1Var5.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar, bVar2));
        r1.b bVar3 = r1.b.f1662r;
        q1Var6.a(F.r1.c(dVar, bVar3));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        q1Var7.a(F.r1.c(dVar, bVar2));
        q1Var7.a(F.r1.c(dVar, bVar3));
        q1Var7.a(F.r1.c(dVar2, bVar3));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar, bVar2));
        q1Var8.a(F.r1.c(dVar, bVar3));
        q1Var8.a(F.r1.c(dVar3, bVar3));
        arrayList.add(q1Var8);
        return arrayList;
    }

    public static List f() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1656l;
        q1Var.a(F.r1.c(dVar, bVar));
        r1.b bVar2 = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar2));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(F.r1.c(dVar, bVar));
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        q1Var3.a(F.r1.c(dVar2, bVar));
        q1Var3.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var3);
        return arrayList;
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1677h;
        r1.b bVar = r1.b.f1659o;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1676g;
        q1Var2.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.d dVar3 = r1.d.f1678i;
        q1Var3.a(F.r1.c(dVar3, bVar));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        r1.b bVar2 = r1.b.f1655k;
        q1Var4.a(F.r1.c(dVar, bVar2));
        q1Var4.a(F.r1.c(dVar3, bVar));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar2, bVar2));
        q1Var5.a(F.r1.c(dVar3, bVar));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar, bVar2));
        q1Var6.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        q1Var7.a(F.r1.c(dVar, bVar2));
        q1Var7.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar2, bVar2));
        q1Var8.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var8);
        F.q1 q1Var9 = new F.q1();
        q1Var9.a(F.r1.c(dVar2, bVar2));
        q1Var9.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var9);
        return arrayList;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1656l;
        q1Var.a(F.r1.c(dVar, bVar));
        r1.b bVar2 = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar2));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(F.r1.c(dVar, bVar));
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        q1Var3.a(F.r1.c(dVar2, bVar));
        q1Var3.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar, bVar));
        q1Var4.a(F.r1.c(dVar, bVar));
        q1Var4.a(F.r1.c(r1.d.f1678i, bVar2));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        r1.b bVar3 = r1.b.f1653i;
        q1Var5.a(F.r1.c(dVar2, bVar3));
        q1Var5.a(F.r1.c(dVar, bVar));
        q1Var5.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar2, bVar3));
        q1Var6.a(F.r1.c(dVar2, bVar));
        q1Var6.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var6);
        return arrayList;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1678i;
        q1Var2.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.d dVar3 = r1.d.f1677h;
        q1Var3.a(F.r1.c(dVar3, bVar));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        r1.b bVar2 = r1.b.f1656l;
        q1Var4.a(F.r1.c(dVar, bVar2));
        q1Var4.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar3, bVar2));
        q1Var5.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar, bVar2));
        q1Var6.a(F.r1.c(dVar, bVar2));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        q1Var7.a(F.r1.c(dVar, bVar2));
        q1Var7.a(F.r1.c(dVar3, bVar2));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar, bVar2));
        q1Var8.a(F.r1.c(dVar3, bVar2));
        q1Var8.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var8);
        return arrayList;
    }

    public static List j() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1656l;
        q1Var.a(F.r1.c(dVar, bVar));
        r1.b bVar2 = r1.b.f1653i;
        q1Var.a(F.r1.c(dVar, bVar2));
        r1.d dVar2 = r1.d.f1677h;
        r1.b bVar3 = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar2, bVar3));
        r1.d dVar3 = r1.d.f1680k;
        q1Var.a(F.r1.c(dVar3, bVar3));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(F.r1.c(dVar, bVar));
        q1Var2.a(F.r1.c(dVar, bVar2));
        q1Var2.a(F.r1.c(r1.d.f1678i, bVar3));
        q1Var2.a(F.r1.c(dVar3, bVar3));
        arrayList.add(q1Var2);
        return arrayList;
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1656l;
        q1Var.a(F.r1.c(dVar, bVar));
        r1.b bVar2 = r1.b.f1662r;
        q1Var.a(F.r1.c(dVar, bVar2));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(F.r1.c(dVar, bVar));
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        q1Var3.a(F.r1.c(dVar2, bVar));
        q1Var3.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar, bVar));
        q1Var4.a(F.r1.c(dVar, bVar2));
        r1.d dVar3 = r1.d.f1678i;
        q1Var4.a(F.r1.c(dVar3, bVar2));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar, bVar));
        q1Var5.a(F.r1.c(dVar2, bVar2));
        q1Var5.a(F.r1.c(dVar3, bVar2));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar2, bVar));
        q1Var6.a(F.r1.c(dVar2, bVar));
        q1Var6.a(F.r1.c(dVar3, r1.b.f1663s));
        arrayList.add(q1Var6);
        return arrayList;
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1659o;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        q1Var3.a(F.r1.c(dVar, bVar));
        r1.d dVar3 = r1.d.f1678i;
        r1.b bVar2 = r1.b.f1663s;
        q1Var3.a(F.r1.c(dVar3, bVar2));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar2, bVar));
        q1Var4.a(F.r1.c(dVar3, bVar2));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar, bVar));
        q1Var5.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar2, bVar));
        q1Var6.a(F.r1.c(dVar2, bVar2));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        r1.b bVar3 = r1.b.f1656l;
        q1Var7.a(F.r1.c(dVar, bVar3));
        q1Var7.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar2, bVar3));
        q1Var8.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var8);
        F.q1 q1Var9 = new F.q1();
        q1Var9.a(F.r1.c(dVar, bVar3));
        q1Var9.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var9);
        F.q1 q1Var10 = new F.q1();
        q1Var10.a(F.r1.c(dVar2, bVar3));
        q1Var10.a(F.r1.c(dVar2, bVar));
        arrayList.add(q1Var10);
        return arrayList;
    }

    public static List m() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1680k;
        r1.b bVar = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1676g;
        r1.b bVar2 = r1.b.f1656l;
        q1Var2.a(F.r1.c(dVar2, bVar2));
        q1Var2.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.d dVar3 = r1.d.f1677h;
        q1Var3.a(F.r1.c(dVar3, bVar2));
        q1Var3.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar2, bVar2));
        q1Var4.a(F.r1.c(dVar2, bVar2));
        q1Var4.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar2, bVar2));
        q1Var5.a(F.r1.c(dVar3, bVar2));
        q1Var5.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar3, bVar2));
        q1Var6.a(F.r1.c(dVar3, bVar2));
        q1Var6.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        q1Var7.a(F.r1.c(dVar2, bVar2));
        r1.d dVar4 = r1.d.f1678i;
        q1Var7.a(F.r1.c(dVar4, bVar));
        q1Var7.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar3, bVar2));
        q1Var8.a(F.r1.c(dVar4, bVar));
        q1Var8.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var8);
        return arrayList;
    }

    public static List n() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1676g;
        r1.b bVar = r1.b.f1659o;
        F.p1 p1Var = F.p1.f1610m;
        q1Var.a(F.r1.d(dVar, bVar, p1Var));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar2 = r1.d.f1677h;
        q1Var2.a(F.r1.d(dVar2, bVar, p1Var));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.b bVar2 = r1.b.f1662r;
        F.p1 p1Var2 = F.p1.f1607j;
        q1Var3.a(F.r1.d(dVar, bVar2, p1Var2));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.d(dVar2, bVar2, p1Var2));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        r1.d dVar3 = r1.d.f1678i;
        r1.b bVar3 = r1.b.f1663s;
        F.p1 p1Var3 = F.p1.f1608k;
        q1Var5.a(F.r1.d(dVar3, bVar3, p1Var3));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.d(dVar2, bVar3, p1Var3));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        r1.b bVar4 = r1.b.f1656l;
        F.p1 p1Var4 = F.p1.f1606i;
        q1Var7.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var7.a(F.r1.d(dVar3, bVar3, p1Var3));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var8.a(F.r1.d(dVar2, bVar3, p1Var3));
        arrayList.add(q1Var8);
        F.q1 q1Var9 = new F.q1();
        q1Var9.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var9.a(F.r1.d(dVar, bVar2, p1Var2));
        arrayList.add(q1Var9);
        F.q1 q1Var10 = new F.q1();
        q1Var10.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var10.a(F.r1.d(dVar2, bVar2, p1Var2));
        arrayList.add(q1Var10);
        F.q1 q1Var11 = new F.q1();
        q1Var11.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var11.a(F.r1.d(dVar2, bVar4, p1Var4));
        arrayList.add(q1Var11);
        F.q1 q1Var12 = new F.q1();
        q1Var12.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var12.a(F.r1.d(dVar, bVar2, p1Var2));
        q1Var12.a(F.r1.d(dVar3, bVar2, p1Var3));
        arrayList.add(q1Var12);
        F.q1 q1Var13 = new F.q1();
        q1Var13.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var13.a(F.r1.d(dVar2, bVar2, p1Var2));
        q1Var13.a(F.r1.d(dVar3, bVar2, p1Var3));
        arrayList.add(q1Var13);
        F.q1 q1Var14 = new F.q1();
        q1Var14.a(F.r1.d(dVar, bVar4, p1Var4));
        q1Var14.a(F.r1.d(dVar2, bVar4, p1Var4));
        q1Var14.a(F.r1.d(dVar3, bVar3, p1Var3));
        arrayList.add(q1Var14);
        return arrayList;
    }

    public static List o() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1679j;
        r1.b bVar = r1.b.f1663s;
        q1Var.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        q1Var2.a(F.r1.c(r1.d.f1676g, r1.b.f1656l));
        q1Var2.a(F.r1.c(dVar, bVar));
        arrayList.add(q1Var2);
        return arrayList;
    }

    public static List p() {
        ArrayList arrayList = new ArrayList();
        F.q1 q1Var = new F.q1();
        r1.d dVar = r1.d.f1677h;
        r1.b bVar = r1.b.f1666v;
        q1Var.a(F.r1.c(dVar, bVar));
        r1.d dVar2 = r1.d.f1676g;
        r1.b bVar2 = r1.b.f1656l;
        q1Var.a(F.r1.c(dVar2, bVar2));
        r1.b bVar3 = r1.b.f1662r;
        q1Var.a(F.r1.c(dVar2, bVar3));
        arrayList.add(q1Var);
        F.q1 q1Var2 = new F.q1();
        r1.d dVar3 = r1.d.f1678i;
        q1Var2.a(F.r1.c(dVar3, bVar));
        q1Var2.a(F.r1.c(dVar2, bVar2));
        q1Var2.a(F.r1.c(dVar2, bVar3));
        arrayList.add(q1Var2);
        F.q1 q1Var3 = new F.q1();
        r1.d dVar4 = r1.d.f1680k;
        q1Var3.a(F.r1.c(dVar4, bVar));
        q1Var3.a(F.r1.c(dVar2, bVar2));
        q1Var3.a(F.r1.c(dVar2, bVar3));
        arrayList.add(q1Var3);
        F.q1 q1Var4 = new F.q1();
        q1Var4.a(F.r1.c(dVar, bVar));
        q1Var4.a(F.r1.c(dVar2, bVar2));
        r1.b bVar4 = r1.b.f1663s;
        q1Var4.a(F.r1.c(dVar3, bVar4));
        arrayList.add(q1Var4);
        F.q1 q1Var5 = new F.q1();
        q1Var5.a(F.r1.c(dVar3, bVar));
        q1Var5.a(F.r1.c(dVar2, bVar2));
        q1Var5.a(F.r1.c(dVar3, bVar4));
        arrayList.add(q1Var5);
        F.q1 q1Var6 = new F.q1();
        q1Var6.a(F.r1.c(dVar4, bVar));
        q1Var6.a(F.r1.c(dVar2, bVar2));
        q1Var6.a(F.r1.c(dVar3, bVar4));
        arrayList.add(q1Var6);
        F.q1 q1Var7 = new F.q1();
        q1Var7.a(F.r1.c(dVar, bVar));
        q1Var7.a(F.r1.c(dVar2, bVar2));
        q1Var7.a(F.r1.c(dVar, bVar4));
        arrayList.add(q1Var7);
        F.q1 q1Var8 = new F.q1();
        q1Var8.a(F.r1.c(dVar3, bVar));
        q1Var8.a(F.r1.c(dVar2, bVar2));
        q1Var8.a(F.r1.c(dVar, bVar4));
        arrayList.add(q1Var8);
        F.q1 q1Var9 = new F.q1();
        q1Var9.a(F.r1.c(dVar4, bVar));
        q1Var9.a(F.r1.c(dVar2, bVar2));
        q1Var9.a(F.r1.c(dVar, bVar4));
        arrayList.add(q1Var9);
        F.q1 q1Var10 = new F.q1();
        q1Var10.a(F.r1.c(dVar, bVar));
        q1Var10.a(F.r1.c(dVar2, bVar2));
        q1Var10.a(F.r1.c(dVar4, bVar4));
        arrayList.add(q1Var10);
        F.q1 q1Var11 = new F.q1();
        q1Var11.a(F.r1.c(dVar3, bVar));
        q1Var11.a(F.r1.c(dVar2, bVar2));
        q1Var11.a(F.r1.c(dVar4, bVar4));
        arrayList.add(q1Var11);
        F.q1 q1Var12 = new F.q1();
        q1Var12.a(F.r1.c(dVar4, bVar));
        q1Var12.a(F.r1.c(dVar2, bVar2));
        q1Var12.a(F.r1.c(dVar4, bVar4));
        arrayList.add(q1Var12);
        return arrayList;
    }
}
