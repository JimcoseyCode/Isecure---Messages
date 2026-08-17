package androidx.camera.extensions.internal.compat.quirk;

import F.InterfaceC0471b1;
import P8.q;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/extensions/internal/compat/quirk/AvoidPostviewAvailabilityCheckQuirk;", "LF/b1;", "<init>", "()V", "a", "camera-extensions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvoidPostviewAvailabilityCheckQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return q.x("Xiaomi", Build.BRAND, true) && q.x("dada", Build.DEVICE, true);
        }

        private Companion() {
        }
    }

    public static final boolean g() {
        return INSTANCE.a();
    }
}
