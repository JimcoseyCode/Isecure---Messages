package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements InterfaceC0471b1 {
    private static boolean g() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        return g();
    }

    public boolean h(String str) {
        return "video/mp4v-es".equals(str);
    }
}
