package P8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: P8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1386e implements O8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f8866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f8869d;

    /* JADX INFO: renamed from: P8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8870g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8872i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private B7.c f8873j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f8874k;

        a() {
            int iL = B7.d.l(C1386e.this.f8867b, 0, C1386e.this.f8866a.length());
            this.f8871h = iL;
            this.f8872i = iL;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void c() {
            Pair pair;
            if (this.f8872i < 0) {
                this.f8870g = 0;
                this.f8873j = null;
                return;
            }
            if (C1386e.this.f8868c > 0) {
                int i10 = this.f8874k + 1;
                this.f8874k = i10;
                if (i10 >= C1386e.this.f8868c) {
                    this.f8873j = new B7.c(this.f8871h, E.X(C1386e.this.f8866a));
                    this.f8872i = -1;
                } else if (this.f8872i <= C1386e.this.f8866a.length() && (pair = (Pair) C1386e.this.f8869d.invoke(C1386e.this.f8866a, Integer.valueOf(this.f8872i))) != null) {
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    this.f8873j = B7.d.p(this.f8871h, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f8871h = i11;
                    this.f8872i = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f8873j = new B7.c(this.f8871h, E.X(C1386e.this.f8866a));
                    this.f8872i = -1;
                }
            }
            this.f8870g = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public B7.c next() {
            if (this.f8870g == -1) {
                c();
            }
            if (this.f8870g == 0) {
                throw new NoSuchElementException();
            }
            B7.c cVar = this.f8873j;
            AbstractC2855l.e(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f8873j = null;
            this.f8870g = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8870g == -1) {
                c();
            }
            return this.f8870g == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1386e(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        AbstractC2855l.g(input, "input");
        AbstractC2855l.g(getNextMatch, "getNextMatch");
        this.f8866a = input;
        this.f8867b = i10;
        this.f8868c = i11;
        this.f8869d = getNextMatch;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
