package W8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12164b = AtomicIntegerFieldUpdater.newUpdater(N.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O[] f12165a;

    private final O[] g() {
        O[] oArr = this.f12165a;
        if (oArr == null) {
            O[] oArr2 = new O[4];
            this.f12165a = oArr2;
            return oArr2;
        }
        if (c() < oArr.length) {
            return oArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(oArr, c() * 2);
        AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
        O[] oArr3 = (O[]) objArrCopyOf;
        this.f12165a = oArr3;
        return oArr3;
    }

    private final void k(int i10) {
        f12164b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            O[] oArr = this.f12165a;
            AbstractC2855l.d(oArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                O o10 = oArr[i13];
                AbstractC2855l.d(o10);
                O o11 = oArr[i12];
                AbstractC2855l.d(o11);
                if (((Comparable) o10).compareTo(o11) >= 0) {
                    i13 = i12;
                }
            }
            O o12 = oArr[i10];
            AbstractC2855l.d(o12);
            O o13 = oArr[i13];
            AbstractC2855l.d(o13);
            if (((Comparable) o12).compareTo(o13) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    private final void m(int i10) {
        while (i10 > 0) {
            O[] oArr = this.f12165a;
            AbstractC2855l.d(oArr);
            int i11 = (i10 - 1) / 2;
            O o10 = oArr[i11];
            AbstractC2855l.d(o10);
            O o11 = oArr[i10];
            AbstractC2855l.d(o11);
            if (((Comparable) o10).compareTo(o11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        O[] oArr = this.f12165a;
        AbstractC2855l.d(oArr);
        O o10 = oArr[i11];
        AbstractC2855l.d(o10);
        O o11 = oArr[i10];
        AbstractC2855l.d(o11);
        oArr[i10] = o10;
        oArr[i11] = o11;
        o10.setIndex(i10);
        o11.setIndex(i11);
    }

    public final void a(O o10) {
        o10.h(this);
        O[] oArrG = g();
        int iC = c();
        k(iC + 1);
        oArrG[iC] = o10;
        o10.setIndex(iC);
        m(iC);
    }

    public final O b() {
        O[] oArr = this.f12165a;
        if (oArr != null) {
            return oArr[0];
        }
        return null;
    }

    public final int c() {
        return f12164b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final O f() {
        O oB;
        synchronized (this) {
            oB = b();
        }
        return oB;
    }

    public final boolean h(O o10) {
        boolean z10;
        synchronized (this) {
            if (o10.k() == null) {
                z10 = false;
            } else {
                i(o10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final O i(int i10) {
        O[] oArr = this.f12165a;
        AbstractC2855l.d(oArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                O o10 = oArr[i10];
                AbstractC2855l.d(o10);
                O o11 = oArr[i11];
                AbstractC2855l.d(o11);
                if (((Comparable) o10).compareTo(o11) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            }
        }
        O o12 = oArr[c()];
        AbstractC2855l.d(o12);
        o12.h(null);
        o12.setIndex(-1);
        oArr[c()] = null;
        return o12;
    }

    public final O j() {
        O oI;
        synchronized (this) {
            oI = c() > 0 ? i(0) : null;
        }
        return oI;
    }
}
