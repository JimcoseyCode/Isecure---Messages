package expo.modules.notifications.notifications.enums;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum AudioUsage {
    UNKNOWN(0, 0),
    MEDIA(1, 1),
    VOICE_COMMUNICATION(2, 2),
    VOICE_COMMUNICATION_SIGNALLING(3, 3),
    ALARM(4, 4),
    NOTIFICATION(5, 5),
    NOTIFICATION_RINGTONE(6, 6),
    NOTIFICATION_COMMUNICATION_REQUEST(7, 7),
    NOTIFICATION_COMMUNICATION_INSTANT(8, 8),
    NOTIFICATION_COMMUNICATION_DELAYED(9, 9),
    NOTIFICATION_EVENT(10, 10),
    ASSISTANCE_ACCESSIBILITY(11, 11),
    ASSISTANCE_NAVIGATION_GUIDANCE(12, 12),
    ASSISTANCE_SONIFICATION(13, 13),
    GAME(14, 14);

    private final int mEnumValue;
    private final int mNativeVisibility;

    AudioUsage(int i10, int i11) {
        this.mNativeVisibility = i10;
        this.mEnumValue = i11;
    }

    public static AudioUsage fromEnumValue(int i10) {
        for (AudioUsage audioUsage : values()) {
            if (audioUsage.getEnumValue() == i10) {
                return audioUsage;
            }
        }
        return UNKNOWN;
    }

    public static AudioUsage fromNativeValue(int i10) {
        for (AudioUsage audioUsage : values()) {
            if (audioUsage.getEnumValue() == i10) {
                return audioUsage;
            }
        }
        return UNKNOWN;
    }

    public int getEnumValue() {
        return this.mEnumValue;
    }

    public int getNativeValue() {
        return this.mNativeVisibility;
    }
}
