package expo.modules.notifications.notifications.scheduling;

import android.os.Bundle;
import expo.modules.kotlin.Promise;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class NotificationScheduler$definition$1$1$1 implements Function2 {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ NotificationScheduler this$0;

    NotificationScheduler$definition$1$1$1(Promise promise, NotificationScheduler notificationScheduler) {
        this.$promise = promise;
        this.this$0 = notificationScheduler;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (Bundle) obj2);
        return C2735B.f28704a;
    }

    public final void invoke(int i10, Bundle bundle) {
        if (i10 != 0) {
            Serializable serializable = bundle != null ? bundle.getSerializable(NotificationsService.EXCEPTION_KEY) : null;
            AbstractC2855l.e(serializable, "null cannot be cast to non-null type java.lang.Exception");
            this.$promise.reject("ERR_NOTIFICATIONS_FAILED_TO_FETCH", "Failed to fetch scheduled notifications.", (Exception) serializable);
        } else {
            ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(NotificationsService.NOTIFICATION_REQUESTS_KEY) : null;
            if (parcelableArrayList == null) {
                this.$promise.reject("ERR_NOTIFICATIONS_FAILED_TO_FETCH", "Failed to fetch scheduled notifications.", null);
            } else {
                this.$promise.resolve((Collection<? extends Object>) this.this$0.serializeScheduledNotificationRequests(parcelableArrayList));
            }
        }
    }
}
