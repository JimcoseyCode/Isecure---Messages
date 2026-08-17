package expo.modules.image.thumbhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import q7.AbstractC3130c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashDecoder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "thumbHashToRGBA", "Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;", "hash", PointerEventHelper.POINTER_TYPE_UNKNOWN, "thumbHashToBitmap", "Landroid/graphics/Bitmap;", "thumbHashToAverageRGBA", "Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;", "thumbHashToApproximateAspectRatio", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Image", "RGBA", "Channel", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThumbhashDecoder {
    public static final ThumbhashDecoder INSTANCE = new ThumbhashDecoder();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nx", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ny", "<init>", "(II)V", "ac", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAc", "()[F", "setAc", "([F)V", "decode", "hash", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, "index", "scale", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Channel {
        private float[] ac;

        public Channel(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                for (int i14 = i12 > 0 ? 0 : 1; i14 * i11 < (i11 - i12) * i10; i14++) {
                    i13++;
                }
                i12++;
            }
            this.ac = new float[i13];
        }

        public final int decode(byte[] hash, int start, int index, float scale) {
            AbstractC2855l.g(hash, "hash");
            int length = this.ac.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.ac[i10] = ((((hash[(index >> 1) + start] >> ((index & 1) << 2)) & 15) / 7.5f) - 1.0f) * scale;
                index++;
            }
            return index;
        }

        public final float[] getAc() {
            return this.ac;
        }

        public final void setAc(float[] fArr) {
            AbstractC2855l.g(fArr, "<set-?>");
            this.ac = fArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "rgba", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(II[B)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "getRgba", "()[B", "setRgba", "([B)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image {
        private int height;
        private byte[] rgba;
        private int width;

        public Image(int i10, int i11, byte[] rgba) {
            AbstractC2855l.g(rgba, "rgba");
            this.width = i10;
            this.height = i11;
            this.rgba = rgba;
        }

        public final int getHeight() {
            return this.height;
        }

        public final byte[] getRgba() {
            return this.rgba;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setHeight(int i10) {
            this.height = i10;
        }

        public final void setRgba(byte[] bArr) {
            AbstractC2855l.g(bArr, "<set-?>");
            this.rgba = bArr;
        }

        public final void setWidth(int i10) {
            this.width = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "r", PointerEventHelper.POINTER_TYPE_UNKNOWN, "g", "b", "a", "<init>", "(FFFF)V", "getR", "()F", "setR", "(F)V", "getG", "setG", "getB", "setB", "getA", "setA", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RGBA {
        private float a;
        private float b;
        private float g;
        private float r;

        public RGBA(float f10, float f11, float f12, float f13) {
            this.r = f10;
            this.g = f11;
            this.b = f12;
            this.a = f13;
        }

        public final float getA() {
            return this.a;
        }

        public final float getB() {
            return this.b;
        }

        public final float getG() {
            return this.g;
        }

        public final float getR() {
            return this.r;
        }

        public final void setA(float f10) {
            this.a = f10;
        }

        public final void setB(float f10) {
            this.b = f10;
        }

        public final void setG(float f10) {
            this.g = f10;
        }

        public final void setR(float f10) {
            this.r = f10;
        }
    }

    private ThumbhashDecoder() {
    }

    public final float thumbHashToApproximateAspectRatio(byte[] hash) {
        AbstractC2855l.g(hash, "hash");
        byte b10 = hash[3];
        boolean z10 = (hash[2] & 128) != 0;
        boolean z11 = (hash[4] & 128) != 0;
        int i10 = 5;
        int i11 = z11 ? z10 ? 5 : 7 : b10 & 7;
        if (z11) {
            i10 = b10 & 7;
        } else if (!z10) {
            i10 = 7;
        }
        return i11 / i10;
    }

    public final RGBA thumbHashToAverageRGBA(byte[] hash) {
        AbstractC2855l.g(hash, "hash");
        float f10 = (r0 & 63) / 63.0f;
        float f11 = (((r0 >> 6) & 63) / 31.5f) - 1.0f;
        float f12 = (((r0 >> 12) & 63) / 31.5f) - 1.0f;
        float f13 = f10 - (f11 * 0.6666667f);
        float f14 = (((f10 * 3.0f) - f13) + f12) / 2.0f;
        return new RGBA(Math.max(0.0f, Math.min(1.0f, f14)), Math.max(0.0f, Math.min(1.0f, f14 - f12)), Math.max(0.0f, Math.min(1.0f, f13)), ((((hash[0] & 255) | ((hash[1] & 255) << 8)) | ((hash[2] & 255) << 16)) >> 23) != 0 ? (hash[5] & 15) / 15.0f : 1.0f);
    }

    public final Bitmap thumbHashToBitmap(byte[] hash) {
        AbstractC2855l.g(hash, "hash");
        Image imageThumbHashToRGBA = thumbHashToRGBA(hash);
        int[] iArr = new int[imageThumbHashToRGBA.getWidth() * imageThumbHashToRGBA.getHeight()];
        byte[] rgba = imageThumbHashToRGBA.getRgba();
        ArrayList arrayList = new ArrayList(rgba.length);
        int i10 = 0;
        for (byte b10 : rgba) {
            arrayList.add(Integer.valueOf(v.j(b10) & 255));
        }
        int iB = AbstractC3130c.b(0, arrayList.size() - 1, 4);
        if (iB >= 0) {
            while (true) {
                iArr[i10 / 4] = Color.argb(((Number) arrayList.get(i10 + 3)).intValue(), ((Number) arrayList.get(i10)).intValue(), ((Number) arrayList.get(i10 + 1)).intValue(), ((Number) arrayList.get(i10 + 2)).intValue());
                if (i10 == iB) {
                    break;
                }
                i10 += 4;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, imageThumbHashToRGBA.getWidth(), imageThumbHashToRGBA.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final Image thumbHashToRGBA(byte[] hash) {
        float f10;
        int i10;
        Channel channel;
        int i11;
        int i12;
        int i13;
        AbstractC2855l.g(hash, "hash");
        int i14 = (hash[0] & 255) | ((hash[1] & 255) << 8) | ((hash[2] & 255) << 16);
        int i15 = (hash[3] & 255) | ((hash[4] & 255) << 8);
        float f11 = (i14 & 63) / 63.0f;
        float f12 = (((i14 >> 6) & 63) / 31.5f) - 1.0f;
        float f13 = (((i14 >> 12) & 63) / 31.5f) - 1.0f;
        float f14 = ((i14 >> 18) & 31) / 31.0f;
        boolean z10 = (i14 >> 23) != 0;
        float f15 = ((i15 >> 3) & 63) / 63.0f;
        float f16 = ((i15 >> 9) & 63) / 63.0f;
        boolean z11 = (i15 >> 15) != 0;
        int i16 = 7;
        int iMax = Math.max(3, z11 ? z10 ? 5 : 7 : i15 & 7);
        if (z11) {
            i16 = 7 & i15;
        } else if (z10) {
            i16 = 5;
        }
        int iMax2 = Math.max(3, i16);
        float f17 = z10 ? (hash[5] & 15) / 15.0f : 1.0f;
        float f18 = ((hash[5] >> 4) & 15) / 15.0f;
        if (z10) {
            f10 = 1.0f;
            i10 = 6;
        } else {
            f10 = 1.0f;
            i10 = 5;
        }
        Channel channel2 = new Channel(iMax, iMax2);
        Channel channel3 = new Channel(3, 3);
        boolean z12 = z10;
        Channel channel4 = new Channel(3, 3);
        int iDecode = channel4.decode(hash, i10, channel3.decode(hash, i10, channel2.decode(hash, i10, 0, f14), f15 * 1.25f), f16 * 1.25f);
        float[] ac = null;
        if (z12) {
            channel = new Channel(5, 5);
            channel.decode(hash, i10, iDecode, f18);
        } else {
            channel = null;
        }
        float[] ac2 = channel2.getAc();
        float[] ac3 = channel3.getAc();
        float[] ac4 = channel4.getAc();
        if (z12) {
            AbstractC2855l.d(channel);
            ac = channel.getAc();
        }
        float fThumbHashToApproximateAspectRatio = thumbHashToApproximateAspectRatio(hash);
        int iRound = Math.round(fThumbHashToApproximateAspectRatio > f10 ? 32.0f : fThumbHashToApproximateAspectRatio * 32.0f);
        int iRound2 = Math.round(fThumbHashToApproximateAspectRatio > f10 ? 32.0f / fThumbHashToApproximateAspectRatio : 32.0f);
        byte[] bArr = new byte[iRound * iRound2 * 4];
        int iMax3 = Math.max(iMax, z12 ? 5 : 3);
        int iMax4 = Math.max(iMax2, z12 ? 5 : 3);
        float[] fArr = new float[iMax3];
        float[] fArr2 = new float[iMax4];
        int i17 = 0;
        int i18 = 0;
        while (i17 < iRound2) {
            float[] fArr3 = ac4;
            int i19 = 0;
            while (i19 < iRound) {
                float[] fArr4 = ac2;
                int i20 = 0;
                while (i20 < iMax3) {
                    fArr[i20] = (float) Math.cos((3.141592653589793d / ((double) iRound)) * ((double) (i19 + 0.5f)) * ((double) i20));
                    i20++;
                    f11 = f11;
                    iMax = iMax;
                }
                int i21 = iMax;
                float f19 = f11;
                int i22 = 0;
                while (i22 < iMax4) {
                    fArr2[i22] = (float) Math.cos((3.141592653589793d / ((double) iRound2)) * ((double) (i17 + 0.5f)) * ((double) i22));
                    i22++;
                    i19 = i19;
                    i17 = i17;
                }
                int i23 = i17;
                int i24 = i19;
                float f20 = f19;
                int i25 = 0;
                int i26 = 0;
                while (i25 < iMax2) {
                    float f21 = fArr2[i25] * 2.0f;
                    int i27 = i25 > 0 ? 0 : 1;
                    int i28 = i25;
                    while (true) {
                        i13 = i26;
                        if (i27 * iMax2 < i21 * (iMax2 - i28)) {
                            f20 += fArr4[i13] * fArr[i27] * f21;
                            i27++;
                            i26 = i13 + 1;
                        }
                    }
                    i25 = i28 + 1;
                    i26 = i13;
                }
                float f22 = f12;
                float f23 = f13;
                int i29 = 0;
                int i30 = 0;
                while (i29 < 3) {
                    float f24 = fArr2[i29] * 2.0f;
                    int i31 = i29 > 0 ? 0 : 1;
                    while (true) {
                        i12 = i29;
                        if (i31 < 3 - i12) {
                            float f25 = fArr[i31] * f24;
                            f22 += ac3[i30] * f25;
                            f23 += fArr3[i30] * f25;
                            i31++;
                            i30++;
                            i29 = i12;
                        }
                    }
                    i29 = i12 + 1;
                }
                float f26 = f17;
                if (z12) {
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < 5) {
                        float f27 = fArr2[i32] * 2.0f;
                        int i34 = i32 > 0 ? 0 : 1;
                        while (true) {
                            i11 = i32;
                            if (i34 < 5 - i11) {
                                AbstractC2855l.d(ac);
                                f26 += ac[i33] * fArr[i34] * f27;
                                i34++;
                                i33++;
                                i32 = i11;
                            }
                        }
                        i32 = i11 + 1;
                    }
                }
                float f28 = f20 - (f22 * 0.6666667f);
                float f29 = (((f20 * 3.0f) - f28) + f23) / 2.0f;
                bArr[i18] = (byte) Math.max(0, Math.round(Math.min(f10, f29) * 255.0f));
                bArr[i18 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f29 - f23) * 255.0f));
                bArr[i18 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f28) * 255.0f));
                bArr[i18 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f26) * 255.0f));
                i19 = i24 + 1;
                i18 += 4;
                f10 = 1.0f;
                ac2 = fArr4;
                f11 = f19;
                iMax = i21;
                i17 = i23;
            }
            i17++;
            ac4 = fArr3;
            ac2 = ac2;
            f11 = f11;
        }
        return new Image(iRound, iRound2, bArr);
    }
}
