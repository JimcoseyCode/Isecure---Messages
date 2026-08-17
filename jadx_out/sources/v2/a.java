package V2;

import Y2.C1515a;
import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import g2.AbstractC2662a;
import g3.i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1515a f11625b;

    public a(i bitmapPool, C1515a closeableReferenceFactory) {
        AbstractC2855l.g(bitmapPool, "bitmapPool");
        AbstractC2855l.g(closeableReferenceFactory, "closeableReferenceFactory");
        this.f11624a = bitmapPool;
        this.f11625b = closeableReferenceFactory;
    }

    @Override // V2.d
    public AbstractC2662a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        AbstractC2855l.g(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f11624a.get(BitmapUtil.getSizeInByteForBitmap(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * BitmapUtil.getPixelSizeForBitmapConfig(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        AbstractC2662a abstractC2662aC = this.f11625b.c(bitmap, this.f11624a);
        AbstractC2855l.f(abstractC2662aC, "create(...)");
        return abstractC2662aC;
    }
}
