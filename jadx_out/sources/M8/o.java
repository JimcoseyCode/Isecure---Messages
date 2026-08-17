package m8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import m8.AbstractC2945d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class o extends AbstractC2945d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final byte[] f29700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29701i = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements AbstractC2945d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29703h;

        @Override // m8.AbstractC2945d.a
        public byte a() {
            try {
                byte[] bArr = o.this.f29700h;
                int i10 = this.f29702g;
                this.f29702g = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29702g < this.f29703h;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f29702g = 0;
            this.f29703h = o.this.size();
        }
    }

    o(byte[] bArr) {
        this.f29700h = bArr;
    }

    static int J(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // m8.AbstractC2945d
    protected int A(int i10, int i11, int i12) {
        int I9 = I() + i11;
        return x.g(i10, this.f29700h, I9, i12 + I9);
    }

    @Override // m8.AbstractC2945d
    protected int B() {
        return this.f29701i;
    }

    @Override // m8.AbstractC2945d
    public String D(String str) {
        return new String(this.f29700h, I(), size(), str);
    }

    @Override // m8.AbstractC2945d
    void G(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f29700h, I() + i10, i11);
    }

    boolean H(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i10 + i11 > oVar.size()) {
            int size2 = oVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f29700h;
        byte[] bArr2 = oVar.f29700h;
        int I9 = I() + i11;
        int I10 = I();
        int I11 = oVar.I() + i10;
        while (I10 < I9) {
            if (bArr[I10] != bArr2[I11]) {
                return false;
            }
            I10++;
            I11++;
        }
        return true;
    }

    protected int I() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public AbstractC2945d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2945d) || size() != ((AbstractC2945d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return H((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int iZ = this.f29701i;
        if (iZ == 0) {
            int size = size();
            iZ = z(size, 0, size);
            if (iZ == 0) {
                iZ = 1;
            }
            this.f29701i = iZ;
        }
        return iZ;
    }

    @Override // m8.AbstractC2945d
    public int size() {
        return this.f29700h.length;
    }

    @Override // m8.AbstractC2945d
    protected void u(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f29700h, i10, bArr, i11, i12);
    }

    @Override // m8.AbstractC2945d
    protected int v() {
        return 0;
    }

    @Override // m8.AbstractC2945d
    protected boolean w() {
        return true;
    }

    @Override // m8.AbstractC2945d
    public boolean x() {
        int I9 = I();
        return x.f(this.f29700h, I9, size() + I9);
    }

    @Override // m8.AbstractC2945d
    protected int z(int i10, int i11, int i12) {
        return J(i10, this.f29700h, I() + i11, i12);
    }
}
