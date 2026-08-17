package m0;

import j7.AbstractC2793j;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC2956a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f29524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long[] f29525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f29526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f29527j;

    public f() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.f29527j;
        Object[] objArr = this.f29526i;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f29527j = 0;
        this.f29524g = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC2855l.e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        f fVar = (f) objClone;
        fVar.f29525h = (long[]) this.f29525h.clone();
        fVar.f29526i = (Object[]) this.f29526i.clone();
        return fVar;
    }

    public Object c(long j10) {
        int iB = AbstractC2956a.b(this.f29525h, this.f29527j, j10);
        if (iB < 0 || this.f29526i[iB] == g.f29528a) {
            return null;
        }
        return this.f29526i[iB];
    }

    public int e(long j10) {
        if (this.f29524g) {
            int i10 = this.f29527j;
            long[] jArr = this.f29525h;
            Object[] objArr = this.f29526i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != g.f29528a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f29524g = false;
            this.f29527j = i11;
        }
        return AbstractC2956a.b(this.f29525h, this.f29527j, j10);
    }

    public long f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f29527j)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f29524g) {
            long[] jArr = this.f29525h;
            Object[] objArr = this.f29526i;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != g.f29528a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f29524g = false;
            this.f29527j = i12;
        }
        return this.f29525h[i10];
    }

    public void g(long j10, Object obj) {
        int iB = AbstractC2956a.b(this.f29525h, this.f29527j, j10);
        if (iB >= 0) {
            this.f29526i[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f29527j && this.f29526i[i10] == g.f29528a) {
            this.f29525h[i10] = j10;
            this.f29526i[i10] = obj;
            return;
        }
        if (this.f29524g) {
            int i11 = this.f29527j;
            long[] jArr = this.f29525h;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f29526i;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != g.f29528a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f29524g = false;
                this.f29527j = i12;
                i10 = ~AbstractC2956a.b(this.f29525h, i12, j10);
            }
        }
        int i14 = this.f29527j;
        if (i14 >= this.f29525h.length) {
            int iF = AbstractC2956a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f29525h, iF);
            AbstractC2855l.f(jArrCopyOf, "copyOf(this, newSize)");
            this.f29525h = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29526i, iF);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29526i = objArrCopyOf;
        }
        int i15 = this.f29527j;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f29525h;
            int i16 = i10 + 1;
            AbstractC2793j.h(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f29526i;
            AbstractC2793j.i(objArr2, objArr2, i16, i10, this.f29527j);
        }
        this.f29525h[i10] = j10;
        this.f29526i[i10] = obj;
        this.f29527j++;
    }

    public void h(long j10) {
        int iB = AbstractC2956a.b(this.f29525h, this.f29527j, j10);
        if (iB < 0 || this.f29526i[iB] == g.f29528a) {
            return;
        }
        this.f29526i[iB] = g.f29528a;
        this.f29524g = true;
    }

    public void i(int i10) {
        if (this.f29526i[i10] != g.f29528a) {
            this.f29526i[i10] = g.f29528a;
            this.f29524g = true;
        }
    }

    public int j() {
        if (this.f29524g) {
            int i10 = this.f29527j;
            long[] jArr = this.f29525h;
            Object[] objArr = this.f29526i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != g.f29528a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f29524g = false;
            this.f29527j = i11;
        }
        return this.f29527j;
    }

    public Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f29527j)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f29524g) {
            long[] jArr = this.f29525h;
            Object[] objArr = this.f29526i;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != g.f29528a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f29524g = false;
            this.f29527j = i12;
        }
        return this.f29526i[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f29527j * 28);
        sb.append('{');
        int i10 = this.f29527j;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(f(i11));
            sb.append('=');
            Object objK = k(i11);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public f(int i10) {
        if (i10 == 0) {
            this.f29525h = AbstractC2956a.f30013b;
            this.f29526i = AbstractC2956a.f30014c;
        } else {
            int iF = AbstractC2956a.f(i10);
            this.f29525h = new long[iF];
            this.f29526i = new Object[iF];
        }
    }

    public /* synthetic */ f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
