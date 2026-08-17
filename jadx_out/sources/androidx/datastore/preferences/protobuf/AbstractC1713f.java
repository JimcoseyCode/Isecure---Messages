package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1713f implements Iterable, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1713f f16826h = new i(AbstractC1727u.f17042d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final InterfaceC0172f f16827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator f16828j;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16829g = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16830g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f16831h;

        a() {
            this.f16831h = AbstractC1713f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.g
        public byte a() {
            int i10 = this.f16830g;
            if (i10 >= this.f16831h) {
                throw new NoSuchElementException();
            }
            this.f16830g = i10 + 1;
            return AbstractC1713f.this.v(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16830g < this.f16831h;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1713f abstractC1713f, AbstractC1713f abstractC1713f2) {
            g gVarW = abstractC1713f.w();
            g gVarW2 = abstractC1713f2.w();
            while (gVarW.hasNext() && gVarW2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC1713f.B(gVarW.a())).compareTo(Integer.valueOf(AbstractC1713f.B(gVarW2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC1713f.size()).compareTo(Integer.valueOf(abstractC1713f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements InterfaceC0172f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.InterfaceC0172f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class e extends i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f16833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f16834m;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1713f.q(i10, i10 + i11, bArr.length);
            this.f16833l = i10;
            this.f16834m = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.i
        protected int H() {
            return this.f16833l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.i, androidx.datastore.preferences.protobuf.AbstractC1713f
        public byte o(int i10) {
            AbstractC1713f.p(i10, size());
            return this.f16835k[this.f16833l + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.i, androidx.datastore.preferences.protobuf.AbstractC1713f
        public int size() {
            return this.f16834m;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.i, androidx.datastore.preferences.protobuf.AbstractC1713f
        protected void u(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16835k, H() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.i, androidx.datastore.preferences.protobuf.AbstractC1713f
        byte v(int i10) {
            return this.f16835k[this.f16833l + i10];
        }

        Object writeReplace() {
            return AbstractC1713f.D(A());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface InterfaceC0172f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class h extends AbstractC1713f {
        private static final long serialVersionUID = 1;

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.w();
        }

        private h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i extends h {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected final byte[] f16835k;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f16835k = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        final void F(AbstractC1712e abstractC1712e) {
            abstractC1712e.a(this.f16835k, H(), size());
        }

        final boolean G(AbstractC1713f abstractC1713f, int i10, int i11) {
            if (i11 > abstractC1713f.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1713f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1713f.size());
            }
            if (!(abstractC1713f instanceof i)) {
                return abstractC1713f.z(i10, i12).equals(z(0, i11));
            }
            i iVar = (i) abstractC1713f;
            byte[] bArr = this.f16835k;
            byte[] bArr2 = iVar.f16835k;
            int iH = H() + i11;
            int iH2 = H();
            int iH3 = iVar.H() + i10;
            while (iH2 < iH) {
                if (bArr[iH2] != bArr2[iH3]) {
                    return false;
                }
                iH2++;
                iH3++;
            }
            return true;
        }

        protected int H() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1713f) || size() != ((AbstractC1713f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iY = y();
            int iY2 = iVar.y();
            if (iY == 0 || iY2 == 0 || iY == iY2) {
                return G(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        public byte o(int i10) {
            return this.f16835k[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        public int size() {
            return this.f16835k.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        protected void u(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16835k, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        byte v(int i10) {
            return this.f16835k[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        protected final int x(int i10, int i11, int i12) {
            return AbstractC1727u.g(i10, this.f16835k, H() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f
        public final AbstractC1713f z(int i10, int i11) {
            int iQ = AbstractC1713f.q(i10, i11, size());
            return iQ == 0 ? AbstractC1713f.f16826h : new e(this.f16835k, H() + i10, iQ);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class j implements InterfaceC0172f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1713f.InterfaceC0172f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f16827i = AbstractC1711d.c() ? new j(aVar) : new d(aVar);
        f16828j = new b();
    }

    AbstractC1713f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int B(byte b10) {
        return b10 & 255;
    }

    private String C() {
        if (size() <= 50) {
            return d0.a(this);
        }
        return d0.a(z(0, 47)) + "...";
    }

    static AbstractC1713f D(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC1713f E(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void p(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC1713f r(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public static AbstractC1713f s(byte[] bArr, int i10, int i11) {
        q(i10, i10 + i11, bArr.length);
        return new i(f16827i.a(bArr, i10, i11));
    }

    public static AbstractC1713f t(String str) {
        return new i(str.getBytes(AbstractC1727u.f17040b));
    }

    public final byte[] A() {
        int size = size();
        if (size == 0) {
            return AbstractC1727u.f17042d;
        }
        byte[] bArr = new byte[size];
        u(bArr, 0, 0, size);
        return bArr;
    }

    abstract void F(AbstractC1712e abstractC1712e);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iX = this.f16829g;
        if (iX == 0) {
            int size = size();
            iX = x(size, 0, size);
            if (iX == 0) {
                iX = 1;
            }
            this.f16829g = iX;
        }
        return iX;
    }

    public abstract byte o(int i10);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), C());
    }

    protected abstract void u(byte[] bArr, int i10, int i11, int i12);

    abstract byte v(int i10);

    public g w() {
        return new a();
    }

    protected abstract int x(int i10, int i11, int i12);

    protected final int y() {
        return this.f16829g;
    }

    public abstract AbstractC1713f z(int i10, int i11);
}
