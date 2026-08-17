package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2171o0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC2171o0 f22405h = new C2166n0(X0.f22317b);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22406g = 0;

    static {
        int i10 = AbstractC2111c0.f22341a;
    }

    AbstractC2171o0() {
    }

    static int A(int i10, int i11, int i12) {
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

    public static AbstractC2171o0 D(byte[] bArr, int i10, int i11) {
        A(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2166n0(bArr2);
    }

    public static AbstractC2171o0 E(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            AbstractC2171o0 abstractC2171o0D = i10 == 0 ? null : D(bArr, 0, i10);
            if (abstractC2171o0D == null) {
                break;
            }
            arrayList.add(abstractC2171o0D);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f22405h : p(arrayList.iterator(), size);
    }

    static void G(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static AbstractC2171o0 p(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (AbstractC2171o0) it.next();
        }
        int i11 = i10 >>> 1;
        AbstractC2171o0 abstractC2171o0P = p(it, i11);
        AbstractC2171o0 abstractC2171o0P2 = p(it, i10 - i11);
        if (ViewDefaults.NUMBER_OF_LINES - abstractC2171o0P.q() >= abstractC2171o0P2.q()) {
            return I1.M(abstractC2171o0P, abstractC2171o0P2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + abstractC2171o0P.q() + "+" + abstractC2171o0P2.q());
    }

    protected final int B() {
        return this.f22406g;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public InterfaceC2151k0 iterator() {
        return new C2131g0(this);
    }

    public final String F() {
        return q() == 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : x(X0.f22316a);
    }

    public final void H(byte[] bArr, int i10, int i11, int i12) {
        A(0, i12, q());
        A(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            r(bArr, 0, i11, i12);
        }
    }

    public final byte[] I() {
        int iQ = q();
        if (iQ == 0) {
            return X0.f22317b;
        }
        byte[] bArr = new byte[iQ];
        r(bArr, 0, 0, iQ);
        return bArr;
    }

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iU = this.f22406g;
        if (iU == 0) {
            int iQ = q();
            iU = u(iQ, 0, iQ);
            if (iU == 0) {
                iU = 1;
            }
            this.f22406g = iU;
        }
        return iU;
    }

    abstract byte o(int i10);

    public abstract int q();

    protected abstract void r(byte[] bArr, int i10, int i11, int i12);

    protected abstract int s();

    protected abstract boolean t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(q()), q() <= 50 ? U1.a(this) : U1.a(w(0, 47)).concat("..."));
    }

    protected abstract int u(int i10, int i11, int i12);

    protected abstract int v(int i10, int i11, int i12);

    public abstract AbstractC2171o0 w(int i10, int i11);

    protected abstract String x(Charset charset);

    abstract void y(AbstractC2126f0 abstractC2126f0);

    public abstract boolean z();
}
