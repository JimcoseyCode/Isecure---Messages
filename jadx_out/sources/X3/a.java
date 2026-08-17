package X3;

import X3.f;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f12455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f12456b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f12457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f12458b;

        b() {
        }

        @Override // X3.f.a
        public f a() {
            Iterable iterable = this.f12457a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (iterable == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f12457a, this.f12458b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X3.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f12457a = iterable;
            return this;
        }

        @Override // X3.f.a
        public f.a c(byte[] bArr) {
            this.f12458b = bArr;
            return this;
        }
    }

    @Override // X3.f
    public Iterable b() {
        return this.f12455a;
    }

    @Override // X3.f
    public byte[] c() {
        return this.f12456b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f12455a.equals(fVar.b())) {
                if (Arrays.equals(this.f12456b, fVar instanceof a ? ((a) fVar).f12456b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12455a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12456b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f12455a + ", extras=" + Arrays.toString(this.f12456b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f12455a = iterable;
        this.f12456b = bArr;
    }
}
