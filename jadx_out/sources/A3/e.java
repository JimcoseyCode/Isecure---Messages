package A3;

import com.facebook.soloader.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43b = 0;

    public e(h... hVarArr) {
        this.f42a = hVarArr;
    }

    @Override // A3.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        h[] hVarArr;
        do {
            i10 = this.f43b;
            hVarArr = this.f42a;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f43b = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
