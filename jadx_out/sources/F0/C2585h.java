package f0;

import F.InterfaceC0515w0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f0.AbstractC2582e;

/* JADX INFO: renamed from: f0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2585h extends AbstractC2582e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0515w0.a f27182c;

    /* JADX INFO: renamed from: f0.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC2582e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f27184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC0515w0.a f27185c;

        b() {
        }

        @Override // f0.AbstractC2582e.a
        public AbstractC2582e b() {
            String str = this.f27183a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " mimeType";
            }
            if (this.f27184b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new C2585h(this.f27183a, this.f27184b.intValue(), this.f27185c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // f0.AbstractC2582e.a
        public AbstractC2582e.a c(InterfaceC0515w0.a aVar) {
            this.f27185c = aVar;
            return this;
        }

        protected AbstractC2582e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f27183a = str;
            return this;
        }

        @Override // f0.AbstractC2589l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC2582e.a a(int i10) {
            this.f27184b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f0.AbstractC2589l
    public String a() {
        return this.f27180a;
    }

    @Override // f0.AbstractC2589l
    public int b() {
        return this.f27181b;
    }

    @Override // f0.AbstractC2582e
    public InterfaceC0515w0.a d() {
        return this.f27182c;
    }

    public boolean equals(Object obj) {
        InterfaceC0515w0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2582e) {
            AbstractC2582e abstractC2582e = (AbstractC2582e) obj;
            if (this.f27180a.equals(abstractC2582e.a()) && this.f27181b == abstractC2582e.b() && ((aVar = this.f27182c) != null ? aVar.equals(abstractC2582e.d()) : abstractC2582e.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f27180a.hashCode() ^ 1000003) * 1000003) ^ this.f27181b) * 1000003;
        InterfaceC0515w0.a aVar = this.f27182c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f27180a + ", profile=" + this.f27181b + ", compatibleAudioProfile=" + this.f27182c + "}";
    }

    private C2585h(String str, int i10, InterfaceC0515w0.a aVar) {
        this.f27180a = str;
        this.f27181b = i10;
        this.f27182c = aVar;
    }
}
