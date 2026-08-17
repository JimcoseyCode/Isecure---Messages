package expo.modules.image;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/image/Trace;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "tag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTag", "()Ljava/lang/String;", "loadNewImageBlock", "getLoadNewImageBlock", "lastCookieValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNextCookieValue", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Trace {
    private static int lastCookieValue;
    public static final Trace INSTANCE = new Trace();
    private static final String tag = "ExpoImage";
    private static final String loadNewImageBlock = "load new image";

    private Trace() {
    }

    public final String getLoadNewImageBlock() {
        return loadNewImageBlock;
    }

    public final int getNextCookieValue() {
        int i10;
        synchronized (this) {
            i10 = lastCookieValue;
            lastCookieValue = i10 + 1;
        }
        return i10;
    }

    public final String getTag() {
        return tag;
    }
}
