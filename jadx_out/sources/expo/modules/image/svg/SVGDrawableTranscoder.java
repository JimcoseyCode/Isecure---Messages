package expo.modules.image.svg;

import D1.m;
import I1.e;
import U1.g;
import U1.l;
import android.content.Context;
import android.graphics.Picture;
import android.graphics.RectF;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import expo.modules.image.CustomOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.h;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/svg/SVGDrawableTranscoder;", "LI1/e;", "LU1/g;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lx1/v;", "toTranscode", "Lv1/h;", "options", "transcode", "(Lx1/v;Lv1/h;)Lx1/v;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SVGDrawableTranscoder implements e {
    private final Context context;

    public SVGDrawableTranscoder(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // I1.e
    public v transcode(v toTranscode, h options) {
        AbstractC2855l.g(toTranscode, "toTranscode");
        AbstractC2855l.g(options, "options");
        Object obj = toTranscode.get();
        AbstractC2855l.f(obj, "get(...)");
        g gVar = (g) obj;
        RectF rectFG = gVar.g();
        int iHeight = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        int iWidth = rectFG != null ? (int) rectFG.width() : 512;
        RectF rectFG2 = gVar.g();
        if (rectFG2 != null) {
            iHeight = (int) rectFG2.height();
        }
        Integer num = (Integer) options.b(CustomOptions.INSTANCE.getTintColor());
        if (num != null) {
            l.b(gVar, num.intValue());
        }
        Picture pictureO = gVar.o();
        AbstractC2855l.f(pictureO, "renderToPicture(...)");
        return new m(new SVGPictureDrawable(pictureO, iWidth, iHeight));
    }
}
