package expo.modules.image;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/image/CustomOptions;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lv1/g;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "tintColor", "Lv1/g;", "getTintColor", "()Lv1/g;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomOptions {
    public static final CustomOptions INSTANCE = new CustomOptions();
    private static final g tintColor;

    static {
        g gVarE = g.e("ExpoTintColor");
        AbstractC2855l.f(gVarE, "memory(...)");
        tintColor = gVarE;
    }

    private CustomOptions() {
    }

    public final g getTintColor() {
        return tintColor;
    }
}
