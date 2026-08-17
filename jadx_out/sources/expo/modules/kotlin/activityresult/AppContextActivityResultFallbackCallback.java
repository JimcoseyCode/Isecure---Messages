package expo.modules.kotlin.activityresult;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "Ljava/io/Serializable;", "I", "O", PointerEventHelper.POINTER_TYPE_UNKNOWN, "input", "result", "Li7/B;", "onActivityResult", "(Ljava/io/Serializable;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppContextActivityResultFallbackCallback<I extends Serializable, O> {
    void onActivityResult(I input, O result);
}
