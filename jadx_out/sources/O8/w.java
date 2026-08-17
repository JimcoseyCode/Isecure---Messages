package O8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8613c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8615h;

        a() {
            this.f8614g = w.this.f8611a.iterator();
        }

        private final void c() {
            while (this.f8615h < w.this.f8612b && this.f8614g.hasNext()) {
                this.f8614g.next();
                this.f8615h++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f8615h < w.this.f8613c && this.f8614g.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (this.f8615h >= w.this.f8613c) {
                throw new NoSuchElementException();
            }
            this.f8615h++;
            return this.f8614g.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(i sequence, int i10, int i11) {
        AbstractC2855l.g(sequence, "sequence");
        this.f8611a = sequence;
        this.f8612b = i10;
        this.f8613c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f8613c - this.f8612b;
    }

    @Override // O8.c
    public i a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        i iVar = this.f8611a;
        int i11 = this.f8612b;
        return new w(iVar, i11, i10 + i11);
    }

    @Override // O8.c
    public i b(int i10) {
        return i10 >= f() ? s.i() : new w(this.f8611a, this.f8612b + i10, this.f8613c);
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
