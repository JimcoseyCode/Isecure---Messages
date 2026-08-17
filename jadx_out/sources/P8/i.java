package P8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class i implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f8906l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f8907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8911k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(CharSequence string) {
        AbstractC2855l.g(string, "string");
        this.f8907g = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8908h = 0;
        int i10 = this.f8910j;
        int i11 = this.f8909i;
        this.f8909i = this.f8911k + i10;
        return this.f8907g.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f8908h;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f8911k < 0) {
            this.f8908h = 2;
            return false;
        }
        int length = this.f8907g.length();
        int length2 = this.f8907g.length();
        for (int i13 = this.f8909i; i13 < length2; i13++) {
            char cCharAt = this.f8907g.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f8907g.length() && this.f8907g.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f8908h = 1;
                this.f8911k = i10;
                this.f8910j = length;
                return true;
            }
        }
        i10 = -1;
        this.f8908h = 1;
        this.f8911k = i10;
        this.f8910j = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
