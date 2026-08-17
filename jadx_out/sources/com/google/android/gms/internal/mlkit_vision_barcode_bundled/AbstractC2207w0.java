package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207w0 extends AbstractC2126f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f22434b = Logger.getLogger(AbstractC2207w0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f22435c = AbstractC2118d2.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C2211x0 f22436a;

    /* synthetic */ AbstractC2207w0(AbstractC2203v0 abstractC2203v0) {
    }

    public static int A(InterfaceC2186r1 interfaceC2186r1) {
        int iA = interfaceC2186r1.a();
        return a(iA) + iA;
    }

    static int B(InterfaceC2186r1 interfaceC2186r1, J1 j12) {
        int iD = ((AbstractC2101a0) interfaceC2186r1).d(j12);
        return a(iD) + iD;
    }

    public static int C(String str) {
        int length;
        try {
            length = AbstractC2148j2.e(str);
        } catch (C2143i2 unused) {
            length = str.getBytes(X0.f22316a).length;
        }
        return a(length) + length;
    }

    public static int a(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int b(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    static int z(int i10, InterfaceC2186r1 interfaceC2186r1, J1 j12) {
        int iA = a(i10 << 3);
        return iA + iA + ((AbstractC2101a0) interfaceC2186r1).d(j12);
    }

    public final void c() {
        if (f() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, C2143i2 c2143i2) throws C2199u0 {
        f22434b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2143i2);
        byte[] bytes = str.getBytes(X0.f22316a);
        try {
            int length = bytes.length;
            w(length);
            p(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C2199u0(e10);
        }
    }

    public abstract int f();

    public abstract void g(byte b10);

    public abstract void h(int i10, boolean z10);

    public abstract void i(int i10, AbstractC2171o0 abstractC2171o0);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10);

    public abstract void l(int i10, long j10);

    public abstract void m(long j10);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10);

    public abstract void p(byte[] bArr, int i10, int i11);

    abstract void q(int i10, InterfaceC2186r1 interfaceC2186r1, J1 j12);

    public abstract void r(int i10, InterfaceC2186r1 interfaceC2186r1);

    public abstract void s(int i10, AbstractC2171o0 abstractC2171o0);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
