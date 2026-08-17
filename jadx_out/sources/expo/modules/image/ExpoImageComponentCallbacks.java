package expo.modules.image;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.blurhash.BlurhashDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/image/ExpoImageComponentCallbacks;", "Landroid/content/ComponentCallbacks2;", "<init>", "()V", "Landroid/content/res/Configuration;", "newConfig", "Li7/B;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", PointerEventHelper.POINTER_TYPE_UNKNOWN, "level", "onTrimMemory", "(I)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoImageComponentCallbacks implements ComponentCallbacks2 {
    public static final ExpoImageComponentCallbacks INSTANCE = new ExpoImageComponentCallbacks();

    private ExpoImageComponentCallbacks() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        BlurhashDecoder.INSTANCE.clearCache();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        if (level == 15) {
            onLowMemory();
        }
    }
}
