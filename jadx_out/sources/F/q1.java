package F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1639a;

    public q1() {
        this.f1639a = new ArrayList();
    }

    private static void b(List list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    private List c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean a(r1 r1Var) {
        return this.f1639a.add(r1Var);
    }

    public List d(List list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f1639a.size()) {
            return null;
        }
        List listC = c(this.f1639a.size());
        r1[] r1VarArr = new r1[list.size()];
        Iterator it = listC.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean zJ = true;
            while (i10 < this.f1639a.size()) {
                if (iArr[i10] < list.size()) {
                    zJ &= ((r1) this.f1639a.get(i10)).j((r1) list.get(iArr[i10]));
                    if (!zJ) {
                        break;
                    }
                    r1VarArr[iArr[i10]] = (r1) this.f1639a.get(i10);
                }
                i10++;
            }
            if (zJ) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(r1VarArr);
        }
        return null;
    }

    public q1(r1... r1VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f1639a = arrayList;
        Collections.addAll(arrayList, r1VarArr);
    }
}
