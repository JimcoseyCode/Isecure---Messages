package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import P8.q;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "LF/b1;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "g", "()Z", "b", "Z", "isPixelPhone", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk f15307a = new PreviewFreezeAfterHighSpeedRecordingQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean isPixelPhone;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    static {
        boolean z10;
        if (q.x(Build.BRAND, "google", true)) {
            String MODEL = Build.MODEL;
            AbstractC2855l.f(MODEL, "MODEL");
            z10 = q.I(MODEL, "Pixel", true);
        }
        isPixelPhone = z10;
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }

    public static final boolean g() {
        return isPixelPhone;
    }
}
