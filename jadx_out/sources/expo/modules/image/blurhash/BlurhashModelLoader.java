package expo.modules.image.blurhash;

import B1.n;
import P1.c;
import android.net.Uri;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/image/blurhash/BlurhashModelLoader;", "LB1/n;", "Lexpo/modules/image/blurhash/BlurhashModel;", "Landroid/graphics/Bitmap;", "<init>", "()V", "T", "Landroid/net/Uri;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", Constants.COLLATION_DEFAULT, "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "converter", "getPath", "(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "model", PointerEventHelper.POINTER_TYPE_UNKNOWN, "handles", "(Lexpo/modules/image/blurhash/BlurhashModel;)Z", "width", "height", "Lv1/h;", "options", "LB1/n$a;", "buildLoadData", "(Lexpo/modules/image/blurhash/BlurhashModel;IILv1/h;)LB1/n$a;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurhashModelLoader implements n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildLoadData$lambda$0(String it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    private final <T> T getPath(Uri uri, int index, T t10, Function1 converter) {
        List<String> pathSegments = uri.getPathSegments();
        AbstractC2855l.f(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2800q.h0(pathSegments, index);
        return str == null ? t10 : (T) converter.invoke(str);
    }

    @Override // B1.n
    public boolean handles(BlurhashModel model) {
        AbstractC2855l.g(model, "model");
        return true;
    }

    @Override // B1.n
    public n.a buildLoadData(BlurhashModel model, int width, int height, h options) {
        AbstractC2855l.g(model, "model");
        AbstractC2855l.g(options, "options");
        return new n.a(new c(model), new BlurHashFetcher((String) getPath(model.getUri(), 0, null, new Function1() { // from class: expo.modules.image.blurhash.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlurhashModelLoader.buildLoadData$lambda$0((String) obj);
            }
        }), model.getWidth(), model.getHeight(), 1.0f));
    }
}
