package B7;

import j7.J;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q7.AbstractC3130c;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0018a f396j = new C0018a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f399i;

    /* JADX INFO: renamed from: B7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0018a {
        public /* synthetic */ C0018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        private C0018a() {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f397g = i10;
        this.f398h = AbstractC3130c.b(i10, i11, i12);
        this.f399i = i12;
    }

    public final int d() {
        return this.f397g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f397g == aVar.f397g && this.f398h == aVar.f398h && this.f399i == aVar.f399i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f397g * 31) + this.f398h) * 31) + this.f399i;
    }

    public boolean isEmpty() {
        return this.f399i > 0 ? this.f397g > this.f398h : this.f397g < this.f398h;
    }

    public final int o() {
        return this.f398h;
    }

    public final int p() {
        return this.f399i;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public J iterator() {
        return new b(this.f397g, this.f398h, this.f399i);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f399i > 0) {
            sb = new StringBuilder();
            sb.append(this.f397g);
            sb.append("..");
            sb.append(this.f398h);
            sb.append(" step ");
            i10 = this.f399i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f397g);
            sb.append(" downTo ");
            sb.append(this.f398h);
            sb.append(" step ");
            i10 = -this.f399i;
        }
        sb.append(i10);
        return sb.toString();
    }
}
