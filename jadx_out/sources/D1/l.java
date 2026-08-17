package D1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.AbstractC1944n;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import com.bumptech.glide.load.resource.bitmap.S;
import v1.EnumC3418b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f744a = S.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC3418b f747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1944n f748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v1.i f750g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public l(int i10, int i11, v1.h hVar) {
        this.f745b = i10;
        this.f746c = i11;
        this.f747d = (EnumC3418b) hVar.b(C1949t.f19264f);
        this.f748e = (AbstractC1944n) hVar.b(AbstractC1944n.OPTION);
        v1.g gVar = C1949t.f19268j;
        this.f749f = hVar.b(gVar) != null && ((Boolean) hVar.b(gVar)).booleanValue();
        this.f750g = (v1.i) hVar.b(C1949t.f19265g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f744a.f(this.f745b, this.f746c, this.f749f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f747d == EnumC3418b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f745b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f746c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float scaleFactor = this.f748e.getScaleFactor(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * scaleFactor);
        int iRound2 = Math.round(scaleFactor * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        v1.i iVar = this.f750g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == v1.i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
