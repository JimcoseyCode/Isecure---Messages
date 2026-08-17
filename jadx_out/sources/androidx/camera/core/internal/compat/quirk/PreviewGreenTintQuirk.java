package androidx.camera.core.internal.compat.quirk;

import F.D1;
import F.E1;
import F.InterfaceC0471b1;
import P8.q;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import y.J0;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "LF/b1;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "h", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cameraId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ly/J0;", "appUseCases", "i", "(Ljava/lang/String;Ljava/util/Collection;)Z", "j", "g", "isMotoE20", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewGreenTintQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewGreenTintQuirk f15203a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    private final boolean g() {
        return q.x("motorola", Build.BRAND, true) && q.x("moto e20", Build.MODEL, true);
    }

    public static final boolean h() {
        return f15203a.g();
    }

    public static final boolean i(String cameraId, Collection appUseCases) {
        AbstractC2855l.g(cameraId, "cameraId");
        AbstractC2855l.g(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f15203a;
        if (previewGreenTintQuirk.g()) {
            return previewGreenTintQuirk.j(cameraId, appUseCases);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean j(String cameraId, Collection appUseCases) {
        boolean z10;
        boolean z11;
        if (AbstractC2855l.b(cameraId, "0") && appUseCases.size() == 2) {
            if (appUseCases.isEmpty()) {
                z10 = false;
                if (appUseCases.isEmpty()) {
                    Iterator it = appUseCases.iterator();
                    while (it.hasNext()) {
                        J0 j02 = (J0) it.next();
                        if (j02.l().b(D1.f1303G) && j02.l().G() == E1.b.VIDEO_CAPTURE) {
                            z11 = true;
                            break;
                        }
                    }
                    z11 = false;
                    if (!z10) {
                    }
                } else {
                    z11 = false;
                    if (!z10 && z11) {
                        return true;
                    }
                }
            } else {
                Iterator it2 = appUseCases.iterator();
                while (it2.hasNext()) {
                    if (((J0) it2.next()) instanceof p0) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (appUseCases.isEmpty()) {
                }
            }
        }
        return false;
    }
}
