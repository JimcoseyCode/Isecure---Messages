package com.facebook.imagepipeline.producers;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th, Map map);

    void onProducerFinishWithSuccess(String str, String str2, Map map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z10);

    boolean requiresExtraMap(String str);
}
