package expo.modules.camera.utils;

import X0.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/camera/utils/CameraViewHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "LX0/a;", "exifInterface", "Landroid/os/Bundle;", "getExifData", "(LX0/a;)Landroid/os/Bundle;", "baseExif", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "exifMap", "Li7/B;", "setExifData", "(LX0/a;Ljava/util/Map;)V", "additionalExif", "addExifData", "(LX0/a;LX0/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", NotificationsService.EVENT_TYPE_KEY, "toValidExifRational", "(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "generateSimulatorPhoto", "(II)[B", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraViewHelper {
    public static final CameraViewHelper INSTANCE = new CameraViewHelper();

    private CameraViewHelper() {
    }

    public static final void addExifData(a baseExif, a additionalExif) throws Throwable {
        AbstractC2855l.g(baseExif, "baseExif");
        AbstractC2855l.g(additionalExif, "additionalExif");
        for (String[] strArr : ExifTagsKt.getExifTags()) {
            String str = strArr[1];
            String strK = additionalExif.k(str);
            if (strK != null) {
                baseExif.f0(str, strK);
            }
        }
        baseExif.a0();
    }

    public static final Bundle getExifData(a exifInterface) {
        AbstractC2855l.g(exifInterface, "exifInterface");
        Bundle bundle = new Bundle();
        for (String[] strArr : ExifTagsKt.getExifTags()) {
            String str = strArr[0];
            String str2 = strArr[1];
            if (exifInterface.k(str2) != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode == 104431 && str.equals("int")) {
                            bundle.putInt(str2, exifInterface.m(str2, 0));
                        }
                    } else if (str.equals("string")) {
                        bundle.putString(str2, exifInterface.k(str2));
                    }
                } else if (str.equals("double")) {
                    bundle.putDouble(str2, exifInterface.l(str2, 0.0d));
                }
            }
        }
        double[] dArrQ = exifInterface.q();
        if (dArrQ != null) {
            bundle.putDouble("GPSLatitude", dArrQ[0]);
            bundle.putDouble("GPSLongitude", dArrQ[1]);
            bundle.putDouble("GPSAltitude", exifInterface.j(0.0d));
        }
        return bundle;
    }

    public static final void setExifData(a baseExif, Map<String, ? extends Object> exifMap) throws IllegalArgumentException {
        AbstractC2855l.g(baseExif, "baseExif");
        AbstractC2855l.g(exifMap, "exifMap");
        for (String[] strArr : ExifTagsKt.getExifTags()) {
            String str = strArr[0];
            String str2 = strArr[1];
            Object obj = exifMap.get(str2);
            if (obj != null) {
                if (obj instanceof String) {
                    baseExif.f0(str2, (String) obj);
                } else if (obj instanceof Number) {
                    baseExif.f0(str2, INSTANCE.toValidExifRational((Number) obj, str));
                } else if (obj instanceof Boolean) {
                    baseExif.f0(str2, String.valueOf(((Boolean) obj).booleanValue()));
                }
            }
        }
        Object obj2 = exifMap.get("GPSLatitude");
        Object obj3 = exifMap.get("GPSLongitude");
        if ((obj2 instanceof Number) && (obj3 instanceof Number)) {
            baseExif.g0(((Number) obj2).doubleValue(), ((Number) obj3).doubleValue());
        }
        Object obj4 = exifMap.get("GPSAltitude");
        if (obj4 instanceof Number) {
            baseExif.e0(((Number) obj4).doubleValue());
        }
    }

    private final String toValidExifRational(Number value, String type) {
        if (!AbstractC2855l.b(type, "double")) {
            String plainString = new BigDecimal(String.valueOf(value.doubleValue())).toPlainString();
            AbstractC2855l.f(plainString, "toPlainString(...)");
            return plainString;
        }
        return AbstractC3624a.d(value.doubleValue() * 1000000) + "/1000000";
    }

    public final byte[] generateSimulatorPhoto(int width, int height) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        float f10 = width;
        float f11 = height;
        canvas.drawRect(0.0f, 0.0f, f10, f11, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-256);
        paint2.setTextSize(35.0f);
        canvas.drawText(new SimpleDateFormat("dd.MM.yy HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()), f10 * 0.1f, f11 * 0.9f, paint2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC2855l.d(byteArray);
        return byteArray;
    }
}
