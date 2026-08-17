package androidx.camera.video.internal.compat.quirk;

import P8.q;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "a", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f15305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f15306c;

    /* JADX INFO: renamed from: androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return PreviewBlackScreenQuirk.f15305b || PreviewBlackScreenQuirk.f15306c;
        }

        private Companion() {
        }
    }

    static {
        String str = Build.BRAND;
        f15305b = q.x(str, "motorola", true) && q.x(Build.MODEL, "motorola edge 20 fusion", true);
        f15306c = q.x(str, "samsung", true) && q.x(Build.MODEL, "sm-t580", true);
    }

    public static final boolean i() {
        return INSTANCE.a();
    }
}
