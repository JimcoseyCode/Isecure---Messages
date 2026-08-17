package com.ov.message;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsDeduplicationCache {
    private static final int MAX_CACHED_IDS = 1000;
    private static final String TAG = "SmsDeduplicationCache";
    private static final Set<String> processedMessageIds = new LinkedHashSet();

    public static synchronized void clear() {
        processedMessageIds.clear();
    }

    public static synchronized boolean isMessageIdProcessed(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                return processedMessageIds.contains(str);
            }
        }
        return false;
    }

    public static synchronized void markMessageIdAsProcessed(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    processedMessageIds.add(str);
                    while (true) {
                        Set<String> set = processedMessageIds;
                        if (set.size() <= 1000) {
                            set.size();
                            return;
                        }
                        Iterator<String> it = set.iterator();
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static int size() {
        return processedMessageIds.size();
    }
}
