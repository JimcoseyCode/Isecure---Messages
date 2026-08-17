package expo.modules.image;

import B7.d;
import android.os.Build;
import com.bumptech.glide.load.resource.bitmap.AbstractC1944n;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.records.DecodeFormat;
import i7.AbstractC2746i;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lexpo/modules/image/SafeDownsampleStrategy;", "Lexpo/modules/image/CustomDownsampleStrategy;", "Lexpo/modules/image/records/DecodeFormat;", "decodeFormat", "<init>", "(Lexpo/modules/image/records/DecodeFormat;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sourceWidth", "sourceHeight", "requestedWidth", "requestedHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getScaleFactor", "(IIII)F", "Lcom/bumptech/glide/load/resource/bitmap/n$g;", "getSampleSizeRounding", "(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lexpo/modules/image/records/DecodeFormat;", "maxBitmapSize$delegate", "Lkotlin/Lazy;", "getMaxBitmapSize", "maxBitmapSize", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeDownsampleStrategy extends CustomDownsampleStrategy {
    private final DecodeFormat decodeFormat;

    /* JADX INFO: renamed from: maxBitmapSize$delegate, reason: from kotlin metadata */
    private final Lazy maxBitmapSize;

    public SafeDownsampleStrategy(DecodeFormat decodeFormat) {
        AbstractC2855l.g(decodeFormat, "decodeFormat");
        this.decodeFormat = decodeFormat;
        this.maxBitmapSize = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.image.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Integer.valueOf(SafeDownsampleStrategy.maxBitmapSize_delegate$lambda$0());
            }
        });
    }

    private final int getMaxBitmapSize() {
        return ((Number) this.maxBitmapSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxBitmapSize_delegate$lambda$0() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, "ro.hwui.max_texture_allocation_size", 104857600);
            AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return d.d(((Integer) objInvoke).intValue(), 104857600);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // expo.modules.image.CustomDownsampleStrategy
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SafeDownsampleStrategy) && this.decodeFormat == ((SafeDownsampleStrategy) other).decodeFormat;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
    public AbstractC1944n.g getSampleSizeRounding(int sourceWidth, int sourceHeight, int requestedWidth, int requestedHeight) {
        return AbstractC1944n.g.MEMORY;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
    public float getScaleFactor(int sourceWidth, int sourceHeight, int requestedWidth, int requestedHeight) {
        if (getMaxBitmapSize() <= 0 || sourceWidth * sourceHeight * this.decodeFormat.toBytes() <= getMaxBitmapSize()) {
            return 1.0f;
        }
        return (float) (((double) ((int) Math.floor(Math.sqrt(((double) (getMaxBitmapSize() / this.decodeFormat.toBytes())) / (((double) Math.min(sourceWidth, sourceHeight)) / ((double) Math.max(sourceWidth, sourceHeight))))))) / ((double) Math.max(sourceWidth, sourceHeight)));
    }

    @Override // expo.modules.image.CustomDownsampleStrategy
    public int hashCode() {
        return (super.hashCode() * 31) + this.decodeFormat.hashCode();
    }
}
