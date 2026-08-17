package expo.modules.notifications.badge;

import android.app.NotificationManager;
import android.content.Context;
import b9.b;
import b9.c;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lexpo/modules/notifications/badge/BadgeHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "badgeCount", "getBadgeCount", "()I", "setBadgeCount", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BadgeHelper {
    public static final BadgeHelper INSTANCE = new BadgeHelper();
    private static int badgeCount;

    private BadgeHelper() {
    }

    private final void setBadgeCount(int i10) {
        synchronized (this) {
            badgeCount = i10;
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final int getBadgeCount() {
        int i10;
        synchronized (this) {
            i10 = badgeCount;
        }
        return i10;
    }

    public final boolean setBadgeCount(Context context, int badgeCount2) {
        AbstractC2855l.g(context, "context");
        try {
            if (badgeCount2 == 0) {
                Object systemService = context.getSystemService(NotificationsService.NOTIFICATION_KEY);
                AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancelAll();
            } else {
                c.a(context.getApplicationContext(), badgeCount2);
            }
            INSTANCE.setBadgeCount(badgeCount2);
            return true;
        } catch (b e10) {
            e10.getMessage();
            e10.printStackTrace();
            return false;
        }
    }
}
