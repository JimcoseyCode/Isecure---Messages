package expo.modules.camera;

import android.graphics.Bitmap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toByteArray", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/graphics/Bitmap;", "expo-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CameraViewHelperKt {
    public static final byte[] toByteArray(Bitmap bitmap) {
        AbstractC2855l.g(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC2855l.f(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
