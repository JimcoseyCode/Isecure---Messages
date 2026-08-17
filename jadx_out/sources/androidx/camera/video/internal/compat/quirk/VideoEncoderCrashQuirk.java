package androidx.camera.video.internal.compat.quirk;

import F.L;
import Z.AbstractC1582v;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    private static boolean g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return g();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean f(L l10, AbstractC1582v abstractC1582v) {
        return g() && l10.k() == 0 && abstractC1582v == AbstractC1582v.f13483a;
    }
}
