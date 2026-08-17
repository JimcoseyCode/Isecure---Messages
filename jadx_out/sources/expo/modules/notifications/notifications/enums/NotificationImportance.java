package expo.modules.notifications.notifications.enums;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum NotificationImportance {
    UNSPECIFIED(-1000, 1),
    NONE(0, 2),
    MIN(1, 3),
    LOW(2, 4),
    DEFAULT(3, 5),
    HIGH(4, 6),
    MAX(5, 7),
    UNKNOWN(3, 0);

    private final int mEnumValue;
    private final int mNativeImportance;

    NotificationImportance(int i10, int i11) {
        this.mNativeImportance = i10;
        this.mEnumValue = i11;
    }

    public static NotificationImportance fromEnumValue(int i10) {
        for (NotificationImportance notificationImportance : values()) {
            if (notificationImportance.getEnumValue() == i10) {
                return notificationImportance;
            }
        }
        return UNKNOWN;
    }

    public static NotificationImportance fromNativeValue(int i10) {
        for (NotificationImportance notificationImportance : values()) {
            if (notificationImportance.getNativeValue() == i10) {
                return notificationImportance;
            }
        }
        return UNKNOWN;
    }

    public int getEnumValue() {
        return this.mEnumValue;
    }

    public int getNativeValue() {
        return this.mNativeImportance;
    }
}
