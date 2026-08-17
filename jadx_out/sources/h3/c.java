package h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import g3.i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f28287h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i bitmapPool, H0.e decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        AbstractC2855l.g(bitmapPool, "bitmapPool");
        AbstractC2855l.g(decodeBuffers, "decodeBuffers");
        AbstractC2855l.g(platformDecoderOptions, "platformDecoderOptions");
        this.f28287h = platformDecoderOptions;
    }

    @Override // h3.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        AbstractC2855l.g(options, "options");
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return BitmapUtil.getSizeInByteForBitmap(i10, i11, config);
    }
}
