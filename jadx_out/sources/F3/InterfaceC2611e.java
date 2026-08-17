package f3;

import com.facebook.imagepipeline.producers.h0;

/* JADX INFO: renamed from: f3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2611e extends h0 {
    void onRequestCancellation(String str);

    void onRequestFailure(com.facebook.imagepipeline.request.b bVar, String str, Throwable th, boolean z10);

    void onRequestStart(com.facebook.imagepipeline.request.b bVar, Object obj, String str, boolean z10);

    void onRequestSuccess(com.facebook.imagepipeline.request.b bVar, String str, boolean z10);
}
