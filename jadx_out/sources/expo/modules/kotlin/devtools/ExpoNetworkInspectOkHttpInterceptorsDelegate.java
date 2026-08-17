package expo.modules.kotlin.devtools;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.D;
import e9.E;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestId", "Le9/B;", "request", "Le9/D;", "redirectResponse", "Li7/B;", "willSendRequest", "(Ljava/lang/String;Le9/B;Le9/D;)V", "response", "Le9/E;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "didReceiveResponse", "(Ljava/lang/String;Le9/B;Le9/D;Le9/E;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ExpoNetworkInspectOkHttpInterceptorsDelegate {
    void didReceiveResponse(String requestId, B request, D response, E body);

    void willSendRequest(String requestId, B request, D redirectResponse);
}
