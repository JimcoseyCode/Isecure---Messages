package expo.modules.asset;

import P8.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.errors.InvalidArgumentException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"ANDROID_EMBEDDED_URL_BASE_RESOURCE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "openAssetResourceStream", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "assetName", "openAndroidResStream", "resourceFilePath", "findResourceId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "findResourceIdForAndroidResPath", "expo-asset_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResourceAssetKt {
    public static final String ANDROID_EMBEDDED_URL_BASE_RESOURCE = "file:///android_res/";

    @SuppressLint({"DiscouragedApi"})
    private static final Integer findResourceId(Context context, String str) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Integer numValueOf = Integer.valueOf(resources.getIdentifier(str, "raw", packageName));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        Integer numValueOf2 = Integer.valueOf(resources.getIdentifier(str, "drawable", packageName));
        if (numValueOf2.intValue() != 0) {
            return numValueOf2;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static final Integer findResourceIdForAndroidResPath(Context context, String str) {
        if (!q.K(str, ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
            throw new InvalidArgumentException("Invalid resource file path: " + str);
        }
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() < 3) {
            throw new InvalidArgumentException("Invalid resource file path: " + str);
        }
        String str2 = pathSegments.get(1);
        AbstractC2855l.f(str2, "get(...)");
        String strW0 = q.W0(str2, '-', null, 2, null);
        String str3 = pathSegments.get(2);
        AbstractC2855l.d(str3);
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier(q.Y0(str3, '.', str3), strW0, context.getPackageName()));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final InputStream openAndroidResStream(Context context, String resourceFilePath) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(resourceFilePath, "resourceFilePath");
        Integer numFindResourceIdForAndroidResPath = findResourceIdForAndroidResPath(context, resourceFilePath);
        if (numFindResourceIdForAndroidResPath == null) {
            throw new Resources.NotFoundException(resourceFilePath);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numFindResourceIdForAndroidResPath.intValue());
        AbstractC2855l.f(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    public static final InputStream openAssetResourceStream(Context context, String assetName) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(assetName, "assetName");
        Integer numFindResourceId = findResourceId(context, assetName);
        if (numFindResourceId == null) {
            throw new Resources.NotFoundException(assetName);
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(numFindResourceId.intValue());
        AbstractC2855l.f(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
