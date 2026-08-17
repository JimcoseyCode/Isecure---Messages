package expo.modules.notifications.notifications;

import android.os.Bundle;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class RemoteMessageSerializer {
    public static Bundle toBundle(RemoteMessage remoteMessage) {
        Bundle bundle = new Bundle();
        bundle.putString("collapseKey", remoteMessage.e());
        bundle.putBundle("data", toBundle((Map<String, String>) remoteMessage.s()));
        bundle.putString("from", remoteMessage.X());
        bundle.putString("messageId", remoteMessage.k0());
        bundle.putString("messageType", remoteMessage.t0());
        bundle.putBundle(NotificationsService.NOTIFICATION_KEY, toBundle(remoteMessage.u0()));
        bundle.putInt("originalPriority", remoteMessage.A0());
        bundle.putInt("priority", remoteMessage.D0());
        bundle.putLong("sentTime", remoteMessage.J0());
        bundle.putString("to", remoteMessage.K0());
        bundle.putInt("ttl", remoteMessage.L0());
        return bundle;
    }

    private static Bundle toBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putString("dataString", map.getOrDefault(ExpoNotificationBuilder.EXTRAS_BODY_KEY, null));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    private static Bundle toBundle(RemoteMessage.b bVar) {
        if (bVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ExpoNotificationBuilder.EXTRAS_BODY_KEY, bVar.a());
        bundle.putStringArray("bodyLocalizationArgs", bVar.b());
        bundle.putString("bodyLocalizationKey", bVar.c());
        bundle.putString("channelId", bVar.d());
        bundle.putString("clickAction", bVar.e());
        bundle.putString(ViewProps.COLOR, bVar.f());
        bundle.putBoolean("usesDefaultLightSettings", bVar.g());
        bundle.putBoolean("usesDefaultSound", bVar.h());
        bundle.putBoolean("usesDefaultVibrateSettings", bVar.i());
        if (bVar.j() != null) {
            bundle.putLong("eventTime", bVar.j().longValue());
        } else {
            bundle.putString("eventTime", null);
        }
        bundle.putString("icon", bVar.k());
        if (bVar.l() != null) {
            bundle.putString("imageUrl", bVar.l().toString());
        } else {
            bundle.putString("imageUrl", null);
        }
        bundle.putIntArray("lightSettings", bVar.m());
        if (bVar.n() != null) {
            bundle.putString("link", bVar.n().toString());
        } else {
            bundle.putString("link", null);
        }
        bundle.putBoolean("localOnly", bVar.o());
        if (bVar.q() != null) {
            bundle.putInt("notificationCount", bVar.q().intValue());
        } else {
            bundle.putString("notificationCount", null);
        }
        if (bVar.r() != null) {
            bundle.putInt("notificationPriority", bVar.r().intValue());
        } else {
            bundle.putString("notificationPriority", null);
        }
        bundle.putString("sound", bVar.s());
        bundle.putBoolean("sticky", bVar.t());
        bundle.putString("tag", bVar.u());
        bundle.putString("ticker", bVar.v());
        bundle.putString(AlertFragment.ARG_TITLE, bVar.w());
        bundle.putStringArray("titleLocalizationArgs", bVar.x());
        bundle.putString("titleLocalizationKey", bVar.y());
        if (bVar.z() != null) {
            bundle.putLongArray("vibrateTimings", bVar.z());
        }
        if (bVar.A() != null) {
            bundle.putInt("visibility", bVar.A().intValue());
            return bundle;
        }
        bundle.putString("visibility", null);
        return bundle;
    }
}
