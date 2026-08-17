package y;

import F.C0475d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3596p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33816c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.A0 f33818b;

    /* JADX INFO: renamed from: y.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C3596p d(a aVar, String str, String str2, F.A0 a02, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                a02 = null;
            }
            return aVar.b(str, str2, a02);
        }

        public final C3596p a(String primaryCameraId) {
            AbstractC2855l.g(primaryCameraId, "primaryCameraId");
            return d(this, primaryCameraId, null, null, 6, null);
        }

        public final C3596p b(String primaryCameraId, String str, F.A0 a02) {
            AbstractC2855l.g(primaryCameraId, "primaryCameraId");
            List listP = AbstractC2800q.p(primaryCameraId);
            if (str != null) {
                listP.add(str);
            }
            return c(listP, a02);
        }

        public final C3596p c(List cameraIds, F.A0 a02) {
            AbstractC2855l.g(cameraIds, "cameraIds");
            return new C3596p(cameraIds, a02, null);
        }

        public final C3596p e(C0475d primaryInfo, C0475d c0475d) {
            AbstractC2855l.g(primaryInfo, "primaryInfo");
            String strF = c0475d != null ? c0475d.f() : null;
            F.A0 a0T = primaryInfo.B().T();
            AbstractC2855l.f(a0T, "getCompatibilityId(...)");
            String strF2 = primaryInfo.f();
            AbstractC2855l.f(strF2, "getCameraId(...)");
            return b(strF2, strF, a0T);
        }

        private a() {
        }
    }

    public /* synthetic */ C3596p(List list, F.A0 a02, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, a02);
    }

    public static final C3596p a(String str) {
        return f33816c.a(str);
    }

    public static final C3596p b(C0475d c0475d, C0475d c0475d2) {
        return f33816c.e(c0475d, c0475d2);
    }

    public final String c() {
        H0.g.j(this.f33817a.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) AbstractC2800q.e0(this.f33817a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3596p)) {
            return false;
        }
        C3596p c3596p = (C3596p) obj;
        return AbstractC2855l.b(this.f33817a, c3596p.f33817a) && AbstractC2855l.b(this.f33818b, c3596p.f33818b);
    }

    public int hashCode() {
        int iHashCode = this.f33817a.hashCode() * 31;
        F.A0 a02 = this.f33818b;
        return iHashCode + (a02 != null ? a02.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CameraIdentifier{cameraIds=");
        sb.append(AbstractC2800q.o0(this.f33817a, ",", null, null, 0, null, null, 62, null));
        F.A0 a02 = this.f33818b;
        if (a02 != null) {
            str = ", compatId=" + a02;
            if (str == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    private C3596p(List list, F.A0 a02) {
        this.f33817a = list;
        this.f33818b = a02;
        H0.g.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
