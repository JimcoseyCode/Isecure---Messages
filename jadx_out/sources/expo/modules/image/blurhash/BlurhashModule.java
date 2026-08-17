package expo.modules.image.blurhash;

import K1.b;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/image/blurhash/BlurhashModule;", "LK1/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/h;", "registry", "Li7/B;", "registerComponents", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurhashModule extends b {
    @Override // K1.b
    public void registerComponents(Context context, com.bumptech.glide.b glide, h registry) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(glide, "glide");
        AbstractC2855l.g(registry, "registry");
        super.registerComponents(context, glide, registry);
        registry.o(BlurhashModel.class, Bitmap.class, new BlurhashModelLoaderFactory());
    }
}
