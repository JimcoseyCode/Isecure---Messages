package expo.modules.notifications.notifications.enums;

import com.facebook.hermes.intl.Constants;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum NotificationPriority {
    MIN(-2, "min"),
    LOW(-1, "low"),
    DEFAULT(0, Constants.COLLATION_DEFAULT),
    HIGH(1, "high"),
    MAX(2, "max");

    private final String mEnumValue;
    private final int mNativePriority;

    NotificationPriority(int i10, String str) {
        this.mNativePriority = i10;
        this.mEnumValue = str;
    }

    public static NotificationPriority fromEnumValue(String str) {
        for (NotificationPriority notificationPriority : values()) {
            if (notificationPriority.getEnumValue().equalsIgnoreCase(str)) {
                return notificationPriority;
            }
        }
        return null;
    }

    public static NotificationPriority fromNativeValue(int i10) {
        for (NotificationPriority notificationPriority : values()) {
            if (notificationPriority.getNativeValue() == i10) {
                return notificationPriority;
            }
        }
        return null;
    }

    public String getEnumValue() {
        return this.mEnumValue;
    }

    public int getNativeValue() {
        return this.mNativePriority;
    }
}
