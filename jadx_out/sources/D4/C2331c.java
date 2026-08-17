package d4;

import com.facebook.react.uimanager.events.PointerEventHelper;
import d4.AbstractC2334f;
import java.util.Set;

/* JADX INFO: renamed from: d4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2331c extends AbstractC2334f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f25601c;

    /* JADX INFO: renamed from: d4.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC2334f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f25602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f25603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f25604c;

        b() {
        }

        @Override // d4.AbstractC2334f.b.a
        public AbstractC2334f.b a() {
            Long l10 = this.f25602a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " delta";
            }
            if (this.f25603b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f25604c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2331c(this.f25602a.longValue(), this.f25603b.longValue(), this.f25604c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d4.AbstractC2334f.b.a
        public AbstractC2334f.b.a b(long j10) {
            this.f25602a = Long.valueOf(j10);
            return this;
        }

        @Override // d4.AbstractC2334f.b.a
        public AbstractC2334f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f25604c = set;
            return this;
        }

        @Override // d4.AbstractC2334f.b.a
        public AbstractC2334f.b.a d(long j10) {
            this.f25603b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // d4.AbstractC2334f.b
    long b() {
        return this.f25599a;
    }

    @Override // d4.AbstractC2334f.b
    Set c() {
        return this.f25601c;
    }

    @Override // d4.AbstractC2334f.b
    long d() {
        return this.f25600b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2334f.b) {
            AbstractC2334f.b bVar = (AbstractC2334f.b) obj;
            if (this.f25599a == bVar.b() && this.f25600b == bVar.d() && this.f25601c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25599a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f25600b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f25601c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f25599a + ", maxAllowedDelay=" + this.f25600b + ", flags=" + this.f25601c + "}";
    }

    private C2331c(long j10, long j11, Set set) {
        this.f25599a = j10;
        this.f25600b = j11;
        this.f25601c = set;
    }
}
