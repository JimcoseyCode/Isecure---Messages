package expo.modules.image.records;

import M1.a;
import M1.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.DecodedModelProvider;
import expo.modules.image.GlideModelProvider;
import expo.modules.image.records.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/image/records/DecodedSource;", "Lexpo/modules/image/records/Source;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/Context;", "context", "Lexpo/modules/image/GlideModelProvider;", "createGlideModelProvider", "(Landroid/content/Context;)Lexpo/modules/image/GlideModelProvider;", "LM1/f;", "createGlideOptions", "(Landroid/content/Context;)LM1/f;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "I", "getWidth", "()I", "height", "getHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "scale", "D", "getScale", "()D", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecodedSource implements Source {
    private final Drawable drawable;
    private final int height;
    private final double scale;
    private final int width;

    public DecodedSource(Drawable drawable) {
        AbstractC2855l.g(drawable, "drawable");
        this.drawable = drawable;
        this.width = drawable.getIntrinsicWidth();
        this.height = drawable.getIntrinsicHeight();
        this.scale = 1.0d;
    }

    @Override // expo.modules.image.records.Source
    public GlideModelProvider createGlideModelProvider(Context context) {
        AbstractC2855l.g(context, "context");
        return new DecodedModelProvider(this.drawable);
    }

    @Override // expo.modules.image.records.Source
    public f createGlideOptions(Context context) {
        AbstractC2855l.g(context, "context");
        a aVarG = ((f) new f().a0(true)).g(AbstractC3526j.f33373b);
        AbstractC2855l.f(aVarG, "diskCacheStrategy(...)");
        return (f) aVarG;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // expo.modules.image.records.Source
    public int getHeight() {
        return this.height;
    }

    @Override // expo.modules.image.records.Source
    public double getPixelCount() {
        return Source.DefaultImpls.getPixelCount(this);
    }

    @Override // expo.modules.image.records.Source
    public double getScale() {
        return this.scale;
    }

    @Override // expo.modules.image.records.Source
    public int getWidth() {
        return this.width;
    }

    @Override // expo.modules.image.records.Source
    public boolean usesPlaceholderContentFit() {
        return Source.DefaultImpls.usesPlaceholderContentFit(this);
    }
}
