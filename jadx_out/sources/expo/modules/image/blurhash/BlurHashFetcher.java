package expo.modules.image.blurhash;

import android.graphics.Bitmap;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/image/blurhash/BlurHashFetcher;", "Lcom/bumptech/glide/load/data/d;", "Landroid/graphics/Bitmap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "blurHash", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", PointerEventHelper.POINTER_TYPE_UNKNOWN, "punch", "<init>", "(Ljava/lang/String;IIF)V", "Li7/B;", "cleanup", "()V", "cancel", "Ljava/lang/Class;", "getDataClass", "()Ljava/lang/Class;", "Lv1/a;", "getDataSource", "()Lv1/a;", "Lcom/bumptech/glide/g;", "priority", "Lcom/bumptech/glide/load/data/d$a;", "callback", "loadData", "(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V", "Ljava/lang/String;", "I", "F", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurHashFetcher implements d {
    private final String blurHash;
    private final int height;
    private final float punch;
    private final int width;

    public BlurHashFetcher(String str, int i10, int i11, float f10) {
        this.blurHash = str;
        this.width = i10;
        this.height = i11;
        this.punch = f10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<Bitmap> getDataClass() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(g priority, d.a callback) {
        AbstractC2855l.g(priority, "priority");
        AbstractC2855l.g(callback, "callback");
        Bitmap bitmapDecode$default = BlurhashDecoder.decode$default(BlurhashDecoder.INSTANCE, this.blurHash, this.width, this.height, this.punch, false, 16, null);
        if (bitmapDecode$default == null) {
            callback.a(new BlurhashDecodingFailure(this.blurHash));
        } else {
            callback.c(bitmapDecode$default);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
    }
}
