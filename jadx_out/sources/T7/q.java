package t7;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class q implements O8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f32516a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f32518h;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f32517g;
            this.f32517g = null;
            AbstractC2855l.d(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f32517g == null && !this.f32518h) {
                String line = q.this.f32516a.readLine();
                this.f32517g = line;
                if (line == null) {
                    this.f32518h = true;
                }
            }
            return this.f32517g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(BufferedReader reader) {
        AbstractC2855l.g(reader, "reader");
        this.f32516a = reader;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
