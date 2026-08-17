package expo.modules.notifications.notifications;

import android.os.Bundle;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.core.arguments.MapArguments;
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.notifications.model.TextInputNotificationResponse;
import expo.modules.notifications.notifications.model.triggers.FirebaseNotificationTrigger;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.notifications.triggers.ChannelAwareTrigger;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationSerializer {
    public static Bundle toBundle(NotificationResponse notificationResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("actionIdentifier", notificationResponse.getActionIdentifier());
        bundle.putBundle(NotificationsService.NOTIFICATION_KEY, toBundle(notificationResponse.getNotification()));
        if (notificationResponse instanceof TextInputNotificationResponse) {
            bundle.putString("userText", ((TextInputNotificationResponse) notificationResponse).getUserText());
        }
        return bundle;
    }

    private static List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (jSONArray.isNull(i10)) {
                arrayList.add(null);
            } else if (jSONArray.optJSONObject(i10) != null) {
                arrayList.add(toBundle(jSONArray.optJSONObject(i10)));
            } else if (jSONArray.optJSONArray(i10) != null) {
                arrayList.add(toList(jSONArray.optJSONArray(i10)));
            } else {
                arrayList.add(jSONArray.opt(i10));
            }
        }
        return arrayList;
    }

    public static Bundle toResponseBundleFromExtras(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(AlertFragment.ARG_TITLE, bundle.getString(AlertFragment.ARG_TITLE));
        String string = bundle.getString(ExpoNotificationBuilder.EXTRAS_BODY_KEY);
        if (UtilsKt.isValidJSONString(string)) {
            bundle2.putString("dataString", string);
            bundle2.putString(ExpoNotificationBuilder.EXTRAS_BODY_KEY, bundle.getString("message"));
        } else {
            bundle2.putBundle("data", UtilsKt.filteredBundleForJSTypeConverter(bundle));
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString(NotificationsService.EVENT_TYPE_KEY, "push");
        bundle3.putString("channelId", bundle.getString("channelId"));
        Bundle bundle4 = new Bundle();
        bundle4.putString(NotificationsService.IDENTIFIER_KEY, bundle.getString(NotificationsService.GOOGLE_MESSAGE_ID_KEY));
        bundle4.putBundle("trigger", bundle3);
        bundle4.putBundle("content", bundle2);
        Bundle bundle5 = new Bundle();
        bundle5.putLong("date", bundle.getLong("google.sent_time"));
        bundle5.putBundle("request", bundle4);
        Bundle bundle6 = new Bundle();
        bundle6.putString("actionIdentifier", NotificationResponse.DEFAULT_ACTION_IDENTIFIER);
        bundle6.putBundle(NotificationsService.NOTIFICATION_KEY, bundle5);
        return bundle6;
    }

    public static Bundle toBundle(Notification notification) {
        Bundle bundle = new Bundle();
        bundle.putBundle("request", toBundle(notification.getNotificationRequest()));
        bundle.putLong("date", notification.getOriginDate().getTime());
        return bundle;
    }

    public static Bundle toBundle(NotificationRequest notificationRequest) {
        JSONObject body;
        Bundle bundle = new Bundle();
        bundle.putString(NotificationsService.IDENTIFIER_KEY, notificationRequest.getIdentifier());
        NotificationTrigger trigger = notificationRequest.getTrigger();
        bundle.putBundle("trigger", trigger == null ? null : trigger.toBundle());
        Bundle bundle2 = toBundle(notificationRequest.getContent());
        if (bundle2.getBundle("data") == null) {
            if (trigger instanceof FirebaseNotificationTrigger) {
                Map mapS = ((FirebaseNotificationTrigger) trigger).getRemoteMessage().s();
                String str = (String) mapS.get(ExpoNotificationBuilder.EXTRAS_BODY_KEY);
                if (!UtilsKt.isValidJSONString(str)) {
                    bundle2.putBundle("data", toBundle((Map<String, String>) mapS));
                } else {
                    bundle2.putString("dataString", str);
                }
            } else if (((trigger instanceof SchedulableNotificationTrigger) || (trigger instanceof ChannelAwareTrigger) || trigger == null) && (body = notificationRequest.getContent().getBody()) != null) {
                bundle2.putString("dataString", body.toString());
            }
        }
        bundle.putBundle("content", bundle2);
        return bundle;
    }

    public static Bundle toBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    public static Bundle toBundle(INotificationContent iNotificationContent) {
        Bundle bundle = new Bundle();
        bundle.putString(AlertFragment.ARG_TITLE, iNotificationContent.getTitle());
        bundle.putString("subtitle", iNotificationContent.getSubText());
        bundle.putString(ExpoNotificationBuilder.EXTRAS_BODY_KEY, iNotificationContent.getText());
        if (iNotificationContent.getColor() != null) {
            bundle.putString(ViewProps.COLOR, String.format("#%08X", Integer.valueOf(iNotificationContent.getColor().intValue())));
        }
        if (iNotificationContent.getBadgeCount() != null) {
            bundle.putInt("badge", iNotificationContent.getBadgeCount().intValue());
        } else {
            bundle.putString("badge", null);
        }
        if (iNotificationContent.getShouldPlayDefaultSound()) {
            bundle.putString("sound", Constants.COLLATION_DEFAULT);
        } else if (iNotificationContent.getSoundName() != null) {
            bundle.putString("sound", "custom");
        } else {
            bundle.putString("sound", null);
        }
        if (iNotificationContent.getPriority() != null) {
            bundle.putString("priority", iNotificationContent.getPriority().getEnumValue());
        }
        if (iNotificationContent.getVibrationPattern() != null) {
            bundle.putLongArray("vibrationPattern", iNotificationContent.getVibrationPattern());
        }
        bundle.putBoolean("autoDismiss", iNotificationContent.getIsAutoDismiss());
        if (iNotificationContent.getCategoryId() != null) {
            bundle.putString("categoryIdentifier", iNotificationContent.getCategoryId());
        }
        bundle.putBoolean("sticky", iNotificationContent.getIsSticky());
        return bundle;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                map.put(next, toBundle((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                map.put(next, toList((JSONArray) objOpt));
            } else if (JSONObject.NULL.equals(objOpt)) {
                map.put(next, null);
            } else {
                map.put(next, objOpt);
            }
        }
        try {
            return new MapArguments(map).toBundle();
        } catch (NullPointerException unused) {
            for (String str : map.keySet()) {
                if (map.get(str) == null) {
                    map.remove(str);
                }
            }
            return new MapArguments(map).toBundle();
        }
    }
}
