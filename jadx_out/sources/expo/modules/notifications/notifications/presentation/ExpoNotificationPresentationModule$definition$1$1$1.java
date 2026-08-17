package expo.modules.notifications.notifications.presentation;

import android.os.Bundle;
import expo.modules.kotlin.Promise;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ExpoNotificationPresentationModule$definition$1$1$1 implements Function2 {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ ExpoNotificationPresentationModule this$0;

    ExpoNotificationPresentationModule$definition$1$1$1(Promise promise, ExpoNotificationPresentationModule expoNotificationPresentationModule) {
        this.$promise = promise;
        this.this$0 = expoNotificationPresentationModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (Bundle) obj2);
        return C2735B.f28704a;
    }

    public final void invoke(int i10, Bundle bundle) {
        ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(NotificationsService.NOTIFICATIONS_KEY) : null;
        if (i10 == 0 && parcelableArrayList != null) {
            this.$promise.resolve((Collection<? extends Object>) this.this$0.serializeNotifications(parcelableArrayList));
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            this.$promise.reject("ERR_NOTIFICATIONS_FETCH_FAILED", "A list of displayed notifications could not be fetched.", serializable instanceof Exception ? (Exception) serializable : null);
        }
    }
}
