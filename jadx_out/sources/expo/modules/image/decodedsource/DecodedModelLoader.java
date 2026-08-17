package expo.modules.image.decodedsource;

import B1.n;
import P1.c;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/image/decodedsource/DecodedModelLoader;", "LB1/n;", "Lexpo/modules/image/decodedsource/DecodedModel;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "model", PointerEventHelper.POINTER_TYPE_UNKNOWN, "handles", "(Lexpo/modules/image/decodedsource/DecodedModel;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Lv1/h;", "options", "LB1/n$a;", "buildLoadData", "(Lexpo/modules/image/decodedsource/DecodedModel;IILv1/h;)LB1/n$a;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecodedModelLoader implements n {
    @Override // B1.n
    public boolean handles(DecodedModel model) {
        AbstractC2855l.g(model, "model");
        return true;
    }

    @Override // B1.n
    public n.a buildLoadData(DecodedModel model, int width, int height, h options) {
        AbstractC2855l.g(model, "model");
        AbstractC2855l.g(options, "options");
        return new n.a(new c(model), new DecodedFetcher(model.getDrawable()));
    }
}
