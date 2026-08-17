package t9;

import j7.AbstractC2793j;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32550h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f32551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f32556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A f32557g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public A() {
        this.f32551a = new byte[8192];
        this.f32555e = true;
        this.f32554d = false;
    }

    public final void a() {
        int i10;
        A a10 = this.f32557g;
        if (a10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC2855l.d(a10);
        if (a10.f32555e) {
            int i11 = this.f32553c - this.f32552b;
            A a11 = this.f32557g;
            AbstractC2855l.d(a11);
            int i12 = 8192 - a11.f32553c;
            A a12 = this.f32557g;
            AbstractC2855l.d(a12);
            if (a12.f32554d) {
                i10 = 0;
            } else {
                A a13 = this.f32557g;
                AbstractC2855l.d(a13);
                i10 = a13.f32552b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            A a14 = this.f32557g;
            AbstractC2855l.d(a14);
            g(a14, i11);
            b();
            B.b(this);
        }
    }

    public final A b() {
        A a10 = this.f32556f;
        if (a10 == this) {
            a10 = null;
        }
        A a11 = this.f32557g;
        AbstractC2855l.d(a11);
        a11.f32556f = this.f32556f;
        A a12 = this.f32556f;
        AbstractC2855l.d(a12);
        a12.f32557g = this.f32557g;
        this.f32556f = null;
        this.f32557g = null;
        return a10;
    }

    public final A c(A segment) {
        AbstractC2855l.g(segment, "segment");
        segment.f32557g = this;
        segment.f32556f = this.f32556f;
        A a10 = this.f32556f;
        AbstractC2855l.d(a10);
        a10.f32557g = segment;
        this.f32556f = segment;
        return segment;
    }

    public final A d() {
        this.f32554d = true;
        return new A(this.f32551a, this.f32552b, this.f32553c, true, false);
    }

    public final A e(int i10) {
        A aC;
        if (i10 <= 0 || i10 > this.f32553c - this.f32552b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            aC = d();
        } else {
            aC = B.c();
            byte[] bArr = this.f32551a;
            byte[] bArr2 = aC.f32551a;
            int i11 = this.f32552b;
            AbstractC2793j.j(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        aC.f32553c = aC.f32552b + i10;
        this.f32552b += i10;
        A a10 = this.f32557g;
        AbstractC2855l.d(a10);
        a10.c(aC);
        return aC;
    }

    public final A f() {
        byte[] bArr = this.f32551a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
        return new A(bArrCopyOf, this.f32552b, this.f32553c, false, true);
    }

    public final void g(A sink, int i10) {
        AbstractC2855l.g(sink, "sink");
        if (!sink.f32555e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f32553c;
        if (i11 + i10 > 8192) {
            if (sink.f32554d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f32552b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f32551a;
            AbstractC2793j.j(bArr, bArr, 0, i12, i11, 2, null);
            sink.f32553c -= sink.f32552b;
            sink.f32552b = 0;
        }
        byte[] bArr2 = this.f32551a;
        byte[] bArr3 = sink.f32551a;
        int i13 = sink.f32553c;
        int i14 = this.f32552b;
        AbstractC2793j.f(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f32553c += i10;
        this.f32552b += i10;
    }

    public A(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        AbstractC2855l.g(data, "data");
        this.f32551a = data;
        this.f32552b = i10;
        this.f32553c = i11;
        this.f32554d = z10;
        this.f32555e = z11;
    }
}
