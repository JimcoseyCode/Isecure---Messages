package com.facebook.imagepipeline.nativecode;

import X2.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c2.p;
import com.facebook.imageutils.BitmapUtil;
import d3.k;
import g2.AbstractC2662a;
import g3.g;
import g3.h;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements h3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f19894b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19895a = h.a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f19894b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(AbstractC2662a abstractC2662a, int i10) {
        f2.h hVar = (f2.h) abstractC2662a.J();
        return i10 >= 2 && hVar.g(i10 + (-2)) == -1 && hVar.g(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // h3.d
    public AbstractC2662a a(k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.W(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        AbstractC2662a abstractC2662aR = kVar.r();
        c2.k.g(abstractC2662aR);
        try {
            return g(d(abstractC2662aR, i10, optionsF));
        } finally {
            AbstractC2662a.B(abstractC2662aR);
        }
    }

    @Override // h3.d
    public AbstractC2662a b(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.W(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        AbstractC2662a abstractC2662aR = kVar.r();
        c2.k.g(abstractC2662aR);
        try {
            return g(c(abstractC2662aR, optionsF));
        } finally {
            AbstractC2662a.B(abstractC2662aR);
        }
    }

    protected abstract Bitmap c(AbstractC2662a abstractC2662a, BitmapFactory.Options options);

    protected abstract Bitmap d(AbstractC2662a abstractC2662a, int i10, BitmapFactory.Options options);

    public AbstractC2662a g(Bitmap bitmap) {
        c2.k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f19895a.g(bitmap)) {
                return AbstractC2662a.w0(bitmap, this.f19895a.e());
            }
            int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(sizeInBytes), Integer.valueOf(this.f19895a.b()), Long.valueOf(this.f19895a.f()), Integer.valueOf(this.f19895a.c()), Integer.valueOf(this.f19895a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}
