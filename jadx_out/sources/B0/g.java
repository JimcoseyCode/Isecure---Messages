package b0;

import Z.AbstractC1579s;
import Z.C1578q;
import h0.C2691e;
import java.io.File;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f18625b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1579s f18626a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(AbstractC1579s outputOptions) {
        AbstractC2855l.g(outputOptions, "outputOptions");
        this.f18626a = outputOptions;
    }

    @Override // b0.f
    public long a() {
        try {
            AbstractC1579s abstractC1579s = this.f18626a;
            if (abstractC1579s instanceof C1578q) {
                File parentFile = ((C1578q) abstractC1579s).d().getParentFile();
                AbstractC2855l.d(parentFile);
                return C2691e.b(parentFile);
            }
            throw new AssertionError("Unknown OutputOptions: " + this.f18626a);
        } catch (RuntimeException e10) {
            AbstractC3583h0.m("OutputStorageImpl", "Fail to access the available bytes.", e10);
            return Long.MAX_VALUE;
        }
    }
}
