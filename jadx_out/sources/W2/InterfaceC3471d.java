package w2;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: w2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3471d {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, Object obj, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, Object obj);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
