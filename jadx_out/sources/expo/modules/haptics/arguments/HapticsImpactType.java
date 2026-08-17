package expo.modules.haptics.arguments;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsImpactType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "types", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/haptics/arguments/HapticsVibrationType;", "fromString", "style", "expo-haptics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HapticsImpactType {
    public static final HapticsImpactType INSTANCE = new HapticsImpactType();
    private static final Map<String, HapticsVibrationType> types = K.l(t.a("light", new HapticsVibrationType(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), t.a("soft", new HapticsVibrationType(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), t.a("medium", new HapticsVibrationType(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), t.a("rigid", new HapticsVibrationType(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), t.a("heavy", new HapticsVibrationType(new long[]{0, 60}, new int[]{0, 70}, new long[]{0, 61})));

    private HapticsImpactType() {
    }

    public final HapticsVibrationType fromString(String style) throws HapticsInvalidArgumentException {
        AbstractC2855l.g(style, "style");
        HapticsVibrationType hapticsVibrationType = types.get(style);
        if (hapticsVibrationType != null) {
            return hapticsVibrationType;
        }
        throw new HapticsInvalidArgumentException("'style' must be one of ['light', 'medium', 'heavy', 'rigid', 'soft']. Obtained " + style + "'.");
    }
}
