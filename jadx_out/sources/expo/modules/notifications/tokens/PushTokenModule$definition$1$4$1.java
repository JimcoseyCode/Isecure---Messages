package expo.modules.notifications.tokens;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import expo.modules.kotlin.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PushTokenModule$definition$1$4$1<TResult> implements InterfaceC1372f {
    final /* synthetic */ Promise $promise;

    PushTokenModule$definition$1$4$1(Promise promise) {
        this.$promise = promise;
    }

    @Override // P4.InterfaceC1372f
    public final void onComplete(AbstractC1378l task) {
        String message;
        AbstractC2855l.g(task, "task");
        if (task.p()) {
            this.$promise.resolve((Object) null);
            return;
        }
        Exception excK = task.k();
        Promise promise = this.$promise;
        if (excK == null || (message = excK.getMessage()) == null) {
            message = "unknown";
        }
        promise.reject("E_UNREGISTER_FOR_NOTIFICATIONS_FAILED", "Unregistering for notifications failed: " + message, excK);
    }
}
