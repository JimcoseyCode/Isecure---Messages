package m8;

import java.util.NoSuchElementException;
import m8.AbstractC2945d;

/* JADX INFO: renamed from: m8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2944c extends o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f29634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29635k;

    /* JADX INFO: renamed from: m8.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements AbstractC2945d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29637h;

        @Override // m8.AbstractC2945d.a
        public byte a() {
            int i10 = this.f29636g;
            if (i10 >= this.f29637h) {
                throw new NoSuchElementException();
            }
            byte[] bArr = C2944c.this.f29700h;
            this.f29636g = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29636g < this.f29637h;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int I9 = C2944c.this.I();
            this.f29636g = I9;
            this.f29637h = I9 + C2944c.this.size();
        }
    }

    C2944c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f29634j = i10;
            this.f29635k = i11;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i10);
        sb3.append("+");
        sb3.append(i11);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // m8.o
    protected int I() {
        return this.f29634j;
    }

    @Override // m8.o, java.lang.Iterable
    /* JADX INFO: renamed from: K */
    public AbstractC2945d.a iterator() {
        return new b();
    }

    @Override // m8.o, m8.AbstractC2945d
    public int size() {
        return this.f29635k;
    }

    @Override // m8.o, m8.AbstractC2945d
    protected void u(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f29700h, I() + i10, bArr, i11, i12);
    }
}
