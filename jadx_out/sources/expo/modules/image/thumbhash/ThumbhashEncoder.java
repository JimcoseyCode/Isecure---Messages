package expo.modules.image.thumbhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashEncoder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "encode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bitmap", "Landroid/graphics/Bitmap;", "resizeKeepingAspectRatio", "maxSize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Channel", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThumbhashEncoder {
    public static final ThumbhashEncoder INSTANCE = new ThumbhashEncoder();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0014J\u001e\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006%"}, d2 = {"Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "nx", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ny", "<init>", "(II)V", "getNx", "()I", "setNx", "(I)V", "getNy", "setNy", "dc", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getDc", "()F", "setDc", "(F)V", "ac", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAc", "()[F", "setAc", "([F)V", "scale", "getScale", "setScale", "encode", "w", "h", "channel", "writeTo", "hash", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, "index", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Channel {
        private float[] ac;
        private float dc;
        private int nx;
        private int ny;
        private float scale;

        public Channel(int i10, int i11) {
            this.nx = i10;
            this.ny = i11;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i12 > 0 ? 0 : 1;
                while (true) {
                    int i15 = this.ny;
                    if (i14 * i15 < this.nx * (i15 - i12)) {
                        i13++;
                        i14++;
                    }
                }
                i12++;
            }
            this.ac = new float[i13];
        }

        public final Channel encode(int w10, int h10, float[] channel) {
            double d10;
            int i10 = h10;
            AbstractC2855l.g(channel, "channel");
            float[] fArr = new float[w10];
            int i11 = this.ny;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = 0;
                while (true) {
                    int i15 = this.ny;
                    if (i14 * i15 < this.nx * (i15 - i12)) {
                        int i16 = 0;
                        while (true) {
                            d10 = 3.141592653589793d;
                            if (i16 >= w10) {
                                break;
                            }
                            fArr[i16] = (float) Math.cos((3.141592653589793d / ((double) w10)) * ((double) i14) * ((double) (i16 + 0.5f)));
                            i16++;
                        }
                        int i17 = 0;
                        float f10 = 0.0f;
                        while (i17 < i10) {
                            double d11 = d10;
                            float fCos = (float) Math.cos((d11 / ((double) i10)) * ((double) i12) * ((double) (i17 + 0.5f)));
                            for (int i18 = 0; i18 < w10; i18++) {
                                f10 += channel[(i17 * w10) + i18] * fArr[i18] * fCos;
                            }
                            i17++;
                            i10 = h10;
                            d10 = d11;
                        }
                        float f11 = f10 / (w10 * h10);
                        if (i14 > 0 || i12 > 0) {
                            this.ac[i13] = f11;
                            this.scale = Math.max(this.scale, Math.abs(f11));
                            i13++;
                        } else {
                            this.dc = f11;
                        }
                        i14++;
                        i10 = h10;
                    }
                }
                i12++;
                i10 = h10;
            }
            if (this.scale > 0.0f) {
                int length = this.ac.length;
                for (int i19 = 0; i19 < length; i19++) {
                    float[] fArr2 = this.ac;
                    fArr2[i19] = ((0.5f / this.scale) * fArr2[i19]) + 0.5f;
                }
            }
            return this;
        }

        public final float[] getAc() {
            return this.ac;
        }

        public final float getDc() {
            return this.dc;
        }

        public final int getNx() {
            return this.nx;
        }

        public final int getNy() {
            return this.ny;
        }

        public final float getScale() {
            return this.scale;
        }

        public final void setAc(float[] fArr) {
            AbstractC2855l.g(fArr, "<set-?>");
            this.ac = fArr;
        }

        public final void setDc(float f10) {
            this.dc = f10;
        }

        public final void setNx(int i10) {
            this.nx = i10;
        }

        public final void setNy(int i10) {
            this.ny = i10;
        }

        public final void setScale(float f10) {
            this.scale = f10;
        }

        public final int writeTo(byte[] hash, int start, int index) {
            AbstractC2855l.g(hash, "hash");
            for (float f10 : this.ac) {
                int i10 = (index >> 1) + start;
                hash[i10] = (byte) ((Math.round(f10 * 15.0f) << ((index & 1) << 2)) | hash[i10]);
                index++;
            }
            return index;
        }
    }

    private ThumbhashEncoder() {
    }

    private final Bitmap resizeKeepingAspectRatio(Bitmap bitmap, int maxSize) {
        int i10;
        float width = bitmap.getWidth() / bitmap.getHeight();
        if (width > 1.0f) {
            i10 = (int) (maxSize / width);
        } else {
            int i11 = (int) (maxSize * width);
            i10 = maxSize;
            maxSize = i11;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, maxSize, i10, true);
        AbstractC2855l.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    public final byte[] encode(Bitmap bitmap) {
        int length;
        AbstractC2855l.g(bitmap, "bitmap");
        Bitmap bitmapResizeKeepingAspectRatio = resizeKeepingAspectRatio(bitmap, 100);
        int width = bitmapResizeKeepingAspectRatio.getWidth();
        int height = bitmapResizeKeepingAspectRatio.getHeight();
        int i10 = width * height;
        bitmapResizeKeepingAspectRatio.getPixels(new int[i10], 0, width, 0, 0, width, height);
        float f10 = 0.0f;
        float fRed = 0.0f;
        float fGreen = 0.0f;
        float fBlue = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float fAlpha = Color.alpha(r4[i11]) / 255.0f;
            float f11 = fAlpha / 255.0f;
            fRed += Color.red(r4[i11]) * f11;
            fGreen += Color.green(r4[i11]) * f11;
            fBlue += f11 * Color.blue(r4[i11]);
            f10 += fAlpha;
        }
        if (f10 > 0.0f) {
            fRed /= f10;
            fGreen /= f10;
            fBlue /= f10;
        }
        boolean z10 = f10 < ((float) i10);
        int i12 = z10 ? 5 : 7;
        int iMax = Math.max(1, Math.round((i12 * width) / Math.max(width, height)));
        int iMax2 = Math.max(1, Math.round((i12 * height) / Math.max(width, height)));
        float[] fArr = new float[i10];
        float[] fArr2 = new float[i10];
        float[] fArr3 = new float[i10];
        float[] fArr4 = new float[i10];
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i10;
            float fAlpha2 = (Color.alpha(r4[i13]) & 255) / 255.0f;
            float f12 = 1.0f - fAlpha2;
            float f13 = fAlpha2 / 255.0f;
            float fRed2 = (fRed * f12) + (Color.red(r4[i13]) * f13);
            float fGreen2 = (fGreen * f12) + (Color.green(r4[i13]) * f13);
            float fBlue2 = (f12 * fBlue) + (f13 * Color.blue(r4[i13]));
            float f14 = fRed2 + fGreen2;
            fArr[i13] = (f14 + fBlue2) / 3.0f;
            fArr2[i13] = (f14 / 2.0f) - fBlue2;
            fArr3[i13] = fRed2 - fGreen2;
            fArr4[i13] = fAlpha2;
            i13++;
            i10 = i14;
        }
        Channel channelEncode = new Channel(Math.max(3, iMax), Math.max(3, iMax2)).encode(width, height, fArr);
        Channel channelEncode2 = new Channel(3, 3).encode(width, height, fArr2);
        Channel channelEncode3 = new Channel(3, 3).encode(width, height, fArr3);
        Channel channelEncode4 = z10 ? new Channel(5, 5).encode(width, height, fArr4) : null;
        boolean z11 = width > height;
        int iRound = Math.round(channelEncode.getDc() * 63.0f) | (Math.round((channelEncode2.getDc() * 31.5f) + 31.5f) << 6) | (Math.round((channelEncode3.getDc() * 31.5f) + 31.5f) << 12) | (Math.round(channelEncode.getScale() * 31.0f) << 18) | (z10 ? 8388608 : 0);
        if (z11) {
            iMax = iMax2;
        }
        int iRound2 = (z11 ? 32768 : 0) | (Math.round(channelEncode3.getScale() * 63.0f) << 9) | (Math.round(channelEncode2.getScale() * 63.0f) << 3) | iMax;
        int i15 = z10 ? 6 : 5;
        int length2 = channelEncode.getAc().length + channelEncode2.getAc().length + channelEncode3.getAc().length;
        if (z10) {
            AbstractC2855l.d(channelEncode4);
            length = channelEncode4.getAc().length;
        } else {
            length = 0;
        }
        byte[] bArr = new byte[(((length2 + length) + 1) / 2) + i15];
        bArr[0] = (byte) iRound;
        bArr[1] = (byte) (iRound >> 8);
        bArr[2] = (byte) (iRound >> 16);
        bArr[3] = (byte) iRound2;
        bArr[4] = (byte) (iRound2 >> 8);
        if (z10) {
            AbstractC2855l.d(channelEncode4);
            bArr[5] = (byte) (Math.round(channelEncode4.getDc() * 15.0f) | (Math.round(channelEncode4.getScale() * 15.0f) << 4));
        }
        int iWriteTo = channelEncode3.writeTo(bArr, i15, channelEncode2.writeTo(bArr, i15, channelEncode.writeTo(bArr, i15, 0)));
        if (z10) {
            AbstractC2855l.d(channelEncode4);
            channelEncode4.writeTo(bArr, i15, iWriteTo);
        }
        return bArr;
    }
}
