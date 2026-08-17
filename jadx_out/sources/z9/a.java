package z9;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StringBuilder f34296g;

    public a() {
        this.f34296g = new StringBuilder();
    }

    public String toString() {
        return this.f34296g.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f34296g.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f34296g.append(cArr, i10, i11);
        }
    }

    public a(int i10) {
        this.f34296g = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f34296g.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f34296g.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f34296g.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
