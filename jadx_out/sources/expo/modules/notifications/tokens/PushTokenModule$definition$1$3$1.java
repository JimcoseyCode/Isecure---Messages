package expo.modules.notifications.tokens;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PushTokenModule$definition$1$3$1<TResult> implements InterfaceC1372f {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ ModuleDefinitionBuilder $this_ModuleDefinition;
    final /* synthetic */ PushTokenModule this$0;

    PushTokenModule$definition$1$3$1(Promise promise, ModuleDefinitionBuilder moduleDefinitionBuilder, PushTokenModule pushTokenModule) {
        this.$promise = promise;
        this.$this_ModuleDefinition = moduleDefinitionBuilder;
        this.this$0 = pushTokenModule;
    }

    @Override // P4.InterfaceC1372f
    public final void onComplete(AbstractC1378l task) {
        String message;
        AbstractC2855l.g(task, "task");
        if (task.p()) {
            String str = (String) task.l();
            if (str == null) {
                this.$promise.reject("E_REGISTRATION_FAILED", "Fetching the token failed. Invalid token.", null);
                return;
            } else {
                this.$promise.resolve(str);
                this.this$0.onNewToken(str);
                return;
            }
        }
        Exception excK = task.k();
        Promise promise = this.$promise;
        if (excK == null || (message = excK.getMessage()) == null) {
            message = "unknown";
        }
        promise.reject("E_REGISTRATION_FAILED", "Fetching the token failed: " + message, excK);
    }
}
