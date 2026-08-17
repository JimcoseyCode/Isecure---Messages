package androidx.media;

import android.util.SparseIntArray;
import androidx.customview.widget.a;
import com.facebook.react.views.text.TextAttributeProps;
import m1.InterfaceC2893a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC2893a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f17648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f17649c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f17650a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17648b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f17649c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
                if (z10) {
                    return a.INVALID_ID;
                }
                return 3;
            case 1:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return 1;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return "USAGE_GAME";
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f17650a;
        return audioAttributesImpl == null ? audioAttributesCompat.f17650a == null : audioAttributesImpl.equals(audioAttributesCompat.f17650a);
    }

    public int hashCode() {
        return this.f17650a.hashCode();
    }

    public String toString() {
        return this.f17650a.toString();
    }
}
