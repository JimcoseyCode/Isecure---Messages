package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface ILocaleObject<T> {
    ILocaleObject<T> cloneObject() throws JSRangeErrorException;

    T getLocale() throws JSRangeErrorException;

    T getLocaleWithoutExtensions() throws JSRangeErrorException;

    ArrayList<String> getUnicodeExtensions(String str) throws JSRangeErrorException;

    HashMap<String, String> getUnicodeExtensions() throws JSRangeErrorException;

    void setUnicodeExtensions(String str, ArrayList<String> arrayList) throws JSRangeErrorException;

    String toCanonicalTag() throws JSRangeErrorException;

    String toCanonicalTagWithoutExtensions() throws JSRangeErrorException;
}
