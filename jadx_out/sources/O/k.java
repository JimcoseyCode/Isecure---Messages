package o;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class k {
    static String a(Context context, int i10) {
        if (context == null) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (i10 == 1) {
            return context.getString(u.f30332d);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                    return context.getString(u.f30336h);
                case 11:
                    return context.getString(u.f30335g);
                case 12:
                    return context.getString(u.f30333e);
                default:
                    return context.getString(u.f30330b);
            }
        }
        return context.getString(u.f30334f);
    }

    static boolean b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean c(int i10) {
        return i10 == 7 || i10 == 9;
    }
}
