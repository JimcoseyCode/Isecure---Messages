package expo.modules.camera;

import android.graphics.Bitmap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/camera/PictureRef;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "bitmap", "runtimeContext", "Lexpo/modules/kotlin/runtime/Runtime;", "Lexpo/modules/kotlin/RuntimeContext;", "<init>", "(Landroid/graphics/Bitmap;Lexpo/modules/kotlin/runtime/Runtime;)V", "nativeRefType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeRefType", "()Ljava/lang/String;", "getAdditionalMemoryPressure", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PictureRef extends SharedRef<Bitmap> {
    private final String nativeRefType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PictureRef(Bitmap bitmap, Runtime runtimeContext) {
        super(bitmap, runtimeContext);
        AbstractC2855l.g(bitmap, "bitmap");
        AbstractC2855l.g(runtimeContext, "runtimeContext");
        this.nativeRefType = "image";
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public int getAdditionalMemoryPressure() {
        return getRef().getAllocationByteCount();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedRef
    public String getNativeRefType() {
        return this.nativeRefType;
    }
}
