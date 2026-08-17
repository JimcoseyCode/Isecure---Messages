package com.facebook.imagepipeline.memory;

import f2.k;
import g2.AbstractC2662a;
import g3.v;
import g3.x;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f19889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC2662a f19890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19891i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ g(f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? fVar.C() : i10);
    }

    private final void e() {
        if (!AbstractC2662a.d0(this.f19890h)) {
            throw new a();
        }
    }

    @Override // f2.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        AbstractC2662a.B(this.f19890h);
        this.f19890h = null;
        this.f19891i = -1;
        super.close();
    }

    public final void k(int i10) throws Throwable {
        e();
        AbstractC2662a abstractC2662a = this.f19890h;
        if (abstractC2662a == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC2855l.d(abstractC2662a);
        if (i10 <= ((v) abstractC2662a.J()).b()) {
            return;
        }
        Object obj = this.f19889g.get(i10);
        AbstractC2855l.f(obj, "get(...)");
        v vVar = (v) obj;
        AbstractC2662a abstractC2662a2 = this.f19890h;
        if (abstractC2662a2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC2855l.d(abstractC2662a2);
        ((v) abstractC2662a2.J()).k(0, vVar, 0, this.f19891i);
        AbstractC2662a abstractC2662a3 = this.f19890h;
        AbstractC2855l.d(abstractC2662a3);
        abstractC2662a3.close();
        this.f19890h = AbstractC2662a.w0(vVar, this.f19889g);
    }

    @Override // f2.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public x d() {
        e();
        AbstractC2662a abstractC2662a = this.f19890h;
        if (abstractC2662a != null) {
            return new x(abstractC2662a, this.f19891i);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // f2.k
    public int size() {
        return this.f19891i;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public g(f pool, int i10) {
        AbstractC2855l.g(pool, "pool");
        if (i10 > 0) {
            this.f19889g = pool;
            this.f19891i = 0;
            this.f19890h = AbstractC2662a.w0(pool.get(i10), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws Throwable {
        AbstractC2855l.g(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            e();
            k(this.f19891i + i11);
            AbstractC2662a abstractC2662a = this.f19890h;
            if (abstractC2662a != null) {
                ((v) abstractC2662a.J()).e(this.f19891i, buffer, i10, i11);
                this.f19891i += i11;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
