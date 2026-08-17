package H;

import H.i;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f3608m = "Exif\u0000\u0000".getBytes(h.f3574e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f3609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f3610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ByteBuffer f3611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3614l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public j(OutputStream outputStream, i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f3610h = new byte[1];
        this.f3611i = ByteBuffer.allocate(4);
        this.f3612j = 0;
        this.f3609g = iVar;
    }

    private int d(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.f3611i.position());
        this.f3611i.put(bArr, i11, iMin);
        return iMin;
    }

    private void e(b bVar) throws IOException {
        k[][] kVarArr = i.f3588i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f3586g) {
            for (int i10 = 0; i10 < i.f3588i.length; i10++) {
                this.f3609g.d(i10).remove(kVar.f3616b);
            }
        }
        if (!this.f3609g.d(1).isEmpty()) {
            this.f3609g.d(0).put(i.f3586g[1].f3616b, h.f(0L, this.f3609g.e()));
        }
        if (!this.f3609g.d(2).isEmpty()) {
            this.f3609g.d(0).put(i.f3586g[2].f3616b, h.f(0L, this.f3609g.e()));
        }
        if (!this.f3609g.d(3).isEmpty()) {
            this.f3609g.d(1).put(i.f3586g[3].f3616b, h.f(0L, this.f3609g.e()));
        }
        for (int i11 = 0; i11 < i.f3588i.length; i11++) {
            Iterator it = this.f3609g.d(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iJ = ((h) ((Map.Entry) it.next()).getValue()).j();
                if (iJ > 4) {
                    i12 += iJ;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < i.f3588i.length; i13++) {
            if (!this.f3609g.d(i13).isEmpty()) {
                iArr[i13] = size;
                size += (this.f3609g.d(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size + 8;
        if (!this.f3609g.d(1).isEmpty()) {
            this.f3609g.d(0).put(i.f3586g[1].f3616b, h.f(iArr[1], this.f3609g.e()));
        }
        if (!this.f3609g.d(2).isEmpty()) {
            this.f3609g.d(0).put(i.f3586g[2].f3616b, h.f(iArr[2], this.f3609g.e()));
        }
        if (!this.f3609g.d(3).isEmpty()) {
            this.f3609g.d(1).put(i.f3586g[3].f3616b, h.f(iArr[3], this.f3609g.e()));
        }
        bVar.s(i14);
        bVar.write(f3608m);
        bVar.m(this.f3609g.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.d(this.f3609g.e());
        bVar.s(42);
        bVar.r(8L);
        for (int i15 = 0; i15 < i.f3588i.length; i15++) {
            if (!this.f3609g.d(i15).isEmpty()) {
                bVar.s(this.f3609g.d(i15).size());
                int size2 = iArr[i15] + 2 + (this.f3609g.d(i15).size() * 12) + 4;
                for (Map.Entry entry : this.f3609g.d(i15).entrySet()) {
                    int i16 = ((k) H0.g.h((k) ((HashMap) i.b.f3597f.get(i15)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f3615a;
                    h hVar = (h) entry.getValue();
                    int iJ2 = hVar.j();
                    bVar.s(i16);
                    bVar.s(hVar.f3578a);
                    bVar.k(hVar.f3579b);
                    if (iJ2 > 4) {
                        bVar.r(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(hVar.f3581d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.e(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.r(0L);
                Iterator it2 = this.f3609g.d(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((h) ((Map.Entry) it2.next()).getValue()).f3581d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            int i12 = this.f3613k;
            if ((i12 <= 0 && this.f3614l <= 0 && this.f3612j == 2) || i11 <= 0) {
                break;
            }
            if (i12 > 0) {
                int iMin = Math.min(i11, i12);
                i11 -= iMin;
                this.f3613k -= iMin;
                i10 += iMin;
            }
            int i13 = this.f3614l;
            if (i13 > 0) {
                int iMin2 = Math.min(i11, i13);
                ((FilterOutputStream) this).out.write(bArr, i10, iMin2);
                i11 -= iMin2;
                this.f3614l -= iMin2;
                i10 += iMin2;
            }
            if (i11 == 0) {
                return;
            }
            int i14 = this.f3612j;
            if (i14 == 0) {
                int iD = d(2, bArr, i10, i11);
                i10 += iD;
                i11 -= iD;
                if (this.f3611i.position() < 2) {
                    return;
                }
                this.f3611i.rewind();
                if (this.f3611i.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f3611i.array(), 0, 2);
                this.f3612j = 1;
                this.f3611i.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.m((short) -31);
                e(bVar);
            } else if (i14 != 1) {
                continue;
            } else {
                int iD2 = d(4, bArr, i10, i11);
                i10 += iD2;
                i11 -= iD2;
                if (this.f3611i.position() == 2 && this.f3611i.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f3611i.array(), 0, 2);
                    this.f3611i.rewind();
                }
                if (this.f3611i.position() < 4) {
                    return;
                }
                this.f3611i.rewind();
                short s10 = this.f3611i.getShort();
                if (s10 == -31) {
                    this.f3613k = (this.f3611i.getShort() & 65535) - 2;
                    this.f3612j = 2;
                } else if (a.a(s10)) {
                    ((FilterOutputStream) this).out.write(this.f3611i.array(), 0, 4);
                    this.f3612j = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f3611i.array(), 0, 4);
                    this.f3614l = (this.f3611i.getShort() & 65535) - 2;
                }
                this.f3611i.rewind();
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f3610h;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
