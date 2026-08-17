package o4;

import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: renamed from: o4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3010c {
    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i10;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return "ERROR";
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return "INTERRUPTED";
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return "DEAD_CLIENT";
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                return "REMOTE_EXCEPTION";
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
