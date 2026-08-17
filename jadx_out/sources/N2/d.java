package N2;

import N2.b;
import i7.C2735B;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d extends N2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f7970j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7971i = new ArrayList(2);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final synchronized void A(b listener) {
        AbstractC2855l.g(listener, "listener");
        this.f7971i.add(listener);
    }

    public final synchronized void B(b listener) {
        AbstractC2855l.g(listener, "listener");
        this.f7971i.remove(listener);
    }

    @Override // N2.a, N2.b
    public void e(String id, Throwable th, b.a aVar) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).e(id, th, aVar);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onFailure");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // N2.a, N2.b
    public void k(String id, b.a aVar) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).k(id, aVar);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onRelease");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // N2.a, N2.b
    public void m(String id, Object obj, b.a aVar) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).m(id, obj, aVar);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onFinalImageSet");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // N2.a, N2.b
    public void onIntermediateImageSet(String id, Object obj) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).onIntermediateImageSet(id, obj);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onIntermediateImageSet");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // N2.a, N2.b
    public void r(String id) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).r(id);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onIntermediateImageFailed");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // N2.a, N2.b
    public void s(String id, Object obj, b.a aVar) {
        AbstractC2855l.g(id, "id");
        int size = this.f7971i.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7971i.get(i10)).s(id, obj, aVar);
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InternalListener exception in ");
                    sb.append("onSubmit");
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }
}
