package expo.modules.fetch;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/t;", "toHeaders", "(Ljava/util/List;)Le9/t;", "expo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RequestUtilsKt {
    public static final t toHeaders(List<Pair<String, String>> list) {
        AbstractC2855l.g(list, "<this>");
        t.a aVar = new t.a();
        for (Pair<String, String> pair : list) {
            aVar.a((String) pair.c(), (String) pair.d());
        }
        return aVar.e();
    }
}
