package t9;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements InterfaceC3392i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f32635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3391h f32636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32637i;

    public y(D sink) {
        AbstractC2855l.g(sink, "sink");
        this.f32635g = sink;
        this.f32636h = new C3391h();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i C0(long j10) {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.C0(j10);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public OutputStream E0() {
        return new a();
    }

    @Override // t9.InterfaceC3392i
    public long G(F source) {
        AbstractC2855l.g(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f32636h, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            K();
        }
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i K() {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        long jR = this.f32636h.r();
        if (jR > 0) {
            this.f32635g.write(this.f32636h, jR);
        }
        return this;
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i S(k byteString) {
        AbstractC2855l.g(byteString, "byteString");
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.S(byteString);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i V(String string) {
        AbstractC2855l.g(string, "string");
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.V(string);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i a0(long j10) {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.a0(j10);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public C3391h c() {
        return this.f32636h;
    }

    @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f32637i) {
            return;
        }
        try {
            if (this.f32636h.size() > 0) {
                D d10 = this.f32635g;
                C3391h c3391h = this.f32636h;
                d10.write(c3391h, c3391h.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f32635g.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f32637i = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // t9.InterfaceC3392i, t9.D, java.io.Flushable
    public void flush() {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        if (this.f32636h.size() > 0) {
            D d10 = this.f32635g;
            C3391h c3391h = this.f32636h;
            d10.write(c3391h, c3391h.size());
        }
        this.f32635g.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f32637i;
    }

    @Override // t9.D
    public G timeout() {
        return this.f32635g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f32635g + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC2855l.g(source, "source");
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f32636h.write(source);
        K();
        return iWrite;
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i writeByte(int i10) {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.writeByte(i10);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i writeInt(int i10) {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.writeInt(i10);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i writeShort(int i10) {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        this.f32636h.writeShort(i10);
        return K();
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i x() {
        if (this.f32637i) {
            throw new IllegalStateException("closed");
        }
        long size = this.f32636h.size();
        if (size > 0) {
            this.f32635g.write(this.f32636h, size);
        }
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            y.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            y yVar = y.this;
            if (yVar.f32637i) {
                return;
            }
            yVar.flush();
        }

        public String toString() {
            return y.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            y yVar = y.this;
            if (yVar.f32637i) {
                throw new IOException("closed");
            }
            yVar.f32636h.writeByte((byte) i10);
            y.this.K();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            AbstractC2855l.g(data, "data");
            y yVar = y.this;
            if (!yVar.f32637i) {
                yVar.f32636h.write(data, i10, i11);
                y.this.K();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // t9.D
    public void write(C3391h source, long j10) {
        AbstractC2855l.g(source, "source");
        if (!this.f32637i) {
            this.f32636h.write(source, j10);
            K();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i write(byte[] source) {
        AbstractC2855l.g(source, "source");
        if (!this.f32637i) {
            this.f32636h.write(source);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    @Override // t9.InterfaceC3392i
    public InterfaceC3392i write(byte[] source, int i10, int i11) {
        AbstractC2855l.g(source, "source");
        if (!this.f32637i) {
            this.f32636h.write(source, i10, i11);
            return K();
        }
        throw new IllegalStateException("closed");
    }
}
