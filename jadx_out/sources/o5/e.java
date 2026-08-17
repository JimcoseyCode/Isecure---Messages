package O5;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends S5.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Writer f8223u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final com.google.gson.k f8224v = new com.google.gson.k("closed");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f8225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f8226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.gson.f f8227t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public e() {
        super(f8223u);
        this.f8225r = new ArrayList();
        this.f8227t = com.google.gson.h.f24370g;
    }

    private com.google.gson.f O0() {
        return (com.google.gson.f) this.f8225r.get(r0.size() - 1);
    }

    private void P0(com.google.gson.f fVar) {
        if (this.f8226s != null) {
            if (!fVar.r() || B()) {
                ((com.google.gson.i) O0()).u(this.f8226s, fVar);
            }
            this.f8226s = null;
            return;
        }
        if (this.f8225r.isEmpty()) {
            this.f8227t = fVar;
            return;
        }
        com.google.gson.f fVarO0 = O0();
        if (!(fVarO0 instanceof com.google.gson.e)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.e) fVarO0).u(fVar);
    }

    @Override // S5.c
    public S5.c A() {
        if (this.f8225r.isEmpty() || this.f8226s != null) {
            throw new IllegalStateException();
        }
        if (!(O0() instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        this.f8225r.remove(r0.size() - 1);
        return this;
    }

    @Override // S5.c
    public S5.c A0(long j10) {
        P0(new com.google.gson.k(Long.valueOf(j10)));
        return this;
    }

    @Override // S5.c
    public S5.c D0(Boolean bool) {
        if (bool == null) {
            return X();
        }
        P0(new com.google.gson.k(bool));
        return this;
    }

    @Override // S5.c
    public S5.c J0(Number number) {
        if (number == null) {
            return X();
        }
        if (!J()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        P0(new com.google.gson.k(number));
        return this;
    }

    @Override // S5.c
    public S5.c K0(String str) {
        if (str == null) {
            return X();
        }
        P0(new com.google.gson.k(str));
        return this;
    }

    @Override // S5.c
    public S5.c L0(boolean z10) {
        P0(new com.google.gson.k(Boolean.valueOf(z10)));
        return this;
    }

    @Override // S5.c
    public S5.c M(String str) {
        if (this.f8225r.isEmpty() || this.f8226s != null) {
            throw new IllegalStateException();
        }
        if (!(O0() instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        this.f8226s = str;
        return this;
    }

    public com.google.gson.f N0() {
        if (this.f8225r.isEmpty()) {
            return this.f8227t;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f8225r);
    }

    @Override // S5.c
    public S5.c X() {
        P0(com.google.gson.h.f24370g);
        return this;
    }

    @Override // S5.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f8225r.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f8225r.add(f8224v);
    }

    @Override // S5.c
    public S5.c k() {
        com.google.gson.e eVar = new com.google.gson.e();
        P0(eVar);
        this.f8225r.add(eVar);
        return this;
    }

    @Override // S5.c
    public S5.c m() {
        com.google.gson.i iVar = new com.google.gson.i();
        P0(iVar);
        this.f8225r.add(iVar);
        return this;
    }

    @Override // S5.c
    public S5.c s() {
        if (this.f8225r.isEmpty() || this.f8226s != null) {
            throw new IllegalStateException();
        }
        if (!(O0() instanceof com.google.gson.e)) {
            throw new IllegalStateException();
        }
        this.f8225r.remove(r0.size() - 1);
        return this;
    }

    @Override // S5.c, java.io.Flushable
    public void flush() {
    }
}
