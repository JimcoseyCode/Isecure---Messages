package h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import g3.i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2703a(i bitmapPool, H0.e decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        AbstractC2855l.g(bitmapPool, "bitmapPool");
        AbstractC2855l.g(decodeBuffers, "decodeBuffers");
        AbstractC2855l.g(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // h3.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        AbstractC2855l.g(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return BitmapUtil.getSizeInByteForBitmap(i10, i11, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
