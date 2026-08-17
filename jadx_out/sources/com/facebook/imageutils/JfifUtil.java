package com.facebook.imageutils;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/facebook/imageutils/JfifUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "orientation", "getAutoRotateAngleFromOrientation", "(I)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jpeg", "getOrientation", "([B)I", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)I", "markerToFind", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moveToMarker", "(Ljava/io/InputStream;I)Z", "marker", "a", "(I)Z", "b", "MARKER_FIRST_BYTE", "I", "MARKER_ESCAPE_BYTE", "MARKER_SOI", "MARKER_TEM", "MARKER_EOI", "MARKER_SOS", "MARKER_APP1", "MARKER_SOFn", "MARKER_RST0", "MARKER_RST7", "APP1_EXIF_MAGIC", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;
    public static final JfifUtil INSTANCE = new JfifUtil();
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    private JfifUtil() {
    }

    private final boolean a(int marker) {
        switch (marker) {
            case MARKER_SOFn /* 192 */:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private final int b(InputStream inputStream) throws IOException {
        if (moveToMarker(inputStream, MARKER_APP1)) {
            int packedInt = StreamProcessor.readPackedInt(inputStream, 2, false);
            if (packedInt - 2 > 6) {
                int packedInt2 = StreamProcessor.readPackedInt(inputStream, 4, false);
                int packedInt3 = StreamProcessor.readPackedInt(inputStream, 2, false);
                int i10 = packedInt - 8;
                if (packedInt2 == 1165519206 && packedInt3 == 0) {
                    return i10;
                }
            }
        }
        return 0;
    }

    public static final int getAutoRotateAngleFromOrientation(int orientation) {
        return TiffUtil.getAutoRotateAngleFromOrientation(orientation);
    }

    public static final int getOrientation(byte[] jpeg) {
        return getOrientation(new ByteArrayInputStream(jpeg));
    }

    public static final boolean moveToMarker(InputStream inputStream, int markerToFind) throws IOException {
        AbstractC2855l.g(inputStream, "inputStream");
        while (StreamProcessor.readPackedInt(inputStream, 1, false) == 255) {
            int packedInt = 255;
            while (packedInt == 255) {
                packedInt = StreamProcessor.readPackedInt(inputStream, 1, false);
            }
            if ((markerToFind == 192 && INSTANCE.a(packedInt)) || packedInt == markerToFind) {
                return true;
            }
            if (packedInt != 1 && packedInt != 216) {
                if (packedInt == 217 || packedInt == 218) {
                    break;
                }
                inputStream.skip(StreamProcessor.readPackedInt(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    public static final int getOrientation(InputStream inputStream) {
        AbstractC2855l.g(inputStream, "inputStream");
        try {
            int iB = INSTANCE.b(inputStream);
            if (iB == 0) {
                return 0;
            }
            return TiffUtil.readOrientationFromTIFF(inputStream, iB);
        } catch (IOException unused) {
            return 0;
        }
    }
}
