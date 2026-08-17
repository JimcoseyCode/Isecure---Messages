package com.ov.message;

import T5.e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class PhoneNumberUtils {
    private static final String KEY_MY_PHONE_NUMBER = "my_phone_number";
    private static final String PREFS_NAME = "OVMessagePrefs";
    private static final String TAG = "PhoneNumberUtils";
    private static T5.e phoneUtil = T5.e.t();

    private static String fixLeadingZeroAfterPrefix(String str) {
        if (str != null && str.length() >= 4) {
            String[] strArr = {"+33", "+32", "+31", "+41", "+49", "+39", "+34", "+351", "+44"};
            for (int i10 = 0; i10 < 9; i10++) {
                String str2 = strArr[i10];
                if (str.startsWith(str2) && str.length() > str2.length() && str.charAt(str2.length()) == '0') {
                    return str2 + str.substring(str2.length()).replaceFirst("^0+", PointerEventHelper.POINTER_TYPE_UNKNOWN);
                }
            }
        }
        return str;
    }

    private static String getDefaultCountry(Context context) {
        Locale locale;
        Resources resources;
        Configuration configuration;
        String strB;
        if (context == null) {
            return null;
        }
        try {
            String string = context.getSharedPreferences(PREFS_NAME, 0).getString(KEY_MY_PHONE_NUMBER, null);
            if (string != null && !string.isEmpty()) {
                try {
                    T5.j jVarX = phoneUtil.X(string, null);
                    if (jVarX.j() && (strB = phoneUtil.B(jVarX)) != null) {
                        if (!strB.isEmpty()) {
                            return strB;
                        }
                    }
                } catch (T5.d unused) {
                }
            }
            try {
                resources = context.getResources();
            } catch (Exception unused2) {
            }
            if (resources == null || (configuration = resources.getConfiguration()) == null) {
                locale = null;
            } else {
                locale = configuration.locale;
                if (locale != null) {
                    try {
                        String country = locale.getCountry();
                        if (country != null && !country.isEmpty()) {
                            return country.toUpperCase();
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            String language = locale.getLanguage();
            if (language != null && !language.isEmpty()) {
                String strMapLanguageToCountry = mapLanguageToCountry(language);
                if (strMapLanguageToCountry != null) {
                    return strMapLanguageToCountry;
                }
            }
        } catch (Exception unused4) {
        }
        return null;
    }

    private static String mapLanguageToCountry(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "ca":
                return "ES";
            case "cy":
                return "GB";
            case "da":
                return "DK";
            case "de":
                return "DE";
            case "en":
                return "US";
            case "es":
                return "ES";
            case "fi":
                return "FI";
            case "fr":
                return "FR";
            case "gd":
                return "GB";
            case "id":
                return "ID";
            case "is":
                return "IS";
            case "it":
                return "IT";
            case "ms":
                return "MY";
            case "nl":
                return "NL";
            case "no":
                return "NO";
            case "pt":
                return "PT";
            case "sv":
                return "SE";
            case "tl":
                return "PH";
            default:
                return null;
        }
    }

    public static String normalizePhoneNumber(String str, Context context) {
        if (str == null || str.isEmpty()) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        String strReplaceAll = str.replaceAll("[\\s\\-\\.\\(\\)]", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        if (strReplaceAll.startsWith("+")) {
            try {
                T5.j jVarX = phoneUtil.X(strReplaceAll, null);
                if (phoneUtil.K(jVarX)) {
                    return fixLeadingZeroAfterPrefix(phoneUtil.n(jVarX, e.c.E164));
                }
            } catch (T5.d unused) {
            }
            return fixLeadingZeroAfterPrefix(strReplaceAll);
        }
        if (strReplaceAll.startsWith("00")) {
            String str2 = "+" + strReplaceAll.substring(2);
            try {
                T5.j jVarX2 = phoneUtil.X(str2, null);
                if (phoneUtil.K(jVarX2)) {
                    return fixLeadingZeroAfterPrefix(phoneUtil.n(jVarX2, e.c.E164));
                }
            } catch (T5.d unused2) {
            }
            return fixLeadingZeroAfterPrefix(str2);
        }
        if (strReplaceAll.length() < 8 || strReplaceAll.length() > 15 || !strReplaceAll.matches("\\d+")) {
            String defaultCountry = getDefaultCountry(context);
            if (defaultCountry == null || defaultCountry.isEmpty()) {
                return strReplaceAll;
            }
            try {
                T5.j jVarX3 = phoneUtil.X(strReplaceAll, defaultCountry);
                if (phoneUtil.K(jVarX3)) {
                    return fixLeadingZeroAfterPrefix(phoneUtil.n(jVarX3, e.c.E164));
                }
                if (!jVarX3.j() || !jVarX3.n()) {
                    return strReplaceAll;
                }
                return fixLeadingZeroAfterPrefix("+" + String.valueOf(jVarX3.c()) + String.valueOf(jVarX3.f()));
            } catch (T5.d unused3) {
                return strReplaceAll;
            }
        }
        String defaultCountry2 = getDefaultCountry(context);
        if (defaultCountry2 == null || defaultCountry2.isEmpty()) {
            return strReplaceAll;
        }
        try {
            T5.j jVarX4 = phoneUtil.X(strReplaceAll, defaultCountry2);
            if (phoneUtil.K(jVarX4)) {
                return fixLeadingZeroAfterPrefix(phoneUtil.n(jVarX4, e.c.E164));
            }
            if (!jVarX4.j() || !jVarX4.n()) {
                return strReplaceAll;
            }
            return fixLeadingZeroAfterPrefix("+" + String.valueOf(jVarX4.c()) + String.valueOf(jVarX4.f()));
        } catch (T5.d unused4) {
            return strReplaceAll;
        }
    }
}
