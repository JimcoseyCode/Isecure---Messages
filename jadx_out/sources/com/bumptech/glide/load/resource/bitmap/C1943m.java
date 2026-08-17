package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1943m implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f19255a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f19256b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f19257c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19258a;

        a(ByteBuffer byteBuffer) {
            this.f19258a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f19258a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f19258a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public short c() throws c.a {
            if (this.f19258a.remaining() >= 1) {
                return (short) (this.f19258a.get() & 255);
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f19258a.remaining(), j10);
            ByteBuffer byteBuffer = this.f19258a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19259a;

        b(byte[] bArr, int i10) {
            this.f19259a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f19259a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f19259a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f19259a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f19259a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f19259a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f19260a;

        d(InputStream inputStream) {
            this.f19260a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public int b(byte[] bArr, int i10) throws c.a {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f19260a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public short c() throws IOException {
            int i10 = this.f19260a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1943m.c
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f19260a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f19260a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    private static int g(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int h(c cVar, y1.b bVar) {
        int iP;
        try {
            if (!j(cVar.a()) || (iP = p(cVar)) == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) bVar.d(iP, byte[].class);
            try {
                return s(cVar, bArr, iP);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType i(c cVar) {
        try {
            int iA = cVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | cVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | cVar.c();
            if (iC2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return t(cVar, iC2);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (cVar.a() << 16) | cVar.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short sC = cVar.c();
                return (sC & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean j(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean k(byte[] bArr, int i10) {
        return n(bArr, i10, f19255a);
    }

    private boolean l(c cVar, y1.b bVar) {
        if (i(cVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int iO = o(cVar);
        while (iO > 0) {
            byte[] bArr = (byte[]) bVar.d(iO, byte[].class);
            try {
                if (m(cVar, bArr, iO)) {
                    bVar.put(bArr);
                    return true;
                }
                bVar.put(bArr);
                iO = o(cVar);
            } catch (Throwable th) {
                bVar.put(bArr);
                throw th;
            }
        }
        return false;
    }

    private boolean m(c cVar, byte[] bArr, int i10) {
        if (cVar.b(bArr, i10) != i10) {
            return false;
        }
        return n(bArr, i10, f19256b);
    }

    private boolean n(byte[] bArr, int i10, byte[] bArr2) {
        boolean z10 = (bArr == null || bArr2 == null || i10 <= bArr2.length) ? false : true;
        if (z10) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
            }
        }
        return z10;
    }

    private int o(c cVar) {
        return q(cVar, 226);
    }

    private int p(c cVar) {
        return q(cVar, JfifUtil.MARKER_APP1);
    }

    private int q(c cVar, int i10) {
        short sC;
        while (cVar.c() == 255 && (sC = cVar.c()) != 218 && sC != 217) {
            int iA = cVar.a() - 2;
            if (sC == i10) {
                return iA;
            }
            long j10 = iA;
            if (cVar.skip(j10) != j10) {
                return -1;
            }
        }
        return -1;
    }

    private static int r(b bVar) {
        short sA;
        int iB;
        int i10;
        int i11;
        short sA2 = bVar.a(6);
        bVar.e(sA2 != 18761 ? sA2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        int iB2 = bVar.b(10) + 6;
        short sA3 = bVar.a(iB2);
        for (int i12 = 0; i12 < sA3; i12++) {
            int iG = g(iB2, i12);
            if (bVar.a(iG) == 274 && (sA = bVar.a(iG + 2)) >= 1 && sA <= 12 && (iB = bVar.b(iG + 4)) >= 0 && (i10 = iB + f19257c[sA]) <= 4 && (i11 = iG + 8) >= 0 && i11 <= bVar.d() && i10 >= 0 && i10 + i11 <= bVar.d()) {
                return bVar.a(i11);
            }
        }
        return -1;
    }

    private int s(c cVar, byte[] bArr, int i10) {
        if (cVar.b(bArr, i10) == i10 && k(bArr, i10)) {
            return r(new b(bArr, i10));
        }
        return -1;
    }

    private ImageHeaderParser.ImageType t(c cVar, int i10) {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (cVar.a() << 16) | cVar.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iA == 1635150182;
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iA2 = (cVar.a() << 16) | cVar.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return i(new a((ByteBuffer) Q1.k.e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean b(ByteBuffer byteBuffer, y1.b bVar) {
        return l(new a((ByteBuffer) Q1.k.e(byteBuffer)), (y1.b) Q1.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, y1.b bVar) {
        return h(new d((InputStream) Q1.k.e(inputStream)), (y1.b) Q1.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean d(InputStream inputStream, y1.b bVar) {
        return l(new d((InputStream) Q1.k.e(inputStream)), (y1.b) Q1.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType e(InputStream inputStream) {
        return i(new d((InputStream) Q1.k.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int f(ByteBuffer byteBuffer, y1.b bVar) {
        return h(new a((ByteBuffer) Q1.k.e(byteBuffer)), (y1.b) Q1.k.e(bVar));
    }
}
