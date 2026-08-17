package com.facebook.hermes.intl;

import com.facebook.hermes.intl.IPlatformNumberFormatter;
import com.facebook.hermes.intl.OptionHelpers;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class NumberFormat {
    private static String[] s_sanctionedSimpleUnitIdentifiers = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};
    private IPlatformNumberFormatter.CompactDisplay mResolvedCompactDisplay;
    private IPlatformNumberFormatter.Style mResolvedStyle;
    private IPlatformNumberFormatter.UnitDisplay mResolvedUnitDisplay;
    private IPlatformNumberFormatter.RoundingType mRoundingType;
    private boolean mUseDefaultNumberSystem;
    private String mResolvedCurrency = null;
    private IPlatformNumberFormatter.CurrencyDisplay mResolvedCurrencyDisplay = IPlatformNumberFormatter.CurrencyDisplay.SYMBOL;
    private IPlatformNumberFormatter.CurrencySign mResolvedCurrencySign = IPlatformNumberFormatter.CurrencySign.STANDARD;
    private String mResolvedUnit = null;
    private boolean mGroupingUsed = true;
    private int mResolvedMinimumIntegerDigits = -1;
    private int mResolvedMinimumFractionDigits = -1;
    private int mResolvedMaximumFractionDigits = -1;
    private int mResolvedMinimumSignificantDigits = -1;
    private int mResolvedMaximumSignificantDigits = -1;
    private IPlatformNumberFormatter.SignDisplay mResolvedSignDisplay = IPlatformNumberFormatter.SignDisplay.AUTO;
    private String mResolvedNumberingSystem = null;
    private IPlatformNumberFormatter.Notation mResolvedNotation = null;
    private ILocaleObject<?> mResolvedLocaleObject = null;
    private ILocaleObject<?> mResolvedLocaleObjectForResolvedOptions = null;
    private IPlatformNumberFormatter mPlatformNumberFormatter = new PlatformNumberFormatterICU();

    public NumberFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        initializeNumberFormat(list, map);
        this.mPlatformNumberFormatter.configure(this.mResolvedLocaleObject, this.mUseDefaultNumberSystem ? PointerEventHelper.POINTER_TYPE_UNKNOWN : this.mResolvedNumberingSystem, this.mResolvedStyle, this.mResolvedCurrencySign, this.mResolvedNotation, this.mResolvedCompactDisplay).setCurrency(this.mResolvedCurrency, this.mResolvedCurrencyDisplay).setGrouping(this.mGroupingUsed).setMinIntergerDigits(this.mResolvedMinimumIntegerDigits).setSignificantDigits(this.mRoundingType, this.mResolvedMinimumSignificantDigits, this.mResolvedMaximumSignificantDigits).setFractionDigits(this.mRoundingType, this.mResolvedMinimumFractionDigits, this.mResolvedMaximumFractionDigits).setSignDisplay(this.mResolvedSignDisplay).setUnits(this.mResolvedUnit, this.mResolvedUnitDisplay);
    }

    private void initializeNumberFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        Object objNewNumber;
        Object objNewNumber2;
        Object objNewObject = JSObjects.newObject();
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        JSObjects.Put(objNewObject, Constants.LOCALEMATCHER, OptionHelpers.GetOption(map, Constants.LOCALEMATCHER, optionType, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        Object objGetOption = OptionHelpers.GetOption(map, "numberingSystem", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (!JSObjects.isUndefined(objGetOption) && !isLocaleIdType(JSObjects.getJavaString(objGetOption))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        JSObjects.Put(objNewObject, "nu", objGetOption);
        HashMap<String, Object> mapResolveLocale = LocaleResolver.resolveLocale(list, objNewObject, Collections.singletonList("nu"));
        ILocaleObject<?> iLocaleObject = (ILocaleObject) JSObjects.getJavaMap(mapResolveLocale).get(Constants.LOCALE);
        this.mResolvedLocaleObject = iLocaleObject;
        this.mResolvedLocaleObjectForResolvedOptions = iLocaleObject.cloneObject();
        Object objGet = JSObjects.Get(mapResolveLocale, "nu");
        if (JSObjects.isNull(objGet)) {
            this.mUseDefaultNumberSystem = true;
            this.mResolvedNumberingSystem = this.mPlatformNumberFormatter.getDefaultNumberingSystem(this.mResolvedLocaleObject);
        } else {
            this.mUseDefaultNumberSystem = false;
            this.mResolvedNumberingSystem = JSObjects.getJavaString(objGet);
        }
        setNumberFormatUnitOptions(map);
        if (this.mResolvedStyle == IPlatformNumberFormatter.Style.CURRENCY) {
            double currencyDigits = PlatformNumberFormatterICU.getCurrencyDigits(this.mResolvedCurrency);
            objNewNumber = JSObjects.newNumber(currencyDigits);
            objNewNumber2 = JSObjects.newNumber(currencyDigits);
        } else {
            objNewNumber = JSObjects.newNumber(0.0d);
            objNewNumber2 = this.mResolvedStyle == IPlatformNumberFormatter.Style.PERCENT ? JSObjects.newNumber(0.0d) : JSObjects.newNumber(3.0d);
        }
        this.mResolvedNotation = (IPlatformNumberFormatter.Notation) OptionHelpers.searchEnum(IPlatformNumberFormatter.Notation.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "notation", optionType, new String[]{Constants.COLLATION_STANDARD, "scientific", "engineering", "compact"}, Constants.COLLATION_STANDARD)));
        setNumberFormatDigitOptions(map, objNewNumber, objNewNumber2);
        Object objGetOption2 = OptionHelpers.GetOption(map, "compactDisplay", optionType, new String[]{"short", "long"}, "short");
        if (this.mResolvedNotation == IPlatformNumberFormatter.Notation.COMPACT) {
            this.mResolvedCompactDisplay = (IPlatformNumberFormatter.CompactDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.CompactDisplay.class, JSObjects.getJavaString(objGetOption2));
        }
        this.mGroupingUsed = JSObjects.getJavaBoolean(OptionHelpers.GetOption(map, "useGrouping", OptionHelpers.OptionType.BOOLEAN, JSObjects.Undefined(), JSObjects.newBoolean(true)));
        this.mResolvedSignDisplay = (IPlatformNumberFormatter.SignDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.SignDisplay.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "signDisplay", optionType, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean isLocaleIdType(String str) {
        return IntlTextUtils.isUnicodeExtensionKeyTypeItem(str, 0, str.length() - 1);
    }

    private boolean isSanctionedSimpleUnitIdentifier(String str) {
        return Arrays.binarySearch(s_sanctionedSimpleUnitIdentifiers, str) >= 0;
    }

    private boolean isWellFormedCurrencyCode(String str) {
        return normalizeCurrencyCode(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean isWellFormedUnitIdentifier(String str) {
        if (isSanctionedSimpleUnitIdentifier(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && isSanctionedSimpleUnitIdentifier(str.substring(0, iIndexOf)) && isSanctionedSimpleUnitIdentifier(str.substring(iIndexOf + 5));
    }

    private String normalizeCurrencyCode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt - ' '));
            }
        }
        return sb.toString();
    }

    private void setNumberFormatDigitOptions(Map<String, Object> map, Object obj, Object obj2) throws JSRangeErrorException {
        Object objGetNumberOption = OptionHelpers.GetNumberOption(map, "minimumIntegerDigits", JSObjects.newNumber(1.0d), JSObjects.newNumber(21.0d), JSObjects.newNumber(1.0d));
        Object objGet = JSObjects.Get(map, "minimumFractionDigits");
        Object objGet2 = JSObjects.Get(map, "maximumFractionDigits");
        Object objGet3 = JSObjects.Get(map, "minimumSignificantDigits");
        Object objGet4 = JSObjects.Get(map, "maximumSignificantDigits");
        this.mResolvedMinimumIntegerDigits = (int) Math.floor(JSObjects.getJavaDouble(objGetNumberOption));
        if (!JSObjects.isUndefined(objGet3) || !JSObjects.isUndefined(objGet4)) {
            this.mRoundingType = IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS;
            Object objDefaultNumberOption = OptionHelpers.DefaultNumberOption("minimumSignificantDigits", objGet3, JSObjects.newNumber(1.0d), JSObjects.newNumber(21.0d), JSObjects.newNumber(1.0d));
            Object objDefaultNumberOption2 = OptionHelpers.DefaultNumberOption("maximumSignificantDigits", objGet4, objDefaultNumberOption, JSObjects.newNumber(21.0d), JSObjects.newNumber(21.0d));
            this.mResolvedMinimumSignificantDigits = (int) Math.floor(JSObjects.getJavaDouble(objDefaultNumberOption));
            this.mResolvedMaximumSignificantDigits = (int) Math.floor(JSObjects.getJavaDouble(objDefaultNumberOption2));
            return;
        }
        if (JSObjects.isUndefined(objGet) && JSObjects.isUndefined(objGet2)) {
            IPlatformNumberFormatter.Notation notation = this.mResolvedNotation;
            if (notation == IPlatformNumberFormatter.Notation.COMPACT) {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.COMPACT_ROUNDING;
                return;
            }
            if (notation == IPlatformNumberFormatter.Notation.ENGINEERING) {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.mResolvedMaximumFractionDigits = 5;
                return;
            } else {
                this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.mResolvedMinimumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(obj));
                this.mResolvedMaximumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(obj2));
                return;
            }
        }
        this.mRoundingType = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
        Object objDefaultNumberOption3 = OptionHelpers.DefaultNumberOption("minimumFractionDigits", objGet, JSObjects.newNumber(0.0d), JSObjects.newNumber(20.0d), JSObjects.Undefined());
        Object objDefaultNumberOption4 = OptionHelpers.DefaultNumberOption("maximumFractionDigits", objGet2, JSObjects.newNumber(0.0d), JSObjects.newNumber(20.0d), JSObjects.Undefined());
        if (JSObjects.isUndefined(objDefaultNumberOption3)) {
            objDefaultNumberOption3 = JSObjects.newNumber(Math.min(JSObjects.getJavaDouble(obj), JSObjects.getJavaDouble(objDefaultNumberOption4)));
        } else if (JSObjects.isUndefined(objDefaultNumberOption4)) {
            objDefaultNumberOption4 = JSObjects.newNumber(Math.max(JSObjects.getJavaDouble(obj2), JSObjects.getJavaDouble(objDefaultNumberOption3)));
        } else if (JSObjects.getJavaDouble(objDefaultNumberOption3) > JSObjects.getJavaDouble(objDefaultNumberOption4)) {
            throw new JSRangeErrorException("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.mResolvedMinimumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(objDefaultNumberOption3));
        this.mResolvedMaximumFractionDigits = (int) Math.floor(JSObjects.getJavaDouble(objDefaultNumberOption4));
    }

    private void setNumberFormatUnitOptions(Map<String, Object> map) throws JSRangeErrorException {
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        this.mResolvedStyle = (IPlatformNumberFormatter.Style) OptionHelpers.searchEnum(IPlatformNumberFormatter.Style.class, JSObjects.getJavaString(OptionHelpers.GetOption(map, "style", optionType, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object objGetOption = OptionHelpers.GetOption(map, "currency", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (JSObjects.isUndefined(objGetOption)) {
            if (this.mResolvedStyle == IPlatformNumberFormatter.Style.CURRENCY) {
                throw new JSRangeErrorException("Expected currency style !");
            }
        } else if (!isWellFormedCurrencyCode(JSObjects.getJavaString(objGetOption))) {
            throw new JSRangeErrorException("Malformed currency code !");
        }
        Object objGetOption2 = OptionHelpers.GetOption(map, "currencyDisplay", optionType, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objGetOption3 = OptionHelpers.GetOption(map, "currencySign", optionType, new String[]{"accounting", Constants.COLLATION_STANDARD}, Constants.COLLATION_STANDARD);
        Object objGetOption4 = OptionHelpers.GetOption(map, "unit", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (JSObjects.isUndefined(objGetOption4)) {
            if (this.mResolvedStyle == IPlatformNumberFormatter.Style.UNIT) {
                throw new JSRangeErrorException("Expected unit !");
            }
        } else if (!isWellFormedUnitIdentifier(JSObjects.getJavaString(objGetOption4))) {
            throw new JSRangeErrorException("Malformed unit identifier !");
        }
        Object objGetOption5 = OptionHelpers.GetOption(map, "unitDisplay", optionType, new String[]{"long", "short", "narrow"}, "short");
        IPlatformNumberFormatter.Style style = this.mResolvedStyle;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            this.mResolvedCurrency = normalizeCurrencyCode(JSObjects.getJavaString(objGetOption));
            this.mResolvedCurrencyDisplay = (IPlatformNumberFormatter.CurrencyDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.CurrencyDisplay.class, JSObjects.getJavaString(objGetOption2));
            this.mResolvedCurrencySign = (IPlatformNumberFormatter.CurrencySign) OptionHelpers.searchEnum(IPlatformNumberFormatter.CurrencySign.class, JSObjects.getJavaString(objGetOption3));
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            this.mResolvedUnit = JSObjects.getJavaString(objGetOption4);
            this.mResolvedUnitDisplay = (IPlatformNumberFormatter.UnitDisplay) OptionHelpers.searchEnum(IPlatformNumberFormatter.UnitDisplay.class, JSObjects.getJavaString(objGetOption5));
        }
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        String javaString = JSObjects.getJavaString(OptionHelpers.GetOption(map, Constants.LOCALEMATCHER, OptionHelpers.OptionType.STRING, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        String[] strArr = new String[list.size()];
        return javaString.equals(Constants.LOCALEMATCHER_BESTFIT) ? Arrays.asList(LocaleMatcher.bestFitSupportedLocales((String[]) list.toArray(strArr))) : Arrays.asList(LocaleMatcher.lookupSupportedLocales((String[]) list.toArray(strArr)));
    }

    public String format(double d10) throws JSRangeErrorException {
        return this.mPlatformNumberFormatter.format(d10);
    }

    public List<Map<String, String>> formatToParts(double d10) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator toParts = this.mPlatformNumberFormatter.formatToParts(d10);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = toParts.first(); cFirst != 65535; cFirst = toParts.next()) {
            sb.append(cFirst);
            if (toParts.getIndex() + 1 == toParts.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toParts.getAttributes().keySet().iterator();
                String strFieldToString = it.hasNext() ? this.mPlatformNumberFormatter.fieldToString(it.next(), d10) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put(NotificationsService.EVENT_TYPE_KEY, strFieldToString);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() throws JSRangeErrorException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.LOCALE, this.mResolvedLocaleObjectForResolvedOptions.toCanonicalTag());
        linkedHashMap.put("numberingSystem", this.mResolvedNumberingSystem);
        linkedHashMap.put("style", this.mResolvedStyle.toString());
        IPlatformNumberFormatter.Style style = this.mResolvedStyle;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            linkedHashMap.put("currency", this.mResolvedCurrency);
            linkedHashMap.put("currencyDisplay", this.mResolvedCurrencyDisplay.toString());
            linkedHashMap.put("currencySign", this.mResolvedCurrencySign.toString());
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            linkedHashMap.put("unit", this.mResolvedUnit);
            linkedHashMap.put("unitDisplay", this.mResolvedUnitDisplay.toString());
        }
        int i10 = this.mResolvedMinimumIntegerDigits;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        IPlatformNumberFormatter.RoundingType roundingType = this.mRoundingType;
        if (roundingType == IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS) {
            int i11 = this.mResolvedMaximumSignificantDigits;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.mResolvedMinimumSignificantDigits;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (roundingType == IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS) {
            int i13 = this.mResolvedMinimumFractionDigits;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.mResolvedMaximumFractionDigits;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.mGroupingUsed));
        linkedHashMap.put("notation", this.mResolvedNotation.toString());
        if (this.mResolvedNotation == IPlatformNumberFormatter.Notation.COMPACT) {
            linkedHashMap.put("compactDisplay", this.mResolvedCompactDisplay.toString());
        }
        linkedHashMap.put("signDisplay", this.mResolvedSignDisplay.toString());
        return linkedHashMap;
    }
}
