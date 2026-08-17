package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class LocaleMatcher {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class LocaleMatchResult {
        public HashMap<String, String> extensions = new HashMap<>();
        public ILocaleObject<?> matchedLocale;
    }

    public static String BestAvailableLocale(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static ULocale bestFitBestAvailableLocale(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) iLocaleObject.getLocaleWithoutExtensions()}, ULocale.getAvailableLocales(), zArr);
        if (zArr[0] || uLocaleAcceptLanguage == null) {
            return null;
        }
        return uLocaleAcceptLanguage;
    }

    public static LocaleMatchResult bestFitMatch(String[] strArr) throws JSRangeErrorException {
        LocaleMatchResult localeMatchResult = new LocaleMatchResult();
        for (String str : strArr) {
            ILocaleObject iLocaleObjectCreateFromLocaleId = LocaleObject.createFromLocaleId(str);
            ULocale uLocaleBestFitBestAvailableLocale = bestFitBestAvailableLocale(iLocaleObjectCreateFromLocaleId);
            if (uLocaleBestFitBestAvailableLocale != null) {
                localeMatchResult.matchedLocale = LocaleObjectICU.createFromULocale(uLocaleBestFitBestAvailableLocale);
                localeMatchResult.extensions = iLocaleObjectCreateFromLocaleId.getUnicodeExtensions();
                return localeMatchResult;
            }
        }
        localeMatchResult.matchedLocale = LocaleObjectICU.createDefault();
        return localeMatchResult;
    }

    public static String[] bestFitSupportedLocales(String[] strArr) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (bestFitBestAvailableLocale(LocaleObject.createFromLocaleId(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static LocaleMatchResult lookupMatch(String[] strArr, String[] strArr2) throws JSRangeErrorException {
        LocaleMatchResult localeMatchResult = new LocaleMatchResult();
        for (String str : strArr) {
            ILocaleObject iLocaleObjectCreateFromLocaleId = LocaleObject.createFromLocaleId(str);
            String strBestAvailableLocale = BestAvailableLocale(strArr2, iLocaleObjectCreateFromLocaleId.toCanonicalTagWithoutExtensions());
            if (!strBestAvailableLocale.isEmpty()) {
                localeMatchResult.matchedLocale = LocaleObject.createFromLocaleId(strBestAvailableLocale);
                localeMatchResult.extensions = iLocaleObjectCreateFromLocaleId.getUnicodeExtensions();
                return localeMatchResult;
            }
        }
        localeMatchResult.matchedLocale = LocaleObject.createDefault();
        return localeMatchResult;
    }

    public static String[] lookupSupportedLocales(String[] strArr) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        String[] availableLocales = getAvailableLocales();
        for (String str : strArr) {
            String strBestAvailableLocale = BestAvailableLocale(availableLocales, LocaleObject.createFromLocaleId(str).toCanonicalTagWithoutExtensions());
            if (strBestAvailableLocale != null && !strBestAvailableLocale.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static LocaleMatchResult lookupMatch(String[] strArr) throws JSRangeErrorException {
        return lookupMatch(strArr, getAvailableLocales());
    }
}
