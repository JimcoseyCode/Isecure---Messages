package expo.modules.image;

import P8.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0003J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lexpo/modules/image/ResourceIdHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "idMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getResourceRawId", "context", "Landroid/content/Context;", "name", "getResourceUri", "Landroid/net/Uri;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceIdHelper {
    public static final ResourceIdHelper INSTANCE = new ResourceIdHelper();
    private static final Map<String, Integer> idMap = new LinkedHashMap();

    private ResourceIdHelper() {
    }

    @SuppressLint({"DiscouragedApi"})
    private final int getResourceRawId(Context context, String name) {
        if (name.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        String strE = q.E(lowerCase, "-", "_", false, 4, null);
        synchronized (this) {
            Map<String, Integer> map = idMap;
            Integer num = map.get(strE);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strE, "raw", context.getPackageName());
            map.put(strE, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri getResourceUri(Context context, String name) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(name, "name");
        Uri resourceDrawableUri = ResourceDrawableIdHelper.getResourceDrawableUri(context, name);
        if (!AbstractC2855l.b(resourceDrawableUri, Uri.EMPTY)) {
            return resourceDrawableUri;
        }
        int resourceRawId = getResourceRawId(context, name);
        if (resourceRawId > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(resourceRawId)).build();
        }
        return null;
    }
}
