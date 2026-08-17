package expo.modules.core.utilities;

import P8.q;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/core/utilities/VRUtilities;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VRUtilities {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String HZOS_CAMERA_PERMISSION = "horizonos.permission.HEADSET_CAMERA";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lexpo/modules/core/utilities/VRUtilities$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "HZOS_CAMERA_PERMISSION", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isQuest", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isQuest() {
            String str = Build.MANUFACTURER;
            if (q.x(str, "Oculus", true) || q.x(str, "Meta", true)) {
                String MODEL = Build.MODEL;
                AbstractC2855l.f(MODEL, "MODEL");
                if (q.Q(MODEL, "Quest", false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
