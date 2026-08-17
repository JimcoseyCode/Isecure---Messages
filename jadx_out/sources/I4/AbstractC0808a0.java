package I4;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: I4.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0808a0 extends AbstractC0819b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f4691a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4692b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f4693c;

    AbstractC0808a0(int i10) {
    }

    private final void d(int i10) {
        Object[] objArr = this.f4691a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f4693c) {
                this.f4691a = (Object[]) objArr.clone();
                this.f4693c = false;
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
        this.f4691a = Arrays.copyOf(objArr, i11);
        this.f4693c = false;
    }

    public final AbstractC0808a0 b(Object obj) {
        obj.getClass();
        d(this.f4692b + 1);
        Object[] objArr = this.f4691a;
        int i10 = this.f4692b;
        this.f4692b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final AbstractC0819b0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f4692b + collection.size());
            if (collection instanceof AbstractC0830c0) {
                this.f4692b = ((AbstractC0830c0) collection).d(this.f4691a, this.f4692b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
