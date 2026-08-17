package expo.modules.image.records;

import M1.f;
import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.GlideModelProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/image/records/Source;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "Lexpo/modules/image/GlideModelProvider;", "createGlideModelProvider", "(Landroid/content/Context;)Lexpo/modules/image/GlideModelProvider;", "LM1/f;", "createGlideOptions", "(Landroid/content/Context;)LM1/f;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "usesPlaceholderContentFit", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getWidth", "()I", "width", "getHeight", "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getScale", "()D", "scale", "getPixelCount", "pixelCount", "Lexpo/modules/image/records/DecodedSource;", "Lexpo/modules/image/records/SourceMap;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Source {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static double getPixelCount(Source source) {
            return ((double) (source.getWidth() * source.getHeight())) * source.getScale() * source.getScale();
        }

        public static boolean usesPlaceholderContentFit(Source source) {
            return true;
        }
    }

    GlideModelProvider createGlideModelProvider(Context context);

    f createGlideOptions(Context context);

    int getHeight();

    double getPixelCount();

    double getScale();

    int getWidth();

    boolean usesPlaceholderContentFit();
}
