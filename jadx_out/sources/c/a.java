package C;

import F.L;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;
import y.C3563H;
import y.J0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends A.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0020a f440i = new C0020a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3563H f441j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3563H f442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f443h;

    /* JADX INFO: renamed from: C.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0020a {
        public /* synthetic */ C0020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0020a() {
        }
    }

    static {
        C3563H SDR = C3563H.f33650d;
        AbstractC2855l.f(SDR, "SDR");
        f441j = SDR;
    }

    public a(C3563H dynamicRange) {
        AbstractC2855l.g(dynamicRange, "dynamicRange");
        this.f442g = dynamicRange;
        this.f443h = b.f444g;
    }

    @Override // A.b
    public b c() {
        return this.f443h;
    }

    @Override // A.b
    public boolean d(L cameraInfoInternal, v0 sessionConfig) {
        AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
        AbstractC2855l.g(sessionConfig, "sessionConfig");
        Set setB = cameraInfoInternal.b();
        AbstractC2855l.f(setB, "getSupportedDynamicRanges(...)");
        AbstractC3583h0.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setB + ", this = " + this);
        if (!setB.contains(this.f442g)) {
            return false;
        }
        for (J0 j02 : sessionConfig.k()) {
            Set setA = j02.A(cameraInfoInternal);
            AbstractC3583h0.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setA + ", this = " + this + ", useCases = " + j02);
            if (setA != null && !setA.contains(this.f442g)) {
                return false;
            }
        }
        return true;
    }

    public final C3563H f() {
        return this.f442g;
    }

    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f442g + ')';
    }
}
