package G4;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;

/* JADX INFO: renamed from: G4.n5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683n5 extends K3 {
    public C0683n5() {
        super(4);
    }

    public final C0683n5 a(Object obj) {
        obj.getClass();
        int i10 = this.f2357b;
        int i11 = i10 + 1;
        Object[] objArr = this.f2356a;
        int length = objArr.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = ViewDefaults.NUMBER_OF_LINES;
            }
            this.f2356a = Arrays.copyOf(objArr, i12);
            this.f2358c = false;
        } else if (this.f2358c) {
            this.f2356a = (Object[]) objArr.clone();
            this.f2358c = false;
        }
        Object[] objArr2 = this.f2356a;
        int i13 = this.f2357b;
        this.f2357b = i13 + 1;
        objArr2[i13] = obj;
        return this;
    }

    public final C6 b() {
        this.f2358c = true;
        return C6.s(this.f2356a, this.f2357b);
    }
}
