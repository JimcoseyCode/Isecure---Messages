package f0;

import F.InterfaceC0515w0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f0.AbstractC2593p;

/* JADX INFO: renamed from: f0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2586i extends AbstractC2593p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0515w0.c f27188c;

    /* JADX INFO: renamed from: f0.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC2593p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f27190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC0515w0.c f27191c;

        b() {
        }

        @Override // f0.AbstractC2593p.a
        public AbstractC2593p b() {
            String str = this.f27189a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " mimeType";
            }
            if (this.f27190b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new C2586i(this.f27189a, this.f27190b.intValue(), this.f27191c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // f0.AbstractC2593p.a
        public AbstractC2593p.a c(InterfaceC0515w0.c cVar) {
            this.f27191c = cVar;
            return this;
        }

        protected AbstractC2593p.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f27189a = str;
            return this;
        }

        @Override // f0.AbstractC2589l.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC2593p.a a(int i10) {
            this.f27190b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f0.AbstractC2589l
    public String a() {
        return this.f27186a;
    }

    @Override // f0.AbstractC2589l
    public int b() {
        return this.f27187b;
    }

    @Override // f0.AbstractC2593p
    public InterfaceC0515w0.c d() {
        return this.f27188c;
    }

    public boolean equals(Object obj) {
        InterfaceC0515w0.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2593p) {
            AbstractC2593p abstractC2593p = (AbstractC2593p) obj;
            if (this.f27186a.equals(abstractC2593p.a()) && this.f27187b == abstractC2593p.b() && ((cVar = this.f27188c) != null ? cVar.equals(abstractC2593p.d()) : abstractC2593p.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f27186a.hashCode() ^ 1000003) * 1000003) ^ this.f27187b) * 1000003;
        InterfaceC0515w0.c cVar = this.f27188c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f27186a + ", profile=" + this.f27187b + ", compatibleVideoProfile=" + this.f27188c + "}";
    }

    private C2586i(String str, int i10, InterfaceC0515w0.c cVar) {
        this.f27186a = str;
        this.f27187b = i10;
        this.f27188c = cVar;
    }
}
