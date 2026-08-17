package expo.modules.image.blurhash;

import B1.n;
import B1.o;
import B1.r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Lexpo/modules/image/blurhash/BlurhashModelLoaderFactory;", "LB1/o;", "Lexpo/modules/image/blurhash/BlurhashModel;", "Landroid/graphics/Bitmap;", "<init>", "()V", "LB1/r;", "multiFactory", "LB1/n;", "build", "(LB1/r;)LB1/n;", "Li7/B;", "teardown", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurhashModelLoaderFactory implements o {
    @Override // B1.o
    public n build(r multiFactory) {
        AbstractC2855l.g(multiFactory, "multiFactory");
        return new BlurhashModelLoader();
    }

    @Override // B1.o
    public void teardown() {
    }
}
