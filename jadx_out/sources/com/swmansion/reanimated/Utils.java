package com.swmansion.reanimated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static Runnable combineRunnables(final Runnable... runnableArr) {
        return new Runnable() { // from class: com.swmansion.reanimated.Utils.1
            @Override // java.lang.Runnable
            public void run() {
                for (Runnable runnable : runnableArr) {
                    runnable.run();
                }
            }
        };
    }

    public static float convertToFloat(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).floatValue();
        }
        return 0.0f;
    }

    public static int[] processIntArray(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = readableArray.getInt(i10);
        }
        return iArr;
    }

    public static Map<String, Integer> processMapping(ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, Integer.valueOf(readableMap.getInt(strNextKey)));
        }
        return map;
    }

    public static String simplifyStringNumbersList(String str) {
        return str.replace(",", PointerEventHelper.POINTER_TYPE_UNKNOWN).replace("[", PointerEventHelper.POINTER_TYPE_UNKNOWN).replace("]", PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }
}
