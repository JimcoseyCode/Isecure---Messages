package W3;

import W3.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f12080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U3.e f12081c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f12083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private U3.e f12084c;

        b() {
        }

        @Override // W3.o.a
        public o a() {
            String str = this.f12082a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " backendName";
            }
            if (this.f12084c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.f12082a, this.f12083b, this.f12084c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // W3.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f12082a = str;
            return this;
        }

        @Override // W3.o.a
        public o.a c(byte[] bArr) {
            this.f12083b = bArr;
            return this;
        }

        @Override // W3.o.a
        public o.a d(U3.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f12084c = eVar;
            return this;
        }
    }

    @Override // W3.o
    public String b() {
        return this.f12079a;
    }

    @Override // W3.o
    public byte[] c() {
        return this.f12080b;
    }

    @Override // W3.o
    public U3.e d() {
        return this.f12081c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f12079a.equals(oVar.b())) {
                if (Arrays.equals(this.f12080b, oVar instanceof d ? ((d) oVar).f12080b : oVar.c()) && this.f12081c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12079a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12080b)) * 1000003) ^ this.f12081c.hashCode();
    }

    private d(String str, byte[] bArr, U3.e eVar) {
        this.f12079a = str;
        this.f12080b = bArr;
        this.f12081c = eVar;
    }
}
