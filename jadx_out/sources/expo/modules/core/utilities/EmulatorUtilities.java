package expo.modules.core.utilities;

import P8.q;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/core/utilities/EmulatorUtilities;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "isRunningOnEmulator", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmulatorUtilities {
    public static final EmulatorUtilities INSTANCE = new EmulatorUtilities();

    private EmulatorUtilities() {
    }

    public final boolean isRunningOnEmulator() {
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC2855l.f(FINGERPRINT, "FINGERPRINT");
        if (q.K(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(FINGERPRINT, "FINGERPRINT");
        if (q.K(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        AbstractC2855l.f(MODEL, "MODEL");
        if (q.Q(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(MODEL, "MODEL");
        Locale ROOT = Locale.ROOT;
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase = MODEL.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        if (q.Q(lowerCase, "droid4x", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(MODEL, "MODEL");
        if (q.Q(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(MODEL, "MODEL");
        if (q.Q(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC2855l.f(MANUFACTURER, "MANUFACTURER");
        if (q.Q(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        AbstractC2855l.f(HARDWARE, "HARDWARE");
        if (q.Q(HARDWARE, "goldfish", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(HARDWARE, "HARDWARE");
        if (q.Q(HARDWARE, "ranchu", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(HARDWARE, "HARDWARE");
        if (q.Q(HARDWARE, "vbox86", false, 2, null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "sdk", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "google_sdk", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "sdk_google", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "sdk_x86", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "vbox86p", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "emulator", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        if (q.Q(PRODUCT, "simulator", false, 2, null)) {
            return true;
        }
        String BOARD = Build.BOARD;
        AbstractC2855l.f(BOARD, "BOARD");
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase2 = BOARD.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase2, "toLowerCase(...)");
        if (q.Q(lowerCase2, "nox", false, 2, null)) {
            return true;
        }
        String BOOTLOADER = Build.BOOTLOADER;
        AbstractC2855l.f(BOOTLOADER, "BOOTLOADER");
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase3, "toLowerCase(...)");
        if (q.Q(lowerCase3, "nox", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(HARDWARE, "HARDWARE");
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase4 = HARDWARE.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase4, "toLowerCase(...)");
        if (q.Q(lowerCase4, "nox", false, 2, null)) {
            return true;
        }
        AbstractC2855l.f(PRODUCT, "PRODUCT");
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase5 = PRODUCT.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase5, "toLowerCase(...)");
        if (q.Q(lowerCase5, "nox", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        AbstractC2855l.f(BRAND, "BRAND");
        if (q.K(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            AbstractC2855l.f(DEVICE, "DEVICE");
            if (q.K(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
