package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ParsedLocaleIdentifier {
    ParsedLanguageIdentifier languageIdentifier;
    TreeMap<Character, ArrayList<String>> otherExtensionsMap;
    ArrayList<String> puExtensions;
    TreeMap<String, ArrayList<String>> transformedExtensionFields;
    ParsedLanguageIdentifier transformedLanguageIdentifier;
    ArrayList<CharSequence> unicodeExtensionAttributes;
    TreeMap<String, ArrayList<String>> unicodeExtensionKeywords;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class ParsedLanguageIdentifier {
        String languageSubtag;
        String regionSubtag;
        String scriptSubtag;
        ArrayList<String> variantSubtagList;
    }
}
