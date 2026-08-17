package expo.modules.core;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/core/ModulePriorities;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "get", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packageName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "SUPPORTED_MODULES", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModulePriorities {
    public static final ModulePriorities INSTANCE = new ModulePriorities();
    private static final Map<String, Integer> SUPPORTED_MODULES = K.l(t.a("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), t.a("expo.modules.updates.UpdatesPackage", 10));

    private ModulePriorities() {
    }

    public final int get(String packageName) {
        Integer num;
        if (packageName == null || (num = SUPPORTED_MODULES.get(packageName)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
