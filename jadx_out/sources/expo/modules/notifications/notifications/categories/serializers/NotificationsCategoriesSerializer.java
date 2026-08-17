package expo.modules.notifications.notifications.categories.serializers;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.NotificationCategory;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lexpo/modules/notifications/notifications/categories/serializers/NotificationsCategoriesSerializer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBundle", "Landroid/os/Bundle;", "category", "Lexpo/modules/notifications/notifications/model/NotificationCategory;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationsCategoriesSerializer {
    Bundle toBundle(NotificationCategory category);
}
