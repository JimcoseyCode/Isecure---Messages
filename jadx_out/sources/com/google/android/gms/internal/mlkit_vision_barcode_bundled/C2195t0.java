package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2195t0 extends AbstractC2207w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f22413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22415f;

    C2195t0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f22413d = bArr;
        this.f22415f = 0;
        this.f22414e = i11;
    }

    public final void D(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f22413d, this.f22415f, i11);
            this.f22415f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), Integer.valueOf(i11)), e10);
        }
    }

    public final void E(String str) throws C2199u0 {
        int i10 = this.f22415f;
        try {
            int iA = AbstractC2207w0.a(str.length() * 3);
            int iA2 = AbstractC2207w0.a(str.length());
            if (iA2 != iA) {
                w(AbstractC2148j2.e(str));
                byte[] bArr = this.f22413d;
                int i11 = this.f22415f;
                this.f22415f = AbstractC2148j2.d(str, bArr, i11, this.f22414e - i11);
                return;
            }
            int i12 = i10 + iA2;
            this.f22415f = i12;
            int iD = AbstractC2148j2.d(str, this.f22413d, i12, this.f22414e - i12);
            this.f22415f = i10;
            w((iD - i10) - iA2);
            this.f22415f = iD;
        } catch (C2143i2 e10) {
            this.f22415f = i10;
            d(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C2199u0(e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final int f() {
        return this.f22414e - this.f22415f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void g(byte b10) throws C2199u0 {
        try {
            byte[] bArr = this.f22413d;
            int i10 = this.f22415f;
            this.f22415f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void h(int i10, boolean z10) throws C2199u0 {
        w(i10 << 3);
        g(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void i(int i10, AbstractC2171o0 abstractC2171o0) throws C2199u0 {
        w((i10 << 3) | 2);
        w(abstractC2171o0.q());
        abstractC2171o0.y(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void j(int i10, int i11) throws C2199u0 {
        w((i10 << 3) | 5);
        k(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void k(int i10) throws C2199u0 {
        try {
            byte[] bArr = this.f22413d;
            int i11 = this.f22415f;
            int i12 = i11 + 1;
            this.f22415f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f22415f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f22415f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f22415f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void l(int i10, long j10) throws C2199u0 {
        w((i10 << 3) | 1);
        m(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void m(long j10) throws C2199u0 {
        try {
            byte[] bArr = this.f22413d;
            int i10 = this.f22415f;
            int i11 = i10 + 1;
            this.f22415f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f22415f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f22415f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f22415f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f22415f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f22415f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f22415f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f22415f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void n(int i10, int i11) throws C2199u0 {
        w(i10 << 3);
        o(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void o(int i10) throws C2199u0 {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void p(byte[] bArr, int i10, int i11) {
        D(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    final void q(int i10, InterfaceC2186r1 interfaceC2186r1, J1 j12) throws C2199u0 {
        w((i10 << 3) | 2);
        w(((AbstractC2101a0) interfaceC2186r1).d(j12));
        j12.c(interfaceC2186r1, this.f22436a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void r(int i10, InterfaceC2186r1 interfaceC2186r1) throws C2199u0 {
        w(11);
        v(2, i10);
        w(26);
        w(interfaceC2186r1.a());
        interfaceC2186r1.b(this);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void s(int i10, AbstractC2171o0 abstractC2171o0) throws C2199u0 {
        w(11);
        v(2, i10);
        i(3, abstractC2171o0);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void t(int i10, String str) throws C2199u0 {
        w((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void u(int i10, int i11) throws C2199u0 {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void v(int i10, int i11) throws C2199u0 {
        w(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void w(int i10) throws C2199u0 {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f22413d;
                int i11 = this.f22415f;
                this.f22415f = i11 + 1;
                bArr[i11] = (byte) ((i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), 1), e10);
            }
        }
        byte[] bArr2 = this.f22413d;
        int i12 = this.f22415f;
        this.f22415f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void x(int i10, long j10) throws C2199u0 {
        w(i10 << 3);
        y(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2207w0
    public final void y(long j10) throws C2199u0 {
        if (!AbstractC2207w0.f22435c || this.f22414e - this.f22415f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f22413d;
                    int i10 = this.f22415f;
                    this.f22415f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C2199u0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22415f), Integer.valueOf(this.f22414e), 1), e10);
                }
            }
            byte[] bArr2 = this.f22413d;
            int i11 = this.f22415f;
            this.f22415f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f22413d;
                int i13 = this.f22415f;
                this.f22415f = i13 + 1;
                AbstractC2118d2.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f22413d;
            int i14 = this.f22415f;
            this.f22415f = i14 + 1;
            AbstractC2118d2.s(bArr4, i14, (byte) ((i12 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255));
            j10 >>>= 7;
        }
    }
}
