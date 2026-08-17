package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f18176a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    h(a aVar) {
        this.f18176a = aVar;
    }

    private int a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f18048a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f18051d;
        int i13 = bVar2.f18049b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f18049b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f18049b = i15 + bVar2.f18051d;
        }
        int i16 = bVar2.f18049b;
        if (i16 <= i12) {
            bVar.f18051d = i12 + bVar2.f18051d;
        }
        bVar2.f18049b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List list, int i10, int i11) {
        a.b bVar = (a.b) list.get(i10);
        a.b bVar2 = (a.b) list.get(i11);
        int i12 = bVar2.f18048a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            f(list, i10, bVar, i11, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        boolean z10;
        int i12 = bVar.f18049b;
        int i13 = bVar.f18051d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f18049b == i12 && bVar2.f18051d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f18049b == i13 + 1 && bVar2.f18051d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f18049b;
        if (i13 < i14) {
            bVar2.f18049b = i14 - 1;
        } else {
            int i15 = bVar2.f18051d;
            if (i13 < i14 + i15) {
                bVar2.f18051d = i15 - 1;
                bVar.f18048a = 2;
                bVar.f18051d = 1;
                if (bVar2.f18051d == 0) {
                    list.remove(i11);
                    this.f18176a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f18049b;
        int i17 = bVar2.f18049b;
        a.b bVarB = null;
        if (i16 <= i17) {
            bVar2.f18049b = i17 + 1;
        } else {
            int i18 = bVar2.f18051d;
            if (i16 < i17 + i18) {
                bVarB = this.f18176a.b(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f18051d = bVar.f18049b - bVar2.f18049b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f18176a.a(bVar);
            return;
        }
        if (z10) {
            if (bVarB != null) {
                int i19 = bVar.f18049b;
                if (i19 > bVarB.f18049b) {
                    bVar.f18049b = i19 - bVarB.f18051d;
                }
                int i20 = bVar.f18051d;
                if (i20 > bVarB.f18049b) {
                    bVar.f18051d = i20 - bVarB.f18051d;
                }
            }
            int i21 = bVar.f18049b;
            if (i21 > bVar2.f18049b) {
                bVar.f18049b = i21 - bVar2.f18051d;
            }
            int i22 = bVar.f18051d;
            if (i22 > bVar2.f18049b) {
                bVar.f18051d = i22 - bVar2.f18051d;
            }
        } else {
            if (bVarB != null) {
                int i23 = bVar.f18049b;
                if (i23 >= bVarB.f18049b) {
                    bVar.f18049b = i23 - bVarB.f18051d;
                }
                int i24 = bVar.f18051d;
                if (i24 >= bVarB.f18049b) {
                    bVar.f18051d = i24 - bVarB.f18051d;
                }
            }
            int i25 = bVar.f18049b;
            if (i25 >= bVar2.f18049b) {
                bVar.f18049b = i25 - bVar2.f18051d;
            }
            int i26 = bVar.f18051d;
            if (i26 >= bVar2.f18049b) {
                bVar.f18051d = i26 - bVar2.f18051d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f18049b != bVar.f18051d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarB != null) {
            list.add(i10, bVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void f(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        a.b bVarB;
        int i12;
        int i13;
        int i14 = bVar.f18051d;
        int i15 = bVar2.f18049b;
        a.b bVarB2 = null;
        if (i14 >= i15) {
            int i16 = bVar2.f18051d;
            if (i14 < i15 + i16) {
                bVar2.f18051d = i16 - 1;
                bVarB = this.f18176a.b(4, bVar.f18049b, 1, bVar2.f18050c);
            }
            i12 = bVar.f18049b;
            i13 = bVar2.f18049b;
            if (i12 > i13) {
                bVar2.f18049b = i13 + 1;
            } else {
                int i17 = bVar2.f18051d;
                if (i12 < i13 + i17) {
                    int i18 = (i13 + i17) - i12;
                    bVarB2 = this.f18176a.b(4, i12 + 1, i18, bVar2.f18050c);
                    bVar2.f18051d -= i18;
                }
            }
            list.set(i11, bVar);
            if (bVar2.f18051d <= 0) {
                list.set(i10, bVar2);
            } else {
                list.remove(i10);
                this.f18176a.a(bVar2);
            }
            if (bVarB != null) {
                list.add(i10, bVarB);
            }
            if (bVarB2 == null) {
                list.add(i10, bVarB2);
                return;
            }
            return;
        }
        bVar2.f18049b = i15 - 1;
        bVarB = null;
        i12 = bVar.f18049b;
        i13 = bVar2.f18049b;
        if (i12 > i13) {
        }
        list.set(i11, bVar);
        if (bVar2.f18051d <= 0) {
        }
        if (bVarB != null) {
        }
        if (bVarB2 == null) {
        }
    }
}
