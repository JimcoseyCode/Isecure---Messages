package m0;

import j7.AbstractC2793j;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC2956a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f29541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ int[] f29542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f29543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f29544j;

    public j() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f29544j;
        if (i11 != 0 && i10 <= this.f29542h[i11 - 1]) {
            j(i10, obj);
            return;
        }
        if (this.f29541g && i11 >= this.f29542h.length) {
            k.e(this);
        }
        int i12 = this.f29544j;
        if (i12 >= this.f29542h.length) {
            int iE = AbstractC2956a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f29542h, iE);
            AbstractC2855l.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f29542h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29543i, iE);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29543i = objArrCopyOf;
        }
        this.f29542h[i12] = i10;
        this.f29543i[i12] = obj;
        this.f29544j = i12 + 1;
    }

    public void b() {
        int i10 = this.f29544j;
        Object[] objArr = this.f29543i;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f29544j = 0;
        this.f29541g = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC2855l.e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) objClone;
        jVar.f29542h = (int[]) this.f29542h.clone();
        jVar.f29543i = (Object[]) this.f29543i.clone();
        return jVar;
    }

    public boolean e(int i10) {
        return g(i10) >= 0;
    }

    public Object f(int i10) {
        return k.c(this, i10);
    }

    public int g(int i10) {
        if (this.f29541g) {
            k.e(this);
        }
        return AbstractC2956a.a(this.f29542h, this.f29544j, i10);
    }

    public int h(Object obj) {
        if (this.f29541g) {
            k.e(this);
        }
        int i10 = this.f29544j;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29543i[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f29541g) {
            k.e(this);
        }
        return this.f29542h[i10];
    }

    public void j(int i10, Object obj) {
        int iA = AbstractC2956a.a(this.f29542h, this.f29544j, i10);
        if (iA >= 0) {
            this.f29543i[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f29544j && this.f29543i[i11] == k.f29545a) {
            this.f29542h[i11] = i10;
            this.f29543i[i11] = obj;
            return;
        }
        if (this.f29541g && this.f29544j >= this.f29542h.length) {
            k.e(this);
            i11 = ~AbstractC2956a.a(this.f29542h, this.f29544j, i10);
        }
        int i12 = this.f29544j;
        if (i12 >= this.f29542h.length) {
            int iE = AbstractC2956a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f29542h, iE);
            AbstractC2855l.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f29542h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29543i, iE);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29543i = objArrCopyOf;
        }
        int i13 = this.f29544j;
        if (i13 - i11 != 0) {
            int[] iArr = this.f29542h;
            int i14 = i11 + 1;
            AbstractC2793j.g(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f29543i;
            AbstractC2793j.i(objArr, objArr, i14, i11, this.f29544j);
        }
        this.f29542h[i11] = i10;
        this.f29543i[i11] = obj;
        this.f29544j++;
    }

    public void k(int i10) {
        k.d(this, i10);
    }

    public int l() {
        if (this.f29541g) {
            k.e(this);
        }
        return this.f29544j;
    }

    public Object m(int i10) {
        if (this.f29541g) {
            k.e(this);
        }
        return this.f29543i[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f29544j * 28);
        sb.append('{');
        int i10 = this.f29544j;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(i(i11));
            sb.append('=');
            Object objM = m(i11);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "buffer.toString()");
        return string;
    }

    public j(int i10) {
        if (i10 == 0) {
            this.f29542h = AbstractC2956a.f30012a;
            this.f29543i = AbstractC2956a.f30014c;
        } else {
            int iE = AbstractC2956a.e(i10);
            this.f29542h = new int[iE];
            this.f29543i = new Object[iE];
        }
    }

    public /* synthetic */ j(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
