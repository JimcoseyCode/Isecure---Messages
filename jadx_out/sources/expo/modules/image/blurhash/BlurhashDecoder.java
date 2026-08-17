package expo.modules.image.blurhash;

import B7.d;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010$J;\u0010+\u001a\u00020**\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u0010\u0003J=\u00103\u001a\u0004\u0018\u00010\u001e2\b\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b3\u00104R0\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"05j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R0\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"05j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lexpo/modules/image/blurhash/BlurhashDecoder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "str", PointerEventHelper.POINTER_TYPE_UNKNOWN, "from", "to", "decode83", "(Ljava/lang/String;II)I", "colorEnc", PointerEventHelper.POINTER_TYPE_UNKNOWN, "decodeDc", "(I)[F", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "maxAc", "decodeAc", "(IF)[F", "signedPow2", "(F)F", "width", "height", "numCompX", "numCompY", PointerEventHelper.POINTER_TYPE_UNKNOWN, "colors", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useCache", "Landroid/graphics/Bitmap;", "composeBitmap", "(IIII[[FZ)Landroid/graphics/Bitmap;", "calculate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getArrayForCosinesY", "(ZII)[D", "getArrayForCosinesX", "x", "numComp", "y", "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCos", "([DZIIII)D", "linearToSrgb", "(F)I", "Li7/B;", "clearCache", "blurHash", "punch", "decode", "(Ljava/lang/String;IIFZ)Landroid/graphics/Bitmap;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cacheCosinesX", "Ljava/util/HashMap;", "cacheCosinesY", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "charMap", "Ljava/util/Map;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurhashDecoder {
    public static final BlurhashDecoder INSTANCE = new BlurhashDecoder();
    private static final HashMap<Integer, double[]> cacheCosinesX = new HashMap<>();
    private static final HashMap<Integer, double[]> cacheCosinesY = new HashMap<>();
    private static final Map<Character, Integer> charMap;

    static {
        List listM = AbstractC2800q.m('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
        int i10 = 0;
        for (Object obj : listM) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            Character ch = (Character) obj;
            ch.charValue();
            arrayList.add(t.a(ch, Integer.valueOf(i10)));
            i10 = i11;
        }
        charMap = K.r(arrayList);
    }

    private BlurhashDecoder() {
    }

    private final Bitmap composeBitmap(int width, int height, int numCompX, int numCompY, float[][] colors, boolean useCache) {
        int i10 = width;
        int i11 = height;
        int i12 = numCompX;
        int i13 = numCompY;
        int[] iArr = new int[i10 * i11];
        boolean z10 = (useCache && cacheCosinesX.containsKey(Integer.valueOf(i10 * i12))) ? false : true;
        double[] arrayForCosinesX = getArrayForCosinesX(z10, i10, i12);
        boolean z11 = (useCache && cacheCosinesY.containsKey(Integer.valueOf(i11 * i13))) ? false : true;
        double[] arrayForCosinesY = getArrayForCosinesY(z11, i11, i13);
        int i14 = 0;
        while (i14 < i11) {
            int i15 = 0;
            while (i15 < i10) {
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                int i16 = 0;
                while (i16 < i13) {
                    float f13 = f12;
                    float f14 = f11;
                    float f15 = f10;
                    int i17 = 0;
                    while (i17 < i12) {
                        double cos = getCos(arrayForCosinesX, z10, i17, i12, i15, i10);
                        int i18 = i11;
                        int i19 = i13;
                        double[] dArr = arrayForCosinesX;
                        double[] dArr2 = arrayForCosinesY;
                        int i20 = i17;
                        int i21 = i16;
                        boolean z12 = z10;
                        boolean z13 = z11;
                        int i22 = i15;
                        int i23 = i14;
                        float cos2 = (float) (cos * getCos(dArr2, z13, i21, i19, i23, i18));
                        float[] fArr = colors[(i21 * numCompX) + i20];
                        f15 += fArr[0] * cos2;
                        f13 += fArr[1] * cos2;
                        f14 += fArr[2] * cos2;
                        int i24 = i20 + 1;
                        i11 = i18;
                        i10 = i10;
                        arrayForCosinesY = dArr2;
                        i14 = i23;
                        z10 = z12;
                        i15 = i22;
                        i12 = numCompX;
                        z11 = z13;
                        i16 = i21;
                        i17 = i24;
                        arrayForCosinesX = dArr;
                        i13 = numCompY;
                    }
                    i11 = i11;
                    i10 = i10;
                    f10 = f15;
                    z10 = z10;
                    i15 = i15;
                    f11 = f14;
                    f12 = f13;
                    i12 = numCompX;
                    z11 = z11;
                    i16++;
                    arrayForCosinesX = arrayForCosinesX;
                    i13 = numCompY;
                }
                int i25 = i11;
                int i26 = i10;
                double[] dArr3 = arrayForCosinesX;
                boolean z14 = z11;
                int i27 = i15;
                iArr[(i26 * i14) + i27] = Color.rgb(linearToSrgb(f10), linearToSrgb(f12), linearToSrgb(f11));
                int i28 = i27 + 1;
                i11 = i25;
                i10 = i26;
                z11 = z14;
                z10 = z10;
                i12 = numCompX;
                i15 = i28;
                arrayForCosinesX = dArr3;
                i13 = numCompY;
            }
            i14++;
            i11 = i11;
            i10 = i10;
            arrayForCosinesX = arrayForCosinesX;
            i12 = numCompX;
            i13 = numCompY;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i10, i11, Bitmap.Config.ARGB_8888);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap decode$default(BlurhashDecoder blurhashDecoder, String str, int i10, int i11, float f10, boolean z10, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i12 & 16) != 0) {
            z10 = true;
        }
        return blurhashDecoder.decode(str, i10, i11, f11, z10);
    }

    private final int decode83(String str, int from, int to) {
        int i10 = 0;
        while (from < to) {
            Integer num = charMap.get(Character.valueOf(str.charAt(from)));
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue != -1) {
                i10 = (i10 * 83) + iIntValue;
            }
            from++;
        }
        return i10;
    }

    static /* synthetic */ int decode83$default(BlurhashDecoder blurhashDecoder, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return blurhashDecoder.decode83(str, i10, i11);
    }

    private final float[] decodeAc(int value, float maxAc) {
        return new float[]{signedPow2(((value / 361) - 9) / 9.0f) * maxAc, signedPow2((((value / 19) % 19) - 9) / 9.0f) * maxAc, signedPow2(((value % 19) - 9) / 9.0f) * maxAc};
    }

    private final float[] decodeDc(int colorEnc) {
        BlurhashHelpers blurhashHelpers = BlurhashHelpers.INSTANCE;
        return new float[]{blurhashHelpers.srgbToLinear(colorEnc >> 16), blurhashHelpers.srgbToLinear((colorEnc >> 8) & 255), blurhashHelpers.srgbToLinear(colorEnc & 255)};
    }

    private final double[] getArrayForCosinesX(boolean calculate, int width, int numCompX) {
        if (!calculate) {
            double[] dArr = cacheCosinesX.get(Integer.valueOf(width * numCompX));
            AbstractC2855l.d(dArr);
            return dArr;
        }
        int i10 = width * numCompX;
        double[] dArr2 = new double[i10];
        cacheCosinesX.put(Integer.valueOf(i10), dArr2);
        return dArr2;
    }

    private final double[] getArrayForCosinesY(boolean calculate, int height, int numCompY) {
        if (!calculate) {
            double[] dArr = cacheCosinesY.get(Integer.valueOf(height * numCompY));
            AbstractC2855l.d(dArr);
            return dArr;
        }
        int i10 = height * numCompY;
        double[] dArr2 = new double[i10];
        cacheCosinesY.put(Integer.valueOf(i10), dArr2);
        return dArr2;
    }

    private final double getCos(double[] dArr, boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            dArr[(i11 * i12) + i10] = Math.cos(((((double) i12) * 3.141592653589793d) * ((double) i10)) / ((double) i13));
        }
        return dArr[i10 + (i11 * i12)];
    }

    private final int linearToSrgb(float value) {
        float fPow;
        float f10;
        float fK = d.k(value, 0.0f, 1.0f);
        if (fK <= 0.0031308f) {
            fPow = fK * 12.92f;
            f10 = 255.0f;
        } else {
            fPow = (((float) Math.pow(fK, 0.41666666f)) * 1.055f) - 0.055f;
            f10 = 255;
        }
        return (int) ((fPow * f10) + 0.5f);
    }

    private final float signedPow2(float value) {
        return Math.copySign((float) Math.pow(value, 2.0f), value);
    }

    public final void clearCache() {
        cacheCosinesX.clear();
        cacheCosinesY.clear();
    }

    public final Bitmap decode(String blurHash, int width, int height, float punch, boolean useCache) {
        float[] fArrDecodeAc;
        if (blurHash == null || blurHash.length() < 6) {
            return null;
        }
        int iDecode83 = decode83(blurHash, 0, 1);
        int i10 = (iDecode83 % 9) + 1;
        int i11 = (iDecode83 / 9) + 1;
        if (blurHash.length() != (i10 * 2 * i11) + 4) {
            return null;
        }
        float fDecode83 = (decode83(blurHash, 1, 2) + 1) / 166.0f;
        int i12 = i10 * i11;
        float[][] fArr = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                BlurhashDecoder blurhashDecoder = INSTANCE;
                fArrDecodeAc = blurhashDecoder.decodeDc(blurhashDecoder.decode83(blurHash, 2, 6));
            } else {
                int i14 = i13 * 2;
                BlurhashDecoder blurhashDecoder2 = INSTANCE;
                fArrDecodeAc = blurhashDecoder2.decodeAc(blurhashDecoder2.decode83(blurHash, i14 + 4, i14 + 6), fDecode83 * punch);
            }
            fArr[i13] = fArrDecodeAc;
        }
        return composeBitmap(width, height, i10, i11, fArr, useCache);
    }
}
