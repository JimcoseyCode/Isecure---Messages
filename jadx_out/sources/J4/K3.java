package J4;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class K3 extends AbstractC1174l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f5778a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5779b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f5780c;

    K3(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f5778a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f5780c) {
                this.f5778a = (Object[]) objArr.clone();
                this.f5780c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = ViewDefaults.NUMBER_OF_LINES;
        }
        this.f5778a = Arrays.copyOf(objArr, i11);
        this.f5780c = false;
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f5779b + 1);
        Object[] objArr = this.f5778a;
        int i10 = this.f5779b;
        this.f5779b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
