package expo.modules.intentlauncher;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.K;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"REQUEST_CODE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ATTR_EXTRA", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ATTR_DATA", "toBundle", "Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-intent-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IntentLauncherModuleKt {
    private static final String ATTR_DATA = "data";
    private static final String ATTR_EXTRA = "extra";
    private static final int REQUEST_CODE = 12;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle toBundle(Map<String, ? extends Object> map) {
        Pair[] pairArr = (Pair[]) K.x(map).toArray(new Pair[0]);
        return D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
