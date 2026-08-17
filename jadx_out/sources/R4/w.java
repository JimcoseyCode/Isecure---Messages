package r4;

import android.content.Context;
import android.util.SparseIntArray;
import o4.C3008a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f31945a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.b f31946b;

    public w(com.google.android.gms.common.b bVar) {
        AbstractC3268i.k(bVar);
        this.f31946b = bVar;
    }

    public final int a(Context context, int i10) {
        return this.f31945a.get(i10, -1);
    }

    public final int b(Context context, C3008a.f fVar) {
        AbstractC3268i.k(context);
        AbstractC3268i.k(fVar);
        int iH = 0;
        if (!fVar.j()) {
            return 0;
        }
        int iL = fVar.l();
        int iA = a(context, iL);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f31945a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f31945a.keyAt(i10);
            if (iKeyAt > iL && this.f31945a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iH == -1) {
            iH = this.f31946b.h(context, iL);
        }
        this.f31945a.put(iL, iH);
        return iH;
    }

    public final void c() {
        this.f31945a.clear();
    }
}
