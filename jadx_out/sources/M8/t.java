package m8;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import m8.AbstractC2945d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class t extends AbstractC2945d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f29705n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f29707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC2945d f29708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f29710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29711m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack f29712a;

        private b() {
            this.f29712a = new Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC2945d b(AbstractC2945d abstractC2945d, AbstractC2945d abstractC2945d2) {
            c(abstractC2945d);
            c(abstractC2945d2);
            AbstractC2945d tVar = (AbstractC2945d) this.f29712a.pop();
            while (!this.f29712a.isEmpty()) {
                tVar = new t((AbstractC2945d) this.f29712a.pop(), tVar);
            }
            return tVar;
        }

        private void c(AbstractC2945d abstractC2945d) {
            if (abstractC2945d.w()) {
                e(abstractC2945d);
                return;
            }
            if (abstractC2945d instanceof t) {
                t tVar = (t) abstractC2945d;
                c(tVar.f29707i);
                c(tVar.f29708j);
            } else {
                String strValueOf = String.valueOf(abstractC2945d.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(t.f29705n, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(AbstractC2945d abstractC2945d) {
            int iD = d(abstractC2945d.size());
            int i10 = t.f29705n[iD + 1];
            if (this.f29712a.isEmpty() || ((AbstractC2945d) this.f29712a.peek()).size() >= i10) {
                this.f29712a.push(abstractC2945d);
                return;
            }
            int i11 = t.f29705n[iD];
            AbstractC2945d tVar = (AbstractC2945d) this.f29712a.pop();
            while (true) {
                if (this.f29712a.isEmpty() || ((AbstractC2945d) this.f29712a.peek()).size() >= i11) {
                    break;
                } else {
                    tVar = new t((AbstractC2945d) this.f29712a.pop(), tVar);
                }
            }
            t tVar2 = new t(tVar, abstractC2945d);
            while (!this.f29712a.isEmpty()) {
                if (((AbstractC2945d) this.f29712a.peek()).size() >= t.f29705n[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new t((AbstractC2945d) this.f29712a.pop(), tVar2);
                }
            }
            this.f29712a.push(tVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Stack f29713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f29714h;

        private o b(AbstractC2945d abstractC2945d) {
            while (abstractC2945d instanceof t) {
                t tVar = (t) abstractC2945d;
                this.f29713g.push(tVar);
                abstractC2945d = tVar.f29707i;
            }
            return (o) abstractC2945d;
        }

        private o c() {
            while (!this.f29713g.isEmpty()) {
                o oVarB = b(((t) this.f29713g.pop()).f29708j);
                if (!oVarB.isEmpty()) {
                    return oVarB;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o next() {
            o oVar = this.f29714h;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f29714h = c();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29714h != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(AbstractC2945d abstractC2945d) {
            this.f29713g = new Stack();
            this.f29714h = b(abstractC2945d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements AbstractC2945d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f29715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AbstractC2945d.a f29716h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f29717i;

        @Override // m8.AbstractC2945d.a
        public byte a() {
            if (!this.f29716h.hasNext()) {
                this.f29716h = this.f29715g.next().iterator();
            }
            this.f29717i--;
            return this.f29716h.a();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29717i > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(t.this);
            this.f29715g = cVar;
            this.f29716h = cVar.next().iterator();
            this.f29717i = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.valueOf(ViewDefaults.NUMBER_OF_LINES));
        f29705n = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f29705n;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    static AbstractC2945d K(AbstractC2945d abstractC2945d, AbstractC2945d abstractC2945d2) {
        t tVar = abstractC2945d instanceof t ? (t) abstractC2945d : null;
        if (abstractC2945d2.size() == 0) {
            return abstractC2945d;
        }
        if (abstractC2945d.size() == 0) {
            return abstractC2945d2;
        }
        int size = abstractC2945d.size() + abstractC2945d2.size();
        if (size < 128) {
            return L(abstractC2945d, abstractC2945d2);
        }
        if (tVar != null && tVar.f29708j.size() + abstractC2945d2.size() < 128) {
            return new t(tVar.f29707i, L(tVar.f29708j, abstractC2945d2));
        }
        if (tVar == null || tVar.f29707i.v() <= tVar.f29708j.v() || tVar.v() <= abstractC2945d2.v()) {
            return size >= f29705n[Math.max(abstractC2945d.v(), abstractC2945d2.v()) + 1] ? new t(abstractC2945d, abstractC2945d2) : new b().b(abstractC2945d, abstractC2945d2);
        }
        return new t(tVar.f29707i, new t(tVar.f29708j, abstractC2945d2));
    }

    private static o L(AbstractC2945d abstractC2945d, AbstractC2945d abstractC2945d2) {
        int size = abstractC2945d.size();
        int size2 = abstractC2945d2.size();
        byte[] bArr = new byte[size + size2];
        abstractC2945d.t(bArr, 0, 0, size);
        abstractC2945d2.t(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean M(AbstractC2945d abstractC2945d) {
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(abstractC2945d);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.H(oVar2, i11, iMin) : oVar2.H(oVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f29706h;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // m8.AbstractC2945d
    protected int A(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f29709k;
        if (i13 <= i14) {
            return this.f29707i.A(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f29708j.A(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f29708j.A(this.f29707i.A(i10, i11, i15), 0, i12 - i15);
    }

    @Override // m8.AbstractC2945d
    protected int B() {
        return this.f29711m;
    }

    @Override // m8.AbstractC2945d
    public String D(String str) {
        return new String(C(), str);
    }

    @Override // m8.AbstractC2945d
    void G(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f29709k;
        if (i12 <= i13) {
            this.f29707i.G(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f29708j.G(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f29707i.G(outputStream, i10, i14);
            this.f29708j.G(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC2945d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iB;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2945d)) {
            return false;
        }
        AbstractC2945d abstractC2945d = (AbstractC2945d) obj;
        if (this.f29706h != abstractC2945d.size()) {
            return false;
        }
        if (this.f29706h == 0) {
            return true;
        }
        if (this.f29711m == 0 || (iB = abstractC2945d.B()) == 0 || this.f29711m == iB) {
            return M(abstractC2945d);
        }
        return false;
    }

    public int hashCode() {
        int iZ = this.f29711m;
        if (iZ == 0) {
            int i10 = this.f29706h;
            iZ = z(i10, 0, i10);
            if (iZ == 0) {
                iZ = 1;
            }
            this.f29711m = iZ;
        }
        return iZ;
    }

    @Override // m8.AbstractC2945d
    public int size() {
        return this.f29706h;
    }

    @Override // m8.AbstractC2945d
    protected void u(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f29709k;
        if (i13 <= i14) {
            this.f29707i.u(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f29708j.u(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f29707i.u(bArr, i10, i11, i15);
            this.f29708j.u(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // m8.AbstractC2945d
    protected int v() {
        return this.f29710l;
    }

    @Override // m8.AbstractC2945d
    protected boolean w() {
        return this.f29706h >= f29705n[this.f29710l];
    }

    @Override // m8.AbstractC2945d
    public boolean x() {
        int iA = this.f29707i.A(0, 0, this.f29709k);
        AbstractC2945d abstractC2945d = this.f29708j;
        return abstractC2945d.A(iA, 0, abstractC2945d.size()) == 0;
    }

    @Override // m8.AbstractC2945d
    protected int z(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f29709k;
        if (i13 <= i14) {
            return this.f29707i.z(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f29708j.z(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f29708j.z(this.f29707i.z(i10, i11, i15), 0, i12 - i15);
    }

    private t(AbstractC2945d abstractC2945d, AbstractC2945d abstractC2945d2) {
        this.f29711m = 0;
        this.f29707i = abstractC2945d;
        this.f29708j = abstractC2945d2;
        int size = abstractC2945d.size();
        this.f29709k = size;
        this.f29706h = size + abstractC2945d2.size();
        this.f29710l = Math.max(abstractC2945d.v(), abstractC2945d2.v()) + 1;
    }
}
