package m8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: m8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2945d implements Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2945d f29639g = new o(new byte[0]);

    /* JADX INFO: renamed from: m8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a extends Iterator {
        byte a();
    }

    AbstractC2945d() {
    }

    private static AbstractC2945d d(Iterator it, int i10) {
        if (i10 == 1) {
            return (AbstractC2945d) it.next();
        }
        int i11 = i10 >>> 1;
        return d(it, i11).o(d(it, i10 - i11));
    }

    public static AbstractC2945d p(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC2945d) it.next());
            }
        }
        return arrayList.isEmpty() ? f29639g : d(arrayList.iterator(), arrayList.size());
    }

    public static AbstractC2945d q(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static AbstractC2945d r(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static AbstractC2945d s(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b y() {
        return new b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }

    protected abstract int A(int i10, int i11, int i12);

    protected abstract int B();

    public byte[] C() {
        int size = size();
        if (size == 0) {
            return AbstractC2951j.f29694a;
        }
        byte[] bArr = new byte[size];
        u(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String D(String str);

    public String E() {
        try {
            return D("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void F(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                G(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    abstract void G(OutputStream outputStream, int i10, int i11);

    public boolean isEmpty() {
        return size() == 0;
    }

    public AbstractC2945d o(AbstractC2945d abstractC2945d) {
        int size = size();
        int size2 = abstractC2945d.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.K(this, abstractC2945d);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int size();

    public void t(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                u(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract void u(byte[] bArr, int i10, int i11, int i12);

    protected abstract int v();

    protected abstract boolean w();

    public abstract boolean x();

    protected abstract int z(int i10, int i11, int i12);

    /* JADX INFO: renamed from: m8.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final byte[] f29640l = new byte[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f29641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ArrayList f29642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29643i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f29644j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f29645k;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f29641g = i10;
            this.f29642h = new ArrayList();
            this.f29644j = new byte[i10];
        }

        private byte[] d(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void e(int i10) {
            this.f29642h.add(new o(this.f29644j));
            int length = this.f29643i + this.f29644j.length;
            this.f29643i = length;
            this.f29644j = new byte[Math.max(this.f29641g, Math.max(i10, length >>> 1))];
            this.f29645k = 0;
        }

        private void k() {
            int i10 = this.f29645k;
            byte[] bArr = this.f29644j;
            if (i10 >= bArr.length) {
                this.f29642h.add(new o(this.f29644j));
                this.f29644j = f29640l;
            } else if (i10 > 0) {
                this.f29642h.add(new o(d(bArr, i10)));
            }
            this.f29643i += this.f29645k;
            this.f29645k = 0;
        }

        public synchronized AbstractC2945d m() {
            k();
            return AbstractC2945d.p(this.f29642h);
        }

        public synchronized int size() {
            return this.f29643i + this.f29645k;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f29645k == this.f29644j.length) {
                    e(1);
                }
                byte[] bArr = this.f29644j;
                int i11 = this.f29645k;
                this.f29645k = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f29644j;
                int length = bArr2.length;
                int i12 = this.f29645k;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f29645k += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    e(i13);
                    System.arraycopy(bArr, i10 + length2, this.f29644j, 0, i13);
                    this.f29645k = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
